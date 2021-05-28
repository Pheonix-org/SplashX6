package com.shinkson47.SplashX6.game;

import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.shinkson47.SplashX6.rendering.StageWindow;
import static com.shinkson47.SplashX6.utility.Assets.*;

// TODO abstract play / stop logic

/*
 * TODO - EVERYTHING HERE
 * --- Make the options screen save the slider value, and not reset the slider once the options screen is closed
 * --- Rectify audio fields play issue
 * --- Implement unused methods
 */
public class AudioController {
    // Fields
    public final static ClickListener GUI_SOUND = new StageWindow.LambdaClickListener(o -> AudioController.playButtonSound());
    private static float musicVolume = 0.2f; // DEFAULT VOLUME
    private static float buttonVolume = 1.0f; // DEFAULT VOLUME

    /*
     * TODO - FURTHER DEVELOPMENT HERE
     * These fields play the sounds upon start up, including the button sound (although a button has not been clicked)
     *
     * These fields arent called anywhere but still play the sounds. Bad implementation?
     */
    private static long menuAudio = MUSIC_MAIN_MENU.play(musicVolume);
    private static long buttonAudio = SFX_BUTTON.play(buttonVolume);

    // Methods
    /**
     * Audible sound (music) for the this application's main menu.
     */
    public static synchronized void playMainMenu() {
        MUSIC_MAIN_MENU.play(0.2f);
        MUSIC_MAIN_MENU.loop(0.2f);
    }

    /**
     * An audible alert that is played when a button is clicked.
     */
    public static synchronized void playButtonSound() {
        SFX_BUTTON.play(buttonVolume);
    }

    /**
     * Mutes the volume of ALL audio.
     */
    public static synchronized void muteAllAudio() { // TODO - CURRENTLY NOT IMPLEMENTED
        MUSIC_MAIN_MENU.setVolume(menuAudio, 0.0f);
        SFX_BUTTON.setVolume(buttonAudio, 0.0f);
    }

    /**
     * Pauses all music in this application.
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

    /**
     *
     * @param volume
     */
    public static synchronized void setMusicVolume(float volume) {
        MUSIC_MAIN_MENU.setVolume(menuAudio, volume);
    }

    /**
     *
     * @param volume
     */
    public static synchronized void setSFXVolume(float volume) {
        SFX_BUTTON.setVolume(buttonAudio, volume);
    }
}
