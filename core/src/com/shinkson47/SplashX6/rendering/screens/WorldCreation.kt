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

package com.shinkson47.SplashX6.rendering.screens

import com.shinkson47.SplashX6.rendering.ScalingScreenAdapter
import com.shinkson47.SplashX6.utility.Assets
import com.badlogic.gdx.Gdx
import com.badlogic.gdx.Input
import com.badlogic.gdx.math.MathUtils
import com.badlogic.gdx.scenes.scene2d.ui.*
import com.badlogic.gdx.utils.Align
import com.gdx.musicevents.tool.file.FileChooser
import com.shinkson47.SplashX6.Client
import com.shinkson47.SplashX6.ai.StateMachine
import com.shinkson47.SplashX6.game.GameData
import com.shinkson47.SplashX6.game.Hypervisor
import com.shinkson47.SplashX6.game.Hypervisor.doNewGameCallback
import com.shinkson47.SplashX6.game.Hypervisor.load
import com.shinkson47.SplashX6.game.Nation
import com.shinkson47.SplashX6.game.NationType
import com.shinkson47.SplashX6.game.GameHypervisor.Companion.load
import com.shinkson47.SplashX6.game.cities.CityType
import com.shinkson47.SplashX6.game.world.generation.GenerationCompanion
import com.shinkson47.SplashX6.network.NetworkClient
import com.shinkson47.SplashX6.network.NetworkClient.connect
import com.shinkson47.SplashX6.network.Server
import com.shinkson47.SplashX6.rendering.StageWindow
import com.shinkson47.SplashX6.network.Server.alive
import com.shinkson47.SplashX6.network.Server.boot
import com.shinkson47.SplashX6.rendering.ui.ScalingScreenAdapter
import com.shinkson47.SplashX6.rendering.ui.StageWindow
import com.shinkson47.SplashX6.rendering.windows.TerrainGenerationEditor
import com.shinkson47.SplashX6.utility.Assets
import com.shinkson47.SplashX6.utility.Assets.LANG_TIPS
import com.shinkson47.SplashX6.utility.Assets.REF_SKIN_W95
import com.shinkson47.SplashX6.utility.Assets.SKIN
import com.shinkson47.SplashX6.utility.UtilityK.getIP
import com.shinkson47.SplashX6.utility.Utility.getIP
import java.io.InvalidClassException
import java.net.ConnectException

/**
 * # Provides the user a place to configure the game and world generation
 *
 *
 *
 * @author [Jordan T. Gray on 16/04/2021](https://www.shinkson47.in)
 * @version 2
 * @since v1
 */
