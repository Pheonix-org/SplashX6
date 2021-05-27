package com.shinkson47.SplashX6.game;

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


    // Methods
    public static synchronized void playButttonSound() {
        // TODO - CHANGE SOUND?
        SFX_GUI.play();
    }

    public static synchronized void playMainMenu() {
        MUSIC_MAIN_MENU.play(0.1f);
        MUSIC_MAIN_MENU.loop(0.1f);
    }
}
