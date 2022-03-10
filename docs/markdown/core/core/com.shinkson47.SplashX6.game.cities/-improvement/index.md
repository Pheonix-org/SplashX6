//[core](../../../index.md)/[com.shinkson47.SplashX6.game.cities](../index.md)/[Improvement](index.md)

# Improvement

[jvm]\
class [Improvement](index.md)(name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), genus: [Genus](../-genus/index.md), cost: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), upkeep: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), sabotage: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), sound: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, reqs: [ArrayList](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-array-list/index.html)&lt;[HashMap](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-hash-map/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;&gt;?)

# TODO

#### Author

[Jordan T. Gray](https://www.shinkson47.in) on 09/03/2022

#### Since

v1

## Constructors

| | |
|---|---|
| [Improvement](-improvement.md) | [jvm]<br>fun [Improvement](-improvement.md)(name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), genus: [Genus](../-genus/index.md), cost: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), upkeep: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), sabotage: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), sound: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, reqs: [ArrayList](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-array-list/index.html)&lt;[HashMap](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-hash-map/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;&gt;?) |

## Functions

| Name | Summary |
|---|---|
| [claim](claim.md) | [jvm]<br>fun [claim](claim.md)(city: [Settlement](../-settlement/index.md)): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [reqsMet](reqs-met.md) | [jvm]<br>fun [reqsMet](reqs-met.md)(city: [Settlement](../-settlement/index.md)): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Determines if the given city meets the requirement to contain this improvement. |

## Properties

| Name | Summary |
|---|---|
| [cost](cost.md) | [jvm]<br>val [cost](cost.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [genus](genus.md) | [jvm]<br>val [genus](genus.md): [Genus](../-genus/index.md) |
| [name](name.md) | [jvm]<br>val [name](name.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [reqs](reqs.md) | [jvm]<br>val [reqs](reqs.md): [ArrayList](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-array-list/index.html)&lt;[HashMap](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-hash-map/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;&gt;? |
| [sabotage](sabotage.md) | [jvm]<br>val [sabotage](sabotage.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [sound](sound.md) | [jvm]<br>val [sound](sound.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? |
| [upkeep](upkeep.md) | [jvm]<br>val [upkeep](upkeep.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
