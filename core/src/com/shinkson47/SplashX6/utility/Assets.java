package com.shinkson47.SplashX6.utility;

import com.badlogic.gdx.Application;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Preferences;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TmxMapLoader;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.utils.I18NBundle;
import xmlwise.Plist;
import xmlwise.XmlParseException;
import xmlwise.Xmlwise;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import static com.shinkson47.SplashX6.utility.Languages.en;

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
    public static void Dispose() {
        TILESETS.dispose();
    }

    // TODO should really be in some kind of language manager
    public static final I18NBundle loadLanguage(Languages lang) {
        LANG = I18NBundle.createBundle(Gdx.files.internal("lang/lang"), new Locale(lang.toString()));
        I18NBundle.setExceptionOnMissingKey(false);

        //#
        return LANG;
    }


    /* ==========================================================================================*/
    // Actual fucking assets
    /* ==========================================================================================*/

  public static Preferences preferences = Gdx.app.getPreferences("Splash X6 config");

    public static I18NBundle LANG;

    public static ArrayList<Locale> languages;

    //#region UI
    public static final Skin SKIN;

    //public static final Texture menubg = new Texture("sprites/bg.png");
    //#endregion UI

    //#region World
    /**
     * <h2>A blank TMX tilemap that contains all of our TSX tilesets and images</h2>
     * There's no way to directly load TSX, but GDX can load TMX and we can get the tilesets from
     * the loaded {@link TiledMap}
     */
    public static final TiledMap
            TILESETS,
            SPRITES;

    public static final TextureAtlas
            unitSprites,
            citySprites,
            menuBG,
            splashBG;

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
    public static final Map<String, Object>
            TILESET_MAP,
            SPRITES_MAP,
            playlists;
    //#endregion World

    //#region audio
    public static final Music
            MUSIC_MAIN_MENU = Gdx.audio.newMusic(Gdx.files.internal("audio/soundtrack/medieval.ogg")),

            // Playlist tracks
            GAME_DEFAULT = Gdx.audio.newMusic(Gdx.files.internal("audio/soundtrack/overworld theme.ogg")),
            TRACK_ONE = Gdx.audio.newMusic(Gdx.files.internal("audio/GamePlaylist/TownTheme.mp3")),
            TRACK_TWO = Gdx.audio.newMusic(Gdx.files.internal("audio/GamePlaylist/demo_track_1.mp3")),
            TRACK_THREE = Gdx.audio.newMusic(Gdx.files.internal("audio/GamePlaylist/demo_track_2.mp3")),
            TRACK_FOUR = Gdx.audio.newMusic(Gdx.files.internal("audio/GamePlaylist/Heroic Demise (New).mp3")),
            TRACK_FIVE = Gdx.audio.newMusic(Gdx.files.internal("audio/GamePlaylist/little town - orchestral.ogg"));



    public static final Sound SFX_BUTTON = Gdx.audio.newSound(Gdx.files.internal("audio/sfx/click33.wav"));
    //#endregion audio

    public static final String
            CREDITS_TEXT = Gdx.files.internal("lang/credits.txt").readString(),
            SPLASH_TEXT = Gdx.files.internal("lang/splash.txt").readString();



    static{
        unitSprites = new TextureAtlas("sprites/units.atlas");
        citySprites = new TextureAtlas("sprites/cities.atlas");
        menuBG = new TextureAtlas("sprites/menu_bg.atlas");
        splashBG = new TextureAtlas("sprites/splash_bg.atlas");

        SKIN = new Skin(Gdx.files.internal("skins/x6/skin/x6.json"));

        // Tilesets
        TILESETS = new TmxMapLoader().load("tmx/tilesets.tmx");
        SPRITES = new TmxMapLoader().load("tmx/sprites.tmx");

        // Tileset mapping data
        try {
            TILESET_MAP = Plist.fromXml(Gdx.files.internal("tmx/tsdata.plist").readString());
            SPRITES_MAP = Plist.fromXml(Gdx.files.internal("tmx/sprites.plist").readString());
            playlists   = Plist.fromXml(Gdx.files.internal("audio/data/playlists.plist").readString());
        } catch (XmlParseException ignored) {
            throw new Error("Unable to load XML data.");
        }


        // Load languages
        languages = new ArrayList<>();
        for (Languages lang : Languages.values())
            languages.add(new Locale(lang.toString()));

        loadLanguage(en);
    }


}
