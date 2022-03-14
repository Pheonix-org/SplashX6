//[core](../../../index.md)/[com.shinkson47.SplashX6.rendering.ui](../index.md)/[StageWindow](index.md)/[dialog](dialog.md)

# dialog

[jvm]\
open fun [dialog](dialog.md)(titleKey: [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html), textKey: [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html), positive: [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html), negative: [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html), resultHandler: [Consumer](https://docs.oracle.com/javase/8/docs/api/java/util/function/Consumer.html)&lt;[Boolean](https://docs.oracle.com/javase/8/docs/api/java/lang/Boolean.html)&gt;, actors: [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)&lt;Actor&gt;)

Shows a modal dialog on the same stage as this window with a button that returns true, and another that returns false.

## Parameters

jvm

| | |
|---|---|
| title | The title of the dialog window |
| text | The body content of the dialog |
| positive | The text shown in the positive button. If empty, shows "OK!" |
| negative | The text shown in the negative button. If empty, no button is added. |
| resultHandler | The handler which handles the button press. If null, no handler is added. |

[jvm]\
open fun [dialog](dialog.md)(actor: Actor, titleKey: [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html), textKey: [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html), positive: [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html), negative: [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html), resultHandler: [Consumer](https://docs.oracle.com/javase/8/docs/api/java/util/function/Consumer.html)&lt;[Boolean](https://docs.oracle.com/javase/8/docs/api/java/lang/Boolean.html)&gt;, actors: [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)&lt;Actor&gt;)

open fun [dialog](dialog.md)(s: Stage, titleKey: [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html), textKey: [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html), positive: [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html), negative: [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html), resultHandler: [Consumer](https://docs.oracle.com/javase/8/docs/api/java/util/function/Consumer.html)&lt;[Boolean](https://docs.oracle.com/javase/8/docs/api/java/lang/Boolean.html)&gt;, actors: [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)&lt;Actor&gt;)
