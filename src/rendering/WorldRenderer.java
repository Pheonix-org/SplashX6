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

    public static int xoff = 0, yoff = 0;


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


        final Rectangle clip = new Rectangle(0, BASE_HEIGHT, main.window.getWidth(), main.window.getHeight() - TOP_HEIGHT);

        // Translate origin to top-center
        double tileRatio = (double) TILE_WIDTH / (double) TILE_HEIGHT;
        clip.x -= world.height() * (TILE_WIDTH / 2);

        int mx = clip.y + (int) (clip.x / tileRatio);
        int my = clip.y - (int) (clip.x / tileRatio);

        // Calculate map coords and divide by tile size (tiles assumed to
        // be square in normal projection)
        Point rowItr = new Point(
                (mx < 0 ? mx - TILE_HEIGHT : mx) / TILE_HEIGHT,
                (my < 0 ? my - TILE_HEIGHT : my) / TILE_HEIGHT);
        rowItr.x--;

        // Location on the screen of the top corner of a tile.
        int originX = (world.height() * TILE_WIDTH) / 2;

        Point drawLoc = new Point(
                ((rowItr.x - rowItr.y) * TILE_WIDTH / 2) + originX,
                (rowItr.x + rowItr.y) * TILE_HEIGHT / 2);
        drawLoc.x -= TILE_WIDTH / 2;
        drawLoc.y -= TILE_HEIGHT / 2;

        // Add offset from tile layer property
//        drawLoc.x += layer.getOffsetX() != null ? layer.getOffsetX() : 0;
//        drawLoc.y += layer.getOffsetY() != null ? layer.getOffsetY() : 0;

        // Determine area to draw from clipping rectangle
        int tileStepY = TILE_HEIGHT / 2 == 0 ? 1 : TILE_HEIGHT / 2;

        int columns = clip.width / TILE_WIDTH + 3;
        int rows = clip.height / tileStepY + 4;

        // Prevent panning viewport from moving outside of the map
        if (yoff < 0) yoff = 0;
        if (xoff < 0) xoff = 0;
        if (!(world.width() - columns < 0) && (xoff + columns) > world.width()) xoff = world.width() - columns;
        if (!(world.height() - rows < 0) && (yoff + rows) > world.height()) yoff = world.height() - rows;

        // Draw this map layer
        for (int y = yoff; y < rows + yoff; y++) {
            if (y < 0 || y >= world.worldTiles.length) break;
            Point columnItr = new Point(rowItr);

            for (int x = xoff; x < columns + xoff; x++) {
                if (x < 0 || x >= world.worldTiles[y].length) break;
                final Tile tile = world.worldTiles[y][x];

                if (tile != null) {
                    if (tile.cachedID == -1)
                        continue;

                    renderQuad(tile.cachedID,drawLoc.x, drawLoc.y, TILE_WIDTH, TILE_HEIGHT);
                }

                // Advance to the next tile
                columnItr.x++;
                columnItr.y--;
                drawLoc.x += TILE_WIDTH;
            }

            // Advance to the next row
            if ((y & 1) > 0) {
                rowItr.x++;
                drawLoc.x += TILE_WIDTH / 2;
            } else {
                rowItr.y++;
                drawLoc.x -= TILE_WIDTH / 2;
            }
            drawLoc.x -= columns * TILE_WIDTH;
            drawLoc.y += tileStepY;
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
