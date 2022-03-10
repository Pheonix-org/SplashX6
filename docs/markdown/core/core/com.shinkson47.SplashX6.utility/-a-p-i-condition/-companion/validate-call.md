//[core](../../../../index.md)/[com.shinkson47.SplashX6.utility](../../index.md)/[APICondition](../index.md)/[Companion](index.md)/[validateCall](validate-call.md)

# validateCall

[jvm]\

@[JvmStatic](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-static/index.html)

fun [validateCall](validate-call.md)(requiredState: [Predicate](https://docs.oracle.com/javase/8/docs/api/java/util/function/Predicate.html)&lt;[Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?&gt;, onIllegalState: [Runnable](https://docs.oracle.com/javase/8/docs/api/java/lang/Runnable.html))

# Validates that an API call is being made in a supported state.

Whilst attempting to add minimal overhead to every call.

Supply a [requiredState](validate-call.md), and an action to perform [onIllegalState](validate-call.md)
