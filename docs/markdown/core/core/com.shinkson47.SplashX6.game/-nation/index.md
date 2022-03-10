//[core](../../../index.md)/[com.shinkson47.SplashX6.game](../index.md)/[Nation](index.md)

# Nation

[jvm]\
class [Nation](index.md)(nationType: [NationType](../-nation-type/index.md), ai: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)) : [Serializable](https://docs.oracle.com/javase/8/docs/api/java/io/Serializable.html), [TurnHook](../../com.shinkson47.SplashX6.utility/-turn-hook/index.md)

# A container representing an entire nation.

Or since a player has control over one nation, it can be interpreted that this container represents all the data of a single player.

## Constructors

| | |
|---|---|
| [Nation](-nation.md) | [jvm]<br>fun [Nation](-nation.md)(nationType: [NationType](../-nation-type/index.md), ai: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = false) |

## Types

| Name | Summary |
|---|---|
| [Companion](-companion/index.md) | [jvm]<br>object [Companion](-companion/index.md) |

## Functions

| Name | Summary |
|---|---|
| [addUnit](add-unit.md) | [jvm]<br>fun [addUnit](add-unit.md)(u: [Unit](../../com.shinkson47.SplashX6.game.units/-unit/index.md)) |
| [cityNames](city-names.md) | [jvm]<br>fun [cityNames](city-names.md)(): [ArrayList](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-array-list/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt; |
| [cityType](city-type.md) | [jvm]<br>fun [cityType](city-type.md)(): [CityType](../../com.shinkson47.SplashX6.game.cities/-city-type/index.md) |
| [data](data.md) | [jvm]<br>fun [data](data.md)(): [HashMap](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-hash-map/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), *&gt; |
| [doOnTurn](../../com.shinkson47.SplashX6.utility/-turn-hook/do-on-turn.md) | [jvm]<br>open fun [doOnTurn](../../com.shinkson47.SplashX6.utility/-turn-hook/do-on-turn.md)() |
| [onTurn](on-turn.md) | [jvm]<br>open override fun [onTurn](on-turn.md)() |
| [run](../../com.shinkson47.SplashX6.utility/-turn-hook/run.md) | [jvm]<br>~~open~~ ~~override~~ ~~fun~~ [~~run~~](../../com.shinkson47.SplashX6.utility/-turn-hook/run.md)~~(~~~~)~~ |
| [settle](settle.md) | [jvm]<br>fun [settle](settle.md)(position: Vector3) |
| [toString](to-string.md) | [jvm]<br>open override fun [toString](to-string.md)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |

## Properties

| Name | Summary |
|---|---|
| [ai](ai.md) | [jvm]<br>val [ai](ai.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = false |
| [nationType](nation-type.md) | [jvm]<br>val [nationType](nation-type.md): [NationType](../-nation-type/index.md)<br>The type of nation. |
| [settlements](settlements.md) | [jvm]<br>val [settlements](settlements.md): Array&lt;[Settlement](../../com.shinkson47.SplashX6.game.cities/-settlement/index.md)&gt; |
| [units](units.md) | [jvm]<br>var [units](units.md): Array&lt;[Unit](../../com.shinkson47.SplashX6.game.units/-unit/index.md)&gt; |
