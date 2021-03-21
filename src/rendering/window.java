package rendering;

import org.lwjgl.glfw.GLFWErrorCallback;
import org.lwjgl.glfw.GLFWVidMode;
import org.lwjgl.opengl.GL;
import org.lwjgl.system.MemoryStack;

import java.nio.IntBuffer;

import static org.lwjgl.glfw.Callbacks.glfwFreeCallbacks;
import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.opengl.GL11.GL_DEPTH_BUFFER_BIT;
import static org.lwjgl.system.MemoryStack.stackPush;
import static org.lwjgl.system.MemoryUtil.NULL;

/**
 * <h1></h1>
 * <br>
 * <p>
 *
 * </p>
 *
 * @author <a href="https://www.shinkson47.in">Jordan T. Gray on 21/03/2021</a>
 * @version 1
 * @since v1
 */
public class window {
    //#region constants
    public static final int DEFAULT_X = 800, DEFAULT_Y = 800;
    public static final String DEFAULT_TITLE = "New Window";
    //#endregion constants

    //#region fields
    private static long window = 0L; // private identifier for this GLFW window.
    //#endregion fields

    //#region constructors

    /**
     * Creates a new window with default size and title
     */
    public window(){
        this(DEFAULT_TITLE);
    }

    /**
     * Creates a new window with detault size
     * @param title title of the window
     */
    public window(String title){
        this(DEFAULT_X, DEFAULT_Y, title);
    }

    /**
     * Creates a new window with default title
     * @param height height of the window
     * @param width width of the window
     */
    public window(int height, int width){
        this(height, width, DEFAULT_TITLE);
    }

    /**
     * Creates a new window with no defaults
     * @param height height of the window
     * @param width width of the window
     * @param title title of the window
     */
    public window(int height, int width, String title){
        init(height, width, title);
    }
    //#endregion constructors

    //#region operations
    public void init(int height, int width, String title) {
        GLFWErrorCallback.createPrint(System.err).set(); // Error call back stream. Prints errors to system.err

        // Initialize GLFW. Most GLFW functions will not work before doing this.
        if ( !glfwInit() )
            throw new IllegalStateException("Unable to initialize GLFW");

        // Window hints
        glfwWindowHint(GLFW_VISIBLE, GLFW_FALSE);                                                                       // the window will stay hidden after creation
        glfwWindowHint(GLFW_RESIZABLE, GLFW_TRUE);                                                                      // the window will be resizable

        window = glfwCreateWindow(height, width, title, NULL, NULL);                             // Create the window
        if ( window == NULL )
            throw new RuntimeException("Failed to create the GLFW window");

        // Setup a key callback. It will be called every time a key is pressed, repeated or released.
        glfwSetKeyCallback(window, (w, key, scancode, action, mods) -> {
            if ( key == GLFW_KEY_ESCAPE && action == GLFW_RELEASE )
                glfwSetWindowShouldClose(window, true);                                                           // We will detect this in the rendering loop
        });


        // I have legit no idea what this is doing. It makes no difference when removed, too.

        // Get the thread stack and push a new frame
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
     * <h2>Render loop</h2>
     * This is where we'll draw to the screen.
     */
    private void loop() {
        GL.createCapabilities();  // !! DO NOT REMOVE !!

        glClearColor(0.0f, 0.0f, 0.0f, 0.0f);                                                    // Color which the window is cleared with

        // Run the rendering loop until the user has attempted to close
        // the window or has pressed the ESCAPE key.
        while ( !glfwWindowShouldClose(window) ) {
            glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT);                                                   // clear the framebuffer

            glfwSwapBuffers(window);                                                                                    // swap the buffer

            glfwPollEvents();
        }
    }

    //#endregion operations

    //#region static
    //#endregion static
}
