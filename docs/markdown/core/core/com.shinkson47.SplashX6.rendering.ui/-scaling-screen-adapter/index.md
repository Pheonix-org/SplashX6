//[core](../../../index.md)/[com.shinkson47.SplashX6.rendering.ui](../index.md)/[ScalingScreenAdapter](index.md)

# ScalingScreenAdapter

[jvm]\
abstract class [ScalingScreenAdapter](index.md) : ScreenAdapter

A screen adapter that contains a stage for scaling UI according to [GraphicalConfig.scalingMode](../../com.shinkson47.SplashX6.utility.configuration/-graphical-config/scaling-mode.md).

Since this is used as a super class to all X6 screens, it may also contain some extra commons, such as the console.

#### Author

[Jordan T. Gray](https://www.shinkson47.in) on 14/06/2021

#### Since

v1

## Constructors

| | |
|---|---|
| [ScalingScreenAdapter](-scaling-screen-adapter.md) | [jvm]<br>fun [ScalingScreenAdapter](-scaling-screen-adapter.md)() |

## Functions

| Name | Summary |
|---|---|
| [dialog](dialog.md) | [jvm]<br>fun [dialog](dialog.md)(titleKey: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), textKey: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), handler: [Consumer](https://docs.oracle.com/javase/8/docs/api/java/util/function/Consumer.html)&lt;[Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)&gt;?) |
| [dispose](../../com.shinkson47.SplashX6.rendering.screens.game/-game-screen/index.md#2084822502%2FFunctions%2F971615585) | [jvm]<br>open override fun [dispose](../../com.shinkson47.SplashX6.rendering.screens.game/-game-screen/index.md#2084822502%2FFunctions%2F971615585)() |
| [doResize](do-resize.md) | [jvm]<br>abstract fun [doResize](do-resize.md)(width: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), height: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) |
| [hide](../../com.shinkson47.SplashX6.rendering.screens.game/-game-screen/index.md#1075297875%2FFunctions%2F971615585) | [jvm]<br>open override fun [hide](../../com.shinkson47.SplashX6.rendering.screens.game/-game-screen/index.md#1075297875%2FFunctions%2F971615585)() |
| [pause](../../com.shinkson47.SplashX6.rendering.screens.game/-game-screen/index.md#-510703633%2FFunctions%2F971615585) | [jvm]<br>open override fun [pause](../../com.shinkson47.SplashX6.rendering.screens.game/-game-screen/index.md#-510703633%2FFunctions%2F971615585)() |
| [render](render.md) | [jvm]<br>open override fun [render](render.md)(delta: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)) |
| [resize](resize.md) | [jvm]<br>open override fun [resize](resize.md)(width: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), height: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) |
| [resume](../../com.shinkson47.SplashX6.rendering.screens.game/-game-screen/index.md#434199496%2FFunctions%2F971615585) | [jvm]<br>open override fun [resume](../../com.shinkson47.SplashX6.rendering.screens.game/-game-screen/index.md#434199496%2FFunctions%2F971615585)() |
| [show](show.md) | [jvm]<br>open override fun [show](show.md)() |

## Properties

| Name | Summary |
|---|---|
| [height](height.md) | [jvm]<br>@[JvmField](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-field/index.html)<br>var [height](height.md): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) |
| [stage](stage.md) | [jvm]<br>@[JvmField](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-field/index.html)<br>val [stage](stage.md): Stage |
| [width](width.md) | [jvm]<br>@[JvmField](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-field/index.html)<br>var [width](width.md): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) |

## Inheritors

| Name |
|---|
| [MainMenu](../../com.shinkson47.SplashX6.rendering.screens/-main-menu/index.md) |
| [TextScreen](../../com.shinkson47.SplashX6.rendering.screens/-text-screen/index.md) |
| [WorldCreation](../../com.shinkson47.SplashX6.rendering.screens/-world-creation/index.md) |
| [GameScreen](../../com.shinkson47.SplashX6.rendering.screens.game/-game-screen/index.md) |
