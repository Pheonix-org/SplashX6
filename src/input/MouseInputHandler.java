package input;

import org.lwjgl.glfw.GLFWCursorPosCallbackI;
import org.lwjgl.glfw.GLFWMouseButtonCallbackI;
import org.lwjgl.glfw.GLFWScrollCallbackI;
import rendering.Renderer;
import rendering.WorldRenderer;
import utility.Debug;
import utility.Log;
import utility.main;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

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


    private static MouseButton
            mouseMiddle    = new MouseButton(),
            mouseMain      = new MouseButton(),
            mouseSecondary = new MouseButton();

    private static Point mouseDragPos = new Point();
    private static Point mousePointerPos = new Point();

    private static BufferedImage hitTest;

    static {
        try {
            hitTest = ImageIO.read(ClassLoader.getSystemResource("hittest.png"));
        } catch (IOException e) {
            main.fatal("Hit Test image could not be loaded. Will not be able to test where mouse click is.", e);
        }
    }

    ;

    //#region callbacks
    /**
     * <h2></h2>
     */
    public static final InputHandler<GLFWMouseButtonCallbackI> DEFAULT_CLICK = new InputHandler<>(
            (window, button, action, modifier) -> {
                if (button == GLFW_MOUSE_BUTTON_3 && action == GLFW_PRESS) {
                    mouseMiddle.down();
                } else if (button == GLFW_MOUSE_BUTTON_3 && action == GLFW_RELEASE) {
                    mouseMiddle.up();
                    mouseDragPos.setLocation(-1, -1);
                } else if (button == GLFW_MOUSE_BUTTON_1 && action == GLFW_PRESS) {
                    mouseMain.down();
                    PointOnScreenAsMapCooord(mousePointerPos);
                } else if (button == GLFW_MOUSE_BUTTON_1 && action == GLFW_RELEASE) {
                    mouseMain.up();
                    mouseDragPos.setLocation(-1, -1);
                }
    }
);

    public static final InputHandler<GLFWCursorPosCallbackI> DEFAULT_MOUSE_MOVE = new InputHandler<>(
            (window, x, y) -> {
                mousePointerPos.setLocation(x,y);
                if (!mouseMiddle.down) return;
                if (mouseMiddle.firstCapture) {
                    mouseDragPos.x = (int) x;
                    mouseDragPos.y = (int) y;
                    mouseMiddle.firstCapture = false;
                }
                subXOff += (int) (mouseDragPos.x - x);
                subYOff += (int) (mouseDragPos.y - y);
                mouseDragPos.x = (int) x;
                mouseDragPos.y = (int) y;

                if (subXOff > TILE_WIDTH) {
                    subXOff = 0;
                    world.offRight();
                }

                if (subYOff > TILE_HEIGHT && world.yoff > 0) {
                    subYOff = 0;
                    world.offDown();
                }

                if (subXOff < -TILE_WIDTH && world.xoff > 0) {
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

    //#region operations
    /*
     * tw, th contain the tile width and height.
     *
     * hitTest contains a single channel taken from a tile-shaped hit-test
     * image. Data was extracted with getImageData()
     */

    public static Point PointOnScreenAsMapCooord(final Point point) {
        Log.New(point.x + " , " + point.y);

        // one solution used a single channel image to test if a point landed in to
        // figure out if it was an even or odd row. that can be found here.
        // 0         = miss,
        // -16777216 = hit
        // test image is 64*32, the native size of the tiles.
        // if used the test x,y needs to be linearly scaled
        // int test = hitTest.getRGB(30,16);

        // Somewhere to hold the x,y we're calculating
        Point mapPoint = new Point(point.x, point.y);

        // Invert y
        // Mouse co-oords start at top left, render space starts at bottom left
        mapPoint.y = main.window.getHeight() - mapPoint.y;

        // Make relative to viewport
        mapPoint.x -= 1-subXOff-(TILE_WIDTH*2);
        mapPoint.y -= subYOff - (TILE_HEIGHT * 2);

        //#region current algorithm

        var eventilex = Math.floor(mapPoint.x%TILE_WIDTH);
        var eventiley = Math.floor(mapPoint.y%TILE_HEIGHT);
        if (hitTest.getRGB((int)eventilex, (int)eventiley) != -16777216) {
            /* On even tile */
                mapPoint.x = (int)(Math.floor((mapPoint.x + TILE_WIDTH) / TILE_WIDTH) - 1);
                mapPoint.y = (int)(2 * (Math.floor((mapPoint.y + TILE_HEIGHT) / TILE_HEIGHT) - 1));
        } else {
            /* On odd tile */
                mapPoint.x = (int)(Math.floor((mapPoint.x + TILE_WIDTH / 2) / TILE_WIDTH) - 1);
                mapPoint.y = (int)(2 * (Math.floor((mapPoint.y + TILE_HEIGHT / 2) / TILE_HEIGHT)) - 1);
        }
        //#endregion


        // account for scale
        // translate to tile space
        // Adjust for stagger


        // for show, remove texture id on selected tile and notify that
        // the window should be re-rendered on the next frame
        world.getStaggeredTile(mapPoint.x, mapPoint.y).cachedID = -1;
        Renderer.shouldRerender();

        // return the detected map point
        return mapPoint;
    }


    private static int normalise(int m, int rmin, int rmax, int tmin, int tmax){
        return (m-rmin)/(rmax-rmin) * (tmax - tmin) + tmin;
    }


    //#endregion
}
