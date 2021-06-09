package com.shinkson47.SplashX6.rendering.windows

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.scenes.scene2d.ui.Cell
import com.badlogic.gdx.scenes.scene2d.ui.Table
import com.shinkson47.SplashX6.rendering.StageWindow
import com.shinkson47.SplashX6.rendering.windows.optionspanes.AudioTab
import com.shinkson47.SplashX6.rendering.windows.optionspanes.GameTab
import com.shinkson47.SplashX6.rendering.windows.optionspanes.GraphicsTab

/**
 * # A collection of tabs that provide configurable options to the user.
 * @author [Jordan T. Gray](https://www.shinkson47.in) on 09/06/2021
 * @since PRE-ALPHA
 * @version 2
 */
class OptionsWindow : StageWindow("PREFERENCES") {

    /**
     * Tab windows
     */
    private val GAME_OPTION_TAB: Table = GameTab(this)
    private val GRAPHICS_OPTION_TAB: Table = GraphicsTab(this)
    private val SOUND_OPTION_TAB: Table = AudioTab()

    /**
     * <h2>Constructs the content to be displayed in this window</h2>
     */
    override fun constructContent() {
        if (FIRST_CONSTRUCTION) return  // We need access to the tabs stored at class level. Skip super construction.
        val contentCell = add()

        tabs(
            contentCell,

            listOf(
                GAME_OPTION_TAB,
                SOUND_OPTION_TAB,
                GRAPHICS_OPTION_TAB
            ),

            listOf(
                "game",
                "sound",
                "graphics",
                "advanced"
            )
        )

        setPosition(100f, 100f)
        setSize((Gdx.graphics.width - 200).toFloat(), (Gdx.graphics.height - 200).toFloat())
    }

    init {
        constructContent()
    }
}