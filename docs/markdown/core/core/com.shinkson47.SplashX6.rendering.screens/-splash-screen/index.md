//[core](../../../index.md)/[com.shinkson47.SplashX6.rendering.screens](../index.md)/[SplashScreen](index.md)

# SplashScreen

[jvm]\
class [SplashScreen](index.md) : [TextScreen](../-text-screen/index.md)

# Extends and modifies the credits screen to show splash screen text.

#### Author

[Jordan T. Gray](https://www.shinkson47.in) on 08/06/2021

#### Since

v1

## Constructors

| | |
|---|---|
| [SplashScreen](-splash-screen.md) | [jvm]<br>fun [SplashScreen](-splash-screen.md)() |

## Functions

| Name | Summary |
|---|---|
| [dialog](../../com.shinkson47.SplashX6.rendering.ui/-scaling-screen-adapter/dialog.md) | [jvm]<br>fun [dialog](../../com.shinkson47.SplashX6.rendering.ui/-scaling-screen-adapter/dialog.md)(titleKey: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), textKey: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), handler: [Consumer](https://docs.oracle.com/javase/8/docs/api/java/util/function/Consumer.html)&lt;[Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)&gt;?) |
| [dispose](../../com.shinkson47.SplashX6.rendering.screens.game/-game-screen/index.md#2084822502%2FFunctions%2F971615585) | [jvm]<br>open override fun [dispose](../../com.shinkson47.SplashX6.rendering.screens.game/-game-screen/index.md#2084822502%2FFunctions%2F971615585)() |
| [doResize](../-text-screen/do-resize.md) | [jvm]<br>open override fun [doResize](../-text-screen/do-resize.md)(width: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), height: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html))<br>Also updates maxLines to contain the correct number of lines that can be displayed. |
| [hide](../../com.shinkson47.SplashX6.rendering.screens.game/-game-screen/index.md#1075297875%2FFunctions%2F971615585) | [jvm]<br>open override fun [hide](../../com.shinkson47.SplashX6.rendering.screens.game/-game-screen/index.md#1075297875%2FFunctions%2F971615585)() |
| [pause](../../com.shinkson47.SplashX6.rendering.screens.game/-game-screen/index.md#-510703633%2FFunctions%2F971615585) | [jvm]<br>open override fun [pause](../../com.shinkson47.SplashX6.rendering.screens.game/-game-screen/index.md#-510703633%2FFunctions%2F971615585)() |
| [render](render.md) | [jvm]<br>open override fun [render](render.md)(delta: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html))<br>Performs all logic and calculation. |
| [resize](../../com.shinkson47.SplashX6.rendering.ui/-scaling-screen-adapter/resize.md) | [jvm]<br>open override fun [resize](../../com.shinkson47.SplashX6.rendering.ui/-scaling-screen-adapter/resize.md)(width: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), height: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) |
| [resume](../../com.shinkson47.SplashX6.rendering.screens.game/-game-screen/index.md#434199496%2FFunctions%2F971615585) | [jvm]<br>open override fun [resume](../../com.shinkson47.SplashX6.rendering.screens.game/-game-screen/index.md#434199496%2FFunctions%2F971615585)() |
| [show](../-text-screen/show.md) | [jvm]<br>open override fun [show](../-text-screen/show.md)() |

## Properties

| Name | Summary |
|---|---|
| [background](../-text-screen/background.md) | [jvm]<br>val [background](../-text-screen/background.md): Drawable? = null |
| [charIndex](../-text-screen/char-index.md) | [jvm]<br>var [charIndex](../-text-screen/char-index.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) = 0 |
| [font](../-text-screen/font.md) | [jvm]<br>val [font](../-text-screen/font.md): BitmapFont |
| [height](../../com.shinkson47.SplashX6.rendering.ui/-scaling-screen-adapter/height.md) | [jvm]<br>@[JvmField](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-field/index.html)<br>var [height](../../com.shinkson47.SplashX6.rendering.ui/-scaling-screen-adapter/height.md): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) |
| [lineIndex](../-text-screen/line-index.md) | [jvm]<br>var [lineIndex](../-text-screen/line-index.md): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) = 0.0f<br>Once reaches maxLines, stops incrementing. Instead, the first line of [lines](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.text/index.html) is removed to create the scrolling effect. |
| [lines](../-text-screen/lines.md) | [jvm]<br>var [lines](../-text-screen/lines.md): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt; |
| [onComplete](../-text-screen/on-complete.md) | [jvm]<br>var [onComplete](../-text-screen/on-complete.md): Screen? = null |
| [onESC](../-text-screen/on-e-s-c.md) | [jvm]<br>var [onESC](../-text-screen/on-e-s-c.md): Screen? = null |
| [progress](progress.md) | [jvm]<br>val [progress](progress.md): ProgressBar |
| [stage](../../com.shinkson47.SplashX6.rendering.ui/-scaling-screen-adapter/stage.md) | [jvm]<br>@[JvmField](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-field/index.html)<br>val [stage](../../com.shinkson47.SplashX6.rendering.ui/-scaling-screen-adapter/stage.md): Stage |
| [width](../../com.shinkson47.SplashX6.rendering.ui/-scaling-screen-adapter/width.md) | [jvm]<br>@[JvmField](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-field/index.html)<br>var [width](../../com.shinkson47.SplashX6.rendering.ui/-scaling-screen-adapter/width.md): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) |
