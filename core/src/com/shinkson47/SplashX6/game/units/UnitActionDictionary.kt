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
import com.shinkson47.SplashX6.game.GameHypervisor
import java.io.Serializable
import java.util.function.Predicate

/**
 * # A collection of all available actions
 * Alongside a map defining which are available to each unit class
 * and a collection of predicates determining a unit's availability.
 * @author <a href="https://www.shinkson47.in">Jordan T. Gray on 02/06/2021</a>
 * @since PRE-ALPHA 0.0.2
 * @version 1
 */
object UnitActionDictionary : HashMap<UnitClass, Array<UnitAction>>() {

    //==================================================
    //          ACTION AVAILABILITY PREDICATES
    //==================================================

    class SerializablePredicate <T>(val z : ((T) -> Boolean)) : Predicate<T>, Serializable {
        override fun test(t: T): Boolean = z(t)
    }

    /**
     * # Marks an action that is always available
     */
    val ALWAYS_AVAILABLE = SerializablePredicate<Unit> {true}

    /**
     * # Marks an action that requires an active destination.
     */
    val REQ_DESTINATION  = SerializablePredicate <Unit> { it.pathNodes != null && it.pathNodes!!.isNotEmpty() }




    //==================================================
    //                    ACTIONS
    //==================================================

    /**
     * # Action that teleports the unit to it's destination
     */
    //val TELEPORT =  UnitAction("Teleport to destination", ALWAYS_AVAILABLE, { it.setLocation(it.destX, it.destY); true; })

    /**
     * # Moves towards destination
     */
    val TRAVEL  =  UnitAction("Travel to destination", REQ_DESTINATION, SerializablePredicate {
        with(it) {
            if (!REQ_DESTINATION.test(this)) return@SerializablePredicate false;

            pathNodes = pathNodes!!.drop(travelDistance)
            if (pathNodes!!.isNotEmpty())
                setLocation(pathNodes!![0].x, pathNodes!![0].y)
            else
                setDestination(destX, destY)


            true;
        }
    })

    /**
     * # Creates a city.
     */
    val SETTLE   =  UnitAction("Settle", ALWAYS_AVAILABLE, SerializablePredicate { GameHypervisor.turn_asyncTask { GameHypervisor.settle(it) } })


    //==================================================
    //                    MAP
    //==================================================
    init {
            put(UnitClass._BASE,   arrayOf(TRAVEL))
            put(UnitClass.settler, arrayOf(SETTLE))
    }

    override fun get(key: UnitClass): Array<UnitAction> {
        return try {
            super.get(UnitClass._BASE)!! + super.get(key)!!
        } catch (e : NullPointerException) {
            super.get(UnitClass._BASE)!!
        }
    }
}