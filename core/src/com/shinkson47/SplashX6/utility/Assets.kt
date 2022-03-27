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
 ░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░*/

package com.shinkson47.SplashX6.utility

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.Preferences
import com.badlogic.gdx.assets.AssetDescriptor
import com.badlogic.gdx.assets.AssetLoaderParameters
import com.badlogic.gdx.assets.AssetManager
import com.badlogic.gdx.assets.loaders.I18NBundleLoader
import com.badlogic.gdx.assets.loaders.SynchronousAssetLoader
import com.badlogic.gdx.assets.loaders.resolvers.InternalFileHandleResolver
import com.badlogic.gdx.audio.Music
import com.badlogic.gdx.audio.Sound
import com.badlogic.gdx.files.FileHandle
import com.badlogic.gdx.graphics.Pixmap
import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.graphics.g2d.TextureAtlas
import com.badlogic.gdx.maps.tiled.TiledMap
import com.badlogic.gdx.maps.tiled.TmxMapLoader
import com.badlogic.gdx.scenes.scene2d.ui.Skin
import com.badlogic.gdx.utils.Array
import com.badlogic.gdx.utils.I18NBundle
import com.shinkson47.SplashX6.audio.AudioController.SONGS
import com.shinkson47.SplashX6.audio.Playlist
import xmlwise.Plist
import java.awt.image.BufferedImage
import java.util.*
import javax.imageio.ImageIO
import kotlin.collections.ArrayList
import com.shinkson47.SplashX6.game.units.Unit
import com.shinkson47.SplashX6.game.world.WorldTerrain
import com.shinkson47.SplashX6.rendering.windows.game.Spotify
import com.shinkson47.SplashX6.utility.configuration.LanguageConfig


/**
 * # Dynamic asset loader and manager.
 * Uses LibGDX's [AssetManager] to load and manage assets in memory.
 *
 * It can load supported assets only, but more loaders can be added
 * to support more types. More assets can be loaded than Gdx natively supports.
 * See below for a full list of supported assets.
 *
 *
 * ## Assets natively supported
 * - [Pixmap]s
 * - [Texture]s
 * - [BitmapFont]s
 * - [FreeTypeFont]s
 * - [TextureAtlas]s
 * - [Music]s
 * - [Sound]s
 * - [Skin]s
 * - [ParticleEffect]s
 * - [I18NBundle]s
 * - [FreeTypeFontGenerator]
 *
 * ## Assets supported by this extension.
 * - [Preferences] (via [Gdx.app.getPreferences])
 * - [TiledMap]
 * - Plist (as [HashMap<String, Object>])
 * - [StringArrayList] (CSV -> [ArrayList<String>] of [String])
 * - [MusicArrayList] (CSV containing internal mp3 paths -> [ArrayList<Music>] of [Music])
 * - Text (.txt -> [String])
 * - Buffered Images (image files -> [BufferedImage])
 *
 * Assets are queued on object initialisation, but not loaded.
 *
 * During the startup screen, the [AssetManager] will work through the queue,
 * using the appropriate loader to interpret and load each asset into a
 * centralized memory pool, where they can be retrieved with [AssetManager.get].
 *
 * Assets are queued by internal file path, and associated with a class type
 * which is used to determine what kind of asset loader is used to load that
 * file.
 *
 * References to some of commonly ued the assets are provided above, prefaced with
 * 'REF_', for ease of use.
 * @author [Jordan T. Gray](https://www.shinkson47.in) on 23/02/2022
 * @since PRE-ALPHA 0.0.2
 * @version 2
 */
internal object Assets : AssetManager() {

    //====================================================================
    // region paths
    //====================================================================

    /**
     * directory separator
     */
    const val SEP = "/"

    // region File Extensions

    const val JSON  = ".json"
    const val ATLAS = ".atlas"
    const val PLIST = ".plist"
    const val TXT   = ".txt"
    const val CSV   = ".csv"
    const val MP3   = ".mp3"
    const val TMX   = ".tmx"
    const val PNG   = ".png"
    const val WAV   = ".wav"
    const val OGG   = ".ogg"

    // endregion
    // region Audio

    /**
     * directory containing everything to do with audio.
     */
    const val DIR_AUDIO = "audio$SEP"

