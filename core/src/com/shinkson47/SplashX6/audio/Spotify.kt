package com.shinkson47.SplashX6.audio

import com.badlogic.gdx.utils.Array
import com.shinkson47.SplashX6.utility.Assets
import com.shinkson47.SplashX6.utility.Utility
import com.wrapper.spotify.SpotifyApi
import com.wrapper.spotify.SpotifyHttpManager
import com.wrapper.spotify.enums.ModelObjectType
import com.wrapper.spotify.exceptions.detailed.BadRequestException
import com.wrapper.spotify.model_objects.specification.*
import com.wrapper.spotify.requests.AbstractRequest
import com.wrapper.spotify.requests.authorization.authorization_code.AuthorizationCodeRequest
import com.wrapper.spotify.requests.data.browse.GetListOfCategoriesRequest
import com.wrapper.spotify.requests.data.follow.GetUsersFollowedArtistsRequest
import com.wrapper.spotify.requests.data.library.GetCurrentUsersSavedAlbumsRequest
import com.wrapper.spotify.requests.data.library.GetUsersSavedTracksRequest
import com.wrapper.spotify.requests.data.player.*
import com.wrapper.spotify.requests.data.playlists.GetListOfCurrentUsersPlaylistsRequest
import java.awt.Desktop
import java.time.LocalDateTime
import java.time.ZoneOffset

/**
 * # Spotify intergration for Splash X6.
 *
 * This object handles authentication, and the compilation & execution of requests
 * between this application and the spotify API.
 *
 * TODO use refresh token. User has to reconnect every access token expires.
 *
 * @since PRE-ALPHA 0.0.2
 * @author [Jordan T Gray](https://shinkson47.in)
 * @version 1.1
 */
object Spotify {

    /**
     *  # If true, disables ability to perform any API request.
     */
    var DISABLE : Boolean = false
        private set
        fun enable () { DISABLE = false }
        fun disable() { DISABLE = true }

    /**
     * # If any request encountered an issue, it'll be stored here until the next request.
     * Will automatically be set to null if another request is successful, or replaced by it's exception.
     *
     * Poll to determine cause of request failure.
     */
    var ERROR : Exception? = null
        private set

    /**
     * # Spotify supported playback repeat modes
     *
     * enum value names match strings which spotify api expects, so you can use
     *
     * > `RepeatMode.track.toString()`
     */
    enum class RepeatMode { track, context, off }

    /**
     * # Types of sources from spotify that Splash can search for in the user's library.
     */
    enum class SpotifySourceType { playlist, artist, album }




    /**
     * # Initalises connection from stored data.
     *
     * If a authentication data is stored, it's loaded. If it's valid, requests are built
     * and returns true.
     *
     * If no credentials are saved, or they are not / no longer valid then returns false.
     */
    fun createFromExisting() : Boolean {
        (Assets.preferences.getString("SPOTIFY_AUTH_CODE") != "" && loadToken())
            .let {
                if (it) build()
                return it
            }
    }


    /**
     * # 1 of 2 - Builds API connection.
     * - Authorizes this application via a web re-direct.
     *
     * This gives us our [cachedAuthCode] which authorises this application to perform actions on the user's account
     * We only need to do this once, after we can store it.
     *
     * ## IMPORTANT API NOTE
     * This call is not enough. It's 1 of 2.
     *
     * Once user has authenticated, the authentication code must be provided for the final stage of
     * set-up to be complete.
     *
     * Call [create] again with the authentication code as an argument.
     *
     * Returns true if and only if access data could be loaded from
     * preferences, and was positively tested to be working.
     **/
    fun create(autoOnly: Boolean = false) : Boolean {
        //  If data is stored, try and load it. If we can connect, treat connection as complete.
        if (createFromExisting())
            return true

        if (autoOnly) return false
        // Otherwise initiate two part auth.
        authoriseClient()
        return false
    }

    /**
     * # 2 of 2 - Builds API connection.
     * - Gets an api token and refresh token
     *
     * The api token is sent along with every request to authenticate it. This token is temporary, and will expire.
     * We can refresh using the refresh token and the same auth code for as long as the user allows the auth code
     * to remain active.
     *
     * - Compiles all requests
     *
     * Now that we have an access token, we can build and store requests ready to [execute] them.
     *
     * ## IMPORTANT API NOTE
     * This call must be second. Call [create] with no arguments first to authenticate and
     * recieve an authentication code. THEN call this method with said auth code.
     */
    fun create(AuthenticationCode : String) : Boolean {
        cachedAuthCode = AuthenticationCode

        buildTokenRequest() // Now that we have an authentication code, we can create a request for a token.
        getToken()

        build()
        return testConnection()
    }

