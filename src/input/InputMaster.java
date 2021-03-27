package input;

/**
 * <h1>Hypervisor for all GLFW user input</h1>
 * <br>
 * <p>
 *
 * </p>
 *
 * @author <a href="https://www.shinkson47.in">Jordan T. Gray on 27/03/2021</a>
 * @version 1
 * @since v1
 */
public class InputMaster {
    //#region static
    /**
     * <h2>Sets all GLFW input handlers to the defaults.</h2>
     */
    public static void setDefaultInputCallbacks() {
        MouseInputHandler.DEFAULT_CLICK       .setDefaultCallback();
        MouseInputHandler.DEFAULT_MOUSE_MOVE  .setDefaultCallback();
        MouseInputHandler.DEFAULT_MOUSE_SCROLL.setDefaultCallback();

        KeyboardInputHandler.DEFAULT_KEY      .setDefaultCallback();
    }
    //#endregion static
}
