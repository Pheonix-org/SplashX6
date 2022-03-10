//[core](../../../index.md)/[com.shinkson47.SplashX6.ai](../index.md)/[StateMachine](index.md)

# StateMachine

[jvm]\
open class [StateMachine](index.md)(name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) : [Runnable](https://docs.oracle.com/javase/8/docs/api/java/lang/Runnable.html)

# Script & State based behaviour system

Where a system is in a given state, and switches between states on given conditions.

The script ran on every update is determined by which state we are currently in.

A state system can be constructed through it's api, but once created it cannot be deconstructed or modified.

#### Author

[Jordan T. Gray](https://www.shinkson47.in) on 05/08/2021

#### Since

PRE-ALPHA 0.0.3

## Constructors

| | |
|---|---|
| [StateMachine](-state-machine.md) | [jvm]<br>fun [StateMachine](-state-machine.md)(name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) |

## Types

| Name | Summary |
|---|---|
| [Companion](-companion/index.md) | [jvm]<br>object [Companion](-companion/index.md) |
| [State](-state/index.md) | [jvm]<br>inner class [State](-state/index.md)(name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), script: [Runnable](https://docs.oracle.com/javase/8/docs/api/java/lang/Runnable.html), parent: [StateMachine](index.md), enterScript: [Runnable](https://docs.oracle.com/javase/8/docs/api/java/lang/Runnable.html)?, exitScript: [Runnable](https://docs.oracle.com/javase/8/docs/api/java/lang/Runnable.html)?) : [Runnable](https://docs.oracle.com/javase/8/docs/api/java/lang/Runnable.html)<br>Defines the final behaviour of this machine. |

## Functions

| Name | Summary |
|---|---|
| [forceDefault](force-default.md) | [jvm]<br>fun [forceDefault](force-default.md)() |
| [forceState](force-state.md) | [jvm]<br>~~fun~~ [~~forceState~~](force-state.md)~~(~~~~state~~~~:~~ [StateMachine.State](-state/index.md)~~)~~<br>Enters a given state without causing any triggers. |
| [getState](get-state.md) | [jvm]<br>fun [getState](get-state.md)(state: [StateMachine.State](-state/index.md)): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>fun [getState](get-state.md)(index: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [StateMachine.State](-state/index.md) |
| [run](run.md) | [jvm]<br>open override fun [run](run.md)()<br>Following executing the script, the [currentState](current-state.md) will check if any of it's State.switchStates conditions are met. If any switch conditions are met, then the state machine will switch states, naturally calling [State.exit](-state/exit.md) on [currentState](current-state.md), and State.enter on the new state.<br>[jvm]<br>fun [run](run.md)(n: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html))<br>by calling run() n times. |
| [switchState](switch-state.md) | [jvm]<br>fun [switchState](switch-state.md)(newState: [StateMachine.State](-state/index.md))<br>In doing so, triggers [StateMachine.State.exit](-state/exit.md) on [currentState](current-state.md), then StateMachine.State.enter on index.<br>[jvm]<br>fun [switchState](switch-state.md)(index: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html))<br>In doing so, triggers [StateMachine.State.exit](-state/exit.md) on [currentState](current-state.md), then StateMachine.State.enter on [index](switch-state.md). |

## Properties

| Name | Summary |
|---|---|
| [currentState](current-state.md) | [jvm]<br>var [currentState](current-state.md): [StateMachine.State](-state/index.md)<br>TODO if not set, automatically inherited from default. |
| [enableDebugLogs](enable-debug-logs.md) | [jvm]<br>var [enableDebugLogs](enable-debug-logs.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = false<br>False by default. |
| [name](name.md) | [jvm]<br>val [name](name.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [states](states.md) | [jvm]<br>val [states](states.md): [ArrayList](https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html)&lt;[StateMachine.State](-state/index.md)&gt; |

## Inheritors

| Name |
|---|
| [WorldCreationScreenController](../../com.shinkson47.SplashX6.rendering.screens/-world-creation/-world-creation-screen-controller/index.md) |
| [UnitAI](../../com.shinkson47.SplashX6.game.units/-unit/-unit-a-i/index.md) |
