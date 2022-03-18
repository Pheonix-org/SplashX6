/*░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░
 ░ FOSS 2022. The Splash Project.                                                                                                                                                 ░
 ░ https://www.shinkson47.in/SplashX6                                                                                                                                             ░
 ░ Jordan T. Gray.                                                                                                                                                                ░
 ░                                                                                                                                                                                ░
 ░                                                                                                                                                                                ░
 ░                                                                                                                                                                                ░
 ░           _____                    _____                    _____            _____                    _____                    _____                                           ░
 ░          /\    \                  /\    \                  /\    \          /\    \                  /\    \                  /\    \                         ______           ░
 ░         /::\    \                /::\    \                /::\____\        /::\    \                /::\    \                /::\____\                       |::|   |          ░
 ░        /::::\    \              /::::\    \              /:::/    /       /::::\    \              /::::\    \              /:::/    /                       |::|   |          ░
 ░       /::::::\    \            /::::::\    \            /:::/    /       /::::::\    \            /::::::\    \            /:::/    /                        |::|   |          ░
 ░      /:::/\:::\    \          /:::/\:::\    \          /:::/    /       /:::/\:::\    \          /:::/\:::\    \          /:::/    /                         |::|   |          ░
 ░     /:::/__\:::\    \        /:::/__\:::\    \        /:::/    /       /:::/__\:::\    \        /:::/__\:::\    \        /:::/____/                          |::|   |          ░
 ░     \:::\   \:::\    \      /::::\   \:::\    \      /:::/    /       /::::\   \:::\    \       \:::\   \:::\    \      /::::\    \                          |::|   |          ░
 ░   ___\:::\   \:::\    \    /::::::\   \:::\    \    /:::/    /       /::::::\   \:::\    \    ___\:::\   \:::\    \    /::::::\    \   _____                 |::|   |          ░
 ░  /\   \:::\   \:::\    \  /:::/\:::\   \:::\____\  /:::/    /       /:::/\:::\   \:::\    \  /\   \:::\   \:::\    \  /:::/\:::\    \ /\    \          ______|::|___|___ ____  ░
 ░ /::\   \:::\   \:::\____\/:::/  \:::\   \:::|    |/:::/____/       /:::/  \:::\   \:::\____\/::\   \:::\   \:::\____\/:::/  \:::\    /::\____\        |:::::::::::::::::|    | ░
 ░ \:::\   \:::\   \::/    /\::/    \:::\  /:::|____|\:::\    \       \::/    \:::\  /:::/    /\:::\   \:::\   \::/    /\::/    \:::\  /:::/    /        |:::::::::::::::::|____| ░
 ░  \:::\   \:::\   \/____/  \/_____/\:::\/:::/    /  \:::\    \       \/____/ \:::\/:::/    /  \:::\   \:::\   \/____/  \/____/ \:::\/:::/    /          ~~~~~~|::|~~~|~~~       ░
 ░   \:::\   \:::\    \               \::::::/    /    \:::\    \               \::::::/    /    \:::\   \:::\    \               \::::::/    /                 |::|   |          ░
 ░    \:::\   \:::\____\               \::::/    /      \:::\    \               \::::/    /      \:::\   \:::\____\               \::::/    /                  |::|   |          ░
 ░     \:::\  /:::/    /                \::/____/        \:::\    \              /:::/    /        \:::\  /:::/    /               /:::/    /                   |::|   |          ░
 ░      \:::\/:::/    /                  ~~               \:::\    \            /:::/    /          \:::\/:::/    /               /:::/    /                    |::|   |          ░
 ░       \::::::/    /                                     \:::\    \          /:::/    /            \::::::/    /               /:::/    /                     |::|   |          ░
 ░        \::::/    /                                       \:::\____\        /:::/    /              \::::/    /               /:::/    /                      |::|   |          ░
 ░         \::/    /                                         \::/    /        \::/    /                \::/    /                \::/    /                       |::|___|          ░
 ░          \/____/                                           \/____/          \/____/                  \/____/                  \/____/                         ~~               ░
 ░                                                                                                                                                                                ░
 ░                                                                                                                                                                                ░
 ░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░*/

package com.shinkson47.SplashX6.rendering.windows.game.units

import com.badlogic.gdx.scenes.scene2d.ui.List
import com.shinkson47.SplashX6.game.Hypervisor
import com.shinkson47.SplashX6.game.units.Unit
import com.shinkson47.SplashX6.game.units.UnitAction
import com.shinkson47.SplashX6.game.units.UnitActionDictionary
import com.shinkson47.SplashX6.rendering.ui.StageWindow
import com.shinkson47.SplashX6.utility.Assets

// TODO Remove window when unit is dispanded. How?

/**
 * # Displays and manages a single unit.
 * Opened via the [W_UnitsList], or via bind 'x' to open for the currently selected unit.
 *
 * [unit] - The unit that this window manages.
 */
class W_Unit(val unit : Unit) : StageWindow("!${unit.displayName}") {

    /**
     * # Filtered list of actions that this particular unit can perform.
     *
     * Starts as a list of [UnitAction] from [UnitActionDictionary],
     * and may be mutated based on state.
     */
    private val actions: List<UnitAction> = List(Assets.REF_SKIN_W95)

    private val lstCloseUnits: List<Unit> = List(Assets.REF_SKIN_W95)

    init {
        seperate("specific.windows.units.turnAction")

        actions.selection.required = false
        actions.addListener(
            LambdaClickListener {
                Hypervisor.unit_selected()?.onTurnAction = actions.selected
                refresh()
            }
        )

        span(add(actions))
        tooltip("specific.windows.units.ttActions")

        addButton("specific.windows.units.cancleAction", false, true) { Hypervisor.unit_selected()?.cancelAction(); refresh() }
        tooltip("specific.windows.units.ttCancelAction")

        seperate("!Units close by")
        expandfill(add(lstCloseUnits).also { cell ->
            cell.actor.apply {
                addListener(LambdaChangeListener {
                    selected?.apply { unit.target = this }
                })
            }
        })
        row()


        hsep()
        addButton("specific.windows.units.disband", false, true) { Hypervisor.unit_disband(unit); refresh() }
        tooltip("specific.windows.units.ttDisband")

        addButton("!OK", false, true) { super.close() }

        refresh()

        Hypervisor.turn_hook(this)
        updateColSpans()
        allowClose()
    }

    override fun refresh() {
        actions.setItems(
            *UnitActionDictionary[unit.unitClass]
        )

        lstCloseUnits.setItems(Hypervisor.unit_proximity(unit))

        // FIXME this is dodgy. Needs to be checked on the unit,
        // and before it's used.
        if (unit.target != null && !lstCloseUnits.items.contains(unit.target))
            unit.target = null

        actions.selected = Hypervisor.unit_selected()?.onTurnAction

        pack()
    }

}