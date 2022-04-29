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

package com.shinkson47.SplashX6.game

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.audio.Music
import com.badlogic.gdx.graphics.g2d.TextureAtlas
import com.badlogic.gdx.math.Vector3
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable
import com.badlogic.gdx.utils.Array
import com.shinkson47.SplashX6.Client.Companion.DEBUG_MODE
import com.shinkson47.SplashX6.Client.Companion.client
import com.shinkson47.SplashX6.audio.AudioController
import com.shinkson47.SplashX6.audio.Spotify
import com.shinkson47.SplashX6.game.cities.Settlement
import com.shinkson47.SplashX6.game.units.Unit
import com.shinkson47.SplashX6.game.units.UnitClass
import com.shinkson47.SplashX6.game.world.WorldTerrain
import com.shinkson47.SplashX6.game.world.WorldTerrain.*
import com.shinkson47.SplashX6.game.world.WorldTerrain.Companion.TILE_HALF_HEIGHT
import com.shinkson47.SplashX6.game.world.WorldTerrain.Companion.TILE_HALF_WIDTH
import com.shinkson47.SplashX6.game.world.WorldTerrain.Companion.cartesianToIso
import com.shinkson47.SplashX6.input.KeyBinder
import com.shinkson47.SplashX6.input.mouse.MouseHandler
import com.shinkson47.SplashX6.network.Packet
import com.shinkson47.SplashX6.network.PacketType
import com.shinkson47.SplashX6.network.Server
import com.shinkson47.SplashX6.rendering.screens.MainMenu
import com.shinkson47.SplashX6.rendering.screens.TextScreen
import com.shinkson47.SplashX6.rendering.screens.Warroom
import com.shinkson47.SplashX6.rendering.screens.WorldCreation
import com.shinkson47.SplashX6.rendering.screens.game.GameScreen
import com.shinkson47.SplashX6.rendering.ui.StageWindow
import com.shinkson47.SplashX6.utility.*
import com.shinkson47.SplashX6.utility.APICondition.Companion.MSG_TRIED_EXCEPT
import com.shinkson47.SplashX6.utility.APICondition.Companion.REQ_IN_GAME
import com.shinkson47.SplashX6.utility.APICondition.Companion.REQ_NOT_IN_GAME
import com.shinkson47.SplashX6.utility.APICondition.Companion.REQ_UNIT_SELECTED
import com.shinkson47.SplashX6.utility.APICondition.Companion.THROW
import com.shinkson47.SplashX6.utility.APICondition.Companion.WARN
import com.shinkson47.SplashX6.utility.APICondition.Companion.invalidCall
import com.shinkson47.SplashX6.utility.APICondition.Companion.validateCall
import com.shinkson47.SplashX6.utility.Assets.AUDIO_MUSIC_GAME_OVER
import com.shinkson47.SplashX6.utility.Assets.TEXTURE_ART
import com.shinkson47.SplashX6.utility.Utility.message
import com.shinkson47.SplashX6.utility.Utility.warnDev
import com.shinkson47.SplashX6.utility.debug.Debug
import java.io.*
import java.lang.Thread.sleep

/**
 * # Centralised control functions and API for the game.
 * Manages and handles interactions with the current game from the client.
 *
 * @author [Jordan T. Gray](https://www.shinkson47.in) on 16/04/2021
 * @version 1
 * @since PRE-ALPHA 0.0.1
 */
object Hypervisor {
    //========================================================================
    //#region fields
    //========================================================================

    /**
     * The screen being used to display the game
     */
    @JvmStatic
    var gameRenderer: GameScreen? = null
    private set

    /**
     * Creates a brand new [GameScreen] in [gameRenderer],
     * and displays it on the client
     */
    @Deprecated("Debug use only.")
    fun newGameRenderer() {
        gameRenderer = GameScreen()
        client.fadeScreen(gameRenderer!!)
        System.gc()
    }

