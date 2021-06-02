package com.shinkson47.SplashX6

import com.badlogic.gdx.Game
import com.badlogic.gdx.Gdx
import com.badlogic.gdx.Screen
import com.badlogic.gdx.graphics.GL20
import com.shinkson47.SplashX6.input.keys.KeyHandler
import com.shinkson47.SplashX6.input.mouse.MouseHandler
import com.shinkson47.SplashX6.utility.Assets
import com.shinkson47.SplashX6.rendering.screens.MainMenu
import com.shinkson47.SplashX6.utility.Debug
import com.shinkson47.SplashX6.game.world.World

/**
 * # The main game
 * This is the entry point to Spalsh X6, and cascades LibGDX's api calls throughout
 * the game's classes.
 */
class Client : Game() {
    var currentScreen: Screen? = null

    /**
     * # The game has booted, create stuff
     */
    override fun create() {
        client = this
        isFullscreen = Gdx.graphics.isFullscreen
        Assets.Create()
        MouseHandler.create()
        MainMenu().let { setScreen(it) }

        Gdx.gl.glClearColor(r, g, b, a)
    }

    /**
     * # Framely engine update
     * Render, check for inputs, etc.
     */
    override fun render() {
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT)
        KeyHandler.Poll()
        MouseHandler.Poll()
        currentScreen?.render(Gdx.graphics.deltaTime)
        //Renderer.render();
        //AudioManager.Update();
        //Debug.update();
    }

    /**
     * # Engine requests game to close
     * Save, close
     */
    override fun dispose() {
        super.dispose()
        World.dispose()
        //AudioManager.dispose();
        Debug.dispose()
    }

    override fun setScreen(screen: Screen?) {
        screen?.let {
            super.setScreen(it)
            currentScreen = it
        }
    }

    companion object {
        const val r = 0.2588235294f
        const val g = 0.2588235294f
        const val b = 0.9058823529f
        const val a = 1f
        const val hr = 0.6470588235f
        const val hg = 0.6470588235f

        @JvmField
        var client: Client? = null

        var isFullscreen = false

		fun toggleFS() {
            if (isFullscreen) Gdx.graphics.setWindowedMode(
                Gdx.graphics.width,
                Gdx.graphics.height
            ) else Gdx.graphics.setFullscreenMode(Gdx.graphics.displayMode)
            isFullscreen = !isFullscreen
        }
    }
}