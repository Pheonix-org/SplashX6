//[core](../../../index.md)/[com.shinkson47.SplashX6.utility](../index.md)/[SerializablePredicate](index.md)

# SerializablePredicate

[jvm]\
class [SerializablePredicate](index.md)&lt;[T](index.md)&gt;(z: ([T](index.md)) -&gt; [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)) : [Predicate](https://docs.oracle.com/javase/8/docs/api/java/util/function/Predicate.html)&lt;[T](index.md)&gt; , [Serializable](https://docs.oracle.com/javase/8/docs/api/java/io/Serializable.html)

# A predicate which can be serialized.

## Parameters

jvm

| | |
|---|---|
| T |  |

## Constructors

| | |
|---|---|
| [SerializablePredicate](-serializable-predicate.md) | [jvm]<br>fun &lt;[T](index.md)&gt; [SerializablePredicate](-serializable-predicate.md)(z: ([T](index.md)) -&gt; [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html))<br>Create [SerializablePredicate](index.md) |

## Functions

| Name | Summary |
|---|---|
| [and](index.md#174354586%2FFunctions%2F971615585) | [jvm]<br>open fun [and](index.md#174354586%2FFunctions%2F971615585)(p0: [Predicate](https://docs.oracle.com/javase/8/docs/api/java/util/function/Predicate.html)&lt;in [T](index.md)&gt;): [Predicate](https://docs.oracle.com/javase/8/docs/api/java/util/function/Predicate.html)&lt;[T](index.md)&gt; |
| [negate](index.md#600125100%2FFunctions%2F971615585) | [jvm]<br>open fun [negate](index.md#600125100%2FFunctions%2F971615585)(): [Predicate](https://docs.oracle.com/javase/8/docs/api/java/util/function/Predicate.html)&lt;[T](index.md)&gt; |
| [or](index.md#-351401820%2FFunctions%2F971615585) | [jvm]<br>open fun [or](index.md#-351401820%2FFunctions%2F971615585)(p0: [Predicate](https://docs.oracle.com/javase/8/docs/api/java/util/function/Predicate.html)&lt;in [T](index.md)&gt;): [Predicate](https://docs.oracle.com/javase/8/docs/api/java/util/function/Predicate.html)&lt;[T](index.md)&gt; |
| [test](test.md) | [jvm]<br>open override fun [test](test.md)(t: [T](index.md)): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |

## Properties

| Name | Summary |
|---|---|
| [z](z.md) | [jvm]<br>val [z](z.md): ([T](index.md)) -&gt; [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
