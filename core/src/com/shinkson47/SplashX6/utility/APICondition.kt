/*░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░
 ░ FOSS 2022. The Splash Project.                                                                                                                                                 ░
 ░ https://www.shinkson47.in/SplashX6                                                                                                                                             ░
 ░ Jordan T. Gray.                                                                                                                                                                ░
 ░                                                                                                                                                                                ░
 ░                                                                                                                                                                                ░
 ░                                                                                                                                                                                ░
 ░           _____                    _____                    _____            _____                    _____                    _____                                           ░
 ░          /\    \                  /\    \                  /\    \          /\    \                  /\    \                  /\    \                         ______           ░
 ░         /::\    \                /::\    \                /::\____\        /::\    \                /::\    \                /::\____\                       |::|   |          ░
 ░        /::::\    \              /::::\    \              /:::/    /       /::::\    \              /::::\    \              /:::/    /                       |::|   |          ░
 ░       /::::::\    \            /::::::\    \            /:::/    /       /::::::\    \            /::::::\    \            /:::/    /                        |::|   |          ░
 ░      /:::/\:::\    \          /:::/\:::\    \          /:::/    /       /:::/\:::\    \          /:::/\:::\    \          /:::/    /                         |::|   |          ░
 ░     /:::/__\:::\    \        /:::/__\:::\    \        /:::/    /       /:::/__\:::\    \        /:::/__\:::\    \        /:::/____/                          |::|   |          ░
 ░     \:::\   \:::\    \      /::::\   \:::\    \      /:::/    /       /::::\   \:::\    \       \:::\   \:::\    \      /::::\    \                          |::|   |          ░
 ░   ___\:::\   \:::\    \    /::::::\   \:::\    \    /:::/    /       /::::::\   \:::\    \    ___\:::\   \:::\    \    /::::::\    \   _____                 |::|   |          ░
 ░  /\   \:::\   \:::\    \  /:::/\:::\   \:::\____\  /:::/    /       /:::/\:::\   \:::\    \  /\   \:::\   \:::\    \  /:::/\:::\    \ /\    \          ______|::|___|___ ____  ░
 ░ /::\   \:::\   \:::\____\/:::/  \:::\   \:::|    |/:::/____/       /:::/  \:::\   \:::\____\/::\   \:::\   \:::\____\/:::/  \:::\    /::\____\        |:::::::::::::::::|    | ░
 ░ \:::\   \:::\   \::/    /\::/    \:::\  /:::|____|\:::\    \       \::/    \:::\  /:::/    /\:::\   \:::\   \::/    /\::/    \:::\  /:::/    /        |:::::::::::::::::|____| ░
 ░  \:::\   \:::\   \/____/  \/_____/\:::\/:::/    /  \:::\    \       \/____/ \:::\/:::/    /  \:::\   \:::\   \/____/  \/____/ \:::\/:::/    /          ~~~~~~|::|~~~|~~~       ░
 ░   \:::\   \:::\    \               \::::::/    /    \:::\    \               \::::::/    /    \:::\   \:::\    \               \::::::/    /                 |::|   |          ░
 ░    \:::\   \:::\____\               \::::/    /      \:::\    \               \::::/    /      \:::\   \:::\____\               \::::/    /                  |::|   |          ░
 ░     \:::\  /:::/    /                \::/____/        \:::\    \              /:::/    /        \:::\  /:::/    /               /:::/    /                   |::|   |          ░
 ░      \:::\/:::/    /                  ~~               \:::\    \            /:::/    /          \:::\/:::/    /               /:::/    /                    |::|   |          ░
 ░       \::::::/    /                                     \:::\    \          /:::/    /            \::::::/    /               /:::/    /                     |::|   |          ░
 ░        \::::/    /                                       \:::\____\        /:::/    /              \::::/    /               /:::/    /                      |::|   |          ░
 ░         \::/    /                                         \::/    /        \::/    /                \::/    /                \::/    /                       |::|___|          ░
 ░          \/____/                                           \/____/          \/____/                  \/____/                  \/____/                         ~~               ░
 ░                                                                                                                                                                                ░
 ░                                                                                                                                                                                ░
 ░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░*/

package com.shinkson47.SplashX6.utility

import com.badlogic.gdx.Gdx
import com.shinkson47.SplashX6.Client
import com.shinkson47.SplashX6.audio.AudioController
import com.shinkson47.SplashX6.game.GameData
import com.shinkson47.SplashX6.game.Hypervisor
import com.shinkson47.SplashX6.network.NetworkClient
import com.shinkson47.SplashX6.network.Server
import com.shinkson47.SplashX6.rendering.screens.Warroom
import com.shinkson47.SplashX6.rendering.screens.MainMenu
import com.shinkson47.SplashX6.rendering.screens.WorldCreation
import com.shinkson47.SplashX6.utility.Utility.message
import java.util.function.Predicate

