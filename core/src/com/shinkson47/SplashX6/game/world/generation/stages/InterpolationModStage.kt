package com.shinkson47.SplashX6.game.world.generation.stages

import com.shinkson47.SplashX6.game.world.WorldTerrain
import com.shinkson47.SplashX6.game.world.generation.ModifyingGenerationStage

/**
 * # Blends world tiles together
 * Replaces all tiles in the world with counterparts representing
 * those tiles afeter being blent with the surrounding ones.
 * @author [Jordan T. Gray](https://www.shinkson47.in) on 03/07/2021
 * @since PRE-ALPHA 0.0.2
 * @version 1
 */
class InterpolationModStage : ModifyingGenerationStage() {
    override fun execute(it: WorldTerrain){
        with (it) {
            putEachTile { x, y, _ ->
                    worldTiles[y][x]!!.interpolate(
                        getStaggeredTile(x, y - 1),
                        getStaggeredTile(x + 1, y - 1),
                        getStaggeredTile(x + 1, y + 1),
                        getStaggeredTile(x, y + 1)
                    )
            }
        }
    }
}
