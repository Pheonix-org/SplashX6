package com.shinkson47.SplashX6.game.world.generation

import com.shinkson47.SplashX6.Client
import com.shinkson47.SplashX6.game.world.WorldTerrain
import com.shinkson47.SplashX6.game.world.generation.stages.*

/**
 * # TODO
 * @author [Jordan T. Gray](https://www.shinkson47.in) on 30/06/2021
 * @since v1
 * @version 1
 */
object Generator {

    // TODO resources used by world generation stages are never released.
    // ram is used to hold fnl and stage instances when generation is not being performed.

    val stages : Array<WorldGenerationStage> =
        arrayOf(
            // Create base world. Just water and land.
            NoiseBaseStage(),

            // Modify base with interesting stuff.
            VoronoiBiomeModStage(),
            HeightModStage(),

            // Polish up.
            NavigationDataMiscStage(),
            InterpolationModStage()
        )

    // STOPSHIP: 03/07/2021 Debug only.
    // Stripped down world generation for quicker terrain gen testing.
    val fastBuildStages : Array<WorldGenerationStage> =
        arrayOf(
            // Create base world. Just water and land.
            NoiseBaseStage(),

            // Modify base with interesting stuff.
            VoronoiBiomeModStage(),
        )

    var fastBuild = false

    fun doYourThing() : WorldTerrain {
        val terrain = WorldTerrain()

        if (!fastBuild)
            stages.forEach { it.execute(terrain) }
        else
            fastBuildStages.forEach { it.execute(terrain) }

        if (Client.DEBUG_MODE)
            terrain.defogAll()

        return terrain
    }
}