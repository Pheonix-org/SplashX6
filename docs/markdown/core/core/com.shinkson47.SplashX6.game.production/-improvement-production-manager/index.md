//[core](../../../index.md)/[com.shinkson47.SplashX6.game.production](../index.md)/[ImprovementProductionManager](index.md)

# ImprovementProductionManager

[jvm]\
class [ImprovementProductionManager](index.md)(forCity: [Settlement](../../com.shinkson47.SplashX6.game.cities/-settlement/index.md)) : [ProductionManager](../-production-manager/index.md)&lt;[ImprovementProductionProject](../-improvement-production-project/index.md)&gt; 

# TODO

#### Author

[Jordan T. Gray](https://www.shinkson47.in) on 08/03/2022

#### Since

v1

## Constructors

| | |
|---|---|
| [ImprovementProductionManager](-improvement-production-manager.md) | [jvm]<br>fun [ImprovementProductionManager](-improvement-production-manager.md)(forCity: [Settlement](../../com.shinkson47.SplashX6.game.cities/-settlement/index.md)) |

## Functions

| Name | Summary |
|---|---|
| [doOnTurn](../../com.shinkson47.SplashX6.utility/-turn-hook/do-on-turn.md) | [jvm]<br>open fun [doOnTurn](../../com.shinkson47.SplashX6.utility/-turn-hook/do-on-turn.md)() |
| [evaluatePower](evaluate-power.md) | [jvm]<br>open override fun [evaluatePower](evaluate-power.md)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>TODO auto update ^ |
| [evaluateProducible](evaluate-producible.md) | [jvm]<br>open override fun [evaluateProducible](evaluate-producible.md)(): Array&lt;[ImprovementProductionProject](../-improvement-production-project/index.md)&gt;<br>For the implementation to populate. |
| [getWorkingOn](../-production-manager/get-working-on.md) | [jvm]<br>fun [getWorkingOn](../-production-manager/get-working-on.md)(): [ImprovementProductionProject](../-improvement-production-project/index.md)? |
| [isQueueFull](../-production-manager/is-queue-full.md) | [jvm]<br>fun [isQueueFull](../-production-manager/is-queue-full.md)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>by comparing queue.size to QUEUE_LIMIT. |
| [onTurn](../-production-manager/on-turn.md) | [jvm]<br>open override fun [onTurn](../-production-manager/on-turn.md)() |
| [queueProject](index.md#-1233932731%2FFunctions%2F971615585) | [jvm]<br>fun [queueProject](index.md#-1233932731%2FFunctions%2F971615585)(project: [ImprovementProductionProject](../-improvement-production-project/index.md)): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Adds a new project to the queue. |
| [removeWorkingOn](../-production-manager/remove-working-on.md) | [jvm]<br>fun [removeWorkingOn](../-production-manager/remove-working-on.md)(): [ImprovementProductionProject](../-improvement-production-project/index.md)<br>Either because it's cancelled, or completed. |
| [run](../../com.shinkson47.SplashX6.utility/-turn-hook/run.md) | [jvm]<br>~~open~~ ~~override~~ ~~fun~~ [~~run~~](../../com.shinkson47.SplashX6.utility/-turn-hook/run.md)~~(~~~~)~~ |

## Properties

| Name | Summary |
|---|---|
| [basePower](../-production-manager/base-power.md) | [jvm]<br>val [basePower](../-production-manager/base-power.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>The quantity of power that this production system starts with. |
| [contributionPower](../-production-manager/contribution-power.md) | [jvm]<br>var [contributionPower](../-production-manager/contribution-power.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>The quantity of power that this system can use to complete projects each turn. |
| [forCity](for-city.md) | [jvm]<br>val [forCity](for-city.md): [Settlement](../../com.shinkson47.SplashX6.game.cities/-settlement/index.md) |
| [queue](../-production-manager/queue.md) | [jvm]<br>val [queue](../-production-manager/queue.md): Array&lt;[ImprovementProductionProject](../-improvement-production-project/index.md)&gt;<br>The projects that this system will work on. |
| [queueSizeLimit](../-production-manager/queue-size-limit.md) | [jvm]<br>val [queueSizeLimit](../-production-manager/queue-size-limit.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>The maximum number of projects that this system can have in it's queue. |
