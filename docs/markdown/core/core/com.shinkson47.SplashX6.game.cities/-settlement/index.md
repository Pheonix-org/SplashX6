//[core](../../../index.md)/[com.shinkson47.SplashX6.game.cities](../index.md)/[Settlement](index.md)

# Settlement

[jvm]\
class [Settlement](index.md)(isoVec: Vector3, CITY_TYPE: [CityType](../-city-type/index.md)) : [TurnHook](../../com.shinkson47.SplashX6.utility/-turn-hook/index.md), [PartiallySerializable](../../com.shinkson47.SplashX6.utility/-partially-serializable/index.md)

# A settlement in a nation.

#### Author

[Jordan T. Gray](https://www.shinkson47.in) on 02/06/2021

#### Since

PRE-ALPHA 0.0.2

## Constructors

| | |
|---|---|
| [Settlement](-settlement.md) | [jvm]<br>fun [Settlement](-settlement.md)(isoVec: Vector3, CITY_TYPE: [CityType](../-city-type/index.md)) |

## Types

| Name | Summary |
|---|---|
| [Companion](-companion/index.md) | [jvm]<br>object [Companion](-companion/index.md) |

## Functions

| Name | Summary |
|---|---|
| [cartesianPosition](cartesian-position.md) | [jvm]<br>fun [cartesianPosition](cartesian-position.md)(): Vector3 |
| [deserialize](deserialize.md) | [jvm]<br>open override fun [deserialize](deserialize.md)() |
| [doOnTurn](../../com.shinkson47.SplashX6.utility/-turn-hook/do-on-turn.md) | [jvm]<br>open fun [doOnTurn](../../com.shinkson47.SplashX6.utility/-turn-hook/do-on-turn.md)() |
| [draw](draw.md) | [jvm]<br>fun [draw](draw.md)(batch: SpriteBatch) |
| [evaluateBorderVectors](evaluate-border-vectors.md) | [jvm]<br>fun [evaluateBorderVectors](evaluate-border-vectors.md)() |
| [isInCityBoundary](is-in-city-boundary.md) | [jvm]<br>fun [isInCityBoundary](is-in-city-boundary.md)(vec: Vector2): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Returns true if the given iso vector is within the boundary.<br>[jvm]<br>fun [isInCityBoundary](is-in-city-boundary.md)(x: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), y: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [onTurn](on-turn.md) | [jvm]<br>open override fun [onTurn](on-turn.md)() |
| [run](../../com.shinkson47.SplashX6.utility/-turn-hook/run.md) | [jvm]<br>~~open~~ ~~override~~ ~~fun~~ [~~run~~](../../com.shinkson47.SplashX6.utility/-turn-hook/run.md)~~(~~~~)~~ |
| [toString](to-string.md) | [jvm]<br>open override fun [toString](to-string.md)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |

## Properties

| Name | Summary |
|---|---|
| [cachedSpriteName](cached-sprite-name.md) | [jvm]<br>var [cachedSpriteName](cached-sprite-name.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>format is : |
| [CITY_TYPE](-c-i-t-y_-t-y-p-e.md) | [jvm]<br>var [CITY_TYPE](-c-i-t-y_-t-y-p-e.md): [CityType](../-city-type/index.md) |
| [corrouption](corrouption.md) | [jvm]<br>var [corrouption](corrouption.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) = 0 |
| [culture](culture.md) | [jvm]<br>var [culture](culture.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) = 0 |
| [food](food.md) | [jvm]<br>var [food](food.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) = 5 |
| [improvementProduction](improvement-production.md) | [jvm]<br>val [improvementProduction](improvement-production.md): [ImprovementProductionManager](../../com.shinkson47.SplashX6.game.production/-improvement-production-manager/index.md) |
| [improvements](improvements.md) | [jvm]<br>val [improvements](improvements.md): [ArrayList](https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html)&lt;[Improvement](../-improvement/index.md)&gt; |
| [isoVec](iso-vec.md) | [jvm]<br>val [isoVec](iso-vec.md): Vector3<br>Is used to position the sprite. |
| [luxury](luxury.md) | [jvm]<br>var [luxury](luxury.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) = 0 |
| [name](name.md) | [jvm]<br>lateinit var [name](name.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>Determined data of the nation this city belongs to. |
| [plaugeRisk](plauge-risk.md) | [jvm]<br>var [plaugeRisk](plauge-risk.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) = 0 |
| [pollution](pollution.md) | [jvm]<br>var [pollution](pollution.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) = 0 |
| [science](science.md) | [jvm]<br>var [science](science.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) = 1 |
| [size](size.md) | [jvm]<br>var [size](size.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) = 0<br>Automatically updates sprite when updated. |
| [trade](trade.md) | [jvm]<br>var [trade](trade.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) = 2 |
| [unitProduction](unit-production.md) | [jvm]<br>val [unitProduction](unit-production.md): [CityProductionManager](../../com.shinkson47.SplashX6.game.production/-city-production-manager/index.md) |
| [waste](waste.md) | [jvm]<br>var [waste](waste.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) = 0 |
