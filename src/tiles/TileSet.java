package tiles;

import rendering.Renderer;
import utility.main;
import xmlwise.Plist;
import xmlwise.XmlParseException;

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.ByteBuffer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * <h1>Tools to load tileset data and images.</h1>
 * <br>
 * <p>
 * Can load a tileset via *.tileset files. Stores tileset data, and processed / loads tileset images from disk into
 * video memory via openGl.
 * </p>
 *
 * @author <a href="https://www.shinkson47.in">Jordan T. Gray on 23/03/2021</a>
 * @version 1
 * @since v1
 */
public class TileSet {
    //#region constants
    /**
     * <h2>All successfully loaded tilesets</h2>
     * This store represents all tilesets available for use.
     * Tilesets which encountered a problem being loaded will not be stored.
     */
    public static final ArrayList<TileSet> LoadedTilesets = new ArrayList<>();
    //#endregion constants

    //#region fields
    /**
     * <h2>User friendly name for this tileset</h2>
     * 100% independant from tileset identifyer ({@link TileSet#tileSheet}).
     * i.e snow
     */
    private String setName;

    /**
     * <h2>Tilessheet identifier</h2>
     * Matches the name of the image, and is the resource name used to reffer to this tile set.
     * <br><br>
     * Corresponding tilesheet image must be PNG, and this name string must not contain the file extention.
     */
    private String tileSheet;

    /**
     * <h2>Type of tiles in this sheet</h2>
     * Defines how they are treated in-game, i.e what units are able to enter this tile.
     */
    private TileType tileType;

    /**
     * <h2>The width of the tiles in this set</h2>
     */
    private int tileWidth;

    /**
     * <h2>The height of the tiles in this set</h2>
     */
    private int tileHeight;

    /**
     * <h2>The number of columns in the tile sheet</h2>
     */
    private int sheetColumns;

    /**
     * <h2>The number of columns in the tile sheet</h2>
     */
    private int sheetRows;

    /**
     * <h2>A store of the tile data strings from tilesheet data.</h2>
     * Mapping the position within the tilesheet to it's resource string
     * i.e 0,0 => a.s_s_s_s
     */
    private HashMap<String, String> Tiles = new HashMap<>();

    /**
     * <h2>Mapping of tile resource strings to thier loaded opengl texture ID's</h2>
     * i.e a.s_s_s_s => 152
     */
    private HashMap<String, Integer> Textures = new HashMap<>();


    //#endregion fields

    //#region constructors

    /**
     * <h2>Loads a *.tileset's data into a new {@link TileSet}, and loads the linked textures.</h2>
     * Successfully loaded *.tilesets's are added to {@link TileSet#LoadedTilesets}, sets which fail to load are not.
     * @param TilesetData
     */
    private TileSet(HashMap TilesetData) {
        if (interpretData(TilesetData))
            LoadedTilesets.add(this);
    }
    //#endregion constructors

    //#region operations

    /**
     * <h2>Interprets and stores *.tileset data, and loads linked tileset images</h2>
     * @param TilesetData tilemap xml data in hashmap form.
     * @return true if loaded tileset successfully, else false.
     */
    private boolean interpretData(HashMap TilesetData) {
        // Fetch 'data' dictionary as a hashmap
        HashMap Data = (HashMap) TilesetData.get("data");

        // Load data from 'data' dictionary
        setName      = (String)                  Data.get("set_name");
        tileSheet    = (String)                  Data.get("tile_sheet");
        tileType     = TileType.valueOf((String) Data.get("tile_type"));
        tileWidth    = (int)                     Data.get("tile_width");
        tileHeight   = (int)                     Data.get("tile_height");
        sheetColumns = (int)                     Data.get("sheet_columns");

        // Empty array to populate with the image data for every tile found in the linked tilesheet image.
        ByteBuffer[] tileImages;
        try {
            // Fetch linked tilesheet png, and split it into sub-images - which are the tiles on the tilesheet.
            tileImages = Renderer.splitTilesheet(new File("./tilesets/" + tileSheet + ".png"), tileWidth, tileHeight, sheetColumns);
        } catch (Exception e) {
            main.fatal("Failed to read tilesheet (" + tileSheet + ".png) for " + setName + "! This sheet will not be loaded!", e);
            return false;
        }

        sheetRows = tileImages.length / sheetColumns;

        // Fetch 'tiles' dictionary as a hashmap
        Tiles = (HashMap<String, String>) TilesetData.get("tiles");

        // Store all tiles
        int tileIndex = 0;
        for (int x = 0; x < sheetRows; x++){
            for (int y = 0; y < sheetColumns; y++){
                                                                        // Load the image to open gl, and store texture (i.e (a.s_s_s_s => 152))
                Textures.put(Tiles.get(x + "," + y), Renderer.loadBufferedimageToOpenGL(tileImages[tileIndex], tileWidth, tileHeight));
                tileIndex++;                                            // Move to next tile
            }
        }

        return true;                                // Success!
    }

    /**
     * <h2>Finds a tile's gl texture ID using the tile's resource string</h2>
     * @param tileResourceString i.e a.s_s_s_s.
     * @see Tile#tileName
     * @return the corresponding open gl texture id for this tile, else -1
     */
    public static int FindTileTexture(String tileResourceString){
        String tileset = tileResourceString.substring(0, tileResourceString.indexOf('.'));
        String tile = tileResourceString.substring(tileResourceString.indexOf('.') + 1);

        for (TileSet set : LoadedTilesets){
            if (!set.tileSheet.equals(tileset)) continue;
            Integer i = set.Textures.get(tile);
            if (i != null) return i;
        }

        return -1;
    }
    //#endregion operations

    //#region static
    /**
     * <h2>loads all tiledata from a *.tileset file, and loads all tile textures from the linked tilesheet into memory.</h2>
     * Successfully loaded *.tilesets's are added to {@link TileSet#LoadedTilesets}, sets which fail to load are not.
     * @param file a *.tileset file to load
     * @throws IOException If the file could not be read
     * @throws XmlParseException If the file did not have valid xml content
     */
    public static void loadTileset(File file) throws IOException, XmlParseException {
        loadTileset((HashMap) Plist.loadObject(file));
    }

    /**
     * <h2>loads all tiledata from a *.tileset file's content, and loads all tile textures from the linked tilesheet into memory.</h2>
     * Successfully loaded *.tilesets's are added to {@link TileSet#LoadedTilesets}, sets which fail to load are not.
     */
    public static void loadTileset(HashMap TilesetData) {
        new TileSet(TilesetData);
    }

    public static void loadAllTilesets(){

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
                            main.fatal("Failed to load tileset file '" + v.getFileName() + "'!", e);
                        }
                        System.out.println("Loaded tileset " + v.toString());

                    });
        } catch (URISyntaxException | IOException e) {
            main.fatal("Failed to find or access tileset directory!", e);
        }
    }

    //#endregion static
}
