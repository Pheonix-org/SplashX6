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

import com.badlogic.gdx.math.MathUtils
import com.shinkson47.SplashX6.game.Hypervisor
import com.shinkson47.SplashX6.game.units.Unit
import com.shinkson47.SplashX6.game.units.UnitClass

/**
 * # An abstract view of something which can be produced.
 *
 * Using an abstract cost, this project will be completed
 * when the cost required is contributed towards it.
 *
 * 'Cost' may reffer to money, production power,
 * research power, civic research, faith, just about anything.
 * Just use values that are relevant to this project.
 * @author [Jordan T. Gray](https://www.shinkson47.in) on 28/02/2022
 * @version 1
 * @property cost The cost, in the appropriate currency, that this will require.
 * @property contributed The quantity of cost that has been contributed towarads  [cost]
 * @property production The production system that this project belongs to.
 * @property isClaimed If the project has been completed, and the result has been claimed, then true.
 */
abstract class ProductionProject<T>(
    val cost : Int = MathUtils.random(1, 20),
    var contributed : Int = 0,
    var production : ProductionManager<*>? = null, // TODO unknown type.
    var isClaimed : Boolean = false
) {
    /**
     * Assigns the project to a given project, indicating that
     * it is being worked on.
     *
     * @param to The city production which is working on the project.
     */
    fun assign(to: ProductionManager<*>) { production = to }


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
            if (isComplete() || production == null)
                return this

            contributed += this
            return if (isComplete()) {
                tryClaim()
                contributed - cost
            } else
                0
        }
    }

    /**
     * @return True if the cost has been met.
     */
    fun isComplete() = contributed >= cost


    /**
     * # Tries to claim the product of this project.
     *
     * If this project is completed, and has not yet been claimed,
     * then [doClaim] will be called.
     *
     */
    fun tryClaim() {
        if (!isComplete() || isClaimed) return
        isClaimed = true
        doClaim()
    }

    /**
     * # Claims the result of this project.
     * i.e this may spawn a unit, or place a new structure.
     */
    abstract fun doClaim(): T
    fun progress(): Float = contributed.toFloat() / cost.toFloat()

    fun remainingCost() = cost - contributed
}


//==================================================
// Specific projects
//==================================================


/**
 * # A project that produces a unit.
 *
 * @property type The type of unit this project produces.
 */
class UnitProductionProject(val type : UnitClass) : ProductionProject<Unit>() {
    override fun doClaim(): Unit {
        return (production!! as CityProductionManager).forCity.let { Hypervisor.spawn(it.isoVec.y.toInt(), it.isoVec.y.toInt(), type, it.ownedBy()!!) }
    }

    fun produce() : Unit = Unit(type, 0 ,0)

    override fun toString(): String = type.toString()
}