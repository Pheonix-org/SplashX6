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

package com.shinkson47.SplashX6.game.world.generation.stages

import com.auburn.fastnoiselite.FastNoiseLite
import com.shinkson47.SplashX6.game.world.Tile
import com.shinkson47.SplashX6.game.world.WorldTerrain
import com.shinkson47.SplashX6.game.world.generation.GenerationCompanion
import com.shinkson47.SplashX6.game.world.generation.GenerationCompanion.HILL_LEVEL
import com.shinkson47.SplashX6.game.world.generation.GenerationCompanion.MOUNTAIN_LEVEL
import com.shinkson47.SplashX6.game.world.generation.ModifyingGenerationStage

/**
 * # Modifies the terrain to add height
 * @author [Jordan T. Gray](https://www.shinkson47.in) on 03/07/2021
 * @since PRE-ALPHA 0.0.2
 * @version 1
 */
class HeightModStage : ModifyingGenerationStage() {

    private val hightableTerrains : Array<String> = arrayOf(
        "p_p_p_p",
        "g_g_g_g"
    )

    // TODO Height generation is not very good. Perhaps scale the noise? Check for large flat areas to modify height?
    private lateinit var noise : FastNoiseLite
    override fun execute(it: WorldTerrain) {
        noise = GenerationCompanion.createNoiseGenerator()
        noise.SetFrequency(GenerationCompanion.heightFrequency)

        GenerateHeightTiles(it)
        InterpolateHeightTiles(it)
    }

    /**
     * # Generates un-blent hill and mountain tiles
     * Based on current noise generation config and level thresholds.
     * @see [GenerationCompanion.MOUNTAIN_LEVEL]
     * @see [GenerationCompanion.HILL_LEVEL]
     */
    private fun GenerateHeightTiles(it: WorldTerrain) {
        with (it) {
            putEachTile(heightTiles) { x, y, tile ->
                if (worldTiles[y][x]!!.isLand && this@HeightModStage.hightableTerrains.contains(worldTiles[y][x]?.tileName)) {    // Check we're over grass. Height tiles only blend with grass tiles.
                    val height = noise.GetNoise(y.toFloat(), x.toFloat())                       // Get height value for current tile.
                    if (height < HILL_LEVEL) return@putEachTile null                            // If lower than hill level, then there's no height.

                    Tile(
                        if ( height > MOUNTAIN_LEVEL )                                          // If higher than mountain level, it's a mountain.
                            "mountains.0_0_0_0"
                        else "hills.0_0_0_0"                                                    // Otherwise it must be a regular hill.
                    )
                }

                else null
            }
        }
    }

    /**
     * # Blends hills and mountain tiles with surrounding terrain.
     * Basically just raises and lowers the four sides of the tile based on what's in
     * adjacent tile.
     *
     * If there's a hill or mountain next to it, raise that side. Otherwise lower it.
     *
     * Replaces all generated height tiles with a new tile representing it's new state.
     *
     * @see [Tile.interpolateHill]
     */
    // TODO Check garbage collection. Gotta make sure old tiles are deleted from RAM
    // TODO after replacing it. This generates a shit tonne of unused instances.
    private fun InterpolateHeightTiles(it: WorldTerrain) {
        with (it) {
            putEachTile(heightTiles) {
                    x, y, tile ->
                        tile?.interpolateHill(
                            getStaggeredTile(x, y + 1       , heightTiles),
                            getStaggeredTile(x + 1, y + 1, heightTiles),
                            getStaggeredTile(x + 1, y - 1, heightTiles),
                            getStaggeredTile(x, y - 1       , heightTiles)
                        )
            }
        }
    }
}