    /**
     * True if the hypervisor considers a game to be active.
     *
     * Whilst false, many API calls will be rejected.
     */
    @JvmStatic
    var inGame: Boolean = false
    private set

    /**
     * Runnables to be performed on [turn_end].
     * Removed after being performed once.
     */
    private val TURN_ASYNC_TASKS: ArrayList<TurnHook> = ArrayList()

    /**
     * Runnables to be performed on [turn_end].
     * Kept until removed, activated every turn.
     */
    private val TURN_HOOKS: ArrayList<TurnHook> = ArrayList()


    //========================================================================
    //#endregion fields
    //#region construction
    //========================================================================

    /**
     * Attempts to load a game over the network.
     */
    fun ConnectGame() = client.fadeScreen(WorldCreation(isConnecting = true))

    /**
     * Initiates the creation of a new game, but does not actually create it.
     *
     * This method switches to the world creation window, which will callback
     * when the user has configured the game and has rendered the loading screen.
     * The game will then be generated in [GameHypervisor#doNewGameCallback()],
     * during which the programme will be un-responsive and unable to render.
     *
     * if [inGame], will [endGame] first.
     */
    @JvmStatic
    fun NewGame() {
        assertEndGame()
        client.fadeScreen(WorldCreation())
    }

    /**
     * Initiates the loading of a game
     *
     * By switching to world creation with [WorldCreation.isLoading] = true.
     *
     * if [inGame], will [endGame] first.
     */
    fun LoadGame() {
        assertEndGame()
        client.fadeScreen(WorldCreation(isLoading = true))
    }

    /**
     * Creates or loads a game.
     * This is the main game creation routine that is ran under the loading screen.
     *
     * called by the world creation screen after it has rendered the "creating world" message to the user.
     */
    @JvmStatic
    fun doNewGameCallback() {
        doGameLoadCallback()
    }

    /**
     * Activates game creation after loading
     * This is the main game creation routine that is ran under the loading screen.
     *
     * called by the world creation screen after it has rendered the "creating world" message to the user.
     */ // TODO this still creates a new gd on load???
    fun doGameLoadCallback() {
        doNewGamePRE()
        inGame = true
        doNewGamePOST()
    }

    /**
     * Game creation sub-routine
     *
     * This is ran before we are considered to be [inGame].
     * Contains steps which do not require a game to be loaded,
     * and are required by many other loading steps.
     */
    private fun doNewGamePRE() {
        // create game data. Must be before game screen is created.
        // Local player is also created here.
        GameData.new()

        // Create a new game screen stored locally. It will be shown to the user in the FINAL.
        // For now, loading screen is still being displayed. This is just so we can access the camera and whatnot.
        gameRenderer = GameScreen()

        GameEndConditionChecker.init()
    }

    /**
     * Game creation sub-routine
     *
     * Ran after we are considered to be [inGame].
     * Contains calls which requires game data or game renderer.
     */
    private fun doNewGamePOST() {
        for (i in 1..GameData.pref_civCount)
            nation_new_random()

        unit_select(0)    // Select the first unit created at world gen. Should be a settler.
        unit_view()             // Focus the camera on that unit.
        camera_skipMovement()   // Skip the camera travelling from 0,0 to the unit.
        // without that, the game always starts with the camera flying across the map.

        Spotify.create(autoOnly = true) // Try to connect to the api at startup. Don't prompt.
    }

    /**
     * # Game creation sub-routine
     * Final touches applied after game has been created
     */
    fun doNewGameFINAL() {
        // TODO could this be PRE or INIT?
        gameRenderer!!.createUI() // Populate the game screen with GUI. can't be done whilst gr is null.

        update_lockout()

        // TODO This couldn't be done before a world is created, but is only temporary.
        // STOPSHIP : 17/04/2021 this is dumb and shouldn't stay
        Debug.create()

        KeyBinder.createGameBinds()
        MouseHandler.configureGameInput(gameRenderer!!.stage)

        // TODO change this to be spotify first. If listening to spotify, pause game music.
        if (!DEBUG_MODE) Spotify.pause()      // If possible, stop spotify.
        AudioController.playPlaylist(Assets.DEFAULT_PLAYLIST)

        if (Server.alive)
            Server.sendToAllClients(Packet(PacketType.Start, GameData))

        switchToGameScreen()
    }

