package com.shinkson47.SplashX6.input.keys

import com.badlogic.gdx.*
import com.shinkson47.SplashX6.Client
import com.shinkson47.SplashX6.game.GameData
import com.shinkson47.SplashX6.game.GameHypervisor
import com.shinkson47.SplashX6.game.GameHypervisor.Companion.EndGame
import com.shinkson47.SplashX6.game.GameHypervisor.Companion.NewGame
import com.shinkson47.SplashX6.game.GameHypervisor.Companion.cm_active
import com.shinkson47.SplashX6.game.GameHypervisor.Companion.cm_enter
import com.shinkson47.SplashX6.game.GameHypervisor.Companion.cm_exit
import com.shinkson47.SplashX6.game.GameHypervisor.Companion.cm_toggle
import com.shinkson47.SplashX6.game.GameHypervisor.Companion.turn_end
import com.shinkson47.SplashX6.rendering.screens.GameManagementScreen
import com.shinkson47.SplashX6.rendering.screens.GameScreen
import com.shinkson47.SplashX6.rendering.screens.MainMenu
import com.shinkson47.SplashX6.rendering.screens.SplashScreen
import com.shinkson47.SplashX6.rendering.windows.GameWindowManager.select
import com.shinkson47.SplashX6.utility.APICondition.Companion.MSG_TRIED_EXCEPT
import com.shinkson47.SplashX6.utility.APICondition.Companion.REQ_IN_GAME
import com.shinkson47.SplashX6.utility.APICondition.Companion.THROW
import com.shinkson47.SplashX6.utility.APICondition.Companion.validateCall
import com.shinkson47.SplashX6.utility.GraphicalConfig

/**
 * # Binds key presses to runnable actions.
 * Stores [KeyBinding]'s that are invoked only on thier appropriate screen.
 * @author [Jordan T. Gray](https://www.shinkson47.in) on 23/06/2021
 * @since PRE-ALPHA 0.0.2
 * @version 1
 */
object KeyBinder : InputAdapter() {


    /**
     * # Map containing [ArrayList]'s of key bindings for each screen.
     */
    val ScreenMap : HashMap<Class<*>, ArrayList<KeyBinding<*>>> = HashMap()

    /**
     * # A [ArrayList] of [KeyBinding]'s that can be invoked on any screen.
     */
    val GlobalBinds : ArrayList<KeyBinding<*>> = ArrayList()


    /**
     * # A list of bindings in [GlobalBinds] and [ScreenMap] that should be removed when the game is ended.
     */
    val GameBinds : ArrayList<KeyBinding<*>> = ArrayList()


    /**
     * # Determines if we are creating binds for a specific game.
     * Whilst true, bindings are logged as game bindings and are removed when the game is ended.
     *
     * see [createGameBinds] and [disposeGameBinds]
     */
    var bindingGame = false
        private set


    /**
     * # Configures key bindings.
     */
    init {

        // ========================================
        //          Global Bindings
        // ========================================

        globalBind(Input.Keys.F11) { GraphicalConfig.toggleFullscreen() }

        // ========================================
        //          Game Screen Bindings
        // ========================================

        with (GameScreen::class.java) {
            bind(this, Input.Keys.ESCAPE) { EndGame() }

            // Function keys.
            bind(this, Input.Keys.F1) { cm_enter() }
            bind(this, Input.Keys.F2) { cm_exit()  }
            bind(this, Input.Keys.F5) { NewGame()  }
            bind(this, Input.Keys.F6) { GameData.world?.swapTiledInterp() }

            // Numbers toggle active tool window.
            bind(this, Input.Keys.NUM_1) { select(0) }
            bind(this, Input.Keys.NUM_2) { select(1) }
            bind(this, Input.Keys.NUM_3) { select(2) }
            bind(this, Input.Keys.NUM_4) { select(3) }
            bind(this, Input.Keys.NUM_5) { select(4) }
            bind(this, Input.Keys.NUM_6) { select(5) }
            bind(this, Input.Keys.NUM_7) { select(6) }
            bind(this, Input.Keys.NUM_8) { select(7) }
            bind(this, Input.Keys.NUM_9) { select(8) }
            bind(this, Input.Keys.NUM_0) { select(9) }

            bind(this, Input.Keys.E) { turn_end() }
            bind(this, Input.Keys.TAB) { cm_enter() }

        }

        // ========================================
        //          Management Screen Bindings
        // ========================================


        with (GameManagementScreen::class.java) {
            bind(this, Input.Keys.E) { turn_end() }
            bind(this, Input.Keys.TAB) { cm_exit() }
        }


        // ========================================
        //          Main Menu Screen Bindings
        // ========================================

        with (MainMenu::class.java) {
            bind(this, Input.Keys.ESCAPE) { Gdx.app.exit() }
        }
    }

