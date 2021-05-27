package com.shinkson47.SplashX6.game.audio;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Sound;

public class AudioController {
    // Fields
    private static Sound mainMenu = Gdx.audio.newSound(Gdx.files.internal("sounds/MainMenu/night_theme_2.wav"));
    private static Sound buttonSound = Gdx.audio.newSound(Gdx.files.internal("sounds/Game/e_turn_bell-9743.ogg"));

    // Constructors


    // Methods
    public static synchronized void playButttonSound() {
        // TODO - CHANGE SOUND?
        buttonSound.play();
    }

    public static synchronized void playMainMenu() {
        mainMenu.play(0.1f);
        mainMenu.loop(0.1f);
    }
}
