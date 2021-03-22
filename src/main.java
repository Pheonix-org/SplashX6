import com.shinkson47.opex.backend.runtime.errormanagement.exceptions.OPEXStartFailure;
import com.shinkson47.opex.backend.runtime.threading.OPEXGame;
import com.shinkson47.opex.backend.toolbox.Version;
import com.shinkson47.opex.frontend.window.prefabs.Splash;
import rendering.WorldRenderer;
import rendering.window;


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
public class main extends OPEXGame {
    //#region operations

    /**
     * Main entry point. Starts OPEX with this game
     * @param args
     * @throws OPEXStartFailure
     */
    public static void main(String[] args) throws OPEXStartFailure {
        Splash.disable();   // You would not believe the amount of problems a simple splash screen is causing -_-
        new main().run();

        // Skip starting opex for now, it initalises AWT, which uses GLFW. GLFW can't initalise for lwjgl if it's been initialized for awt swing.
        // I'll need to create an option to prevent starting awt.

        //new OPEX(new main());
    }

    /**
     * OPEX has run the game. Game code starts here.
     */
    @Override
    public void run() {
        new window(new WorldRenderer());
    }

    @Override
    public void stop() {

    }

    @Override
    public Version version() {
        return new Version(2021, 3, 20, "A");
    }
    //#endregion operations

    //#region static
    //#endregion static
}
