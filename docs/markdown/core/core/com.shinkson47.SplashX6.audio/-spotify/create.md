//[core](../../../index.md)/[com.shinkson47.SplashX6.audio](../index.md)/[Spotify](index.md)/[create](create.md)

# create

[jvm]\
fun [create](create.md)(autoOnly: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = false): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)

# 1 of 2 - Builds API connection.

- 
   Authorizes this application via a web re-direct.

This gives us our cachedOTP which authorises this application to perform actions on the user's account We only need to do this once, after we can store it.

##  IMPORTANT API NOTE

This call is not enough. It's 1 of 2.

Once user has authenticated, the authentication code must be provided for the final stage of set-up to be complete.

Call [create](create.md) again with the authentication code as an argument.

Returns true if and only if access data could be loaded from preferences, and was positively tested to be working.

[jvm]\
fun [create](create.md)(AuthenticationCode: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)

# 2 of 2 - Builds API connection.

- 
   Gets an api token and refresh token

The api token is sent along with every request to authenticate it. This token is temporary, and will expire. We can refresh using the refresh token and the same auth code for as long as the user allows the auth code to remain active.

- 
   Compiles all requests

Now that we have an access token, we can build and store requests ready to execute them.

##  IMPORTANT API NOTE

This call must be second. Call [create](create.md) with no arguments first to authenticate and recieve an authentication code. THEN call this method with said auth code.
