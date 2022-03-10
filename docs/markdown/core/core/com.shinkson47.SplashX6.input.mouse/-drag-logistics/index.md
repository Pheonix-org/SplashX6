//[core](../../../index.md)/[com.shinkson47.SplashX6.input.mouse](../index.md)/[DragLogistics](index.md)

# DragLogistics

[jvm]\
class [DragLogistics](index.md)

# Handles the logic for mouse dragging

#### Author

[Jordan T. Gray]() on 12/04/2021]

#### Since

v1

## Constructors

| | |
|---|---|
| [DragLogistics](-drag-logistics.md) | [jvm]<br>fun [DragLogistics](-drag-logistics.md)() |

## Types

| Name | Summary |
|---|---|
| [Companion](-companion/index.md) | [jvm]<br>object [Companion](-companion/index.md) |

## Functions

| Name | Summary |
|---|---|
| [down](down.md) | [jvm]<br>fun [down](down.md)()<br><h2>Indicate that this button has been pressed</h2> Stores the mouse's current location |
| [up](up.md) | [jvm]<br>fun [up](up.md)()<br><h2>Indicate that this button has been released</h2> Clears all stored data |
| [x](x.md) | [jvm]<br>fun [x](x.md)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br><h2>Calculates the delta, then returns the delta's x</h2> |
| [y](y.md) | [jvm]<br>fun [y](y.md)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br><h2>Returns the y of the last known delta.</h2> |

## Properties

| Name | Summary |
|---|---|
| [delta](delta.md) | [jvm]<br>val [delta](delta.md): [Point](https://docs.oracle.com/javase/8/docs/api/java/awt/Point.html) |
| [isDown](is-down.md) | [jvm]<br>var [isDown](is-down.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = false<br><h2>Is this mouse button down?</h2> |
