//[core](../../../index.md)/[com.shinkson47.SplashX6.rendering.screens](../index.md)/[WorldCreation](index.md)

# WorldCreation

[jvm]\
class [WorldCreation](index.md)(isConnecting: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), isLoading: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)) : [ScalingScreenAdapter](../../com.shinkson47.SplashX6.rendering.ui/-scaling-screen-adapter/index.md)

# Provides the user a place to configure the game and world generation

#### Author

[Jordan T. Gray on 16/04/2021](https://www.shinkson47.in)

#### Since

v1

## Constructors

| | |
|---|---|
| [WorldCreation](-world-creation.md) | [jvm]<br>fun [WorldCreation](-world-creation.md)(isConnecting: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = false, isLoading: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = false) |

## Types

| Name | Summary |
|---|---|
| [W_GameCreation](-w_-game-creation/index.md) | [jvm]<br>inner class [W_GameCreation](-w_-game-creation/index.md) : [StageWindow](../../com.shinkson47.SplashX6.rendering.ui/-stage-window/index.md) |
| [WorldCreationScreenController](-world-creation-screen-controller/index.md) | [jvm]<br>inner class [WorldCreationScreenController](-world-creation-screen-controller/index.md) : [StateMachine](../../com.shinkson47.SplashX6.ai/-state-machine/index.md)<br>Controlls the state of the game loading window. |

## Functions

| Name | Summary |
|---|---|
| [addw](addw.md) | [jvm]<br>fun [addw](addw.md)(w: Window) |
| [cancel](cancel.md) | [jvm]<br>fun [cancel](cancel.md)() |
| [constructConnectingText](construct-connecting-text.md) | [jvm]<br>fun [constructConnectingText](construct-connecting-text.md)() |
| [constructDeserializingText](construct-deserializing-text.md) | [jvm]<br>fun [constructDeserializingText](construct-deserializing-text.md)() |
| [constructGeneratingText](construct-generating-text.md) | [jvm]<br>fun [constructGeneratingText](construct-generating-text.md)() |
| [dialog](../../com.shinkson47.SplashX6.rendering.ui/-scaling-screen-adapter/dialog.md) | [jvm]<br>fun [dialog](../../com.shinkson47.SplashX6.rendering.ui/-scaling-screen-adapter/dialog.md)(titleKey: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), textKey: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), handler: [Consumer](https://docs.oracle.com/javase/8/docs/api/java/util/function/Consumer.html)&lt;[Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)&gt;?) |
| [dispose](../../com.shinkson47.SplashX6.rendering.screens.game/-game-screen/index.md#2084822502%2FFunctions%2F971615585) | [jvm]<br>open override fun [dispose](../../com.shinkson47.SplashX6.rendering.screens.game/-game-screen/index.md#2084822502%2FFunctions%2F971615585)() |
| [doResize](do-resize.md) | [jvm]<br>open override fun [doResize](do-resize.md)(width: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), height: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) |
| [hide](../../com.shinkson47.SplashX6.rendering.screens.game/-game-screen/index.md#1075297875%2FFunctions%2F971615585) | [jvm]<br>open override fun [hide](../../com.shinkson47.SplashX6.rendering.screens.game/-game-screen/index.md#1075297875%2FFunctions%2F971615585)() |
| [pause](../../com.shinkson47.SplashX6.rendering.screens.game/-game-screen/index.md#-510703633%2FFunctions%2F971615585) | [jvm]<br>open override fun [pause](../../com.shinkson47.SplashX6.rendering.screens.game/-game-screen/index.md#-510703633%2FFunctions%2F971615585)() |
| [render](render.md) | [jvm]<br>open override fun [render](render.md)(delta: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)) |
| [resize](../../com.shinkson47.SplashX6.rendering.ui/-scaling-screen-adapter/resize.md) | [jvm]<br>open override fun [resize](../../com.shinkson47.SplashX6.rendering.ui/-scaling-screen-adapter/resize.md)(width: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), height: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) |
| [resume](../../com.shinkson47.SplashX6.rendering.screens.game/-game-screen/index.md#434199496%2FFunctions%2F971615585) | [jvm]<br>open override fun [resume](../../com.shinkson47.SplashX6.rendering.screens.game/-game-screen/index.md#434199496%2FFunctions%2F971615585)() |
| [show](../../com.shinkson47.SplashX6.rendering.ui/-scaling-screen-adapter/show.md) | [jvm]<br>open override fun [show](../../com.shinkson47.SplashX6.rendering.ui/-scaling-screen-adapter/show.md)() |

## Properties

| Name | Summary |
|---|---|
| [controller](controller.md) | [jvm]<br>val [controller](controller.md): [WorldCreation.WorldCreationScreenController](-world-creation-screen-controller/index.md) |
| [height](../../com.shinkson47.SplashX6.rendering.ui/-scaling-screen-adapter/height.md) | [jvm]<br>@[JvmField](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-field/index.html)<br>var [height](../../com.shinkson47.SplashX6.rendering.ui/-scaling-screen-adapter/height.md): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) |
| [isConnecting](is-connecting.md) | [jvm]<br>val [isConnecting](is-connecting.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = false |
| [isLoading](is-loading.md) | [jvm]<br>val [isLoading](is-loading.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = false |
| [stage](../../com.shinkson47.SplashX6.rendering.ui/-scaling-screen-adapter/stage.md) | [jvm]<br>@[JvmField](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-field/index.html)<br>val [stage](../../com.shinkson47.SplashX6.rendering.ui/-scaling-screen-adapter/stage.md): Stage |
| [width](../../com.shinkson47.SplashX6.rendering.ui/-scaling-screen-adapter/width.md) | [jvm]<br>@[JvmField](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-field/index.html)<br>var [width](../../com.shinkson47.SplashX6.rendering.ui/-scaling-screen-adapter/width.md): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) |
