package com.shinkson47.SplashX6.game


import com.shinkson47.SplashX6.game.units.Unit
import com.shinkson47.SplashX6.game.world.World
import java.io.Serializable

/**
 * # Static container for all data of the game in progress.
 * Is serializable so that a game data container can be saved to disk and reloaded.
 * @author [Jordan T. Gray](https://www.shinkson47.in) on 25/05/2021
 * @since v1
 * @version 1
 */
object GameData : Serializable {

    /**
     * # The tile layers making up the world.
     */
    var world : World? = null

    /**
     * # List of all
     */
    val units : ArrayList<Unit> = ArrayList()

    var selectedUnit : Unit? = null


    /**
     * # clears all loaded game data.
     * Does not prompt or question the call, just clears all data.
     */
    fun clear() {

        world = null
        units.clear()

    }

    /**
     * New game subroutines that creates data required for a new game
     */
    fun new(){
        clear()
        world = World.create()
        world!!.genPopulation()
    }
}