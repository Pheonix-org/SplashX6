//[core](../../index.md)/[com.shinkson47.SplashX6.rendering.screens](index.md)

# Package com.shinkson47.SplashX6.rendering.screens

## Types

| Name | Summary |
|---|---|
| [MainMenu](-main-menu/index.md) | [jvm]<br>class [MainMenu](-main-menu/index.md) : [ScalingScreenAdapter](../com.shinkson47.SplashX6.rendering.ui/-scaling-screen-adapter/index.md)<br><h1></h1> <br></br> |
| [ScreenTransistion](-screen-transistion/index.md) | [jvm]<br>open class [ScreenTransistion](-screen-transistion/index.md) : ScreenAdapter<br>An aggregate screen which fades between two other screens. |
| [SplashScreen](-splash-screen/index.md) | [jvm]<br>class [SplashScreen](-splash-screen/index.md) : [TextScreen](-text-screen/index.md) |
| [TextScreen](-text-screen/index.md) | [jvm]<br>open class [TextScreen](-text-screen/index.md)(text: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), onESC: Screen?, onComplete: Screen?, fontColor: Color, font: BitmapFont, background: Drawable?) : [ScalingScreenAdapter](../com.shinkson47.SplashX6.rendering.ui/-scaling-screen-adapter/index.md)<br>A screen which can display text and a texture. |
| [Warroom](-warroom/index.md) | [jvm]<br>class [Warroom](-warroom/index.md)(parent: [GameScreen](../com.shinkson47.SplashX6.rendering.screens.game/-game-screen/index.md)) : ScreenAdapter |
| [WorldCreation](-world-creation/index.md) | [jvm]<br>class [WorldCreation](-world-creation/index.md)(isConnecting: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), isLoading: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)) : [ScalingScreenAdapter](../com.shinkson47.SplashX6.rendering.ui/-scaling-screen-adapter/index.md) |
