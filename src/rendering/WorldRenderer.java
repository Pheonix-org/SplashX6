package rendering;

import tiles.TileSet;
import utility.Debug;
import utility.main;
import xmlwise.XmlParseException;

import java.io.File;
import java.io.IOException;
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
        int tex = TileSet.FindTileTexture("a.a_a_a_a");
        int cols = (main.window.getWidth() / TILE_WIDTH);
        int rows = ((main.window.getHeight() / TILE_HEIGHT) * 2) ;
        for (int y = rows; y >= 0; y--) {
            for (int x = cols; x >= 0; x--) {
                //renderQuad(Debug.debugValue, TILE_WIDTH * (x % cols) + + (((x / cols) % 2 != 0) ? 0 : (TILE_WIDTH / 2)), (TILE_HEIGHT / 2) * y);
                renderQuad(tex, x * TILE_WIDTH + ((y % 2 == 0) ? TILE_WIDTH / 2 : 0), y * (TILE_HEIGHT / 2));
            }
        }
    }

    @Override
    public void preRender() {
        try {
            TileSet.loadTileset(new File("./tilesets/a.TileSet"));
        } catch (IOException | XmlParseException e) {
            e.printStackTrace();
        }
    }
    //#endregion operations

    //#region static
    //#endregion static
}
