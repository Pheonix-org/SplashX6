//[core](../../../index.md)/[com.shinkson47.SplashX6.game.world.generation](../index.md)/[ModifyingGenerationStage](index.md)

# ModifyingGenerationStage

[jvm]\
abstract class [ModifyingGenerationStage](index.md) : [WorldGenerationStage](../-world-generation-stage/index.md)

# A world generation stage which modifies a base world in some way

i.e by adding hills, foliage or structures.

## Constructors

| | |
|---|---|
| [ModifyingGenerationStage](-modifying-generation-stage.md) | [jvm]<br>fun [ModifyingGenerationStage](-modifying-generation-stage.md)() |

## Functions

| Name | Summary |
|---|---|
| [execute](../-world-generation-stage/execute.md) | [jvm]<br>abstract fun [execute](../-world-generation-stage/execute.md)(it: [WorldTerrain](../../com.shinkson47.SplashX6.game.world/-world-terrain/index.md)) |

## Inheritors

| Name |
|---|
| [HeightModStage](../../com.shinkson47.SplashX6.game.world.generation.stages/-height-mod-stage/index.md) |
| [InterpolationModStage](../../com.shinkson47.SplashX6.game.world.generation.stages/-interpolation-mod-stage/index.md) |
| [ShittyFoliageGenerator](../../com.shinkson47.SplashX6.game.world.generation.stages/-shitty-foliage-generator/index.md) |
| [VoronoiBiomeModStage](../../com.shinkson47.SplashX6.game.world.generation.stages/-voronoi-biome-mod-stage/index.md) |
