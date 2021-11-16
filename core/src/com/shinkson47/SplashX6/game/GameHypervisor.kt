package com.shinkson47.SplashX6.game;

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.math.Vector3
import com.shinkson47.SplashX6.Client.Companion.DEBUG_MODE
import com.shinkson47.SplashX6.Client.Companion.client
import com.shinkson47.SplashX6.audio.AudioController
import com.shinkson47.SplashX6.audio.GamePlaylist
import com.shinkson47.SplashX6.audio.Spotify
import com.shinkson47.SplashX6.game.cities.City
import com.shinkson47.SplashX6.game.cities.CityTypes
import com.shinkson47.SplashX6.game.units.Unit
import com.shinkson47.SplashX6.game.units.UnitClass
import com.shinkson47.SplashX6.game.world.WorldTerrain
import com.shinkson47.SplashX6.game.world.WorldTerrain.*
import com.shinkson47.SplashX6.game.world.WorldTerrain.Companion.TILE_HALF_HEIGHT
import com.shinkson47.SplashX6.game.world.WorldTerrain.Companion.TILE_HALF_WIDTH
import com.shinkson47.SplashX6.game.world.WorldTerrain.Companion.cartesianToIso
import com.shinkson47.SplashX6.input.KeyBinder
import com.shinkson47.SplashX6.rendering.StageWindow
import com.shinkson47.SplashX6.rendering.screens.MainMenu
import com.shinkson47.SplashX6.rendering.screens.WorldCreation
import com.shinkson47.SplashX6.rendering.screens.game.GameScreen
import com.shinkson47.SplashX6.rendering.windows.GameWindowManager
import com.shinkson47.SplashX6.rendering.windows.game.units.W_UnitsList
import com.shinkson47.SplashX6.utility.APICondition.Companion.MSG_TRIED_EXCEPT
import com.shinkson47.SplashX6.utility.APICondition.Companion.REQ_IN_GAME
import com.shinkson47.SplashX6.utility.APICondition.Companion.REQ_NOT_IN_GAME
import com.shinkson47.SplashX6.utility.APICondition.Companion.THROW
import com.shinkson47.SplashX6.utility.APICondition.Companion.invalidCall
import com.shinkson47.SplashX6.utility.APICondition.Companion.validateCall
import com.shinkson47.SplashX6.utility.Debug
import com.shinkson47.SplashX6.utility.Utility
import java.lang.Thread.sleep

