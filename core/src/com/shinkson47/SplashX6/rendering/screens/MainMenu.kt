package com.shinkson47.SplashX6.rendering.screens

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.graphics.Color
import com.badlogic.gdx.graphics.g2d.Animation
import com.badlogic.gdx.scenes.scene2d.ui.*
import com.shinkson47.SplashX6.Client.Companion.client
import com.shinkson47.SplashX6.audio.AudioController
import com.shinkson47.SplashX6.game.GameHypervisor.Companion.NewGame
import com.shinkson47.SplashX6.input.mouse.MouseHandler
import com.shinkson47.SplashX6.rendering.ScalingScreenAdapter
import com.shinkson47.SplashX6.rendering.StageWindow
import com.shinkson47.SplashX6.rendering.windows.OptionsWindow
import com.shinkson47.SplashX6.utility.Assets
import com.shinkson47.SplashX6.utility.Assets.SKIN
import com.shinkson47.SplashX6.utility.Utility
import kotlin.math.roundToInt

/**
 * <h1></h1>
 * <br></br>
 *
 *
 *
 *
 *
 * @author [Jordan T. Gray on 16/04/2021](https://www.shinkson47.in)
 * @version 1
 * @since v1
 */
class MainMenu : ScalingScreenAdapter() {

    //private val stage = Stage(ExtendViewport(Gdx.graphics.width.toFloat(), Gdx.graphics.height.toFloat()))
    private var menuWindow: Window? = null
    private val bg = Animation(0.03f, Assets.menuBG.regions, Animation.PlayMode.LOOP)
    @Volatile private var animationStateTime = 0f
    private val optionsWindow = OptionsWindow(this)


    /**
     * Sub class that encompasses the window shown at the main menu that contains option for the user
     */
    private inner class MainMenuWindow : StageWindow() {
        /**
         * <h2>Constructs the content to be displayed in this window</h2>
         */
        override fun constructContent() {
            // Title label
            add(Label("SPLASH X6", SKIN,"RetroNewVersion-Large", Color.BLACK))

                .row()

            add(
                Label("PRE-ALPHA 0.0.2 WIP", SKIN)
            ).padBottom(50f).row()

            addButton("newGame") { NewGame() }
            addButton("loadGame") { Utility.notImplementedDialog(stage) }
            addButton("preferences") { optionsWindow.isVisible = true; optionsWindow.toFront() }
            addButton("credits") { client!!.fadeScreen(CreditsScreen()) }
            addButton("exitGame") { Gdx.app.exit() }

            isMovable = false
            isResizable = false
        }
    }

    //#region operations
    override fun render(delta: Float) {
        animationStateTime += delta

        with (stage.batch) {
            begin()
                draw(bg.getKeyFrame(animationStateTime), 0f, 0f, width, height)
            end()
        }

        stage.act()
        stage.draw()
    }

    override fun doResize(width: Int, height: Int) {
        menuWindow!!.setPosition(
            makeEven((super.width  * 0.5f) - (menuWindow!!.width  * 0.5f)),
            makeEven((super.height * 0.5f) - (menuWindow!!.height * 0.5f))
        )
    }



    private fun makeEven(f: Float): Float {
        return (f / 2f).roundToInt() * 2f
    }


    init {
        menuWindow = MainMenuWindow()
        resize(width.toInt(), height.toInt())

        stage.addActor(menuWindow)
        stage.addActor(optionsWindow)

        // Set the stage to handle key and mouse input
        MouseHandler.configureGameInput(stage)
        AudioController.playMainMenu()

        optionsWindow.dontClose()
        optionsWindow.isVisible = false

    }
}