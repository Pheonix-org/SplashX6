//[core](../../../index.md)/[com.ray3k.tenpatch](../index.md)/[TenPatchDrawable](index.md)

# TenPatchDrawable

[jvm]\
open class [TenPatchDrawable](index.md) : TextureRegionDrawable

TenPatchDrawable is an alternative to libGDX's implementation of 9-patch. The NinePatch class is limited in functionality: it can only define one stretchable area per axis. Real 9-patches allow for multiple stretch areas as seen in the Android OS. TenPatch addresses this issue by allowing users to pass in multiple values for stretch areas. Stretching is then divided among the multiple patches based on their ratio. It also adds a tiling option, increasing functionality in UI across the board. Unfortunately, the NinePatch class is deep-rooted in libGDX. Full replacement would require modifications to TextureAtlas, TexturePacker, and more. Thus, TenPatchDrawable will not be directly loaded from a TextureAtlas or from a 9-patch image file. Typical use would require loading from a Skin JSON. Specifying stretch regions and options will be made simple by using the associated editor in Skin Composer.

#### Author

Raymond Buckley

## See also

jvm

| | |
|---|---|
| &lt;a href="https://github.com/raeleus/skin-composer"&gt;Skin Composer&lt;/a&gt; |  |

## Constructors

| | |
|---|---|
| [TenPatchDrawable](-ten-patch-drawable.md) | [jvm]<br>open fun [TenPatchDrawable](-ten-patch-drawable.md)()<br>No-argument constructor necessary for loading via JSON. |
| [TenPatchDrawable](-ten-patch-drawable.md) | [jvm]<br>open fun [TenPatchDrawable](-ten-patch-drawable.md)(other: [TenPatchDrawable](index.md))<br>Create a duplicate TenPatchDrawable. |
| [TenPatchDrawable](-ten-patch-drawable.md) | [jvm]<br>open fun [TenPatchDrawable](-ten-patch-drawable.md)(horizontalStretchAreas: [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)&lt;[Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)&gt;, verticalStretchAreas: [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)&lt;[Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)&gt;, tiling: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), region: TextureRegion)<br>Creates a TenPatchDrawable. |

## Types

