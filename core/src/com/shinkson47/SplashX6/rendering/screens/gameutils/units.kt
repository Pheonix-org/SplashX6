package com.shinkson47.SplashX6.rendering.screens.gameutils

import com.badlogic.gdx.Game
import com.badlogic.gdx.Gdx
import com.badlogic.gdx.scenes.scene2d.ui.List
import com.badlogic.gdx.scenes.scene2d.ui.ScrollPane
import com.badlogic.gdx.utils.Array
import com.shinkson47.SplashX6.game.GameData
import com.shinkson47.SplashX6.game.GameHypervisor
import com.shinkson47.SplashX6.game.units.Unit
import com.shinkson47.SplashX6.game.units.UnitAction
import com.shinkson47.SplashX6.rendering.StageWindow
import com.shinkson47.SplashX6.utility.Assets
import com.shinkson47.SplashX6.utility.Utility.local

/**
 * # TODO
 * @author [Jordan T. Gray](https://www.shinkson47.in) on 20/05/2021
 * @since v1
 * @version 1
 */
class units : StageWindow("Units"), Runnable {

    private val units: List<Unit> = List(Assets.SKIN)
    private val actions: List<UnitAction> = List(Assets.SKIN)

    init { constructContent() }

    /**
     * <h2>Constructs the content to be displayed in this window</h2>
     */
    override fun constructContent() {
        if (FIRST_CONSTRUCTION) return
        units.selection.required = false
        actions.selection.required = false

        setPosition(0f, Gdx.graphics.height.toFloat())

        // Units pane
        seperate("waiting")
        tooltip("ttWaiting")

        units.addListener(
            LambdaClickListener {
                GameHypervisor.unit_select(units.selected)
                refreshSelected()
           })

        val sp = ScrollPane(units, skin);
        add(sp).fillX()
        tooltip("ttWaiting")
        getCell(sp).height(200f)
        row()

        seperate("busy")
        tooltip("ttBusy")

        label("notImplemented")
        tooltip("ttBusy")

        // seperate, label, button, tooltop

        seperate("manage")
        tooltip("ttManage")
        // Buttons
        // TODO localise
        // TODO lots of repeating code here
        add(button("moveUnitToCursor") { t -> GameHypervisor.unit_setDestination(); refresh() }).row()
        tooltip("ttMoveUnitToCursor")

        add(button("viewDestination") { t -> GameHypervisor.unit_viewDestination(); refresh() }).row()
        tooltip("ttViewDestination")

        add(button("cancleAction") { t -> GameHypervisor.unit_selected()?.cancelAction(); refresh() }).row()
        tooltip("ttCancleAction")

        add(button("disband") { t -> GameHypervisor.unit_disband(); refresh() }).row()
        tooltip("ttDisband")

        seperate("actions")
        tooltip("ttActions")
        add(actions)
        tooltip("ttActions")


        actions.addListener(
            LambdaClickListener {
                GameData.selectedUnit?.let { it1 -> GameHypervisor.unit_selected()?.onTurnAction = actions.selected }
            }
        )

        refresh()
        pack()
    }

    private fun refresh() {
        refreshSelected()
        refreshUnits()
    }

    private fun refreshSelected() {
        refreshActions()
        pack()
    }

    private fun refreshUnits() {
        val arr : Array<Unit> = Array();
        GameData.units.forEach { arr.add(it) }

        units.setItems(arr)
        units.selected = GameHypervisor.unit_selected()
    }

    private fun refreshActions() {
        val arr : Array<UnitAction> = Array();
        GameHypervisor.unit_selected()?.actions?.forEach { arr.add(it) } // TODO copy of above. abstract.
        // TODO use gdx array in units to avoid this on every refresh.

        actions.setItems(arr)

        actions.selected = GameHypervisor.unit_selected()?.onTurnAction

        }



    // ============================================================
    // endregion initalisation
    //#region turn hook
    // ============================================================

    init {
        GameHypervisor.turn_hook(this)
    }

    override fun onClose() {
        GameHypervisor.turn_unhook(this)
    }

    /**
     * Refresh performed on every new turn.
     */
    override fun run() {
        refresh()
    }


}