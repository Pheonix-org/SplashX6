//[core](../../../index.md)/[com.shinkson47.SplashX6.utility](../index.md)/[Utility](index.md)/[decrementBoundaryReset](decrement-boundary-reset.md)

# decrementBoundaryReset

[jvm]\
fun [decrementBoundaryReset](decrement-boundary-reset.md)(value: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), reset: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), boundary: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)

Decrements [value](decrement-boundary-reset.md), and asserts that it's new value is within lower boundary. If boundary is exceeded, the value is reset to a starting value.

#### Return

If [value](decrement-boundary-reset.md) exceedes [boundary](decrement-boundary-reset.md), returns reset. else returns value.

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
| reset | The value returned if [value](decrement-boundary-reset.md) exceedes [boundary](decrement-boundary-reset.md) |
| boundary | The lowest permitted value for [value](decrement-boundary-reset.md). |