/**
 * # A validation system for checking common predicates on [Hypervisor] api calls.
 * Checks that a call to the hypervisor was made in a state were that call can be made.
 *
 * If in an unsupported state, some other action happens.
 *
 * @author [Jordan T. Gray](https://www.shinkson47.in) on 15/05/2021
 * @since v1
 * @version 1
 */
class APICondition @JvmOverloads constructor() {

    // TODO lazy message support.

    companion object {

        /**
         * # Validates that an API call is being made in a supported state.
         * Whilst attempting to add minimal overhead to every call.
         *
         * Supply a [requiredState], and an action to perform [onIllegalState]
         */
        @JvmStatic
        fun validateCall(requiredState : Predicate<Any?>, onIllegalState : Runnable) {
            if (!requiredState.test(null)) onIllegalState.run()
        }

        @JvmStatic
        fun invalidCall(requiredState : Predicate<Any?>, onIllegalState : Runnable): Boolean {
            try {
                if (!requiredState.test(null))
                    throw APIException("")
            } catch (ignored: APIException) {
                try {
                    onIllegalState.run()
                } catch (doubleignored : APIException) {}
                Gdx.app.log("API Validation warning", "An API call failed to meet call condition, but the exception will be ignored.")
                return true
            }
            return false
        }

        /**
         * # Exception : This api call should not have happened.
         * [IllegalStateException] indicating a API call occoured in a state that it should not be possible to make this call.
         *
         * Message is formated as "`API call made in unsupported state. $text`"
         */
        class APIException(val text : String) : IllegalStateException("API call made in unsupported state. $text")




        // ================== Actions ==================


        /**
         * # [THROW] an [APIException] with [msg].
         * Use if it's not worth telling off the user, AND
         *
         * this issue will be handled the the API call, or if the game should not continue.
         */
        @JvmStatic
        fun THROW(msg: String): _THROW = _THROW(msg)

        /**
         * # [THROW] an [APIException] with [MSG_GENERIC].
         * Use if it's not worth telling off the user, AND
         *
         * this issue will be handled the the API call, or if the game should not continue.
         */
        @JvmStatic
        fun THROW(): _THROW = _THROW(MSG_GENERIC)

        /**
         * internal class : onFail action that throws an [APIException]
         */
        class _THROW(val message : String) : Runnable {
            override fun run() {throw APIException(message)}
        }




        /**
         * # Shows a modal dialog with [message] which [THROW]s when user acknowledges
         * to notify user before [THROW]ing to prevent API call. Use if user is responsible for invalid call.
         *
         * [caller] is required to find the GUI stage where the diaog should be displayed.
         */
        @JvmStatic
        fun WARN(message: String): Runnable = _WARN_USER(message)
        class _WARN_USER(val message: String) : Runnable {
            override fun run() {
                //StageWindow.dialog(caller, "Invalid operation!", "$message", "Whoops, OK!", "", null)
                AudioController.error()
                message(message)
                _THROW(message).run()
            }
        }

        @JvmField
        val DO_NOTHING: Runnable = Runnable { }



        // ================== Conditions ==================


        /**
         *  # This API call requires that we are in game.
         */
        @JvmField
        val REQ_IN_GAME: Predicate<Any?> = Predicate { Hypervisor.inGame }

        /**
         * # This API call can only be performed when not in a game
         * Doesn't matter where we are, so long as we're not in a game.
         */
        @JvmField
        val REQ_NOT_IN_GAME: Predicate<Any?> = Predicate { !Hypervisor.inGame }

        /**
         * # This API call can only be performed whilst on the game loading screen.
         */
        @JvmField
        val REQ_GAME_LOADING: Predicate<Any?> = Predicate { Client.client?.screen is WorldCreation }

        /**
         * # This API call can only be performed on the main menu.
         */
        @JvmField
        val REQ_MAIN_MENU: Predicate<Any?> = Predicate { Client.client?.screen is MainMenu }

        @JvmField
        val REQ_UNIT_CONTROL_MODE: Predicate<Any?> = Predicate { Client.client?.screen is Warroom }

        @JvmField
        val REQ_UNIT_SELECTED: Predicate<Any?> = Predicate { GameData.selectedUnit != null }

        @JvmField
        val REQ_CLIENT_CONNECTED: Predicate<Any?> = Predicate { NetworkClient.isConnected() }

        @JvmField
        val REQ_SERVER_HOSTING: Predicate<Any?> = Predicate { Server.alive }







        // ================== Common messages ==================
        // TODO locale

        /**
         * Generic invalid call message.
         */
        @JvmStatic
        val MSG_GENERIC : String = "API call made in invalid state."

        @JvmStatic
        val MSG_NOT_IN_UCM : String = "Unit Control Mode API call issued when not in UCM."

        /**
         * Shows a formatted message : `Tried to $triedTo, but $except`.
         *
         * i.e *Tried to save, but no game was loaded*
         */
        @JvmStatic
        fun MSG_TRIED_EXCEPT(triedTo: String, except: String) : String = "Tried to $triedTo, but $except."
    }
}