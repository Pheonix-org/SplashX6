//[core](../../../index.md)/[com.shinkson47.SplashX6.utility](../index.md)/[Utility](index.md)/[message](message.md)

# message

[jvm]\
fun [message](message.md)(message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), title: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) = "", isCrutial: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = false, persistant: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = false): [MessageWindow](../../com.shinkson47.SplashX6.rendering.windows/-message-window/index.md)

A message to the user.

By default, a non-problem message. [warnPlayer](warn-player.md) is an alias for setting [isCrutial](message.md) to true.

Creates a modal message dialog in-game that presents a message to the user.

Non-error messages may be similar to:

Gandhi has completed the Manhattan project!

#### Return

The message window created and displayed.

## Parameters

jvm

| | |
|---|---|
| message | The message body to display to the user. |
| title | Optional title to place on the header of the window. |
| isCrutial | if true, presents a red message, indicating that it's more than just a message. |
