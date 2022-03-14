//[core](../../../index.md)/[com.shinkson47.SplashX6.rendering.screens](../index.md)/[TextScreen](index.md)

# TextScreen

[jvm]\
open class [TextScreen](index.md)(text: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), onESC: Screen?, onComplete: Screen?, fontColor: Color, font: BitmapFont, background: Drawable?) : [ScalingScreenAdapter](../../com.shinkson47.SplashX6.rendering.ui/-scaling-screen-adapter/index.md)

A screen which can display text and a texture.

Prints the contents of generic/credits.txt character by character on the top of the menu background, complete with automatic scrolling.

This class is autonomus. It does not need to be modified in order to display changes in credits text file. Simply change the text, the display logic will handle it.

#### Author

[Jordan T. Gray](https://www.shinkson47.in) on 23/05/2021

#### Since

v1

## Constructors

| | |
|---|---|
| [TextScreen](-text-screen.md) | [jvm]<br>fun [TextScreen](-text-screen.md)(text: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), onESC: Screen? = null, onComplete: Screen? = null, fontColor: Color = Color.WHITE, font: BitmapFont = REF_SKIN_W95.getFont("Serif"), background: Drawable? = null) |

## Functions

| Name | Summary |
|---|---|
| [dialog](../../com.shinkson47.SplashX6.rendering.ui/-scaling-screen-adapter/dialog.md) | [jvm]<br>fun [dialog](../../com.shinkson47.SplashX6.rendering.ui/-scaling-screen-adapter/dialog.md)(titleKey: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), textKey: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), handler: [Consumer](https://docs.oracle.com/javase/8/docs/api/java/util/function/Consumer.html)&lt;[Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)&gt;?) |
| [dispose](../../com.shinkson47.SplashX6.rendering.screens.game/-game-screen/index.md#2084822502%2FFunctions%2F971615585) | [jvm]<br>open override fun [dispose](../../com.shinkson47.SplashX6.rendering.screens.game/-game-screen/index.md#2084822502%2FFunctions%2F971615585)() |
| [doResize](do-resize.md) | [jvm]<br>open override fun [doResize](do-resize.md)(width: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), height: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html))<br>Also updates maxLines to contain the correct number of lines that can be displayed. |
| [hide](../../com.shinkson47.SplashX6.rendering.screens.game/-game-screen/index.md#1075297875%2FFunctions%2F971615585) | [jvm]<br>open override fun [hide](../../com.shinkson47.SplashX6.rendering.screens.game/-game-screen/index.md#1075297875%2FFunctions%2F971615585)() |
| [pause](../../com.shinkson47.SplashX6.rendering.screens.game/-game-screen/index.md#-510703633%2FFunctions%2F971615585) | [jvm]<br>open override fun [pause](../../com.shinkson47.SplashX6.rendering.screens.game/-game-screen/index.md#-510703633%2FFunctions%2F971615585)() |
| [render](render.md) | [jvm]<br>open override fun [render](render.md)(delta: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html))<br>Performs all logic and calculation. |
| [resize](../../com.shinkson47.SplashX6.rendering.ui/-scaling-screen-adapter/resize.md) | [jvm]<br>open override fun [resize](../../com.shinkson47.SplashX6.rendering.ui/-scaling-screen-adapter/resize.md)(width: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), height: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) |
| [resume](../../com.shinkson47.SplashX6.rendering.screens.game/-game-screen/index.md#434199496%2FFunctions%2F971615585) | [jvm]<br>open override fun [resume](../../com.shinkson47.SplashX6.rendering.screens.game/-game-screen/index.md#434199496%2FFunctions%2F971615585)() |
| [show](show.md) | [jvm]<br>open override fun [show](show.md)() |

## Properties

| Name | Summary |
|---|---|
| [background](background.md) | [jvm]<br>val [background](background.md): Drawable? = null |
| [charIndex](char-index.md) | [jvm]<br>var [charIndex](char-index.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) = 0 |
| [font](font.md) | [jvm]<br>val [font](font.md): BitmapFont |
| [height](../../com.shinkson47.SplashX6.rendering.ui/-scaling-screen-adapter/height.md) | [jvm]<br>@[JvmField](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-field/index.html)<br>var [height](../../com.shinkson47.SplashX6.rendering.ui/-scaling-screen-adapter/height.md): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) |
| [lineIndex](line-index.md) | [jvm]<br>var [lineIndex](line-index.md): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) = 0.0f<br>Once reaches maxLines, stops incrementing. Instead, the first line of [lines](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.text/index.html) is removed to create the scrolling effect. |
| [lines](lines.md) | [jvm]<br>var [lines](lines.md): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt; |
| [onComplete](on-complete.md) | [jvm]<br>var [onComplete](on-complete.md): Screen? = null |
| [onESC](on-e-s-c.md) | [jvm]<br>var [onESC](on-e-s-c.md): Screen? = null |
| [stage](../../com.shinkson47.SplashX6.rendering.ui/-scaling-screen-adapter/stage.md) | [jvm]<br>@[JvmField](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-field/index.html)<br>val [stage](../../com.shinkson47.SplashX6.rendering.ui/-scaling-screen-adapter/stage.md): Stage |
| [width](../../com.shinkson47.SplashX6.rendering.ui/-scaling-screen-adapter/width.md) | [jvm]<br>@[JvmField](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-field/index.html)<br>var [width](../../com.shinkson47.SplashX6.rendering.ui/-scaling-screen-adapter/width.md): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) |

## Inheritors

| Name |
|---|
| [SplashScreen](../-splash-screen/index.md) |
