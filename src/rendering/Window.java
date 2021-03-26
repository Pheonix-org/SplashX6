package rendering;

import org.lwjgl.glfw.GLFWErrorCallback;
import org.lwjgl.glfw.GLFWVidMode;
import org.lwjgl.opengl.GL;
import org.lwjgl.opengl.GL40;
import org.lwjgl.opengl.GL40.*;
import org.lwjgl.system.MemoryStack;
import utility.main;

import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

import static org.lwjgl.glfw.Callbacks.glfwFreeCallbacks;
import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.opengl.GL.createCapabilities;
import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.opengl.GL11.GL_DEPTH_BUFFER_BIT;
import static org.lwjgl.system.MemoryStack.stackPush;
import static org.lwjgl.system.MemoryUtil.NULL;
/**
 * <h1>The utility.main game window</h1>
 * <br>
 * <p>
 * A headless window which displays a provided renderer.
 * </p>
 *
 * @author <a href="https://www.shinkson47.in">Jordan T. Gray on 21/03/2021</a>
 * @version 1
 * @since v1
 */
public class Window {
    //#region constants
    /**
     * The default title on the window, when none is provided
     */
    public static final String DEFAULT_TITLE = "New Window";
    //#endregion constants

    //#region fields
    /**
     * ID of this window in GLFW memory
     */
    private long window = 0L;

    /**
     * <h2>Collection of renderers actively rendering on this window.</h2>
     * These renderers will be called in the order in which they were added,
     * from there they will over-render each all previously rendered content
     * in the gl frame buffer before it is displayed in the next frame.
     */
    private final ArrayList<Renderer> RenderStack = new ArrayList<>();

    /**
     * <h2>Represents the rendering height of the window upon creation</h2>
     * is set to the size of the screen
     */
    private int height = 1920;

    /**
     * <h2>Represents the rendering width of the window upon creation</h2>
     * is set to the size of the screen
     */
    private int width = 1080;
    //#endregion fields

    //#region constructors

    /**
     * Creates a new window with default size and title
     */
    public Window(Renderer renderer){
        this(DEFAULT_TITLE, renderer);
    }

    /**
     * Creates a new window with no defaults
     * @param _height height of the window
     * @param _width width of the window
     * @param title title of the window
     */
    public Window(String title, Renderer _renderer){
        RenderStack.add(_renderer);
        init(title);
    }
    //#endregion constructors

    //#region operations

    /**
     * <h2>Creates the window according to params</h2>
     * @param height Height of the window
     * @param width Width of the window
     * @param title title of the window
     */
    private void init(String title) {
        Renderer.preInit();                                                                                             // Notify of window init. used for first time rendering set-up.
        GLFWErrorCallback.createPrint(System.err).set();                                                                // Error call back stream. Prints errors to system.err

        window = glfwCreateWindow(height, width, title, NULL, NULL);                                                    // Create the window in GLFW memory, and get the ID.

        if ( window == NULL )
            throw new RuntimeException("Failed to create the GLFW window");
        main.window = this;
        setCorrectRenderSize();

        // Set a blank focus call back.
        //
        // I don't know why i have do do this.
        // I think if glfw has no focus call back, it just doesn't get focus
        // Either way, this is the only way for the window to actually get focus on mac, and register key
        // presses.
        glfwSetWindowFocusCallback(window, (o,x) -> {});

        // TODO figure out a nice way to specify key callbacks, outside of the window creation.
        // Setup a key callback. It will be called every time a key is pressed, repeated or released.
        glfwSetKeyCallback(window, (w, key, scancode, action, mods) -> {
            if (key == GLFW_KEY_ESCAPE && action == GLFW_RELEASE) {
                glfwSetWindowShouldClose(window, true);                                                           // We will detect this in the rendering loop
            }
            //TODO proper scale vars
            else if (key == GLFW_KEY_KP_SUBTRACT && action == GLFW_PRESS) {
                utility.Debug.debugValue-=4;
                Renderer.reCalcTile();
            }
            else if (key == GLFW_KEY_KP_ADD && action == GLFW_PRESS) {
                utility.Debug.debugValue+=4;
                Renderer.reCalcTile();
            }
            else if (key == GLFW_KEY_F5 && action == GLFW_PRESS)
                WorldRenderer.world.regenerate();
            else if (key == GLFW_KEY_W && action == GLFW_PRESS)
                WorldRenderer.world.yoff += 2;
            else if (key == GLFW_KEY_S && action == GLFW_PRESS)
                WorldRenderer.world.yoff -= 2;
            else if (key == GLFW_KEY_D && action == GLFW_PRESS)
                WorldRenderer.world.xoff++;
            else if (key == GLFW_KEY_A && action == GLFW_PRESS)
                WorldRenderer.world.xoff--;
            else if (key == GLFW_KEY_SPACE && action == GLFW_PRESS)
                WorldRenderer.world.swapInterp();


        });


        // Pull some kind of memory bullshittery to get opengl to write the size of the window
        // into a buffered variable in an artificial thread frame
        // No, I don't know how this works.
        try ( MemoryStack stack = stackPush() ) {
            IntBuffer pWidth = stack.mallocInt(1);
            IntBuffer pHeight = stack.mallocInt(1);

            // Get the window size passed to glfwCreateWindow
            glfwGetWindowSize(window, pWidth, pHeight);

            // Get the resolution of the primary monitor
            GLFWVidMode vidmode = glfwGetVideoMode(glfwGetPrimaryMonitor());

            // Center the window
            glfwSetWindowPos(
                    window,
                    (vidmode.width() - pWidth.get(0)) / 2,
                    (vidmode.height() - pHeight.get(0)) / 2
            );
        } // the stack frame is popped automatically

        glfwMakeContextCurrent(window);                                                                                 // This window is our context.
        glfwSwapInterval(1);                                                                                            // Enable v-sync. This can't be done before context is set.
        glfwShowWindow(window);                                                                                         // Make the window visible

        loop();                                                                                                         // Render loop. We'll make our renderer here.

        dispose();
    }


