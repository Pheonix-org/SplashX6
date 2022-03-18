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

package com.shinkson47.SplashX6.game

import com.badlogic.gdx.math.Vector3
import com.badlogic.gdx.utils.Array
import com.shinkson47.SplashX6.game.cities.Settlement
import com.shinkson47.SplashX6.game.cities.CityType
import com.shinkson47.SplashX6.game.production.TechProductionManager
import com.shinkson47.SplashX6.game.units.Unit
import com.shinkson47.SplashX6.utility.Assets
import com.shinkson47.SplashX6.utility.Assets.REF_NATION_DATA
import com.shinkson47.SplashX6.utility.TurnHook
import java.io.Serializable

/**
 * # A container representing an entire nation.
 * Or since a player has control over one nation,
 * it can be interpreted that this container represents
 * all the data of a single player.
 *
 * @property nationType The type of nation.
 */
class Nation(val nationType: NationType, val ai: Boolean = false) : Serializable, TurnHook {

    /**
     * # List of all units in the world that belong to this nation.
     */
    var units : Array<Unit> = Array()
    var dissolved: Boolean = false
        private set

    /**
     * # List of all settlements in the world that belong to this nation.
     */
    val settlements : Array<Settlement> = Array()

    val advancementProuction = TechProductionManager()
    val advancementTree = AdvancementTree(Assets.get(Assets.DATA_TECHS))

    /**
     *
     *
     * @param position Position
     */
    fun settle(position: Vector3) {
        settlements.add(
            Settlement(position, cityType())
                .apply {
                    name = cityNames()[settlements.size]
                }
        )
    }

    init {
        Hypervisor.turn_hook(this)
    }

    override fun onTurn() {
        if (ai) {
            units.forEach { it.ai_update() }
        }
    }

    fun addUnit(u:Unit) {
        units.add(u)
        if (ai) u.ai_init()
    }


    /**
     * Breaks down data related to this nation.
     *
     * @Deprecated DO NOT INVOKE. Use [Hypervisor.nation_dissolve]
     * @see Hypervisor.nation_dissolve
     */
    @Deprecated("DO NOT DIRECTLY INVOKE. Use GameHypervisor.nation_dissolve(it)")
    fun dissolve() {
        dissolved = true
        settlements.clear()
        units.forEach { Hypervisor.unit_disband(it) }
        units.clear()
    }

    fun cityType(): CityType = CityType.valueOf(data()["citytype"] as String)
    fun cityNames(): ArrayList<String> = data()["cities"] as ArrayList<String>
    fun data(): HashMap<String, *> = data(nationType)

    override fun toString() = "${nationType}"

    companion object {
        fun data(nationType: NationType) =
            REF_NATION_DATA.getOrDefault(nationType.toString(), REF_NATION_DATA["england"]) as HashMap<String, *>

        fun legend(nationType: NationType) =
                data(nationType)["legend"] as String
    }
}

enum class NationType{
    england,
    zulu,
    greece,
    america,
    barbarian,
    babylon,
    mongolia,
    russia,
    germany,
    egypt,
    china,
    france,
    japan,
    aztec,
    rome,
}