    /**
     * directory containing data related to audio
     */
    const val DIR_AUDIO_DATA = "${DIR_AUDIO}data${SEP}"

    /**
     * directory containing music files
     */
    const val DIR_AUDIO_SOUNDTRACK = "${DIR_AUDIO}soundtrack${SEP}"

    /**
     * [plist] containing in-game playlist information.
     */
    const val AUDIO_PLAYLIST_DATA = "${DIR_AUDIO_DATA}playlists$PLIST"

    /**
     * [CSV] containing paths to all audio files that should be loaded.
     */
    const val AUDIO_LOADLIST_DATA = "${DIR_AUDIO_DATA}loadList$CSV"

    /**
     * directory containing sound effects
     */
    const val DIR_AUDIO_SFX = "${DIR_AUDIO}sfx${SEP}"

    /**
     * Audio played when a button is clicked.
     */
    const val AUDIO_SFX_BUTTON = "${DIR_AUDIO_SFX}click33$WAV"
    const val AUDIO_SFX_WALK = "${DIR_AUDIO_SFX}foot3$OGG"
    const val AUDIO_SFX_FIGHT = "${DIR_AUDIO_SFX}woodbrk$OGG"
    const val AUDIO_SFX_ERROR = "${DIR_AUDIO_SFX}illegal$OGG"

    /**
     * Default game music track.
     */
    const val AUDIO_MUSIC_GAME_DEFAULT = "${DIR_AUDIO_SOUNDTRACK}Lively${SEP}6054$MP3"

    const val AUDIO_MUSIC_GAME_OVER = "${DIR_AUDIO_SOUNDTRACK}game_over_iv$MP3"

    /**
     * Music played on the main menu.
     */
    const val AUDIO_MUSIC_MENU = "${DIR_AUDIO_SOUNDTRACK}Menu$MP3"

    // endregion Audio
    // region Data

    /**
     * directory containing general data.
     */
    const val DIR_DATA  = "data$SEP"

    /**
     * [Plist] containing information about nations, including:
     * - leaders
     * - cities
     * - which sprites used to represent the cities
     */
    const val DATA_NATION = "$DIR_DATA${SEP}nationdata$PLIST"
    const val DATA_UNIT = "$DIR_DATA${SEP}unitdata$PLIST"
    const val DATA_IMPROVEMENTS = "$DIR_DATA${SEP}buildingdata$PLIST"

    /**
     * [PLIST] containing information about the tech tree.
     */
    const val DATA_TECHS = "$DIR_DATA${SEP}techs$PLIST"


    // endregion Data
    // region Language

    /**
     * directory containing language related data.
     */
    const val DIR_LANG  = "lang$SEP"

    /**
     * [TXT] containing the text to be displayed on the credits screen.
     */
    const val LANG_CREDITS  = "${DIR_LANG}credits$TXT"

    /**
     * [TXT] containing the text to be displayed on the splash screen.
     */
    const val LANG_SPLASH  = "${DIR_LANG}splash$TXT"

    /**
     * [CSV] containing messages to be displayed on the loading screen.
     */
    const val LANG_TIPS  = "${DIR_LANG}tips$CSV"

    /**
     * [I18NBundle] containing localized text to be displayed throughout the game.
     */
    const val LANG_BUNDLE = "${DIR_LANG}lang"

    // endregion Language
    // region Skins

    /**
     * directory containing UI [Skin]s.
     */
    const val DIR_SKINS     = "skins$SEP"

    /**
     * The main 'W95' style [Skin].
     */
    const val SKIN_W95      = "${DIR_SKINS}W95${SEP}W95$JSON"

    /**
     * Secondary, backup, and fallback [Skin].
     * @deprecated Will be removed at some point.
     */
    const val SKIN_KENNY    = "${DIR_SKINS}kenney-pixel${SEP}skin${SEP}skin$JSON"

    // endregion Skins
    // region Sprites

    /**
     * directory containing sprite sheets.
     *
     * Typically in the form of a [TextureAtlas].
     */
    const val DIR_SPRITES       = "sprites$SEP"

    /**
     * [TextureAtlas] containing all sprites for [Unit]
     */
    const val SPRITES_UNITS     = "${DIR_SPRITES}units$ATLAS"
    const val SPRITES_UNITEXTRAS     = "${DIR_SPRITES}unitextras$ATLAS"

