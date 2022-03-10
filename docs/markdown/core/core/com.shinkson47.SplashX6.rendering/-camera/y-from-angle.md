//[core](../../../index.md)/[com.shinkson47.SplashX6.rendering](../index.md)/[Camera](index.md)/[yFromAngle](y-from-angle.md)

# yFromAngle

[jvm]\
fun [yFromAngle](y-from-angle.md)(angle: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), y: [Double](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)

# Calculates the point on the y axis to look at to achieve the desired degrees of tilt

We can't directly rotate the camera, we can only tell it to look at a point.

So to make it rotate, we need to calculate the position to look at from the desired angle.

Better explained my [stack overflow research question](https://stackoverflow.com/questions/67386475/how-can-i-calculate-the-point-a-camera-is-looking-at-using-its-rotation?noredirect=1#67386712)

[jvm]\
fun [yFromAngle](y-from-angle.md)(angle: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)
