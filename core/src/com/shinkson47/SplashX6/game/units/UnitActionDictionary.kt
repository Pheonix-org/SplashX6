package com.shinkson47.SplashX6.game.units

import com.badlogic.gdx.Game
import com.shinkson47.SplashX6.game.AudioController
import com.shinkson47.SplashX6.game.GameHypervisor
import java.util.function.Predicate

/**
 * <h1>A map of actions available to each unit type.</h1>
 * Alongside a collection of all available actions, and
 * predicates determining thier availability.
 * @author <a href="https://www.shinkson47.in">Jordan T. Gray on 02/06/2021</a>
 * @since v1
 * @version 1
 */
object UnitActionDictionary : HashMap<UnitClass, Array<UnitAction>>() {

    //==================================================
    //          ACTION AVAILABILITY PREDICATES
    //==================================================

    val ALWAYS_AVAILABLE = Predicate<Unit> { true }




    //==================================================
    //                    ACTIONS
    //==================================================

    val TELEPORT =  UnitAction("Teleport to destination", ALWAYS_AVAILABLE, { it.setLocation(it.destX, it.destY); true; })

    val RETIRE   =  UnitAction("Retire", ALWAYS_AVAILABLE, { GameHypervisor.turn_asyncTask { GameHypervisor.EndGame()} ; true; })

    val PING     =  UnitAction("Ping", ALWAYS_AVAILABLE, { AudioController.playButtonSound(); true; })

    val SPAWN    =  UnitAction("Give birth", ALWAYS_AVAILABLE, { GameHypervisor.turn_asyncTask { GameHypervisor.spawn(it.isoVec.x.toInt() + 1, it.isoVec.y.toInt(), it.Class) } ; true; })

    val SETTLE   =  UnitAction("Settle", ALWAYS_AVAILABLE, { GameHypervisor.turn_asyncTask { GameHypervisor.settle(it) }})



    //==================================================
    //                    MAP
    //==================================================
    init {
            put(UnitClass._BASE,   arrayOf(TELEPORT, PING, SPAWN))
            put(UnitClass.settler, arrayOf(SETTLE))
    }

    override fun get(key: UnitClass): Array<UnitAction> {
        return super.get(UnitClass._BASE)!! + super.get(key)!!
    }
}