//[core](../../../../index.md)/[com.shinkson47.SplashX6.rendering.renderers](../../index.md)/[KeyBindRenderer](../index.md)/[entry](index.md)

# entry

[jvm]\
inner class [entry](index.md)(spriteName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), key: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), string: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))

# Container with a single key binding entry in this hud.

Used to store both key states to update them later.

## Parameters

jvm

| | |
|---|---|
| spriteName |  |

## Constructors

| | |
|---|---|
| [entry](entry.md) | [jvm]<br>fun [entry](entry.md)(spriteName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), key: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), string: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))<br>Create [entry](index.md) |

## Properties

| Name | Summary |
|---|---|
| [down](down.md) | [jvm]<br>val [down](down.md): Image |
| [imageCell](image-cell.md) | [jvm]<br>lateinit var [imageCell](image-cell.md): Cell&lt;Image&gt; |
| [key](key.md) | [jvm]<br>val [key](key.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>The keycode that will change the sprite state. |
| [string](string.md) | [jvm]<br>val [string](string.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>The text shown to the user that explained what the binding does. |
| [up](up.md) | [jvm]<br>val [up](up.md): Image |
