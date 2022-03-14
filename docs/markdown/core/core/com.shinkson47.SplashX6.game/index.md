//[core](../../index.md)/[com.shinkson47.SplashX6.game](index.md)

# Package com.shinkson47.SplashX6.game

## Types

| Name | Summary |
|---|---|
| [_GameData](_-game-data/index.md) | [jvm]<br>class [_GameData](_-game-data/index.md) : [PartiallySerializable](../com.shinkson47.SplashX6.utility/-partially-serializable/index.md) |
| [Advancement](-advancement/index.md) | [jvm]<br>class [Advancement](-advancement/index.md)(name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), parent: [Advancement](-advancement/index.md)?, requires: Array&lt;[Advancement](-advancement/index.md)&gt;, complete: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)) |
| [AdvancementTree](-advancement-tree/index.md) | [jvm]<br>class [AdvancementTree](-advancement-tree/index.md)(data: [HashMap](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-hash-map/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), *&gt;) : [ArrayList](https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html)&lt;[Advancement](-advancement/index.md)&gt; <br>A linked list data structure representing a tree of things which can be advanced. |
| [GameEndConditionChecker](-game-end-condition-checker/index.md) | [jvm]<br>object [GameEndConditionChecker](-game-end-condition-checker/index.md) : [TurnHook](../com.shinkson47.SplashX6.utility/-turn-hook/index.md) |
| [GameHypervisor](-game-hypervisor/index.md) | [jvm]<br>object [GameHypervisor](-game-hypervisor/index.md)<br>Manages and handles all interactions with the current game from the client. |
| [Nation](-nation/index.md) | [jvm]<br>class [Nation](-nation/index.md)(nationType: [NationType](-nation-type/index.md), ai: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)) : [Serializable](https://docs.oracle.com/javase/8/docs/api/java/io/Serializable.html), [TurnHook](../com.shinkson47.SplashX6.utility/-turn-hook/index.md)<br>Or since a player has control over one nation, it can be interpreted that this container represents all the data of a single player. |
| [NationType](-nation-type/index.md) | [jvm]<br>enum [NationType](-nation-type/index.md) : [Enum](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-enum/index.html)&lt;[NationType](-nation-type/index.md)&gt; |

## Properties

| Name | Summary |
|---|---|
| [GameData](-game-data.md) | [jvm]<br>@[JvmField](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-field/index.html)<br>var [GameData](-game-data.md): [_GameData](_-game-data/index.md)<br>Is serializable so that a game data container can be saved to disk and reloaded. |
