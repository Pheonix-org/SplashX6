//[core](../../../index.md)/[com.shinkson47.SplashX6.game.production](../index.md)/[UnitProductionProject](index.md)

# UnitProductionProject

[jvm]\
class [UnitProductionProject](index.md)(type: [UnitClass](../../com.shinkson47.SplashX6.game.units/-unit-class/index.md)) : [ProductionProject](../-production-project/index.md)&lt;[Unit](../../com.shinkson47.SplashX6.game.units/-unit/index.md)&gt; 

# A project that produces a unit.

## Constructors

| | |
|---|---|
| [UnitProductionProject](-unit-production-project.md) | [jvm]<br>fun [UnitProductionProject](-unit-production-project.md)(type: [UnitClass](../../com.shinkson47.SplashX6.game.units/-unit-class/index.md)) |

## Functions

| Name | Summary |
|---|---|
| [assign](../-production-project/assign.md) | [jvm]<br>fun [assign](../-production-project/assign.md)(to: [ProductionManager](../-production-manager/index.md)&lt;*&gt;)<br>Assigns the project to a given project, indicating that it is being worked on. |
| [contribute](../-production-project/contribute.md) | [jvm]<br>fun [contribute](../-production-project/contribute.md)(productionQuantity: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>Contributes the *n* production power towards this production project. |
| [doClaim](do-claim.md) | [jvm]<br>open override fun [doClaim](do-claim.md)(): [Unit](../../com.shinkson47.SplashX6.game.units/-unit/index.md)<br>i.e this may spawn a unit, or place a new structure. |
| [isComplete](../-production-project/is-complete.md) | [jvm]<br>fun [isComplete](../-production-project/is-complete.md)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [progress](../-production-project/progress.md) | [jvm]<br>fun [progress](../-production-project/progress.md)(): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) |
| [toString](to-string.md) | [jvm]<br>open override fun [toString](to-string.md)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [tryClaim](../-production-project/try-claim.md) | [jvm]<br>fun [tryClaim](../-production-project/try-claim.md)()<br>If this project is completed, and has not yet been claimed, then [doClaim](../-production-project/do-claim.md) will be called. |

## Properties

| Name | Summary |
|---|---|
| [contributed](../-production-project/contributed.md) | [jvm]<br>var [contributed](../-production-project/contributed.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>The quantity of cost that has been contributed towarads  [cost](../-production-project/cost.md) |
| [cost](../-production-project/cost.md) | [jvm]<br>val [cost](../-production-project/cost.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>The cost, in the appropriate currency, that this will require. |
| [isClaimed](../-production-project/is-claimed.md) | [jvm]<br>var [isClaimed](../-production-project/is-claimed.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>If the project has been completed, and the result has been claimed, then true. |
| [production](../-production-project/production.md) | [jvm]<br>var [production](../-production-project/production.md): [ProductionManager](../-production-manager/index.md)&lt;*&gt;?<br>The production system that this project belongs to. |
| [type](type.md) | [jvm]<br>val [type](type.md): [UnitClass](../../com.shinkson47.SplashX6.game.units/-unit-class/index.md)<br>The type of unit this project produces. |
