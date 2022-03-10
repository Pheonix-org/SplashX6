//[core](../../../index.md)/[com.shinkson47.SplashX6.rendering.windows](../index.md)/[ScriptNode](index.md)

# ScriptNode

[jvm]\
class [ScriptNode](index.md)(key: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), payload: [Runnable](https://docs.oracle.com/javase/8/docs/api/java/lang/Runnable.html)) : Tree.Node&lt;Tree.Node&lt;*, *, *&gt;, [Runnable](https://docs.oracle.com/javase/8/docs/api/java/lang/Runnable.html), TextButton&gt; 

# A node with a button that executes a [Runnable](https://docs.oracle.com/javase/8/docs/api/java/lang/Runnable.html) when clicked.

## Constructors

| | |
|---|---|
| [ScriptNode](-script-node.md) | [jvm]<br>fun [ScriptNode](-script-node.md)(key: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), payload: [Runnable](https://docs.oracle.com/javase/8/docs/api/java/lang/Runnable.html)) |

## Functions

| Name | Summary |
|---|---|
| [add](index.md#1405723820%2FFunctions%2F971615585) | [jvm]<br>open fun [add](index.md#1405723820%2FFunctions%2F971615585)(p0: Tree.Node&lt;*, *, *&gt;) |
| [addAll](index.md#-1952574360%2FFunctions%2F971615585) | [jvm]<br>open fun [addAll](index.md#-1952574360%2FFunctions%2F971615585)(p0: Array&lt;Tree.Node&lt;*, *, *&gt;&gt;) |
| [addToTree](index.md#1479132793%2FFunctions%2F971615585) | [jvm]<br>open fun [addToTree](index.md#1479132793%2FFunctions%2F971615585)(p0: Tree&lt;Tree.Node&lt;*, *, *&gt;, [Runnable](https://docs.oracle.com/javase/8/docs/api/java/lang/Runnable.html)&gt;, p1: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [clearChildren](index.md#1854828173%2FFunctions%2F971615585) | [jvm]<br>open fun [clearChildren](index.md#1854828173%2FFunctions%2F971615585)() |
| [collapseAll](index.md#227403589%2FFunctions%2F971615585) | [jvm]<br>open fun [collapseAll](index.md#227403589%2FFunctions%2F971615585)() |
| [countActors](index.md#2138957068%2FFunctions%2F971615585) | [jvm]<br>open fun [countActors](index.md#2138957068%2FFunctions%2F971615585)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [expandAll](index.md#-2058294350%2FFunctions%2F971615585) | [jvm]<br>open fun [expandAll](index.md#-2058294350%2FFunctions%2F971615585)() |
| [expandTo](index.md#519750764%2FFunctions%2F971615585) | [jvm]<br>open fun [expandTo](index.md#519750764%2FFunctions%2F971615585)() |
| [findExpandedValues](index.md#-1412176069%2FFunctions%2F971615585) | [jvm]<br>open fun [findExpandedValues](index.md#-1412176069%2FFunctions%2F971615585)(p0: Array&lt;[Runnable](https://docs.oracle.com/javase/8/docs/api/java/lang/Runnable.html)&gt;) |
| [findNode](index.md#625548213%2FFunctions%2F971615585) | [jvm]<br>@Null<br>open fun [findNode](index.md#625548213%2FFunctions%2F971615585)(p0: [Runnable](https://docs.oracle.com/javase/8/docs/api/java/lang/Runnable.html)): Tree.Node&lt;*, *, *&gt; |
| [getActor](index.md#-1797419486%2FFunctions%2F971615585) | [jvm]<br>open fun [getActor](index.md#-1797419486%2FFunctions%2F971615585)(): TextButton |
| [getChildren](index.md#518887844%2FFunctions%2F971615585) | [jvm]<br>open fun [getChildren](index.md#518887844%2FFunctions%2F971615585)(): Array&lt;Tree.Node&lt;*, *, *&gt;&gt; |
| [getHeight](index.md#1872612604%2FFunctions%2F971615585) | [jvm]<br>open fun [getHeight](index.md#1872612604%2FFunctions%2F971615585)(): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) |
| [getIcon](index.md#1568050026%2FFunctions%2F971615585) | [jvm]<br>@Null<br>open fun [getIcon](index.md#1568050026%2FFunctions%2F971615585)(): Drawable |
| [getLevel](index.md#-2008536205%2FFunctions%2F971615585) | [jvm]<br>open fun [getLevel](index.md#-2008536205%2FFunctions%2F971615585)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [getParent](index.md#-29049127%2FFunctions%2F971615585) | [jvm]<br>@Null<br>open fun [getParent](index.md#-29049127%2FFunctions%2F971615585)(): Tree.Node&lt;*, *, *&gt; |
| [getTree](index.md#-229230619%2FFunctions%2F971615585) | [jvm]<br>@Null<br>open fun [getTree](index.md#-229230619%2FFunctions%2F971615585)(): Tree&lt;Tree.Node&lt;*, *, *&gt;, [Runnable](https://docs.oracle.com/javase/8/docs/api/java/lang/Runnable.html)&gt; |
| [getValue](index.md#163367462%2FFunctions%2F971615585) | [jvm]<br>@Null<br>open fun [getValue](index.md#163367462%2FFunctions%2F971615585)(): [Runnable](https://docs.oracle.com/javase/8/docs/api/java/lang/Runnable.html) |
| [hasChildren](index.md#-1163260192%2FFunctions%2F971615585) | [jvm]<br>open fun [hasChildren](index.md#-1163260192%2FFunctions%2F971615585)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [insert](index.md#110883659%2FFunctions%2F971615585) | [jvm]<br>open fun [insert](index.md#110883659%2FFunctions%2F971615585)(p0: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), p1: Tree.Node&lt;*, *, *&gt;) |
| [isAscendantOf](index.md#-1744999019%2FFunctions%2F971615585) | [jvm]<br>open fun [isAscendantOf](index.md#-1744999019%2FFunctions%2F971615585)(p0: Tree.Node&lt;*, *, *&gt;): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [isDescendantOf](index.md#-434102655%2FFunctions%2F971615585) | [jvm]<br>open fun [isDescendantOf](index.md#-434102655%2FFunctions%2F971615585)(p0: Tree.Node&lt;*, *, *&gt;): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [isExpanded](index.md#1012936158%2FFunctions%2F971615585) | [jvm]<br>open fun [isExpanded](index.md#1012936158%2FFunctions%2F971615585)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [isSelectable](index.md#-2095021471%2FFunctions%2F971615585) | [jvm]<br>open fun [isSelectable](index.md#-2095021471%2FFunctions%2F971615585)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [remove](index.md#-743117187%2FFunctions%2F971615585) | [jvm]<br>open fun [remove](index.md#-743117187%2FFunctions%2F971615585)()<br>open fun [remove](index.md#925666311%2FFunctions%2F971615585)(p0: Tree.Node&lt;*, *, *&gt;) |
| [removeFromTree](index.md#1832197359%2FFunctions%2F971615585) | [jvm]<br>open fun [removeFromTree](index.md#1832197359%2FFunctions%2F971615585)(p0: Tree&lt;Tree.Node&lt;*, *, *&gt;, [Runnable](https://docs.oracle.com/javase/8/docs/api/java/lang/Runnable.html)&gt;, p1: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) |
| [restoreExpandedValues](index.md#146217662%2FFunctions%2F971615585) | [jvm]<br>open fun [restoreExpandedValues](index.md#146217662%2FFunctions%2F971615585)(p0: Array&lt;[Runnable](https://docs.oracle.com/javase/8/docs/api/java/lang/Runnable.html)&gt;) |
| [setActor](index.md#-1338811721%2FFunctions%2F971615585) | [jvm]<br>open fun [setActor](index.md#-1338811721%2FFunctions%2F971615585)(p0: TextButton) |
| [setExpanded](index.md#698453859%2FFunctions%2F971615585) | [jvm]<br>open fun [setExpanded](index.md#698453859%2FFunctions%2F971615585)(p0: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)) |
| [setIcon](index.md#1877221031%2FFunctions%2F971615585) | [jvm]<br>open fun [setIcon](index.md#1877221031%2FFunctions%2F971615585)(@Nullp0: Drawable) |
| [setSelectable](index.md#1247515302%2FFunctions%2F971615585) | [jvm]<br>open fun [setSelectable](index.md#1247515302%2FFunctions%2F971615585)(p0: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)) |
| [setValue](index.md#1898897505%2FFunctions%2F971615585) | [jvm]<br>open fun [setValue](index.md#1898897505%2FFunctions%2F971615585)(@Nullp0: [Runnable](https://docs.oracle.com/javase/8/docs/api/java/lang/Runnable.html)) |
| [updateChildren](index.md#967530905%2FFunctions%2F971615585) | [jvm]<br>open fun [updateChildren](index.md#967530905%2FFunctions%2F971615585)() |

## Properties

| Name | Summary |
|---|---|
| [actor](index.md#1995593764%2FProperties%2F971615585) | [jvm]<br>val [actor](index.md#1995593764%2FProperties%2F971615585): TextButton |
| [children](index.md#1882028130%2FProperties%2F971615585) | [jvm]<br>val [children](index.md#1882028130%2FProperties%2F971615585): Array&lt;Tree.Node&lt;*, *, *&gt;&gt; |
| [expanded](index.md#-653898008%2FProperties%2F971615585) | [jvm]<br>val [expanded](index.md#-653898008%2FProperties%2F971615585): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [height](index.md#-803060934%2FProperties%2F971615585) | [jvm]<br>val [height](index.md#-803060934%2FProperties%2F971615585): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) |
| [icon](index.md#1551857960%2FProperties%2F971615585) | [jvm]<br>val [icon](index.md#1551857960%2FProperties%2F971615585): Drawable |
| [parent](index.md#1590244631%2FProperties%2F971615585) | [jvm]<br>val [parent](index.md#1590244631%2FProperties%2F971615585): Tree.Node&lt;*, *, *&gt; |
| [selectable](index.md#-1899853589%2FProperties%2F971615585) | [jvm]<br>val [selectable](index.md#-1899853589%2FProperties%2F971615585): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [value](index.md#-338586584%2FProperties%2F971615585) | [jvm]<br>val [value](index.md#-338586584%2FProperties%2F971615585): [Runnable](https://docs.oracle.com/javase/8/docs/api/java/lang/Runnable.html) |
