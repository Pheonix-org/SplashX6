//[core](../../../index.md)/[com.shinkson47.SplashX6.game.production](../index.md)/[ProductionManager](index.md)

# ProductionManager

[jvm]\
abstract class [ProductionManager](index.md)&lt;[PT](index.md) : [ProductionProject](../-production-project/index.md)&lt;*&gt;&gt;(basePower: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), queueSizeLimit: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) : [TurnHook](../../com.shinkson47.SplashX6.utility/-turn-hook/index.md), [Serializable](https://docs.oracle.com/javase/8/docs/api/java/io/Serializable.html)

# A abstract system which manages and works on [ProductionProject](../-production-project/index.md)s.

Contains a queue of project that will be worked through turn by turn. Each turn, the system contributes given quantity of currency towards each, in turn.

The project is complete when it's cost has been satisfied, and it's result is claimed (i.e spawning a new unit, or creating a new building.)

Completed projects are automatically removed from the queue and claimed.

The quantity of contribution is [contributionPower](contribution-power.md), which is determined by [evaluatePower](evaluate-power.md), which will  differ in the implementation of this system. For a [CityProductionManager](../-city-production-manager/index.md), this is production power, but it may also be scientific research power for tech trees, or something else.

## Parameters

jvm

| | |
|---|---|
| PT | Production Type - The type of production project that this system will manage. |
| basePower | The quantity of power that this |
| queueSizeLimit | The maximum number of projects that may be backlogged. TODO no limit. |

## Constructors

| | |
|---|---|
| [ProductionManager](-production-manager.md) | [jvm]<br>fun [ProductionManager](-production-manager.md)(basePower: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) = 5, queueSizeLimit: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) = 5)<br>Create empty constructor for production |

## Functions

| Name | Summary |
|---|---|
| [doOnTurn](../../com.shinkson47.SplashX6.utility/-turn-hook/do-on-turn.md) | [jvm]<br>open fun [doOnTurn](../../com.shinkson47.SplashX6.utility/-turn-hook/do-on-turn.md)() |
| [evaluatePower](evaluate-power.md) | [jvm]<br>abstract fun [evaluatePower](evaluate-power.md)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>TODO auto update ^ |
| [evaluateProducible](evaluate-producible.md) | [jvm]<br>abstract fun [evaluateProducible](evaluate-producible.md)(): Array&lt;[PT](index.md)&gt;<br>For the implementation to populate. |
| [getWorkingOn](get-working-on.md) | [jvm]<br>fun [getWorkingOn](get-working-on.md)(): [PT](index.md)? |
| [isQueueFull](is-queue-full.md) | [jvm]<br>fun [isQueueFull](is-queue-full.md)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>by comparing queue.size to QUEUE_LIMIT. |
| [onTurn](on-turn.md) | [jvm]<br>open override fun [onTurn](on-turn.md)() |
| [queueProject](queue-project.md) | [jvm]<br>fun [queueProject](queue-project.md)(project: [PT](index.md)): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Adds a new project to the queue. |
| [removeWorkingOn](remove-working-on.md) | [jvm]<br>fun [removeWorkingOn](remove-working-on.md)(): [PT](index.md)<br>Either because it's cancelled, or completed. |
| [run](../../com.shinkson47.SplashX6.utility/-turn-hook/run.md) | [jvm]<br>~~open~~ ~~override~~ ~~fun~~ [~~run~~](../../com.shinkson47.SplashX6.utility/-turn-hook/run.md)~~(~~~~)~~ |

## Properties

| Name | Summary |
|---|---|
| [basePower](base-power.md) | [jvm]<br>val [basePower](base-power.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) = 5<br>The quantity of power that this production system starts with. |
| [contributionPower](contribution-power.md) | [jvm]<br>var [contributionPower](contribution-power.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>The quantity of power that this system can use to complete projects each turn. |
| [queue](queue.md) | [jvm]<br>val [queue](queue.md): Array&lt;[PT](index.md)&gt;<br>The projects that this system will work on. |
| [queueSizeLimit](queue-size-limit.md) | [jvm]<br>val [queueSizeLimit](queue-size-limit.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) = 5<br>The maximum number of projects that this system can have in it's queue. |

## Inheritors

| Name |
|---|
| [CityProductionManager](../-city-production-manager/index.md) |
| [ImprovementProductionManager](../-improvement-production-manager/index.md) |
