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
 ░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░*/

package com.shinkson47.SplashX6.game.production

import com.badlogic.gdx.utils.Array
import com.shinkson47.SplashX6.game.GameHypervisor
import com.shinkson47.SplashX6.utility.TurnHook
import com.shinkson47.SplashX6.utility.Utility
import com.shinkson47.SplashX6.utility.UtilityK
import java.io.Serializable


/**
 * # A abstract system which manages and works on [ProductionProject]s.
 *
 * Contains a queue of project that will be worked through turn by turn.
 * Each turn, the system contributes given quantity of currency towards
 * each, in turn.
 *
 * The project is complete when it's cost has been satisfied, and it's
 * result is claimed (i.e spawning a new unit, or creating a new building.)
 *
 * Completed projects are automatically removed from the queue and claimed.
 *
 * The quantity of contribution is [contributionPower], which is determined by
 * [evaluatePower], which will  differ in the implementation of this system.
 * For a [CityProductionManager],
 * this is production power, but it may also be scientific research power for
 * tech trees, or something else.
 *
 * @constructor Create empty constructor for production
 * @param PT Production Type - The type of production project that this system will manage.
 * @param basePower The quantity of power that this
 * @param queueSizeLimit The maximum number of projects that may be backlogged. TODO no limit.
 */
abstract class ProductionManager<PT : ProductionProject<*>> (

    /**
     * The quantity of power that this production system starts with.
     */
    val basePower: Int = 5,

    /**
     * The maximum number of projects that this system can have in it's queue.
     */
    val queueSizeLimit: Int = 5

) : TurnHook, Serializable {

    /**
     * The projects that this system will work on.
     */
    val queue = Array<PT>()

    /**
     * The quantity of power that this system can use to complete
     * projects each turn.
     */
    var contributionPower : Int = basePower

    /**
     * @return the [ProductionProject] that this manager is currently working on.
     */
    fun getWorkingOn() : PT? = UtilityK.tryOrNull { queue.first() }

    /**
     * ## Remove the item currently being worked on.
     *
     * Either because it's cancelled, or completed.
     *
     * Once removed, invokes [System.gc] in an attempt to clean up
     * the removed project.
     */
    fun removeWorkingOn() = queue.removeIndex(0).also { System.gc() }

    /**
     * ## Turn hook which processes the production projects.
     * @see recurseContribution
     */
    override fun onTurn() = recurseContribution(contributionPower)

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
        with (getWorkingOn()) {
            if (this == null) // There are no more projects in queue.
                return


            // Contribute n towards current project.
            contribute(power).let {
                // it = remainder
                if (isComplete()) {
                    // Move to next project
                    removeWorkingOn()

                    // Contribute remainder to next project.
                    recurseContribution(it)
                }
            }
        }
    }

    /**
     * Adds a new project to the queue.
     *
     * Has no effect if the queue if full, as determined by [isQueueFull]
     *
     * @param project Project
     * @return true if project was added, else false (i.e [isQueueFull])
     */
    fun queueProject(project : PT): Boolean {
        if (isQueueFull()) return false
        project.let {
            queue.add(it)
            it.assign(this)
        }

        return true
    }

    /**
     * ## Evaluates if the [queue] is full
     * by comparing [queue.size] to [QUEUE_LIMIT].
     *
     * @return true if [queue.size] is greater or equal to [QUEUE_LIMIT]
     */
    fun isQueueFull() = queue.size >= queueSizeLimit

    /**
     * For the implementation to populate.
     *
     * @return an [Array] of [PT] type projects that may currently be produced.
     */
    abstract fun evaluateProducible() : Array<PT>

    /**
     * # ***Make sure you update [contributionPower] with result.***
     * TODO auto update ^
     *
     *
     * @return The quantity of power that may be contributed towards the current project.
     */
    abstract fun evaluatePower() : Int

    /**
     * Hooks this system to be updated on every turn.
     */
    init { GameHypervisor.turn_hook(this) }
}