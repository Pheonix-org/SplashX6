package com.shinkson47.SplashX6.game.cities

import com.shinkson47.SplashX6.game.GameHypervisor
import com.shinkson47.SplashX6.utility.TurnHook

/**
 * # Defines the behaviour of a cities' production.
 */
class Production(val forCity: City) : TurnHook {

    init { GameHypervisor.turn_hook(this) }
    companion object {
        const val BASE_PRODUCTION_POWER = 5
        const val QUEUE_LIMIT = 5
    }

    /**
     * The queue of projects to be worked on.
     *
     * *Do not modify*.
     */
    val queue :  ArrayList<ProductionProject> = arrayListOf()

    var productionPower : Int = BASE_PRODUCTION_POWER
        private set

    fun queue(project : ProductionProject) {
        if (queue.size >= QUEUE_LIMIT) return
        queue.add(project)
    }

    fun evaluateCitiesProductionPower () {}

    override fun onTurn() = recurseContribution(productionPower)

    /**
     * TODO doc & test. don't trust it.
     *
     * FIXME this will allow multiple projects to be completed on one turn
     *      if production is high enough. that can't happen.
     */
    private fun recurseContribution(power : Int) {
        with (getWorkingOn()) {
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
    fun getWorkingOn() : ProductionProject = queue[0]

    /**
     * # Remove the item currently being worked on.
     *
     * Either because it's cancelled, or completed.
     */
    fun removeWorkingOn() = queue.removeAt(0)
}


/**
 * # A project that can be completed by a city.
 */
class ProductionProject(
        val cost: Int = 100,
        val projectType: ProductionProjectType = ProductionProjectType.Unit,
        var progress: Int = 0
) {

    var isComplete = false
        private set

    var isClaimed = false
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
            if (isComplete)
                return this

            progress += this
            tryClaim()
            return if (progress > cost)
                    progress - cost
                else
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

        when (projectType) {
            ProductionProjectType.Unit      -> TODO()
            ProductionProjectType.Research  -> TODO()
            ProductionProjectType.Building  -> TODO()
        }
    }
}

enum class ProductionProjectType {
    Unit,
    Research,
    Building
}

