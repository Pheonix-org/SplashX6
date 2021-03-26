package rendering;

import tiles.Tile;
import tiles.TileSet;
import tiles.World;
import utility.Debug;
import utility.main;
import xmlwise.XmlParseException;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.lwjgl.glfw.GLFW.glfwSwapBuffers;

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

    //TODO move this stuff to a game hypervisor
    public static World world;



    //#endregion fields

    //#region constructors
    //#endregion constructors

    //#region operations

    public void setWorld(World world) {
        this.world = world;
    }


    @Override
    public void renderFrame() {
        if (world == null) return;  // Don't render if there's no world to render.

        glTileBlendMode();
        world.regenerate();

        final Rectangle viewport = new Rectangle(0, BASE_HEIGHT,main.window.getWidth(),main.window.getHeight() - TOP_HEIGHT);

        int columns = (int) (viewport.getWidth() / TILE_WIDTH); // TODO floor these doubles?
        int rows    = (int) (viewport.getHeight() / TILE_HALF_HEIGHT);

        Point drawLoc = new Point(viewport.x - TILE_QUARTER_WIDTH, viewport.y);

        for (int y = 0; y < rows; y++) {
            for (int x = 0; x < columns; x++) {
                Tile tile = world.getTile(x,y);
                if (tile == null || tile.cachedID == -1)
                    continue; // This shouldn't be hit, it's just for safety. It would indicate a problem with the map data. TODO how should we handle this?
                renderQuad(tile.cachedID, drawLoc.x, drawLoc.y, TILE_WIDTH, TILE_HEIGHT);
                drawLoc.x += TILE_WIDTH;
            }
            drawLoc.y += TILE_HALF_HEIGHT;
            drawLoc.x = viewport.x;

            if ((y & 1) == 1)
                drawLoc.x -= TILE_QUARTER_WIDTH;
            else
                drawLoc.x += TILE_QUARTER_WIDTH;
        }
    }

    // TODO create some kind of startup helper, we shouldn't load stuff on a pre-render

    @Override
    public void preRender() {
        renderQuad(importTexture("splash.png"), 0,0, main.window.getWidth(), main.window.getHeight());
        glfwSwapBuffers(main.window.getID());
        // Add audio here
    }

    //#endregion operations

    //#region static
    public static int calcRows(){
        return ((main.window.getHeight() - GAMEVIEW_HEIGHT_REDUCTION) / TILE_HEIGHT) * 2;
    }

    public static int calcHeight(){
        return calcRows() * TILE_HEIGHT / 2;
    }
    //#endregion static
}
