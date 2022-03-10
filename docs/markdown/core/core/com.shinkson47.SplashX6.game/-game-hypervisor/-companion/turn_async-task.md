//[core](../../../../index.md)/[com.shinkson47.SplashX6.game](../../index.md)/[GameHypervisor](../index.md)/[Companion](index.md)/[turn_asyncTask](turn_async-task.md)

# turn_asyncTask

[jvm]\

@[JvmStatic](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-static/index.html)

fun [turn_asyncTask](turn_async-task.md)(runnable: [TurnHook](../../../com.shinkson47.SplashX6.utility/-turn-hook/index.md)): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)

# Stores a task to be run at the end of the next [turn_end](turn_end.md).

Also used as a work-around for not being able to modify some game data from within actions run on [turn_end](turn_end.md)

[jvm]\

@[JvmStatic](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-static/index.html)

~~fun~~ [~~turn_asyncTask~~](turn_async-task.md)~~(~~~~runnable~~~~:~~ [Runnable](https://docs.oracle.com/javase/8/docs/api/java/lang/Runnable.html)~~)~~~~:~~ [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)
