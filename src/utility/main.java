package utility;

import input.InputHandler;
import input.InputMaster;
import rendering.WorldRenderer;
import rendering.Window;
import world.TileSet;
import world.World;


/**
 * <h1>Main entry point</h1>
 * <br>
 * <p>
 *
 * </p>
 *
 * @author <a href="https://www.shinkson47.in">Jordan T. Gray on 19/03/2021</a>
 * @version 1
 * @since v1
 */
public class main {
    //#region operations
    public static Window window;
    private static WorldRenderer r = new WorldRenderer();

    /**
     * Main entry point. Starts OPEX with this game
     * @param args
     * @throws OPEXStartFailure
     */
    public static void main(String[] args)  {
        new Window(r);
    }

    /**
     * <h2>Declare a fatal problem. Close the window, tell the user, close the game.</g2>
     * @param s
     */
    public static void fatal(String s, Exception e) {
        System.err.println(s);
        e.printStackTrace();
        window.fatal();
    }

    public static void startup() {
        TileSet.loadAllTilesets();
        InputMaster.setDefaultInputCallbacks();

        r.setWorld(new World());

    }

    public static void shutdown() {

    }

    //#endregion operations

    //#region static
    //#endregion static
}