    /**
     * # Once connected, builds API requests and caches data.
     */
    private fun build() { buildRequests(); buildCache() }

    /**
     * # Tests ability to perform an API request
     * By performing an [REQUEST_PROFILE] to test access to user's account via the API.
     *
     * returns true if access was successful.
     */
    fun testConnection() : Boolean {
        refreshToken()
        return ERROR == null && implTestConnection()
    }

    private fun implTestConnection() = execute(REQUEST_CATAGORIES) != null;


    //=====================================================================
    //#region Fields
    //=====================================================================

    /**
     * # Permissions that this application is authenticated to use
     * when performing [REQUEST_AUTHORIZATION].
     *
     * Determines what requests we may and may not make.
     *
     * See [Spotify's scope docs.](https://developer.spotify.com/documentation/general/guides/scopes/)
     */
    const val SCOPE = "user-modify-playback-state, user-read-playback-state, user-read-currently-playing, user-library-read, playlist-read-private, playlist-read-collaborative, user-follow-read"

    /**
     * # General connection to the spotify api.
     *
     * Is the intermediary between this application and the spotify api.
     *
     * Performs requests, stores access credentials, compiles results. Does all the complex stuff
     * so we don't have to.
     */
    val spotifyApi: SpotifyApi = SpotifyApi.Builder()
        .setClientId("72cabe08e89f49808ac14523a2f809ae")
        .setClientSecret("9736d5764f1b4c4ab82547b9d34edd91")
            // TODO this is super bad but idk how to get around it. Should not keep secret in public source.
            //  Perhaps we could use github secret's storage?
        .setRedirectUri(SpotifyHttpManager.makeUri("https://www.shinkson47.in/SplashX6/spotify-callback"))
        .build()

    /**
     * Cached OTP which authorizes this application to operate on the users account.
     *
     * Obtained when the user gives access via web portal. Only valid then, only useable once.
     *
     * > Note that this is not the token which allows us to make api requests. Just to configure the connection.
     */
    private var cachedAuthCode = ""

    //=====================================================================
    //#endregion Fields
    //#region Pre authentication requests
    //=====================================================================

    /**
     * # Requests spotify to make an authentication for this app to access spotify.
     *
     * Request returns a URI which is opened in a browser. User signs in and gives access via this link.
     *
     * This request configures the callback, which is just to a page which shows the authentication code to the user.
     *
     * User copys this code, pastes it into the application, and it's used to call stage two of [create].
     *
     * Access code is stored in [cachedAuthCode].
     */
    private val PREAUTH_REQUEST_AUTHORIZATION = spotifyApi.authorizationCodeUri()
        .scope(SCOPE)
        .build()

    /**
     * # Requests spotify for an access token to use with api requests.
     *
     * Once we're authenticated, we may obtain a token to authenticate api requests. This requests does this.
     *
     * Once we've obtained this token, we may [build] our requests.
     */
    private var PREAUTH_REQUEST_TOKEN : AuthorizationCodeRequest? = null

    /**
     * # Populates [PREAUTH_REQUEST_TOKEN] with a API request for a new token.
     *
     * This exsists purely because this request must be built after we have an auth code.
     */
    private fun buildTokenRequest() { PREAUTH_REQUEST_TOKEN = spotifyApi.authorizationCode(cachedAuthCode).build() }


    //=====================================================================
    //#endregion Pre authentication requests
    //#region API Requests
    //=====================================================================

