package tiles;

import xmlwise.Plist;
import xmlwise.XmlParseException;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.BiConsumer;

/**
 * <h1></h1>
 * <br>
 * <p>
 *
 * </p>
 *
 * @author <a href="https://www.shinkson47.in">Jordan T. Gray on 23/03/2021</a>
 * @version 1
 * @since v1
 */
public class TileSet {
    //#region constants
    public static final ArrayList<TileSet> LoadedTilesets = new ArrayList<>();
    //#endregion constants

    //#region fields
    /**
     * <h2>User friendly name for the tiles in this set.</h2>
     * i.e snow
     */
    private String setName;

    /**
     * <h2>Name of the tilesheet image</h2>
     * sheet must be PNG, and this name must not contain the file extention.
     */
    private String tileSheet;

    /**
     * <h2>Type of tiles in this sheet</h2>
     * Defines how they are treated, i.e what units are able to enter this tile
     */
    private TileType tileType;
    private int loadOrder;
    private int tileWidth;
    private int tileHeight;
    //#endregion fields

    //#region constructors
    private TileSet(HashMap TilesetData) {
        if (interpretData(TilesetData))
            LoadedTilesets.add(this);
    }
    //#endregion constructors

    //#region operations
    private boolean interpretData(HashMap TilesetData) {
        HashMap Data = (HashMap) TilesetData.get("data");
        HashMap Tiles = (HashMap) TilesetData.get("tiles");

        setName = (String) Data.get("set_name");

        tileSheet = (String) Data.get("tile_sheet");

        tileSheet = (String) Data.get("tile_sheet");

        return false;
    }
    //#endregion operations

    //#region static
    /**
     * pre-loads all tiledata into the buffer, but does not load any textures
     * @param file
     * @throws IOException
     * @throws XmlParseException
     */
    public static void preloadTileset(File file) throws IOException, XmlParseException {
        preloadTileset((HashMap) Plist.loadObject(file));
    }

    /**
     * pre-loads all tiledata into the buffer, but does not load any textures
     * @param TilesetData
     * @throws IOException
     * @throws XmlParseException
     */
    public static void preloadTileset(HashMap TilesetData) throws IOException, XmlParseException {
        new TileSet(TilesetData);
    }

    /**
     * Loads all tilesets in {@link TileSet#LoadedTilesets}
     */
    public static void loadedTilesets(){

    }
    //#endregion static
}
