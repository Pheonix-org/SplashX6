package input;

import org.lwjgl.glfw.GLFWKeyCallbackI;
import rendering.Renderer;
import utility.Debug;
import utility.main;

import static org.lwjgl.glfw.GLFW.*;
import static rendering.WorldRenderer.world;

/**
 * <h1></h1>
 * <br>
 * <p>
 *
 * </p>
 *
 * @author <a href="https://www.shinkson47.in">Jordan T. Gray on 27/03/2021</a>
 * @version 1
 * @since v1
 */
public class KeyboardInputHandler {

    //#region static
    public static final InputHandler<GLFWKeyCallbackI>       DEFAULT_KEY = new InputHandler<>(
            (w, key, scancode, action, mods) -> {
                if (key == GLFW_KEY_ESCAPE && action == GLFW_RELEASE) {
                    glfwSetWindowShouldClose(main.window.getID(), true);                                                           // We will detect this in the rendering loop
                }

                //TODO proper scale vars
                else if (key == GLFW_KEY_KP_SUBTRACT && action == GLFW_PRESS) {
                    Debug.debugValue -= 4;
                    //Renderer.reCalcTile();
                } else if (key == GLFW_KEY_KP_ADD && action == GLFW_PRESS) {
                    Debug.debugValue += 4;
                    //Renderer.reCalcTile();
                } else if (key == GLFW_KEY_F5 && action == GLFW_PRESS)
                    world.regenerate();
                else if (key == GLFW_KEY_W && action == GLFW_PRESS)
                    world.yoff += 2;
                else if (key == GLFW_KEY_S && action == GLFW_PRESS)
                    world.yoff -= 2;
                else if (key == GLFW_KEY_D && action == GLFW_PRESS)
                    world.xoff++;
                else if (key == GLFW_KEY_A && action == GLFW_PRESS)
                    world.xoff--;
                else if (key == GLFW_KEY_F6 && action == GLFW_PRESS)
                    world.swapInterp();

                Renderer.shouldRerender();
            });
    //#endregion static
}
