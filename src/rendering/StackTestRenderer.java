package rendering;

import utility.main;

/**
 * <h1></h1>
 * <br>
 * <p>
 *
 * </p>
 *
 * @author <a href="https://www.shinkson47.in">Jordan T. Gray on 24/03/2021</a>
 * @version 1
 * @since v1
 */
public class StackTestRenderer extends Renderer {

    //#region constants
    //#endregion constants

    //#region fields
    //#endregion fields

    //#region constructors
    //#endregion constructors

    //#region operations

    private static int baseUnderlayID = -1;
    private static int topUnderlayID = -1;
    private static int y = 0;
    private static int h = 0;


    @Override
    public void preRender() {
        if (topUnderlayID == -1)  // The overlay image has already been loaded, don't do it again.
            topUnderlayID = importTexture("top_underlay.png");

        if (baseUnderlayID == -1) // The overlay image has already been loaded, don't do it again.
            baseUnderlayID = importTexture("base_underlay.png");

        y = BASE_HEIGHT + WorldRenderer.calcHeight() + 1 + TILE_HEIGHT;
        h = main.window.getHeight() - y;
    }

    @Override
    public void renderFrame() {
        glTileBlendMode();
        renderQuad( baseUnderlayID, 0,0, main.window.getWidth(), BASE_HEIGHT);
        renderQuad( topUnderlayID, 0, y, main.window.getWidth(), h);
    }
    //#endregion operations

    //#region static
    //#endregion static
}
