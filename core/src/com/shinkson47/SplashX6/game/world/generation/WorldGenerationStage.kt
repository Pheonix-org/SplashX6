package com.shinkson47.SplashX6.game.world.generation

import com.badlogic.gdx.math.MathUtils
import com.shinkson47.SplashX6.game.world.FastNoiseLite
import com.shinkson47.SplashX6.game.world.WorldTerrain

/**
 * # Encompasses all steps involved with generating the world.
 * @author [Jordan T. Gray](https://www.shinkson47.in) on 03/07/2021
 * @since PRE-ALPHA 0.0.2
 * @version 1
 */
abstract class WorldGenerationStage {
    abstract fun execute(it: WorldTerrain)
}


/**
 * # A world generation stage which generates the base of the world
 * i.e with water and continents / islands.
 *
 * This base is the modified by [ModifyingGenerationStage]'s.
 */
abstract class BaseGenerationStage : WorldGenerationStage()

/**
 * # A world generation stage which modifies a base world in some way
 * i.e by adding hills, foliage or structures.
 */
abstract class ModifyingGenerationStage : WorldGenerationStage()


/**
 * # A world generation stage which is applied after the landscape has been generated.
 * i.e adds world borders, spawns structures or adds a navigation data layer.
 */
abstract class MiscellaneousGenerationStage : WorldGenerationStage()

internal object GenerationCompanion {



    /**
     * # Width of tiles in pixels
     */
    const val TILE_WIDTH = 64

    /**
     * # Height of tiles in pixels
     */
    const val TILE_HEIGHT = 32

    /**
     * # Half height of tiles in pixels
     */
    const val TILE_HALF_HEIGHT = TILE_HEIGHT / 2

    /**
     * # Half width of tiles in pixels
     */
    const val TILE_HALF_WIDTH = TILE_WIDTH / 2

    /**
     * # Level of noise at which terrain is treated as land.
     *
     * Between -1 and 1.
     *
     * Any area of the map higher than this value will
     * be treated as land, lower is water.
     */
    const val SEA_LEVEL = 0f

    @JvmField var HILL_LEVEL = 0.48f
    @JvmField var MOUNTAIN_LEVEL = 0.729f

    /**
     * FastNoiseLite noise frequency for height generation.
     */
    @JvmField var heightFrequency = 0.08f

    /**
     * # The smallest permitted world width
     */
    const val MIN_WORLD_WIDTH = 6

    /**
     * # The smallest permitted world height
     */
    const val MIN_WORLD_HEIGHT = 6

    /**
     * # The default world width
     */
    const val DEFAULT_WIDTH = 500

    /**
     * # The smallest permitted world size
     */
    const val DEFAULT_HEIGHT = 500

    /**
     * # The smallest permitted world size
     */
    const val FOLIAGE_QUANTITY_MAX = 10000

    private var hittestResult = 0

    @JvmField var fractalGain = 0.5f
    @JvmField var fractalLacunarity = 2.0f
    @JvmField var fractalFrequency = 0.01f
    @JvmField var fractalStrength = 0f
    @JvmField var pingPongStrength = 2.0f
    @JvmField var fractalOctaves = 3
    @JvmField var noiseType = FastNoiseLite.NoiseType.OpenSimplex2
    @JvmField var fractalType = FastNoiseLite.FractalType.FBm
    @JvmField var cellularDistanceFunction = FastNoiseLite.CellularDistanceFunction.Euclidean


    /**
     * # Creates a new OpenSimplex2 perlin noise generator with a random seed.
     */
    // TODO fetch seed from world.
    fun createNoiseGenerator(): FastNoiseLite {
        val l = FastNoiseLite()
        l.SetNoiseType   (noiseType)
        l.SetFractalGain (fractalGain)

        l.SetCellularDistanceFunction (cellularDistanceFunction)

        l.SetFractalType (fractalType)
        l.SetFractalLacunarity(fractalLacunarity)
        l.SetFractalOctaves(fractalOctaves)
        l.SetFrequency(fractalFrequency)
        l.SetFractalWeightedStrength(fractalStrength)

        l.SetFractalPingPongStrength(pingPongStrength)

        l.SetSeed(1)
        return l
    }
}