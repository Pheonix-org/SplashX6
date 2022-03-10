//[core](../../../index.md)/[com.shinkson47.SplashX6.rendering](../index.md)/[Camera](index.md)/[zoomMultiplier](zoom-multiplier.md)

# zoomMultiplier

[jvm]\
var [zoomMultiplier](zoom-multiplier.md): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) = 5.0f

# Multiplies how much a delta zoom affects the pov.

Essentially changes how sensitive the camera's zoom is to the scroll wheel.

fov = fov + (delta * zoomMultiplier)
