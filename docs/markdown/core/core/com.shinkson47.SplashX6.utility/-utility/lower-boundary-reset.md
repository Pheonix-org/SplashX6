//[core](../../../index.md)/[com.shinkson47.SplashX6.utility](../index.md)/[Utility](index.md)/[lowerBoundaryReset](lower-boundary-reset.md)

# lowerBoundaryReset

[jvm]\
fun [lowerBoundaryReset](lower-boundary-reset.md)(value: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), reset: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), boundary: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)

Asserts that a value is above the lower boundary. If boundary is exceeded, the value is reset to a starting value.

#### Return

If [value](lower-boundary-reset.md) exceedes [boundary](lower-boundary-reset.md), returns reset. else returns value.

## Parameters

jvm

| | |
|---|---|
| value | The value we're testing. |
| reset | The value returned if [value](lower-boundary-reset.md) exceedes [boundary](lower-boundary-reset.md) |
| boundary | The lowest permitted value for [value](lower-boundary-reset.md). |
