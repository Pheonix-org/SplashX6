package com.shinkson47.SplashX6.audio

import com.shinkson47.SplashX6.utility.Assets
import com.wrapper.spotify.SpotifyApi
import com.wrapper.spotify.SpotifyHttpManager
import com.wrapper.spotify.requests.AbstractRequest
import com.wrapper.spotify.requests.authorization.authorization_code.AuthorizationCodeRequest
import com.wrapper.spotify.requests.data.browse.GetListOfCategoriesRequest
import com.wrapper.spotify.requests.data.library.GetCurrentUsersSavedAlbumsRequest
import com.wrapper.spotify.requests.data.library.GetUsersSavedTracksRequest
import com.wrapper.spotify.requests.data.player.*
import java.awt.Desktop

/**
 * # Spotify intergration for Splash X6.
 *
 * This object handles authentication, and the compilation & execution of requests.
 * @since PRE-ALPHA 0.0.2
 * @version 1
 */
object Spotify {

    /**
     * # 1 of 2 - Builds API connection.
     * - Authorizes this application via a web re-direct.
     *
     * This gives us our [authCode] which authorises this application to perform actions on the user's account
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
    fun create() : Boolean {
        //  If data is stored, try and load it. If we can connect, treat connection as complete.
        if (Assets.preferences.getString("SPOTIFY_AUTH_CODE") != "" && loadToken()) return true

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
        authCode = AuthenticationCode

        buildTokenRequest() // Now that we have an authentication code, we can create a request for a token.
        getToken()          // TODO we need to save this token.

        buildRequests()
        return testConnection()
    }

    /**
     * Performs a [REQUEST_PROFILE] to test access to user's account via the API.
     *
     * returns true if access was successful.
     */
    private fun testConnection() : Boolean {
        return execute(REQUEST_CATAGORIES) != null
    }



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
    private val SCOPE = "user-modify-playback-state, user-read-playback-state, user-read-currently-playing, user-library-read"

    /**
     * # General connection to the spotify api.
     *
     * Is the intermediary between this application and the spotify api.
     *
     * Performs requests, stores access credentials, compiles results. Does all the complex stuff
     * so we don't have to.
     */
    var spotifyApi = SpotifyApi.Builder()
        .setClientId("72cabe08e89f49808ac14523a2f809ae")
        .setClientSecret("9736d5764f1b4c4ab82547b9d34edd91") // TODO this is bad but idk how to get around it. Should not keep secret in public source.
        .setRedirectUri(SpotifyHttpManager.makeUri("https://shinkson47.in/SplashX6/spotify-callback"))
        .build()

    /**
     * Code which authorizes this application to operate on the users account.
     *
     * Note that this is not the token which allows us to make api requests.
     */
    private var authCode = ""

    enum class RepeatModes { track, context, off }

    //=====================================================================
    //#endregion Fields
    //#region Pre authentication requests
    //=====================================================================

    /**
     * # Requests user to authenticate this app to access spotify via thier account.
     * For now, access code is stored in [authCode]
     */
    private val PREAUTH_REQUEST_AUTHORIZATION = spotifyApi.authorizationCodeUri()
        .scope(SCOPE)
        .build()

    /**
     * # Requests spotify for an access token to use with api requests.
     */
    private var PREAUTH_REQUEST_TOKEN : AuthorizationCodeRequest? = null

    /**
     * Populates [REQUEST_TOKEN] with a API request for a new token.
     *
     * This exsists purely because this request must be built after we have an auth code.
     */
    private fun buildTokenRequest() { PREAUTH_REQUEST_TOKEN = spotifyApi.authorizationCode(authCode).build() }


    //=====================================================================
    //#endregion Pre authentication requests
    //#endregion API Requests
    //=====================================================================

    /**
     * # Performed after authentication, this builds all requests we can perform.
     * NOTE : Some requests require arguments that can only be provided prior to building the request.
     * In these cases, the builder is stored instead, and the request is built when the request is made.
     */
    private fun buildRequests() {
        with (spotifyApi) {
            REQUEST_PAUSE       = pauseUsersPlayback()                      .build()
            REQUEST_PLAY        = startResumeUsersPlayback()                .build()
            REQUEST_NEXT        = skipUsersPlaybackToNextTrack()            .build()
            REQUEST_PREVIOUS    = skipUsersPlaybackToPreviousTrack()        .build()
            REQUEST_NOW_PLAYING = getUsersCurrentlyPlayingTrack()           .build()
            REQUEST_CATAGORIES  = listOfCategories                          .build()

            REQUEST_SEEK        = seekToPositionInCurrentlyPlayingTrack(0)
            REQUEST_REPEAT_MODE = setRepeatModeOnUsersPlayback(RepeatModes.off.toString())
            REQUEST_VOLUME      = setVolumeForUsersPlayback(0)
            REQUEST_SHUFFLE     = toggleShuffleForUsersPlayback(false)

        }
    }


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

