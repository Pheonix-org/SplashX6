//[core](../../../index.md)/[com.shinkson47.SplashX6.game.world](../index.md)/[WorldTerrain](index.md)

# WorldTerrain

[jvm]\
class [WorldTerrain](index.md)(width: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), height: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) : TiledMap, [PartiallySerializable](../../com.shinkson47.SplashX6.utility/-partially-serializable/index.md)

# The terrain for a game world.

Does not contain unit etc that are in the world.

Container for terrain and terrain navigation data in both raw [Tile](../-tile/index.md) form (For generation, interpretation, and serialization) and TiledMap / TiledMapTileLayer form (for game engine & rendering).

n.b : TiledMap and it's layers are not serializable, hence this class is [PartiallySerializable](../../com.shinkson47.SplashX6.utility/-partially-serializable/index.md) and the Tiled components are transient. See [WorldTerrain.deserialize](deserialize.md).

#### Author

[Jordan T. Gray](https://www.shinkson47.in) on 29/06/2021

#### Since

PRE-ALPHA 0.0.1

## Constructors

| | |
|---|---|
| [WorldTerrain](-world-terrain.md) | [jvm]<br>fun [WorldTerrain](-world-terrain.md)() |
| [WorldTerrain](-world-terrain.md) | [jvm]<br>fun [WorldTerrain](-world-terrain.md)(width: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), height: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) |

## Types

| Name | Summary |
|---|---|
| [Companion](-companion/index.md) | [jvm]<br>object [Companion](-companion/index.md) |

## Functions

| Name | Summary |
|---|---|
| [defog](defog.md) | [jvm]<br>fun [defog](defog.md)(x: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), y: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), radius: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html))<br><h2> Removes the 'fog of war' area around a given point and radius. </h2> |
| [deserialize](deserialize.md) | [jvm]<br>override fun [deserialize](deserialize.md)()<br>Re-creates the world layers after loading this instance from stream. |
| [dispose](index.md#297727506%2FFunctions%2F971615585) | [jvm]<br>open override fun [dispose](index.md#297727506%2FFunctions%2F971615585)() |
| [forEachTile](for-each-tile.md) | [jvm]<br>fun [forEachTile](for-each-tile.md)(action: ([Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), [Tile](../-tile/index.md)?) -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html))<br>fun [forEachTile](for-each-tile.md)(source: [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)&lt;[Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)&lt;[Tile](../-tile/index.md)?&gt;&gt;, action: ([Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), [Tile](../-tile/index.md)?) -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)) |
| [getLayers](index.md#-188518699%2FFunctions%2F971615585) | [jvm]<br>open fun [getLayers](index.md#-188518699%2FFunctions%2F971615585)(): MapLayers |
| [getProperties](index.md#778648324%2FFunctions%2F971615585) | [jvm]<br>open fun [getProperties](index.md#778648324%2FFunctions%2F971615585)(): MapProperties |
| [getStaggeredTile](get-staggered-tile.md) | [jvm]<br>fun [getStaggeredTile](get-staggered-tile.md)(x: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), y: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), source: [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)&lt;[Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)&lt;[Tile](../-tile/index.md)?&gt;&gt; = worldTiles): [Tile](../-tile/index.md)?<br><h2>Gets the tile at x, y, offset to ignore the isometric row stagger</h2> Where on every odd y, x is shifted left by 1. <br></br> |
| [getTile](get-tile.md) | [jvm]<br>fun [getTile](get-tile.md)(vec: Vector3): [Tile](../-tile/index.md)?<br>[jvm]<br>fun [getTile](get-tile.md)(x: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), y: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), source: [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)&lt;[Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)&lt;[Tile](../-tile/index.md)?&gt;&gt; = worldTiles): [Tile](../-tile/index.md)?<br>Gets tile at x,y from the source. |
| [getTileSets](index.md#-91122340%2FFunctions%2F971615585) | [jvm]<br>open fun [getTileSets](index.md#-91122340%2FFunctions%2F971615585)(): TiledMapTileSets |
| [isInWorld](is-in-world.md) | [jvm]<br>fun [isInWorld](is-in-world.md)(vec: Vector2): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>fun [isInWorld](is-in-world.md)(vec: Vector3): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>fun [isInWorld](is-in-world.md)(x: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), y: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [isNavligable](is-navligable.md) | [jvm]<br>fun [isNavligable](is-navligable.md)(x: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), y: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [placeLayers](place-layers.md) | [jvm]<br>fun [placeLayers](place-layers.md)(base: TiledMapTileLayer?)<br>Removes and re-places all layers into the GDX map. |
| [putEachTile](put-each-tile.md) | [jvm]<br>fun [putEachTile](put-each-tile.md)(action: ([Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), [Tile](../-tile/index.md)?) -&gt; [Tile](../-tile/index.md)?)<br>fun [putEachTile](put-each-tile.md)(source: [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)&lt;[Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)&lt;[Tile](../-tile/index.md)?&gt;&gt;, action: ([Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), [Tile](../-tile/index.md)?) -&gt; [Tile](../-tile/index.md)?) |
| [randomPoint](random-point.md) | [jvm]<br>fun [randomPoint](random-point.md)(): Vector3 |
| [randomPointOnLand](random-point-on-land.md) | [jvm]<br>fun [randomPointOnLand](random-point-on-land.md)(): Vector3 |
| [removeFogOfWar](remove-fog-of-war.md) | [jvm]<br>fun [removeFogOfWar](remove-fog-of-war.md)()<br><h2> Converts all map data into a single, total, complete map. </h2> * |
| [setOwnedResources](index.md#-2091316652%2FFunctions%2F971615585) | [jvm]<br>open fun [setOwnedResources](index.md#-2091316652%2FFunctions%2F971615585)(p0: Array&lt;out Disposable&gt;) |
| [setTileSets](set-tile-sets.md) | [jvm]<br>fun [setTileSets](set-tile-sets.md)()<br><h2>Replaces all tilesets with those stored in Assets.TILESETS</h2> |
| [staticLight](static-light.md) | [jvm]<br>fun [staticLight](static-light.md)(vector2: Vector2, radius: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) = 400.0f): PointLight<br>fun [staticLight](static-light.md)(vector3: Vector3, radius: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) = 400.0f): PointLight<br>fun [staticLight](static-light.md)(x: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), y: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), radius: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) = 400.0f, rays: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) = 10): PointLight |

