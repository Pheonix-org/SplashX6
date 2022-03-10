//[core](../../../index.md)/[com.shinkson47.SplashX6.ai](../index.md)/[StateMachine](index.md)/[run](run.md)

# run

[jvm]\
open override fun [run](run.md)()

##  Executes the StateMachine.State.script of the [currentState](current-state.md).

Following executing the script, the [currentState](current-state.md) will check if any of it's State.switchStates conditions are met. If any switch conditions are met, then the state machine will switch states, naturally calling [State.exit](-state/exit.md) on [currentState](current-state.md), and State.enter on the new state.

API NOTE : Will throw an [UninitializedPropertyAccessException](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-uninitialized-property-access-exception/index.html) if defaultState was not called before first run.

## See also

jvm

| | |
|---|---|
| com.shinkson47.SplashX6.ai.StateMachine |  |

[jvm]\
fun [run](run.md)(n: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html))

##  Simulates [n](run.md) updates to the state machine

by calling run() n times.

Mostly for testing purposes

## Parameters

jvm

| | |
|---|---|
| n | Number of times to update the machine. |
