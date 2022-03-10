//[core](../../../index.md)/[com.ray3k.tenpatch](../index.md)/[TenPatchDrawable](index.md)/[TenPatchDrawable](-ten-patch-drawable.md)

# TenPatchDrawable

[jvm]\
open fun [TenPatchDrawable](-ten-patch-drawable.md)()

No-argument constructor necessary for loading via JSON. horizontalStretchAreas and verticalStretchAreas must be set before this drawable is drawn.

## See also

jvm

| | |
|---|---|
| com.ray3k.tenpatch.TenPatchDrawable |  |

[jvm]\
open fun [TenPatchDrawable](-ten-patch-drawable.md)(other: [TenPatchDrawable](index.md))

Create a duplicate TenPatchDrawable.

## Parameters

jvm

| | |
|---|---|
| other |  |

[jvm]\
open fun [TenPatchDrawable](-ten-patch-drawable.md)(horizontalStretchAreas: [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)&lt;[Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)&gt;, verticalStretchAreas: [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)&lt;[Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)&gt;, tiling: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), region: TextureRegion)

Creates a TenPatchDrawable. All stretch values must be defined in pairs.

## Parameters

jvm

| | |
|---|---|
| horizontalStretchAreas | Pairs of values defining stretch areas from the left of the graphic in ascending order in pixels. All values are inclusive with 0 being the left-most pixel (i.e. (0,2) defines a 3 pixel wide stretch area on the left of the graphic). |
| verticalStretchAreas | Pairs of values defining stretch areas from the bottom of the graphic in ascending order in pixels. All values are inclusive with 0 being the bottom-most pixel (i.e. (0,2) defines a 3 pixel high stretch area on the bottom of the graphic). |
| tiling |  |
| region |  |