    /**
     * # Builds all requests we can perform.
     *
     * Can only be performed after we have obtained an api token.
     *
     * NOTE : Some requests require arguments that can only be provided prior to building the request.
     * In these cases, the builder is stored instead, and the request is built when the request is made.
     */
    private fun buildRequests() {
        with (spotifyApi) {
            REQUEST_PAUSE               = pauseUsersPlayback()                              .build()
            REQUEST_PLAY                = startResumeUsersPlayback()                        .build()
            REQUEST_NEXT                = skipUsersPlaybackToNextTrack()                    .build()
            REQUEST_PREVIOUS            = skipUsersPlaybackToPreviousTrack()                .build()
            REQUEST_NOW_PLAYING         = getUsersCurrentlyPlayingTrack()                   .build()
            REQUEST_SAVED_PLAYLISTS     = getListOfCurrentUsersPlaylists().limit(50)  .build()
            REQUEST_SAVED_ARTISTS       = getUsersFollowedArtists(ModelObjectType.ARTIST)   .build()
            REQUEST_CATAGORIES          = listOfCategories                                  .build()
            REQUEST_SAVED_ALBUMS        = currentUsersSavedAlbums.limit(50)           .build()
            REQUEST_SAVED_SONGS         = usersSavedTracks                                  .build()
            REQUEST_PLAYBACK_INFO       = informationAboutUsersCurrentPlayback              .build()

            // REQUESTS THAT REQUIRE ARGUMENTS. STORE THE BUILDER, NOT THE COMPLETE REQUEST.

            REQUEST_SEEK                = seekToPositionInCurrentlyPlayingTrack(0)
            REQUEST_REPEAT_MODE         = setRepeatModeOnUsersPlayback(RepeatMode.off.toString())
            REQUEST_VOLUME              = setVolumeForUsersPlayback(0)
            REQUEST_SHUFFLE             = toggleShuffleForUsersPlayback(false)

        }
    }


    //#region requests
    var REQUEST_PAUSE: PauseUsersPlaybackRequest? = null
        private set

    var REQUEST_PLAY: StartResumeUsersPlaybackRequest? = null
        private set

    var REQUEST_NEXT: SkipUsersPlaybackToNextTrackRequest? = null
        private set

    var REQUEST_PREVIOUS: SkipUsersPlaybackToPreviousTrackRequest? = null
        private set

    var REQUEST_SEEK: SeekToPositionInCurrentlyPlayingTrackRequest.Builder? = null
        private set

    var REQUEST_REPEAT_MODE: SetRepeatModeOnUsersPlaybackRequest.Builder? = null
        private set

    var REQUEST_VOLUME: SetVolumeForUsersPlaybackRequest.Builder? = null
        private set

    var REQUEST_SHUFFLE: ToggleShuffleForUsersPlaybackRequest.Builder? = null
        private set

    var REQUEST_QUEUE: AddItemToUsersPlaybackQueueRequest? = null
        private set

    var REQUEST_PLAYBACK_INFO: GetInformationAboutUsersCurrentPlaybackRequest? = null
        private set

    var REQUEST_NOW_PLAYING: GetUsersCurrentlyPlayingTrackRequest? = null
        private set

    var REQUEST_CATAGORIES: GetListOfCategoriesRequest? = null
        private set

    var REQUEST_SAVED_TRACKS: GetUsersSavedTracksRequest? = null
        private set

    var REQUEST_SAVED_ARTISTS: GetUsersFollowedArtistsRequest? = null
        private set

    var REQUEST_SAVED_PLAYLISTS: GetListOfCurrentUsersPlaylistsRequest? = null
        private set

    var REQUEST_SAVED_SONGS: GetUsersSavedTracksRequest? = null
        private set

    var REQUEST_SAVED_ALBUMS: GetCurrentUsersSavedAlbumsRequest? = null
        private set
    // TODO our scope allows us to do more requests than this. Take advantage of that?
    //#endregion requests


    //=====================================================================
    //#endregion API Requests
    //#region Request execution.
    //=====================================================================


    /**
     * # Requests user to authorize this client access to thier account.
     * Part of [create] stage 1.
     *
     * Executes [PREAUTH_REQUEST_TOKEN], and opens the resulting url in the system browser.
     *
     * User will obtain auth key, and paste it into the client. See second stage of [create].
     */
    private fun authoriseClient() {
        Desktop.getDesktop().browse(execute(PREAUTH_REQUEST_AUTHORIZATION))
    }

    /**
     * # Asks spotify for an access token
     * Applies it to [spotifyApi], and saves it in preferences file.
     */
    private fun getToken() {
        with (execute(PREAUTH_REQUEST_TOKEN!!)!!) {
            saveTokenFetchData(accessToken, expiresIn, refreshToken)
        }
    }

