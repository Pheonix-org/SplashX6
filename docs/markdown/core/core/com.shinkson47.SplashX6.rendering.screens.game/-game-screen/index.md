//[core](../../../index.md)/[com.shinkson47.SplashX6.rendering.screens.game](../index.md)/[GameScreen](index.md)

# GameScreen

[jvm]\
class [GameScreen](index.md) : [ScalingScreenAdapter](../../com.shinkson47.SplashX6.rendering.ui/-scaling-screen-adapter/index.md)<h1>The screen used to display and interact with the game</h1>

#### Author

[Jordan T. Gray on 12/04/2021](https://www.shinkson47.in)

#### Since

v1

## Constructors

| | |
|---|---|
| [GameScreen](-game-screen.md) | [jvm]<br>fun [GameScreen](-game-screen.md)() |

## Functions

| Name | Summary |
|---|---|
| [createUI](create-u-i.md) | [jvm]<br>fun [createUI](create-u-i.md)()<br><h2>Constructs GUI shown within the game window</h2> |
| [dialog](../../com.shinkson47.SplashX6.rendering.ui/-scaling-screen-adapter/dialog.md) | [jvm]<br>fun [dialog](../../com.shinkson47.SplashX6.rendering.ui/-scaling-screen-adapter/dialog.md)(titleKey: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), textKey: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), handler: [Consumer](https://docs.oracle.com/javase/8/docs/api/java/util/function/Consumer.html)&lt;[Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)&gt;?) |
| [dispose](index.md#2084822502%2FFunctions%2F971615585) | [jvm]<br>open override fun [dispose](index.md#2084822502%2FFunctions%2F971615585)() |
| [doResize](do-resize.md) | [jvm]<br>open override fun [doResize](do-resize.md)(width: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), height: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html))<br><h2>Resizes the render space</h2> |
| [getR](get-r.md) | [jvm]<br>fun [getR](get-r.md)(): MapRenderer? |
| [hide](index.md#1075297875%2FFunctions%2F971615585) | [jvm]<br>open override fun [hide](index.md#1075297875%2FFunctions%2F971615585)() |
| [newRenderer](new-renderer.md) | [jvm]<br>fun [newRenderer](new-renderer.md)()<br>Creates a new tiledmap renderer. |
| [pause](index.md#-510703633%2FFunctions%2F971615585) | [jvm]<br>open override fun [pause](index.md#-510703633%2FFunctions%2F971615585)() |
| [render](render.md) | [jvm]<br>open override fun [render](render.md)(delta: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html))<br><h2>Renders the next frame</h2> |
| [renderDestinationLine](render-destination-line.md) | [jvm]<br>fun [renderDestinationLine](render-destination-line.md)()<br>Has no effect if no unit is selected. |
| [renderSprites](render-sprites.md) | [jvm]<br>fun [renderSprites](render-sprites.md)() |
| [resize](../../com.shinkson47.SplashX6.rendering.ui/-scaling-screen-adapter/resize.md) | [jvm]<br>open override fun [resize](../../com.shinkson47.SplashX6.rendering.ui/-scaling-screen-adapter/resize.md)(width: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), height: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) |
| [resume](index.md#434199496%2FFunctions%2F971615585) | [jvm]<br>open override fun [resume](index.md#434199496%2FFunctions%2F971615585)() |
| [show](show.md) | [jvm]<br>open override fun [show](show.md)() |

## Properties

| Name | Summary |
|---|---|
| [cam](cam.md) | [jvm]<br>val [cam](cam.md): [Camera](../../com.shinkson47.SplashX6.rendering/-camera/index.md)<br><h2>Camera used to observe the world</h2> |
| [font](font.md) | [jvm]<br>val [font](font.md): BitmapFont<br><h2>A font used for direct screen drawing</h2> |
| [height](../../com.shinkson47.SplashX6.rendering.ui/-scaling-screen-adapter/height.md) | [jvm]<br>@[JvmField](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-field/index.html)<br>var [height](../../com.shinkson47.SplashX6.rendering.ui/-scaling-screen-adapter/height.md): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) |
| [HUDBatch](-h-u-d-batch.md) | [jvm]<br>val [HUDBatch](-h-u-d-batch.md): Batch<br><h2>Returns the GUI batch</h2> |
| [kbr](kbr.md) | [jvm]<br>val [kbr](kbr.md): [KeyBindRenderer](../../com.shinkson47.SplashX6.rendering.renderers/-key-bind-renderer/index.md) |
| [managementScreen](management-screen.md) | [jvm]<br>val [managementScreen](management-screen.md): [Warroom](../../com.shinkson47.SplashX6.rendering.screens/-warroom/index.md) |
| [menu](menu.md) | [jvm]<br>var [menu](menu.md): [Menu](../-menu/index.md)? = null |
| [r](r.md) | [jvm]<br>var [r](r.md): IsometricStaggeredTiledMapRenderer? = null<br><h2>Renderer that renders GameData.world</h2> renders from perspective of [this.cam](../../[root]/index.md) |
| [sr](sr.md) | [jvm]<br>val [sr](sr.md): ShapeRenderer<br><h2>A renderer used to draw primative shapes</h2> |
| [stage](../../com.shinkson47.SplashX6.rendering.ui/-scaling-screen-adapter/stage.md) | [jvm]<br>@[JvmField](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-field/index.html)<br>val [stage](../../com.shinkson47.SplashX6.rendering.ui/-scaling-screen-adapter/stage.md): Stage |
| [width](../../com.shinkson47.SplashX6.rendering.ui/-scaling-screen-adapter/width.md) | [jvm]<br>@[JvmField](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-field/index.html)<br>var [width](../../com.shinkson47.SplashX6.rendering.ui/-scaling-screen-adapter/width.md): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) |
| [worldBatch](world-batch.md) | [jvm]<br>val [worldBatch](world-batch.md): SpriteBatch<br><h2>The sprite batch used for drawing bulk sprites in the world</h2> |