    /**
     * Displays [gameRenderer] on the [client].
     *
     * @return the [gameRenderer]
     */
    fun switchToGameScreen() =
        gameRenderer?.apply { client.fadeScreen(this) }


    //========================================================================
    //#endregion construction
    //#region saving API
    //========================================================================

    /**
     * Loads the last file saved.
     */
    @JvmStatic
    fun quickload() {
        validateCall(REQ_IN_GAME, THROW("Can only quickload in game. This should not be possible."))
        TODO()
    }

    /**
     * Loads a .X6 game file.
     *
     * Populates GameData from a serialized file, then loads the game ui.
     */
    @JvmStatic
    fun load(f: File) {
        validateCall(REQ_NOT_IN_GAME, THROW(MSG_TRIED_EXCEPT("load a game", "a game is already loaded")))
        load(ObjectInputStream(FileInputStream(f)).readObject() as _GameData)
    }

    /**
     * Loads a .X6 game file.
     *
     * Populates GameData from a serialized file, then loads the game ui.
     */
    @JvmStatic
    fun load(gd: _GameData) {
//        validateCall(REQ_NOT_IN_GAME, THROW(MSG_TRIED_EXCEPT("load a game", "a game is already loaded")))
//
        doGameLoadCallback()
        update(gd)
        doNewGameFINAL()
    }

    /**
     * We are already in-game, and are changing the game data.
     *
     * GameData is replaced and de-serialized.
     *
     * A new renderer is created inside the [gameRenderer] to show the new world.
     */
    @JvmStatic
    fun update(newData: _GameData) {
        if (!inGame) return
        GameData = newData
        GameData.deserialize()

        gameRenderer!!.newRenderer()
        update_lockout()

        System.gc()
    }

