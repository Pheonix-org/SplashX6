//[core](../../../../index.md)/[com.shinkson47.SplashX6.input](../../index.md)/[KeyBinder](../index.md)/[KeyBinding](index.md)

# KeyBinding

[jvm]\
data class [KeyBinding](index.md)&lt;[T](index.md) : Screen&gt;(activeOn: [Class](https://docs.oracle.com/javase/8/docs/api/java/lang/Class.html)&lt;[T](index.md)&gt;, keyOrButton: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), Action: [Runnable](https://docs.oracle.com/javase/8/docs/api/java/lang/Runnable.html), repeat: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), Release: [Runnable](https://docs.oracle.com/javase/8/docs/api/java/lang/Runnable.html)?)

##  Boilerplate defining a action to perform when a key is pressed on a given screen.

#### Author

[Jordan T. Gray](https://www.shinkson47.in) on 23/06/2021

#### Since

PRE-ALPHA 0.0.2

## Constructors

| | |
|---|---|
| [KeyBinding](-key-binding.md) | [jvm]<br>fun &lt;[T](index.md) : Screen&gt; [KeyBinding](-key-binding.md)(activeOn: [Class](https://docs.oracle.com/javase/8/docs/api/java/lang/Class.html)&lt;[T](index.md)&gt;, keyOrButton: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), Action: [Runnable](https://docs.oracle.com/javase/8/docs/api/java/lang/Runnable.html), repeat: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), Release: [Runnable](https://docs.oracle.com/javase/8/docs/api/java/lang/Runnable.html)?) |

## Properties

| Name | Summary |
|---|---|
| [Action](-action.md) | [jvm]<br>val [Action](-action.md): [Runnable](https://docs.oracle.com/javase/8/docs/api/java/lang/Runnable.html) |
| [activeOn](active-on.md) | [jvm]<br>val [activeOn](active-on.md): [Class](https://docs.oracle.com/javase/8/docs/api/java/lang/Class.html)&lt;[T](index.md)&gt; |
| [keyOrButton](key-or-button.md) | [jvm]<br>val [keyOrButton](key-or-button.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [Release](-release.md) | [jvm]<br>val [Release](-release.md): [Runnable](https://docs.oracle.com/javase/8/docs/api/java/lang/Runnable.html)? |
| [repeat](repeat.md) | [jvm]<br>val [repeat](repeat.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
