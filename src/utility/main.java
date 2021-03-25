package utility;

import rendering.WorldRenderer;
import rendering.Window;


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

    /**
     * Main entry point. Starts OPEX with this game
     * @param args
     * @throws OPEXStartFailure
     */
    public static void main(String[] args)  {
        new Window(new WorldRenderer());
    }

    //#endregion operations

    //#region static
    //#endregion static
}
