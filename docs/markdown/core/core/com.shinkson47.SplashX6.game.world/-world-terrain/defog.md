//[core](../../../index.md)/[com.shinkson47.SplashX6.game.world](../index.md)/[WorldTerrain](index.md)/[defog](defog.md)

# defog

[jvm]\
fun [defog](defog.md)(x: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), y: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), radius: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html))

<h2>
Removes the 'fog of war' area around a given point and radius. </h2>

Achieved by using WorldTerrain.createCell to insert cells from the [WorldTerrain.worldTiles](world-tiles.md) memory into WorldTerrain.LerpedTileLayer to the displayable map.

## Parameters

jvm

| | |
|---|---|
| x | Positition of the center |
| y | Positition of the center |
| radius | Size of the area to de-fog. |
