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

package com.shinkson47.SplashX6.audio

import com.badlogic.gdx.audio.Music
import com.badlogic.gdx.audio.Sound
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener
import com.shinkson47.SplashX6.game.Hypervisor
import com.shinkson47.SplashX6.rendering.ui.StageWindow
import com.shinkson47.SplashX6.utility.Assets
import com.shinkson47.SplashX6.utility.Assets.AUDIO_SFX_ERROR
import com.shinkson47.SplashX6.utility.Assets.AUDIO_SFX_FIGHT
import com.shinkson47.SplashX6.utility.Assets.AUDIO_SFX_WALK
/**
 * # Controller for in-built audio and music.
 * Note that this does not handle [Spotify].
 *
 * @author Jordan Gray
 * @since PRE-ALPHA 0.0.1
 */
object AudioController {

    // ==================================================
    //#region Fields
    // ==================================================

    var SONGS: ArrayList<Music> = ArrayList()

    /**
     * ## The default volume levels
     */
    private const val DEFAULT_VOLUME = 0.2f

    /**
     * Volume for SFX.
     */
    var SFXVolume = DEFAULT_VOLUME
        set(value) {
            field = value
            playButtonSound()
        }

    var musicVolume = DEFAULT_VOLUME
        set(value) {
            field = value
            assertVolume()
        }

    /**
     * Determines globally if audio should be played, or not.
     */
    var isMuted = false
        set(value) {
            field = value

            if (field)
                pauseMusic()
            else
                resumeMusic()
        }
    // TODO get and set on here for issue

    /**
     * <h2>Listener placed on GUI elements to play a sound when interacted with.</h2>
     */
    @JvmField val GUI_SOUND: ClickListener = StageWindow.LambdaClickListener { playButtonSound() }

    /**
     * <h2>Pointer to the music resource that we are currently playing.</h2>
     * Should never be null.
     */
    var nowPlaying = Assets.get<Music>(Assets.AUDIO_MUSIC_MENU)
        private set(value) {
            field = value
            assertVolume()
        }
        get

    /**
     * The current in-game soundtrack playlist.
     */
    private var currentPlaylist: Playlist? = null
        set(value) {
            field = value
            value?.let { play(it.reset()) }
        }

    // ==================================================
    //#endregion Fields
    //#region Miscellaneous
    // ==================================================

    /**
     * Makes sure that now playing is at the current volume.
     */
    private fun assertVolume() = nowPlaying.apply { volume = musicVolume }

    /**
     * Audible sound (music) for the this application's main menu.
     */
    @JvmStatic
    fun playMainMenu() {
        if (nowPlaying == Assets.get<Music>(Assets.AUDIO_MUSIC_MENU) && nowPlaying.isPlaying)
            return
        playOnLoop(Assets.get(Assets.AUDIO_MUSIC_MENU))
    }

    /**
     * Plays a new instance of {@link com.shinkson47.SplashX6.utility.Assets#SFX_BUTTON} at {@link AudioController#buttonVolume}
     *
     * @return the ID of the new clip. If muted, returns -1 with no effect.
     */
    fun playButtonSound(): Long = if (isMuted) -1
    else Assets.get<Sound>(Assets.AUDIO_SFX_BUTTON).play(SFXVolume)

    // ==================================================
    //#endregion misc
    //#region Music controls
    // ==================================================

    /**
     * Performs [Music.stop] on [nowPlaying]
     */
    fun stopMusic() = nowPlaying.stop()

    /**
     * Performs {@link Music#pause()} ()} on now playing
     */
    fun pauseMusic() = nowPlaying.pause()

    /**
     * Performs {@link Music#play()} ()} on now playing
     */
    fun resumeMusic() {
        if (!isMuted)
            nowPlaying.play()
    }

    /**
     * Skips the currently playing song in this application, playing the next song in the playlist.
     */
    @JvmStatic
    fun nextSong() = play(currentPlaylist?.next())

    /**
     * Plays the previous song in the playlist.
     */
    fun previousSong() {
        play(currentPlaylist?.previous())
    }

    // ==================================================
    //#endregion Music controls
    //#region Music utilities
    // ==================================================

    /**
     * <h2> Plays the provided music on repeat.</h2>
     * If muted, has no effect.
     *
     * @param m The music to loop
     * @return m
     */
    fun playOnLoop(music: Music): Music {
        return music.apply {
            music.isLooping = true
            play(music)
        }
    }

    /**
     * <h2>Actually plays some music.</h2>
     * Stops nowPlaying, plays m at current volume, and sets nowPlaying to m
     *
     * @param m The music to play.
     * @return nowPlaying pointer.
     */
    fun play(music: Music?): Music {
        if (music != null && !isMuted) {
            stopMusic()
            nowPlaying = music
            resumeMusic()
        }
        return nowPlaying
    }

    /**
     * Accepts a GamePlaylist object to be instantiated and played throughout the game.
     *
     * @param playlist The playlist to be played in the game.
     * @return Plays the first song at index 0 in the chosen playlist.
     */
    @JvmStatic
    fun playPlaylist(playlist: Playlist): Music {
        currentPlaylist = playlist
        return currentPlaylist!!.currentSong
    }

    /**
     * Resets the playlists index to 0.
     */
    fun resetPlaylist() {
        play(currentPlaylist?.reset())
    }

    // ==================================================
    //#endregion
    //#region sfx
    // ==================================================

    fun playSfx(path: String) =
        playSfx(Assets.get<Sound>(path))
    fun playSfx(sound: Sound) =
        sound.play(SFXVolume)

    fun walk() =  playCinematicSfx(AUDIO_SFX_WALK)
    fun error() = playSfx(AUDIO_SFX_ERROR)
    fun fight() = playCinematicSfx(AUDIO_SFX_FIGHT)

    fun playCinematicSfx(path: String) {
        if (!Hypervisor.isCinematingLocalTurn) return;
        playSfx(path)
    }

}

