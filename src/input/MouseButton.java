package input;

/**
 * <h1></h1>
 * <br>
 * <p>
 *
 * </p>
 *
 * @author <a href="https://www.shinkson47.in">Jordan T. Gray on 31/03/2021</a>
 * @version 1
 * @since v1
 */
public class MouseButton {
    //#region constants
    //#endregion constants

    //#region fields
    public boolean down = false;
    public boolean firstCapture = true;
    //#endregion fields

    //#region constructors
    public void down(){
        down = true;
        firstCapture = true;
    }

    public void up() {
        down = false;
        firstCapture = false;
    }
    //#endregion constructors

    //#region operations
    //#endregion operations

    //#region static
    //#endregion static
}
