//[core](../../../../index.md)/[com.shinkson47.SplashX6.utility](../../index.md)/[APICondition](../index.md)/[Companion](index.md)/[WARN](-w-a-r-n.md)

# WARN

[jvm]\

@[JvmStatic](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-static/index.html)

fun [WARN](-w-a-r-n.md)(message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [Runnable](https://docs.oracle.com/javase/8/docs/api/java/lang/Runnable.html)

# Shows a modal dialog with [message](-w-a-r-n.md) which [THROW](-t-h-r-o-w.md)s when user acknowledges

to notify user before [THROW](-t-h-r-o-w.md)ing to prevent API call. Use if user is responsible for invalid call.

caller is required to find the GUI stage where the diaog should be displayed.