class WorldCreation(
    val isConnecting: Boolean = false,
    val isLoading: Boolean = false
) : ScalingScreenAdapter() {

    //==========================================
    //#region fields
    //==========================================

    /**
     * # A label that will display game tips whilst loading
     */
    private lateinit var tipLabel: Label

    /**
     * Used to ensure that the loading screen has been rendered
     * before starting the loading. Ensures there's something
     * displayed.
     */
    private lateinit var loadingContainer: Table
    private var loadingScreenRendered = false

    /**
     * True when the user has clicked 'New Game'.
     */
    private var userFinished = false

    private val gameCreationWindow = W_GameCreation()

    private val chooser = FileChooser.createPickDialog("Choose save file", REF_SKIN_W95, Gdx.files.external("/"))

    init {
        chooser.setResultListener { success, result ->
            if (success && result != null) {
                stage.actors.removeValue(chooser, true)
                controller.switchState(2)
                true
            } else {
                Hypervisor.endGame()
                false
            }

        }
        chooser.setOkButtonText("Load")
        chooser.setFilter { file ->
            file.path.matches(Regex("(.*(?:X6))")) || (file.isDirectory && !file.name.startsWith(
                "."
            ))
        }
        chooser.isResizable = true
    }

    //==========================================
    //#endregion actors
    //==========================================

    val controller = WorldCreationScreenController()

    //==========================================
    //#endregion fields
    //#region operations
    //==========================================

    /**
     * # Renders the screen
     */
    override fun render(delta: Float) {
        controller.run()
        with(stage) {
            batch.begin()
            REF_SKIN_W95.getDrawable("tiledtex").draw(batch, 0f, 0f, width, height)
            batch.end()

        // Second part of this test ensures that we outwait any transision screen before the callback.
        //if (hasRendered && Client.client!!.screen === this) doNewGameCallback()

        if (userFinished && Client.client!!.currentScreen == this)
            if (!inGame && loadingScreenRendered)
                doNewGameCallback()
            else {
                constructLoadingGUI()
                loadingScreenRendered = true
            }
        else if (isConnecting && !loadingScreenRendered) {
            renderConnecting()
            loadingScreenRendered = true
        }

        stage.batch.begin()
        SKIN.getDrawable("tiledtex").draw(stage.batch, 0f, 0f, width, height)
        stage.batch.end()

        stage.act()
        stage.draw()

        // For debug, stay on the loading screen if any key is pressed.
        //if (!Gdx.input.isKeyPressed(Input.Keys.ANY_KEY)) hasRendered = true

        if (Gdx.input.isKeyPressed(Input.Keys.ESCAPE))
            cancel()

        super.render(delta)
    }

    /**
     * # Displays another random tip from [Assets.TIPS] in [tipLabel].
     */
    private fun nextTip() = Assets.get<ArrayList<String>>(LANG_TIPS).let { tipLabel.setText(it[MathUtils.random(it.size - 1)]) }

    fun constructGeneratingText() = constructText("specific.gamecreation.generating")
    fun constructDeserializingText() = constructText("!Loading world. Please wait.")
    fun constructConnectingText() = constructText("!Waiting for host")
    private fun constructText(key: String) {
        with(stage) {
            this.actors.clear()
            loadingContainer = Table()
            this.addActor(loadingContainer)
        }

        with(loadingContainer) {
            children.clear()

            setFillParent(true)

            StageWindow
                .label(key, this)
                .padBottom(50f)
                .row()

            tipLabel = Label("", REF_SKIN_W95)
            nextTip()
            add(tipLabel)
        }

        //table.add(Label("WIDTH : " + WorldTerrain.DEFAULT_WIDTH, Assets.SKIN)).left().row()
        //table.add(Label("HEIGHT : " + WorldTerrain.DEFAULT_HEIGHT, Assets.SKIN)).left().row()
        //table.add(Label("MAX FOLIAGE SPAWNS : " + WorldTerrain.FOLIAGE_QUANTITY_MAX, Assets.SKIN)).left().padBottom(50f).row()
        nextTip()
        table.add(tipLabel).row()

        stage.clear()
        stage.addActor(table)
    }

    /**
     * # Cancels the world generation, and returns to the main menu
     */
    fun cancel() {
        Server.shutdown()
        Client.client!!.fadeScreen(MainMenu())
    }

    //==========================================
    //#endregion operations
    //==========================================

    init {
        if (Client.DEBUG_MODE) {
            userFinished = true
        } else {

    fun addw(w: Window) {
        stage.addActor(w)

        if (w is StageWindow)
            w.centerStage()
    }

    inner class W_GameCreation : StageWindow() {
        init {
            isResizable = false
            isMovable = false


            // TODO Civ class
            //      Opponents
            //      Preset world types
            //      World size
            //      Advanced terrain
            addButton("specific.gamecreation.terrainSettings", true, true) { stage.addActor(TerrainGenerationEditor()) }

            label("!Seed")


            expandfill(add(TextField("seed", REF_SKIN_W95))).apply {
                addListener { GenerationCompanion.SEED = actor.text.hashCode(); true }
            }


            hsep()

            row()

            label("specific.gamecreation.civtype")

            val x = SelectBox<NationType>(REF_SKIN_W95)
            x.setItems(*NationType.values())
            x.selected = x.items.first()
            expandfill(add(x))
            row()

            label("!Number of opponents")
            with (expandfill(add(TextField(GameData.pref_civCount.toString(), REF_SKIN_W95)))) {
                actor.addListener(LambdaChangeListener {
                        try {
                            GameData.pref_civCount = Integer.valueOf(actor.text)
                        } catch (e : NumberFormatException) {
                            actor.text = GameData.pref_civCount.toString()
                        }
                })
            }
            row()

            val lblLegend = expandfill(label("!" + Nation.legend(GameData.pref_civType)))
                .colspan(2)
                .padLeft(5f)
                .padRight(5f)
                .actor as Label


            x.addListener(LambdaChangeListener {
                GameData.pref_civType = x.selected
                lblLegend.setText(Nation.legend(x.selected))
                    .also { align(Align.center) }
                pack()
                centerStage()
            })

            span(hsep().padTop(30f))

            span(addButton("generic.game.new") {
                GameData.pref_civType = x.selected
                controller.switchState(2)
            })
            row()
            span(addButton("!LAN") {
                if (Server.boot())
                    addw(W_NetworkConnect())
                else
                    dialog("!Not available!", "!Failed to start the server. Is there already one running?")
            })
            row()
            span(addButton("generic.buttons.cancel", false) { cancel() })
            updateColSpans()
            pack()
        }
    }

    private inner class W_NetworkConnect : StageWindow("!Connect") {
        init {
            label("!HOST IP : ${getIP().hostAddress}")
            row()
            label("!Wait for players, then click start.")
            row()
            addButton("!Start Game!") { Hypervisor.doNewGameFINAL() }

            pack()
        }
    }


    /**
     * # World Creation Screen State Machine.
     *
     * Controlls the state of the game loading window.
     *
     * Generated using Shinkson's State Machine Scripture.
     *
     * See WorldCreation.sms
     */
    inner class WorldCreationScreenController : StateMachine("WorldCreationScreenController") {
        private var framebuffer = 0
        private var isDeserializing = false


        init {
            // State : GameConfigure
            addState(State(
                "GameConfigure",
                {},
                this,
                {
                    addw(gameCreationWindow)
                    Gdx.input.inputProcessor = stage
                },
                null
            ))
            // State : GameLoad
            addState(
                State(
                    "GameLoad",
                    {},
                    this,
                    {
                        chooser.show(stage)
                    },
                    null
                )
            )
            // Switch : from GameConfigure to GameLoad
            registerSwitchCondition(0, 1) { isLoading }
            // State : PreRender
            addState(
                State(
                    "PreRender",
                    { framebuffer++ },
                    this,
                    {
                        framebuffer = 0

                        if (isConnecting && !isDeserializing) {
                            constructConnectingText()
                        } else if (isConnecting or isDeserializing or isLoading) {
                            constructDeserializingText()
                        } else {
                            constructGeneratingText()
                        }
                    },
                    null
                )
            )
            // State : GeneratingWorld
            addState(
                State(
                    "GeneratingWorld",
                    {},
                    this,
                    { doNewGameCallback() },
                    null
                )
            )
            // State : LanInit
            addState(
                State(
                    "LanInit",
                    {},
                    this,
                    {
                        if (!boot())
                            dialog("!Failed to start the server.", "!Is another server already running on this computer?", null)
                    },
                    null
                )
            )
            // State : LanConfigure
            addState(
                State(
                    "LanConfigure",
                    {},
                    this,
                    {
                        Gdx.input.inputProcessor = stage
                        stage.actors.removeValue(loadingContainer, true)
                        addw(W_NetworkConnect())
                    },
                    null
                )
            )
            // State : Deserializing
            addState(
                State(
                    "Deserializing",
                    {},
                    this,
                    {
                        if (isLoading) {
                            try {
                                load(Gdx.files.external(chooser.result.path()).file())
                            } catch (e : InvalidClassException) {
                                constructText("!This save file is incompatable with this version of X6.")
                                this@WorldCreation.dialog("!Unable to load", "!This save file is incompatable with this version of X6.") { Hypervisor.endGame() }
                                switchState(1)
                            } catch (e : Exception) {
                                constructText("!Unable to load")
                                this@WorldCreation.dialog("!Unable to load", "!Encountered some error whilst loading that save : \n ${e.message}") { Hypervisor.endGame() }
                                switchState(1)
                            }
                        } else {
                            //NetworkClient.postUpdate()
                            Gdx.app.postRunnable { NetworkClient.lastState!!.gameState?.let { load(it) } }
                        }
                    },
                    null
                )
            )
            // State : Complete
            addState(
                State(
                    "Complete",
                    {},
                    this,
                    { Hypervisor.doNewGameFINAL() },
                    null
                )
            )
            // State : LanConnecting
            addState(
                State(
                    "LanConnecting",
                    {},
                    this,
                    {
                        try {
                            connect()
                        } catch (e: ConnectException) {
                                this@WorldCreation.dialog("!Unable to connect", "!Failed to connect. Check there's another client hosting.") { Hypervisor.endGame() }
                        }
                        isDeserializing = true
                    },
                    null
                )
            )
            // Switch : from GameConfigure to PreRender
            registerSwitchCondition(0, 2) { Client.DEBUG_MODE or isConnecting }
            // Switch : from PreRender to Deserializing
            registerSwitchCondition(2, 6) { framebuffer >= 3 && isDeserializing && NetworkClient.hasStarted }
            // Switch : from PreRender to Deserializing
            registerSwitchCondition(2, 6) { framebuffer >= 3 && isLoading }
            // Switch : from PreRender to GeneratingWorld
            registerSwitchCondition(2, 3) { framebuffer >= 3 && !isConnecting && !isLoading }
            // Switch : from PreRender to LanConnecting
            registerSwitchCondition(2, 8) { framebuffer >= 11 && isConnecting }
            // Switch : from LanInit to GameConfigure
            registerSwitchCondition(4, 0) { !alive }
            // Switch : from LanInit to PreRender
            registerSwitchCondition(4, 2) { alive }
            // Switch : from GeneratingWorld to LanConfigure
            registerSwitchCondition(3, 5) { alive }
            // Switch : from GeneratingWorld to Complete
            registerSwitchCondition(3, 7) { !alive }
            // Switch : from LanConnecting to PreRender
            registerSwitchCondition(8, 2) { NetworkClient.hasStarted }
            // Switch : from Deserializing to Complete
            registerSwitchCondition(6, 7) { true }
            defaultState(0)
        }
    }

    override fun doResize(width: Int, height: Int) {}
}