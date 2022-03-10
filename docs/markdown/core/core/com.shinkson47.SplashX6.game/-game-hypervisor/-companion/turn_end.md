//[core](../../../../index.md)/[com.shinkson47.SplashX6.game](../../index.md)/[GameHypervisor](../index.md)/[Companion](index.md)/[turn_end](turn_end.md)

# turn_end

[jvm]\

@[JvmStatic](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-static/index.html)

fun [turn_end](turn_end.md)()

Ends this turn, performing actions on units and invoking opposing players to take thier turn.

N.B. : UnitActions cannot modify some game data directly, since it will cause a concurrent modification exception. Instead, post a runnable to []
