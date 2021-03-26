package rendering;


import org.lwjgl.openal.AL;
import org.lwjgl.openal.ALC;
import org.lwjgl.openal.ALCCapabilities;
import utility.main;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;

import static org.lwjgl.openal.ALC10.*;

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


    @Override
    public void preRender() {
        if (topUnderlayID == -1)  // The overlay image has already been loaded, don't do it again.
            topUnderlayID = importTexture("top_underlay.png");

        if (baseUnderlayID == -1) // The overlay image has already been loaded, don't do it again.
            baseUnderlayID = importTexture("base_underlay.png");

    }

    @Override
    public void renderFrame() {
+++++
       renderQuad( baseUnderlayID, 0,0, main.window.getWidth(), BASE_HEIGHT);
       renderQuad( topUnderlayID, 0, main.window.getHeight() - TOP_HEIGHT, main.window.getWidth(), TOP_HEIGHT);
    }
    //#endregion operations

    //#region static
    //#endregion static
}
