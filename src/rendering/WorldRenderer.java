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
        for (int y = rows; y >= 0; y--) {
            for (int x = cols; x >= 0; x--) {
                //renderQuad(Debug.debugValue, TILE_WIDTH * (x % cols) + + (((x / cols) % 2 != 0) ? 0 : (TILE_WIDTH / 2)), (TILE_HEIGHT / 2) * y);
                renderQuad(tex, x * TILE_WIDTH + ((y % 2 == 0) ? TILE_HALF_WIDTH : 0), BASE_HEIGHT + y * TILE_HALF_HEIGHT);
            }
        }

        glOverdrawBlendMode();
        for (int y = rows; y >= 0; y--) {
            for (int x = cols; x >= 0; x--) {
                if ((x % 2 == 0) && (y % 2 == 0))
                //renderQuad(Debug.debugValue, TILE_WIDTH * (x % cols) + + (((x / cols) % 2 != 0) ? 0 : (TILE_WIDTH / 2)), (TILE_HEIGHT / 2) * y);
                //renderQuad(city, x * TILE_WIDTH + TILE_QUARTER_WIDTH, TILE_HALF_HEIGHT + TILE_QUARTER_HEIGHT + BASE_HEIGHT + y * TILE_HALF_HEIGHT, TILE_HALF_WIDTH, TILE_HALF_HEIGHT);
                renderQuad(city, x * TILE_WIDTH + TILE_HALF_WIDTH, 5 + BASE_HEIGHT + y * TILE_HALF_HEIGHT);
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
    int city;

    @Override
    public void preRender() {
        renderQuad(importTexture("splash.png"), 0,0, main.window.getWidth(), main.window.getHeight());
        glfwSwapBuffers(main.window.getID());


         try {
             // This is all lambda, good luck reading it - it's all one line of code lol
             Files.walk(                                                                                                // Walk through filesystem
                     Paths.get(ClassLoader.getSystemResource("tilesets/")                                         // under the tileset directory
                             .toURI())
             )
                     .filter(Files::isRegularFile)                                                                      // Looking for files (not directories)
                     .filter(path -> path.toString().endsWith(".tileset"))                                              // That end with .tileset

                     .forEach(v -> {                                                                                    // For every resulting *.tileset file,
                try {
                    TileSet.loadTileset(new File(String.valueOf(v)));                                                   // load the tileset
                } catch (IOException | XmlParseException e) {
                    // This *.tileset file could not be read
                    System.err.println("Failed to load tileset file '" + v.getFileName() + "'!");
                }
                System.out.println("Loaded tileset " + v.toString());

             });
             } catch (URISyntaxException | IOException e) {
                // Resource folder not available.
                e.printStackTrace();
                System.err.println("Failed to find or access tileset directory!");
                System.exit(-1);
         }

         city = TileSet.FindTileTexture("cities.asian_16_wall");
    }


    //#endregion operations

    //#region static
    public static int calcRows(){
        return (((main.window.getHeight() - GAMEVIEW_HEIGHT_REDUCTION) / TILE_HEIGHT) * 2);
    }

    public static int calcHeight(){
        return calcRows() * TILE_HEIGHT / 2;
    }
    //#endregion static
}
