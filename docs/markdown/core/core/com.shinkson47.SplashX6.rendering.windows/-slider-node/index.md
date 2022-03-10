//[core](../../../index.md)/[com.shinkson47.SplashX6.rendering.windows](../index.md)/[SliderNode](index.md)

# SliderNode

[jvm]\
class [SliderNode](index.md)&lt;[V](index.md) : [Number](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-number/index.html)&gt;(C: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html), fieldName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), key: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), min: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), max: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), step: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)) : [TitledNode](../-titled-node/index.md)&lt;[V](index.md), Slider&gt; 

# A [ReflectionNode](../-reflection-node/index.md) which edits a number value.

Natively, the slider works with floats, but the output is automatically cast to [V](index.md).

Defaults to field's value, and alters it upon change using a Stagewindow#LambdaChangeListener

Throws [ClassCastException](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-class-cast-exception/index.html) on initalization if [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) cannot be cast to [V](index.md).

## Constructors

| | |
|---|---|
| [SliderNode](-slider-node.md) | [jvm]<br>fun [SliderNode](-slider-node.md)(C: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html), fieldName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), key: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), min: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) = 0.0f, max: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) = 100.0f, step: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) = 1.0f) |

## Functions

| Name | Summary |
|---|---|
| [add](../-script-node/index.md#1405723820%2FFunctions%2F971615585) | [jvm]<br>open fun [add](../-script-node/index.md#1405723820%2FFunctions%2F971615585)(p0: Tree.Node&lt;*, *, *&gt;) |
| [addAll](../-script-node/index.md#-1952574360%2FFunctions%2F971615585) | [jvm]<br>open fun [addAll](../-script-node/index.md#-1952574360%2FFunctions%2F971615585)(p0: Array&lt;Tree.Node&lt;*, *, *&gt;&gt;) |
| [addToTree](index.md#1089126958%2FFunctions%2F971615585) | [jvm]<br>open fun [addToTree](index.md#1089126958%2FFunctions%2F971615585)(p0: Tree&lt;Tree.Node&lt;*, *, *&gt;, [V](index.md)&gt;, p1: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [clearChildren](../-script-node/index.md#1854828173%2FFunctions%2F971615585) | [jvm]<br>open fun [clearChildren](../-script-node/index.md#1854828173%2FFunctions%2F971615585)() |
| [collapseAll](../-script-node/index.md#227403589%2FFunctions%2F971615585) | [jvm]<br>open fun [collapseAll](../-script-node/index.md#227403589%2FFunctions%2F971615585)() |
| [countActors](../-script-node/index.md#2138957068%2FFunctions%2F971615585) | [jvm]<br>open fun [countActors](../-script-node/index.md#2138957068%2FFunctions%2F971615585)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [expandAll](../-script-node/index.md#-2058294350%2FFunctions%2F971615585) | [jvm]<br>open fun [expandAll](../-script-node/index.md#-2058294350%2FFunctions%2F971615585)() |
| [expandTo](../-script-node/index.md#519750764%2FFunctions%2F971615585) | [jvm]<br>open fun [expandTo](../-script-node/index.md#519750764%2FFunctions%2F971615585)() |
| [findExpandedValues](index.md#-1103309800%2FFunctions%2F971615585) | [jvm]<br>open fun [findExpandedValues](index.md#-1103309800%2FFunctions%2F971615585)(p0: Array&lt;[V](index.md)&gt;) |
| [findNode](index.md#-2090354046%2FFunctions%2F971615585) | [jvm]<br>@Null<br>open fun [findNode](index.md#-2090354046%2FFunctions%2F971615585)(p0: [V](index.md)): Tree.Node&lt;*, *, *&gt; |
| [getActor](../-script-node/index.md#-1797419486%2FFunctions%2F971615585) | [jvm]<br>open fun [getActor](../-script-node/index.md#-1797419486%2FFunctions%2F971615585)(): VerticalGroup |
| [getChildren](../-script-node/index.md#518887844%2FFunctions%2F971615585) | [jvm]<br>open fun [getChildren](../-script-node/index.md#518887844%2FFunctions%2F971615585)(): Array&lt;Tree.Node&lt;*, *, *&gt;&gt; |
| [getHeight](../-script-node/index.md#1872612604%2FFunctions%2F971615585) | [jvm]<br>open fun [getHeight](../-script-node/index.md#1872612604%2FFunctions%2F971615585)(): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) |
| [getIcon](../-script-node/index.md#1568050026%2FFunctions%2F971615585) | [jvm]<br>@Null<br>open fun [getIcon](../-script-node/index.md#1568050026%2FFunctions%2F971615585)(): Drawable |
| [getLevel](../-script-node/index.md#-2008536205%2FFunctions%2F971615585) | [jvm]<br>open fun [getLevel](../-script-node/index.md#-2008536205%2FFunctions%2F971615585)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [getParent](../-script-node/index.md#-29049127%2FFunctions%2F971615585) | [jvm]<br>@Null<br>open fun [getParent](../-script-node/index.md#-29049127%2FFunctions%2F971615585)(): Tree.Node&lt;*, *, *&gt; |
| [getTree](../-script-node/index.md#-229230619%2FFunctions%2F971615585) | [jvm]<br>@Null<br>open fun [getTree](../-script-node/index.md#-229230619%2FFunctions%2F971615585)(): Tree&lt;Tree.Node&lt;*, *, *&gt;, [V](index.md)&gt; |
| [getValue](../-script-node/index.md#163367462%2FFunctions%2F971615585) | [jvm]<br>@Null<br>open fun [getValue](../-script-node/index.md#163367462%2FFunctions%2F971615585)(): [V](index.md) |
| [hasChildren](../-script-node/index.md#-1163260192%2FFunctions%2F971615585) | [jvm]<br>open fun [hasChildren](../-script-node/index.md#-1163260192%2FFunctions%2F971615585)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [insert](../-script-node/index.md#110883659%2FFunctions%2F971615585) | [jvm]<br>open fun [insert](../-script-node/index.md#110883659%2FFunctions%2F971615585)(p0: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), p1: Tree.Node&lt;*, *, *&gt;) |
| [isAscendantOf](../-script-node/index.md#-1744999019%2FFunctions%2F971615585) | [jvm]<br>open fun [isAscendantOf](../-script-node/index.md#-1744999019%2FFunctions%2F971615585)(p0: Tree.Node&lt;*, *, *&gt;): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [isDescendantOf](../-script-node/index.md#-434102655%2FFunctions%2F971615585) | [jvm]<br>open fun [isDescendantOf](../-script-node/index.md#-434102655%2FFunctions%2F971615585)(p0: Tree.Node&lt;*, *, *&gt;): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [isExpanded](../-script-node/index.md#1012936158%2FFunctions%2F971615585) | [jvm]<br>open fun [isExpanded](../-script-node/index.md#1012936158%2FFunctions%2F971615585)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [isSelectable](../-script-node/index.md#-2095021471%2FFunctions%2F971615585) | [jvm]<br>open fun [isSelectable](../-script-node/index.md#-2095021471%2FFunctions%2F971615585)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [remove](../-script-node/index.md#-743117187%2FFunctions%2F971615585) | [jvm]<br>open fun [remove](../-script-node/index.md#-743117187%2FFunctions%2F971615585)()<br>open fun [remove](../-script-node/index.md#925666311%2FFunctions%2F971615585)(p0: Tree.Node&lt;*, *, *&gt;) |
| [removeFromTree](index.md#239399160%2FFunctions%2F971615585) | [jvm]<br>open fun [removeFromTree](index.md#239399160%2FFunctions%2F971615585)(p0: Tree&lt;Tree.Node&lt;*, *, *&gt;, [V](index.md)&gt;, p1: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) |
| [restoreExpandedValues](index.md#466733621%2FFunctions%2F971615585) | [jvm]<br>open fun [restoreExpandedValues](index.md#466733621%2FFunctions%2F971615585)(p0: Array&lt;[V](index.md)&gt;) |
| [setActor](../-select-node/index.md#2116960995%2FFunctions%2F971615585) | [jvm]<br>open fun [setActor](../-select-node/index.md#2116960995%2FFunctions%2F971615585)(p0: VerticalGroup) |
| [setExpanded](../-script-node/index.md#698453859%2FFunctions%2F971615585) | [jvm]<br>open fun [setExpanded](../-script-node/index.md#698453859%2FFunctions%2F971615585)(p0: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)) |
| [setIcon](../-script-node/index.md#1877221031%2FFunctions%2F971615585) | [jvm]<br>open fun [setIcon](../-script-node/index.md#1877221031%2FFunctions%2F971615585)(@Nullp0: Drawable) |
| [setSelectable](../-script-node/index.md#1247515302%2FFunctions%2F971615585) | [jvm]<br>open fun [setSelectable](../-script-node/index.md#1247515302%2FFunctions%2F971615585)(p0: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)) |
| [setValue](index.md#-1933408170%2FFunctions%2F971615585) | [jvm]<br>open fun [setValue](index.md#-1933408170%2FFunctions%2F971615585)(@Nullp0: [V](index.md)) |
| [updateChildren](../-script-node/index.md#967530905%2FFunctions%2F971615585) | [jvm]<br>open fun [updateChildren](../-script-node/index.md#967530905%2FFunctions%2F971615585)() |

## Properties

| Name | Summary |
|---|---|
| [_actor](../-titled-node/_actor.md) | [jvm]<br>val [_actor](../-titled-node/_actor.md): Slider |
| [actor](../-script-node/index.md#1995593764%2FProperties%2F971615585) | [jvm]<br>val [actor](../-script-node/index.md#1995593764%2FProperties%2F971615585): VerticalGroup |
| [after](../-reflection-node/after.md) | [jvm]<br>var [after](../-reflection-node/after.md): [Runnable](https://docs.oracle.com/javase/8/docs/api/java/lang/Runnable.html)? |
| [children](../-script-node/index.md#1882028130%2FProperties%2F971615585) | [jvm]<br>val [children](../-script-node/index.md#1882028130%2FProperties%2F971615585): Array&lt;Tree.Node&lt;*, *, *&gt;&gt; |
| [expanded](../-script-node/index.md#-653898008%2FProperties%2F971615585) | [jvm]<br>val [expanded](../-script-node/index.md#-653898008%2FProperties%2F971615585): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [field](../-reflection-node/field.md) | [jvm]<br>var [field](../-reflection-node/field.md): [KMutableProperty](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.reflect/-k-mutable-property/index.html)&lt;[V](index.md)&gt;? |
| [height](../-script-node/index.md#-803060934%2FProperties%2F971615585) | [jvm]<br>val [height](../-script-node/index.md#-803060934%2FProperties%2F971615585): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) |
| [icon](../-script-node/index.md#1551857960%2FProperties%2F971615585) | [jvm]<br>val [icon](../-script-node/index.md#1551857960%2FProperties%2F971615585): Drawable |
| [instance](../-reflection-node/instance.md) | [jvm]<br>val [instance](../-reflection-node/instance.md): [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html) |
| [parent](../-script-node/index.md#1590244631%2FProperties%2F971615585) | [jvm]<br>val [parent](../-script-node/index.md#1590244631%2FProperties%2F971615585): Tree.Node&lt;*, *, *&gt; |
| [selectable](../-script-node/index.md#-1899853589%2FProperties%2F971615585) | [jvm]<br>val [selectable](../-script-node/index.md#-1899853589%2FProperties%2F971615585): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [value](../-script-node/index.md#-338586584%2FProperties%2F971615585) | [jvm]<br>val [value](../-script-node/index.md#-338586584%2FProperties%2F971615585): [V](index.md) |
