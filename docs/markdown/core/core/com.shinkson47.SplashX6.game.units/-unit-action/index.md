//[core](../../../index.md)/[com.shinkson47.SplashX6.game.units](../index.md)/[UnitAction](index.md)

# UnitAction

[jvm]\
class [UnitAction](index.md)(displayName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), isAvailable: [SerializablePredicate](../../com.shinkson47.SplashX6.utility/-serializable-predicate/index.md)&lt;[Unit](../-unit/index.md)&gt;, onAction: [SerializablePredicate](../../com.shinkson47.SplashX6.utility/-serializable-predicate/index.md)&lt;[Unit](../-unit/index.md)&gt;) : [Serializable](https://docs.oracle.com/javase/8/docs/api/java/io/Serializable.html)

# An action that can be performed by a unit when a nation ends it's turn.

Can basically perform any script.

***N.B scripts executed in the action cannot mutate GameData.units***     due to concurrent modification.

#### Author

[Jordan T. Gray](https://www.shinkson47.in) on 30/05/2021

#### Since

PRE-ALPHA 0.0.2

## Constructors

| | |
|---|---|
| [UnitAction](-unit-action.md) | [jvm]<br>fun [UnitAction](-unit-action.md)(displayName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), isAvailable: [SerializablePredicate](../../com.shinkson47.SplashX6.utility/-serializable-predicate/index.md)&lt;[Unit](../-unit/index.md)&gt;, onAction: [SerializablePredicate](../../com.shinkson47.SplashX6.utility/-serializable-predicate/index.md)&lt;[Unit](../-unit/index.md)&gt;) |

## Functions

| Name | Summary |
|---|---|
| [run](run.md) | [jvm]<br>fun [run](run.md)(unit: [Unit](../-unit/index.md)): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [toString](to-string.md) | [jvm]<br>open override fun [toString](to-string.md)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |

## Properties

| Name | Summary |
|---|---|
| [displayName](display-name.md) | [jvm]<br>val [displayName](display-name.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>The localised name of this action that can be displayed to the used. |
| [isAvailable](is-available.md) | [jvm]<br>val [isAvailable](is-available.md): [SerializablePredicate](../../com.shinkson47.SplashX6.utility/-serializable-predicate/index.md)&lt;[Unit](../-unit/index.md)&gt;<br>Predicate that determines if the action can be used. |
| [onAction](on-action.md) | [jvm]<br>val [onAction](on-action.md): [SerializablePredicate](../../com.shinkson47.SplashX6.utility/-serializable-predicate/index.md)&lt;[Unit](../-unit/index.md)&gt;<br>Action that is executed when the user desires. |
