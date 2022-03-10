//[core](../../../index.md)/[com.shinkson47.SplashX6.game.units](../index.md)/[Unit](index.md)

# Unit

[jvm]\
open class [Unit](index.md)(unitClass: [UnitClass](../-unit-class/index.md), isoVec: Vector3) : Sprite, [PartiallySerializable](../../com.shinkson47.SplashX6.utility/-partially-serializable/index.md)

# A controllable in-game character

That may be owned and controlled by a human or AI player.

#### Author

[Jordan T. Gray](https://www.shinkson47.in) on 19/05/2021

#### Since

PRE-ALPHA 0.0.1

## Constructors

| | |
|---|---|
| [Unit](-unit.md) | [jvm]<br>fun [Unit](-unit.md)(unitClass: [UnitClass](../-unit-class/index.md), _x: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), _y: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) |
| [Unit](-unit.md) | [jvm]<br>fun [Unit](-unit.md)(unitClass: [UnitClass](../-unit-class/index.md), isoVec: Vector3) |

## Types

| Name | Summary |
|---|---|
| [UnitAI](-unit-a-i/index.md) | [jvm]<br>inner class [UnitAI](-unit-a-i/index.md) : [StateMachine](../../com.shinkson47.SplashX6.ai/-state-machine/index.md)<br>h1>UnitAIA simple random movement ai |

## Functions

