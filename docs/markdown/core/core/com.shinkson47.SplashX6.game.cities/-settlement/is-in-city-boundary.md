//[core](../../../index.md)/[com.shinkson47.SplashX6.game.cities](../index.md)/[Settlement](index.md)/[isInCityBoundary](is-in-city-boundary.md)

# isInCityBoundary

[jvm]\
fun [isInCityBoundary](is-in-city-boundary.md)(vec: Vector2): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)

Returns true if the given iso vector is within the boundary.

In other words, returns true if this city owns that tile.

The boundary (border) between land that is and isn't owned by this settlement is determined by the [isoVec](iso-vec.md) of this settlement, and radius which defines the gap between settlement and the border.

[jvm]\
fun [isInCityBoundary](is-in-city-boundary.md)(x: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), y: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)