    fun update_lockout() {
        gameRenderer!!.drawStage = GameData.isLocalPlayersTurn().also {
            message("It is now ${if (!it) "${GameData.currentPlayer().userName}'s" else "your"} turn.")
        }
    }


    /**
     * Saves current game in last file saved to.
     */
    @JvmStatic
    fun quicksave() {
        if (
            invalidCall(REQ_IN_GAME, THROW(MSG_TRIED_EXCEPT("quicksave a game", "no game is loaded")))
        ) return
        TODO()
    }

    /**
     * Saves the current game to a .X6 game file.
     *
     * Serializes [GameData] to f.
     * @param f The file to save to.
     */
    @JvmStatic
    fun save(f: File) {
        validateCall(REQ_IN_GAME, THROW(MSG_TRIED_EXCEPT("save a game", "no game is loaded")))
        ObjectOutputStream(FileOutputStream(f)).writeObject(GameData)
    }

    //========================================================================
    //#endregion saving
    //#region nations
    //========================================================================

    /**
     * Creates a new random ai controlled nation.
     *
     * @return The [Nation] created
     */
    fun nation_new_random(): Nation = nation_new(Utility.random(NationType.values()), ai = true)

    /**
     * Creates a new nation in the current game.
     *
     * The nation starts with one settler.
     *
     * @param civType The type of nation. Determines what sprites to use to represent the
     *                settlements.
     * @param ai Determines if the nation is controlled by statemachine AI. False by default.
     * @param userName The name of the user
     * @return The [Nation] created.
     */
    fun nation_new(civType: NationType, ai: Boolean = false, userName: String = ""): Nation {
        if (!ai && userName.isEmpty())
            warnDev("A nation was created with no name!")

        requireNotNull(GameData.world, { " Tried to create a new civilisation with no world. " })

        return Nation(civType, ai,
                if (ai)
                    "AI [${GameData.nations.filter { it.ai }.size + 1}]"
                else userName
            ).apply {
            GameData.nations.add(this)
            GameData.world!!.randomNavigableTile().let {
                spawn(it.x.toInt(), it.y.toInt(), UnitClass.settler, this)
            }
        }
    }

    /**
     * Eradicates the existence of a nation.
     *
     * Breaks down the relationships involved with it, and removes it from
     * [GameData.nations]
     *
     * > This does not remove the host from [GameData.player], as it would cause too many null safety issues.
     *
     * @param nation Nation to delete.
     * @see Nation.dissolve
     */
    fun nation_dissolve(nation: Nation) {
        with(nation) {
            dissolve()
            GameData.nations.remove(this)
        }
        System.gc()
    }


    //========================================================================
    //#endregion nations
    //#region units
    //========================================================================

    /**
     *  Spawns a [unit] with the sprite of [spriteName] on iso co-oord [x],[y]
     * Cannot be used in a UnitAction; Modifies GameData.units. See [turn_asyncTask].
     */
    @JvmStatic
    fun spawn(pos: Vector3, spriteName: UnitClass) =
        spawn(pos.x.toInt(), pos.y.toInt(), spriteName)

    /**
     * Spawns a [unit] with the sprite of [spriteName] on iso co-oord [x],[y]
     * Cannot be used in a UnitAction; Modifies GameData.units. See [turn_asyncTask].
     */
    @JvmStatic
    fun spawn(x: Int, y: Int, spriteName: UnitClass, nation: Nation = GameData.localPlayer!!): Unit {
        requireNotNull(GameData.world, { " Tried to spawn with no world. " })
        require(GameData.nations.contains(nation)) { " Tried to spawn a unit into a nation which does not exist in this game. " }
        return Unit(spriteName, x, y).apply { nation.addUnit(this) }
    }

    /**
     * Selects a unit to be of focus for manipulation in other calls.
     *
     * Camera is moved to look at the unit after selection.
     *
     * @param UnitIndex Index of the unit within the nation.
     * @param nation The nation owning the unit to select.
     * @return The selected unit.
     */
    @JvmStatic
    fun unit_select(UnitIndex: Int, nation: Nation = GameData.localPlayer!!) = unit_select(nation.units.get(UnitIndex))

    /**
     * Selects a unit to be of focus for manipulation in other calls.
     *
     * Does not validate that the unit exists within the [GameData].
     *
     * Camera is moved to look at the unit after selection.
     *
     * @param unit The unit to select.
     * @return The selected unit.
     */
    @JvmStatic
    fun unit_select(unit: Unit): Unit? {
        validateCall(REQ_IN_GAME, THROW(MSG_TRIED_EXCEPT("Select a unit", "no game is loaded")))

        GameData.selectedUnit = unit
        unit_view()
        return unit_selected()
    }

    /**
     * Sets the destination of the selected unit to the cursor.
     *
     * Selecting the destination of a unit will automatically invoke
     * it's pathfinding, and switch the selected unit to [UnitActionDictionary.TRAVEL]
     */
    @JvmStatic
    fun unit_setDestination() {
        if (invalidCall(REQ_UNIT_SELECTED, WARN("Can't set a unit's destination if no unit selected!"))) return

        with(GameData.selectedUnit!!) {
            cm_selectedTile().apply {
                if (!setDestination(x, y))
                    AudioController.error()
            }

            unit_selectAction("Travel to destination")
        }
    }

    /**
     * Focusses the camera on the selected units destination.
     */
    @JvmStatic
    fun unit_viewDestination() {
        if (invalidCall(REQ_UNIT_SELECTED, WARN("Can't view a unit's destination if no unit selected!"))) return
        camera_moveToTile(GameData.selectedUnit!!.destination!!.x, GameData.selectedUnit!!.destination!!.y)
    }


    /**
     * focuesses the camera on the selected unit
     */
    @JvmStatic
    fun unit_view() {
        if (invalidCall(REQ_UNIT_SELECTED, WARN("Can't view a unit if no unit selected!"))) return
        camera_focusOn(GameData.selectedUnit!!.x + TILE_HALF_WIDTH, GameData.selectedUnit!!.y + TILE_HALF_HEIGHT)
    }

    /**
     * Destroys the selected unit
     *
     * TODO Giving the user some resources in return.
     */
    @JvmStatic
    fun unit_disband() {
        if (invalidCall(REQ_UNIT_SELECTED, WARN("Can't disband a unit if no unit selected!"))) return
        unit_disband(unit_selected()!!)
    }

    /**
     * Destroys a unit.
     *
     * @param unit Unit
     */
    @JvmStatic
    fun unit_disband(unit: Unit) {
        if (GameData.selectedUnit == unit) GameData.selectedUnit = null
        unit.ownedBy()?.units?.remove(unit)
        unit.dispose()
    }



    /**
     * Determines an array of units that are within a certain range of the selected unit.
     *
     * @param unit The unit of focus
     * @param range The range of proximity to the unit. (inclusive)
     * @return An array of units that are within range of [unit]
     */
    fun unit_proximity(unit: Unit = unit_selected()!!): Array<Unit> {
        return Array<Unit>().apply {
            GameData.forEveryUnit {
                if (it == unit) return@forEveryUnit
                if (it.isoVec.dst(unit.isoVec) <= unit.viewDistance)
                    this.add(it)
            }
        }
    }

    /**
     * @return The [Unit] selected by [unit_select] for api operations.
     */
    @JvmStatic
    fun unit_selected(): Unit? = GameData.selectedUnit

    /**
     * Selects the action that the [unit_selected] will perform on the next turn/
     *
     * @param displayName Display name of the action.
     */
    @JvmStatic
    fun unit_selectAction(displayName: String) {
        if (invalidCall(REQ_UNIT_SELECTED, WARN("Can't mutate a unit if no unit selected!"))) return
        with(GameData.selectedUnit!!) {
            onTurnAction = availableActions.find { it.displayName == displayName }
        }
    }

    /**
     * Determines if a unit may enter the given tile.
     *
     * @param unit Unit
     * @param x X
     * @param y Y
     * @return
     * @Deprecated not used. Boundary detection is performed by the world generation layer.
     */
    @JvmStatic
    fun unit_canEnter(unit: Unit, x: Int, y: Int): Boolean = GameData.world!!.getTile(x, y)!!.isLand


    //========================================================================
    //#endregion units
    //#region game control
    //========================================================================

    /**
     * True whilst the control is withdrawn from the player
     * to perform a cinematic turn end over many frames.
     */
    var isCinematingLocalTurn = false

    /**
     * Ends this turn, performing actions on units and invoking opposing players to
     * take thier turn.
     *
     * > N.B. : UnitActions cannot modify some game data directly, since it will cause a concurrent modification exception.
     * Instead, post a runnable to []
     */
    @JvmStatic
    fun turn_end() {
        if (isCinematingLocalTurn) return

        if (GameData.isLocalPlayersTurn())
            turn_end_cinemate()
        else GameData.currentPlayer().apply {
            if (ai) {
                doOnTurn()
                turn_end_over()
            }
        }


    }

    private fun turn_end_over() {
        Server.updateAllClients()

        doEndTurn_Async()
        doEndTurn_Hook()
        GameData.nextPlayer()
        update_lockout()
    }

    val cin_units = ArrayList<Unit>()
    val cin_settlements = ArrayList<Settlement>()
    var lastUnit: Unit? = null
    var lastSettlement: Settlement? = null
    var stepDelay = 0f
    const val CIN_STEP_DELAY = 0.1f

    private fun turn_end_cinemate() {
        isCinematingLocalTurn = true
        gameRenderer!!.drawStage = false
        cin_units.clear()
        cin_units.addAll(GameData.currentPlayer().units)
        cin_settlements.clear()
        cin_settlements.addAll(GameData.currentPlayer().settlements)
        lastUnit = null
        lastSettlement = null
        stepDelay = 0f
        turn_end_over()
    }

    fun turn_end_cinemate_update() {
    // TODO timeout test for safety?
        if (camera_distance() > 1f)
            return

        doEndTurn_Async()

        if (stepDelay <= 0f)
            stepDelay = CIN_STEP_DELAY
        else {
            stepDelay -= Gdx.graphics.deltaTime
            return
        }

        lastUnit?.let {
            it.doTurn()
            lastUnit = null
            return
        }

        lastSettlement?.let {
            lastSettlement = null
            return
        }

        if (cin_units.isNotEmpty()) {
            // skip units with nothing to do. FIXME doesn't work lol
            while (cin_units.isNotEmpty() && cin_units.first()?.onTurnAction == null)
                cin_units.removeAt(0)

            if (cin_units.isEmpty()) return

            lastUnit = cin_units.first()
            cin_units.removeAt(0)
            camera_focusOn(lastUnit!!)
            return
        }

        if (cin_settlements.isNotEmpty()) {
            lastSettlement = cin_settlements.first()
            cin_settlements.removeAt(0)
            camera_focusOn(lastSettlement!!)
            return
        }

        isCinematingLocalTurn = false
        gameRenderer!!.drawStage = true
        unit_selected()?.let { camera_focusOn(it) }
    }

    /**
     * Stores a task to be run at the end of the next [turn_end].
     * Also used as a work-around for not being able to modify some game data from within
     * actions run on [turn_end]
     */
    @JvmStatic
    fun turn_asyncTask(runnable: TurnHook) = TURN_ASYNC_TASKS.add(runnable)

    @JvmStatic
    @Deprecated("Runnables have been replaced by the [TurnHook] alias.")
    fun turn_asyncTask(runnable: Runnable) = turn_asyncTask(object : TurnHook {
        override fun onTurn() {
            runnable.run()
        }
    })

    /**
     * Stores a runnable that will be invoked after every turn.
     */
    @JvmStatic
    fun turn_hook(runnable: TurnHook) = TURN_HOOKS.add(runnable)


    @JvmStatic
    @Deprecated("Runnables have been replaced by the [TurnHook] alias.")
    fun turn_hook(runnable: Runnable) = turn_hook(object : TurnHook {
        override fun onTurn() {
            runnable.run()
        }
    })

    /**
     * Removes a [turn_hook]
     */
    @JvmStatic
    fun turn_unhook(runnable: TurnHook) = TURN_HOOKS.remove(runnable)

    @JvmStatic
    @Deprecated("Runnables have been replaced by the [TurnHook] alias.")
    fun turn_unhook(runnable: Runnable) = turn_unhook(runnable as TurnHook)


    /**
     * Invokes player's units to perform thier turn action.
     */
    private fun doEndTurn_Units() {
        // META : If you get a concurrent modification exception here, then
        // an onTurnAction has modified the GameData units list.
        // TODO this does not support other nations.
        // TODO also wtf how does the ai still get invoked?!?!
        GameData.localPlayer!!.units.forEach { it.doTurn() }
    }

    /**
     * Performs turn hooks on [turn_end]
     */
    private fun doEndTurn_Async() {
        TURN_ASYNC_TASKS.forEach { impldoEndTurn_Async(it)  }
        TURN_ASYNC_TASKS.clear()
    }

    private fun doEndTurn_Hook() {
        TURN_HOOKS.forEach { impldoEndTurn_Async(it) }
    }

    /**
     * implementation co-routune for [doEndTurn_Async] which
     * posts turn hook tasks to the main gdx thread.
     */
    private fun impldoEndTurn_Async(r: Runnable) {
        Gdx.app.postRunnable { // FIXME don't post this, but prevent concurrent modification.
            try {
                r.run()
            } catch (e: Exception) {
                Utility.warnDev("A turn hook failed! \n${e.message}", e = e)
                //Utility.warnDev("$")
            }
        }
    }



    //========================================================================
    //#endregion game control
    //#region settlement
    //========================================================================

    /**
     * # Creates a size 0 settlement at [x],[y] in style matching the player's [civType]
     * Does so using data from provided unit. Assumes unit is a settler.
     * Unit is disbanded after.
     */
    fun settle(it: Unit) {
        it.ownedBy()!!.settle(it.isoVec.cpy())

        unit_disband(it)
    }

    /**
     * # Creates a size 0 settlement at [x],[y] with the provided style.
     */
    fun settle(pos: Vector3) {
        GameData.localPlayer!!.settle(pos)
    }


    //========================================================================
    //#endregion settlement
    //#region camera control
    //========================================================================


    /**
     * # Focusses the camera on the provided unit.
     */
    @JvmStatic
    fun camera_focusOn(city: Settlement) = camera_focusOn(city.cartesianPosition())

    /**
     * Get the distance between the camera's desired and present positions.
     */
    fun camera_distance() = gameRenderer!!.cam.desiredPosition.let{ it.desired.dst(it.present) }

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
            gameRenderer!!.managementScreen.desiredCameraPosition.desired.set(x, y, 0f)
        else
            gameRenderer!!.cam.goTo(x, y)
    }