| Name | Summary |
|---|---|
| [ai_init](ai_init.md) | [jvm]<br>fun [ai_init](ai_init.md)() |
| [ai_update](ai_update.md) | [jvm]<br>fun [ai_update](ai_update.md)() |
| [cancelAction](cancel-action.md) | [jvm]<br>fun [cancelAction](cancel-action.md)()<br>preventing this unit from performing any action on each turn. |
| [clearDestination](clear-destination.md) | [jvm]<br>fun [clearDestination](clear-destination.md)() |
| [deltaPosition](delta-position.md) | [jvm]<br>fun [deltaPosition](delta-position.md)(deltaX: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), deltaY: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): Vector3<br>then invokes [setLocation](set-location.md) to update the sprite and whatnot. |
| [deserialize](deserialize.md) | [jvm]<br>override fun [deserialize](deserialize.md)() |
| [doTurn](do-turn.md) | [jvm]<br>fun [doTurn](do-turn.md)() |
| [draw](index.md#1695906424%2FFunctions%2F971615585) | [jvm]<br>open fun [draw](index.md#1695906424%2FFunctions%2F971615585)(p0: Batch)<br>open fun [draw](index.md#-1005726184%2FFunctions%2F971615585)(p0: Batch, p1: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)) |
| [flip](index.md#552322619%2FFunctions%2F971615585) | [jvm]<br>open override fun [flip](index.md#552322619%2FFunctions%2F971615585)(p0: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), p1: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)) |
| [getBoundingRectangle](index.md#-1686538276%2FFunctions%2F971615585) | [jvm]<br>open fun [getBoundingRectangle](index.md#-1686538276%2FFunctions%2F971615585)(): Rectangle |
| [getColor](index.md#1318078116%2FFunctions%2F971615585) | [jvm]<br>open fun [getColor](index.md#1318078116%2FFunctions%2F971615585)(): Color |
| [getHeight](index.md#81243340%2FFunctions%2F971615585) | [jvm]<br>open fun [getHeight](index.md#81243340%2FFunctions%2F971615585)(): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) |
| [getOriginX](index.md#597417077%2FFunctions%2F971615585) | [jvm]<br>open fun [getOriginX](index.md#597417077%2FFunctions%2F971615585)(): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) |
| [getOriginY](index.md#628436884%2FFunctions%2F971615585) | [jvm]<br>open fun [getOriginY](index.md#628436884%2FFunctions%2F971615585)(): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) |
| [getRegionHeight](index.md#-2028587126%2FFunctions%2F971615585) | [jvm]<br>open fun [getRegionHeight](index.md#-2028587126%2FFunctions%2F971615585)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [getRegionWidth](index.md#944001827%2FFunctions%2F971615585) | [jvm]<br>open fun [getRegionWidth](index.md#944001827%2FFunctions%2F971615585)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [getRegionX](index.md#-1480547663%2FFunctions%2F971615585) | [jvm]<br>open fun [getRegionX](index.md#-1480547663%2FFunctions%2F971615585)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [getRegionY](index.md#-1449527856%2FFunctions%2F971615585) | [jvm]<br>open fun [getRegionY](index.md#-1449527856%2FFunctions%2F971615585)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [getRotation](index.md#-1618382635%2FFunctions%2F971615585) | [jvm]<br>open fun [getRotation](index.md#-1618382635%2FFunctions%2F971615585)(): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) |
| [getScaleX](index.md#1935452037%2FFunctions%2F971615585) | [jvm]<br>open fun [getScaleX](index.md#1935452037%2FFunctions%2F971615585)(): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) |
| [getScaleY](index.md#1966471844%2FFunctions%2F971615585) | [jvm]<br>open fun [getScaleY](index.md#1966471844%2FFunctions%2F971615585)(): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) |
| [getTexture](index.md#742064474%2FFunctions%2F971615585) | [jvm]<br>open fun [getTexture](index.md#742064474%2FFunctions%2F971615585)(): Texture |
| [getU](index.md#1015419200%2FFunctions%2F971615585) | [jvm]<br>open fun [getU](index.md#1015419200%2FFunctions%2F971615585)(): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) |
| [getU2](index.md#963191464%2FFunctions%2F971615585) | [jvm]<br>open fun [getU2](index.md#963191464%2FFunctions%2F971615585)(): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) |
| [getV](index.md#1046439007%2FFunctions%2F971615585) | [jvm]<br>open fun [getV](index.md#1046439007%2FFunctions%2F971615585)(): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) |
| [getV2](index.md#1924805481%2FFunctions%2F971615585) | [jvm]<br>open fun [getV2](index.md#1924805481%2FFunctions%2F971615585)(): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) |
| [getVertices](index.md#-2000418630%2FFunctions%2F971615585) | [jvm]<br>open fun [getVertices](index.md#-2000418630%2FFunctions%2F971615585)(): [FloatArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html) |
| [getWidth](index.md#-373412447%2FFunctions%2F971615585) | [jvm]<br>open fun [getWidth](index.md#-373412447%2FFunctions%2F971615585)(): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) |
| [getX](index.md#-1126732753%2FFunctions%2F971615585) | [jvm]<br>open fun [getX](index.md#-1126732753%2FFunctions%2F971615585)(): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) |
| [getY](index.md#-1095712946%2FFunctions%2F971615585) | [jvm]<br>open fun [getY](index.md#-1095712946%2FFunctions%2F971615585)(): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) |
| [isFlipX](index.md#-631524166%2FFunctions%2F971615585) | [jvm]<br>open fun [isFlipX](index.md#-631524166%2FFunctions%2F971615585)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [isFlipY](index.md#-600504359%2FFunctions%2F971615585) | [jvm]<br>open fun [isFlipY](index.md#-600504359%2FFunctions%2F971615585)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [ownedBy](owned-by.md) | [jvm]<br>~~fun~~ [~~ownedBy~~](owned-by.md)~~(~~~~)~~~~:~~ [Nation](../../com.shinkson47.SplashX6.game/-nation/index.md)? |
| [rotate](index.md#1403062343%2FFunctions%2F971615585) | [jvm]<br>open fun [rotate](index.md#1403062343%2FFunctions%2F971615585)(p0: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)) |
| [rotate90](index.md#263900996%2FFunctions%2F971615585) | [jvm]<br>open fun [rotate90](index.md#263900996%2FFunctions%2F971615585)(p0: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)) |
| [scale](index.md#-34983600%2FFunctions%2F971615585) | [jvm]<br>open fun [scale](index.md#-34983600%2FFunctions%2F971615585)(p0: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)) |
| [scroll](index.md#-636520037%2FFunctions%2F971615585) | [jvm]<br>open override fun [scroll](index.md#-636520037%2FFunctions%2F971615585)(p0: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), p1: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)) |
| [set](index.md#-897251291%2FFunctions%2F971615585) | [jvm]<br>open fun [set](index.md#-897251291%2FFunctions%2F971615585)(p0: Sprite) |
| [setAlpha](index.md#859052838%2FFunctions%2F971615585) | [jvm]<br>open fun [setAlpha](index.md#859052838%2FFunctions%2F971615585)(p0: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)) |
| [setBounds](index.md#-1140965587%2FFunctions%2F971615585) | [jvm]<br>open fun [setBounds](index.md#-1140965587%2FFunctions%2F971615585)(p0: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), p1: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), p2: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), p3: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)) |
| [setCenter](index.md#1620410637%2FFunctions%2F971615585) | [jvm]<br>open fun [setCenter](index.md#1620410637%2FFunctions%2F971615585)(p0: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), p1: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)) |
| [setCenterX](index.md#-1532477567%2FFunctions%2F971615585) | [jvm]<br>open fun [setCenterX](index.md#-1532477567%2FFunctions%2F971615585)(p0: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)) |
| [setCenterY](index.md#100326432%2FFunctions%2F971615585) | [jvm]<br>open fun [setCenterY](index.md#100326432%2FFunctions%2F971615585)(p0: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)) |
| [setColor](index.md#365486935%2FFunctions%2F971615585) | [jvm]<br>open fun [setColor](index.md#365486935%2FFunctions%2F971615585)(p0: Color)<br>open fun [setColor](index.md#-907640785%2FFunctions%2F971615585)(p0: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), p1: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), p2: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), p3: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)) |
| [setDestination](set-destination.md) | [jvm]<br>fun [setDestination](set-destination.md)(v: Vector2)<br>fun [setDestination](set-destination.md)(v: Vector3)<br>[jvm]<br>fun [setDestination](set-destination.md)(x: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), y: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html))<br>and calculates the pathfinding required to reach it. |
| [setFlip](index.md#1061881765%2FFunctions%2F971615585) | [jvm]<br>open fun [setFlip](index.md#1061881765%2FFunctions%2F971615585)(p0: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), p1: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)) |
| [setLocation](set-location.md) | [jvm]<br>fun [setLocation](set-location.md)(_pos: Vector3): Vector3<br>where x and y are iso co-ordinates, and are stored in isoX, isoY.<br>[jvm]<br>~~fun~~ [~~setLocation~~](set-location.md)~~(~~~~x~~~~:~~ [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)~~,~~ ~~y~~~~:~~ [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)~~)~~~~:~~ Vector3<br>[jvm]<br>fun [setLocation](set-location.md)(x: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), y: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): Vector3<br>by updating the position of the underlying sprite. |
| [setOrigin](index.md#-2095370850%2FFunctions%2F971615585) | [jvm]<br>open fun [setOrigin](index.md#-2095370850%2FFunctions%2F971615585)(p0: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), p1: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)) |
| [setOriginBasedPosition](index.md#-794858558%2FFunctions%2F971615585) | [jvm]<br>open fun [setOriginBasedPosition](index.md#-794858558%2FFunctions%2F971615585)(p0: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), p1: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)) |
| [setOriginCenter](index.md#-718350516%2FFunctions%2F971615585) | [jvm]<br>open fun [setOriginCenter](index.md#-718350516%2FFunctions%2F971615585)() |
| [setPackedColor](index.md#-1469993383%2FFunctions%2F971615585) | [jvm]<br>open fun [setPackedColor](index.md#-1469993383%2FFunctions%2F971615585)(p0: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)) |
| [setPosition](set-position.md) | [jvm]<br>~~open~~ ~~override~~ ~~fun~~ [~~setPosition~~](set-position.md)~~(~~~~x~~~~:~~ [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)~~,~~ ~~y~~~~:~~ [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)~~)~~<br>Sets the location of the sprite. This should not be done. |
| [setRegion](index.md#-876936630%2FFunctions%2F971615585) | [jvm]<br>open fun [setRegion](index.md#-876936630%2FFunctions%2F971615585)(p0: Texture)<br>open fun [setRegion](index.md#-762747989%2FFunctions%2F971615585)(p0: TextureRegion)<br>open override fun [setRegion](index.md#-1438543636%2FFunctions%2F971615585)(p0: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), p1: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), p2: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), p3: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html))<br>open fun [setRegion](index.md#-153275622%2FFunctions%2F971615585)(p0: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), p1: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), p2: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), p3: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html))<br>open fun [setRegion](index.md#2003472107%2FFunctions%2F971615585)(p0: TextureRegion, p1: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), p2: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), p3: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), p4: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) |
| [setRegionHeight](index.md#-1671457252%2FFunctions%2F971615585) | [jvm]<br>open fun [setRegionHeight](index.md#-1671457252%2FFunctions%2F971615585)(p0: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) |
| [setRegionWidth](index.md#-300534515%2FFunctions%2F971615585) | [jvm]<br>open fun [setRegionWidth](index.md#-300534515%2FFunctions%2F971615585)(p0: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) |
| [setRegionX](index.md#-1582509797%2FFunctions%2F971615585) | [jvm]<br>open fun [setRegionX](index.md#-1582509797%2FFunctions%2F971615585)(p0: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) |
| [setRegionY](index.md#367790458%2FFunctions%2F971615585) | [jvm]<br>open fun [setRegionY](index.md#367790458%2FFunctions%2F971615585)(p0: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) |
| [setRotation](index.md#-1065398950%2FFunctions%2F971615585) | [jvm]<br>open fun [setRotation](index.md#-1065398950%2FFunctions%2F971615585)(p0: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)) |
| [setScale](index.md#1430095546%2FFunctions%2F971615585) | [jvm]<br>open fun [setScale](index.md#1430095546%2FFunctions%2F971615585)(p0: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html))<br>open fun [setScale](index.md#-175684330%2FFunctions%2F971615585)(p0: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), p1: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)) |
| [setSize](index.md#-155142343%2FFunctions%2F971615585) | [jvm]<br>open fun [setSize](index.md#-155142343%2FFunctions%2F971615585)(p0: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), p1: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)) |
| [setTexture](index.md#-168274071%2FFunctions%2F971615585) | [jvm]<br>open fun [setTexture](index.md#-168274071%2FFunctions%2F971615585)(p0: Texture) |
| [setU](index.md#1640474991%2FFunctions%2F971615585) | [jvm]<br>open override fun [setU](index.md#1640474991%2FFunctions%2F971615585)(p0: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)) |
| [setU2](index.md#467139931%2FFunctions%2F971615585) | [jvm]<br>open override fun [setU2](index.md#467139931%2FFunctions%2F971615585)(p0: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)) |
| [setV](index.md#-1021688306%2FFunctions%2F971615585) | [jvm]<br>open override fun [setV](index.md#-1021688306%2FFunctions%2F971615585)(p0: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)) |
| [setV2](index.md#-455543652%2FFunctions%2F971615585) | [jvm]<br>open override fun [setV2](index.md#-455543652%2FFunctions%2F971615585)(p0: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)) |
| [setX](set-x.md) | [jvm]<br>~~open~~ ~~override~~ ~~fun~~ [~~setX~~](set-x.md)~~(~~~~x~~~~:~~ [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)~~)~~<br>Sets the location of the sprite. This should not be done. |
| [setY](set-y.md) | [jvm]<br>~~open~~ ~~override~~ ~~fun~~ [~~setY~~](set-y.md)~~(~~~~y~~~~:~~ [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)~~)~~<br>Sets the location of the sprite. This should not be done. |
| [split](index.md#267183582%2FFunctions%2F971615585) | [jvm]<br>open fun [split](index.md#267183582%2FFunctions%2F971615585)(p0: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), p1: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)&lt;[Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)&lt;TextureRegion&gt;&gt; |
| [toString](to-string.md) | [jvm]<br>open override fun [toString](to-string.md)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [translate](index.md#-668744892%2FFunctions%2F971615585) | [jvm]<br>open fun [translate](index.md#-668744892%2FFunctions%2F971615585)(p0: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), p1: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)) |
| [translateX](index.md#-1181295560%2FFunctions%2F971615585) | [jvm]<br>open fun [translateX](index.md#-1181295560%2FFunctions%2F971615585)(p0: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)) |
| [translateY](index.md#451508439%2FFunctions%2F971615585) | [jvm]<br>open fun [translateY](index.md#451508439%2FFunctions%2F971615585)(p0: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)) |

## Properties

| Name | Summary |
|---|---|
| [actions](actions.md) | [jvm]<br>val [actions](actions.md): [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)&lt;[UnitAction](../-unit-action/index.md)&gt;<br>Fetched from [UnitActionDictionary](../-unit-action-dictionary/index.md), which defines what each class is able to do. |
| [ai](ai.md) | [jvm]<br>lateinit var [ai](ai.md): [Unit.UnitAI](-unit-a-i/index.md) |
| [destination](destination.md) | [jvm]<br>var [destination](destination.md): [Pair](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-pair/index.html)&lt;[Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)&gt;? = null<br>the x, y that the unit desires to travel to, if there is a destination set. |
| [displayName](display-name.md) | [jvm]<br>val [displayName](display-name.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>For now, is just the [unitClass](unit-class.md) |
| [height](index.md#-2044136086%2FProperties%2F971615585) | [jvm]<br>val [height](index.md#-2044136086%2FProperties%2F971615585): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) |
| [isoVec](iso-vec.md) | [jvm]<br>var [isoVec](iso-vec.md): Vector3 |
| [light](light.md) | [jvm]<br>var [light](light.md): PointLight? |
| [onTurnAction](on-turn-action.md) | [jvm]<br>var [onTurnAction](on-turn-action.md): [UnitAction](../-unit-action/index.md)? = null |
| [pathNodes](path-nodes.md) | [jvm]<br>var [pathNodes](path-nodes.md): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;GridCell&gt;? = null<br>A list of cells in the world, defines the path this unit is trying to take to reach [destination](destination.md) |
| [regionHeight](index.md#1185067332%2FProperties%2F971615585) | [jvm]<br>val [regionHeight](index.md#1185067332%2FProperties%2F971615585): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [regionWidth](index.md#-2000373207%2FProperties%2F971615585) | [jvm]<br>val [regionWidth](index.md#-2000373207%2FProperties%2F971615585): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [texture](index.md#-798762144%2FProperties%2F971615585) | [jvm]<br>val [texture](index.md#-798762144%2FProperties%2F971615585): Texture |
| [travelDistance](travel-distance.md) | [jvm]<br>var [travelDistance](travel-distance.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) = 3 |
| [u](index.md#-20682810%2FProperties%2F971615585) | [jvm]<br>val [u](index.md#-20682810%2FProperties%2F971615585): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) |
| [u2](index.md#-1091199774%2FProperties%2F971615585) | [jvm]<br>val [u2](index.md#-1091199774%2FProperties%2F971615585): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) |
| [unitClass](unit-class.md) | [jvm]<br>val [unitClass](unit-class.md): [UnitClass](../-unit-class/index.md)<br>Determines the sprites and behaviour of the unit. |
| [v](index.md#10336997%2FProperties%2F971615585) | [jvm]<br>val [v](index.md#10336997%2FProperties%2F971615585): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) |
| [v2](index.md#-129585757%2FProperties%2F971615585) | [jvm]<br>val [v2](index.md#-129585757%2FProperties%2F971615585): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) |
| [vertices](index.md#-85614120%2FProperties%2F971615585) | [jvm]<br>val [vertices](index.md#-85614120%2FProperties%2F971615585): [FloatArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html) |
| [viewDistance](view-distance.md) | [jvm]<br>var [viewDistance](view-distance.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) = 10 |
| [width](index.md#250763587%2FProperties%2F971615585) | [jvm]<br>val [width](index.md#250763587%2FProperties%2F971615585): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) |
