//[core](../../../index.md)/[com.shinkson47.SplashX6.rendering.screens](../index.md)/[SplashScreen](index.md)/[render](render.md)

# render

[jvm]\
open override fun [render](render.md)(delta: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html))

# Draws the next frame of the credits.

Performs all logic and calculation.

Mutates this object with information for next frame.

Renders the credits screen in the current state.

Will wait delay before increasing charIndex to render one more character of the current line. Thus after x frames one more character is drawn than the last.

After reaching the end of the current line, charIndex is reset and lineIndex is incremented. This is repeated until lineIndex reaches maxLines, at which point no more lines can fit in the window.

From then on, maxLines remains the same, and the first line of [lines](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.text/index.html) is removed when moving to next line to create the scrolling effect.

Once there are no more lines to progress to stamp, the remaining contents of [lines](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.text/index.html) is drawn with no changes.
