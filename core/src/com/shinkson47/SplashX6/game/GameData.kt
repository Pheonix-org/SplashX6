package com.shinkson47.SplashX6.game


import com.shinkson47.SplashX6.game.cities.CityType
import com.shinkson47.SplashX6.game.units.Unit
import com.shinkson47.SplashX6.game.world.WorldTerrain
import com.shinkson47.SplashX6.game.world.generation.Generator
import java.io.Serializable

/**
 * # Static container for all data of the game in progress.
 * Is serializable so that a game data container can be saved to disk and reloaded.
 * @author [Jordan T. Gray](https://www.shinkson47.in) on 25/05/2021
 * @since PRE-ALPHA 0.0.1
 * @version 1.1
 */
@JvmField
val GameData = _GameData()

class _GameData : Serializable {

    /**
     * # The tile layers making up the world.
     */
    @JvmField var world : WorldTerrain? = null

    @JvmField var civilisations : ArrayList<Civilisation> = ArrayList()


    // This client's data
    /**
     * # The unit that the hypervisor is currently operating on.
     */
    @JvmField var selectedUnit : Unit? = null

    @JvmField var player : Civilisation? = null


    // ======================================
    // New game preferences
    // ======================================
    var pref_civType = CityType.asian









    /**
     * # clears all loaded game data.
     * Does not prompt or question the call, just clears all data.
     */
    fun clear() {
        world = null
        player = null
        selectedUnit = null
        civilisations.clear()
    }

    /**
     * New game subroutines that creates data required for a new game
     */
    fun new() {
        clear()
        player = GameHypervisor.civ_new(pref_civType)
        world = Generator.doYourThing()
        world!!.genPopulation()
    }

    fun networkSet(gameState: _GameData) {
        world = gameState.world
        world!!.networkCreate()
        world!!.removeFogOfWar()
        civilisations   = gameState.civilisations

        GameHypervisor.gameRenderer!!.newRenderer()
    }
}