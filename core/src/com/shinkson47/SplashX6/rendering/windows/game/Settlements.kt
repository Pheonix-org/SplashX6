package com.shinkson47.SplashX6.rendering.windows.game

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.scenes.scene2d.ui.List
import com.badlogic.gdx.utils.Array
import com.shinkson47.SplashX6.game.GameData
import com.shinkson47.SplashX6.game.GameHypervisor
import com.shinkson47.SplashX6.game.units.Unit
import com.shinkson47.SplashX6.game.units.UnitAction
import com.shinkson47.SplashX6.rendering.StageWindow
import com.shinkson47.SplashX6.utility.Assets

/**
 * # TODO
 * @author [Jordan T. Gray](https://www.shinkson47.in) on 21/06/2021
 * @since v1
 * @version 1
 */
class Settlements : StageWindow("Settlements") {

    private val settlements: List<Unit> = List(Assets.SKIN)
    private val production: List<UnitAction> = List(Assets.SKIN)

    /**
     * A click listener for a list of settlements.
     */
    private class SELECT_LISTENER(val list: List<Unit>) : StageWindow.LambdaClickListener({
        list.selected?.let {


        }
    })

    init {
        settlements.selection.required = false
        production.selection.required = false

        setPosition(0f, Gdx.graphics.height.toFloat())

        addList(settlements, "ttSettlements")
        settlements.addListener(SELECT_LISTENER(settlements))

        seperate("production")
        tooltip("ttProduction")
        addList(production, "ttProduction")

        // seperate, label, button, tooltop

        seperate("manage")
        tooltip("ttManage")
        // Buttons
        // TODO localise
        // TODO lots of repeating code here
        add(StageWindow.button("moveUnitToCursor") { GameHypervisor.unit_setDestination(); refresh() }).row()
        tooltip("ttMoveUnitToCursor")

        add(StageWindow.button("viewDestination") { GameHypervisor.unit_viewDestination(); refresh() }).row()
        tooltip("ttViewDestination")

        add(StageWindow.button("cancleAction") { GameHypervisor.unit_selected()?.cancelAction(); refresh() }).row()
        tooltip("ttCancleAction")

        add(StageWindow.button("disband") { GameHypervisor.unit_disband(); refresh() }).row()
        tooltip("ttDisband")

        seperate("actions")
        tooltip("ttActions")
        add(production)
        tooltip("ttActions")


        production.addListener(
            StageWindow.LambdaClickListener {
                GameData.selectedUnit?.let {
                    GameHypervisor.unit_selected()?.onTurnAction = production.selected
                    refresh()
                }
            }
        )

        refresh()
        pack()
    }

    override fun refresh() {
        refreshSelected()
        refreshUnits()
    }

    private fun refreshSelected() {
        refreshActions()
        pack()
    }

    private fun refreshUnits() {
        val _waiting : Array<Unit> = Array()
        val _busy : Array<Unit> = Array()


        GameData.player!!.units.forEach {            // Go through all units,
            if (it.onTurnAction == null)    // and add them to the
                _waiting.add(it)            // Right list.
            else
                _busy.add(it)
        }

        populate(settlements, _waiting)
    }

    private fun populate(list: List<Unit>, array: Array<Unit>){
        list.setItems(array)
        list.selected = GameHypervisor.unit_selected()
    }

    private fun refreshActions() {
        val arr : Array<UnitAction> = Array();
        GameHypervisor.unit_selected()?.actions?.forEach { arr.add(it) } // TODO copy of above. abstract.
        // TODO use gdx array in units to avoid this on every refresh.

        production.setItems(arr)

        production.selected = GameHypervisor.unit_selected()?.onTurnAction

    }



    // ============================================================
    // endregion initalisation
    // ============================================================

}