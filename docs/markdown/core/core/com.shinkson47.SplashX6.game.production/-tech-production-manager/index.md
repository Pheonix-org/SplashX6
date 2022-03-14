//[core](../../../index.md)/[com.shinkson47.SplashX6.game.production](../index.md)/[TechProductionManager](index.md)

# TechProductionManager

[jvm]\
class [TechProductionManager](index.md) : [ProductionManager](../-production-manager/index.md)&lt;[TechProductionProject](../-tech-production-project/index.md)&gt; 

# TODO

#### Author

[Jordan T. Gray](https://www.shinkson47.in) on 12/03/2022

#### Since

v1

## Constructors

| | |
|---|---|
| [TechProductionManager](-tech-production-manager.md) | [jvm]<br>fun [TechProductionManager](-tech-production-manager.md)() |

## Functions

| Name | Summary |
|---|---|
| [doOnTurn](../../com.shinkson47.SplashX6.utility/-turn-hook/do-on-turn.md) | [jvm]<br>open fun [doOnTurn](../../com.shinkson47.SplashX6.utility/-turn-hook/do-on-turn.md)() |
| [evaluatePower](evaluate-power.md) | [jvm]<br>open override fun [evaluatePower](evaluate-power.md)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>TODO auto update ^ |
| [evaluateProducible](evaluate-producible.md) | [jvm]<br>open override fun [evaluateProducible](evaluate-producible.md)(): Array&lt;[TechProductionProject](../-tech-production-project/index.md)&gt;<br>For the implementation to populate. |
| [getWorkingOn](../-production-manager/get-working-on.md) | [jvm]<br>fun [getWorkingOn](../-production-manager/get-working-on.md)(): [TechProductionProject](../-tech-production-project/index.md)? |
| [isQueueFull](../-production-manager/is-queue-full.md) | [jvm]<br>fun [isQueueFull](../-production-manager/is-queue-full.md)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>by comparing queue.size to QUEUE_LIMIT. |
| [onTurn](../-production-manager/on-turn.md) | [jvm]<br>open override fun [onTurn](../-production-manager/on-turn.md)() |
| [queueProject](index.md#-1880243447%2FFunctions%2F971615585) | [jvm]<br>fun [queueProject](index.md#-1880243447%2FFunctions%2F971615585)(project: [TechProductionProject](../-tech-production-project/index.md)): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Adds a new project to the queue. |
| [removeWorkingOn](../-production-manager/remove-working-on.md) | [jvm]<br>fun [removeWorkingOn](../-production-manager/remove-working-on.md)(): [TechProductionProject](../-tech-production-project/index.md)<br>Either because it's cancelled, or completed. |
| [run](../../com.shinkson47.SplashX6.utility/-turn-hook/run.md) | [jvm]<br>~~open~~ ~~override~~ ~~fun~~ [~~run~~](../../com.shinkson47.SplashX6.utility/-turn-hook/run.md)~~(~~~~)~~ |

## Properties

| Name | Summary |
|---|---|
| [advs](advs.md) | [jvm]<br>val [advs](advs.md): [AdvancementTree](../../com.shinkson47.SplashX6.game/-advancement-tree/index.md) |
| [basePower](../-production-manager/base-power.md) | [jvm]<br>val [basePower](../-production-manager/base-power.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>The quantity of power that this production system starts with. |
| [contributionPower](../-production-manager/contribution-power.md) | [jvm]<br>var [contributionPower](../-production-manager/contribution-power.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>The quantity of power that this system can use to complete projects each turn. |
| [queue](../-production-manager/queue.md) | [jvm]<br>val [queue](../-production-manager/queue.md): Array&lt;[TechProductionProject](../-tech-production-project/index.md)&gt;<br>The projects that this system will work on. |
| [queueSizeLimit](../-production-manager/queue-size-limit.md) | [jvm]<br>val [queueSizeLimit](../-production-manager/queue-size-limit.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>The maximum number of projects that this system can have in it's queue. |
