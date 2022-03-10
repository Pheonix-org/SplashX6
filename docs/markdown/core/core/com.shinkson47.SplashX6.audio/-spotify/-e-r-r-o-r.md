//[core](../../../index.md)/[com.shinkson47.SplashX6.audio](../index.md)/[Spotify](index.md)/[ERROR](-e-r-r-o-r.md)

# ERROR

[jvm]\
var [ERROR](-e-r-r-o-r.md): [Exception](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html)? = null

# If any request encountered an issue, it'll be stored here until the next request is made.

Any exception thrown whilst executeing a request will stored here.

The lifetime of this error is until the execution next request, which will either replace with a new error, or clear it to null if it encountered no error.

Poll this exception to determine cause of request failure.