## Properties

| Name | Summary |
|---|---|
| [FoliageLayerTiles](-foliage-layer-tiles.md) | [jvm]<br>val [FoliageLayerTiles](-foliage-layer-tiles.md): [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)&lt;[Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)&lt;[Tile](../-tile/index.md)?&gt;&gt;<br>Note well : raw x and y are inverted. <c>worldTilex</c> |
| [height](height.md) | [jvm]<br>val [height](height.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [heightTiles](height-tiles.md) | [jvm]<br>val [heightTiles](height-tiles.md): [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)&lt;[Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)&lt;[Tile](../-tile/index.md)?&gt;&gt;<br>Note well : raw x and y are inverted. <c>worldTilex</c> |
| [navigationLayer](navigation-layer.md) | [jvm]<br>@[Transient](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-transient/index.html)<br>lateinit var [navigationLayer](navigation-layer.md): NavigationTiledMapLayer<br>Used for calculating navigation data when pathfinding. |
| [pathfinder](pathfinder.md) | [jvm]<br>@[Transient](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-transient/index.html)<br>lateinit var [pathfinder](pathfinder.md): AStarGridFinder&lt;GridCell&gt;<br>Usage : pathfinder.find(fromx, fromy, tox, toy, [WorldTerrain.navigationLayer](navigation-layer.md)). |
| [rayHandler](ray-handler.md) | [jvm]<br>val [rayHandler](ray-handler.md): RayHandler |
| [width](width.md) | [jvm]<br>val [width](width.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [world](world.md) | [jvm]<br>val [world](world.md): World |
| [worldTiles](world-tiles.md) | [jvm]<br>val [worldTiles](world-tiles.md): [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)&lt;[Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)&lt;[Tile](../-tile/index.md)?&gt;&gt;<br>Note well : raw x and y are inverted. <c>worldTilex</c> |