    /**
     * # If the token has expired, requests a new token.
     *
     * Requests a new access token using the refresh token, and saves the result.
     */
    private fun refreshToken() {
        // If the token hasn't expired, try making a request.
        // If the resuest is successful, we don't need to refresh.
        if (!tokenHasExpired() && implTestConnection()) return

        try {
            with(execute(spotifyApi.authorizationCodeRefresh().build())!!) {
                saveTokenFetchData(accessToken, expiresIn)
            }
        } catch (ignored : Exception) { }
    }

    /**
     * # Saves the token and expiry data after refreshing or obtaining an access token.
     */
    private fun saveTokenFetchData(accessToken: String, expiresIn: Int, refreshToken: String = spotifyApi.refreshToken) {
            saveExpiry(LocalDateTime.now().toEpochSecond(ZoneOffset.UTC), expiresIn)
            cacheToken(accessToken, refreshToken)
            saveToken(accessToken,  refreshToken)
    }

    /**
     * # Stores the tokens in ram via [spotifyApi]
     */
    private fun cacheToken(accessToken: String, refreshToken: String) {
        spotifyApi.accessToken  = accessToken
        spotifyApi.refreshToken = refreshToken
    }

    private fun tokenHasExpired() : Boolean =
        loadExpiryLast().plusSeconds(loadExpiresIn().toLong()).isBefore(LocalDateTime.now())

    private fun loadExpiryLast() : LocalDateTime =
        LocalDateTime.ofEpochSecond(Assets.preferences.getLong("SPOTIFY_REFRESH_LAST", 0), 0, ZoneOffset.UTC)

    private fun loadExpiresIn() : Int =
        Assets.preferences.getInteger("SPOTIFY_REFRESH_LENGTH", 0)

    private fun saveExpiry(lastRefresh : Long, expiresIn : Int) {
        with (Assets.preferences) {
            putLong("SPOTIFY_REFRESH_LAST", lastRefresh)
            putInteger("SPOTIFY_REFRESH_LENGTH", expiresIn)
            flush()
        }
    }

    /**
     * # Stores the tokens on disk via [com.badlogic.gdx.Preferences].
     */
    private fun saveToken(accessToken: String, refreshToken: String) {
        with (Assets.preferences) {
            putString("SPOTIFY_ACCESS_TOKEN", accessToken)
            putString("SPOTIFY_REFRESH_TOKEN", refreshToken)
            putString("SPOTIFY_AUTH_CODE", cachedAuthCode)
            flush()
        }
    }

    /**
     * # Loads tokens from disk from preferences and rebuilds all requests.
     *
     * Returns [testConnection] after loading.
     *
     * If data is not valid, cached tokes are deleted.
     */
    private fun loadToken() : Boolean {
        with (Assets.preferences) {
            cacheToken(getString("SPOTIFY_ACCESS_TOKEN"), getString("SPOTIFY_REFRESH_TOKEN"))
            cachedAuthCode = getString("SPOTIFT_AUTH_CODE")
        }
        buildRequests()
        if (!testConnection()) {
            cachedAuthCode = ""
            cacheToken("","")
            return false
        }
        return true
    }

    /**
     * # Performs a request.
     *
     * Then returns it's result, according to it's [AbstractRequest] ([returnType]).
     *
     * If [DISABLE] is high, has no effect and returns null.
     *
     * If a requets fails, [ERROR] will store the exception. Otherwise, [ERROR] will be set to null.
     */
    private fun <returnType> execute(request : AbstractRequest<returnType>?) : returnType? {
        if (DISABLE) return null
        ERROR = null
        try {
            return request!!.execute()
        } catch (e : Exception){
            // TODO Check for expired token
            ERROR = e
        }
        return null
    }

    //=====================================================================
    //#endregion API Action performing
    //#region Front facing API wrapper.
    //=====================================================================

    /**
     * # Requests spotify to pause playback.
     * If [create] was not called, or it failed to configure [spotifyApi], has
     * no effect.
     */
    fun pause()     = execute(REQUEST_PAUSE)

    /**
     * # Requests spotify to skip to the next track.
     * If [create] was not called, or it failed to configure [spotifyApi], has
     * no effect.
     */
    fun next()      = execute(REQUEST_NEXT)

