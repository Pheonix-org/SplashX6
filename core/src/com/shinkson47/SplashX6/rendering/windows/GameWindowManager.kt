package com.shinkson47.SplashX6.rendering.windows

import com.badlogic.gdx.scenes.scene2d.ui.SelectBox
import com.badlogic.gdx.utils.Array
import com.shinkson47.SplashX6.game.GameHypervisor
import com.shinkson47.SplashX6.rendering.StageWindow
import com.shinkson47.SplashX6.rendering.windows.game.Music
import com.shinkson47.SplashX6.rendering.windows.game.Spotify
import com.shinkson47.SplashX6.rendering.windows.game.units.W_UnitsList
import com.shinkson47.SplashX6.utility.Assets.SKIN

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
    @JvmStatic private var currentWindow: StageWindow? = null

    /**
     * # The dock window that's used to access [GAME_WINDOWS]
     */
    @JvmStatic val WINDOW_DOCK : SelectBox<StageWindow> = SelectBox(SKIN)
    init {
        with (WINDOW_DOCK) {
            setPosition(0f, 0f)
            addListener(StageWindow.LambdaChangeListener {
                    select(selected)
            })
        }
    }

    /**
     * # Adds a [StageWindow] to the dock for the user to use in-game.
     * Automatically  places the window onto the in-game HUD stage.
     */
    @JvmStatic fun add(sw: StageWindow) {
        GameHypervisor.gameRenderer!!.hudStage.addActor(sw)
        sw.isVisible = false
        sw.dontClose()

        sw.setPosition(0f,0f)

        GAME_WINDOWS.add(sw)
        update()
    }

    /**
     * Adds a Stage window to the game screen.
     */
    fun postWindow(sw : StageWindow) = GameHypervisor.gameRenderer!!.hudStage.addActor(sw)

    /**
     * # Instantiates all game windows.
     * As a part of the post game load stage, creates all game windows.
     */
    fun create() {
        //GameHypervisor.gameRenderer!!.menu.add(WINDOW_DOCK)


        add(W_UnitsList())

        // Try loading spotify, if successful then add spotify window to game.
        // Otherwise user must connect in preferences first.
        if (com.shinkson47.SplashX6.audio.Spotify.createFromExisting())
            add(Spotify())
        add(Music());
    }

    fun update () {
        WINDOW_DOCK.items = GAME_WINDOWS
    }

    private fun toggleCurrent() {
        currentWindow?.let { currentWindow!!.toggleShown() }
    }

    /**
     * Clears [GAME_WINDOWS]
     */
    fun dispose() {
        GAME_WINDOWS.clear()
    }

    fun select(i: Int) {
        if (i <= WINDOW_DOCK.list.items.size - 1)
        select(WINDOW_DOCK.list.items[i])
    }


    fun select(it : StageWindow) {

        if (currentWindow == it) {
            toggleCurrent()
            return
        }

        currentWindow?.isVisible = false
        currentWindow = it
        toggleCurrent()
    }
}