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
import com.shinkson47.SplashX6.rendering.screens.GameScreen
import com.shinkson47.SplashX6.rendering.screens.MainMenu
import com.shinkson47.SplashX6.rendering.screens.WorldCreation
import com.shinkson47.SplashX6.utility.Debug
import com.shinkson47.SplashX6.world.World

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

// TODO move focusses world to here
        /**
         * # The current game world
         */
        @JvmStatic
        var world: World? = null; private set

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
            ValidateHypervisorCall(false)

            // Create a new random world. This will be stored in World#focusedWorld automatically.
            world = World.create();

            // Create a new game screen, which will load in World#focusedWorld
            // It will also configure input for the game window.
            gameRenderer = GameScreen();


            // Set the client to display the new game window
            client?.setScreen(gameRenderer);

            // TODO This couldn't be done before a world is created, but is only temporary.
            // STOPSHIP: 17/04/2021 this is dumb and shouldn't stay
            Debug.create();

            inGame = true;
        }


//========================================================================
//#endregion construction
//#region saving API
//========================================================================

        @JvmStatic
        fun quickload() {
            ValidateHypervisorCall(true)
            TODO()
        }
        @JvmStatic
        fun load() {
            ValidateHypervisorCall(true)
            TODO()
        }
        @JvmStatic
        fun quicksave() {
            ValidateHypervisorCall(true)
            TODO()
        }
        @JvmStatic
        fun save() {
            ValidateHypervisorCall(true)
            TODO()
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
            world = null
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
//#region misc
//========================================================================


        /**
         * # Disallows calls which depend on state of game load when hypervisor is not in the expected state.
         * set [requireLoaded] true if the call requires that a game is loaded. Set false if
         * it requires that no game is loaded. If no state dependancy on call, then don't validate.
         */
        @JvmStatic
        fun ValidateHypervisorCall(requireLoaded: Boolean) {
            if (requireLoaded && !inGame || !requireLoaded && inGame)   // If load required but not loaded OR require not loaded but is loaded then
                throw IllegalAccessException(                           // Throw illegal access.
                    if (requireLoaded) "Hypervisor API called, but Hypervisor has no game loaded!" else "Hypervisor pre-init API called, but a game as been loaded!"
                )
        }


//========================================================================
//#endregion misc
//========================================================================
    }
}