package com.shinkson47.SplashX6.utility

/**
 * # Kotlin specific utilities.
 */
object UtilityK {
    inline fun <T> tryOrNull(f: () -> T) =
        try {
            f()
        } catch (_: Exception) {
            null
        }
}