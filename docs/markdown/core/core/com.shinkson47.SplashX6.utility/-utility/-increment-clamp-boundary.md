//[core](../../../index.md)/[com.shinkson47.SplashX6.utility](../index.md)/[Utility](index.md)/[IncrementClampBoundary](-increment-clamp-boundary.md)

# IncrementClampBoundary

[jvm]\
open fun [IncrementClampBoundary](-increment-clamp-boundary.md)(value: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), reset: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), boundary: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [Integer](https://docs.oracle.com/javase/8/docs/api/java/lang/Integer.html)

Increments [value], and asserts that it's new value is within an upper boundary. If boundary is exceeded, the value is reset to a starting value.

#### Return

If [value] exceedes [boundary], returns reset. else returns value.

## See also

jvm

| | |
|---|---|
| [com.shinkson47.SplashX6.utility.Utility](-clamp-upper-boundary.md) |  |

## Parameters

jvm

| | |
|---|---|
| value | The value we're testing. |
| reset | The value returned if [value] exceedes [boundary] |
| boundary | The maximum permitted value for [value]. |
