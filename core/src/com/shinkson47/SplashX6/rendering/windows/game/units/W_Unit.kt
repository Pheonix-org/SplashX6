package com.shinkson47.SplashX6.rendering.windows.game.units


import com.badlogic.gdx.scenes.scene2d.ui.List
import com.shinkson47.SplashX6.game.GameHypervisor
import com.shinkson47.SplashX6.game.GameHypervisor.Companion.cm_enter
import com.shinkson47.SplashX6.game.units.Unit
import com.shinkson47.SplashX6.game.units.UnitAction
import com.shinkson47.SplashX6.game.units.UnitActionDictionary
import com.shinkson47.SplashX6.rendering.StageWindow
import com.shinkson47.SplashX6.utility.Assets

/**
 * # Displays and manages a single unit.
 *
 *  TODO Remove window when unit is dispanded. How?
 *  TODO turn actions
 *  TODO management actions
 *  TODO abstract turn hook for all windows.
 */
class W_Unit(val unit : Unit) : StageWindow(unit.displayName) {

    private val actions: List<UnitAction> = List(Assets.SKIN)


    override fun constructContent() {}
    init {

        addButton("viewUnit", false, true) { GameHypervisor.unit_view() }
        tooltip("ttViewUnit")

        hsep()

        addButton("viewDestination", false) { GameHypervisor.unit_viewDestination(); refresh() }
        tooltip("ttViewDestination")
        addButton("moveUnitToCursor") { if (!cm_enter()) GameHypervisor.cm_destinationSelect(); refresh() }
        tooltip("ttMoveUnitToCursor")

        seperate("turnAction")

        actions.selection.required = false
        actions.addListener(
            LambdaClickListener {
                GameHypervisor.unit_selected()?.onTurnAction = actions.selected
                refresh()
            }
        )

        span(add(actions))
        tooltip("ttActions")

        addButton("cancleAction", false, true) { GameHypervisor.unit_selected()?.cancelAction(); refresh() }
        tooltip("ttCancleAction")

        hsep()
        addButton("disband", false, true) { GameHypervisor.unit_disband(); refresh() }
        tooltip("ttDisband")

        refresh()

        GameHypervisor.turn_hook(this)
        updateColSpans()
        allowClose()
    }

    override fun refresh() {
        actions.setItems(
            *UnitActionDictionary[unit.unitClass]
        )

        actions.selected = GameHypervisor.unit_selected()?.onTurnAction
    }

}