| Name | Summary |
|---|---|
| [CrushMode](-crush-mode/index.md) | [jvm]<br>open class [CrushMode](-crush-mode/index.md)<br>The strategies used when the drawable is forced to scale below the minimum size. |
| [InvalidPatchException](-invalid-patch-exception/index.md) | [jvm]<br>open class [InvalidPatchException](-invalid-patch-exception/index.md) : [RuntimeException](https://docs.oracle.com/javase/8/docs/api/java/lang/RuntimeException.html) |
| [PlayMode](-play-mode/index.md) | [jvm]<br>open class [PlayMode](-play-mode/index.md) |

## Functions

| Name | Summary |
|---|---|
| [draw](draw.md) | [jvm]<br>open fun [draw](draw.md)(batch: Batch, x: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), y: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), width: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), height: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html))<br>Draws the TenPatch to the specified batch.<br>[jvm]<br>@[Deprecated](https://docs.oracle.com/javase/8/docs/api/java/lang/Deprecated.html)<br>~~open~~ ~~fun~~ [~~draw~~](draw.md)~~(~~~~batch~~~~:~~ Batch~~,~~ ~~x~~~~:~~ [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)~~,~~ ~~y~~~~:~~ [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)~~,~~ ~~originX~~~~:~~ [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)~~,~~ ~~originY~~~~:~~ [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)~~,~~ ~~width~~~~:~~ [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)~~,~~ ~~height~~~~:~~ [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)~~,~~ ~~scaleX~~~~:~~ [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)~~,~~ ~~scaleY~~~~:~~ [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)~~,~~ ~~rotation~~~~:~~ [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)~~)~~<br>Not supported. |
| [getBottomHeight](index.md#-62257189%2FFunctions%2F971615585) | [jvm]<br>open fun [getBottomHeight](index.md#-62257189%2FFunctions%2F971615585)(): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) |
| [getKeyFrame](get-key-frame.md) | [jvm]<br>open fun [getKeyFrame](get-key-frame.md)(): TextureRegion<br>open fun [getKeyFrame](get-key-frame.md)(time: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)): TextureRegion |
| [getLeftWidth](index.md#962399630%2FFunctions%2F971615585) | [jvm]<br>open fun [getLeftWidth](index.md#962399630%2FFunctions%2F971615585)(): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) |
| [getMinHeight](index.md#1503849140%2FFunctions%2F971615585) | [jvm]<br>open fun [getMinHeight](index.md#1503849140%2FFunctions%2F971615585)(): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) |
| [getMinWidth](index.md#-2128637255%2FFunctions%2F971615585) | [jvm]<br>open fun [getMinWidth](index.md#-2128637255%2FFunctions%2F971615585)(): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) |
| [getName](index.md#1437003426%2FFunctions%2F971615585) | [jvm]<br>open fun [getName](index.md#1437003426%2FFunctions%2F971615585)(): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |
| [getRegion](index.md#1208768943%2FFunctions%2F971615585) | [jvm]<br>open fun [getRegion](index.md#1208768943%2FFunctions%2F971615585)(): TextureRegion |
| [getRightWidth](index.md#2012736771%2FFunctions%2F971615585) | [jvm]<br>open fun [getRightWidth](index.md#2012736771%2FFunctions%2F971615585)(): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) |
| [getTopHeight](index.md#149958481%2FFunctions%2F971615585) | [jvm]<br>open fun [getTopHeight](index.md#149958481%2FFunctions%2F971615585)(): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) |
| [isAutoUpdate](is-auto-update.md) | [jvm]<br>open fun [isAutoUpdate](is-auto-update.md)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Returns whether the drawable automatically updates the animation and offset via Gdx.graphics.getDeltaTime(). |
| [isTiling](is-tiling.md) | [jvm]<br>open fun [isTiling](is-tiling.md)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [scale](scale.md) | [jvm]<br>open fun [scale](scale.md)(scaleX: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), scaleY: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html))<br>Multiplies the X and Y scaling by the specified amount. |
| [set](set.md) | [jvm]<br>open fun [set](set.md)(other: [TenPatchDrawable](index.md)) |
| [setBottomHeight](index.md#-666744137%2FFunctions%2F971615585) | [jvm]<br>open fun [setBottomHeight](index.md#-666744137%2FFunctions%2F971615585)(bottomHeight: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)) |
| [setColors](set-colors.md) | [jvm]<br>open fun [setColors](set-colors.md)(color1: Color, color2: Color, color3: Color, color4: Color)<br>Sets the colors of the drawing of each patch. |
| [setLeftWidth](index.md#-1577894836%2FFunctions%2F971615585) | [jvm]<br>open fun [setLeftWidth](index.md#-1577894836%2FFunctions%2F971615585)(leftWidth: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)) |
| [setMinHeight](index.md#1151837926%2FFunctions%2F971615585) | [jvm]<br>open fun [setMinHeight](index.md#1151837926%2FFunctions%2F971615585)(minHeight: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)) |
| [setMinSize](index.md#406648391%2FFunctions%2F971615585) | [jvm]<br>open fun [setMinSize](index.md#406648391%2FFunctions%2F971615585)(minWidth: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), minHeight: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)) |
| [setMinWidth](index.md#1612693657%2FFunctions%2F971615585) | [jvm]<br>open fun [setMinWidth](index.md#1612693657%2FFunctions%2F971615585)(minWidth: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)) |
| [setName](index.md#74689297%2FFunctions%2F971615585) | [jvm]<br>open fun [setName](index.md#74689297%2FFunctions%2F971615585)(name: [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)) |
| [setOffset](set-offset.md) | [jvm]<br>open fun [setOffset](set-offset.md)(offset: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html))<br>open fun [setOffset](set-offset.md)(offsetX: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), offsetY: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html))<br>Sets the offset of tiles in the stretchable areas. |
| [setOffsetSpeed](set-offset-speed.md) | [jvm]<br>open fun [setOffsetSpeed](set-offset-speed.md)(offsetSpeed: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html))<br>open fun [setOffsetSpeed](set-offset-speed.md)(offsetXspeed: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), offsetYspeed: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html))<br>Sets a horizontal and vertical speed to update the tile offsets to achieve an animated effect. |
| [setPadding](index.md#2088456755%2FFunctions%2F971615585) | [jvm]<br>open fun [setPadding](index.md#2088456755%2FFunctions%2F971615585)(topHeight: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), leftWidth: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), bottomHeight: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), rightWidth: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)) |
| [setRegion](index.md#-243868371%2FFunctions%2F971615585) | [jvm]<br>open fun [setRegion](index.md#-243868371%2FFunctions%2F971615585)(region: TextureRegion) |
| [setRightWidth](index.md#709194127%2FFunctions%2F971615585) | [jvm]<br>open fun [setRightWidth](index.md#709194127%2FFunctions%2F971615585)(rightWidth: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)) |
| [setScale](set-scale.md) | [jvm]<br>open fun [setScale](set-scale.md)(scale: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html))<br>open fun [setScale](set-scale.md)(scaleX: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), scaleY: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)) |
| [setTopHeight](index.md#854441065%2FFunctions%2F971615585) | [jvm]<br>open fun [setTopHeight](index.md#854441065%2FFunctions%2F971615585)(topHeight: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)) |
| [tint](tint.md) | [jvm]<br>open fun [tint](tint.md)(tint: Color): [TenPatchDrawable](index.md)<br>Creates a new drawable that renders the same as this drawable tinted the specified color. |
| [toString](index.md#-1027833653%2FFunctions%2F971615585) | [jvm]<br>open fun [toString](index.md#-1027833653%2FFunctions%2F971615585)(): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |
| [update](update.md) | [jvm]<br>open fun [update](update.md)(delta: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html))<br>This method must be called to update the offset via offsetXspeed and offsetYspeed. |

## Properties

| Name | Summary |
|---|---|
| [autoUpdate](auto-update.md) | [jvm]<br>private open var [autoUpdate](auto-update.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [color](color.md) | [jvm]<br>private open var [color](color.md): Color |
| [color1](color1.md) | [jvm]<br>private open var [color1](color1.md): Color |
| [color2](color2.md) | [jvm]<br>private open var [color2](color2.md): Color |
| [color3](color3.md) | [jvm]<br>private open var [color3](color3.md): Color |
| [color4](color4.md) | [jvm]<br>private open var [color4](color4.md): Color |
| [crushMode](crush-mode.md) | [jvm]<br>open var [crushMode](crush-mode.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [frameDuration](frame-duration.md) | [jvm]<br>private open var [frameDuration](frame-duration.md): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) |
| [horizontalStretchAreas](horizontal-stretch-areas.md) | [jvm]<br>open var [horizontalStretchAreas](horizontal-stretch-areas.md): [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)&lt;[Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)&gt; |
| [offsetX](offset-x.md) | [jvm]<br>open var [offsetX](offset-x.md): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) |
| [offsetXspeed](offset-xspeed.md) | [jvm]<br>open var [offsetXspeed](offset-xspeed.md): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) |
| [offsetY](offset-y.md) | [jvm]<br>open var [offsetY](offset-y.md): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) |
| [offsetYspeed](offset-yspeed.md) | [jvm]<br>open var [offsetYspeed](offset-yspeed.md): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) |
| [playMode](play-mode.md) | [jvm]<br>open var [playMode](play-mode.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [randomXS128](random-x-s128.md) | [jvm]<br>open val [randomXS128](random-x-s128.md): RandomXS128 |
| [regions](regions.md) | [jvm]<br>private open var [regions](regions.md): Array&lt;TextureRegion&gt; |
| [scaleX](scale-x.md) | [jvm]<br>open var [scaleX](scale-x.md): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) |
| [scaleY](scale-y.md) | [jvm]<br>open var [scaleY](scale-y.md): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) |
| [seed](seed.md) | [jvm]<br>open val [seed](seed.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [tiling](tiling.md) | [jvm]<br>open var [tiling](tiling.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [time](time.md) | [jvm]<br>open var [time](time.md): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) |
| [verticalStretchAreas](vertical-stretch-areas.md) | [jvm]<br>open var [verticalStretchAreas](vertical-stretch-areas.md): [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)&lt;[Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)&gt; |
