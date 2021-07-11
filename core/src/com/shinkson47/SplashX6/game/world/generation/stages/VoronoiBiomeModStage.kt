package com.shinkson47.SplashX6.game.world.generation.stages

import com.badlogic.gdx.math.MathUtils
import com.shinkson47.SplashX6.game.world.*
import com.shinkson47.SplashX6.game.world.generation.ModifyingGenerationStage

/**
 * # Terrain Modifier that alters land with biomes.
 * @author [Jordan T. Gray](https://www.shinkson47.in) on 03/07/2021
 * @since v1
 * @version 1
 */
class VoronoiBiomeModStage() : ModifyingGenerationStage() {
    // TODO configurable voronoi scale here.
    // TODO configure between voronoi or noise.


    override fun execute(it: WorldTerrain) {
        Voronoi.Generate(500, it.seed)

        it.putEachTile { x, y, tile ->
            if (tile != null && tile.isLand)
                Tile(getBiomeTile(x, y))
            else
                tile
        }
    }


    // TODO can't keep using strings. Use enums, for the love of all that is holy.
    /**
     * <h2>Determines what base tile should be used at x, y</h2>
     * @return the ground tile which should be according to [com.shinkson47.SplashX6.game.world.WorldTerrain.BiomeHeatmap]
     */
    private fun getBiomeTile(x: Int, y: Int) : String {
        return when (Voronoi.eval(x, y)) {
            Biome.d -> "d_d_d_d" // Sand
            Biome.g -> "g_g_g_g" // Grass
            Biome.p -> "p_p_p_p" // Swampland
            Biome.t -> "t_t_t_t" // Stone
            else    -> "a_a_a_a" // Snow
        }
    }
}