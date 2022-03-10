//[core](../../../index.md)/[com.shinkson47.SplashX6.rendering](../index.md)/[Camera](index.md)

# Camera

[jvm]\
class [Camera](index.md) : PerspectiveCamera

# Camera used to render the game world

#### Author

[Jordan T. Gray](https://www.shinkson47.in) on 02/05/2021

#### Since

v1

## Constructors

| | |
|---|---|
| [Camera](-camera.md) | [jvm]<br>fun [Camera](-camera.md)() |

## Types

| Name | Summary |
|---|---|
| [Companion](-companion/index.md) | [jvm]<br>object [Companion](-companion/index.md) |

## Functions

| Name | Summary |
|---|---|
| [AssertInBounds](-assert-in-bounds.md) | [jvm]<br>fun [AssertInBounds](-assert-in-bounds.md)()<br>Moves the camera if it needs to in order to make sure viewport is not out of the world. |
| [boost](boost.md) | [jvm]<br>fun [boost](boost.md)(b: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)) |
| [cacheFrustumValues](cache-frustum-values.md) | [jvm]<br>fun [cacheFrustumValues](cache-frustum-values.md)() |
| [deltaPosition](delta-position.md) | [jvm]<br>fun [deltaPosition](delta-position.md)(x: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), y: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)): Vector3 |
| [deltaTilt](delta-tilt.md) | [jvm]<br>fun [deltaTilt](delta-tilt.md)(delta: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)) |
| [deltaZoom](delta-zoom.md) | [jvm]<br>fun [deltaZoom](delta-zoom.md)(delta: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)) |
| [distanceFromY](distance-from-y.md) | [jvm]<br>fun [distanceFromY](distance-from-y.md)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [down](down.md) | [jvm]<br>fun [down](down.md)() |
| [getCam](get-cam.md) | [jvm]<br>~~fun~~ [~~getCam~~](get-cam.md)~~(~~~~)~~~~:~~ PerspectiveCamera |
| [getPickRay](index.md#984255830%2FFunctions%2F971615585) | [jvm]<br>open fun [getPickRay](index.md#984255830%2FFunctions%2F971615585)(p0: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), p1: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)): Ray<br>open fun [getPickRay](index.md#-976600490%2FFunctions%2F971615585)(p0: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), p1: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), p2: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), p3: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), p4: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), p5: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)): Ray |
| [goTo](go-to.md) | [jvm]<br>fun [goTo](go-to.md)(position: Vector3)<br>fun [goTo](go-to.md)(x: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), y: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)) |
| [left](left.md) | [jvm]<br>fun [left](left.md)() |
| [lookAt](index.md#360684211%2FFunctions%2F971615585) | [jvm]<br>open fun [lookAt](index.md#360684211%2FFunctions%2F971615585)(p0: Vector3)<br>open fun [lookAt](index.md#554153083%2FFunctions%2F971615585)(p0: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), p1: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), p2: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)) |
| [lookingAtY](looking-at-y.md) | [jvm]<br>fun [lookingAtY](looking-at-y.md)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [normalizeUp](index.md#1190240950%2FFunctions%2F971615585) | [jvm]<br>open fun [normalizeUp](index.md#1190240950%2FFunctions%2F971615585)() |
| [project](index.md#-1641208712%2FFunctions%2F971615585) | [jvm]<br>open fun [project](index.md#-1641208712%2FFunctions%2F971615585)(p0: Vector3): Vector3<br>open fun [project](index.md#751496312%2FFunctions%2F971615585)(p0: Vector3, p1: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), p2: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), p3: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), p4: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)): Vector3 |
| [resize](resize.md) | [jvm]<br>fun [resize](resize.md)(width: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), height: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)) |
| [right](right.md) | [jvm]<br>fun [right](right.md)() |
| [rotate](index.md#1045047161%2FFunctions%2F971615585) | [jvm]<br>open fun [rotate](index.md#1045047161%2FFunctions%2F971615585)(p0: Matrix4)<br>open fun [rotate](index.md#-2070477832%2FFunctions%2F971615585)(p0: Quaternion)<br>open fun [rotate](index.md#560013044%2FFunctions%2F971615585)(p0: Vector3, p1: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html))<br>open fun [rotate](index.md#2082321822%2FFunctions%2F971615585)(p0: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), p1: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), p2: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), p3: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)) |
| [rotateAround](index.md#-139976343%2FFunctions%2F971615585) | [jvm]<br>open fun [rotateAround](index.md#-139976343%2FFunctions%2F971615585)(p0: Vector3, p1: Vector3, p2: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)) |
| [setDesiredPosition](set-desired-position.md) | [jvm]<br>fun [setDesiredPosition](set-desired-position.md)(x: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), y: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html))<br>ignores z. |
| [toggleMovement](toggle-movement.md) | [jvm]<br>fun [toggleMovement](toggle-movement.md)() |
| [transform](index.md#675407912%2FFunctions%2F971615585) | [jvm]<br>open fun [transform](index.md#675407912%2FFunctions%2F971615585)(p0: Matrix4) |
| [translate](index.md#898155821%2FFunctions%2F971615585) | [jvm]<br>open fun [translate](index.md#898155821%2FFunctions%2F971615585)(p0: Vector3)<br>open fun [translate](index.md#1923986241%2FFunctions%2F971615585)(p0: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), p1: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), p2: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)) |
| [unproject](index.md#1845911743%2FFunctions%2F971615585) | [jvm]<br>open fun [unproject](index.md#1845911743%2FFunctions%2F971615585)(p0: Vector3): Vector3<br>open fun [unproject](index.md#-553295041%2FFunctions%2F971615585)(p0: Vector3, p1: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), p2: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), p3: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), p4: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)): Vector3 |
| [up](up.md) | [jvm]<br>fun [up](up.md)() |
| [update](update.md) | [jvm]<br>open override fun [update](update.md)()<br>open override fun [update](index.md#-1560428382%2FFunctions%2F971615585)(p0: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)) |
| [yFromAngle](y-from-angle.md) | [jvm]<br>fun [yFromAngle](y-from-angle.md)(angle: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)<br>[jvm]<br>fun [yFromAngle](y-from-angle.md)(angle: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), y: [Double](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)<br>We can't directly rotate the camera, we can only tell it to look at a point. |

## Properties

| Name | Summary |
|---|---|
| [combined](index.md#1098334071%2FProperties%2F971615585) | [jvm]<br>val [combined](index.md#1098334071%2FProperties%2F971615585): Matrix4 |
| [desiredPosition](desired-position.md) | [jvm]<br>val [desiredPosition](desired-position.md): [lerpDesire](../../com.shinkson47.SplashX6.utility/lerp-desire/index.md)&lt;Vector3&gt; |
| [desiredRotation](desired-rotation.md) | [jvm]<br>val [desiredRotation](desired-rotation.md): [lerpDesire](../../com.shinkson47.SplashX6.utility/lerp-desire/index.md)&lt;[Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)&gt; |
| [desiredTilt](desired-tilt.md) | [jvm]<br>val [desiredTilt](desired-tilt.md): [lerpDesire](../../com.shinkson47.SplashX6.utility/lerp-desire/index.md)&lt;[Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)&gt; |
| [desiredZoom](desired-zoom.md) | [jvm]<br>val [desiredZoom](desired-zoom.md): [lerpDesire](../../com.shinkson47.SplashX6.utility/lerp-desire/index.md)&lt;[Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)&gt; |
| [direction](index.md#-1596107297%2FProperties%2F971615585) | [jvm]<br>val [direction](index.md#-1596107297%2FProperties%2F971615585): Vector3 |
| [dragMultiplier](drag-multiplier.md) | [jvm]<br>var [dragMultiplier](drag-multiplier.md): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) = 10.0f<br>Essentially changes how sensitive the movement is to the mouse drag |
| [enableMove](enable-move.md) | [jvm]<br>var [enableMove](enable-move.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = true |
| [enableMoveTilt](enable-move-tilt.md) | [jvm]<br>var [enableMoveTilt](enable-move-tilt.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = false |
| [enableZoomTilt](enable-zoom-tilt.md) | [jvm]<br>var [enableZoomTilt](enable-zoom-tilt.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = true |
| [far](index.md#-1387302393%2FProperties%2F971615585) | [jvm]<br>val [far](index.md#-1387302393%2FProperties%2F971615585): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) |
| [fieldOfView](index.md#1482143326%2FProperties%2F971615585) | [jvm]<br>val [fieldOfView](index.md#1482143326%2FProperties%2F971615585): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) |
| [frustum](index.md#-2089380452%2FProperties%2F971615585) | [jvm]<br>val [frustum](index.md#-2089380452%2FProperties%2F971615585): Frustum |
| [invProjectionView](index.md#1390069561%2FProperties%2F971615585) | [jvm]<br>val [invProjectionView](index.md#1390069561%2FProperties%2F971615585): Matrix4 |
| [moveSpeed](move-speed.md) | [jvm]<br>var [moveSpeed](move-speed.md): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) = 0.1f<br>Defines the speed the camera zooms towards the desired position. |
| [near](index.md#-1753102540%2FProperties%2F971615585) | [jvm]<br>val [near](index.md#-1753102540%2FProperties%2F971615585): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) |
| [position](index.md#-1986346541%2FProperties%2F971615585) | [jvm]<br>val [position](index.md#-1986346541%2FProperties%2F971615585): Vector3 |
| [projection](index.md#1875819437%2FProperties%2F971615585) | [jvm]<br>val [projection](index.md#1875819437%2FProperties%2F971615585): Matrix4 |
| [tiltMultiplier](tilt-multiplier.md) | [jvm]<br>var [tiltMultiplier](tilt-multiplier.md): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) = 0.5f<br>Essentially changes how sensitive the tilt is with the zoom |
| [tmp](index.md#1508580893%2FProperties%2F971615585) | [jvm]<br>val [tmp](index.md#1508580893%2FProperties%2F971615585): Vector3 |
| [up](index.md#-2107542559%2FProperties%2F971615585) | [jvm]<br>val [up](index.md#-2107542559%2FProperties%2F971615585): Vector3 |
| [view](index.md#-1815614633%2FProperties%2F971615585) | [jvm]<br>val [view](index.md#-1815614633%2FProperties%2F971615585): Matrix4 |
| [viewportHeight](index.md#1096186575%2FProperties%2F971615585) | [jvm]<br>val [viewportHeight](index.md#1096186575%2FProperties%2F971615585): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) |
| [viewportWidth](index.md#352064318%2FProperties%2F971615585) | [jvm]<br>val [viewportWidth](index.md#352064318%2FProperties%2F971615585): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) |
| [zoomMultiplier](zoom-multiplier.md) | [jvm]<br>var [zoomMultiplier](zoom-multiplier.md): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) = 5.0f<br>Essentially changes how sensitive the camera's zoom is to the scroll wheel. |
| [zoomSpeed](zoom-speed.md) | [jvm]<br>var [zoomSpeed](zoom-speed.md): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) = 0.1f<br>Defines the speed the camera zooms towards the desired pov. |
