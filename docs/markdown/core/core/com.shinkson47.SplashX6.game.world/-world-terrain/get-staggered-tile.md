//[core](../../../index.md)/[com.shinkson47.SplashX6.game.world](../index.md)/[WorldTerrain](index.md)/[getStaggeredTile](get-staggered-tile.md)

# getStaggeredTile

[jvm]\
fun [getStaggeredTile](get-staggered-tile.md)(x: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), y: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), source: [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)&lt;[Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)&lt;[Tile](../-tile/index.md)?&gt;&gt; = worldTiles): [Tile](../-tile/index.md)?

<h2>Gets the tile at x, y, offset to ignore the isometric row stagger</h2> Where on every odd y, x is shifted left by 1. <br></br>

<blockquote>
if y == odd then x -= 1;
</blockquote> *

<br></br> Useful when getting a tile relative to another.

<br></br><br></br> Let's pick a tile at [x](get-staggered-tile.md), and say we'd like to get the tile to it's north east side. <br></br><br></br> On screen, we could describe this position as *up and right*, or y+1 quite easily.

<br></br><br></br> However, since the rows stagger back and forth by one tile, we can't simply read the tile at x+1, y+1 from the array and get the tile we're after.

<br></br><br></br>That's what this method is for, it corrects for this stagger offset such that y+1 would always return the tile which can be seen to the north east side of another.

#### Return

if on an odd row, tile at raw array position [x - 1](get-staggered-tile.md), if even at [x](get-staggered-tile.md).