/**
 * # The main overseer for a game.
 *
 * Manages and handles all interactions with the current game from the client.
 *
 * @author [Jordan T. Gray](https://www.shinkson47.in) on 16/04/2021
 * @version 1
 * @since PRE-ALPHA 0.0.1
 */
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

        /**
         * # Runnables to be performed on [turnEnd].
         * Removed after being performed once.
         */
        private val TURN_ASYNC_TASKS : ArrayList<Runnable> = ArrayList()

        /**
         * # Runnables to be performed on [turnEnd].
         * Kept until removed, activated every turn.
         */
        private val TURN_HOOKS : ArrayList<Runnable> = ArrayList()


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
            client?.fadeScreen(WorldCreation())
        }

        /**
         * # Actually creates a new game
         * This is the main game creation routine that is ran under the loading screen.
         *
         * called by the world creation screen after it has rendered the "creating world" message to the user.
         */
        @JvmStatic
        fun doNewGameCallback() {
            //validateCall(REQ_GAME_LOADING, THROW("Tried to load a game whilst not loading."))

            Gdx.graphics.isContinuousRendering = false;

            doNewGamePRE()
            inGame = true

            doNewGamePOST()

            doNewGameFINAL()

            Gdx.graphics.isContinuousRendering = true;
        }

        /**
         * # Game creation sub-routine
         * This is ran before we are considered to be in-game.
         * Contains calls which do not require a game to be loaded.
         */
        private fun doNewGamePRE() {
            GameData.new() // create game data. Must be before game screen is created.

            // Create a new game screen stored locally. It will be shown to the user in the FINAL.
            // For now, loading screen is still being displayed. This is just so we can access the camera and whatnot.
            gameRenderer = GameScreen()

        }

        /**
         * # Game creation sub-routine
         * Ran AFTER we are considered to be in-game.
         * Contains calls which require a game to be loaded.
         */
        private fun doNewGamePOST(){
            gameRenderer!!.createUI() // Populate the game screen with GUI. can't be done whilst gr is null.

            unit_select(0)    // Select the first unit created at world gen. Should be a settler.
            unit_view()             // Focus the camera on that unit.
            camera_skipMovement();  // Skip the camera travelling from 0,0 to the unit.
                                    // without that, the game always starts with the camera flying across the map.
        }

        /**
         * # Game creation sub-routine
         * Final touches applied after game has been created
         */
        private fun doNewGameFINAL(){
            // TODO This couldn't be done before a world is created, but is only temporary.
            // STOPSHIP : 17/04/2021 this is dumb and shouldn't stay
            Debug.create()
            KeyBinder.createGameBinds()

            if (!DEBUG_MODE) Spotify.pause()      // If possible, stop spotify.
            AudioController.playPlaylist(GamePlaylist());
            client?.fadeScreen(gameRenderer!!)    // Show the game screen to the user.
        }



        //========================================================================
        //#endregion construction
        //#region saving API
        //========================================================================

        @JvmStatic
        fun quickload() {
            validateCall(REQ_IN_GAME, THROW("Can only quickload in game. This should not be possible."))
            TODO()
        }

        @JvmStatic
        fun load() {
            validateCall(REQ_NOT_IN_GAME, THROW(MSG_TRIED_EXCEPT("load a game", "a game is already loaded")))
            TODO()
        }

        @JvmStatic
        fun quicksave() {
            if (
                invalidCall(REQ_IN_GAME, THROW(MSG_TRIED_EXCEPT("quicksave a game", "no game is loaded")))
            ) return
            TODO()
        }

        @JvmStatic
        fun save() {
            validateCall(REQ_IN_GAME, THROW(MSG_TRIED_EXCEPT("save a game", "no game is loaded")))
            TODO()
        }

        /**
         * # Spawns a [unit] with the sprite of [spriteName] on iso co-oord [x],[y]
         * Cannot be used in a UnitAction; Modifies GameData.units. See [turn_asyncTask].
         */
        @JvmStatic
        fun spawn(pos: Vector3, spriteName: UnitClass) {
            spawn(pos.x.toInt(), pos.y.toInt(), spriteName)
        }

        /**
         * # Spawns a [unit] with the sprite of [spriteName] on iso co-oord [x],[y]
         * Cannot be used in a UnitAction; Modifies GameData.units. See [turn_asyncTask].
         */
        @JvmStatic
        fun spawn(x: Int, y: Int, spriteName: UnitClass) {
            // TODO check this
            // TODO are null checks still needed?
            // STOPSHIP: 20/05/2021 this is fucking garbage my g.
            // TODO This can only spawn on player civ

            var s: Unit? = null

            try {
                s = Unit(spriteName, x, y)
            } catch (ignore: Exception) {
                return;
            }

            assert (s != null)


            GameData.player!!.units.add(s)
        }

        fun civ_new() : Civilisation {
            val c = Civilisation()
            GameData.civilisations.add(c)
            return c
        }



        //========================================================================
        //#endregion saving
        //#region units
        //========================================================================

        // TODO api predicate for requiring a unit is selected.

        @JvmStatic
        fun unit_select(index: Int) = unit_select(GameData.player!!.units.get(index))

        /**
         * # Selects a unit for focus of manipulation
         * Other unit calls will use this selected unit.
         */
        @JvmStatic
        fun unit_select(unit: Unit) {
            validateCall(REQ_IN_GAME, THROW(MSG_TRIED_EXCEPT("Select a unit", "no game is loaded")))

            if (!GameData.player!!.units.contains(unit))
                throw IllegalArgumentException("Tried to select a unit that does not exist in the game data!")

            GameData.selectedUnit = unit
            unit_view();
        }

        /**
         * # Sets the destination of the selected unit to the cursor
         * in tile space.
         */
        @JvmStatic
        fun unit_setDestination() {
            with(GameData.selectedUnit!!) {
                val dest: Vector3 = cm_selectedTile()
                setDestination(dest.x.toInt(), dest.y.toInt())

                unit_selectAction( "Travel to destination")
            }
        }

        /**
         * # Focusses the camera on the selected units destination.
         */
        @JvmStatic
        fun unit_viewDestination() {
            camera_moveToTile(GameData.selectedUnit!!.destX, GameData.selectedUnit!!.destY)
        }


        /**
         * # focuesses the camera on the selected unit
         */
        @JvmStatic
        fun unit_view(){
            camera_focusOn(GameData.selectedUnit!!.x + TILE_HALF_WIDTH, GameData.selectedUnit!!.y + TILE_HALF_HEIGHT)
        }

        /**
         * # Destroys the selected unit
         * Giving the user some resources in return.
         */
        @JvmStatic
        fun unit_disband() {
            GameData.player!!.units.remove(GameData.selectedUnit)
            GameData.selectedUnit = null
        }

        @JvmStatic
        fun unit_selected() : Unit? = GameData.selectedUnit

        @JvmStatic
        fun unit_selectAction(displayName : String) {
            with (GameData.selectedUnit!!) {
                onTurnAction = actions.find { it.displayName == displayName }
            }
            unit_updateUnitWindow()
        }

        @Deprecated("Windows now automatically update on turn end.")
        @JvmStatic
        fun unit_updateUnitWindow() {
            //(GameWindowManager.WINDOW_DOCK.items.find { it.title == "Units" } as W_UnitsList).run()
        }

        @JvmStatic
        fun unit_canEnter(x : Int, y: Int) : Boolean = GameData.world!!.getTile(x,y)!!.isLand


        //========================================================================
        //#endregion units
        //#region game control
        //========================================================================


        /**
         * Ends this turn, performing actions on units and invoking opposing players to
         * take thier turn.
         *
         * > N.B. : UnitActions cannot modify some game data directly, since it will cause a concurrent modification exception.
         * Instead, post a runnable to []
         */
        @JvmStatic
        fun turn_end() {
            doEndTurn_Units()
            doEndTurn_Async()
        }

        /**
         * # Stores a task to be run at the end of the next [turn_end].
         * Also used as a work-around for not being able to modify some game data from within
         * actions run on [turn_end]
         */
        @JvmStatic
        fun turn_asyncTask(runnable: Runnable) = TURN_ASYNC_TASKS.add(runnable)

        /**
         * # Stores a runnable that will be invoked after every turn.
         */
        @JvmStatic
        fun turn_hook(runnable: Runnable) = TURN_HOOKS.add(runnable)

        /**
         * # Removes a [turn_hook]
         */
        @JvmStatic
        fun turn_unhook(runnable: Runnable) = TURN_HOOKS.remove(runnable)


        /**
         * Invokes player's units to perform thier turn action.
         */
        private fun doEndTurn_Units(){
            // META : If you get a concurrent modification exception here, then
            // an onTurnAction has modified the GameData units list.
            GameData.player!!.units.forEach {it.doTurn()}
        }

        private fun doEndTurn_Async(){
            TURN_ASYNC_TASKS.forEach { it.run() }
            TURN_ASYNC_TASKS.clear()
            TURN_HOOKS.forEach { it.run() }
        }

        //========================================================================
        //#endregion game control
        //#region camera control
        //========================================================================


        /**
         * # Focusses the camera on the provided unit.
         */
        @JvmStatic
        fun camera_focusOn(unit: Unit) = camera_focusOn(unit.x, unit.y)

        /**
         * # Focusses the camera on a cartesian x, y
         */
        @JvmStatic
        fun camera_focusOn(pos: Vector3) = camera_focusOn(pos.x, pos.y)

        /**
         * # Focusses the camera on a cartesian x, y
         */
        @JvmStatic
        fun camera_focusOn(x: Float, y: Float) {
            if (cm_active)
                gameRenderer!!.managementScreen.desiredCameraPosition.desired.set(x,y,0f)
            else
                gameRenderer!!.cam.goTo(x, y)
        }

        /**
         * # The cartesian location in the world that the camera is looking at.
         */
        @JvmStatic
        fun camera_focusingOn(): Vector3 {
            with (gameRenderer!!.cam) {
                val v: Vector3 = desiredPosition.get().cpy()
                v.y = lookingAtY().toFloat()
                return v;
            }
        }

        /**
         * # Returns the isometric version of [camera_focusingOn]
         */
        @JvmStatic
        fun camera_focusingOnTile(): Vector3 {
            val v = camera_focusingOn()
            return WorldTerrain.cartesianToIso(v.x.toInt(), v.y.toInt())
        }


        @JvmStatic
        fun camera_moveToTile(x: Int, y: Int) {
            with (WorldTerrain.isoToCartesian(x,y)) {
                camera_focusOn(this.x, this.y)
            }
        }

        /**
         * Sets the camera's position to it's destination, skipping the travel between the two.
         *
         * Does so by lerping with an alpha of 100%.
         */
        @JvmStatic
        fun camera_skipMovement() {
            gameRenderer!!.cam.desiredPosition.next(1f)
        }


        //========================================================================
        //#endregion camera control
        //#region input
        //========================================================================

        @JvmStatic
        fun mouse_focusOnTile() : Vector3 {
            with (gameRenderer!!.cam) {
/*              val mousex = (Gdx.input.x + desiredPosition.present.x) - Gdx.graphics.height
                val mousey = yFromAngle(desiredTilt.present, (Gdx.graphics.height - Gdx.input.y.toDouble()) + desiredPosition.present.y )
                Debug.dump("X: $mousex")
                Debug.dump("Y: $mousey")*/
                //cartesianToIso(unprojected.x.toInt(), unprojected.y.toInt())
                val unprojected = unproject(Vector3(Gdx.input.x.toFloat(), Gdx.input.y.toFloat(), 0f))
                Debug.dump("Result: $unprojected")
                return unprojected
            }
        }

        //========================================================================
        //#endregion input
        //#region Control Mode
        //========================================================================

        @JvmStatic
        var cm_active = false
            private set

        /**
         * # Enters unit control mode
         *
         * Returns true if caused a transition, else false.
         */
        @JvmStatic
        fun cm_enter() : Boolean {
            if (cm_active) return false
            //cm_showStateCaps(true)
            cm_active = true
            client!!.fadeScreen(gameRenderer!!.managementScreen)

            return true
        }

        /**
         * # Exits unit control mode
         */
        @JvmStatic
        fun cm_exit() {
            //cm_showStateCaps(false)
            cm_active = false
            client!!.fadeScreen(gameRenderer!!)
        }

        /**
         * Toggles between [cm_exit] and [cm_enter]
         */
        @JvmStatic
        fun cm_toggle() {
            if (cm_active) cm_exit() else cm_enter()
        }

        //private fun cm_showStateCaps(value : Boolean) = Toolkit.getDefaultToolkit().setLockingKeyState(KeyEvent.VK_CAPS_LOCK, value)

        /**
         * # Returns the tile under the mouse cursor in control mode.
         */
        @JvmStatic
        fun cm_selectedTile() : Vector3 {
            //validateCall(REQ_UNIT_CONTROL_MODE) { cm_enter(); }

            // Get point on world that mouse is pointing to.
            val unprojected = gameRenderer!!.managementScreen.camera.unproject(Vector3(Gdx.input.x.toFloat(), Gdx.input.y.toFloat(), 0f))

            // Find what tile that is and return it.
            return cartesianToIso(unprojected.x.toInt(), unprojected.y.toInt())
        }

        /**
         * Flag representing wether or not the ucm is currently selecting a unit destination.
         */
        @JvmStatic
        var cm_isSelectingDestination = false
            private set

        /**
         * # Selects a destination for a unit in UCM.
         *
         *
         */
        @JvmStatic
        fun cm_destinationSelect(){
            if (cm_isSelectingDestination)
                unit_setDestination()

            cm_isSelectingDestination = !cm_isSelectingDestination
        }

        @JvmStatic
        fun cm_cancelDestinationSelect(){ cm_isSelectingDestination = false; }

        //========================================================================
        //#endregion ControlMode
        //#region breakdown
        //========================================================================


        /**
         * # Unloads game, disposing object, clearing memory, and generally breaking down the hypervisor.
         * After calling, Hypervisor is not available until a new game is loaded.
         */
        @JvmStatic
        fun dispose() {
            inGame = false
            StageWindow.unPostAll()
            gameRenderer?.dispose()
            gameRenderer = null
            GameData.clear()

            // FIXME: 28/07/2021 Possible for this to not take effect if the user enters any other screen within a second of getting to the main menu.
            Utility.DispatchDaemonThread("KeyBindingDisposer"){
                while (client!!.screen !is MainMenu) {
                    sleep(1000)
                }
                KeyBinder.destroyGameBinds()
            }
        }

        /**
         * # Ends game, disposes, returns to main menu.
         * Can't be called from a UnitAction. See [turn_asyncTask].
         */
        @JvmStatic
        fun EndGame() {
            cm_exit()
            dispose()
            if (!DEBUG_MODE) Spotify.pause()
            client!!.fadeScreen(MainMenu())
        }

        /**
         * # Creates a size 0 settlement at [x],[y] in style matching the player's [civType]
         * Does so using data from provided unit. Assumes unit is a settler.
         * Unit is disbanded after.
         */
        fun settle(it : Unit) {
            settle(it.isoVec.cpy(), GameData.player!!.civType)

            unit_select(it)
            unit_disband()
        }

        /**
         * # Creates a size 0 settlement at [x],[y] with the provided style.
         */
        fun settle(pos: Vector3, type : CityTypes) {
            GameData.player!!.cities.add(City(pos, type))
        }



        //========================================================================
    //#endregion breakdown
    //#region misc
    //========================================================================


    }
}