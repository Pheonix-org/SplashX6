//[core](../../../index.md)/[com.shinkson47.SplashX6.game](../index.md)/[GameHypervisor](index.md)/[spawn](spawn.md)

# spawn

[jvm]\

@[JvmStatic](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-static/index.html)

fun [spawn](spawn.md)(pos: Vector3, spriteName: [UnitClass](../../com.shinkson47.SplashX6.game.units/-unit-class/index.md)): [Unit](../../com.shinkson47.SplashX6.game.units/-unit/index.md)

# Spawns a unit with the sprite of [spriteName](spawn.md) on iso co-oord x,y

Cannot be used in a UnitAction; Modifies GameData.units. See [turn_asyncTask](turn_async-task.md).

[jvm]\

@[JvmStatic](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-static/index.html)

fun [spawn](spawn.md)(x: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), y: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), spriteName: [UnitClass](../../com.shinkson47.SplashX6.game.units/-unit-class/index.md), nation: [Nation](../-nation/index.md) = GameData.player!!): [Unit](../../com.shinkson47.SplashX6.game.units/-unit/index.md)

# Spawns a unit with the sprite of [spriteName](spawn.md) on iso co-oord [x](spawn.md),[y](spawn.md)

Cannot be used in a UnitAction; Modifies GameData.units. See [turn_asyncTask](turn_async-task.md).
