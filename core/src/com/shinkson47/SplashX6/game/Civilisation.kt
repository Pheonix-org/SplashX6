package com.shinkson47.SplashX6.game

import com.badlogic.gdx.math.Vector3
import com.shinkson47.SplashX6.game.cities.City
import com.shinkson47.SplashX6.game.cities.CityType
import com.shinkson47.SplashX6.game.units.Unit
import com.shinkson47.SplashX6.utility.Assets
import java.io.Serializable

class Civilisation(var nationType: NationType) : Serializable {

    /**
     * # List of all units in the world.
     */
    // TODO where to put units from other players, or tell them apart??
    var units  : ArrayList<Unit> = ArrayList()

    /**
     * # List of all cities in the world.
     */
    val cities : ArrayList<City> = ArrayList()

    fun settle(position: Vector3) {
        cities.add(
            City(position, cityType())
                .apply {
                    name = cityNames()[cities.size]
                }
        )
    }

    fun cityType(): CityType = CityType.valueOf(data()["citytype"] as String)
    fun cityNames(): ArrayList<String> = data()["cities"] as ArrayList<String>
    fun data(): HashMap<String, *> = data(nationType)

    companion object {
        fun data(nationType: NationType) =
            Assets.NATION_DATA.getOrDefault(nationType.toString(), Assets.NATION_DATA["england"]) as HashMap<String, *>

        fun legend(nationType: NationType) =
                data(nationType)["legend"] as String
    }
}

enum class NationType{
    england,
    america,
    japan
}