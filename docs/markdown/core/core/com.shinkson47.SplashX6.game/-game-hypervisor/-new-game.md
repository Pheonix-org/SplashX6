//[core](../../../index.md)/[com.shinkson47.SplashX6.game](../index.md)/[GameHypervisor](index.md)/[NewGame](-new-game.md)

# NewGame

[jvm]\

@[JvmStatic](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-static/index.html)

fun [NewGame](-new-game.md)()

# Initiates the creation of a new game

But does not actually create it. This method switches to the world creation window, which will callback when the user has configured the game and has rendered the loading screen. The game will then be generated in GameHypervisor#doNewGameCallback(), during which the programme will be un-responsive and unable to render.