    /**
     * <h2>alters the render size to the size of the monitor</h2>
     */
    private void setCorrectRenderSize() {
        final GLFWVidMode vmode = glfwGetVideoMode(glfwGetPrimaryMonitor());
        height = vmode.height();
        width = vmode.width();
        glfwSetWindowMonitor(window, glfwGetPrimaryMonitor(), 0, 0, width, height, vmode.refreshRate());
    }

    /**
     * <h2>Main execution loop</h2>
     * Thread stays here after creating a window, and does not continue untill window is closed via
     * glfwWindowShouldClose. Handles rendering, game updates, and input reading.
     */
    private void loop() {
        createCapabilities();  // !! DO NOT REMOVE !!

        GL40.glMatrixMode(GL40.GL_PROJECTION);
        GL40.glLoadIdentity();
        GL40.glOrtho(0, width, 0, height, 1, -1);
        GL40.glMatrixMode(GL40.GL_MODELVIEW);
        Renderer.postInit();

        glClearColor(0f, 0f, 0f, 0f);                                                            // Color which the window is cleared with


        // There should only be one renderer present at this point; the one that was parsed in the constructor.
        // Either way, pre-render all renderers to ensure they're all ready to render.

        // The WorldRenderer will display the splash screen, and load all tile sets. Next frame will clear splash screen.

        // We can't pre-render sooner, or use addRenderer, since we can't use GL features until we've configured the gl capabilities (above)
        RenderStack.forEach(Renderer::preRender);

        main.startup();

        // Run the rendering loop until the user has attempted to close
        // the window or has pressed the ESCAPE key.
        while ( !glfwWindowShouldClose(window) ) {
            glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT);                                                   // clear the framebuffer

            RenderStack.forEach(Renderer::renderFrame);                                                                 // Invoke all renderers to render to the frame buffer.

            glfwSwapBuffers(window);                                                                                    // swap the buffer, displaying the buffer we just drew to.

            glfwPollEvents();                                                                                           // Poll the window for events
        }
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    /**
     * @return the int ID of this window in GLFW memory
     */
    public long getID() {
        return window;
    }

    /**
     * <h2>Adds a new renderer to the {@link Window#RenderStack}</h2>
     * Also invokes {@link Renderer#preRender} to ensure renderer is ready to render.
     * This new renderer will render above all previously registered renderers.
     * <br><br>
     * O(n) - Has to alter the stack order of all existing renderers to add this one to the top.
     * <br><br>
     *     <blockquote>
     *          <br>Visualisation
     *          <br><br>
     *          <br>4 Default renderer (Renderer obtained at construction of window)
     *          <br>3 ...
     *          <br>2 ...
     *          <br>1 2nd oldest renderer's content
     *          <br>0 Newest Renderer's content
     *          <br>
     *          <br>
     *          <br>[^CAMERA^]
     *          <br><br>
     *     </blockquote>
     *  Where everytime a new renderer is added, all existing renderers get shifted up,
     *  and the newest is added at the bottom; closest to the camera, and on top of all
     *  existing camera.
     * @throws java.util.ConcurrentModificationException if called from within {@link Renderer#preInit()} or {@link Renderer#renderFrame()},
     *         because they operate within the {@link Window#RenderStack}'s foreach operator.
     */
    public synchronized void addRenderer(Renderer r){
        RenderStack.forEach(Renderer::NextStackPosition);
        r.setStackPosition(0f);
        RenderStack.add(r);
        r.preRender();
    }

    /**
     * <h2>Closes this window, terminates GLFW, frees callbacks.</h2>
     * Call on the way to halt.
     */
    public void dispose() {
        main.shutdown();
        // Loop returns = window is no longer rendering. destroy the window.
        glfwFreeCallbacks(window);                                                                                      // Free the window callbacks and destroy the window
        glfwDestroyWindow(window);

        //We're no longer using glfw, our only window has closed. terminate glfw.
        glfwTerminate();                                                                                                // Terminate GLFW and free the error callback
        glfwSetErrorCallback(null).free();
    }

    public void fatal(){
        RenderStack.clear();
        addRenderer(new ErrorRenderer());
    }

    //#endregion operations

    //#region static
    //#endregion static
}