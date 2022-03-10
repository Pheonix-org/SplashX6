//[core](../../index.md)/[com.shinkson47.SplashX6.game.world.generation](index.md)

# Package com.shinkson47.SplashX6.game.world.generation

## Types

| Name | Summary |
|---|---|
| [BaseGenerationStage](-base-generation-stage/index.md) | [jvm]<br>abstract class [BaseGenerationStage](-base-generation-stage/index.md) : [WorldGenerationStage](-world-generation-stage/index.md)<br>i.e with water and continents / islands. |
| [Generator](-generator/index.md) | [jvm]<br>object [Generator](-generator/index.md)<br>Uses a [BaseGenerationStage](-base-generation-stage/index.md) to generate a base world, then a collection of [ModifyingGenerationStage](-modifying-generation-stage/index.md) to modify the base. |
| [MiscellaneousGenerationStage](-miscellaneous-generation-stage/index.md) | [jvm]<br>abstract class [MiscellaneousGenerationStage](-miscellaneous-generation-stage/index.md) : [WorldGenerationStage](-world-generation-stage/index.md)<br>i.e adds world borders, spawns structures or adds a navigation data layer. |
| [ModifyingGenerationStage](-modifying-generation-stage/index.md) | [jvm]<br>abstract class [ModifyingGenerationStage](-modifying-generation-stage/index.md) : [WorldGenerationStage](-world-generation-stage/index.md)<br>i.e by adding hills, foliage or structures. |
| [PresetTypes](-preset-types/index.md) | [jvm]<br>enum [PresetTypes](-preset-types/index.md) : [Enum](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-enum/index.html)&lt;[PresetTypes](-preset-types/index.md)&gt; |
| [WorldGenerationStage](-world-generation-stage/index.md) | [jvm]<br>abstract class [WorldGenerationStage](-world-generation-stage/index.md)<br>Defines a stage which does *something* to a given WorldTerain. |
