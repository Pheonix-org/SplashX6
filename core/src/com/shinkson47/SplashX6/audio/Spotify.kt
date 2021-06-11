package com.shinkson47.SplashX6.audio

import com.wrapper.spotify.SpotifyApi
import com.wrapper.spotify.SpotifyHttpManager
import com.wrapper.spotify.requests.AbstractRequest
import com.wrapper.spotify.requests.authorization.authorization_code.AuthorizationCodeRequest
import com.wrapper.spotify.requests.data.player.PauseUsersPlaybackRequest
import com.wrapper.spotify.requests.data.player.StartResumeUsersPlaybackRequest
import java.awt.Desktop
import java.lang.Exception

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
     **/
    fun create() {
        authoriseClient() // TODO only need to do once.
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
    fun create(AuthenticationCode : String) {
        authCode = AuthenticationCode

        buildTokenRequest() // Now that we have an authentication code, we can create a request for a token.
        getToken()          // TODO we need to save this token.

        buildRequests()
    }



    //=====================================================================
    //#region Fields
    //=====================================================================

    /**
     * # Permissions that this application is authenticated to use
     * when performing [REQUEST_AUTHORIZATION].
     *
     * Determines what requests we may and may make.
     *
     * See [Spotify's scope docs.](https://developer.spotify.com/documentation/general/guides/scopes/)
     */
    private val SCOPE = "user-modify-playback-state"

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
        .setClientSecret("9736d5764f1b4c4ab82547b9d34edd91")
        .setRedirectUri(SpotifyHttpManager.makeUri("https://shinkson47.in/SplashX6/spotify-callback"))
        .build()

    /**
     * Code which authorizes this application to operate on the users account.
     *
     * Note that this is not the token which allows us to make api requests.
     */
    private var authCode = ""

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
     */
    private fun buildRequests() {
        with (spotifyApi) {
            REQUEST_PAUSE   = pauseUsersPlayback()              .build()
            REQUEST_PLAY    = startResumeUsersPlayback()        .build()
        }
    }


    var REQUEST_PAUSE: PauseUsersPlaybackRequest? = null
        private set

    var REQUEST_PLAY: StartResumeUsersPlaybackRequest? = null
        private set


    //=====================================================================
    //#endregion API Requests
    //=====================================================================

    // Test
    @JvmStatic
    fun main(args: Array<String>) {
        //authoriseClient()

        //System.out.println("Awaiting code hotswap.");
        authCode =
            "AQCIDJ1_al305nMnep7nfFoqly1TzmRV4jxUQFGLLvggIZAuOsE33rSDf1ktIS5mPbGnXdvERT6-TnLHdYYFxNHacBPwXCxStJOWAk4pNtTxKhLbQcxuG3UUg_RaiCtaPpUUaRMmDzDPkflw8GfV3lufAe9dEkpgh7YAl_FKH6-Tg6Hc5dyJ8QVvvadZgG4arEkan7crg9PqZeOKtxODHzU7NjSeBe0vzOD_K6JG6Q"

        // execute token request to get a token.
        getToken()
        pause()
    }


    //=====================================================================
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
     * Asks spotify for an access token, and applies it to [spotifyApi].
     */
    private fun getToken() {
        val authorizationCodeCredentials = execute(PREAUTH_REQUEST_TOKEN!!)

        try {
            spotifyApi.accessToken  = authorizationCodeCredentials!!.accessToken
            spotifyApi.refreshToken = authorizationCodeCredentials.refreshToken
        } catch (e : Exception) {
            e.printStackTrace()
        }
    }


    // TODO handle failure
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
    fun pause() = execute(REQUEST_PAUSE)

    /**
     * # Requests spotify to start or resume playback.
     * If [create] was not called, or it failed to configure [spotifyApi], has
     * no effect.
     */
    fun play() = execute(REQUEST_PLAY)

}
