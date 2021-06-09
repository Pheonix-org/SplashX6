package com.shinkson47.SplashX6.rendering.screens

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.ScreenAdapter
import com.badlogic.gdx.graphics.Color
import com.badlogic.gdx.graphics.g2d.Animation
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.scenes.scene2d.Stage
import com.badlogic.gdx.scenes.scene2d.ui.*
import com.badlogic.gdx.utils.viewport.ExtendViewport
import com.dmugang.screens.CreditsScreen
import com.shinkson47.SplashX6.Client.Companion.client
import com.shinkson47.SplashX6.game.AudioController
import com.shinkson47.SplashX6.game.GameHypervisor.Companion.NewGame
import com.shinkson47.SplashX6.input.mouse.MouseHandler
import com.shinkson47.SplashX6.rendering.StageWindow
import com.shinkson47.SplashX6.rendering.windows.OptionsWindow
import com.shinkson47.SplashX6.utility.Assets
import com.shinkson47.SplashX6.utility.Assets.SKIN
import com.shinkson47.SplashX6.utility.Utility

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
class MainMenu : ScreenAdapter() {

    private val stage = Stage(ExtendViewport(Gdx.graphics.width.toFloat(), Gdx.graphics.height.toFloat()))
    private var menuWindow: Window? = null
    private val batch = SpriteBatch()
    private val bg = Animation(0.03f, Assets.menuBG.regions, Animation.PlayMode.LOOP)
    @Volatile private var animationStateTime = 0f


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
            addButton("preferences") { stage.addActor(OptionsWindow()) }
            addButton("credits") { client!!.fadeScreen(CreditsScreen()) }
            addButton("exitGame") { Gdx.app.exit() }

            isMovable = false
            isResizable = false
        }
    }

    //#region operations
    override fun render(delta: Float) {
        animationStateTime += delta

        batch.begin()
            batch.draw(bg.getKeyFrame(animationStateTime), 0f, 0f, Gdx.graphics.width.toFloat(), Gdx.graphics.height.toFloat())
        batch.end()

        stage.act()
        stage.draw()
    }

    override fun resize(width: Int, height: Int) {
        super.resize(width, height)
        stage.viewport.update(width, height)
        menuWindow!!.setPosition(
            makeEven(width / 2 - menuWindow!!.width / 2).toFloat(),
            makeEven(height / 2 - menuWindow!!.height / 2).toFloat()
        )
        //stage.setViewport(viewport);
    }

    private fun makeEven(f: Float): Int {
        return 2 * Math.round(f / 2)
    }


    init {
        menuWindow = MainMenuWindow()
        resize(Gdx.graphics.width, Gdx.graphics.height)

        stage.addActor(menuWindow)

        // Set the stage to handle key and mouse input
        MouseHandler.configureGameInput(stage)
        AudioController.playMainMenu();
    }
}