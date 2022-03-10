//[core](../../../index.md)/[com.shinkson47.SplashX6.rendering.screens](../index.md)/[CreditsScreen](index.md)

# CreditsScreen

[jvm]\
open class [CreditsScreen](index.md)(font: BitmapFont, lines: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;, renderBG: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)) : [ScalingScreenAdapter](../../com.shinkson47.SplashX6.rendering/-scaling-screen-adapter/index.md)

# The credits screen.

Prints the contents of generic/credits.txt character by character on the top of the menu background, complete with automatic scrolling.

This class is autonomus. It does not need to be modified in order to display changes in credits text file. Simply change the text, the display logic will handle it.

#### Author

[Jordan T. Gray](https://www.shinkson47.in) on 23/05/2021

#### Since

v1

## Constructors

| | |
|---|---|
| [CreditsScreen](-credits-screen.md) | [jvm]<br>fun [CreditsScreen](-credits-screen.md)(font: BitmapFont = REF_SKIN_W95.getFont("Vecna"), lines: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt; = Assets.get&lt;String&gt;(Assets.LANG_CREDITS).split("\n"), renderBG: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = true) |

## Functions

| Name | Summary |
|---|---|
| [dialog](../../com.shinkson47.SplashX6.rendering/-scaling-screen-adapter/dialog.md) | [jvm]<br>fun [dialog](../../com.shinkson47.SplashX6.rendering/-scaling-screen-adapter/dialog.md)(titleKey: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), textKey: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), handler: [Consumer](https://docs.oracle.com/javase/8/docs/api/java/util/function/Consumer.html)&lt;[Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)&gt;?) |
| [dispose](../../com.shinkson47.SplashX6.rendering.screens.game/-game-screen/index.md#2084822502%2FFunctions%2F971615585) | [jvm]<br>open override fun [dispose](../../com.shinkson47.SplashX6.rendering.screens.game/-game-screen/index.md#2084822502%2FFunctions%2F971615585)() |
| [doResize](do-resize.md) | [jvm]<br>open override fun [doResize](do-resize.md)(width: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), height: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html))<br>Also updates maxLines to contain the correct number of lines that can be displayed. |
| [hide](../../com.shinkson47.SplashX6.rendering.screens.game/-game-screen/index.md#1075297875%2FFunctions%2F971615585) | [jvm]<br>open override fun [hide](../../com.shinkson47.SplashX6.rendering.screens.game/-game-screen/index.md#1075297875%2FFunctions%2F971615585)() |
| [pause](../../com.shinkson47.SplashX6.rendering.screens.game/-game-screen/index.md#-510703633%2FFunctions%2F971615585) | [jvm]<br>open override fun [pause](../../com.shinkson47.SplashX6.rendering.screens.game/-game-screen/index.md#-510703633%2FFunctions%2F971615585)() |
| [render](render.md) | [jvm]<br>open override fun [render](render.md)(delta: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html))<br>Performs all logic and calculation. |
| [resize](../../com.shinkson47.SplashX6.rendering/-scaling-screen-adapter/resize.md) | [jvm]<br>open override fun [resize](../../com.shinkson47.SplashX6.rendering/-scaling-screen-adapter/resize.md)(width: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), height: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) |
| [resume](../../com.shinkson47.SplashX6.rendering.screens.game/-game-screen/index.md#434199496%2FFunctions%2F971615585) | [jvm]<br>open override fun [resume](../../com.shinkson47.SplashX6.rendering.screens.game/-game-screen/index.md#434199496%2FFunctions%2F971615585)() |
| [show](show.md) | [jvm]<br>open override fun [show](show.md)() |

## Properties

| Name | Summary |
|---|---|
| [charIndex](char-index.md) | [jvm]<br>var [charIndex](char-index.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) = 0 |
| [font](font.md) | [jvm]<br>val [font](font.md): BitmapFont |
| [height](../../com.shinkson47.SplashX6.rendering/-scaling-screen-adapter/height.md) | [jvm]<br>@[JvmField](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-field/index.html)<br>var [height](../../com.shinkson47.SplashX6.rendering/-scaling-screen-adapter/height.md): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) |
| [lineIndex](line-index.md) | [jvm]<br>var [lineIndex](line-index.md): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) = 0.0f<br>Once reaches maxLines, stops incrementing. Instead, the first line of [lines](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.text/index.html) is removed to create the scrolling effect. |
| [lines](lines.md) | [jvm]<br>var [lines](lines.md): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt; |
| [renderBG](render-b-g.md) | [jvm]<br>var [renderBG](render-b-g.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = true |
| [stage](../../com.shinkson47.SplashX6.rendering/-scaling-screen-adapter/stage.md) | [jvm]<br>@[JvmField](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-field/index.html)<br>val [stage](../../com.shinkson47.SplashX6.rendering/-scaling-screen-adapter/stage.md): Stage |
| [width](../../com.shinkson47.SplashX6.rendering/-scaling-screen-adapter/width.md) | [jvm]<br>@[JvmField](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-field/index.html)<br>var [width](../../com.shinkson47.SplashX6.rendering/-scaling-screen-adapter/width.md): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) |

## Inheritors

| Name |
|---|
| [SplashScreen](../-splash-screen/index.md) |
