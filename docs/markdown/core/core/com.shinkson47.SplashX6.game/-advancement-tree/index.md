//[core](../../../index.md)/[com.shinkson47.SplashX6.game](../index.md)/[AdvancementTree](index.md)

# AdvancementTree

[jvm]\
class [AdvancementTree](index.md)(data: [HashMap](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-hash-map/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), *&gt;) : [ArrayList](https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html)&lt;[Advancement](../-advancement/index.md)&gt; 

A linked list data structure representing a tree of things which can be advanced.

i.e this can be used for a tech tree, governments, requirements for unit production, religion progression, etc.

#### Author

[Jordan T. Gray](https://www.shinkson47.in) on 24/02/2022

#### Since

PRE-ALPHA 0.0.2.

## Constructors

| | |
|---|---|
| [AdvancementTree](-advancement-tree.md) | [jvm]<br>fun [AdvancementTree](-advancement-tree.md)(data: [HashMap](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-hash-map/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), *&gt;) |

## Functions

| Name | Summary |
|---|---|
| [add](index.md#-1655067099%2FFunctions%2F971615585) | [jvm]<br>open override fun [add](index.md#-1655067099%2FFunctions%2F971615585)(element: [Advancement](../-advancement/index.md)): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>open override fun [add](index.md#-1105188548%2FFunctions%2F971615585)(index: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), element: [Advancement](../-advancement/index.md)) |
| [addAll](index.md#-1716441720%2FFunctions%2F971615585) | [jvm]<br>open override fun [addAll](index.md#-1716441720%2FFunctions%2F971615585)(elements: [Collection](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html)&lt;[Advancement](../-advancement/index.md)&gt;): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>open override fun [addAll](index.md#-2093510129%2FFunctions%2F971615585)(index: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), elements: [Collection](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html)&lt;[Advancement](../-advancement/index.md)&gt;): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [clear](index.md#-24309431%2FFunctions%2F971615585) | [jvm]<br>open override fun [clear](index.md#-24309431%2FFunctions%2F971615585)() |
| [clone](index.md#936115257%2FFunctions%2F971615585) | [jvm]<br>open override fun [clone](index.md#936115257%2FFunctions%2F971615585)(): [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html) |
| [contains](index.md#-1107274987%2FFunctions%2F971615585) | [jvm]<br>open operator override fun [contains](index.md#-1107274987%2FFunctions%2F971615585)(element: [Advancement](../-advancement/index.md)): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [containsAll](index.md#-1204134941%2FFunctions%2F971615585) | [jvm]<br>open override fun [containsAll](index.md#-1204134941%2FFunctions%2F971615585)(elements: [Collection](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html)&lt;[Advancement](../-advancement/index.md)&gt;): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [elementData](index.md#2127961038%2FFunctions%2F971615585) | [jvm]<br>open fun [elementData](index.md#2127961038%2FFunctions%2F971615585)(p0: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [Advancement](../-advancement/index.md) |
| [ensureCapacity](index.md#-1361101014%2FFunctions%2F971615585) | [jvm]<br>open fun [ensureCapacity](index.md#-1361101014%2FFunctions%2F971615585)(p0: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) |
| [equals](index.md#450163474%2FFunctions%2F971615585) | [jvm]<br>open operator override fun [equals](index.md#450163474%2FFunctions%2F971615585)(other: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [forEach](index.md#1358874648%2FFunctions%2F971615585) | [jvm]<br>open override fun [forEach](index.md#1358874648%2FFunctions%2F971615585)(p0: [Consumer](https://docs.oracle.com/javase/8/docs/api/java/util/function/Consumer.html)&lt;in [Advancement](../-advancement/index.md)&gt;) |
| [get](index.md#1986850878%2FFunctions%2F971615585) | [jvm]<br>open operator override fun [get](index.md#1986850878%2FFunctions%2F971615585)(index: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [Advancement](../-advancement/index.md) |
| [getA](get-a.md) | [jvm]<br>fun [getA](get-a.md)(name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [Advancement](../-advancement/index.md)? |
| [hashCode](index.md#1188567444%2FFunctions%2F971615585) | [jvm]<br>open override fun [hashCode](index.md#1188567444%2FFunctions%2F971615585)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [indexOf](index.md#1770713341%2FFunctions%2F971615585) | [jvm]<br>open override fun [indexOf](index.md#1770713341%2FFunctions%2F971615585)(element: [Advancement](../-advancement/index.md)): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [isEmpty](index.md#996273107%2FFunctions%2F971615585) | [jvm]<br>open override fun [isEmpty](index.md#996273107%2FFunctions%2F971615585)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [iterator](index.md#204273974%2FFunctions%2F971615585) | [jvm]<br>open operator override fun [iterator](index.md#204273974%2FFunctions%2F971615585)(): [MutableIterator](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-iterator/index.html)&lt;[Advancement](../-advancement/index.md)&gt; |
| [lastIndexOf](index.md#-222978765%2FFunctions%2F971615585) | [jvm]<br>open override fun [lastIndexOf](index.md#-222978765%2FFunctions%2F971615585)(element: [Advancement](../-advancement/index.md)): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [listIterator](index.md#-1172936520%2FFunctions%2F971615585) | [jvm]<br>open override fun [listIterator](index.md#-1172936520%2FFunctions%2F971615585)(): [MutableListIterator](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-list-iterator/index.html)&lt;[Advancement](../-advancement/index.md)&gt;<br>open override fun [listIterator](index.md#1119542358%2FFunctions%2F971615585)(index: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [MutableListIterator](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-list-iterator/index.html)&lt;[Advancement](../-advancement/index.md)&gt; |
| [parallelStream](index.md#-1592339412%2FFunctions%2F971615585) | [jvm]<br>open fun [parallelStream](index.md#-1592339412%2FFunctions%2F971615585)(): [Stream](https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html)&lt;[Advancement](../-advancement/index.md)&gt; |
| [remove](index.md#-602643696%2FFunctions%2F971615585) | [jvm]<br>open override fun [remove](index.md#-602643696%2FFunctions%2F971615585)(element: [Advancement](../-advancement/index.md)): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [removeAll](index.md#2042030003%2FFunctions%2F971615585) | [jvm]<br>open override fun [removeAll](index.md#2042030003%2FFunctions%2F971615585)(elements: [Collection](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html)&lt;[Advancement](../-advancement/index.md)&gt;): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [removeAt](index.md#-2012790965%2FFunctions%2F971615585) | [jvm]<br>open override fun [removeAt](index.md#-2012790965%2FFunctions%2F971615585)(p0: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [Advancement](../-advancement/index.md) |
| [removeIf](index.md#-1124324048%2FFunctions%2F971615585) | [jvm]<br>open override fun [removeIf](index.md#-1124324048%2FFunctions%2F971615585)(p0: [Predicate](https://docs.oracle.com/javase/8/docs/api/java/util/function/Predicate.html)&lt;in [Advancement](../-advancement/index.md)&gt;): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [removeRange](index.md#-1133643294%2FFunctions%2F971615585) | [jvm]<br>open override fun [removeRange](index.md#-1133643294%2FFunctions%2F971615585)(p0: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), p1: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) |
| [replaceAll](index.md#-381593432%2FFunctions%2F971615585) | [jvm]<br>open override fun [replaceAll](index.md#-381593432%2FFunctions%2F971615585)(p0: [UnaryOperator](https://docs.oracle.com/javase/8/docs/api/java/util/function/UnaryOperator.html)&lt;[Advancement](../-advancement/index.md)&gt;) |
| [retainAll](index.md#1404952466%2FFunctions%2F971615585) | [jvm]<br>open override fun [retainAll](index.md#1404952466%2FFunctions%2F971615585)(elements: [Collection](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html)&lt;[Advancement](../-advancement/index.md)&gt;): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [set](index.md#1693010813%2FFunctions%2F971615585) | [jvm]<br>open operator override fun [set](index.md#1693010813%2FFunctions%2F971615585)(index: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), element: [Advancement](../-advancement/index.md)): [Advancement](../-advancement/index.md) |
| [sort](index.md#1419576798%2FFunctions%2F971615585) | [jvm]<br>open override fun [sort](index.md#1419576798%2FFunctions%2F971615585)(p0: [Comparator](https://docs.oracle.com/javase/8/docs/api/java/util/Comparator.html)&lt;in [Advancement](../-advancement/index.md)&gt;) |
| [spliterator](index.md#1642634169%2FFunctions%2F971615585) | [jvm]<br>open override fun [spliterator](index.md#1642634169%2FFunctions%2F971615585)(): [Spliterator](https://docs.oracle.com/javase/8/docs/api/java/util/Spliterator.html)&lt;[Advancement](../-advancement/index.md)&gt; |
| [stream](index.md#135225651%2FFunctions%2F971615585) | [jvm]<br>open fun [stream](index.md#135225651%2FFunctions%2F971615585)(): [Stream](https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html)&lt;[Advancement](../-advancement/index.md)&gt; |
| [subList](index.md#-1861460857%2FFunctions%2F971615585) | [jvm]<br>open override fun [subList](index.md#-1861460857%2FFunctions%2F971615585)(fromIndex: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), toIndex: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [MutableList](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-list/index.html)&lt;[Advancement](../-advancement/index.md)&gt; |
| [toArray](index.md#776741336%2FFunctions%2F971615585) | [jvm]<br>open override fun [toArray](index.md#776741336%2FFunctions%2F971615585)(): [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)&lt;[Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)&gt;<br>open override fun &lt;[T](index.md#-268358819%2FFunctions%2F971615585) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)&gt; [toArray](index.md#-268358819%2FFunctions%2F971615585)(p0: [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)&lt;[T](index.md#-268358819%2FFunctions%2F971615585)&gt;): [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)&lt;[T](index.md#-268358819%2FFunctions%2F971615585)&gt; |
| [toString](index.md#-42557405%2FFunctions%2F971615585) | [jvm]<br>open override fun [toString](index.md#-42557405%2FFunctions%2F971615585)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [traverseDependancies](traverse-dependancies.md) | [jvm]<br>fun [traverseDependancies](traverse-dependancies.md)(a: [Advancement](../-advancement/index.md), parent: [Advancement](../-advancement/index.md)? = null, f: ([Advancement](../-advancement/index.md)?, [Advancement](../-advancement/index.md)) -&gt; [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html))<br>Traverses all dependancies of [a](traverse-dependancies.md), applying [f](traverse-dependancies.md) to all advancements including [a](traverse-dependancies.md) itself. |
| [trimToSize](index.md#130278918%2FFunctions%2F971615585) | [jvm]<br>open fun [trimToSize](index.md#130278918%2FFunctions%2F971615585)() |

## Properties

| Name | Summary |
|---|---|
| [elementData](index.md#-354673104%2FProperties%2F971615585) | [jvm]<br>val [elementData](index.md#-354673104%2FProperties%2F971615585): [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)&lt;[Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)&gt; |
| [modCount](index.md#-207506750%2FProperties%2F971615585) | [jvm]<br>val [modCount](index.md#-207506750%2FProperties%2F971615585): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [size](index.md#1363994755%2FProperties%2F971615585) | [jvm]<br>open override val [size](index.md#1363994755%2FProperties%2F971615585): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
