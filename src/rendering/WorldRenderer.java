package rendering;

import utility.Debug;

import java.util.Random;

/**
 * <h1>Renders a game world</h1>
 * <br>
 * <p>
 * but not yet, for now just displays a single quad for texture if 1
 * </p>
 *
 * @author <a href="https://www.shinkson47.in">Jordan T. Gray on 21/03/2021</a>
 * @version 1
 * @since v1
 */
public class WorldRenderer extends Renderer {

    //#region constants
    //#endregion constants

    //#region fields
    //#endregion fields

    //#region constructors
    //#endregion constructors

    //#region operations
    @Override
    public void renderFrame() {
        int cols = 4;
        int rows = 20;
        for (int y = rows; y >= 0; y--) {
            for (int x = cols; x >= 0; x--) {
                //renderQuad(Debug.debugValue, TILE_WIDTH * (x % cols) + + (((x / cols) % 2 != 0) ? 0 : (TILE_WIDTH / 2)), (TILE_HEIGHT / 2) * y);
                renderQuad(Debug.random.nextInt(textures.size()) + 1, x * TILE_WIDTH + ((y % 2 == 0) ? TILE_WIDTH / 2 : 0), y * (TILE_HEIGHT / 2));
            }
        }
        try {
            synchronized(this) {
                wait(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    //#endregion operations

    //#region static
    //#endregion static
}