    /**
     * [TextureAtlas] containing all sprites for [City]
     */
    const val SPRITES_CITIES      = "${DIR_SPRITES}cities$ATLAS"

    const val SPRITES_BUILDINGS      = "${DIR_SPRITES}buildings$ATLAS"

    const val TEXTURE_ART      = "${DIR_SPRITES}gameart$ATLAS"

    /**
     * [TextureAtlas] containing keyboard key sprites for [KeyBindRenderer]
     */
    const val SPRITES_KEYS      = "${DIR_SPRITES}keysprites$ATLAS"

    /**
     * [TextureAtlas] containing an animation for the menu background.
     */
    const val SPRITES_MENUBG    = "${DIR_SPRITES}menu_bg$ATLAS"

    const val SPRITES_CURSOR    = "${DIR_SPRITES}cursor$PNG"

    /**
     * A [PNG] [Texture] displayed on [Spotify]
     */
    const val SPRITES_SPOTIFY_FAIL  = "${DIR_SPRITES}spotify_fail$PNG"


    // endregion Sprite
    // region Tiled

    /**
     * directory containing [TMX] [TiledMap]'s alongside [TSX] tile sets and their texture atlas images.
     */
    const val DIR_TILEMAPS  = "tmx$SEP"

    /**
     * directory containing data related to tilesets used by the world generation system.
     *
     * TODO not too sure the tilsets in here are still in use.
     */
    const val DIR_TILESET_DATA  = "${DIR_TILEMAPS}tiledata$SEP"

    /**
     * [PNG] image used in [WorldTerrain.cartesianToIso] conversion
     */
    const val TEX_HITTEST       = "${DIR_TILESET_DATA}hittest$PNG"

    /**
     * # [PLIST] mapping a tile's resource name to the index of the corresponding tile in the tilsets.
     *
     * i.e 'tile name' -> tile ID'
     *
     * Where the name is the "x_x_x_x" structure,
     * representing what type of tile is shown on each corner of the tile,
     * starting at north and going clockwise.
     *
     * The ID is determined by it's position in the [TMX] load order.
     *
     * The first tileset starts at 1, each tileset contains 216 tiles. Thus
     *
     * ```
     *      TileID = (tilesetNumber * 216) + tileIndex
     * ```
     *
     * The order of tilesets can be viewed and changed within the [TILED_TILESETS_DATA].[TMX] file.
     * Tilesets can be viewed in their [TSX] file.
     */
    const val TILED_TILESETS_DATA = "${DIR_TILESET_DATA}tileindex$PLIST"

    /**
     * [PLIST] mapping a unit's resource name to the index of the corresponding tile in the tilset.
     *
     * i.e unit.fighter -> 13.
     */
    const val TILED_SPRITES_DATA  = "${DIR_TILESET_DATA}sprites$PLIST"

    /**
     * # A blank [TiledMap] containing every tileset.
     * There's no way to directly load [TSX] tileset,
     * but GDX can load [TMX] and we can get the tilesets from
     * the loaded [TiledMap].
     */
    const val TILED_TILESETS = "${DIR_TILEMAPS}tilesets$TMX"

    /**
     * A blank [TiledMap] containing unit sprites via the units tileset.
     */
    const val TILED_SPRITES  = "${DIR_TILEMAPS}sprites$TMX"

    // endregion Tiled

    const val PREFERENCES = "Splash X6 config"

    //====================================================================
    // endregion paths
    // region Post Load Tasks
    //====================================================================

    /**
     * A Collection of tasks to perform once manager [isFinished] loading.
     */
    private val postLoadTasks: ArrayList<Runnable> = ArrayList()

    /**
     * Stores a task to perform after manager [isFinished] loading.
     *
     * i.e
     * ```Kotlin
     *  afterLoad {
     *      // do something with a loaded asset
     *  }
     * ```
     *
     *
     * @param task The tast to be performed after loading is complete.
     * @return true if task was added. (result of [ArrayList.add])
     * @see postLoadTasks
     * @see onLoadingComplete
     */
    private fun afterLoad(task: Runnable) = postLoadTasks.add(task)

    //====================================================================
    // endregion Post Load Tasks
    // region Static references to commonly used assets
    //====================================================================

