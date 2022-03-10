//[core](../../../../index.md)/[com.shinkson47.SplashX6.rendering.screens](../../index.md)/[WorldCreation](../index.md)/[WorldCreationScreenController](index.md)

# WorldCreationScreenController

[jvm]\
inner class [WorldCreationScreenController](index.md) : [StateMachine](../../../com.shinkson47.SplashX6.ai/-state-machine/index.md)

# World Creation Screen State Machine.

Controlls the state of the game loading window.

Generated using Shinkson's State Machine Scripture.

See WorldCreation.sms

## Constructors

| | |
|---|---|
| [WorldCreationScreenController](-world-creation-screen-controller.md) | [jvm]<br>fun [WorldCreationScreenController](-world-creation-screen-controller.md)() |

## Functions

| Name | Summary |
|---|---|
| [forceDefault](../../../com.shinkson47.SplashX6.ai/-state-machine/force-default.md) | [jvm]<br>fun [forceDefault](../../../com.shinkson47.SplashX6.ai/-state-machine/force-default.md)() |
| [forceState](../../../com.shinkson47.SplashX6.ai/-state-machine/force-state.md) | [jvm]<br>~~fun~~ [~~forceState~~](../../../com.shinkson47.SplashX6.ai/-state-machine/force-state.md)~~(~~~~state~~~~:~~ [StateMachine.State](../../../com.shinkson47.SplashX6.ai/-state-machine/-state/index.md)~~)~~<br>Enters a given state without causing any triggers. |
| [getState](../../../com.shinkson47.SplashX6.ai/-state-machine/get-state.md) | [jvm]<br>fun [getState](../../../com.shinkson47.SplashX6.ai/-state-machine/get-state.md)(state: [StateMachine.State](../../../com.shinkson47.SplashX6.ai/-state-machine/-state/index.md)): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>fun [getState](../../../com.shinkson47.SplashX6.ai/-state-machine/get-state.md)(index: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [StateMachine.State](../../../com.shinkson47.SplashX6.ai/-state-machine/-state/index.md) |
| [run](../../../com.shinkson47.SplashX6.ai/-state-machine/run.md) | [jvm]<br>open override fun [run](../../../com.shinkson47.SplashX6.ai/-state-machine/run.md)()<br>Following executing the script, the [currentState](../../../com.shinkson47.SplashX6.ai/-state-machine/current-state.md) will check if any of it's State.switchStates conditions are met. If any switch conditions are met, then the state machine will switch states, naturally calling [State.exit](../../../com.shinkson47.SplashX6.ai/-state-machine/-state/exit.md) on [currentState](../../../com.shinkson47.SplashX6.ai/-state-machine/current-state.md), and State.enter on the new state.<br>[jvm]<br>fun [run](../../../com.shinkson47.SplashX6.ai/-state-machine/run.md)(n: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html))<br>by calling run() n times. |
| [switchState](../../../com.shinkson47.SplashX6.ai/-state-machine/switch-state.md) | [jvm]<br>fun [switchState](../../../com.shinkson47.SplashX6.ai/-state-machine/switch-state.md)(newState: [StateMachine.State](../../../com.shinkson47.SplashX6.ai/-state-machine/-state/index.md))<br>In doing so, triggers [StateMachine.State.exit](../../../com.shinkson47.SplashX6.ai/-state-machine/-state/exit.md) on [currentState](../../../com.shinkson47.SplashX6.ai/-state-machine/current-state.md), then StateMachine.State.enter on index.<br>[jvm]<br>fun [switchState](../../../com.shinkson47.SplashX6.ai/-state-machine/switch-state.md)(index: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html))<br>In doing so, triggers [StateMachine.State.exit](../../../com.shinkson47.SplashX6.ai/-state-machine/-state/exit.md) on [currentState](../../../com.shinkson47.SplashX6.ai/-state-machine/current-state.md), then StateMachine.State.enter on [index](../../../com.shinkson47.SplashX6.ai/-state-machine/switch-state.md). |

## Properties

| Name | Summary |
|---|---|
| [currentState](../../../com.shinkson47.SplashX6.ai/-state-machine/current-state.md) | [jvm]<br>var [currentState](../../../com.shinkson47.SplashX6.ai/-state-machine/current-state.md): [StateMachine.State](../../../com.shinkson47.SplashX6.ai/-state-machine/-state/index.md)<br>TODO if not set, automatically inherited from default. |
| [enableDebugLogs](../../../com.shinkson47.SplashX6.ai/-state-machine/enable-debug-logs.md) | [jvm]<br>var [enableDebugLogs](../../../com.shinkson47.SplashX6.ai/-state-machine/enable-debug-logs.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = false<br>False by default. |
| [name](../../../com.shinkson47.SplashX6.ai/-state-machine/name.md) | [jvm]<br>val [name](../../../com.shinkson47.SplashX6.ai/-state-machine/name.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [states](../../../com.shinkson47.SplashX6.ai/-state-machine/states.md) | [jvm]<br>val [states](../../../com.shinkson47.SplashX6.ai/-state-machine/states.md): [ArrayList](https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html)&lt;[StateMachine.State](../../../com.shinkson47.SplashX6.ai/-state-machine/-state/index.md)&gt; |
