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

/******************************************************************
 * Defines the architecture of the world generation system's stages.
 ******************************************************************/


package com.shinkson47.SplashX6.game.world.generation

import com.badlogic.gdx.math.MathUtils
import com.auburn.fastnoiselite.FastNoiseLite
import com.shinkson47.SplashX6.game.world.WorldTerrain

/**
 * # Encompasses all steps involved with generating the world.
 *
 * Defines a stage which does *something* to a given [WorldTerain].
 *
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
     * FastNoiseLite noise frequency for height generation.
     */
    @JvmField var heightFrequency = 0.08f

    @JvmField var fractalGain = 0.5f
    @JvmField var fractalLacunarity = 2.0f
    @JvmField var fractalFrequency = 0.01f
    @JvmField var fractalStrength = 0f
    @JvmField var pingPongStrength = 2.0f
    @JvmField var fractalOctaves = 3
    @JvmField var noiseType = FastNoiseLite.NoiseType.OpenSimplex2
    @JvmField var fractalType = FastNoiseLite.FractalType.FBm
    @JvmField var cellularDistanceFunction = FastNoiseLite.CellularDistanceFunction.Euclidean

    @JvmStatic var SEED : Int = 0
        get() = if (field == 0) {
            MathUtils.random(25565)
        } else {
            field
        }

    /**
     * # Creates a new OpenSimplex2 perlin noise generator with a random seed.
     */
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

        l.SetSeed(SEED)
        return l
    }
}