package rendering;

import utility.main;

/**
 * <h1></h1>
 * <br>
 * <p>
 *
 * </p>
 *
 * @author <a href="https://www.shinkson47.in">Jordan T. Gray on 25/03/2021</a>
 * @version 1
 * @since v1
 */
public class ErrorRenderer extends Renderer {



    //#region constants
    //#endregion constants

    //#region fields
    //#endregion fields

    //#region constructors
    //#endregion constructors

    //#region operations
    int error = -1;

    /**
     * <h2>Overridable method to perform initalisation code before a renderer renders the first frame</h2>
     */
    @Override
    public void preRender() {
        error = importTexture("error.png");
    }

    @Override
    public void renderFrame() {
        renderQuad(error, 0,0, main.window.getWidth(), main.window.getHeight());
    }
    //#endregion operations

    //#region static
    //#endregion static
}
