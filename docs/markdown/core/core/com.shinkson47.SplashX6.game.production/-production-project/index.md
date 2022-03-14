//[core](../../../index.md)/[com.shinkson47.SplashX6.game.production](../index.md)/[ProductionProject](index.md)

# ProductionProject

[jvm]\
abstract class [ProductionProject](index.md)&lt;[T](index.md)&gt;(cost: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), contributed: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), production: [ProductionManager](../-production-manager/index.md)&lt;*&gt;?, isClaimed: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html))

# An abstract view of something which can be produced.

Using an abstract cost, this project will be completed when the cost required is contributed towards it.

'Cost' may reffer to money, production power, research power, civic research, faith, just about anything. Just use values that are relevant to this project.

#### Author

[Jordan T. Gray](https://www.shinkson47.in) on 28/02/2022

## Constructors

| | |
|---|---|
| [ProductionProject](-production-project.md) | [jvm]<br>fun [ProductionProject](-production-project.md)(cost: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) = MathUtils.random(1, 20), contributed: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) = 0, production: [ProductionManager](../-production-manager/index.md)&lt;*&gt;? = null, isClaimed: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = false) |

## Functions

| Name | Summary |
|---|---|
| [assign](assign.md) | [jvm]<br>fun [assign](assign.md)(to: [ProductionManager](../-production-manager/index.md)&lt;*&gt;)<br>Assigns the project to a given project, indicating that it is being worked on. |
| [contribute](contribute.md) | [jvm]<br>fun [contribute](contribute.md)(productionQuantity: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>Contributes the *n* production power towards this production project. |
| [doClaim](do-claim.md) | [jvm]<br>abstract fun [doClaim](do-claim.md)(): [T](index.md)<br>i.e this may spawn a unit, or place a new structure. |
| [isComplete](is-complete.md) | [jvm]<br>fun [isComplete](is-complete.md)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [progress](progress.md) | [jvm]<br>fun [progress](progress.md)(): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) |
| [tryClaim](try-claim.md) | [jvm]<br>fun [tryClaim](try-claim.md)()<br>If this project is completed, and has not yet been claimed, then [doClaim](do-claim.md) will be called. |

## Properties

| Name | Summary |
|---|---|
| [contributed](contributed.md) | [jvm]<br>var [contributed](contributed.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) = 0<br>The quantity of cost that has been contributed towarads  [cost](cost.md) |
| [cost](cost.md) | [jvm]<br>val [cost](cost.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>The cost, in the appropriate currency, that this will require. |
| [isClaimed](is-claimed.md) | [jvm]<br>var [isClaimed](is-claimed.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = false<br>If the project has been completed, and the result has been claimed, then true. |
| [production](production.md) | [jvm]<br>var [production](production.md): [ProductionManager](../-production-manager/index.md)&lt;*&gt;? = null<br>The production system that this project belongs to. |

## Inheritors

| Name |
|---|
| [ImprovementProductionProject](../-improvement-production-project/index.md) |
| [UnitProductionProject](../-unit-production-project/index.md) |
| [TechProductionProject](../-tech-production-project/index.md) |
