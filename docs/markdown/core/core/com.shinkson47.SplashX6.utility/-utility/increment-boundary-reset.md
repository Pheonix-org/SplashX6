//[core](../../../index.md)/[com.shinkson47.SplashX6.utility](../index.md)/[Utility](index.md)/[incrementBoundaryReset](increment-boundary-reset.md)

# incrementBoundaryReset

[jvm]\
fun [incrementBoundaryReset](increment-boundary-reset.md)(value: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), reset: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), boundary: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)

Increments [value](increment-boundary-reset.md), and asserts that it's new value is within an upper boundary. If boundary is exceeded, the value is reset to a starting value.

#### Return

If [value](increment-boundary-reset.md) exceedes [boundary](increment-boundary-reset.md), returns reset. else returns value.

## See also

jvm

| | |
|---|---|
| Utility.ClampUpperBoundary |  |

## Parameters

jvm

| | |
|---|---|
| value | The value we're testing. |
| reset | The value returned if [value](increment-boundary-reset.md) exceedes [boundary](increment-boundary-reset.md) |
| boundary | The maximum permitted value for [value](increment-boundary-reset.md). |
