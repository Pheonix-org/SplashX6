//[core](../../../index.md)/[com.shinkson47.SplashX6.game.world.generation](../index.md)/[Generator](index.md)

# Generator

[jvm]\
object [Generator](index.md)

# X6's world generation system.

Uses a [BaseGenerationStage](../-base-generation-stage/index.md) to generate a base world, then a collection of [ModifyingGenerationStage](../-modifying-generation-stage/index.md) to modify the base.

#### Author

[Jordan T. Gray](https://www.shinkson47.in) on 30/06/2021

#### Since

PRE-ALPHA 0.0.2

## Functions

| Name | Summary |
|---|---|
| [doYourThing](do-your-thing.md) | [jvm]<br>fun [doYourThing](do-your-thing.md)(): [WorldTerrain](../../com.shinkson47.SplashX6.game.world/-world-terrain/index.md) |

## Properties

| Name | Summary |
|---|---|
| [fastBuild](fast-build.md) | [jvm]<br>var [fastBuild](fast-build.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = false |
| [fastBuildStages](fast-build-stages.md) | [jvm]<br>val [fastBuildStages](fast-build-stages.md): [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)&lt;[WorldGenerationStage](../-world-generation-stage/index.md)&gt; |
| [stages](stages.md) | [jvm]<br>val [stages](stages.md): [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)&lt;[WorldGenerationStage](../-world-generation-stage/index.md)&gt;<br>This list defines the stages involved with default world generation, and in what order they operate. |
