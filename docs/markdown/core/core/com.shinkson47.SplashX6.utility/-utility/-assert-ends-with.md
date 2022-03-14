//[core](../../../index.md)/[com.shinkson47.SplashX6.utility](../index.md)/[Utility](index.md)/[AssertEndsWith](-assert-ends-with.md)

# AssertEndsWith

[jvm]\
fun [AssertEndsWith](-assert-ends-with.md)(s: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), suffix: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)

Makes sure that a the given string has the required suffix, adding it if it doesn't already contain it.

Note that [s](-assert-ends-with.md) is returned unmodified if it already ends with [suffix](-assert-ends-with.md)

#### Return

[s](-assert-ends-with.md) ending with [suffix](-assert-ends-with.md).

## Parameters

jvm

| | |
|---|---|
| s | The string to test. |
| suffix | The suffix that the [s](-assert-ends-with.md) must end with. |
