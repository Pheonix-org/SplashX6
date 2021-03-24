package utility;

import rendering.WorldRenderer;
import rendering.Window;

import java.util.Random;

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
    public static boolean verbose = false;

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
        try {
            WorldRenderer r = new WorldRenderer();
            Window w = new Window(r);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    //#endregion operations

    //#region static
    public static boolean verbose(String s){
        if (verbose) System.out.println(s);
        return verbose;
    }
    //#endregion static
}
