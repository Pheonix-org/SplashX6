package com.shinkson47.SplashX6.rendering.screens

import com.badlogic.gdx.ScreenAdapter
import com.shinkson47.SplashX6.utility.Assets
import com.badlogic.gdx.Gdx
import com.badlogic.gdx.math.MathUtils
import com.badlogic.gdx.scenes.scene2d.InputEvent
import com.badlogic.gdx.scenes.scene2d.Stage
import com.badlogic.gdx.scenes.scene2d.ui.*
import com.shinkson47.SplashX6.game.GameHypervisor.Companion.NewGame
import com.shinkson47.SplashX6.input.mouse.MouseHandler
import com.shinkson47.SplashX6.rendering.StageWindow
import com.shinkson47.SplashX6.utility.Utility
import com.shinkson47.SplashX6.utility.Utility.local

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

    private val stage = Stage()

    //#region listeners
    private var menuWindow: Window? = null

    /**
     * The window shown at the main menu that contains option for the user
     */
    private inner class MainMenuWindow : StageWindow() {
        /**
         * <h2>Constructs the content to be displayed in this window</h2>
         */
        override fun constructContent() {

            // Title label
            add(
                Label(
"""
   _____ ____  __    ___   _____ __  __        _____
  / ___// __ \/ /   /   | / ___// / / /  _  __/ ___/
  \__ \/ /_/ / /   / /| | \__ \/ /_/ /  | |/_/ __ \ 
 ___/ / ____/ /___/ ___ |___/ / __  /  _>  </ /_/ / 
/____/_/   /_____/_/  |_/____/_/ /_/  /_/|_|\____/  
""", Assets.SKIN
                )
            )
                .padBottom(100f)
                .row()
            addButton(local("newGame")) { NewGame() }
            addButton(local("loadGame")) { Utility.notImplementedDialog(stage) }
            addButton(local("preferences")) { stage.addActor(OptionsScreen()) }
            addButton(local("credits")) { Utility.notImplementedDialog(stage) }
            addButton(local("exitGame")) { Gdx.app.exit() }
        }
    }

    //#region operations
    override fun render(delta: Float) {
        stage.act()
        stage.draw()
    }

    override fun resize(width: Int, height: Int) {
        super.resize(width, height)
        menuWindow!!.setPosition(
            makeEven(width / 2 - menuWindow!!.width / 2).toFloat(),
            makeEven(height / 2 - menuWindow!!.height / 2).toFloat()
        )
        //stage.setViewport(viewport);
    }

    private fun makeEven(f: Float): Int {
        return 2 * Math.round(f / 2)
    }

    override fun show() {
        super.show()
    }

    override fun hide() {
        super.hide()
    }

    override fun dispose() {
        super.dispose()
    } //#endregion operations

    //#endregion
    init {
        menuWindow = MainMenuWindow()

        // Table that fills the window, contains content under the menu window.
        var BaseTable = Table().center()
        BaseTable.setFillParent(true)

        // Secret button
        val SecretButton: Button = TextButton("SECRET", Assets.SKIN)
        SecretButton.addListener(StageWindow.LambdaClickListener { o: InputEvent? ->
            Gdx.gl.glClearColor(
                MathUtils.random.nextFloat(),
                MathUtils.random.nextFloat(),
                MathUtils.random.nextFloat(),
                1f
            )
        })
        BaseTable.add(SecretButton).center()
        stage.addActor(BaseTable)
        BaseTable = Table().bottom()
        BaseTable.setFillParent(true)
        BaseTable.add(Label("BY DYLAN BRAND & JORDAN GRAY. COPR 2021 HTTPS://SHINKSON47.IN", Assets.SKIN))
            .fill()
            .padBottom(10f)

        // Set up window to with as glfw environment
        resize(Gdx.graphics.width, Gdx.graphics.height)
        stage.addActor(BaseTable)
        stage.addActor(menuWindow)

        // Set the stage to handle key and mouse input
        MouseHandler.configureGameInput(stage)
    }
}