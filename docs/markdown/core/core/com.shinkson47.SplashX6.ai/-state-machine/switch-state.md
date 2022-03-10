//[core](../../../index.md)/[com.shinkson47.SplashX6.ai](../index.md)/[StateMachine](index.md)/[switchState](switch-state.md)

# switchState

[jvm]\
fun [switchState](switch-state.md)(index: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html))

# Switches to a new state.

In doing so, triggers [StateMachine.State.exit](-state/exit.md) on [currentState](current-state.md), then StateMachine.State.enter on [index](switch-state.md).

[jvm]\
fun [switchState](switch-state.md)(newState: [StateMachine.State](-state/index.md))

# Switches to a new state.

In doing so, triggers [StateMachine.State.exit](-state/exit.md) on [currentState](current-state.md), then StateMachine.State.enter on index.
