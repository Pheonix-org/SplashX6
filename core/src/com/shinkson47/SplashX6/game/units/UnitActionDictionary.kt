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

package com.shinkson47.SplashX6.game.units

import com.shinkson47.SplashX6.audio.AudioController
import com.shinkson47.SplashX6.game.Hypervisor
import com.shinkson47.SplashX6.utility.SerializablePredicate

/**
 * # A map of actions which units can perform
 * Maps a given class of unit to a collection of actions
 * that it may perform.
 *
 * There's also a list of predicates that determines the
 * availability of an action, limiting when it may be used.
 *
 * @author <a href="https://www.shinkson47.in">Jordan T. Gray on 02/06/2021</a>
 * @since PRE-ALPHA 0.0.2
 * @version 1.1
 */
object UnitActionDictionary : HashMap<UnitClass, Array<UnitAction>>() {

    //==================================================
    // region   ACTION AVAILABILITY PREDICATES
    //==================================================

    /**
     * # Marks an action that is always available
     */
    val ALWAYS_AVAILABLE = SerializablePredicate<Unit> {true}

    val REQ_TARGET = SerializablePredicate<Unit> { it.target != null }

    /**
     * # Marks an action that requires an active destination.
     */
    val REQ_DESTINATION  = SerializablePredicate <Unit> { it.pathNodes != null && it.pathNodes!!.isNotEmpty() }



    //==================================================
    // endregion   ACTION AVAILABILITY PREDICATES
    //                    ACTIONS
    //==================================================

    /**
     * # Action that teleports the unit to it's destination
     */
    //val TELEPORT =  UnitAction("Teleport to destination", ALWAYS_AVAILABLE, { it.setLocation(it.destX, it.destY); true; })

    /**
     * # Moves towards destination
     */
    val TRAVEL  =  UnitAction("Travel to destination", REQ_DESTINATION, SerializablePredicate<Unit> {
        with(it) {
            if (!REQ_DESTINATION.test(this)) return@SerializablePredicate false

            pathNodes = pathNodes!!.drop(travelDistance.coerceAtMost(pathNodes!!.size - 1))

            if (pathNodes!!.isNotEmpty()) {
                setLocation(pathNodes!![0].x, pathNodes!![0].y, true)
                AudioController.walk()
            } else
                clearDestination()

            if (pathNodes!!.size == 1)
                clearDestination()
            true
        }
    })

    /**
     * # Creates a city.
     */
    val SETTLE   =  UnitAction("Settle", ALWAYS_AVAILABLE, SerializablePredicate<Unit> { Hypervisor.turn_asyncTask { Hypervisor.settle(it) } })

    // REQ_TARGET
    val ATTACK   =  UnitAction("Attack", REQ_TARGET, SerializablePredicate<Unit> { Hypervisor.turn_asyncTask { it.attack(); AudioController.fight() } ; true; })

    /**
     * # Invokes an update to a unit's AI.
     */
    val AI_UPDATE   =  UnitAction("AI", ALWAYS_AVAILABLE, SerializablePredicate { it.ai_update(); true; })


    //==================================================
    //                    MAP
    //==================================================

    /**
     * Constructs the map of actions.
     */
    init {

        // Actions that apply to all units.
        put(UnitClass._BASE,   arrayOf(TRAVEL))

        // Actions based on data.
        UnitClass.values().drop(1).forEach { type ->
            val actionsForThisUnitType = ArrayList<UnitAction>()

            with (Unit.UnitData.getSubTable(type.toString())) {
                if (getInt("attack") != 0)
                    actionsForThisUnitType.add(ATTACK)
            }

            put(type, actionsForThisUnitType.toTypedArray())
        }

        append(UnitClass.settler, SETTLE)
    }

    /**
     * Append the given action to the list of actions for the given type.
     *
     * If there is not yet an entry for the given type, it will be created.
     *
     * @param type The type of the unit.
     * @param action The action to be performed.
     *
     */
    private fun append(type: UnitClass, action: UnitAction) =
        put(type, super.get(type)?.let { it + action } ?: arrayOf(action))



    /**
     * ## Returns a collection of actions which the given unit can perform.
     *
     * Results are appended to the actions of the [UnitClass._BASE],
     * thus actions assigned to the [UnitClass._BASE] are available to all
     * units.
     *
     * @param key The unit class to evaluate a list of actions for.
     * @return The actions that class of units is able to perform.
     */
    override fun get(key: UnitClass): Array<UnitAction> {
        return try {
            super.get(UnitClass._BASE)!! + super.get(key)!!
        } catch (e : NullPointerException) {
            super.get(UnitClass._BASE)!!
        }
    }
}