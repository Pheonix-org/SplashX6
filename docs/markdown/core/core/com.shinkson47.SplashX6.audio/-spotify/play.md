//[core](../../../index.md)/[com.shinkson47.SplashX6.audio](../index.md)/[Spotify](index.md)/[play](play.md)

# play

[jvm]\
fun [play](play.md)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?

# Requests spotify to start or resume playback.

If [create](create.md) was not called, or it failed to configure [spotifyApi](spotify-api.md), has no effect.

[jvm]\
fun [play](play.md)(uri: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?

# Begins playing from given context.

[uri](play.md) - indicator for a spotify context to play, i.e a playlist or album.
