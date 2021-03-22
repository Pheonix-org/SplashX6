package rendering;

import org.lwjgl.glfw.GLFWErrorCallback;
import org.lwjgl.glfw.GLFWVidMode;
import org.lwjgl.opengl.*;
import org.lwjgl.system.MemoryStack;

import java.nio.IntBuffer;

import static org.lwjgl.glfw.Callbacks.glfwFreeCallbacks;
import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.opengl.GL11.GL_DEPTH_BUFFER_BIT;
import static org.lwjgl.system.MemoryStack.stackPush;
import static org.lwjgl.system.MemoryUtil.NULL;
/**
 * <h1>The main game window</h1>
 * <br>
 * <p>
 * A headless window which displays a provided renderer.
 * </p>
 *
 * @author <a href="https://www.shinkson47.in">Jordan T. Gray on 21/03/2021</a>
 * @version 1
 * @since v1
 */
public class window {
    //#region constants
    /**
     * The default size of the window, used when no size is provided.
     */
    public static final int DEFAULT_X = 800, DEFAULT_Y = DEFAULT_X;

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
     * The renderer this window is displaying
     */
    private Renderer renderer;

    //#endregion fields

    //#region constructors

    /**
     * Creates a new window with default size and title
     */
    public window(Renderer renderer){
        this(DEFAULT_TITLE, renderer);
    }

    /**
     * Creates a new window with detault size
     * @param title title of the window
     */
    public window(String title, Renderer renderer){
        this(DEFAULT_X, DEFAULT_Y, title, renderer);
    }

    /**
     * Creates a new window with default title
     * @param height height of the window
     * @param width width of the window
     */
    public window(int height, int width, Renderer renderer){
        this(height, width, DEFAULT_TITLE, renderer);
    }

    /**
     * Creates a new window with no defaults
     * @param _height height of the window
     * @param _width width of the window
     * @param title title of the window
     */
    public window(int _height, int _width, String title, Renderer _renderer){
        renderer = _renderer;
        init(_height, _width, title);
    }
    //#endregion constructors

    //#region operations

    /**
     * <h2>Creates the window according to params</h2>
     * @param height Height of the window
     * @param width Width of the window
     * @param title title of the window
     */
    public void init(int height, int width, String title) {
        Renderer.preInit();                                                                                             // Notify of window init. used for first time rendering set-up.
        GLFWErrorCallback.createPrint(System.err).set();                                                                // Error call back stream. Prints errors to system.err

        window = glfwCreateWindow(height, width, title, NULL, NULL);                                                    // Create the window in GLFW memory, and get the ID.
        if ( window == NULL )
            throw new RuntimeException("Failed to create the GLFW window");

        // TODO figure out a nice way to specify key callbacks, outside of the window creation.

        // Setup a key callback. It will be called every time a key is pressed, repeated or released.
        glfwSetKeyCallback(window, (w, key, scancode, action, mods) -> {
            if (key == GLFW_KEY_ESCAPE && action == GLFW_RELEASE) {
                glfwSetWindowShouldClose(window, true);                                                           // We will detect this in the rendering loop
            }
            else if (key == GLFW_KEY_MINUS && action == GLFW_PRESS) {
                utility.Debug.debugValue--;
            }
            else if (key == GLFW_KEY_KP_ADD && action == GLFW_PRESS) {
                utility.Debug.debugValue++;
            }

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

        // Loop returns = window is no longer rendering. destroy the window.
        glfwFreeCallbacks(window);                                                                                      // Free the window callbacks and destroy the window
        glfwDestroyWindow(window);

        //We're no longer using glfw, our only window has closed. terminate glfw.
        glfwTerminate();                                                                                                // Terminate GLFW and free the error callback
        glfwSetErrorCallback(null).free();
    }

    /**
     * <h2>Main execution loop</h2>
     * Thread stays here after creating a window, and does not continue untill window is closed via
     * glfwWindowShouldClose. Handles rendering, game updates, and input reading.
     */
    private void loop() {
        GL.createCapabilities();  // !! DO NOT REMOVE !!

        GL11.glMatrixMode(GL11.GL_PROJECTION);
        GL11.glLoadIdentity();
        GL11.glOrtho(0, DEFAULT_X, 0, DEFAULT_Y, 1, -1);
        GL11.glMatrixMode(GL11.GL_MODELVIEW);
        Renderer.postInit();

        glClearColor(0f, 0f, 0f, 0f);                                                    // Color which the window is cleared with

        // Run the rendering loop until the user has attempted to close
        // the window or has pressed the ESCAPE key.
        while ( !glfwWindowShouldClose(window) ) {
            glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT);                                                   // clear the framebuffer

            renderer.renderFrame();

            glfwSwapBuffers(window);                                                                                    // swap the buffer

            glfwPollEvents();
        }
    }

    //#endregion operations

    //#region static
    //#endregion static
}