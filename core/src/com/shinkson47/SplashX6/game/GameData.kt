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


import com.shinkson47.SplashX6.game.units.Unit
import com.shinkson47.SplashX6.game.world.WorldTerrain
import com.shinkson47.SplashX6.game.world.generation.Generator
import com.shinkson47.SplashX6.utility.Assets
import com.shinkson47.SplashX6.utility.Assets.REF_PREFERENCES
import com.shinkson47.SplashX6.utility.PartiallySerializable

/**
 * # Static container for all data of the game in progress.
 * Is serializable so that a game data container can be saved to disk and reloaded.
 * @author [Jordan T. Gray](https://www.shinkson47.in) on 25/05/2021
 * @since PRE-ALPHA 0.0.1
 * @version 1.1
 */
@JvmField
var GameData = _GameData()

class _GameData : PartiallySerializable {

    /**
     * # The tile layers making up the world.
     */
    @JvmField var world : WorldTerrain? = null

    @JvmField var nations : ArrayList<Nation> = ArrayList()

    var currentPlayerIndex = 0

    fun currentPlayer() = nations.get(currentPlayerIndex)

    fun nextPlayer() {
        currentPlayerIndex = (currentPlayerIndex + 1) % nations.size
    }

    fun isLocalPlayersTurn() = currentPlayer() == localPlayer

    // This client's data
    /**
     * # The unit that the hypervisor is currently operating on.
     */
    @Transient @JvmField var selectedUnit : Unit? = null

    @JvmField var localPlayer : Nation? = null


    // ░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░
    // New game preferences
    // ░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░
    var pref_civType = NationType.values().first()
    var pref_civCount = 3




    /**
     * # Applies [f] to every unit in the game.
     *
     * For every nation, for every unit in that nation, call the function f with that unit
     *
     * @param f (Unit) -> kotlin.Unit
     */
    fun forEveryUnit(f : (Unit) -> kotlin.Unit) =
        forEveryNation { it.units.forEach { f(it) } }

    /**
     * Applies [f] to every nation in the game.
     *
     * For every nation in the list of nations, call the function f with that nation as its argument
     *
     * @param f (Nation) -> kotlin.Unit
     */
    fun forEveryNation(f : (Nation) -> kotlin.Unit) =
        nations.forEach { f(it) }


    /**
     * # clears all loaded game data.
     * Does not prompt or question the call, just clears all data.
     */
    fun clear() {
        world = null
        localPlayer = null
        selectedUnit = null
        nations.clear()
    }

    /**
     * New game subroutines that creates data required for a new game
     */
    fun new() {
        // Delete all data.
        clear()
        System.gc()
        currentPlayerIndex = 0

        // Create a new world
        world = Generator.doYourThing()

        // Create a new local player
        localPlayer = Hypervisor.nation_new(pref_civType, userName = REF_PREFERENCES.getString("USER_NAME"))
    }


    fun networkSet(gameState: _GameData) {
        world = gameState.world
        Hypervisor.gameRenderer!!.newRenderer()

        nations = gameState.nations
        deserialize()
    }

    override fun deserialize() {
        world!!.deserialize()

        nations.forEach {
            it.deserialize()
            it.units.forEach  { it.deserialize() }
            it.settlements.forEach { it.deserialize() }
        }

        determineLocalPlayer()
    }

    fun findNationByName(name: String) =
        nations.find { it.userName == name }

    fun determineLocalPlayer() {
        localPlayer = findNationByName(Assets.REF_PREFERENCES.getString("USER_NAME"))
        if (localPlayer == null)
            throw IllegalStateException("Local player does not exist within the world!")
    }

}