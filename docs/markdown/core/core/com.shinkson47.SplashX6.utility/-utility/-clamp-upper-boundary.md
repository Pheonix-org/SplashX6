//[core](../../../index.md)/[com.shinkson47.SplashX6.utility](../index.md)/[Utility](index.md)/[ClampUpperBoundary](-clamp-upper-boundary.md)

# ClampUpperBoundary

[jvm]\
open fun [ClampUpperBoundary](-clamp-upper-boundary.md)(value: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), reset: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), boundary: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [Integer](https://docs.oracle.com/javase/8/docs/api/java/lang/Integer.html)

Asserts that a value is within an upper boundary. If boundary is exceeded, the value is reset to a starting value.

#### Return

If [value] exceedes [boundary], returns reset. else returns value.

## Parameters

jvm

| | |
|---|---|
| value | The value we're testing. |
| reset | The value returned if [value] exceedes [boundary] |
| boundary | The maximum permitted value for [value]. |