    // Note : Static warnings may be ignored
    // On android, static resources cause issues with memory
    // management. We're not developing for mobile.

    /**
     * A [postLoadTasks] which populates static pointers to assets which
     * have already been loaded, for convenience.
     */
    private fun loadRefs() {
        REF_SKIN_W95 = Assets.get(SKIN_W95)
        REF_SKIN_KENNEY = Assets.get(SKIN_KENNY)
        REF_PREFERENCES = Assets.get(PREFERENCES)
        REF_SPRITES_UNITS = Assets.get(SPRITES_UNITS)
        REF_LANG = Assets.get(LANG_BUNDLE)
        REF_NATION_DATA = Assets.get(DATA_NATION)
        REF_TILESETS_DATA = Assets.get(TILED_TILESETS_DATA)
        REF_SPRITES_DATA = Assets.get(TILED_SPRITES_DATA)
        REF_PLAYLISTS = Assets.get(AUDIO_PLAYLIST_DATA)
    }


    lateinit var REF_SKIN_W95: Skin
        private set

    lateinit var REF_SKIN_KENNEY: Skin
        private set

    lateinit var REF_PREFERENCES : Preferences
        private set

    lateinit var REF_SPRITES_UNITS : TextureAtlas
        private set

    lateinit var REF_LANG : I18NBundle
        private set

    lateinit var REF_NATION_DATA : Map<String, *>
        private set

    lateinit var REF_TILESETS_DATA : Map<String, *>
        private set

    lateinit var REF_SPRITES_DATA : Map<String, *>
        private set

    lateinit var REF_PLAYLISTS : Map<String, *>
        private set


    //====================================================================
    // endregion Static refs
    // region Non managed
    // Resources that are not loaded via the [AssetManager].
    //====================================================================

    // TODO move this to the audio manager.
    lateinit var DEFAULT_PLAYLIST : Playlist
        private set

    //TODO move this to some kind of language manager.
    val languages = ArrayList<Locale>()

    //====================================================================
    // region Non managed
    // region Queue and Load.
    //====================================================================

    init {
        addCustomFileLoaders()
        queueAssetsForLoad()
    }

    /**
     * Before loading, add our custom [X6Loader]'s to the AssetManager,
     * so that it is able to load more file types.
     */
    private fun addCustomFileLoaders() {
        setLoader(Preferences::class.java, PreferencesLoader())
        setLoader(TiledMap::class.java, TiledMapLoader())
        setLoader(String::class.java, TXTLoader())
        setLoader(BufferedImage::class.java, IMGLoader())
        setLoader(Map::class.java, PlistLoader())

        // These are fucking horrendous. Just don't look.
        setLoader(StringArrayList::class.java, ArrayListLoader<String, StringArrayList> { x, y -> x })
        setLoader(MusicArrayList::class.java, ArrayListLoader<Music, MusicArrayList> { x, y -> Gdx.audio.newMusic(y) })
    }

