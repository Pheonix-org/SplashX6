/*░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░
 ░ FOSS 2022. The Splash Project.                                                                                                                                                 ░
 ░ https://www.shinkson47.in/SplashX6                                                                                                                                             ░
 ░ Jordan T. Gray.                                                                                                                                                                ░
 ░                                                                                                                                                                                ░
 ░                                                                                                                                                                                ░
 ░                                                                                                                                                                                ░
 ░           _____                    _____                    _____            _____                    _____                    _____                                           ░
 ░          /\    \                  /\    \                  /\    \          /\    \                  /\    \                  /\    \                         ______           ░
 ░         /::\    \                /::\    \                /::\____\        /::\    \                /::\    \                /::\____\                       |::|   |          ░
 ░        /::::\    \              /::::\    \              /:::/    /       /::::\    \              /::::\    \              /:::/    /                       |::|   |          ░
 ░       /::::::\    \            /::::::\    \            /:::/    /       /::::::\    \            /::::::\    \            /:::/    /                        |::|   |          ░
 ░      /:::/\:::\    \          /:::/\:::\    \          /:::/    /       /:::/\:::\    \          /:::/\:::\    \          /:::/    /                         |::|   |          ░
 ░     /:::/__\:::\    \        /:::/__\:::\    \        /:::/    /       /:::/__\:::\    \        /:::/__\:::\    \        /:::/____/                          |::|   |          ░
 ░     \:::\   \:::\    \      /::::\   \:::\    \      /:::/    /       /::::\   \:::\    \       \:::\   \:::\    \      /::::\    \                          |::|   |          ░
 ░   ___\:::\   \:::\    \    /::::::\   \:::\    \    /:::/    /       /::::::\   \:::\    \    ___\:::\   \:::\    \    /::::::\    \   _____                 |::|   |          ░
 ░  /\   \:::\   \:::\    \  /:::/\:::\   \:::\____\  /:::/    /       /:::/\:::\   \:::\    \  /\   \:::\   \:::\    \  /:::/\:::\    \ /\    \          ______|::|___|___ ____  ░
 ░ /::\   \:::\   \:::\____\/:::/  \:::\   \:::|    |/:::/____/       /:::/  \:::\   \:::\____\/::\   \:::\   \:::\____\/:::/  \:::\    /::\____\        |:::::::::::::::::|    | ░
 ░ \:::\   \:::\   \::/    /\::/    \:::\  /:::|____|\:::\    \       \::/    \:::\  /:::/    /\:::\   \:::\   \::/    /\::/    \:::\  /:::/    /        |:::::::::::::::::|____| ░
 ░  \:::\   \:::\   \/____/  \/_____/\:::\/:::/    /  \:::\    \       \/____/ \:::\/:::/    /  \:::\   \:::\   \/____/  \/____/ \:::\/:::/    /          ~~~~~~|::|~~~|~~~       ░
 ░   \:::\   \:::\    \               \::::::/    /    \:::\    \               \::::::/    /    \:::\   \:::\    \               \::::::/    /                 |::|   |          ░
 ░    \:::\   \:::\____\               \::::/    /      \:::\    \               \::::/    /      \:::\   \:::\____\               \::::/    /                  |::|   |          ░
 ░     \:::\  /:::/    /                \::/____/        \:::\    \              /:::/    /        \:::\  /:::/    /               /:::/    /                   |::|   |          ░
 ░      \:::\/:::/    /                  ~~               \:::\    \            /:::/    /          \:::\/:::/    /               /:::/    /                    |::|   |          ░
 ░       \::::::/    /                                     \:::\    \          /:::/    /            \::::::/    /               /:::/    /                     |::|   |          ░
 ░        \::::/    /                                       \:::\____\        /:::/    /              \::::/    /               /:::/    /                      |::|   |          ░
 ░         \::/    /                                         \::/    /        \::/    /                \::/    /                \::/    /                       |::|___|          ░
 ░          \/____/                                           \/____/          \/____/                  \/____/                  \/____/                         ~~               ░
 ░                                                                                                                                                                                ░
 ░                                                                                                                                                                                ░
 ░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░*/

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

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.*;

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

    //TODO this is never called.
    public static void Dispose() {
        TILESETS.dispose();
    }

    // TODO should really be in some kind of language manager
    public static final I18NBundle loadLanguage(Languages lang) {
        LANG = I18NBundle.createBundle(Gdx.files.internal("lang/lang"), new Locale(lang.toString()));
        //I18NBundle.setExceptionOnMissingKey(false);

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
  public static final Skin SKIN,
        SKIN_KENNEY = new Skin(Gdx.files.internal("skins/kenney-pixel/skin/skin.json"));
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

  public static final Texture
          spotifyFail;

  public static final TextureAtlas
          keySprites,
          unitSprites,
          citySprites,
          menuBG;

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
   * <code>
   * ID = tilesetStart + tileIndex
   * </code>
   * </blockquote>
   * .
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
          playlists,
          NATION_DATA
    ;
  //#endregion World

  //#region audio
  public static final Music
          GAME_DEFAULT = Gdx.audio.newMusic(Gdx.files.internal("audio/soundtrack/Lively/6054.mp3")),
          MUSIC_MAIN_MENU = Gdx.audio.newMusic(Gdx.files.internal("audio/soundtrack/Menu.mp3"));

  // Playlist tracks
  /**
   * <h2>This applications default game playlist</h2>
   * Loads music files into an Array.
   */
  public static final ArrayList<Music> SONGS = new ArrayList<>();

  public static final Sound SFX_BUTTON = Gdx.audio.newSound(Gdx.files.internal("audio/sfx/click33.wav"));
  //#endregion audio

  public static final String
          CREDITS_TEXT    = Gdx.files.internal("lang/credits.txt").readString(),
          SPLASH_TEXT     = Gdx.files.internal("lang/splash.txt").readString(),
          SONG_LOAD_LIST  = Gdx.files.internal("audio/data/loadList.csv").readString();

  public static final String[] TIPS = Gdx.files.internal("lang/tips.txt").readString().split("\n");

  /**
   * Single chanel data image used to try and determine if the cursor
   * is over
   */
  public static BufferedImage hitTest;

  static{
      unitSprites = new TextureAtlas("sprites/units.atlas");
      citySprites = new TextureAtlas("sprites/cities.atlas");
      keySprites = new TextureAtlas("sprites/keysprites.atlas");
      menuBG = new TextureAtlas("sprites/menu_bg.atlas");
      spotifyFail = new Texture("sprites/spotify_fail.png");

      SKIN = PrebootAssets.getPB_SKIN();

      // Tilesets
      TILESETS = new TmxMapLoader().load("tmx/tilesets.tmx");
      SPRITES = new TmxMapLoader().load("tmx/sprites.tmx");

      try {
          TILESET_MAP = Plist.fromXml(Gdx.files.internal("tmx/tsdata.plist").readString());
          SPRITES_MAP = Plist.fromXml(Gdx.files.internal("tmx/sprites.plist").readString());
          playlists   = Plist.fromXml(Gdx.files.internal("audio/data/playlists.plist").readString());
          NATION_DATA   = Plist.fromXml(Gdx.files.internal("data/nationdata.plist").readString());
          hitTest = ImageIO.read(Gdx.files.internal("tsdata/hittest.png").read());
      } catch (XmlParseException | IOException ignored) {
          ignored.printStackTrace();
          throw new Error("Unable to load assets.");
      }

      // Load playlist
      for (String s : SONG_LOAD_LIST.split(",\n"))
          SONGS.add(Gdx.audio.newMusic(Gdx.files.internal(s)));

      // Load languages
      languages = new ArrayList<>();
      for (Languages lang : Languages.values())
          languages.add(new Locale(lang.toString()));

      loadLanguage(en);
  }
}
