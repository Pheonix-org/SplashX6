import com.shinkson47.opex.backend.runtime.console.Console;
import com.shinkson47.opex.backend.runtime.errormanagement.exceptions.OPEXStartFailure;
import com.shinkson47.opex.backend.runtime.threading.OPEXGame;
import com.shinkson47.opex.backend.runtime.environment.OPEX;
import com.shinkson47.opex.backend.toolbox.Version;
import com.shinkson47.opex.frontend.window.prefabs.Splash;

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
    //#region constants
    //#endregion constants

    //#region fields
    //#endregion fields

    //#region constructors
    //#endregion constructors

    //#region operations

    /**
     * Main entry point. Starts OPEX with this game
     * @param args
     * @throws OPEXStartFailure
     */
    public static void main(String[] args) throws OPEXStartFailure {
        Splash.disable();   // You would not believe the amount of problems a simple splash screen is causing -_-
        new OPEX(new main());
    }

    /**
     * OPEX has run the game. Game code starts here.
     */
    @Override
    public void run() {
        Console.internalLog("Yeah mate this is the payload broom broom car game");
    }

    @Override
    public void stop() {

    }

    @Override
    public Version version() {
        return new Version(2021, 3, 19, "A");
    }
    //#endregion operations

    //#region static
    //#endregion static
}
