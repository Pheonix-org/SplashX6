//[core](../../../index.md)/[com.shinkson47.SplashX6.utility](../index.md)/[Utility](index.md)/[upperBoundaryReset](upper-boundary-reset.md)

# upperBoundaryReset

[jvm]\
fun [upperBoundaryReset](upper-boundary-reset.md)(value: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), reset: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), boundary: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)

Asserts that a value is within an upper boundary. If boundary is exceeded, the value is reset to a starting value.

#### Return

If [value](upper-boundary-reset.md) exceedes [boundary](upper-boundary-reset.md), returns reset. else returns value.

## Parameters

jvm

| | |
|---|---|
| value | The value we're testing. |
| reset | The value returned if [value](upper-boundary-reset.md) exceedes [boundary](upper-boundary-reset.md) |
| boundary | The maximum permitted value for [value](upper-boundary-reset.md). |
