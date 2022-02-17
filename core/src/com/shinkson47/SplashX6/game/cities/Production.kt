package com.shinkson47.SplashX6.game.cities

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.math.MathUtils
import com.shinkson47.SplashX6.game.GameHypervisor
import com.shinkson47.SplashX6.game.units.UnitClass
import com.shinkson47.SplashX6.utility.TurnHook
import com.shinkson47.SplashX6.utility.Utility
import com.shinkson47.SplashX6.utility.UtilityK.tryOrNull
import java.io.Serializable

/**
 * # Defines the behaviour of a cities' production.
 */
class Production(val forCity: City) : TurnHook, Serializable {

    init { GameHypervisor.turn_hook(this) }
    companion object {
        const val BASE_PRODUCTION_POWER = 5
        const val QUEUE_LIMIT = 5
    }

    /**
     * The queue of projects to be worked on.
     *
     * *Do not modify contents*.
     */
    val queue :  ArrayList<ProductionProject> = arrayListOf()

    var productionPower : Int = BASE_PRODUCTION_POWER + (BASE_PRODUCTION_POWER * forCity.population)
        private set
        get() {
            field = BASE_PRODUCTION_POWER + (BASE_PRODUCTION_POWER * forCity.population)
            return field
        }

    fun queue(project : ProductionProject) {
        if (isQueuefull()) return
        queue.add(project)
        project.assign(this)
    }

    fun isQueuefull() = queue.size >= QUEUE_LIMIT

    fun evaluateCitiesProductionPower () {}

    override fun onTurn() = recurseContribution(productionPower)

    /**
     * TODO doc & test. don't trust it.
     *
     * FIXME this will allow multiple projects to be completed on one turn
     *      if production is high enough. that can't happen.
     */
    private fun recurseContribution(power : Int) {
        //TODO this happens multiple times, when i think it shouldn't.
        with (getWorkingOn()) {
            if (this == null) return
            val overflow = contribute(power)

            if (isComplete) {
                removeWorkingOn()
                recurseContribution(overflow)
            }
        }
    }

    /**
     * # Returns the [ProductionProject] currently being worked on.
     */
    fun getWorkingOn() : ProductionProject? = tryOrNull { queue.first() }

    /**
     * # Remove the item currently being worked on.
     *
     * Either because it's cancelled, or completed.
     */
    fun removeWorkingOn() = queue.removeAt(0)

    fun producable(): Collection<ProductionProject> = UnitClass.values().map {  UnitProductionProject(it)  }


    /**
     * # A project that can be completed by a city.
     */
    abstract class ProductionProject(
        val cost: Int = MathUtils.random(1, 20),
        var progress: Int = 0
    ) {

        var isComplete = false
            private set

        var isClaimed = false
            private set

        fun assign(to: Production) { production = to }
        lateinit var production: Production
            private set


        /**
         * Contributes the given production power towards this
         * production project.
         *
         * If complete with remainder, returns the remainder.
         *
         * Check [isComplete] to determine of contribution completed the project.
         */
        fun contribute(productionQuantity : Int) : Int {
            with(productionQuantity) {
                if (isComplete || production == null)
                    return this

                progress += this
                return if (progress > cost) {
                    isComplete = true
                    tryClaim()
                    progress - cost
                } else
                    0
            }
        }

        /**
         * Tries to claim the product, If completed will trigger the end of production
         * result.
         *
         * i.e this may spawn a unit, or place a new structure.
         */
        fun tryClaim() {
            if (!isComplete || isClaimed) return
            isClaimed = true
            doClaim()
        }

        abstract fun doClaim()
    }

    class UnitProductionProject(val type : UnitClass) : Production.ProductionProject() {
        override fun doClaim() = GameHypervisor.spawn(production.forCity.isoVec, type)

        /**
         * Returns a string representation of the object.
         */
        override fun toString(): String = type.toString()
    }
}