    /**
     * # Creates key binds that can only be created whilst in-game.
     */
    fun createGameBinds() {
        bindingGame = true

        validateCall(REQ_IN_GAME, THROW(MSG_TRIED_EXCEPT("Create in-game key bindings", "we're not in game")))

        with (GameScreen::class.java) {
            // Camera control
            val camera = GameHypervisor.gameRenderer!!.cam!!
            bind(this, Input.Keys.W, true) { camera.up() }
            bind(this, Input.Keys.S, true) { camera.down() }
            bind(this, Input.Keys.D, true) { camera.right() }
            bind(this, Input.Keys.A, true) { camera.left() }
        }

        with (GameManagementScreen::class.java) {
            // Camera control
            bind(this, Input.Keys.W, true) { GameHypervisor.gameRenderer!!.managementScreen.up() }
            bind(this, Input.Keys.S, true) { GameHypervisor.gameRenderer!!.managementScreen.down() }
            bind(this, Input.Keys.D, true) { GameHypervisor.gameRenderer!!.managementScreen.right() }
            bind(this, Input.Keys.A, true) { GameHypervisor.gameRenderer!!.managementScreen.left() }
        }


        bindingGame = false
    }



    /**
     * # Decomposes key binding that only function in game
     */
    fun destroyGameBinds() {
        GlobalBinds.forEach {                   // For every global key bind
            if ( GameBinds.contains(it)) {      // If it's was made in [createGameBinds]
                GlobalBinds.remove(it)          // Debind
                GameBinds.remove(it)            // Remove from gamebind cache
            }
        }

        val FlaggedForDebind : ArrayList<KeyBinding<*>> = ArrayList()
        ScreenMap.forEach {                     // For every set of screen specific bindings
                map ->
                run {
                    map.value.forEach {         // For every binding
                            bind ->
                        if (GameBinds.contains(bind)) { // If it was made in [createGameBinds]
                            FlaggedForDebind.add(bind)              // Mark for debinding.
                            //map.value.remove(bind)    // Debind TODO concurrent modification.
                            GameBinds.remove(bind)      // Remove from gamebind cache
                        }
                    }
                    map.value.removeAll(FlaggedForDebind)           // Remove marked for debinding
                    FlaggedForDebind.clear()                        // clear debind flags
                }
        }
    }


    /**
     * # Adds a key binding.
     */
    fun <T : Screen> bind(activeOn : Class<T>, keyOrButton : Int, repeat : Boolean = false, Action : Runnable) = bind(KeyBinding(activeOn, keyOrButton, Action, repeat))
    fun bind(binding : KeyBinding<*>) {
        with (ScreenMap) {
            if (!containsKey(binding.activeOn))
                this[binding.activeOn] = ArrayList()

                this[binding.activeOn]!!.add(binding)
        }

        if (bindingGame) GameBinds.add(binding)
    }

    fun globalBind(keyOrButton : Int, repeat : Boolean = false, Action : Runnable) = globalBind(KeyBinding(Global::class.java, keyOrButton, Action, repeat))
    fun globalBind(binding : KeyBinding<*>) {
        if (!GlobalBinds.contains(binding)) GlobalBinds.add(binding)
        if (bindingGame) GameBinds.add(binding)
    }

    /**
     * # Checks for held keys and activates thier action every frame.
     *
     * For [KeyBinding]'s where repeat is true, checks if the key is held and executes the binding's action.
     */
    fun poll() {
        ScreenMap[Client.client!!.screen.javaClass]?.forEach { ExecuteIfDown.invoke(it) }
        GlobalBinds.forEach { ExecuteIfDown.invoke(it) }
    }

    /**
     * # For a given key press, tries to find and execute a binding that is active on the current screen.
     */
    fun poll(key : Int) {
        ScreenMap[Client.client!!.screen.javaClass]?.forEach { MatchAndExecute.invoke(it, key) }
        GlobalBinds.forEach {MatchAndExecute.invoke(it, key)}
    }

    private val MatchAndExecute : (it : KeyBinding<*>, key : Int) -> Unit = { it, key -> if (it.keyOrButton == key || it.keyOrButton == Input.Keys.ANY_KEY) it.Action.run() }
    private val ExecuteIfDown : (it : KeyBinding<*>) -> Unit = { it -> if (it.repeat && Gdx.input.isKeyPressed(it.keyOrButton)) it.Action.run() }

    override fun keyDown(keycode: Int): Boolean {
        poll(keycode)
        return true
    }

    class Global : ScreenAdapter() {}
}