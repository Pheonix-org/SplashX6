//[core](../../../index.md)/[com.shinkson47.SplashX6.utility](../index.md)/[Utility](index.md)/[MapToGDXArray](-map-to-g-d-x-array.md)

# MapToGDXArray

[jvm]\
open fun &lt;[T](-map-to-g-d-x-array.md), [X](-map-to-g-d-x-array.md)&gt; [MapToGDXArray](-map-to-g-d-x-array.md)(items: [Iterable](https://docs.oracle.com/javase/8/docs/api/java/lang/Iterable.html)&lt;[T](../-debug/-debug-window/index.md#1685238889%2FFunctions%2F971615585)&gt;, map: ([T](../-debug/-debug-window/index.md#1685238889%2FFunctions%2F971615585)) -&gt; [X](-map-to-g-d-x-array.md)): Array&lt;[X](-map-to-g-d-x-array.md)&gt;

Converts a collection of items into a GDX compatable Array, and applies a map to the items as it does so.

#### Return

A GDX Array containing a map of items

## Parameters

jvm

| | |
|---|---|
| items | [Iterable](https://docs.oracle.com/javase/8/docs/api/java/lang/Iterable.html) collection of items. |
| map | The function defining the value taken from each item to be stored in the result. |
| &lt;T&gt; | The type of the items being supplied |
| &lt;X&gt; | The type of the items being returned |
