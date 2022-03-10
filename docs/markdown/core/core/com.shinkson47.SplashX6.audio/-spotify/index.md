//[core](../../../index.md)/[com.shinkson47.SplashX6.audio](../index.md)/[Spotify](index.md)

# Spotify

[jvm]\
object [Spotify](index.md)

# Spotify integration for Splash X6.

This object handles authentication of this client with the Spotify API.

Once authenticated, handles the compilation & execution of requests between this application and the spotify API.

TODO use refresh token. User has to reconnect every access token expires.

#### Since

PRE-ALPHA 0.0.2

#### Author

[Jordan T Gray](https://shinkson47.in)

## Types

| Name | Summary |
|---|---|
| [RepeatMode](-repeat-mode/index.md) | [jvm]<br>enum [RepeatMode](-repeat-mode/index.md) : [Enum](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-enum/index.html)&lt;[Spotify.RepeatMode](-repeat-mode/index.md)&gt; <br>enum value names match strings which spotify api expects, so you can use |
| [SpotifySourceType](-spotify-source-type/index.md) | [jvm]<br>enum [SpotifySourceType](-spotify-source-type/index.md) : [Enum](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-enum/index.html)&lt;[Spotify.SpotifySourceType](-spotify-source-type/index.md)&gt; |

## Functions

| Name | Summary |
|---|---|
| [create](create.md) | [jvm]<br>fun [create](create.md)(autoOnly: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = false): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>This gives us our cachedOTP which authorises this application to perform actions on the user's account We only need to do this once, after we can store it.<br>[jvm]<br>fun [create](create.md)(AuthenticationCode: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>The api token is sent along with every request to authenticate it. This token is temporary, and will expire. We can refresh using the refresh token and the same auth code for as long as the user allows the auth code to remain active. |
| [createFromExisting](create-from-existing.md) | [jvm]<br>fun [createFromExisting](create-from-existing.md)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>If a authentication data is stored, it's loaded. If it's valid, requests are built and returns true. |
| [disable](disable.md) | [jvm]<br>fun [disable](disable.md)() |
| [enable](enable.md) | [jvm]<br>fun [enable](enable.md)() |
| [info](info.md) | [jvm]<br>fun [info](info.md)(): CurrentlyPlayingContext? |
| [next](next.md) | [jvm]<br>fun [next](next.md)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?<br>If [create](create.md) was not called, or it failed to configure [spotifyApi](spotify-api.md), has no effect. |
| [nowPlaying](now-playing.md) | [jvm]<br>fun [nowPlaying](now-playing.md)(): CurrentlyPlaying? |
| [pause](pause.md) | [jvm]<br>fun [pause](pause.md)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?<br>If [create](create.md) was not called, or it failed to configure [spotifyApi](spotify-api.md), has no effect. |
| [play](play.md) | [jvm]<br>fun [play](play.md)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?<br>If [create](create.md) was not called, or it failed to configure [spotifyApi](spotify-api.md), has no effect.<br>[jvm]<br>fun [play](play.md)(uri: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?<br>[uri](play.md) - indicator for a spotify context to play, i.e a playlist or album. |
| [previous](previous.md) | [jvm]<br>fun [previous](previous.md)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?<br>If [create](create.md) was not called, or it failed to configure [spotifyApi](spotify-api.md), has no effect. |
| [repeatMode](repeat-mode.md) | [jvm]<br>fun [repeatMode](repeat-mode.md)(mode: [Spotify.RepeatMode](-repeat-mode/index.md)): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?<br>Either repeat a single track, the context (playlist, album, artist, etc) or no repeat. |
| [savedAlbums](saved-albums.md) | [jvm]<br>fun [savedAlbums](saved-albums.md)(): Paging&lt;SavedAlbum&gt;? |
| [savedArtists](saved-artists.md) | [jvm]<br>fun [savedArtists](saved-artists.md)(): PagingCursorbased&lt;Artist&gt;? |
| [savedPlaylists](saved-playlists.md) | [jvm]<br>fun [savedPlaylists](saved-playlists.md)(): Paging&lt;PlaylistSimplified&gt; |
| [savedSongs](saved-songs.md) | [jvm]<br>fun [savedSongs](saved-songs.md)(): Paging&lt;SavedTrack&gt;? |
| [seek](seek.md) | [jvm]<br>fun [seek](seek.md)(ms: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? |
| [setShuffle](set-shuffle.md) | [jvm]<br>fun [setShuffle](set-shuffle.md)(shuffle: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?<br>Either true or false. |
| [setVolume](set-volume.md) | [jvm]<br>fun [setVolume](set-volume.md)(percent: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? |
| [testConnection](test-connection.md) | [jvm]<br>fun [testConnection](test-connection.md)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>By performing an [REQUEST_CATAGORIES](-r-e-q-u-e-s-t_-c-a-t-a-g-o-r-i-e-s.md) to test access to user's account via the API. |

## Properties

| Name | Summary |
|---|---|
| [cache_Albums](cache_-albums.md) | [jvm]<br>var [cache_Albums](cache_-albums.md): Paging&lt;SavedAlbum&gt;? = null |
| [cache_Artists](cache_-artists.md) | [jvm]<br>var [cache_Artists](cache_-artists.md): PagingCursorbased&lt;Artist&gt;? = null |
| [cache_GdxAlbums](cache_-gdx-albums.md) | [jvm]<br>var [cache_GdxAlbums](cache_-gdx-albums.md): Array&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;? = null |
| [cache_GdxArtists](cache_-gdx-artists.md) | [jvm]<br>var [cache_GdxArtists](cache_-gdx-artists.md): Array&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;? = null |
| [cache_GdxPlaylists](cache_-gdx-playlists.md) | [jvm]<br>var [cache_GdxPlaylists](cache_-gdx-playlists.md): Array&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;? = null |
| [cache_Playlists](cache_-playlists.md) | [jvm]<br>var [cache_Playlists](cache_-playlists.md): Paging&lt;PlaylistSimplified&gt;? = null |
| [DISABLE](-d-i-s-a-b-l-e.md) | [jvm]<br>var [DISABLE](-d-i-s-a-b-l-e.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = false |
| [ERROR](-e-r-r-o-r.md) | [jvm]<br>var [ERROR](-e-r-r-o-r.md): [Exception](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html)? = null<br>Any exception thrown whilst executeing a request will stored here. |
| [REQUEST_CATAGORIES](-r-e-q-u-e-s-t_-c-a-t-a-g-o-r-i-e-s.md) | [jvm]<br>var [REQUEST_CATAGORIES](-r-e-q-u-e-s-t_-c-a-t-a-g-o-r-i-e-s.md): GetListOfCategoriesRequest? = null |
| [REQUEST_NEXT](-r-e-q-u-e-s-t_-n-e-x-t.md) | [jvm]<br>var [REQUEST_NEXT](-r-e-q-u-e-s-t_-n-e-x-t.md): SkipUsersPlaybackToNextTrackRequest? = null |
| [REQUEST_NOW_PLAYING](-r-e-q-u-e-s-t_-n-o-w_-p-l-a-y-i-n-g.md) | [jvm]<br>var [REQUEST_NOW_PLAYING](-r-e-q-u-e-s-t_-n-o-w_-p-l-a-y-i-n-g.md): GetUsersCurrentlyPlayingTrackRequest? = null |
| [REQUEST_PAUSE](-r-e-q-u-e-s-t_-p-a-u-s-e.md) | [jvm]<br>var [REQUEST_PAUSE](-r-e-q-u-e-s-t_-p-a-u-s-e.md): PauseUsersPlaybackRequest? = null |
| [REQUEST_PLAY](-r-e-q-u-e-s-t_-p-l-a-y.md) | [jvm]<br>var [REQUEST_PLAY](-r-e-q-u-e-s-t_-p-l-a-y.md): StartResumeUsersPlaybackRequest? = null |
| [REQUEST_PLAYBACK_INFO](-r-e-q-u-e-s-t_-p-l-a-y-b-a-c-k_-i-n-f-o.md) | [jvm]<br>var [REQUEST_PLAYBACK_INFO](-r-e-q-u-e-s-t_-p-l-a-y-b-a-c-k_-i-n-f-o.md): GetInformationAboutUsersCurrentPlaybackRequest? = null |
| [REQUEST_PREVIOUS](-r-e-q-u-e-s-t_-p-r-e-v-i-o-u-s.md) | [jvm]<br>var [REQUEST_PREVIOUS](-r-e-q-u-e-s-t_-p-r-e-v-i-o-u-s.md): SkipUsersPlaybackToPreviousTrackRequest? = null |
| [REQUEST_QUEUE](-r-e-q-u-e-s-t_-q-u-e-u-e.md) | [jvm]<br>var [REQUEST_QUEUE](-r-e-q-u-e-s-t_-q-u-e-u-e.md): AddItemToUsersPlaybackQueueRequest? = null |
| [REQUEST_REPEAT_MODE](-r-e-q-u-e-s-t_-r-e-p-e-a-t_-m-o-d-e.md) | [jvm]<br>var [REQUEST_REPEAT_MODE](-r-e-q-u-e-s-t_-r-e-p-e-a-t_-m-o-d-e.md): SetRepeatModeOnUsersPlaybackRequest.Builder? = null |
| [REQUEST_SAVED_ALBUMS](-r-e-q-u-e-s-t_-s-a-v-e-d_-a-l-b-u-m-s.md) | [jvm]<br>var [REQUEST_SAVED_ALBUMS](-r-e-q-u-e-s-t_-s-a-v-e-d_-a-l-b-u-m-s.md): GetCurrentUsersSavedAlbumsRequest? = null |
| [REQUEST_SAVED_ARTISTS](-r-e-q-u-e-s-t_-s-a-v-e-d_-a-r-t-i-s-t-s.md) | [jvm]<br>var [REQUEST_SAVED_ARTISTS](-r-e-q-u-e-s-t_-s-a-v-e-d_-a-r-t-i-s-t-s.md): GetUsersFollowedArtistsRequest? = null |
| [REQUEST_SAVED_PLAYLISTS](-r-e-q-u-e-s-t_-s-a-v-e-d_-p-l-a-y-l-i-s-t-s.md) | [jvm]<br>var [REQUEST_SAVED_PLAYLISTS](-r-e-q-u-e-s-t_-s-a-v-e-d_-p-l-a-y-l-i-s-t-s.md): GetListOfCurrentUsersPlaylistsRequest? = null |
| [REQUEST_SAVED_SONGS](-r-e-q-u-e-s-t_-s-a-v-e-d_-s-o-n-g-s.md) | [jvm]<br>var [REQUEST_SAVED_SONGS](-r-e-q-u-e-s-t_-s-a-v-e-d_-s-o-n-g-s.md): GetUsersSavedTracksRequest? = null |
| [REQUEST_SAVED_TRACKS](-r-e-q-u-e-s-t_-s-a-v-e-d_-t-r-a-c-k-s.md) | [jvm]<br>var [REQUEST_SAVED_TRACKS](-r-e-q-u-e-s-t_-s-a-v-e-d_-t-r-a-c-k-s.md): GetUsersSavedTracksRequest? = null |
| [REQUEST_SEEK](-r-e-q-u-e-s-t_-s-e-e-k.md) | [jvm]<br>var [REQUEST_SEEK](-r-e-q-u-e-s-t_-s-e-e-k.md): SeekToPositionInCurrentlyPlayingTrackRequest.Builder? = null |
| [REQUEST_SHUFFLE](-r-e-q-u-e-s-t_-s-h-u-f-f-l-e.md) | [jvm]<br>var [REQUEST_SHUFFLE](-r-e-q-u-e-s-t_-s-h-u-f-f-l-e.md): ToggleShuffleForUsersPlaybackRequest.Builder? = null |
| [REQUEST_VOLUME](-r-e-q-u-e-s-t_-v-o-l-u-m-e.md) | [jvm]<br>var [REQUEST_VOLUME](-r-e-q-u-e-s-t_-v-o-l-u-m-e.md): SetVolumeForUsersPlaybackRequest.Builder? = null |
| [spotifyApi](spotify-api.md) | [jvm]<br>val [spotifyApi](spotify-api.md): SpotifyApi<br>Is the intermediary between this application and the spotify api. |
