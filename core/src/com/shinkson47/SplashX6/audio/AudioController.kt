package com.shinkson47.SplashX6.audio

import com.badlogic.gdx.audio.Music
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener
import com.shinkson47.SplashX6.rendering.StageWindow
import com.shinkson47.SplashX6.utility.Assets.MUSIC_MAIN_MENU
import com.shinkson47.SplashX6.utility.Assets.SFX_BUTTON

/**
 * <h1>Audio Controller</h1>
 *
 * @author Jordan Gray
 * @since PRE-ALPHA 0.0.1
 */
object AudioController {

    // ==================================================
    //#region Fields
    // ==================================================

    /**
     * <h2>The default volume levels</h2>
     */
    private const val DEFAULT_VOLUME = 0.2f

    var musicVolume = DEFAULT_VOLUME
        set(value) {
            field = value
            assertNowPlayingVolume()
        }

    var buttonVolume = DEFAULT_VOLUME

    /**
     * Determines if audio should be played, or not.
     */
    var isMuted = false

    /**
     * <h2>Listener placed on GUI elements to play a sound when interacted with.</h2>
     */
    @JvmField
    val GUI_SOUND: ClickListener = StageWindow.LambdaClickListener { AudioController.playButtonSound() }

    /**
     * <h2>Pointer to the music resource that we are currently playing.</h2>
     * Should never be null.
     */
    var nowPlaying = MUSIC_MAIN_MENU

    /**
     * The currently chosen GamePlaylist for this applications in-game soundtrack.
     */
    private var currentPlaylist: GamePlaylist? = null

    // ==================================================
    //#endregion Fields
    //#region Volume API
    // ==================================================

    /**
     * Stops now playing and prevents more music from being played.
     */
    @Synchronized
    fun muteAudio() {
        pauseMusic()
        isMuted = true
    }

    /**
     * Un-Mutes the volume of ALL audio in this application.
     */
    @Synchronized
    fun unmuteAudio() {
        isMuted = false
        resumeMusic()
    }

    /**
     * @param mute
     */
    @Synchronized
    fun setMute(mute: Boolean = true) {
        if (mute)
            muteAudio()
        else
            unmuteAudio()
    }

    /**
     * Makes sure that now playing is at the current volume.
     */
    fun assertNowPlayingVolume() {
        nowPlaying.volume = musicVolume
    }

    // ==================================================
    //#endregion Volume API
    //#region Audio triggers api
    // ==================================================

    /**
     * Audible sound (music) for the this application's main menu.
     */
    @JvmStatic
    fun playMainMenu() {
        if (nowPlaying == MUSIC_MAIN_MENU && nowPlaying.isPlaying)
            return
        playOnLoop(MUSIC_MAIN_MENU)
    }

    /**
     * Plays a new instance of {@link com.shinkson47.SplashX6.utility.Assets#SFX_BUTTON} at {@link AudioController#buttonVolume}
     *
     * @return the ID of the new clip. If muted, returns -1 with no effect.
     */
    fun playButtonSound(): Long = if (isMuted) -1
    else SFX_BUTTON.play(buttonVolume)

    // ==================================================
    //#endregion Audio triggers api
    //#region Music controls
    // ==================================================

    /**
     * Performs {@link Music#stop()} on now playing
     */
    @Synchronized
    fun stopMusic() {
        nowPlaying.stop()
    }

    /**
     * Performs {@link Music#pause()} ()} on now playing
     */
    @Synchronized
    fun pauseMusic() {
        nowPlaying.pause()
    }

    /**
     * Performs {@link Music#play()} ()} on now playing
     */
    @Synchronized
    fun resumeMusic() {
        if (!isMuted)
            nowPlaying.play()
    }

    /**
     * Skips the currently playing song in this application, playing the next song in the playlist.
     */
    @JvmStatic
    fun nextSong() {
        play(currentPlaylist?.next())
    }

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
        if (!isMuted) {
            music.setLooping(true)
            play(music)
        }
        return music
    }

    /**
     * <h2>Actually plays some music.</h2>
     * Stops nowPlaying, plays m at current volume, and sets nowPlaying to m
     *
     * @param m The music to play.
     * @return nowPlaying pointer.
     */
    fun play(music: Music?): Music {
        if (music == null)
            return nowPlaying

        stopMusic()               // Stop now playing
        nowPlaying = music         // Swap to new music
        assertNowPlayingVolume()   // Make sure new music is at right volume
        resumeMusic()              // The play it.
        return nowPlaying
    }

    /**
     * Accepts a GamePlaylist object to be instantiated and played throughout the game.
     *
     * @param playlist The playlist to be played in the game.
     * @return Plays the first song at index 0 in the chosen playlist.
     */
    @JvmStatic
    fun playPlaylist(playlist: GamePlaylist): Music {
        currentPlaylist = playlist
        return play(playlist.reset())
    }

    /**
     * Resets the playlists index to 0.
     */
    fun resetPlaylist() {
        play(currentPlaylist?.reset())
    }
}