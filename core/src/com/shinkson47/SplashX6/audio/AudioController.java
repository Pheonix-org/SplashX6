package com.shinkson47.SplashX6.audio;


import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.shinkson47.SplashX6.rendering.StageWindow;
import org.jetbrains.annotations.NotNull;
import static com.shinkson47.SplashX6.utility.Assets.*;

/*
 * TODO - EVERYTHING HERE
 * --- Rectify audio fields play issue
 * --- Implement unused methods?
 * --- Tidy Class + Javadoc
 */

/**
 * <h1>Audio Controller</h1>
 *
 * @author Dylan Brand, Jordan Gray
 * @since PRE-ALPHA 0.0.1
 */
public class AudioController {


    // ==================================================
    //#region Fields
    // ==================================================

    /**
     * <h2>The current volume levels</h2>
     */
    private static float
            musicVolume = 0.2f,
            buttonVolume = 0.2f; // DEFAULT VOLUME

    /**
     * <h2>Determines if audio should be played, or not.</h2>
     */
    private static boolean isMuted = false;

    /**
     * <h2>Listener placed on GUI elements to play a sound when interacted with.</h2>
     */
    public final static ClickListener GUI_SOUND = new StageWindow.LambdaClickListener(o -> {
        AudioController.playButtonSound();
    });

    /**
     * <h2>Pointer to the music resource that we are currently playing.</h2>
     * Should never be null.
     */
    protected static Music nowPlaying = MUSIC_MAIN_MENU;

    /**
     * The currently chosen GamePlaylist for this applications in-game soundtrack.
     */
    private static GamePlaylist currentPlaylist;
    // ==================================================
    //#endregion Fields
    //#region Volume API
    // ==================================================


    /**
     * Stops now playing and prevents more music from being played.
     */
    public static synchronized void muteAudio() {
        pauseMusic();
        isMuted = true;
    }

    /**
     * Un-Mutes the volume of ALL audio in this application.
     */
    public static synchronized void unmuteAudio() {
        isMuted = false;
        resumeMusic();
    }

    /**
     *
     * @param mute
     */
    public static void setMute(boolean mute) {
        if (mute)
            muteAudio();
        else
            unmuteAudio();
    }


    /**
     * Returns a float value, indicating the current volume of all music.
     *
     * @return The music's volume.
     */
    public static synchronized float getMusicVolume() {
        return musicVolume;
    }

    /**
     * Sets the volume of this applications music.
     *
     * @param volume Float value to set the music volume.
     */
    public static synchronized void setMusicVolume(float volume) {
        musicVolume = volume;
        assertNowPlayingVolume();
    }

    /**
     * Makes sure that now playing is at the current volume.
     */
    private static void assertNowPlayingVolume() {
        nowPlaying.setVolume(musicVolume);
    }

    /**
     * Returns a float value, indicating the current volume of all sound effects.
     *
     * @return The sound effect's volume.
     */
    public static synchronized float getSFXVolume() {
        return buttonVolume;
    }

    /**
     * Sets the volume of this applications sound effect's.
     *
     * @param volume Float value to set the sound effect volume.
     */
    public static synchronized void setSFXVolume(float volume) {
        buttonVolume = volume;
    }


    // ==================================================
    //#endregion Volume API
    //#region Audio triggers api
    // ==================================================

    /**
     * Audible sound (music) for the this application's main menu.
     */
    public static synchronized void playMainMenu() {
        if (nowPlaying == MUSIC_MAIN_MENU && nowPlaying.isPlaying()) return;
        playOnLoop(MUSIC_MAIN_MENU);
    }

    public static void playGame() {
        playOnLoop(GAME_DEFAULT);
    }

    /**
     * Plays a new instance of {@link com.shinkson47.SplashX6.utility.Assets#SFX_BUTTON} at {@link AudioController#buttonVolume}
     *
     * @return the ID of the new clip. If muted, returns -1 with no effect.
     */
    public static synchronized long playButtonSound() {
        if (isMuted) return -1;
        return SFX_BUTTON.play(buttonVolume);
    }

    // ==================================================
    //#endregion Audio triggers api
    //#region Music controls
    // ==================================================

    /**
     * Performs {@link Music#stop()} on now playing
     */
    public static synchronized void stopMusic() {
        nowPlaying.stop();
    }

    /**
     * Performs {@link Music#pause()} ()} on now playing
     */
    public static synchronized void pauseMusic() {
        nowPlaying.pause();
    }

    /**
     * Performs {@link Music#play()} ()} on now playing
     */
    public static synchronized void resumeMusic() {
        if (!isMuted) nowPlaying.play();
    }

    /**
     *
     */
    public static synchronized void resetPlaylist() {
        play(currentPlaylist.reset());
    }

    /**
     * Skips the currently playing song in this application.
     *
     * If
     * This only if a playlist is currently being played.
     */
    public static void nextSong() {
        if (currentPlaylist != null)
            play(currentPlaylist.next());
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
    protected static Music playOnLoop(Music m) {
        if (!isMuted) {
            m.setLooping(true);
            play(m);
        }
        return m;
    }

    /**
     * <h2>Actually plays some music.</h2>
     * Stops nowPlaying, plays m at current volume, and sets nowPlaying to m
     *
     * @param m The music to play.
     * @return nowPlaying pointer.
     */
    public static Music play(@NotNull Music m) {
        stopMusic();               // Stop now playing
        nowPlaying = m;             // Swap to new music
        assertNowPlayingVolume();   // Make sure new music is at right volume
        resumeMusic();              // The play it.
        return nowPlaying;
    }

    /**
     * Accepts a GamePlaylist object to be instantiated and played throughout the game.
     *
     * @param playlist The playlist to be played in the game.
     * @return Plays the first song at index 0 in the chosen playlist.
     */
    public static Music playPlaylist(GamePlaylist playlist) {
        currentPlaylist = playlist;

        return play(playlist.reset()); // Resets the index to 0, and plays the song at that index in the playlist.
    }
    // ==================================================
    //#endregion Music utilities
    //#region other
    // ==================================================

    /**
     * @return pointer to the music resource that's currently being played.
     */
    public static Music getNowPlaying() {
        return nowPlaying;
    }

    /**
     * Returns a Boolean value, indicating whether all audio in the application is currently muted.
     *
     * @return Boolean value, indicating whether the audio is currently muted.
     */
    public static boolean isMuted() {
        return isMuted;
    }
}