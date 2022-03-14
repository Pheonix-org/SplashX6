//[core](../../../index.md)/[com.shinkson47.SplashX6.utility](../index.md)/[Utility](index.md)/[tryOrNull](try-or-null.md)

# tryOrNull

[jvm]\
inline fun &lt;[T](try-or-null.md)&gt; [tryOrNull](try-or-null.md)(f: () -&gt; [T](try-or-null.md)): [T](try-or-null.md)?

When wrapped around a function which throws an [Exception](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html) of any kind, a crash is prevented and return value is null.

Use carefully as this ignores any and all exceptions and can lead to error cascading.

#### Return

## Parameters

jvm

| | |
|---|---|
| T | T The expected type of the output from the given function. |
| f | F The function to execute. |
