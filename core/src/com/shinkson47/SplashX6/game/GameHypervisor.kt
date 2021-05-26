/**
 * # The main overseer for a game.
 *
 * Manages and handles all interactions with the current game, and interacts with the client
 *
 * @author [Jordan T. Gray](https://www.shinkson47.in) on 16/04/2021
 * @version 1
 * @since v1
 */

package com.shinkson47.SplashX6.game;

import com.shinkson47.SplashX6.Client.Companion.client
import com.shinkson47.SplashX6.game.units.Unit
import com.shinkson47.SplashX6.rendering.screens.GameScreen
import com.shinkson47.SplashX6.rendering.screens.MainMenu
import com.shinkson47.SplashX6.rendering.screens.WorldCreation
import com.shinkson47.SplashX6.utility.APICondition.Companion.MSG_TRIED_EXCEPT
import com.shinkson47.SplashX6.utility.APICondition.Companion.REQ_GAME_LOADING
import com.shinkson47.SplashX6.utility.APICondition.Companion.REQ_IN_GAME
import com.shinkson47.SplashX6.utility.APICondition.Companion.REQ_NOT_IN_GAME
import com.shinkson47.SplashX6.utility.APICondition.Companion.THROW
import com.shinkson47.SplashX6.utility.APICondition.Companion.invalidCall
import com.shinkson47.SplashX6.utility.APICondition.Companion.validateCall
import com.shinkson47.SplashX6.utility.Debug
import java.lang.Exception
import kotlin.IllegalArgumentException

class GameHypervisor {
    companion object {

        //========================================================================
        //#region fields
        //========================================================================

        /**
         * ## The screen being used to display the game
         */
        @JvmStatic
        var gameRenderer: GameScreen? = null; private set

        /**
         * # Are we in a game? i.e is a game currently loaded and playable?
         * If false, game api calls are not valid.
         */
        @JvmStatic
        var inGame: Boolean = false; private set


        //========================================================================
        //#endregion fields
        //#region construction
        //========================================================================


        /**
         * # Initiates the creation of a new game
         *
         * But does not actually create it. This method switches to the world creation window,
         * which will callback when the user has configured the game and has rendered the loading screen.
         * The game will then be generated in [GameHypervisor#doNewGameCallback()], during which the programme will be
         * un-responsive and unable to render.
         */
        @JvmStatic
        fun NewGame() {
            if (inGame) EndGame()
            client?.setScreen(WorldCreation());
        }

        /**
         * # Actually creates a new game
         * called by the world creation screen after it has rendered the "creating world" message to the user.
         */
        @JvmStatic
        fun doNewGameCallback() {
            validateCall(REQ_GAME_LOADING, THROW("Tried to load a game whilst not loading."))

            // create game data
            GameData.new()


            // Create a new game screen and store a reference locally, then have the client display the screen.
            // Do this only after all loading is complete, as untill this happens the loading screen
            // is being displayed.
            gameRenderer = GameScreen()
            client?.setScreen(gameRenderer)


            // TODO This couldn't be done before a world is created, but is only temporary.
            // STOPSHIP: 17/04/2021 this is dumb and shouldn't stay
            Debug.create()

            inGame = true
        }



        //========================================================================
        //#endregion construction
        //#region saving API
        //========================================================================

        @JvmStatic
        fun quickload() {
            validateCall(REQ_IN_GAME, THROW("Can only quickload in game. This should not be possible."))

        }
        @JvmStatic
        fun load() {
            validateCall(REQ_NOT_IN_GAME, THROW(MSG_TRIED_EXCEPT("load a game", "a game is already loaded")))

        }
        @JvmStatic
        fun quicksave() {
            if (
                invalidCall(REQ_IN_GAME, THROW(MSG_TRIED_EXCEPT("quicksave a game", "no game is loaded")))
            ) return;


        }
        @JvmStatic
        fun save() {
            validateCall(REQ_IN_GAME, THROW(MSG_TRIED_EXCEPT("save a game", "no game is loaded")))
        }

        @JvmStatic
        fun spawn(x: Int, y: Int, id: Int?) {
            // TODO check this
            // TODO are null checks still needed?
            // STOPSHIP: 20/05/2021 this is fucking garbage my g.

            var s: Unit? = null

            try {
                s = Unit("tile" + String.format("%03d", id), x, y)
            } catch (ignore: Exception) {
                return;
            }

            assert (s != null)

            GameData.units.add(s)
        }

        @JvmStatic
        fun selectUnit(unit: Unit) {
            validateCall(REQ_IN_GAME, THROW(MSG_TRIED_EXCEPT("Select a unit", "no game is loaded")))

            if (!GameData.units.contains(unit))
                throw IllegalArgumentException("Tried to select a unit that does not exist in the game data!")

            GameData.selectedUnit = unit
            gameRenderer!!.cam.goTo(unit.x, unit.y)
        }


        //========================================================================
        //#endregion saving
        //#region breakdown
        //========================================================================


        /**
         * # Unloads game, disposing object, clearing memory, and generally breaking down the hypervisor.
         * After calling, Hypervisor is not available until a new game is loaded.
         */
        @JvmStatic
        fun dispose() {
            inGame = false;
            gameRenderer?.dispose()
            gameRenderer = null
            GameData.clear()
        }

        /**
         * # Ends game, disposes, returns to main menu.
         */
        @JvmStatic
        fun EndGame() {
            dispose()
            client?.setScreen(MainMenu());
        }


    //========================================================================
    //#endregion breakdown
    //========================================================================
    }
}