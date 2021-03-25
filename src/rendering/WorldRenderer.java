package rendering;

import tiles.TileSet;
import utility.Debug;
import utility.main;
import xmlwise.XmlParseException;

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
    //#endregion fields

    //#region constructors
    //#endregion constructors

    //#region operations
    final String sheetchars = "padgst";
    private char randomchar(){
        return sheetchars.charAt(Debug.random.nextInt(sheetchars.length()));
    }

    private int genRandomTile(){
        int id = -1;
        while (id == -1) {
            String s = randomchar() + "." + randomchar() + "_" + randomchar() + "_" + randomchar() + "_" + randomchar();
            id = TileSet.FindTileTexture(s);
        }
        return id;
    }

    @Override
    public void renderFrame() {
        glTileBlendMode();
        int tex = genRandomTile();
        int cols = (main.window.getWidth() / TILE_WIDTH);
        int rows = calcRows();
        for (int y = 0; y < rows-1; y++) {
            for (int x = 0; x < cols-1; x++) {
                //renderQuad(Debug.debugValue, TILE_WIDTH * (x % cols) + + (((x / cols) % 2 != 0) ? 0 : (TILE_WIDTH / 2)), (TILE_HEIGHT / 2) * y);
                renderQuad(tex, x * TILE_WIDTH + ((y % 2 == 0) ? TILE_HALF_WIDTH : 0), BASE_HEIGHT + y * TILE_HALF_HEIGHT);
            }
        }

        synchronized (this){
            try {
                wait(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
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
