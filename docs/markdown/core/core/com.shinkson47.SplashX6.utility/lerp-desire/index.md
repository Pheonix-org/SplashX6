//[core](../../../index.md)/[com.shinkson47.SplashX6.utility](../index.md)/[lerpDesire](index.md)

# lerpDesire

[jvm]\
class [lerpDesire](index.md)&lt;[type](index.md)&gt;@[JvmOverloads](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-overloads/index.html)constructor(_present: [type](index.md), _desired: [type](index.md), _alpha: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html))

A floating point or 3D vector which moves closer to a desired value by [alpha](alpha.md) on every update.

TODO add support for vector 2.

#### Author

[Jordan T. Gray](https://www.shinkson47.in) on 04/05/2021

#### Since

v1

## Constructors

| | |
|---|---|
| [lerpDesire](lerp-desire.md) | [jvm]<br>fun &lt;[type](index.md)&gt; [lerpDesire](lerp-desire.md)(_value: [type](index.md)) |
| [lerpDesire](lerp-desire.md) | [jvm]<br>fun &lt;[type](index.md)&gt; [lerpDesire](lerp-desire.md)(_value: [type](index.md), _alpha: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)) |
| [lerpDesire](lerp-desire.md) | [jvm]<br>@[JvmOverloads](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-overloads/index.html)<br>fun &lt;[type](index.md)&gt; [lerpDesire](lerp-desire.md)(_present: [type](index.md), _desired: [type](index.md), _alpha: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) = 0.1f) |

## Functions

| Name | Summary |
|---|---|
| [get](get.md) | [jvm]<br>fun [get](get.md)(): [type](index.md)<br>Gets [present](present.md) |
| [next](next.md) | [jvm]<br>fun [next](next.md)(): [type](index.md)<br>[jvm]<br>fun [next](next.md)(alpha: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)): [type](index.md)<br>Moves [present](present.md) towards [desired](desired.md) by [alpha](next.md) and returns. |
| [set](set.md) | [jvm]<br>fun [set](set.md)(value: [type](index.md))<br>Sets [desired](desired.md) |
| [toString](to-string.md) | [jvm]<br>open override fun [toString](to-string.md)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>Returns a string representation of the object. |

## Properties

| Name | Summary |
|---|---|
| [alpha](alpha.md) | [jvm]<br>var [alpha](alpha.md): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)<br>The quantity of change per [next](next.md) |
| [desired](desired.md) | [jvm]<br>var [desired](desired.md): [type](index.md)<br>The value desired |
| [present](present.md) | [jvm]<br>var [present](present.md): [type](index.md)<br>The Current value |
