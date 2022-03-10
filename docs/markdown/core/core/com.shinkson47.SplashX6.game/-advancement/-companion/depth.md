//[core](../../../../index.md)/[com.shinkson47.SplashX6.game](../../index.md)/[Advancement](../index.md)/[Companion](index.md)/[depth](depth.md)

# depth

[jvm]\
fun [depth](depth.md)(i: [Advancement](../index.md), level: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) = 0): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)

Determines the number of advancements in the largest chain of dependencies.

#### Return

In the tree of requirements, the length of the longest chain.

## Parameters

jvm

| | |
|---|---|
| level | The current level of depth. Used in the recursion. Starts at 0. |
| i | the advancement to process. |
