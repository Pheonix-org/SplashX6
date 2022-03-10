//[core](../../../../../index.md)/[com.shinkson47.SplashX6.rendering.screens.game](../../../index.md)/[Menu](../../index.md)/[MenuItem](../index.md)/[MenuItemClickListener](index.md)

# MenuItemClickListener

[jvm]\
inner class [MenuItemClickListener](index.md) : ClickListener

# A click listener which defines the click behaviour of a menu item.

including the manipulation of the sub action menu.

If the sub action menu is open, click is cancelled. It is assumed the user is trying to close the menu.

## Constructors

| | |
|---|---|
| [MenuItemClickListener](-menu-item-click-listener.md) | [jvm]<br>fun [MenuItemClickListener](-menu-item-click-listener.md)() |

## Functions

| Name | Summary |
|---|---|
| [cancel](index.md#1778038294%2FFunctions%2F971615585) | [jvm]<br>open fun [cancel](index.md#1778038294%2FFunctions%2F971615585)() |
| [clicked](clicked.md) | [jvm]<br>open override fun [clicked](clicked.md)(event: InputEvent?, x: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), y: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html))<br>If the button is down-up clicked, perform the default action. |
| [enter](index.md#-1558627295%2FFunctions%2F971615585) | [jvm]<br>open override fun [enter](index.md#-1558627295%2FFunctions%2F971615585)(p0: InputEvent, p1: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), p2: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), p3: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), @Nullp4: Actor) |
| [exit](index.md#1064164705%2FFunctions%2F971615585) | [jvm]<br>open override fun [exit](index.md#1064164705%2FFunctions%2F971615585)(p0: InputEvent, p1: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), p2: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), p3: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), @Nullp4: Actor) |
| [getButton](index.md#-810375646%2FFunctions%2F971615585) | [jvm]<br>open fun [getButton](index.md#-810375646%2FFunctions%2F971615585)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [getPressedButton](index.md#1089499922%2FFunctions%2F971615585) | [jvm]<br>open fun [getPressedButton](index.md#1089499922%2FFunctions%2F971615585)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [getPressedPointer](index.md#-557882695%2FFunctions%2F971615585) | [jvm]<br>open fun [getPressedPointer](index.md#-557882695%2FFunctions%2F971615585)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [getTapCount](index.md#-1833438808%2FFunctions%2F971615585) | [jvm]<br>open fun [getTapCount](index.md#-1833438808%2FFunctions%2F971615585)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [getTapSquareSize](index.md#13344485%2FFunctions%2F971615585) | [jvm]<br>open fun [getTapSquareSize](index.md#13344485%2FFunctions%2F971615585)(): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) |
| [getTouchDownX](index.md#985264509%2FFunctions%2F971615585) | [jvm]<br>open fun [getTouchDownX](index.md#985264509%2FFunctions%2F971615585)(): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) |
| [getTouchDownY](index.md#1016284316%2FFunctions%2F971615585) | [jvm]<br>open fun [getTouchDownY](index.md#1016284316%2FFunctions%2F971615585)(): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) |
| [handle](index.md#-211058051%2FFunctions%2F971615585) | [jvm]<br>open override fun [handle](index.md#-211058051%2FFunctions%2F971615585)(e: Event): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [inTapSquare](index.md#-2057291409%2FFunctions%2F971615585) | [jvm]<br>open fun [inTapSquare](index.md#-2057291409%2FFunctions%2F971615585)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>open fun [inTapSquare](index.md#-1350044400%2FFunctions%2F971615585)(p0: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), p1: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [invalidateTapSquare](index.md#-436389115%2FFunctions%2F971615585) | [jvm]<br>open fun [invalidateTapSquare](index.md#-436389115%2FFunctions%2F971615585)() |
| [isOver](index.md#-578663438%2FFunctions%2F971615585) | [jvm]<br>open fun [isOver](index.md#-578663438%2FFunctions%2F971615585)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>open fun [isOver](index.md#360798935%2FFunctions%2F971615585)(p0: Actor, p1: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), p2: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [isPressed](index.md#2080864946%2FFunctions%2F971615585) | [jvm]<br>open fun [isPressed](index.md#2080864946%2FFunctions%2F971615585)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [isVisualPressed](index.md#-634533678%2FFunctions%2F971615585) | [jvm]<br>open fun [isVisualPressed](index.md#-634533678%2FFunctions%2F971615585)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [keyDown](index.md#866066303%2FFunctions%2F971615585) | [jvm]<br>open fun [keyDown](index.md#866066303%2FFunctions%2F971615585)(event: InputEvent, keycode: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [keyTyped](index.md#679149912%2FFunctions%2F971615585) | [jvm]<br>open fun [keyTyped](index.md#679149912%2FFunctions%2F971615585)(event: InputEvent, character: [Char](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char/index.html)): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [keyUp](index.md#-1557313032%2FFunctions%2F971615585) | [jvm]<br>open fun [keyUp](index.md#-1557313032%2FFunctions%2F971615585)(event: InputEvent, keycode: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [mouseMoved](index.md#247543477%2FFunctions%2F971615585) | [jvm]<br>open fun [mouseMoved](index.md#247543477%2FFunctions%2F971615585)(event: InputEvent, x: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), y: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [scrolled](index.md#-303880169%2FFunctions%2F971615585) | [jvm]<br>open fun [scrolled](index.md#-303880169%2FFunctions%2F971615585)(event: InputEvent, x: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), y: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), amountX: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), amountY: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [setButton](index.md#1303760308%2FFunctions%2F971615585) | [jvm]<br>open fun [setButton](index.md#1303760308%2FFunctions%2F971615585)(p0: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) |
| [setTapCount](index.md#1293196474%2FFunctions%2F971615585) | [jvm]<br>open fun [setTapCount](index.md#1293196474%2FFunctions%2F971615585)(p0: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) |
| [setTapCountInterval](index.md#-849957656%2FFunctions%2F971615585) | [jvm]<br>open fun [setTapCountInterval](index.md#-849957656%2FFunctions%2F971615585)(p0: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)) |
| [setTapSquareSize](index.md#-1419927806%2FFunctions%2F971615585) | [jvm]<br>open fun [setTapSquareSize](index.md#-1419927806%2FFunctions%2F971615585)(p0: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)) |
| [setVisualPressed](index.md#-494063787%2FFunctions%2F971615585) | [jvm]<br>open fun [setVisualPressed](index.md#-494063787%2FFunctions%2F971615585)(p0: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)) |
| [touchDown](touch-down.md) | [jvm]<br>open override fun [touchDown](touch-down.md)(event: InputEvent?, x: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), y: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), pointer: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), button: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [touchDragged](index.md#2033833900%2FFunctions%2F971615585) | [jvm]<br>open override fun [touchDragged](index.md#2033833900%2FFunctions%2F971615585)(p0: InputEvent, p1: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), p2: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), p3: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) |
| [touchUp](touch-up.md) | [jvm]<br>open override fun [touchUp](touch-up.md)(event: InputEvent?, x: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), y: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), pointer: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), button: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html))<br>On release, hides the menu if the mouse is still over the menu button. |
