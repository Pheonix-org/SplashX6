package com.shinkson47.SplashX6.game.world.generation

import com.shinkson47.SplashX6.game.world.WorldTerrain
import com.shinkson47.SplashX6.game.world.WorldTerrain.Companion.DEFAULT_HEIGHT
import com.shinkson47.SplashX6.game.world.WorldTerrain.Companion.DEFAULT_WIDTH
import com.shinkson47.SplashX6.game.world.WorldTerrainGenerator


/**
 * # Terrain generator that just uses the origional world generation code.
 * @author [Jordan T. Gray](https://www.shinkson47.in) on 30/06/2021
 * @since v1
 * @version 1
 */
class ClassicGenerator : WorldGenerationStage() {
    override fun execute(it: WorldTerrain) {
        WorldTerrainGenerator.generateWorld(DEFAULT_WIDTH, DEFAULT_HEIGHT)
    }
}