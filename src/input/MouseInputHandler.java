package input;

import org.lwjgl.glfw.GLFWCursorPosCallbackI;
import org.lwjgl.glfw.GLFWMouseButtonCallbackI;
import org.lwjgl.glfw.GLFWScrollCallbackI;
import rendering.Renderer;
import utility.Debug;

import java.awt.*;

import static org.lwjgl.glfw.GLFW.*;
import static rendering.Renderer.TILE_HEIGHT;
import static rendering.Renderer.TILE_WIDTH;
import static rendering.WorldRenderer.*;

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
public class MouseInputHandler {

    /**
     * <h2>Is the mouse button down?</h2>
     */
    private static boolean mouseDown = false;
    private static boolean mouseFirstCaputre = true;
    private static Point mouseDownLoc = new Point();

    //#region callbacks
    /**
     * <h2></h2>
     */
    public static final InputHandler<GLFWMouseButtonCallbackI> DEFAULT_CLICK = new InputHandler<>(
            (window, button, action, modifier) -> {
                if (button == GLFW_MOUSE_BUTTON_1 && action == GLFW_PRESS) {
                    mouseDown = true;
                    mouseFirstCaputre = true;
                } else if (button == GLFW_MOUSE_BUTTON_1 && action == GLFW_RELEASE) {
                    mouseDown = false;
                    mouseDownLoc.setLocation(-1, -1);
                }
            }
);

    public static final InputHandler<GLFWCursorPosCallbackI> DEFAULT_MOUSE_MOVE = new InputHandler<>(
            (window, x, y) -> {
                if (!mouseDown) return;
                if (mouseFirstCaputre) {
                    mouseDownLoc.x = (int) x;
                    mouseDownLoc.y = (int) y;
                    mouseFirstCaputre = false;
                }
                subXOff += (int) (mouseDownLoc.x - x);
                subYOff += (int) (mouseDownLoc.y - y);
                mouseDownLoc.x = (int) x;
                mouseDownLoc.y = (int) y;

                if (subXOff > TILE_WIDTH) {
                    subXOff = 0;
                    world.offRight();
                }

                if (subYOff > TILE_HEIGHT && world.yoff > 0) {
                    subYOff = 0;
                    world.offDown();
                }

                if (subXOff < 1 - TILE_WIDTH && world.xoff > 0) {
                    subXOff = 0;
                    world.offLeft();
                }


                if (subYOff < 1 - TILE_HEIGHT) {
                    subYOff = 0;
                    world.offUp();
                }
                Renderer.shouldRerender();
            });

    public static final InputHandler<GLFWScrollCallbackI>     DEFAULT_MOUSE_SCROLL = new InputHandler<>(
            (window, x, y) -> {
                Debug.debugValue += (int) (y * 10f) / 5f;
                Renderer.reCalcTile();
                Renderer.shouldRerender();
            });
    //#endregion callbacks
}
