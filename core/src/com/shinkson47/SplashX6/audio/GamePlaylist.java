package com.shinkson47.SplashX6.audio;

import com.badlogic.gdx.audio.Music;
import static com.shinkson47.SplashX6.audio.AudioController.nextSong;
import static com.shinkson47.SplashX6.utility.Assets.*;
import static com.shinkson47.SplashX6.utility.Utility.DecrementClampBoundary;
import static com.shinkson47.SplashX6.utility.Utility.IncrementClampBoundary;
import java.util.ArrayList;

/**
 * <h1>Basic in-game Music player (temporary)</h1>
 *
 * This is the default media player/playlist for this application. Later development of this class
 * will enable a user to have more control and selection of the in-game music.
 *
 * This media player provides a basic playlist of songs for the user to listen to whilst playing Splash.
 *
 * @author Jordan Gray
 * @version 1.0
 * @since PRE-ALPHA 0.0.2
 */
public class GamePlaylist {

    // Fields
    private final ArrayList<Music> PLAYLIST;
    private int index;

    // Constructor
    /**
     * Dynamically populates this GamePlaylist with Music files at {@link com.shinkson47.SplashX6.utility.Assets#SONGS}
     */
    public GamePlaylist() {
        // Dynamically populates the ArrayList.
        PLAYLIST = SONGS;
    }

    // Methods
    /**
     * Returns the currently playing song.
     *
     * @return The index of the current song.
     */
    public Music getCurrentSong() {
        final Music PLAYING = PLAYLIST.get(index);
        PLAYING.setOnCompletionListener(music -> nextSong());

        return PLAYING;
    }

    /**
     * Skips the currently playing song within the playlist. If the current song is the last song in the playlist,
     * the playlist's index is reset to 0 and the song at index 0 will be played.
     *
     * @return The currently playing song.
     */
    public Music next() {
        index = IncrementClampBoundary(index, 0, PLAYLIST.size()-1);
        return getCurrentSong();
    }

    /**
     * Plays the previous song in the playlist
     *
     * @return The currently playing song.
     */
    public Music previous() {
        index = DecrementClampBoundary(index, PLAYLIST.size()-1, 0);
        return getCurrentSong();
    }

    /**
     * Resets the playlist's index to 0.
     *
     * @return The currently playing song.
     */
    public Music reset() {
        index = 0;
        return getCurrentSong();
    }
}
