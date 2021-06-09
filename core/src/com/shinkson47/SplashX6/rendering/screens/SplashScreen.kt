package com.shinkson47.SplashX6.rendering.screens

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.ScreenAdapter
import com.badlogic.gdx.graphics.g2d.Animation
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

    private val batch = SpriteBatch()
    private val bg = Animation(0.06f, Assets.splashBG.regions, Animation.PlayMode.LOOP)

    init {
        AudioController.playMainMenu()
        renderBG = false
        font.setColor(1f,1f,1f,1f)
        lines = Assets.SPLASH_TEXT.split("\n")

    }

    override fun render(delta: Float) {
        batch.begin()
            batch.draw(bg.getKeyFrame(currentTime), (Gdx.graphics.width.toFloat() * 0.5f) - (560 * 0.5f), (Gdx.graphics.height.toFloat() * 0.5f) - (560 * 0.5f), 560f, 560f)
        batch.end()

        super.render(delta)

        currentTime += delta
        if (currentTime >= time) Client.client!!.fadeScreen(MainMenu())
    }
}