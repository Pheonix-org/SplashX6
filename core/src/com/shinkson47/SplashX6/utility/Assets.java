package com.shinkson47.SplashX6.utility;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TmxMapLoader;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import xmlwise.Plist;
import xmlwise.XmlParseException;

import java.util.Map;

/**
 * <h1></h1>
 * <br>
 * <p>
 *
 * </p>
 *
 * @author <a href="https://www.shinkson47.in">Jordan T. Gray on 16/04/2021</a>
 * @version 1
 * @since v1
 */
public class Assets {

    public static void Create(){}
    static{
        SKIN = new Skin(Gdx.files.internal("skins/C64/skin/uiskin.json"));


        // Tilesets
        TILESETS = new TmxMapLoader().load("tmx/tilesets.tmx");

        // Tileset mapping data
        Map<String, Object> result = null;
        try {
            result = Plist.fromXml(Gdx.files.internal("tmx/tsdata.plist").readString());
        } catch (XmlParseException ignored) { }
        finally {
            TILESET_MAP = result;
        }
    }

    public static void Dispose(){
        TILESETS.dispose();
    }







    /* ==========================================================================================*/
    // Actual fucking assets
    /* ==========================================================================================*/






    //#region UI
    public static final Skin SKIN;
    //#endregion UI

    //#region World
    /**
     * <h2>A blank TMX tilemap that contains all of our TSX tilesets and images</h2>
     * There's no way to directly load TSX, but GDX can load TMX and we can get the tilesets from
     * the loaded {@link TiledMap}
     */
    public static final TiledMap TILESETS;

    /**
     * <h2>A map of 'tile name' => tile ID'</h2>
     * Where the name is the "x_x_x_x" structure,
     * representing what type of tile is shown on each corner of the tile,
     * starting at north and going clockwise.
     * <br><br>
     * The ID is determined by it's position in the TMX load order.
     * <br>
     * First tileset starts at 1, each tileset contains 216 tiles. Thus
     * <blockquote>
     *     <code>
     *         ID = tilesetStart + tileIndex
     *     </code>
     * </blockquote>
     *.
     * <br>
     * The order of tilesets can be viewed and changed within the "tilesets.tmx" file.
     * Tilesets can be viewed in thier "tsx" file.
     * <br><br>
     * This field fetches it's data from "tmx/tsdata.plist", which defines the map.
     *
     * @apiNote The value datatype is int, but the loader will only provide an object. Soz.
     */
    public static final Map<String, Object> TILESET_MAP;
    //#endregion World

    //#region audio

    //#endregion audio


}
