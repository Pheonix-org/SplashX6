package rendering;

import world.Tile;
import world.World;
import utility.main;

import java.awt.*;

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

    public static int subXOff = 0;
    public static int subYOff = 0;


    //#endregion fields

    //#region constructors
    //#endregion constructors

    //#region operations

    public void setWorld(World world) {
        this.world = world;
    }


    @Override
    public void doRender() {
        if (world == null) return;  // Don't render if there's no world to render.


        glTileBlendMode();

        final Rectangle viewport = new Rectangle(1-subXOff-(TILE_WIDTH*2), subYOff - (TILE_HEIGHT * 2), main.window.getWidth() + (TILE_WIDTH * 4),main.window.getHeight() + (TILE_WIDTH * 2));

        int columns = (int) (viewport.getWidth() / TILE_WIDTH); // TODO floor these doubles?
        int rows    = (int) (viewport.getHeight() / TILE_HALF_HEIGHT);

        Point drawLoc = new Point(viewport.x + TILE_QUARTER_WIDTH, viewport.y);

        for (int y = 0; y < rows; y++) {
            for (int x = 0; x < columns; x++) { // TODO doesn't care if world is smaller than is displayable, will still itterate over more rows than exist.
                Tile tile = world.getTile(x,y);
                if (tile == null || tile.cachedID == -1)
                    continue; // This shouldn't be hit, it's just for safety. It would indicate a problem with the map data. TODO how should we handle this?
                renderQuad(tile.cachedID, drawLoc.x, drawLoc.y, TILE_WIDTH + 2, TILE_HEIGHT + 2); // Adding two pixels to the width and height removes black lines between tiles.
                drawLoc.x += TILE_WIDTH;
            }
            drawLoc.y += TILE_HALF_HEIGHT;
            drawLoc.x = viewport.x;

            if ((y & 1) != 1)
                drawLoc.x -= TILE_QUARTER_WIDTH;
            else
                drawLoc.x += TILE_QUARTER_WIDTH;
        }
    }

    // TODO create some kind of startup helper, we shouldn't load stuff on a pre-render

    @Override
    public void doPreRender() {
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
