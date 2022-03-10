//[core](../../../index.md)/[com.shinkson47.SplashX6.utility](../index.md)/[GraphicalConfig](index.md)

# GraphicalConfig

[jvm]\
object [GraphicalConfig](index.md)

# Object that manages rendering modes, scaling, and other graphical configurations.

#### Author

[Jordan T. Gray](https://www.shinkson47.in) on 15/06/2021

#### Since

v1

## Functions

| Name | Summary |
|---|---|
| [callibrateCullingFrustum](callibrate-culling-frustum.md) | [jvm]<br>fun [callibrateCullingFrustum](callibrate-culling-frustum.md)(parent: [StageWindow](../../com.shinkson47.SplashX6.rendering/-stage-window/index.md)) |
| [enterFullscreen](enter-fullscreen.md) | [jvm]<br>fun [enterFullscreen](enter-fullscreen.md)()<br>Asserts the application into exclusive fullscreen with the current display mode. |
| [exitFullscreen](exit-fullscreen.md) | [jvm]<br>fun [exitFullscreen](exit-fullscreen.md)()<br>Asserts the application into windowed with the current display mode. |
| [getDisplayModes](get-display-modes.md) | [jvm]<br>fun [getDisplayModes](get-display-modes.md)(): [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)&lt;Graphics.DisplayMode&gt;<br>Gets a list of all available display modes. |
| [toggleFullscreen](toggle-fullscreen.md) | [jvm]<br>fun [toggleFullscreen](toggle-fullscreen.md)()<br>If in [fullscreen](fullscreen.md), calls [exitFullscreen](exit-fullscreen.md) and vice versa. |

## Properties

| Name | Summary |
|---|---|
| [displayMode](display-mode.md) | [jvm]<br>var [displayMode](display-mode.md): Graphics.DisplayMode<br>Setter changes the display mode. |
| [fullscreen](fullscreen.md) | [jvm]<br>var [fullscreen](fullscreen.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Flag representing the current fullscreen state. |
| [MIN_STAGE_HEIGHT](-m-i-n_-s-t-a-g-e_-h-e-i-g-h-t.md) | [jvm]<br>var [MIN_STAGE_HEIGHT](-m-i-n_-s-t-a-g-e_-h-e-i-g-h-t.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) = 1080<br>Absolute minimum render size. |
| [MIN_STAGE_WITDH](-m-i-n_-s-t-a-g-e_-w-i-t-d-h.md) | [jvm]<br>var [MIN_STAGE_WITDH](-m-i-n_-s-t-a-g-e_-w-i-t-d-h.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) = 1920<br>Absolute minimum render size. |
| [scalingMode](scaling-mode.md) | [jvm]<br>var [scalingMode](scaling-mode.md): Scaling<br>The way in which the window content will be injected into the display area (window). |
