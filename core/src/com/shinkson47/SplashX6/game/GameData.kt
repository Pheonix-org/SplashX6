package com.shinkson47.SplashX6.game


import com.shinkson47.SplashX6.game.cities.City
import com.shinkson47.SplashX6.game.cities.CityTypes
import com.shinkson47.SplashX6.game.units.Unit
import com.shinkson47.SplashX6.game.world.WorldTerrain
import com.shinkson47.SplashX6.game.world.WorldTerrainGenerator
import com.shinkson47.SplashX6.game.world.generation.Generator
import java.io.Serializable

/**
 * # Static container for all data of the game in progress.
 * Is serializable so that a game data container can be saved to disk and reloaded.
 * @author [Jordan T. Gray](https://www.shinkson47.in) on 25/05/2021
 * @since PRE-ALPHA 0.0.1
 * @version 1.1
 */
object GameData : Serializable {

    /**
     * # The tile layers making up the world.
     */
    var world : WorldTerrain? = null

    /**
     * # The type of civilisation that the user is playing as.
     */
    var civType: CityTypes = CityTypes.asian

    /**
     * # List of all units in the world.
     */
    // TODO where to put units from other players, or tell them apart??
    val units  : ArrayList<Unit> = ArrayList()

    /**
     * # List of all cities in the world.
     */
    val cities : ArrayList<City> = ArrayList()

    /**
     * # The unit that the hypervisor is currently operating on.
     */
    var selectedUnit : Unit? = null













    /**
     * # clears all loaded game data.
     * Does not prompt or question the call, just clears all data.
     */
    fun clear() {
        world = null
        units.clear()
        cities.clear()
        selectedUnit = null
    }

    /**
     * New game subroutines that creates data required for a new game
     */
    fun new(){
        clear()
        world = Generator.doYourThing();
        world!!.genPopulation()
    }
}