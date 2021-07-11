package com.shinkson47.SplashX6.game.world.generation.stages

import com.shinkson47.SplashX6.game.world.Tile
import com.shinkson47.SplashX6.game.world.WorldTerrain
import com.shinkson47.SplashX6.game.world.generation.GenerationCompanion
import com.shinkson47.SplashX6.game.world.generation.ModifyingGenerationStage

/**
 * # Modifies the terrain to add height
 * @author [Jordan T. Gray](https://www.shinkson47.in) on 03/07/2021
 * @since v1
 * @version 1
 */
class HeightModStage : ModifyingGenerationStage() {

    // TODO Height generation is not very good. Perhaps scale the noise? Check for large flat areas to modify height?
    override fun execute(it: WorldTerrain) {
        val noise =  GenerationCompanion.createNoiseGenerator()

        with (it) {
            putEachTile(heightTiles) { x, y, _ ->
                if (worldTiles[y][x]!!.isLand && worldTiles[y][x]!!.tileName == "g_g_g_g" && noise.GetNoise(y.toFloat(), x.toFloat()) > 0.7f)
                    Tile("hills.1_1_1_1")
                else
                    null
            }
        }
    }
}