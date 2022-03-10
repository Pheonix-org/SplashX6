//[core](../../../index.md)/[com.shinkson47.SplashX6.input](../index.md)/[KeyBinder](index.md)

# KeyBinder

[jvm]\
object [KeyBinder](index.md) : InputAdapter

# Binds key presses to runnable actions.

Stores [KeyBinding](-key-binding/index.md)'s that are invoked only on thier appropriate screen.

#### Author

[Jordan T. Gray](https://www.shinkson47.in) on 23/06/2021

#### Since

PRE-ALPHA 0.0.2

## Types

| Name | Summary |
|---|---|
| [Global](-global/index.md) | [jvm]<br>class [Global](-global/index.md) : ScreenAdapter |
| [KeyBinding](-key-binding/index.md) | [jvm]<br>data class [KeyBinding](-key-binding/index.md)&lt;[T](-key-binding/index.md) : Screen&gt;(activeOn: [Class](https://docs.oracle.com/javase/8/docs/api/java/lang/Class.html)&lt;[T](-key-binding/index.md)&gt;, keyOrButton: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), Action: [Runnable](https://docs.oracle.com/javase/8/docs/api/java/lang/Runnable.html), repeat: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), Release: [Runnable](https://docs.oracle.com/javase/8/docs/api/java/lang/Runnable.html)?) |

## Functions

| Name | Summary |
|---|---|
| [bind](bind.md) | [jvm]<br>fun [bind](bind.md)(binding: [KeyBinder.KeyBinding](-key-binding/index.md)&lt;*&gt;)<br>fun &lt;[T](bind.md) : Screen&gt; [bind](bind.md)(activeOn: [Class](https://docs.oracle.com/javase/8/docs/api/java/lang/Class.html)&lt;[T](bind.md)&gt;, keyOrButton: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), repeat: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = false, Release: [Runnable](https://docs.oracle.com/javase/8/docs/api/java/lang/Runnable.html)? = null, Action: [Runnable](https://docs.oracle.com/javase/8/docs/api/java/lang/Runnable.html)) |
| [createGameBinds](create-game-binds.md) | [jvm]<br>fun [createGameBinds](create-game-binds.md)() |
| [destroyGameBinds](destroy-game-binds.md) | [jvm]<br>fun [destroyGameBinds](destroy-game-binds.md)() |
| [globalBind](global-bind.md) | [jvm]<br>fun [globalBind](global-bind.md)(binding: [KeyBinder.KeyBinding](-key-binding/index.md)&lt;*&gt;)<br>fun [globalBind](global-bind.md)(keyOrButton: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), repeat: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = false, Release: [Runnable](https://docs.oracle.com/javase/8/docs/api/java/lang/Runnable.html)? = null, Action: [Runnable](https://docs.oracle.com/javase/8/docs/api/java/lang/Runnable.html)) |
| [keyDown](key-down.md) | [jvm]<br>open override fun [keyDown](key-down.md)(keycode: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [keyTyped](index.md#-525989605%2FFunctions%2F971615585) | [jvm]<br>open override fun [keyTyped](index.md#-525989605%2FFunctions%2F971615585)(p0: [Char](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char/index.html)): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [keyUp](key-up.md) | [jvm]<br>open override fun [keyUp](key-up.md)(keycode: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [mouseMoved](index.md#-2144119554%2FFunctions%2F971615585) | [jvm]<br>open override fun [mouseMoved](index.md#-2144119554%2FFunctions%2F971615585)(p0: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), p1: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [poll](poll.md) | [jvm]<br>fun [poll](poll.md)()<br>For [KeyBinding](-key-binding/index.md)'s where repeat is true, checks if the key is held and executes the binding's action.<br>[jvm]<br>fun [poll](poll.md)(key: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), down: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)) |
| [scrolled](index.md#-2028808388%2FFunctions%2F971615585) | [jvm]<br>open override fun [scrolled](index.md#-2028808388%2FFunctions%2F971615585)(p0: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), p1: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [touchDown](index.md#-1110480523%2FFunctions%2F971615585) | [jvm]<br>open override fun [touchDown](index.md#-1110480523%2FFunctions%2F971615585)(p0: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), p1: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), p2: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), p3: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [touchDragged](index.md#-1702609798%2FFunctions%2F971615585) | [jvm]<br>open override fun [touchDragged](index.md#-1702609798%2FFunctions%2F971615585)(p0: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), p1: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), p2: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [touchUp](index.md#1560983342%2FFunctions%2F971615585) | [jvm]<br>open override fun [touchUp](index.md#1560983342%2FFunctions%2F971615585)(p0: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), p1: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), p2: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), p3: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |

## Properties

| Name | Summary |
|---|---|
| [bindingGame](binding-game.md) | [jvm]<br>var [bindingGame](binding-game.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = false<br>Whilst true, bindings are logged as game bindings and are removed when the game is ended. |
| [GameBinds](-game-binds.md) | [jvm]<br>val [GameBinds](-game-binds.md): [ArrayList](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-array-list/index.html)&lt;[KeyBinder.KeyBinding](-key-binding/index.md)&lt;*&gt;&gt; |
| [GlobalBinds](-global-binds.md) | [jvm]<br>val [GlobalBinds](-global-binds.md): [ArrayList](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-array-list/index.html)&lt;[KeyBinder.KeyBinding](-key-binding/index.md)&lt;*&gt;&gt; |
| [ScreenMap](-screen-map.md) | [jvm]<br>val [ScreenMap](-screen-map.md): [HashMap](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-hash-map/index.html)&lt;[Class](https://docs.oracle.com/javase/8/docs/api/java/lang/Class.html)&lt;*&gt;, [ArrayList](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-array-list/index.html)&lt;[KeyBinder.KeyBinding](-key-binding/index.md)&lt;*&gt;&gt;&gt; |