    var REQUEST_SAVED_ALBUMBS: GetCurrentUsersSavedAlbumsRequest? = null
        private set

    var REQUEST_SAVED_TRACKS: GetUsersSavedTracksRequest? = null
        private set

    var REQUEST_CATAGORIES: GetListOfCategoriesRequest? = null
        private set


    //=====================================================================
    //#endregion API Requests
    //#region API Action performing
    //=====================================================================


    /**
     * # Requests user to authorize this client access to thier account.
     * Once user has authenticated this app, the auth code can be stored and used to get tokens.
     */
    private fun authoriseClient() {
        Desktop.getDesktop().browse(execute(PREAUTH_REQUEST_AUTHORIZATION))
    }

    /**
     * Asks spotify for an access token, and applies it to [spotifyApi], and saves it in preferences.
     */
    private fun getToken() {
        with (execute(PREAUTH_REQUEST_TOKEN!!)!!) {
            cacheToken(accessToken, refreshToken)
            saveToken(accessToken, refreshToken)
        }
    }

    /**
     * Stores the tokens in ram in [spotifyApi]
     */
    private fun cacheToken(accessToken: String, refreshToken: String) {
        spotifyApi.accessToken  = accessToken
        spotifyApi.refreshToken = refreshToken
    }

    /**
     * Stores the tokens on disk in preferences.
     */
    private fun saveToken(accessToken: String, refreshToken: String) {
        with (Assets.preferences) {
            putString("SPOTIFY_ACCESS_TOKEN", accessToken)
            putString("SPOTIFY_REFRESH_TOKEN", refreshToken)
            putString("SPOTIFY_AUTH_CODE", authCode)
            flush()
        }
    }

    /**
     * Loads the tokens from disk from preferences and rebuilds all requests.
     *
     * Returns [testConnection] after loading.
     */
    private fun loadToken() : Boolean {
        with (Assets.preferences) {
            cacheToken(getString("SPOTIFY_ACCESS_TOKEN"), getString("SPOTIFY_REFRESH_TOKEN"))
            authCode = getString("SPOTIFT_AUTH_CODE")
        }
        buildRequests()
        if (!testConnection()) {
            authCode = ""
            cacheToken("","")
            return false;
        }
        return  true;
    }

    /**
     * # Performs a request.
     *
     * If [request] is null, does nothing.
     */
    private fun <T> execute(request : AbstractRequest<T>?) : T? {
        try {
            return request?.let { request.execute() }
        } catch (e : Exception){
            e.printStackTrace()
        }
        return null
    }


    //=====================================================================
    //#endregion API Action performing
    //=====================================================================

    /**
     * # Requests spotify to pause playback.
     * If [create] was not called, or it failed to configure [spotifyApi], has
     * no effect.
     */
    fun pause()     = execute(REQUEST_PAUSE)

    /**
     * # Requests spotify to start or resume playback.
     * If [create] was not called, or it failed to configure [spotifyApi], has
     * no effect.
     */
    fun play()      = execute(REQUEST_PLAY)

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

    /**
     * # Requests spotify to seek to a given time in ms in current playback.
     */
    fun seek(ms: Int) : String? {
        if (REQUEST_SEEK == null) return null
        REQUEST_SEEK!!.position_ms(ms)
        return execute(REQUEST_SEEK!!.build())
    }

    fun repeatMode(mode : RepeatModes) : String? {
        if (REQUEST_REPEAT_MODE == null) return null
        REQUEST_REPEAT_MODE!!.state(mode.toString());
        return execute(REQUEST_REPEAT_MODE!!.build())
    }

    fun setVolume(percent : Int) : String? {
        if (REQUEST_VOLUME == null) return null
        REQUEST_VOLUME!!.volume_percent(percent)
        return execute(REQUEST_VOLUME!!.build())
    }

    fun setShuffle(shuffle : Boolean) : String? {
        if (REQUEST_SHUFFLE == null) return null
        REQUEST_SHUFFLE!!.state(shuffle)
        return execute(REQUEST_SHUFFLE!!.build())
    }
}
