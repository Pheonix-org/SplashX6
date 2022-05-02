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

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.math.Vector3
import com.shinkson47.SplashX6.ai.StateMachine
import com.shinkson47.SplashX6.game.cities.Settlement
import com.shinkson47.SplashX6.game.cities.CityType
import com.shinkson47.SplashX6.game.production.AdvancementProductionManager
import com.shinkson47.SplashX6.game.production.UnitProductionProject
import com.shinkson47.SplashX6.game.units.Unit
import com.shinkson47.SplashX6.game.units.UnitClass
import com.shinkson47.SplashX6.utility.Assets
import com.shinkson47.SplashX6.utility.Assets.REF_NATION_DATA
import com.shinkson47.SplashX6.utility.PartiallySerializable
import com.shinkson47.SplashX6.utility.TurnHook

/**
 * # A container representing an entire nation.
 * Or since a player has control over one nation,
 * it can be interpreted that this container represents
 * all the data of a single player.
 *
 * @property nationType The type of nation.
 */
class Nation(val nationType: NationType, val ai: Boolean = false, val userName: String) : PartiallySerializable, TurnHook {

    /**
     * # List of all units in the world that belong to this nation.
     */
    var units : ArrayList<Unit> = ArrayList()
    var dissolved: Boolean = false
        private set

    /**
     * # List of all settlements in the world that belong to this nation.
     */
    val settlements : ArrayList<Settlement> = ArrayList()

    val advancementProuction = AdvancementProductionManager()
    val advancementTree = AdvancementTree(Assets.get(Assets.DATA_TECHS))

    @Transient lateinit var AI: NationAI
    var lastAIState = 0

    /**
     *
     *
     * @param position Position
     */
    fun settle(position: Vector3) {
        settlements.add(
            Settlement(position, cityType())
                .apply {
                    name = cityNames()[settlements.size % cityNames().size]
                }
        )
    }

    init {
//        Hypervisor.turn_hook(this)
        checkInitAI()
    }

    override fun onTurn() {
        if (ai) {
            units.forEach { it.ai_update() }
            AI.run()
            lastAIState = AI.states.indexOf( AI.currentState )

            // Always automatically end the AI player's turn.
            Gdx.app.postRunnable { Hypervisor.turn_end() }
        }
    }

    fun addUnit(u:Unit) {
        units.add(u)
        if (ai) u.ai_init()
    }

    fun checkInitAI() {
        if (ai) AI = NationAI()
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
    override fun deserialize() {

        try {
            checkInitAI()
            if (ai) AI.forceState(AI.states[lastAIState])
        } catch (e : UninitializedPropertyAccessException) {
            println()
        }
    }

    override fun toString() = "${nationType}"

    companion object {
        fun data(nationType: NationType) =
            REF_NATION_DATA.getOrDefault(nationType.toString(), REF_NATION_DATA["england"]) as HashMap<String, *>

        fun legend(nationType: NationType) =
                data(nationType)["legend"] as String
    }

    /******************************************************
     * This code was generated by the SSVM compiler
     * from 'NationAI' state machine script file
     * on Sun Mar 27 14:56:47 BST 2022
     ******************************************************/
    /**
     * NationAI
     *
     * The meta behaviour of a nation. Controls cities, production and research.
     */
    inner class NationAI : StateMachine("NationAI") {
        var Peace = 0
        var War = 1

        private fun DevelopSettlements() {
                settlements.forEach { city ->
                    if (city.unitProduction.queue.size == 0) {
                        city.unitProduction.queueProject(UnitProductionProject(UnitClass.settler))
                    }
                    if (city.improvementProduction.queue.size == 0) {
                        Hypervisor.turn_asyncTask {
                            city.improvementProduction.queueProject(
                                city.improvementProduction.evaluateProducible().get(0)
                            )
                        }
                    }
                }
        }

        private fun DevelopTechs() {
            // Not possible, X6's API calls don't support operating advancements on non host players atm.
        }

        init {
            // State : Peace
            addState(
                State(
                    "Peace",
                    Runnable {
                        DevelopSettlements()
                        DevelopTechs()
                    },
                    this,
                    null,
                    null
                )
            )
            // State : War
            addState(
                State(
                    "War",
                    Runnable {},
                    this,
                    null,
                    null
                )
            )
            // Switch : from Peace to War
            registerSwitchCondition(Peace, War) { false }
            defaultState(0)
        }
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