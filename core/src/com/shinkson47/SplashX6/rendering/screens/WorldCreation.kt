package com.shinkson47.SplashX6.rendering.screens

import com.shinkson47.SplashX6.rendering.ScalingScreenAdapter
import com.shinkson47.SplashX6.utility.Assets
import com.badlogic.gdx.Gdx
import com.badlogic.gdx.Input
import com.badlogic.gdx.math.MathUtils
import com.badlogic.gdx.scenes.scene2d.ui.Label
import com.badlogic.gdx.scenes.scene2d.ui.SelectBox
import com.badlogic.gdx.scenes.scene2d.ui.Table
import com.shinkson47.SplashX6.Client
import com.shinkson47.SplashX6.game.GameData
import com.shinkson47.SplashX6.game.GameHypervisor.Companion.doNewGameCallback
import com.shinkson47.SplashX6.game.GameHypervisor.Companion.inGame
import com.shinkson47.SplashX6.game.GameHypervisor.Companion.load
import com.shinkson47.SplashX6.game.cities.CityType
import com.shinkson47.SplashX6.network.Server
import com.shinkson47.SplashX6.rendering.StageWindow
import com.shinkson47.SplashX6.rendering.windows.TerrainGenerationEditor
import com.shinkson47.SplashX6.utility.Assets.SKIN
import com.shinkson47.SplashX6.utility.UtilityK.getIP

/**
 * # Provides the user a place to configure the game and world generation
 *
 *
 *
 * @author [Jordan T. Gray on 16/04/2021](https://www.shinkson47.in)
 * @version 2
 * @since v1
 */
class WorldCreation(val isConnecting : Boolean = false) : ScalingScreenAdapter() {

    //==========================================
    //#region fields
    //==========================================

    /**
     * # A label that will display game tips whilst loading
     */
    private val tipLabel = Label("", SKIN)

    /**
     * Used to ensure that the loading screen has been rendered
     * before starting the loading. Ensures there's something
     * displayed.
     */
    private var loadingScreenRendered = false

    /**
     * True when the user has clicked 'New Game'.
     */
    private var userFinished = false

    private val gameCreationWindow = W_GameCreation()

    private var type = CityType.asian

    //==========================================
    //#endregion fields
    //#region operations
    //==========================================

    /**
     * # Renders the screen
     */
    override fun render(delta: Float) {
        // Render once, then on the second frame callback to the game hypervisor to create the game.
        // We have to perform a full render and return to put a loading screen up.

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
    }

    /**
     * # Displays another random tip from [Assets.TIPS] in [tipLabel].
     */
    private fun nextTip() = tipLabel.setText(Assets.TIPS[MathUtils.random(Assets.TIPS.size - 1)])

    override fun doResize(width: Int, height: Int) {}

    /**
     * # Constructs the GUI shown whilst the game is generating
     */
    private fun constructLoadingGUI() = loadingText("specific.gamecreation.generating")
    private fun renderConnecting() = loadingText("!Waiting for host to start game.")

    private fun loadingText(key : String) {
        val table = Table()
        table.setFillParent(true)

        // TODO Add other information.
        StageWindow.label(key, table).padBottom(50f).row()

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

            addw(gameCreationWindow)

            Gdx.input.inputProcessor = stage
        }
    }

    private fun addw(w : StageWindow) {
        stage.addActor(w)
        w.centerStage()
    }

    private inner class W_GameCreation() : StageWindow() {
        init {
            isResizable = false
            isMovable = false

            // TODO Civ class
            //      Opponents
            //      Preset world types
            //      World size
            //      Advanced terrain
            addButton("specific.gamecreation.terrainSettings", true, true) { stage.addActor(TerrainGenerationEditor()) }

            row()
            label("specific.gamecreation.civtype")

            val x = SelectBox<CityType>(SKIN)
            x.setItems(*CityType.values())
            x.selected = x.items.first()
            add(x)

            x.addListener(LambdaChangeListener { GameData.pref_civType = x.selected})

            span(
                    hsep()
                    .padTop(30f)
            )

            span(addButton("generic.game.new") { userFinished = true })
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
            addButton("!Start Game!") { userFinished = true; }

            pack()
        }
    }
}