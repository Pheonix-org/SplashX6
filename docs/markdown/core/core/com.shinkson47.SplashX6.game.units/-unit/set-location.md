//[core](../../../index.md)/[com.shinkson47.SplashX6.game.units](../index.md)/[Unit](index.md)/[setLocation](set-location.md)

# setLocation

[jvm]\
fun [setLocation](set-location.md)(_pos: Vector3): Vector3

# Sets the location of this sprite in iso space.

where x and y are iso co-ordinates, and are stored in isoX, isoY.

super.x and super.y store cartesian equivelants, which are calculated in [WorldTerrain.isoToCartesian](../../com.shinkson47.SplashX6.game.world/-world-terrain/-companion/iso-to-cartesian.md)

For a delta translation, see [deltaPosition](delta-position.md)

[jvm]\
~~fun~~ [~~setLocation~~](set-location.md)~~(~~~~x~~~~:~~ [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)~~,~~ ~~y~~~~:~~ [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)~~)~~~~:~~ Vector3

# Sets the location of this unit.

[jvm]\
fun [setLocation](set-location.md)(x: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), y: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): Vector3

# Moves this unit to the specified tile.

by updating the position of the underlying sprite.

This method will clamp the position to within the bounds of the world.

After the move, defogs area around new position.
