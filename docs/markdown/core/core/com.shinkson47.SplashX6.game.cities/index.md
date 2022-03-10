//[core](../../index.md)/[com.shinkson47.SplashX6.game.cities](index.md)

# Package com.shinkson47.SplashX6.game.cities

## Types

| Name | Summary |
|---|---|
| [CityType](-city-type/index.md) | [jvm]<br>enum [CityType](-city-type/index.md) : [Enum](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-enum/index.html)&lt;[CityType](-city-type/index.md)&gt; <br>Represents all the types of cities available within the cities sprite atlas. |
| [Genus](-genus/index.md) | [jvm]<br>enum [Genus](-genus/index.md) : [Enum](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-enum/index.html)&lt;[Genus](-genus/index.md)&gt; |
| [Improvement](-improvement/index.md) | [jvm]<br>class [Improvement](-improvement/index.md)(name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), genus: [Genus](-genus/index.md), cost: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), upkeep: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), sabotage: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), sound: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, reqs: [ArrayList](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-array-list/index.html)&lt;[HashMap](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-hash-map/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;&gt;?) |
| [Settlement](-settlement/index.md) | [jvm]<br>class [Settlement](-settlement/index.md)(isoVec: Vector3, CITY_TYPE: [CityType](-city-type/index.md)) : [TurnHook](../com.shinkson47.SplashX6.utility/-turn-hook/index.md), [PartiallySerializable](../com.shinkson47.SplashX6.utility/-partially-serializable/index.md) |
