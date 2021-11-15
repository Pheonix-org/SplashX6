package com.shinkson47.SplashX6.game

import com.shinkson47.SplashX6.game.cities.City
import com.shinkson47.SplashX6.game.cities.CityTypes
import com.shinkson47.SplashX6.game.units.Unit
import java.io.Serializable

class Civilisation : Serializable {

    /**
     * # The type of civilisation that the user is playing as.
     */
    var civType: CityTypes = CityTypes.asian

    /**
     * # List of all units in the world.
     */
    // TODO where to put units from other players, or tell them apart??
    var units  : ArrayList<Unit> = ArrayList()

    /**
     * # List of all cities in the world.
     */
    var cities : ArrayList<City> = ArrayList()
}