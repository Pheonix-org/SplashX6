//[core](../../../index.md)/[com.shinkson47.SplashX6.ai](../index.md)/[StateMachine](index.md)/[forceState](force-state.md)

# forceState

[jvm]\
~~fun~~ [~~forceState~~](force-state.md)~~(~~~~state~~~~:~~ [StateMachine.State](-state/index.md)~~)~~

# Alias setter for [currentState](current-state.md).

Enters a given state without causing any triggers.

## See also

jvm

| | |
|---|---|
| com.shinkson47.SplashX6.ai.StateMachine |  |

## Throws

| | |
|---|---|
| [kotlin.IllegalArgumentException](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-illegal-argument-exception/index.html) | if [state](force-state.md) has not beed added to this machine via addState. |
