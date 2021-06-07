package com.shinkson47.SplashX6.rendering.windows

import com.badlogic.gdx.scenes.scene2d.ui.List
import com.badlogic.gdx.utils.Array
import com.shinkson47.SplashX6.game.GameHypervisor
import com.shinkson47.SplashX6.rendering.StageWindow
import com.shinkson47.SplashX6.rendering.windows.gameutils.units
import com.shinkson47.SplashX6.utility.Assets

/**
 * # Utility that manages tool windows within the game screen
 * The aim is that the user has some way to better manage and access all the
 * game tool windows.
 * @author [Jordan T. Gray](https://www.shinkson47.in) on 04/06/2021
 * @since PRE-ALPHA 0.0.2
 * @version 1
 */
object GameWindowManager {

    /**
     * # All windows that have been created for use in game.
     */
    @JvmStatic private val GAME_WINDOWS: Array<StageWindow> = Array()

    /**
     * # The dock window that's used to access [GAME_WINDOWS]
     */
    @JvmStatic val WINDOW_DOCK : windowDock = windowDock()
    init { WINDOW_DOCK.setPosition(0f, 0f) }

    /**
     * # Adds a [StageWindow] to the dock for the user to use in-game.
     * Automatically  places the window onto the in-game HUD stage.
     */
    @JvmStatic fun add(sw: StageWindow) {
        GameHypervisor.gameRenderer!!.hudStage.addActor(sw)
        sw.isVisible = false
        sw.dontClose()
        GAME_WINDOWS.add(sw)
        WINDOW_DOCK.update()
    }

    /**
     * # Instantiates all game windows.
     * As a part of the post game load stage, creates all game windows.
     */
    fun create() {
        add(units())
    }

    /**
     * Destroys all windows.
     */
    fun dispose() {
        GAME_WINDOWS.clear()
    }


    /**
     * # A window that is used to access in-game windows.
     */
    class windowDock : StageWindow() {
        private lateinit var list: List<StageWindow>

        override fun constructContent() {
            isMovable = false

            list = List(Assets.SKIN)
            addList(list, "ttWindowDock")

            addListener(LambdaClickListener { list.selected.toggleShown() })

            update()
        }

        fun update() {
            list.setItems(GAME_WINDOWS)
            pack()
        }
    }
}