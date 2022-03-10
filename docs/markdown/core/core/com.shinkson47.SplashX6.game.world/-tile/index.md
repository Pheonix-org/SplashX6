//[core](../../../index.md)/[com.shinkson47.SplashX6.game.world](../index.md)/[Tile](index.md)

# Tile

[jvm]\
open class [Tile](index.md) : [Serializable](https://docs.oracle.com/javase/8/docs/api/java/io/Serializable.html)Pre GDX tile data. Represents a tile and it's data prior to converting data into a gdx compatable TiledMapTile for use in game. This will later act as a saveable container for data regarding a tile, since gdx tiledmaps are not serializable.

#### Author

Jordan Gray &Dylan Brand 23/03/2021

## Constructors

| | |
|---|---|
| [Tile](-tile.md) | [jvm]<br>open fun [Tile](-tile.md)(TileName: [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)) |
| [Tile](-tile.md) | [jvm]<br>open fun [Tile](-tile.md)(_north: [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html), _east: [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html), _south: [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html), _west: [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)) |

## Functions

| Name | Summary |
|---|---|
| [interpolate](interpolate.md) | [jvm]<br>open fun [interpolate](interpolate.md)(sw: [Tile](index.md), se: [Tile](index.md), ne: [Tile](index.md), nw: [Tile](index.md)): [Tile](index.md)<br>Returns a tile that represent this one after being blended with provided tiles |
| [interpolateHill](interpolate-hill.md) | [jvm]<br>open fun [interpolateHill](interpolate-hill.md)(nw: [Tile](index.md), ne: [Tile](index.md), se: [Tile](index.md), sw: [Tile](index.md)): [Tile](index.md)<br>Returns a tile that represents a hill merged with the surrounding terrain. |
| [isLand](is-land.md) | [jvm]<br>open fun [isLand](is-land.md)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [isWater](is-water.md) | [jvm]<br>open fun [isWater](is-water.md)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |

## Properties

| Name | Summary |
|---|---|
| [east](east.md) | [jvm]<br>open val [east](east.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |
| [isBase](is-base.md) | [jvm]<br>open val [isBase](is-base.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>idk anymore man |
| [north](north.md) | [jvm]<br>open val [north](north.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)<br>Strings that represent the quadrants of the tile, N/E/S/W |
| [OCEANS](-o-c-e-a-n-s.md) | [jvm]<br>val [OCEANS](-o-c-e-a-n-s.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)<br>Resource names for particular tile types |
| [south](south.md) | [jvm]<br>open val [south](south.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |
| [tileName](tile-name.md) | [jvm]<br>open val [tileName](tile-name.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)<br>Full resource name of this tile. |
| [WATER](-w-a-t-e-r.md) | [jvm]<br>val [WATER](-w-a-t-e-r.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |
| [west](west.md) | [jvm]<br>open val [west](west.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |
