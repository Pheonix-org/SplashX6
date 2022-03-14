//[core](../../../index.md)/[com.shinkson47.SplashX6.utility](../index.md)/[Utility](index.md)/[MapToGDXArray](-map-to-g-d-x-array.md)

# MapToGDXArray

[jvm]\
fun &lt;[T](-map-to-g-d-x-array.md), [X](-map-to-g-d-x-array.md)&gt; [MapToGDXArray](-map-to-g-d-x-array.md)(items: [Iterable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)&lt;[T](-map-to-g-d-x-array.md)&gt;, map: [Function](https://docs.oracle.com/javase/8/docs/api/java/util/function/Function.html)&lt;[T](-map-to-g-d-x-array.md), [X](-map-to-g-d-x-array.md)&gt;): Array&lt;[X](-map-to-g-d-x-array.md)&gt;

Converts a collection of items into a GDX compatible com.badlogic.gdx.utils.Array

#### Return

A new GDX [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html) containing objects from items</X></T>

## Parameters

jvm

| | |
|---|---|
| items | [Iterable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html) Collection of items. |
| map | The function defining the value taken from each item to be stored in the result. |
|  | <X> The type of the items being returned |
