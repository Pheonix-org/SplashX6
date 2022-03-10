//[core](../../../index.md)/[com.shinkson47.SplashX6.game.production](../index.md)/[CityProductionManager](index.md)

# CityProductionManager

[jvm]\
class [CityProductionManager](index.md)(forCity: [Settlement](../../com.shinkson47.SplashX6.game.cities/-settlement/index.md)) : [ProductionManager](../-production-manager/index.md)&lt;[UnitProductionProject](../-unit-production-project/index.md)&gt; 

A [ProductionManager](../-production-manager/index.md) system specific to a given city.

Focuses on the production of units and buildings only.

## See also

jvm

| | |
|---|---|
| [com.shinkson47.SplashX6.game.production.ProductionManager](../-production-manager/index.md) |  |

## Constructors

| | |
|---|---|
| [CityProductionManager](-city-production-manager.md) | [jvm]<br>fun [CityProductionManager](-city-production-manager.md)(forCity: [Settlement](../../com.shinkson47.SplashX6.game.cities/-settlement/index.md))<br>Create empty constructor for city production |

## Functions

| Name | Summary |
|---|---|
| [doOnTurn](../../com.shinkson47.SplashX6.utility/-turn-hook/do-on-turn.md) | [jvm]<br>open fun [doOnTurn](../../com.shinkson47.SplashX6.utility/-turn-hook/do-on-turn.md)() |
| [evaluatePower](evaluate-power.md) | [jvm]<br>open override fun [evaluatePower](evaluate-power.md)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>Evaluates the quantity of production power that city has. |
| [evaluateProducible](evaluate-producible.md) | [jvm]<br>open override fun [evaluateProducible](evaluate-producible.md)(): Array&lt;[UnitProductionProject](../-unit-production-project/index.md)&gt;<br>Evaluates what units can be produced at this city. |
| [getWorkingOn](../-production-manager/get-working-on.md) | [jvm]<br>fun [getWorkingOn](../-production-manager/get-working-on.md)(): [UnitProductionProject](../-unit-production-project/index.md)? |
| [isQueueFull](../-production-manager/is-queue-full.md) | [jvm]<br>fun [isQueueFull](../-production-manager/is-queue-full.md)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>by comparing queue.size to QUEUE_LIMIT. |
| [onTurn](../-production-manager/on-turn.md) | [jvm]<br>open override fun [onTurn](../-production-manager/on-turn.md)() |
| [queueProject](index.md#638079991%2FFunctions%2F971615585) | [jvm]<br>fun [queueProject](index.md#638079991%2FFunctions%2F971615585)(project: [UnitProductionProject](../-unit-production-project/index.md)): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Adds a new project to the queue. |
| [removeWorkingOn](../-production-manager/remove-working-on.md) | [jvm]<br>fun [removeWorkingOn](../-production-manager/remove-working-on.md)(): [UnitProductionProject](../-unit-production-project/index.md)<br>Either because it's cancelled, or completed. |
| [run](../../com.shinkson47.SplashX6.utility/-turn-hook/run.md) | [jvm]<br>~~open~~ ~~override~~ ~~fun~~ [~~run~~](../../com.shinkson47.SplashX6.utility/-turn-hook/run.md)~~(~~~~)~~ |

## Properties

| Name | Summary |
|---|---|
| [basePower](../-production-manager/base-power.md) | [jvm]<br>val [basePower](../-production-manager/base-power.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>The quantity of power that this production system starts with. |
| [contributionPower](../-production-manager/contribution-power.md) | [jvm]<br>var [contributionPower](../-production-manager/contribution-power.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>The quantity of power that this system can use to complete projects each turn. |
| [forCity](for-city.md) | [jvm]<br>val [forCity](for-city.md): [Settlement](../../com.shinkson47.SplashX6.game.cities/-settlement/index.md) |
| [queue](../-production-manager/queue.md) | [jvm]<br>val [queue](../-production-manager/queue.md): Array&lt;[UnitProductionProject](../-unit-production-project/index.md)&gt;<br>The projects that this system will work on. |
| [queueSizeLimit](../-production-manager/queue-size-limit.md) | [jvm]<br>val [queueSizeLimit](../-production-manager/queue-size-limit.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>The maximum number of projects that this system can have in it's queue. |