    /**
     * # Assets are queued for loading here.
     *
     * Note that assets are not actually loaded, but just added to a queue,
     * where they will be loaded during the startup screen.
     *
     * Assets are queued by internal file path, and associated with a class type
     * which is used to determine what kind of asset loader is used to load that
     * file.
     *
     * During the startup screen, the [AssetManager] will work through the queue,
     * using the appropriate loader to interpret and load each asset into a
     * centralized memory pool, where they can be retrieved with [AssetManager.get].
     *
     * References to some of commonly ued the assets are provided above, prefaced with
     * 'REF_', for ease of use.
     *
     * TODO write document the map of files to types to make adding stuff easier.
     */
    private fun queueAssetsForLoad() {
        // Misc
        load(PREFERENCES, Preferences::class.java)

        // Data
        load(DATA_IMPROVEMENTS, Map::class.java)
        load(DATA_NATION, Map::class.java)
        load(DATA_TECHS, Map::class.java)
        load(DATA_UNIT, Map::class.java)

        // Textures & Sprites
        load(SPRITES_UNITEXTRAS, TextureAtlas::class.java)
        load(SPRITES_UNITS, TextureAtlas::class.java)
        load(SPRITES_CITIES, TextureAtlas::class.java)
        load(SPRITES_MENUBG, TextureAtlas::class.java)
        load(SPRITES_BUILDINGS, TextureAtlas::class.java)
        load(SPRITES_KEYS, TextureAtlas::class.java)
        load(TEXTURE_ART, TextureAtlas::class.java)
        load(SPRITES_SPOTIFY_FAIL, Texture::class.java)
        load(TEX_HITTEST, BufferedImage::class.java)

        load(SPRITES_CURSOR, Pixmap::class.java)
        afterLoad {
            get<Pixmap>(SPRITES_CURSOR).apply {
                with (Gdx.graphics) {
                    setCursor(newCursor(this@apply, 0, 0))
                }
            }
        }

        // Tilesets
        load(TILED_TILESETS, TiledMap::class.java)
        load(TILED_SPRITES, TiledMap::class.java)
        load(TILED_TILESETS_DATA, Map::class.java)
        load(TILED_SPRITES_DATA, Map::class.java)

        // Audio
        load(AUDIO_PLAYLIST_DATA, Map::class.java)
        load(AUDIO_MUSIC_GAME_DEFAULT, Music::class.java)
        load(AUDIO_MUSIC_MENU, Music::class.java)
        load(AUDIO_MUSIC_GAME_OVER, Music::class.java)
        load(AUDIO_SFX_BUTTON, Sound::class.java)
        load(AUDIO_SFX_WALK, Sound::class.java)
        load(AUDIO_SFX_FIGHT, Sound::class.java)
        load(AUDIO_SFX_ERROR, Sound::class.java)

        load(AUDIO_LOADLIST_DATA, StringArrayList::class.java)
        afterLoad {
            // TODO SONGS should be a map.
            for (song in get<ArrayList<String>>(AUDIO_LOADLIST_DATA))
                SONGS.add(Gdx.audio.newMusic(Gdx.files.internal(song)))

            // TODO This should retrieve from songs.
            DEFAULT_PLAYLIST = Playlist(SONGS)
        }

        // Language
        //TODO default language.
        load(LANG_BUNDLE, I18NBundle::class.java, I18NBundleLoader.I18NBundleParameter(Locale.ENGLISH))
        afterLoad {
            // Compile a list of all locales in languages.
            for (language in LanguageConfig.Languages.values())
                languages.add(Locale(language.toString()))
        }

        load(LANG_CREDITS, String::class.java)
        load(LANG_SPLASH, String::class.java)
        load(LANG_TIPS, StringArrayList::class.java)

        // Skins
        load(SKIN_KENNY, Skin::class.java)
        load(SKIN_W95, Skin::class.java)
    }


    /**
     * # Loads a some more of the assets.
     * Called every frame on the loading screen, working through
     * a bit more of the loading queue.
     *
     * Once loading is complete, calls [onLoadingComplete].
     *
     * @return true if loading is entirely complete.
     */
    override fun update(delta: Int): Boolean {
        return try {
            super.update(delta).also {
                if (it)
                    onLoadingComplete()
            }
        } catch (e : Throwable) {
            Utility.fatal("Failed to load assets!", e)
            false
        }
    }

    /**
     * Used on debug boots to skip the loading screen.
     *
     * Loads the entire queue in one call, and returns.
     */
    override fun finishLoading() {
        super.finishLoading()
        onLoadingComplete()
    }

    /**
     * # Invoked when [AssetManager] has completed loading all assets.
     *
     * Invokes [loadRefs], and executes [PostLoadTasks].
     */
    private fun onLoadingComplete() {
        postLoadTasks.forEach { it.run() }
        loadRefs()
    }

    //====================================================================
    // region Queue and Load
    // region Custom Loaders
    //====================================================================

    /**
     * # Invokes the engine to load the standardised preferences store.
     */
    private class PreferencesLoader : X6Loader<Preferences>() {
        override fun load(assetManager: AssetManager?, fileName: String?, file: FileHandle?, parameter: AssetLoaderParameters<Preferences>?): Preferences =
            Gdx.app.getPreferences(fileName)
    }


    /**
     * Loads a [TMX] file to a [TiledMap]
     */
    private class TiledMapLoader : X6Loader<TiledMap>() {
        override fun load(assetManager: AssetManager?, fileName: String?, file: FileHandle?, parameter: AssetLoaderParameters<TiledMap>?): TiledMap =
            TmxMapLoader().load(fileName) // TODO check if fn is right.
    }