    /**
     * # The cartesian location in the world that the camera is looking at.
     */
    @JvmStatic
    fun camera_focusingOn(): Vector3 {
        with(gameRenderer!!.cam) {
            val v: Vector3 = desiredPosition.get().cpy()
            v.y = lookingAtY().toFloat()
            return v
        }
    }

    /**
     * # Returns the isometric version of [camera_focusingOn]
     */
    @JvmStatic
    fun camera_focusingOnTile(): Vector3 {
        val v = camera_focusingOn()
        return cartesianToIso(v.x.toInt(), v.y.toInt())
    }


    @JvmStatic
    fun camera_moveToTile(x: Int, y: Int) {
        with(WorldTerrain.isoToCartesian(x, y)) {
            camera_focusOn(this.x, this.y)
        }
    }

    @JvmStatic
    fun camera_moveToTile(x: Float, y: Float) =
        Hypervisor.camera_moveToTile(x.toInt(), y.toInt())

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
    fun mouse_focusOnTile(): Vector3 {
        with(gameRenderer!!.cam) {
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
    fun cm_enter(): Boolean {
        if (cm_active) return false
        //cm_showStateCaps(true)
        cm_active = true
        client.fadeScreen(gameRenderer!!.managementScreen)
        cm_cancelDestinationSelect()
        return true
    }

    /**
     * # Exits unit control mode
     */
    @JvmStatic
    fun cm_exit() {
        if (invalidCall(REQ_IN_GAME, THROW("cm not accessable whilst not in game."))) return

        //cm_showStateCaps(false)
        cm_active = false
        client.fadeScreen(gameRenderer!!)
    }

    /**
     * Toggles between [cm_exit] and [cm_enter]
     */
    @JvmStatic
    fun cm_toggle() {
        if (cm_active) cm_exit() else cm_enter()
        unit_view()
    }

    //private fun cm_showStateCaps(value : Boolean) = Toolkit.getDefaultToolkit().setLockingKeyState(KeyEvent.VK_CAPS_LOCK, value)

    /**
     * # Returns the tile under the mouse cursor in control mode.
     */
    @JvmStatic
    fun cm_selectedTile(): Vector3 {
        //validateCall(REQ_UNIT_CONTROL_MODE) { cm_enter(); }

        return if (client.currentScreen is Warroom) {
            // Get point on world that mouse is pointing to.
            val unprojected = gameRenderer!!.managementScreen.camera.unproject(Vector3(Gdx.input.x.toFloat(), Gdx.input.y.toFloat(), 0f))

            // Find what tile that is and return it.
            cartesianToIso(unprojected.x.toInt(), unprojected.y.toInt())
        } else
            camera_focusingOnTile()
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
    fun cm_destinationSelect() {
        if (invalidCall(REQ_UNIT_SELECTED, WARN("Can't move a unit if no unit is selected!"))) return

        if (cm_isSelectingDestination)
            unit_setDestination()

        cm_isSelectingDestination = !cm_isSelectingDestination
    }

    @JvmStatic
    fun cm_cancelDestinationSelect() {
        cm_isSelectingDestination = false; }

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
        Server.shutdown()
        StageWindow.unPostAll()
        gameRenderer?.dispose()
        gameRenderer = null
        GameData.clear()
        TURN_HOOKS.clear()
        TURN_ASYNC_TASKS.clear()
        isCinematingLocalTurn = false

        // FIXME: 28/07/2021 Possible for this to not take effect if the user enters any other screen within a second of getting to the main menu.
        Utility.dispatchDaemonThread("KeyBindingDisposer") {
            while (client.screen !is MainMenu) {
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
    fun endGame() {
        cm_exit()
        dispose()
        if (!DEBUG_MODE) Spotify.pause()

        inGame = false
        client.fadeScreen(MainMenu())
    }

    /**
     * calls [endGame] only if we're in a game, as indicated by
     * [inGame]
     */
    fun assertEndGame() {
        if (inGame) endGame()
    }


    //========================================================================
    //#endregion breakdown
    //#region misc
    //========================================================================

}

/**
 * On [turn_end], checks for end game conditions.
 */
object GameEndConditionChecker : TurnHook {

    /**
     * Adds the checker to the turn hook
     * on a new game.
     */
    fun init() {
        Hypervisor.turn_hook(this)
    }

    /**
     * An async list of nations that won or lost on the last turn.
     * prevents concurrent modification by delayling dissolving.
     */
    private val dissolveList = ArrayList<Nation>()

    override fun onTurn() {

        // Check all nations to see if they have won or lost.
        GameData.nations.forEach { nation ->
            checkGameOver(nation)?.let {
                if (!it.second) {
                    // This nation has lost.
                    dissolveList.add(nation)
                    message("The nation of ${nation.nationType} has fallen!", isCrutial = true, persistant = true)

                    if (nation == GameData.localPlayer!!)
                        onLocalGameOver(it)
                } else {
                    // This nation has won the game.
                }
            }
        }


        // dissolve any nations that have failed
        dissolveList.forEach {
            Hypervisor.nation_dissolve(it)
        }
        dissolveList.clear()
    }

    /**
     * Notifies the local player that they have lost.
     */
    private fun onLocalGameOver(it: Pair<String, Boolean>) {
        client.fadeScreen(
            TextScreen(
                text = "Game Over! \n\n The nation of ${GameData.localPlayer!!.nationType} has fallen. \n(${it.first}) \n\n Press ESC to observe others or end the game.",
                background = TextureRegionDrawable(Assets.get<TextureAtlas>(TEXTURE_ART).findRegion(if (it.second) "img3" else "img6")),
                onESC = Hypervisor.gameRenderer!!
            )
        )
        AudioController.play(Assets.get<Music>(AUDIO_MUSIC_GAME_OVER))
    }





    /**
     * Checks to see if any conditions have been met to end the game for a given nation.
     *
     * @return Null if no game over conditions are met. Otherwise, A message as to why the game ended and a boolean representing win or loss. (true = win)
     */
    private fun checkGameOver(it: Nation): Pair<String, Boolean>? {
        with(it) {
            if (units.isEmpty() && settlements.isEmpty())
                return Pair("No units or settlements remain", false)

        }

        return null
    }
}