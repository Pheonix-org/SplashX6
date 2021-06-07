package com.shinkson47.SplashX6.rendering

import com.badlogic.gdx.scenes.scene2d.ui.List
import com.badlogic.gdx.utils.Array
import com.shinkson47.SplashX6.utility.Assets

/**
 * # Utility that manages tool windows within the game screen
 * The aim is that the user has some way to better manage and access all the
 * game tool windows.
 * @author [Jordan T. Gray](https://www.shinkson47.in) on 04/06/2021
 * @since PRE-ALPHA 0.0.2
 * @version 1
 */
class GameWindowManager : StageWindow() {

    companion object {
        @JvmStatic private val GAME_WINDOWS: Array<StageWindow> = Array()
        @JvmStatic val WINDOW_DOCK : GameWindowManager = GameWindowManager();


        @JvmStatic fun add(sw: StageWindow) {
            GAME_WINDOWS.add(sw)
            WINDOW_DOCK.update()
        }
    }


    private var list : List<StageWindow>? = null;

    override fun constructContent() {
        list = List(Assets.SKIN)
        GAME_WINDOWS.clear()
        addList(list, "ttWindowDock")
        update()
    }

    fun update() {
        list!!.setItems(GAME_WINDOWS)
        pack()
    }
}