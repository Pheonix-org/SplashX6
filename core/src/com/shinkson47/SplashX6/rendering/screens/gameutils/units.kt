package com.shinkson47.SplashX6.rendering.screens.gameutils

import com.badlogic.gdx.scenes.scene2d.ui.List
import com.badlogic.gdx.scenes.scene2d.ui.ScrollPane
import com.badlogic.gdx.utils.Array
import com.shinkson47.SplashX6.game.GameData
import com.shinkson47.SplashX6.game.GameHypervisor
import com.shinkson47.SplashX6.game.units.Unit
import com.shinkson47.SplashX6.rendering.StageWindow
import com.shinkson47.SplashX6.utility.Assets
import java.util.function.Consumer

/**
 * # TODO
 * @author [Jordan T. Gray](https://www.shinkson47.in) on 20/05/2021
 * @since v1
 * @version 1
 */
class units : StageWindow("Units") {

    private val list: List<Unit> = List(Assets.SKIN)

    init { constructContent() }

    /**
     * <h2>Constructs the content to be displayed in this window</h2>
     */
    override fun constructContent() {
        if (FIRST_CONSTRUCTION) return;

        // Buttons
        // TODO localise
        // TODO lots of repeating code here
        add(button("Move unit to cursor") { t -> GameHypervisor.unit_setDestination(); refresh() }).row()
        add(button("View destination") { t -> GameHypervisor.unit_viewDestination(); refresh() }).row()
        add(button("disband") { t -> GameHypervisor.unit_disband(); refresh() }).row()

        list.addListener(
            LambdaClickListener {
                GameHypervisor.unit_select(list.selected)
                refreshSelected()
            }
        )

        val sp = ScrollPane(list, skin);
        add(sp).fillX()
        getCell(sp).height(200f)

        refresh()
        pack()
    }

    private fun refresh() {
        refreshSelected()
        refreshList()
    }

    private fun refreshSelected() {

    }

    private fun refreshList() {
        val arr : Array<Unit> = Array();
        GameData.units.forEach( Consumer { x -> arr.add(x) })

        list.setItems(arr)
        list.selected = null
        list.selectedIndex = -1
    }

    // ============================================================
    // endregion initalisation    
    // ============================================================


}