    /**
     * Creates a [Map] from a [Plist] xml document.
     *
     * > N.B : The root element of a plist ***MUST*** be a dictionary, not an array.
     */
    private class PlistLoader : X6Loader<Map<*, *>>() {
        override fun load(assetManager: AssetManager?, fileName: String?, file: FileHandle?, parameter: AssetLoaderParameters<Map<*, *>>?): Map<*, *> =
            Plist.fromXml(file!!.readString())
    }

    /**
     * Disambiguation alias for an array of strings.
     *
     * When used as the load type with a csv, the csv is loaded
     * as an [ArrayList] of [String] via [ArrayListLoader]
     */
    internal class StringArrayList : ArrayList<String>()

    /**
     * Disambiguation alias for an array of Music
     *
     * When used as the load type with a csv, the csv is loaded
     * as an [ArrayList] of [Music] via [ArrayListLoader] -
     * where each entry in the csv is interpreted as an internal path
     * pointing to a music file.
     *
     * i.e
     * ```
     *  csv.foreach {
     *      output.add(Gdx.audio.newMusic( csvEntry ))
     * }
     * ```
     *
     */
    internal class MusicArrayList : ArrayList<Music>()

    /**
     * ## Creates an [ArrayList] from a csv file.
     *
     * Returns an [ArrayList] of [T], where the [function] parameter
     * turns each element in the csv into [T].
     *
     * i.e in the case of the [MusicArrayList], [function] interprets each
     * csv element as a path to a music file, and loads it as a [Music],
     * giving the resulting of [ArrayList] of [Music].
     *
     * The functions are defined in [addCustomFileLoaders], where the alias classes are
     * assigned to this loader.
     *
     * @param T The type of item contained in the result [ArrayList]
     * @param function The function mapping the [String] entry in the file to [T].
     *                 Also gets provided with the [FileHandle] to the CSV being loaded.
     * @see MusicArrayList
     * @see StringArrayList
     */
    private class ArrayListLoader<T : Any, P : ArrayList<T>>(val function : (String, FileHandle) -> T) : X6Loader<P>() {
        override fun load(assetManager: AssetManager?, fileName: String?, file: FileHandle?, parameter: AssetLoaderParameters<P>?): P =
            (ArrayList<T>() as P).apply {
                file!!.readString().split(Regex(",\n")).forEach {
                    add(function(it, file))
                }
            }
    }

    /**
     * # Loads a [TXT] file as a [String].
     */
    private  class TXTLoader : X6Loader<String>() {
        override fun load(assetManager: AssetManager?, fileName: String?, file: FileHandle?, parameter: AssetLoaderParameters<String>?): String =
            file!!.readString()
    }

    /**
     * # Loads an [ImageIO] supported image file as a [BufferedImage].
     */
    private  class IMGLoader : X6Loader<BufferedImage>() {
        override fun load(assetManager: AssetManager?, fileName: String?, file: FileHandle?, parameter: AssetLoaderParameters<BufferedImage>?): BufferedImage =
            ImageIO.read(file!!.read());
    }

    /**
     * # A simplification of the [SynchronousAssetLoader].
     * Used to reduce the boilerplate needed to write the above asset loaders.
     */
    private abstract class X6Loader<T>() : SynchronousAssetLoader<T, AssetLoaderParameters<T>>(InternalFileHandleResolver()){
        override fun getDependencies(fileName: String?, file: FileHandle?, parameter: AssetLoaderParameters<T>?): Array<AssetDescriptor<Any>>
            = Array()
    }
}



/**
 * # Small collection of assets made available before [Assets] is loaded.
 * @author [Jordan T. Gray](https://www.shinkson47.in) on 28/06/2021
 * @since PRE-ALPHA 0.0.2
 * @version 1
 */
object PrebootAssets {

    @JvmStatic
    val PB_SKIN : Skin = Skin(Gdx.files.internal("skins/W95/W95.json"))

    val SPLASH_TEXT = Gdx.files.internal("lang/splash.txt").readString()

    val splashBG: TextureAtlas = TextureAtlas("sprites/splash_bg.atlas")

}