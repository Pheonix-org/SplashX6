//[core](../../../index.md)/[com.shinkson47.SplashX6.audio](../index.md)/[AudioController](index.md)

# AudioController

[jvm]\
object [AudioController](index.md)

# Controller for in-built audio and music.

Note that this does not handle [Spotify](../-spotify/index.md).

#### Author

Jordan Gray

#### Since

PRE-ALPHA 0.0.1

## Functions

| Name | Summary |
|---|---|
| [nextSong](next-song.md) | [jvm]<br>@[JvmStatic](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-static/index.html)<br>fun [nextSong](next-song.md)(): Music<br>Skips the currently playing song in this application, playing the next song in the playlist. |
| [pauseMusic](pause-music.md) | [jvm]<br>fun [pauseMusic](pause-music.md)()<br>Performs {@link Music#pause()} ()} on now playing |
| [play](play.md) | [jvm]<br>fun [play](play.md)(music: Music?): Music<br><h2>Actually plays some music.</h2> Stops nowPlaying, plays m at current volume, and sets nowPlaying to m |
| [playButtonSound](play-button-sound.md) | [jvm]<br>fun [playButtonSound](play-button-sound.md)(): [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)<br>Plays a new instance of {@link com.shinkson47.SplashX6.utility.Assets#SFX_BUTTON} at {@link AudioController#buttonVolume} |
| [playMainMenu](play-main-menu.md) | [jvm]<br>@[JvmStatic](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-static/index.html)<br>fun [playMainMenu](play-main-menu.md)()<br>Audible sound (music) for the this application's main menu. |
| [playOnLoop](play-on-loop.md) | [jvm]<br>fun [playOnLoop](play-on-loop.md)(music: Music): Music<br><h2> Plays the provided music on repeat.</h2> If muted, has no effect. |
| [playPlaylist](play-playlist.md) | [jvm]<br>@[JvmStatic](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-static/index.html)<br>fun [playPlaylist](play-playlist.md)(playlist: [Playlist](../-playlist/index.md)): Music<br>Accepts a GamePlaylist object to be instantiated and played throughout the game. |
| [previousSong](previous-song.md) | [jvm]<br>fun [previousSong](previous-song.md)()<br>Plays the previous song in the playlist. |
| [resetPlaylist](reset-playlist.md) | [jvm]<br>fun [resetPlaylist](reset-playlist.md)()<br>Resets the playlists index to 0. |
| [resumeMusic](resume-music.md) | [jvm]<br>fun [resumeMusic](resume-music.md)()<br>Performs {@link Music#play()} ()} on now playing |
| [stopMusic](stop-music.md) | [jvm]<br>fun [stopMusic](stop-music.md)()<br>Performs Music.stop on [nowPlaying](now-playing.md) |

## Properties

| Name | Summary |
|---|---|
| [GUI_SOUND](-g-u-i_-s-o-u-n-d.md) | [jvm]<br>@[JvmField](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-field/index.html)<br>val [GUI_SOUND](-g-u-i_-s-o-u-n-d.md): ClickListener<br><h2>Listener placed on GUI elements to play a sound when interacted with.</h2> |
| [isMuted](is-muted.md) | [jvm]<br>var [isMuted](is-muted.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = false<br>Determines globally if audio should be played, or not. |
| [musicVolume](music-volume.md) | [jvm]<br>var [musicVolume](music-volume.md): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) |
| [nowPlaying](now-playing.md) | [jvm]<br>var [nowPlaying](now-playing.md): Music<br><h2>Pointer to the music resource that we are currently playing.</h2> Should never be null. |
| [SFXVolume](-s-f-x-volume.md) | [jvm]<br>var [SFXVolume](-s-f-x-volume.md): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)<br>Volume for SFX. |
| [SONGS](-s-o-n-g-s.md) | [jvm]<br>var [SONGS](-s-o-n-g-s.md): [ArrayList](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-array-list/index.html)&lt;Music&gt; |
