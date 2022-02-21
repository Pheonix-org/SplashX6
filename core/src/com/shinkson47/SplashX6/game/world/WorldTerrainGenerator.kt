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

package com.shinkson47.SplashX6.game.world

import com.auburn.fastnoiselite.FastNoiseLite
import com.badlogic.gdx.math.MathUtils
import com.shinkson47.SplashX6.game.world.WorldTerrain.Companion.DEFAULT_HEIGHT
import com.shinkson47.SplashX6.game.world.WorldTerrain.Companion.DEFAULT_WIDTH
import com.shinkson47.SplashX6.game.world.WorldTerrain.Companion.FOLIAGE_QUANTITY_MAX
import com.shinkson47.SplashX6.game.world.WorldTerrain.Companion.HILL_LEVEL
import com.shinkson47.SplashX6.game.world.WorldTerrain.Companion.MIN_WORLD_HEIGHT
import com.shinkson47.SplashX6.game.world.WorldTerrain.Companion.MIN_WORLD_WIDTH
import com.shinkson47.SplashX6.game.world.WorldTerrain.Companion.SEA_LEVEL
import com.shinkson47.SplashX6.game.world.generation.stages.NavigationDataMiscStage
import com.shinkson47.SplashX6.utility.Utility.createNoiseGenerator
import java.util.*

/**
 * # Creates [WorldTerrain] using perlin noise.
 * @author <a href="https://www.shinkson47.in">Jordan T. Gray on 29/06/2021</a>
 * @since PRE-ALPHA 0.0.2
 * @version 1
 */
object WorldTerrainGenerator {

    /**
     * # Perlin used for landmass
     *
     * Used to determine what parts of the map should be water or land.
     * @see com.shinkson47.SplashX6.game.world.WorldTerrain.SEA_LEVEL for altering the ratio of land to water.
     */
    private var ContinentalHeatmap: FastNoiseLite? = null

    private var BiomeHeatmap: FastNoiseLite? = null

    private var HeightHeatmap: FastNoiseLite? = null

    private var FoliageNoise: FastNoiseLite? = null

    private var worldInProgress : WorldTerrain? = null

    /**
     * Creates a new world, and returns it.
     * @return the generated world
     */
    fun create(): WorldTerrain = generateWorld(DEFAULT_WIDTH, DEFAULT_HEIGHT)

    //=====================================
    //#region Generation operations
    //=====================================

    /**
     * <h2>Replaces and content in this world with a newly generated one</h2>
     * @param w Width of the new world to generate. Must be positive.
     * @param h Width of the new world to generate. Must be positive
     */
    fun generateWorld(w: Int, h: Int) : WorldTerrain {
        // Ensure that the size is at least the minimum permitted size.
        val w = w.coerceAtLeast(MIN_WORLD_WIDTH)
        val h = h.coerceAtLeast(MIN_WORLD_HEIGHT)

        // Prepare to generate. Clear data, new arrays, new noise generators.
        genPre(w, h)

        // generate a basic world
        genBase()

        // Generate tile blending
        genInterpolate()

        // Generate hills, mountains and volcanoes
        genHeight();
        genFoliage()

        // Generate wonders, and any other misc world items.
        //genMisc();

        // Generate resources
        //genResources();

        // Generate civilisations & barbarians
        //genPopulation();

        // Construct all generated world data into a GDX TiledMap.
        //convGDX();

        genPathfindingData()

        cleanup()

        return worldInProgress!!
    }


    //#region Generation operations
    /**
     * <h2>Pregeneration configuration</h2>
     * Clears world, creates cavas of spedified size, resets offset, creates new noise generators
     * @param w Width of the map (in tiles)
     * @param h Height of the map (in tiles)
     */
    private fun genPre(w: Int, h: Int) {
        worldInProgress     = WorldTerrain(w,h)
        FoliageNoise        = createNoiseGenerator()
        ContinentalHeatmap  = createNoiseGenerator()
        BiomeHeatmap        = createNoiseGenerator()
        HeightHeatmap       = createNoiseGenerator()
    }

    private fun cleanup() {
        FoliageNoise        = null
        ContinentalHeatmap  = null
        BiomeHeatmap        = null
        HeightHeatmap       = null
    }


