package com.shinkson47.SplashX6.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.shinkson47.SplashX6.rendering.StageWindow;
import static com.shinkson47.SplashX6.utility.Assets.*;

// TODO abstract play / stop logic

/*
 * TODO - EVERYTHING HERE
 * --- Rectify audio fields play issue
 * --- Implement unused methods?
 * --- Tidy Class + Javadoc
 */
public class AudioController {
    public final static ClickListener GUI_SOUND = new StageWindow.LambdaClickListener(o -> AudioController.playButtonSound());
    private static float musicVolume = 0.2f; // DEFAULT VOLUME
    private static float buttonVolume = 0.8f; // DEFAULT VOLUME


    // ==================================================
    //#region Fields
    // ==================================================

    /**
     * Audible sound (music) for the this application's main menu.
     */
    public static synchronized void playMainMenu() { // TODO - CURRENTLY UNUSED???
        MUSIC_MAIN_MENU.play(musicVolume);
        MUSIC_MAIN_MENU.loop(musicVolume);
    }

    /**
     * An audible alert that is played when a button is clicked.
     */
    public static synchronized void playButtonSound() {
        SFX_BUTTON.play(buttonVolume);
    }

    /**
     * Mutes the volume of ALL audio in this application.
     */
    public static synchronized void muteAudio() { // TODO - CURRENTLY NOT IMPLEMENTED
        Gdx.audio.newSound()
        MUSIC_MAIN_MENU.setVolume(menuAudio, 0.0f);
        SFX_BUTTON.setVolume(buttonAudio, 0.0f);



    // ==================================================
    //#region Fields
    //#region Volume API
    // ==================================================


    }

    /**
     * Un-Mutes the volume of ALL audio in this application.
     */
    public static synchronized void unmuteAudio() { // TODO - CURRENTLY NOT IMPLEMENTED
        MUSIC_MAIN_MENU.setVolume(menuAudio,musicVolume);
        SFX_BUTTON.setVolume(buttonAudio, buttonVolume);
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
        MUSIC_MAIN_MENU.setVolume(menuAudio, musicVolume);
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
        SFX_BUTTON.setVolume(buttonAudio, buttonVolume);


    // ==================================================
    //#region Volume API
    //#region Audio triggers api
    // ==================================================



    }



    // ==================================================
    //#region Volume API
    //#region Music controls
    // ==================================================


    /**
     * Pauses all music in this application.


    // ==================================================
    //#region Music controls
    //#region Music utilities
    // ==================================================


     */
    public static synchronized void stopMusic() { // TODO - CURRENTLY NOT IMPLEMENTED
        MUSIC_MAIN_MENU.pause();
        // TODO - IN_GAME_MUSIC
    }

    /**
     * Resumes all music in this application.
     */
    public static synchronized void resumeMusic() { // TODO - CURRENTLY NOT IMPLEMENTED
        MUSIC_MAIN_MENU.resume();
        // TODO - IN_GAME_MUSIC
    }
}
