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

import com.shinkson47.SplashX6.game.GameHypervisor
import com.shinkson47.SplashX6.utility.SerializablePredicate
import java.io.Serializable
import java.util.function.Predicate

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

            pathNodes = pathNodes!!.drop(travelDistance)

            if (pathNodes!!.isNotEmpty())
                setLocation(pathNodes!![0].x, pathNodes!![0].y)
            else
                clearDestination()

            true
        }
    })

    /**
     * # Creates a city.
     */
    val SETTLE   =  UnitAction("Settle", ALWAYS_AVAILABLE, SerializablePredicate<Unit> { GameHypervisor.turn_asyncTask { GameHypervisor.settle(it) } })


    //==================================================
    //                    MAP
    //==================================================

    /**
     * Constructs the map of actions.
     */
    init {
            put(UnitClass._BASE,   arrayOf(TRAVEL))
            put(UnitClass.settler, arrayOf(SETTLE))
    }


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