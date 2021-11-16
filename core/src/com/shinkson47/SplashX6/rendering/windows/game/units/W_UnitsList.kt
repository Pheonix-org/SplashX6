package com.shinkson47.SplashX6.rendering.windows.game.units

import com.badlogic.gdx.scenes.scene2d.ui.List
import com.shinkson47.SplashX6.game.GameData
import com.shinkson47.SplashX6.game.GameHypervisor
import com.shinkson47.SplashX6.game.units.Unit
import com.shinkson47.SplashX6.rendering.StageWindow
import com.shinkson47.SplashX6.rendering.windows.GameWindowManager
import com.shinkson47.SplashX6.utility.Assets

/**
 * # Displays a list of all units in a civilisation.
 * @author [Jordan T. Gray](https://www.shinkson47.in) on 20/05/2021
 * @since v1
 * @version 2
 */
class W_UnitsList : StageWindow("Units"){

    private val list: List<Unit> = List(Assets.SKIN)

    /**
     * A click listener for a list of units, that selects the unit clicked within the game engine.
     */
    private class SELECT_LISTENER(val list: List<Unit>) : LambdaClickListener({
        if (list.selected != null) {
        val selected = list.selected

        selected?.let {
            GameHypervisor.unit_select(it)
        }

        if (it.tapCount >= 2)
            StageWindow.post(W_Unit(selected))
    }})

   init {
        list.selection.required = false

        list.addListener(SELECT_LISTENER(list))
        add(list)
        // Buttons
        // TODO localise
        // TODO lots of repeating code here

        refresh()
    }

    override fun refresh() {
        list.setItems(*GameData.player!!.units.toTypedArray())
        pack()
    }

    //#endregion
}