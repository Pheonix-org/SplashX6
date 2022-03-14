//[core](../../../index.md)/[com.shinkson47.SplashX6.utility](../index.md)/[PartiallySerializable](index.md)

# PartiallySerializable

[jvm]\
interface [PartiallySerializable](index.md) : [Serializable](https://docs.oracle.com/javase/8/docs/api/java/io/Serializable.html)

A serializable class with transient properties.

For use when you want to serialize a class which contains things that are not serializable.

Provides a deserialization method to reconstruct transient properties. It's up the implementation to figure out how.

#### Author

[Jordan T. Gray](https://www.shinkson47.in) on 03/02/2022

## Functions

| Name | Summary |
|---|---|
| [deserialize](deserialize.md) | [jvm]<br>abstract fun [deserialize](deserialize.md)() |

## Inheritors

| Name |
|---|
| [WorldTerrain](../../com.shinkson47.SplashX6.game.world/-world-terrain/index.md) |
| [_GameData](../../com.shinkson47.SplashX6.game/_-game-data/index.md) |
| [Settlement](../../com.shinkson47.SplashX6.game.cities/-settlement/index.md) |
| [Unit](../../com.shinkson47.SplashX6.game.units/-unit/index.md) |