    /**
     * # Requests spotify to skip to the previous track.
     * If [create] was not called, or it failed to configure [spotifyApi], has
     * no effect.
     */
    fun previous()   = execute(REQUEST_PREVIOUS)

    /**
     * # Gets data on the track that's currently playing.
     */
    fun nowPlaying() = execute(REQUEST_NOW_PLAYING)

    private fun nextPage(page : Paging<Any>) {
        
    }

    /**
     * # Gets a list of 50 of the user's saved playlists.
     */
    fun savedPlaylists() : Paging<PlaylistSimplified> {
        val paging = execute(REQUEST_SAVED_PLAYLISTS)!!
        val items = Utility.MapToGDXArray(paging.items.asIterable()) { it.name }


        return paging
    }

    /**
     * # Gets a list of 50 of the user's saved songs.
     */
    fun savedSongs()     = execute(REQUEST_SAVED_SONGS)

    /**
     * # Gets a list of 50 of the user's saved albums.
     */
    fun savedAlbums()    = execute(REQUEST_SAVED_ALBUMS)

    /**
     * # Gets a list of 50 of the user's saved artists.
     */
    fun savedArtists()   = execute(REQUEST_SAVED_ARTISTS)

    /**
     * # Requests spotify to start or resume playback.
     * If [create] was not called, or it failed to configure [spotifyApi], has
     * no effect.
     */
    fun play()      = execute(REQUEST_PLAY)

    /**
     * # Begins playing from given context.
     *
     * [uri] - indicator for a spotify context to play, i.e a playlist or album.
     */
    fun play(uri : String) = execute(spotifyApi.startResumeUsersPlayback().context_uri(uri).build())

    /**
     * # Fetches playback information.
     */
    fun info() = execute(REQUEST_PLAYBACK_INFO);



/**
     * # Requests spotify to seek to a given time in ms in current playback.
     */
    fun seek(ms: Int) : String? {
        if (REQUEST_SEEK == null) return null
        REQUEST_SEEK!!.position_ms(ms)
        return execute(REQUEST_SEEK!!.build())
    }

    /**
     * # Sets the playback repeat mode to a [RepeatMode].
     * Either repeat a single track, the context (playlist, album, artist, etc)
     * or no repeat.
     */
    fun repeatMode(mode : RepeatMode) : String? {
        if (REQUEST_REPEAT_MODE == null) return null
        REQUEST_REPEAT_MODE!!.state(mode.toString());
        return execute(REQUEST_REPEAT_MODE!!.build())
    }

    /**
     * # Sets playback volume to the given [percent]
     */
    fun setVolume(percent : Int) : String? {
        if (REQUEST_VOLUME == null) return null
        REQUEST_VOLUME!!.volume_percent(percent)
        return execute(REQUEST_VOLUME!!.build())
    }

    /**
     * # Sets the state of playback [shuffle]
     * Either true or false.
     */
    fun setShuffle(shuffle : Boolean) : String? {
        if (REQUEST_SHUFFLE == null) return null
        REQUEST_SHUFFLE!!.state(shuffle)
        return execute(REQUEST_SHUFFLE!!.build())
    }

    //=====================================================================
    //#endregion Front facing API wrapper.
    //#region Data cache
    //=====================================================================

    /**
     * # Retrieves some static data from spotify and stores it.
     */
    private fun buildCache() {
        cache_Playlists = savedPlaylists()
        cache_Artists   = savedArtists()
        cache_Albums    = savedAlbums()

        cache_GdxPlaylists  = Utility.MapToGDXArray(cache_Playlists!!.items.asIterable()) { it.name }
        cache_GdxArtists    = Utility.MapToGDXArray(cache_Artists!!  .items.asIterable()) { it.name }
        cache_GdxAlbums     = Utility.MapToGDXArray(cache_Albums!!   .items.asIterable()) { it.album.name }
    }



    var cache_Playlists : Paging<PlaylistSimplified>? = null
        private set

    var cache_Artists    : PagingCursorbased<Artist>? = null
        private set

    var cache_Albums     : Paging<SavedAlbum>? = null
        private set

    var cache_GdxPlaylists : Array<String>? = null
        private set

    var cache_GdxArtists    : Array<String>? = null
        private set

    var cache_GdxAlbums     : Array<String>? = null
        private set


}
