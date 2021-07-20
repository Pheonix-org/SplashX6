package com.shinkson47.SplashX6.audio;

import com.badlogic.gdx.audio.Music;
import java.util.ArrayList;
import static com.shinkson47.SplashX6.utility.Assets.*;
import static com.shinkson47.SplashX6.utility.Utility.IncrementClampBoundary;

// TODO- JAVADOC, TIDY CLASS

/**
 *
 * <h1>Basic In-game Music (temporary)</h1>
 *
 * <i>This is the default (temporary) media player/playlist for this application. Later development of this class
 * will enable a user to have more control and selection of the in-game music.
 *
 * This media player provides a basic playlist of songs for the user to listen to whilst playing Splash</i>
 * @author Dylan Brand
 */
public class GamePlaylist {

    // Fields
    private final ArrayList<Music> PLAYLIST = new ArrayList<>();
    private int index;

    // Constructor
    /**
     * Adds all song's to this playlist. *TEMPORARY*
     */
    public GamePlaylist() {
        PLAYLIST.add(GAME_DEFAULT);
        PLAYLIST.add(TRACK_ONE);
        PLAYLIST.add(TRACK_TWO);
        PLAYLIST.add(TRACK_THREE);
        PLAYLIST.add(TRACK_FOUR);
        PLAYLIST.add(TRACK_FIVE);
        //TODO - Dynamically load tracks from file
    }

    // Methods
    /**
     * Returns the currently playing song.
     *
     * @return The index of the current song.
     */
    public Music getCurrentSong() {
        return PLAYLIST.get(index);
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

    //TODO - previous method

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

//TODO - Further Development

//        if (!nowPlaying.isPlaying()) {
//            try {
//                nowPlaying.setOnCompletionListener(music -> {
//                    index++;
//                    play(playlist.get(index));
//                });
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
