//[core](../../index.md)/[com.shinkson47.SplashX6.game.units](index.md)

# Package com.shinkson47.SplashX6.game.units

## Types

| Name | Summary |
|---|---|
| [Unit](-unit/index.md) | [jvm]<br>open class [Unit](-unit/index.md)(unitClass: [UnitClass](-unit-class/index.md), isoVec: Vector3) : Sprite, [PartiallySerializable](../com.shinkson47.SplashX6.utility/-partially-serializable/index.md)<br>That may be owned and controlled by a human or AI player. |
| [UnitAction](-unit-action/index.md) | [jvm]<br>class [UnitAction](-unit-action/index.md)(displayName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), isAvailable: [SerializablePredicate](../com.shinkson47.SplashX6.utility/-serializable-predicate/index.md)&lt;[Unit](-unit/index.md)&gt;, onAction: [SerializablePredicate](../com.shinkson47.SplashX6.utility/-serializable-predicate/index.md)&lt;[Unit](-unit/index.md)&gt;) : [Serializable](https://docs.oracle.com/javase/8/docs/api/java/io/Serializable.html)<br>Can basically perform any script. |
| [UnitActionDictionary](-unit-action-dictionary/index.md) | [jvm]<br>object [UnitActionDictionary](-unit-action-dictionary/index.md) : [HashMap](https://docs.oracle.com/javase/8/docs/api/java/util/HashMap.html)&lt;[UnitClass](-unit-class/index.md), [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)&lt;[UnitAction](-unit-action/index.md)&gt;&gt; <br>Maps a given class of unit to a collection of actions that it may perform. |
| [UnitClass](-unit-class/index.md) | [jvm]<br>enum [UnitClass](-unit-class/index.md) : [Enum](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-enum/index.html)&lt;[UnitClass](-unit-class/index.md)&gt; <br>Names match the title of the corresponding sprite in the units atlas. |
