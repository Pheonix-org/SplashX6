package com.shinkson47.SplashX6

import com.badlogic.gdx.Game
import com.badlogic.gdx.Gdx
import com.badlogic.gdx.Graphics
import com.badlogic.gdx.Screen
import com.badlogic.gdx.graphics.GL20
import com.shinkson47.SplashX6.game.GameHypervisor
import com.shinkson47.SplashX6.input.keys.KeyHandler
import com.shinkson47.SplashX6.input.mouse.MouseHandler
import com.shinkson47.SplashX6.rendering.screens.ScreenTransistion
import com.shinkson47.SplashX6.utility.Assets
import com.shinkson47.SplashX6.utility.Debug
import com.shinkson47.SplashX6.rendering.screens.SplashScreen
import java.lang.Exception
import javax.imageio.ImageIO
import javax.swing.ImageIcon

import com.badlogic.gdx.files.FileHandle
import com.shinkson47.SplashX6.audio.AudioController
import com.shinkson47.SplashX6.rendering.screens.WorldCreation
import java.awt.Image


/**
 * # The main game
 * This is the entry point to Spalsh X6, and cascades LibGDX's api calls throughout
 * the game's classes.
 */
class Client : Game() {
    var currentScreen: Screen? = null



    /**
     * # Engine has booted, boot game.
     */
    override fun create() {
        displayMode = Gdx.graphics.displayMode
        client = this
        isFullscreen = Gdx.graphics.isFullscreen

        Assets.Create() // CALL BEFORE ANY ASSET ACCESS!
        setMacDockIcon()

        MouseHandler.create()

        if (DEBUG_MODE)
            debugStart()
        else
            setScreen(SplashScreen())

        Gdx.gl.glClearColor(r, g, b, a)
    }

    /**
     * Skips and configures things which annoy us when we're debugging.
     */
    private fun debugStart() {
        AudioController.muteAudio()
        setScreen(WorldCreation())
    }

    /**
     * When on mac, changes the dock icon.
     */
    private fun setMacDockIcon() {
        try {
            val cls = Class.forName("com.apple.eawt.Application")
            val application = cls.newInstance().javaClass.getMethod("getApplication").invoke(null)

            val icon = ImageIO.read(Gdx.files.local("sprites/icon.png").read())
            application.javaClass.getMethod("setDockIconImage", Image::class.java).invoke(application, icon)


        } catch (e: Exception) {
            e.printStackTrace()
            // nobody cares!
        }
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
    }

    /**
     * # Engine requests game to close
     * Save, close
     */
    override fun dispose() {
        super.dispose()
        GameHypervisor.dispose()
        //World.dispose()
        //AudioManager.dispose();
        Debug.dispose()
    }

    override fun setScreen(screen: Screen?) {
        screen?.let {
            super.setScreen(it)
            currentScreen = it
        }
    }

    fun fadeScreen(newScreen : Screen){
        setScreen(ScreenTransistion(getScreen(), newScreen))
    }

    fun resize() {
        super.resize(displayMode.width, displayMode.height)
    }

    companion object {

        const val r = 0f
        const val g = 0f
        const val b = 0f
        const val a = 1f
        const val hr = 0f
        const val hg = 0f

        @JvmStatic
        lateinit var displayMode: Graphics.DisplayMode

        @JvmField
        var DEBUG_MODE: Boolean = false

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