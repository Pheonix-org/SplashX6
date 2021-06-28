package com.shinkson47.SplashX6.audio

import com.wrapper.spotify.exceptions.detailed.BadRequestException
import com.wrapper.spotify.exceptions.detailed.ForbiddenException
import com.wrapper.spotify.exceptions.detailed.UnauthorizedException

/**
 * # Unused framework for a general exception handler for spotify intergration
 */
class SpotifyExceptionHandler {

    fun handle(e : Exception) {
        when (e) {
            is BadRequestException  -> badRequest(e)
            is UnauthorizedException -> unAuthorized(e)
            is ForbiddenException       -> return   // tried to make an api request that was not permitted. could just be as simple as trying to pause with nothing playing.

        }
    }

    /**
     * # Handles bad request exceptions.
     */
    fun badRequest(e: Exception) {
        when (e.message) {
            "Invalid authorization code" -> return  // user pasted bad code, or code is otherwise unusable.
            "code must be supplied"      -> return  // user left box blank.
        }
    }

    fun unAuthorized(e : Exception) {
        when (e.message) {
            "Invalid access token"      -> return   // API token is not valid.
            "Permissions missing"      -> return    // Made an API call that was not within the authentication's scope.
        }
    }
}