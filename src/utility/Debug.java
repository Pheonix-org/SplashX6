package utility;

import org.mapeditor.core.Map;
import org.mapeditor.core.TileLayer;
import org.mapeditor.io.TMXMapReader;
import rendering.WorldRenderer;
import rendering.window;

import java.util.Random;

import static org.lwjgl.glfw.GLFW.glfwTerminate;

/**
 * <h1>Collection of debug / development tools</h1>
 * <br>
 * <p>
 *
 * </p>
 *
 * @author <a href="https://www.shinkson47.in">Jordan T. Gray on 21/03/2021</a>
 * @version 1
 * @since v1
 */
public class Debug {
    //#region constants
    /**
     * A keyboard controllable value that can be used for anything.
     */
    public static int debugValue = 1;

    public static final Random random = new Random();
    //#endregion constants

    //#region fields
    //#endregion fields

    //#region constructors
    //#endregion constructors

    //#region operations
    public static void main(String[] args) {
        tilesheetTest();
    }
    public static void tilesheetTest() {
        Map map;
        try {
            WorldRenderer r = new WorldRenderer(null);
            window w = new window(r);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    //#endregion operations

    //#region static
    //#endregion static
}
