//[core](../../../index.md)/[com.shinkson47.SplashX6.game](../index.md)/[_GameData](index.md)

# _GameData

[jvm]\
class [_GameData](index.md) : [PartiallySerializable](../../com.shinkson47.SplashX6.utility/-partially-serializable/index.md)

## Functions

| Name | Summary |
|---|---|
| [clear](clear.md) | [jvm]<br>fun [clear](clear.md)()<br>Does not prompt or question the call, just clears all data. |
| [deserialize](deserialize.md) | [jvm]<br>open override fun [deserialize](deserialize.md)() |
| [networkSet](network-set.md) | [jvm]<br>fun [networkSet](network-set.md)(gameState: [_GameData](index.md)) |
| [new](new.md) | [jvm]<br>fun [new](new.md)()<br>New game subroutines that creates data required for a new game |

## Properties

| Name | Summary |
|---|---|
| [nations](nations.md) | [jvm]<br>@[JvmField](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-field/index.html)<br>var [nations](nations.md): [ArrayList](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-array-list/index.html)&lt;[Nation](../-nation/index.md)&gt; |
| [player](player.md) | [jvm]<br>@[JvmField](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-field/index.html)<br>var [player](player.md): [Nation](../-nation/index.md)? = null |
| [pref_civCount](pref_civ-count.md) | [jvm]<br>var [pref_civCount](pref_civ-count.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) = 3 |
| [pref_civType](pref_civ-type.md) | [jvm]<br>var [pref_civType](pref_civ-type.md): [NationType](../-nation-type/index.md) |
| [selectedUnit](selected-unit.md) | [jvm]<br>@[JvmField](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-field/index.html)<br>var [selectedUnit](selected-unit.md): [Unit](../../com.shinkson47.SplashX6.game.units/-unit/index.md)? = null |
| [world](world.md) | [jvm]<br>@[JvmField](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-field/index.html)<br>var [world](world.md): [WorldTerrain](../../com.shinkson47.SplashX6.game.world/-world-terrain/index.md)? = null |
