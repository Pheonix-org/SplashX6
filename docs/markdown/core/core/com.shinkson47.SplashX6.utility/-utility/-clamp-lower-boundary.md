//[core](../../../index.md)/[com.shinkson47.SplashX6.utility](../index.md)/[Utility](index.md)/[ClampLowerBoundary](-clamp-lower-boundary.md)

# ClampLowerBoundary

[jvm]\
open fun [ClampLowerBoundary](-clamp-lower-boundary.md)(value: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), reset: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), boundary: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [Integer](https://docs.oracle.com/javase/8/docs/api/java/lang/Integer.html)

Asserts that a value is above the lower boundary. If boundary is exceeded, the value is reset to a starting value.

#### Return

If [value] exceedes [boundary], returns reset. else returns value.

## Parameters

jvm

| | |
|---|---|
| value | The value we're testing. |
| reset | The value returned if [value] exceedes [boundary] |
| boundary | The lowest permitted value for [value]. |
