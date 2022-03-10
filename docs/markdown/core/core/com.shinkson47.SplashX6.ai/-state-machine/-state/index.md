//[core](../../../../index.md)/[com.shinkson47.SplashX6.ai](../../index.md)/[StateMachine](../index.md)/[State](index.md)

# State

[jvm]\
inner class [State](index.md)(name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), script: [Runnable](https://docs.oracle.com/javase/8/docs/api/java/lang/Runnable.html), parent: [StateMachine](../index.md), enterScript: [Runnable](https://docs.oracle.com/javase/8/docs/api/java/lang/Runnable.html)?, exitScript: [Runnable](https://docs.oracle.com/javase/8/docs/api/java/lang/Runnable.html)?) : [Runnable](https://docs.oracle.com/javase/8/docs/api/java/lang/Runnable.html)

# A state in which this state machine may be in.

Defines the final behaviour of this machine.

It's script is ran on every state system update ([run](run.md)), when this state is the [currentState](../current-state.md).

After running script, switchStates are checked to determine if the system should switch states.

## See also

jvm

| | |
|---|---|
| com.shinkson47.SplashX6.ai.StateMachine.State |  |

## Constructors

| | |
|---|---|
| [State](-state.md) | [jvm]<br>fun [State](-state.md)(name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), script: [Runnable](https://docs.oracle.com/javase/8/docs/api/java/lang/Runnable.html), parent: [StateMachine](../index.md), enterScript: [Runnable](https://docs.oracle.com/javase/8/docs/api/java/lang/Runnable.html)? = null, exitScript: [Runnable](https://docs.oracle.com/javase/8/docs/api/java/lang/Runnable.html)? = null) |

## Functions

| Name | Summary |
|---|---|
| [exit](exit.md) | [jvm]<br>fun [exit](exit.md)(): [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)?<br>Triggers exitScript, if there is one. |
| [run](run.md) | [jvm]<br>open override fun [run](run.md)() |
| [toString](to-string.md) | [jvm]<br>open override fun [toString](to-string.md)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>Returns a string representation of the object. |

## Properties

| Name | Summary |
|---|---|
| [name](name.md) | [jvm]<br>val [name](name.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>The user-friendly name of this state. |
| [parent](parent.md) | [jvm]<br>val [parent](parent.md): [StateMachine](../index.md)<br>The state machine which owns this state. |