    //#region Generation operations
    /**
     * <h2>Generates the base of the world's tiles</h2>
     * Creates water and land mass, where the landmass is modified by [com.shinkson47.SplashX6.game.world.WorldTerrain.getBiomeTile]
     */
    private fun genBase() {
        var f: Float

        with (worldInProgress!!.worldTiles) {
            for (y in this.indices)                             // For every x, y tile
                for (x in this[0].indices) {
                    f = ContinentalHeatmap!!.GetNoise(x.toFloat(), y.toFloat())
                    this[y][x] = Tile(                                  // Set this tile to...
                        if (f < SEA_LEVEL)                              // Will this tile be below sea level?
                            if (f < SEA_LEVEL - 0.2)                    // If lower than two points under sea level,
                                "o"                                     // Make ocean.
                            else
                                "s_s_s_s"                               // Otherwise shallow water.
                        else                                            // If it's on land, check it's height.
                                getBiomeTile(x, y)                      // Otherwise, set to appropriate biome tile.
                    )
                }
        }
    }

    /**
     * <h2>Determines what base tile should be used at x,y</h2>
     * @return the ground tile which should be according to [com.shinkson47.SplashX6.game.world.WorldTerrain.BiomeHeatmap]
     */
    private fun getBiomeTile(x: Int, y: Int) : String {
        return when (BiomeHeatmap!!.GetNoise(x.toFloat(), y.toFloat())) {
            in  0f    ..  -0.8f   -> "d_d_d_d"
            in -0.8f  ..   0.8f   -> "g_g_g_g"
            in  0.8f  ..   0.801f -> "p_p_p_p"
            in  0.801f ..   0.9f   -> "t_t_t_t"
            else -> "a_a_a_a"
        }
    }


    /**
     * <h2>Blends tile boundaries within the world</h2>
     * Interpolates the tiles in [com.shinkson47.SplashX6.game.world.WorldTerrain.worldTiles] using [Tile.interpolate]
     * @see Tile.interpolate
     */
    private fun genInterpolate() {
        with (worldInProgress!!) {
            for (y in worldTiles.indices)  // For every tile,
                for (x in worldTiles[0].indices) {
                    worldTiles[y][x] =
                        worldTiles[y][x]!!.interpolate( // Interpolate with those around it.
                            getStaggeredTile(x, y - 1),
                            getStaggeredTile(x + 1, y - 1),
                            getStaggeredTile(x + 1, y + 1),
                            getStaggeredTile(x, y + 1)
                        )
                }
        }
    }

    private fun genHeight() {
        with (worldInProgress!!) {
            for (y in heightTiles.indices)  // For every tile,
                for (x in heightTiles[0].indices)
                    if (worldTiles[y][x]!!.isLand && HeightHeatmap!!.GetNoise(y.toFloat(),x.toFloat()) > HILL_LEVEL)
                        heightTiles[y][x] = Tile("hills.1_1_1_1")

            for (y in heightTiles.indices)
                for (x in heightTiles[0].indices)
                    heightTiles[y][x]?.let {
                                heightTiles[y][x] = it.interpolateHill(
                                    getStaggeredTile(x, y - 1),
                                    getStaggeredTile(x + 1, y - 1),
                                    getStaggeredTile(x + 1, y + 1),
                                    getStaggeredTile(x, y + 1)
                                )
                    }
        }
    }

    private fun genFoliage() {
        var x: Int
        var y: Int
        var s: String

        with(worldInProgress!!) {
            for (i in 0..FOLIAGE_QUANTITY_MAX) {
                x = MathUtils.random(0, height - 1)
                y = MathUtils.random(0, width - 1)
                s = getFoliageTile(worldTiles[y][x]!!.tileName)
                if (s != "") FoliageLayerTiles[y][x] = Tile(s + "1")
            }
        }
    }

    private fun getFoliageTile(s: String): String {
        return when (s) {
            "d_d_d_d" -> "cactus0"
            "g_g_g_g" -> "grasses0"
            "p_p_p_p" -> "bigtree0"
            "t_t_t_t" -> "bush0"
            "a_a_a_a" -> ""
            else -> ""
        }
    }

    private  fun genPathfindingData() {
        NavigationDataMiscStage().execute(worldInProgress!!)
    }



    //=====================================
    //#endregion Generation operations
    //=====================================
}