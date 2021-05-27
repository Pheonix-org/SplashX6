package com.shinkson47.SplashX6.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.shinkson47.SplashX6.rendering.StageWindow;

import static com.shinkson47.SplashX6.utility.Assets.MUSIC_MAIN_MENU;
import static com.shinkson47.SplashX6.utility.Assets.SFX_GUI;

// TODO Javadocs
// TODO abstract play / stop logic
// TODO stop all
// TODO store and edit volume floats
public class AudioController {
    // Fields
    public final static ClickListener GUI_SOUND = new StageWindow.LambdaClickListener(o -> AudioController.playButttonSound());
    private static long menuAudio = MUSIC_MAIN_MENU.play();
    private static long buttonAudio = SFX_GUI.play();

    // Methods
    /**
     * <h2>An audible alert that is played when a button is clicked</h2>
     */
    public static synchronized void playButttonSound() {
        SFX_GUI.play(0.25f);
    }

    /**
     * <h2>Audible sound (music) for the this application's main menu</h2>
     */
    public static synchronized void playMainMenu() {
        MUSIC_MAIN_MENU.play(0.25f);
        MUSIC_MAIN_MENU.loop(0.25f);
    }

    // TODO - CURRENTLY NOT IMPLEMENTED
    /**
     * <h2>Mutes the volume of ALL audio</h2>
     */
    public static synchronized void muteAllAudio() {
        MUSIC_MAIN_MENU.setVolume(menuAudio, 0.0f);
        SFX_GUI.setVolume(buttonAudio, 0.0f);
    }

    /**
     *
     * @param volume
     */
    public static synchronized void setMusicVolume(float volume) {
        MUSIC_MAIN_MENU.setVolume(menuAudio, volume);
    }

    public static synchronized void setGameVolume(float volume) {
        SFX_GUI.setVolume(buttonAudio, volume);
    }
}
