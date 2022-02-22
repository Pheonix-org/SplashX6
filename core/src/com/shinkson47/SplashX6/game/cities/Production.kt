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

package com.shinkson47.SplashX6.game.cities

import com.badlogic.gdx.math.MathUtils
import com.shinkson47.SplashX6.game.GameHypervisor
import com.shinkson47.SplashX6.game.units.UnitClass
import com.shinkson47.SplashX6.utility.TurnHook
import com.shinkson47.SplashX6.utility.UtilityK.tryOrNull
import java.io.Serializable

/**
 * # A cities ability to produce things with it's production power.
 */
class Production(

    /**
     * ## The city that this production is for.
     */
    val forCity: City

    ) : TurnHook, Serializable {

    init { GameHypervisor.turn_hook(this) }
    companion object {
        const val BASE_PRODUCTION_POWER = 5
        const val QUEUE_LIMIT = 5
    }

    /**
     * The queue of projects to be worked on.
     *
     * > ***Do not modify contents directly***
     * @see [queue]
     */
    val queue :  ArrayList<ProductionProject> = arrayListOf()

    /**
     * A figure representing the city's ability to produce.
     *
     * For now, scales with the [forCity.population].
     *
     * Updates on access.
     */
    var productionPower : Int = BASE_PRODUCTION_POWER + forCity.population
        private set
        get() {
            field = BASE_PRODUCTION_POWER * forCity.population
            return field
        }

    /**
     * ## Queues a production project for the city to work on.
     * Has no effect if [queueIsFull] is true.
     *
     * @param project Project to be added to the queue
     */
    fun queue(project : ProductionProject) {
        if (queueIsFull()) return
        project.let {
            queue.add(it)
            it.assign(this)
        }
    }

    /**
     * ## Evaluates if the [queue] is full
     * by comparing [queue.size] to [QUEUE_LIMIT].
     *
     * @return true if [queue.size] is greater or equal to [QUEUE_LIMIT]
     */
    fun queueIsFull() = queue.size >= QUEUE_LIMIT

    /**
     * ## Evaluate a cities [productionPower]
     *
     * This will use the resources and buildings available to the city
     * to calculate the city's production power.
     */
    fun evaluateCitiesProductionPower () {}

    /**
     * ## Evaluates a list of all production projects that are currently available for this city.
     *
     * @return [Collection]
     */
    fun evaluateProducable(): Collection<ProductionProject> = UnitClass.values().map {  UnitProductionProject(it)  }


    /**
     * ## Turn hook which processes the production projects.
     * @see recurseContribution
     */
    override fun onTurn() = recurseContribution(productionPower)

    /**
     * ## Recursively applies n [power] towards the queue of projects.
     *
     * Each project consumes x quantity of n power,
     * and any remaining power is put towards the next
     * project.
     *
     * i.e
     *
     * project 1 = 10 cost
     *
     * project 2 = 20 cost
     *
     * project 3 = 20 cost
     *
     * production contributed by city = 30
     *
     * result :

     * project 1 = complete
     *
     * project 2 = 10 cost
     *
     * project 2 = 20 cost
     *
     */
    private fun recurseContribution(power : Int) {
        //TODO this happens multiple times, when i think it shouldn't.

        with (getWorkingOn()) {
            if (this == null) return // There are no more projects in queue.

            // Contribute n towards current project.
            contribute(power).let {
                // it = remainder
                if (isComplete) {
                    // Move to next project
                    removeWorkingOn()

                    // Contribute remainder to next project.
                    recurseContribution(it)
                }
            }
        }
    }

    /**
     * ## Returns the [ProductionProject] that this city is currently working on.
     */
    fun getWorkingOn() : ProductionProject? = tryOrNull { queue.first() }

    /**
     * ## Remove the item currently being worked on.
     *
     * Either because it's cancelled, or completed.
     */
    fun removeWorkingOn() = queue.removeAt(0)


    /**
     * # A project that can be completed by a city's production power.
     */
    abstract class ProductionProject(

        /**
         * The quantity of production power required to complete.
         */
        val cost: Int = MathUtils.random(1, 20),

        /**
         * The quantity of production power that has been contributed towards
         */
        var progress: Int = 0
    ) {

        /**
         * Flag which is raised when progress matches cost.
         */
        var isComplete = false
            private set

        /**
         * Flag which is raised when the product of a completed project is claimed.
         *
         * i.e a unit has been spawned, or a structure has been built.
         *
         * Prevents the same project from being claimed more than once.
         */
        var isClaimed = false
            private set

        /**
         * Assigns the project to a given project, indicating that
         * it is being worked on.
         *
         * @param to The city production which is working on the project.
         */
        fun assign(to: Production) { production = to }
        lateinit var production: Production
            private set


        /**
         * Contributes the *n* production power towards this
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
         * # Tries to claim the product of this project.
         *
         * If this project is completed, and has not yet been claimed,
         * then [doClaim] will be called.
         *
         */
        fun tryClaim() {
            if (!isComplete || isClaimed) return
            isClaimed = true
            doClaim()
        }

        /**
         * # Claims the result of this project.
         * i.e this may spawn a unit, or place a new structure.
         */
        abstract fun doClaim()
    }

    /**
     * # A project that produces a unit.
     *
     * @property type The type of unit this project produces.
     */
    class UnitProductionProject(val type : UnitClass) : Production.ProductionProject() {
        override fun doClaim() = GameHypervisor.spawn(production.forCity.isoVec, type)

        /**
         * Returns a string representation of the object.
         */
        override fun toString(): String = type.toString()
    }
}

