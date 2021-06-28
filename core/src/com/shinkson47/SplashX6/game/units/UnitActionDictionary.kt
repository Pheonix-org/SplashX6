package com.shinkson47.SplashX6.game.units

import com.shinkson47.SplashX6.audio.AudioController
import com.shinkson47.SplashX6.game.GameHypervisor
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

    /**
     * # Marks an action that is always available
     */
    val ALWAYS_AVAILABLE = Predicate<Unit> { true }

    /**
     * # Marks an action that requires an active destination.
     */
    val REQ_DESTINATION  = Predicate<Unit> { it.pathNodes != null && it.pathNodes!!.isNotEmpty() }




    //==================================================
    //                    ACTIONS
    //==================================================

    /**
     * # Action that teleports the unit to it's destination
     */
    val TELEPORT =  UnitAction("Teleport to destination", ALWAYS_AVAILABLE, { it.setLocation(it.destX, it.destY); true; })

    /**
     * # Moves towards destination
     */
    val TRAVEL  =  UnitAction("Travel to destination", REQ_DESTINATION, {
        with (it) {
            if (!REQ_DESTINATION.test(this)) return@UnitAction false;

            pathNodes = pathNodes!!.drop(travelDistance)
            if (pathNodes!!.isNotEmpty())
                setLocation(pathNodes!![0].x, pathNodes!![0].y)
            else
                setDestination(destX, destY)


            true; }})


    /**
     * # Action that ends the game
     */
    val RETIRE   =  UnitAction("Retire", ALWAYS_AVAILABLE, { GameHypervisor.turn_asyncTask { GameHypervisor.EndGame()} ; true; })

    /**
     * # Makes a test sound
     */
    val PING     =  UnitAction("Ping", ALWAYS_AVAILABLE, { AudioController.playButtonSound(); true; })

    /**
     * # Spawns a dupe
     */
    val SPAWN    =  UnitAction("Give birth", ALWAYS_AVAILABLE, { GameHypervisor.turn_asyncTask { GameHypervisor.spawn(it.isoVec.x.toInt() + 1, it.isoVec.y.toInt(), it.unitClass) } ; true; })

    /**
     * # Creates a city.
     */
    val SETTLE   =  UnitAction("Settle", ALWAYS_AVAILABLE, { GameHypervisor.turn_asyncTask { GameHypervisor.settle(it) }})



    //==================================================
    //                    MAP
    //==================================================
    init {
            put(UnitClass._BASE,   arrayOf(TELEPORT, TRAVEL, PING, SPAWN))
            put(UnitClass.settler, arrayOf(SETTLE))
    }

    override fun get(key: UnitClass): Array<UnitAction> {
        return super.get(UnitClass._BASE)!! + super.get(key)!!
    }
}