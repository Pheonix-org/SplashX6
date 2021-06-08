package com.shinkson47.SplashX6.rendering.screens

import com.badlogic.gdx.ScreenAdapter
import com.badlogic.gdx.graphics.g2d.BitmapFont
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.dmugang.screens.CreditsScreen
import com.shinkson47.SplashX6.Client
import com.shinkson47.SplashX6.game.AudioController
import com.shinkson47.SplashX6.utility.Assets
import com.shinkson47.SplashX6.utility.Assets.SKIN

/**
 * # Extends and modifies the credits screen to show splash screen text.
 * @author [Jordan T. Gray](https://www.shinkson47.in) on 08/06/2021
 * @since v1
 * @version 1
 */
class SplashScreen : CreditsScreen() {

    val time = 5.4f
    @Volatile var currentTime = 0f

    init {
        AudioController.playMainMenu();
        renderBG = false
        font = SKIN.getFont("White")
        lines = Assets.SPLASH_TEXT.split("\n")
    }


    override fun render(delta: Float) {
        super.render(delta)
        currentTime += delta
        if (currentTime >= time) Client.client!!.screen = MainMenu()
    }
}