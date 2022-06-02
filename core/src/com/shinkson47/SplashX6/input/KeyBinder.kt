package com.shinkson47.SplashX6.input

import com.badlogic.gdx.*
import com.shinkson47.SplashX6.Client
import com.shinkson47.SplashX6.game.GameData
import com.shinkson47.SplashX6.game.Hypervisor
import com.shinkson47.SplashX6.game.Hypervisor.endGame
import com.shinkson47.SplashX6.game.Hypervisor.NewGame
import com.shinkson47.SplashX6.game.Hypervisor.cm_enter
import com.shinkson47.SplashX6.game.Hypervisor.cm_exit
import com.shinkson47.SplashX6.game.Hypervisor.cm_toggle
import com.shinkson47.SplashX6.game.Hypervisor.turn_end
import com.shinkson47.SplashX6.rendering.ui.StageWindow
import com.shinkson47.SplashX6.rendering.screens.Warroom
import com.shinkson47.SplashX6.rendering.screens.game.GameScreen
import com.shinkson47.SplashX6.rendering.screens.MainMenu
import com.shinkson47.SplashX6.rendering.windows.game.units.W_Unit
import com.shinkson47.SplashX6.utility.APICondition.Companion.MSG_TRIED_EXCEPT
import com.shinkson47.SplashX6.utility.APICondition.Companion.REQ_IN_GAME
import com.shinkson47.SplashX6.utility.APICondition.Companion.THROW
import com.shinkson47.SplashX6.utility.APICondition.Companion.validateCall
import com.shinkson47.SplashX6.utility.configuration.GraphicalConfig

/**
 * # Binds key presses to runnable actions.
 * Stores [KeyBinding]'s that are invoked only on thier appropriate screen.
 * @author [Jordan T. Gray](https://www.shinkson47.in) on 23/06/2021
 * @since PRE-ALPHA 0.0.2
 * @version 1
 */
object KeyBinder : InputAdapter() {


    /**
     * ## Boilerplate defining a action to perform when a key is pressed on a given screen.
     * @author [Jordan T. Gray](https://www.shinkson47.in) on 23/06/2021
     * @since PRE-ALPHA 0.0.2
     * @version 1
     */
    data class KeyBinding <T : Screen> (val activeOn : Class<T>, val keyOrButton : Int, val Action : Runnable, val repeat : Boolean, val Release : Runnable?)

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
            bind(this, Input.Keys.ESCAPE) { endGame() }

            // Function keys.
            bind(this, Input.Keys.F1) { cm_enter() }
            bind(this, Input.Keys.F2) { cm_exit()  }
            bind(this, Input.Keys.F5) { NewGame()  }

            // Numbers toggle active tool window.
//            bind(this, Input.Keys.NUM_1) { select(0) }
//            bind(this, Input.Keys.NUM_2) { select(1) }
//            bind(this, Input.Keys.NUM_3) { select(2) }
//            bind(this, Input.Keys.NUM_4) { select(3) }
//            bind(this, Input.Keys.NUM_5) { select(4) }
//            bind(this, Input.Keys.NUM_6) { select(5) }
//            bind(this, Input.Keys.NUM_7) { select(6) }
//            bind(this, Input.Keys.NUM_8) { select(7) }
//            bind(this, Input.Keys.NUM_9) { select(8) }
//            bind(this, Input.Keys.NUM_0) { select(9) }

            if (Client.DEBUG_MODE) {
                bind(this, Input.Keys.COMMA, true) { Hypervisor.gameRenderer?.cam!!.desiredPosition.desired.z += 30; }
                bind(this, Input.Keys.PERIOD, true) { Hypervisor.gameRenderer?.cam!!.desiredPosition.desired.z -+ 30; }
            }

            bind(this, Input.Keys.E) { turn_end() }
            bind(this, Input.Keys.TAB) { cm_toggle() }

            bind(this, Input.Keys.SHIFT_LEFT,
                Release = { Hypervisor.gameRenderer?.cam!!.boost(false) },
                Action =  { Hypervisor.gameRenderer?.cam!!.boost(true) })
        }

        // ========================================
        //          Management Screen Bindings
        // ========================================


        with (Warroom::class.java) {
            bind(this, Input.Keys.E) { turn_end() }
            bind(this, Input.Keys.TAB) { cm_toggle() }
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
            val camera = Hypervisor.gameRenderer!!.cam
            bind(this, Input.Keys.W, true) { camera.up() }
            bind(this, Input.Keys.S, true) { camera.down() }
            bind(this, Input.Keys.D, true) { camera.right() }
            bind(this, Input.Keys.A, true) { camera.left() }
            bind(this, Input.Keys.UP, true) { camera.up() }
            bind(this, Input.Keys.DOWN, true) { camera.down() }
            bind(this, Input.Keys.RIGHT, true) { camera.right() }
            bind(this, Input.Keys.LEFT, true) { camera.left() }

            bind(this, Input.Keys.C, false) { Hypervisor.unit_view() }
            bind(this, Input.Keys.X, false) { GameData.selectedUnit?.let { StageWindow.post(W_Unit(it)) } }
            bind(this, Input.Keys.GRAVE, false) { StageWindow.unPostAll() }
            bind(this, Input.Keys.SPACE, false) { Hypervisor.cm_destinationSelect() }
        }

        with (Warroom::class.java) {
            // Camera control
            bind(this, Input.Keys.W, true) { Hypervisor.gameRenderer!!.managementScreen.up() }
            bind(this, Input.Keys.S, true) { Hypervisor.gameRenderer!!.managementScreen.down() }
            bind(this, Input.Keys.D, true) { Hypervisor.gameRenderer!!.managementScreen.right() }
            bind(this, Input.Keys.A, true) { Hypervisor.gameRenderer!!.managementScreen.left() }
            bind(this, Input.Keys.C, false) { Hypervisor.unit_view() }
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
    fun <T : Screen> bind(activeOn : Class<T>, keyOrButton : Int, repeat : Boolean = false, Release : Runnable? = null, Action : Runnable) = bind(
        KeyBinding(activeOn, keyOrButton, Action, repeat, Release)
    )
    fun bind(binding : KeyBinding<*>) {
        with (ScreenMap) {
            if (!containsKey(binding.activeOn))
                this[binding.activeOn] = ArrayList()

                this[binding.activeOn]!!.add(binding)
        }

        if (bindingGame) GameBinds.add(binding)
    }

    fun globalBind(keyOrButton : Int, repeat : Boolean = false, Release : Runnable? = null, Action : Runnable) = globalBind(
        KeyBinding(Global::class.java, keyOrButton, Action, repeat, Release)
    )
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
        ScreenMap[Client.client!!.screen.javaClass]?.forEach { repeatIfDown.invoke(it) }
        GlobalBinds.forEach { repeatIfDown.invoke(it) }
    }

    /**
     * # For a given key press, tries to find and execute a binding that is active on the current screen.
     */
    fun poll(key : Int, down : Boolean) {
        if (down) {
            ScreenMap[Client.client!!.screen.javaClass]?.forEach { MatchAndExecute.invoke(it, key) }
            GlobalBinds.forEach { MatchAndExecute.invoke(it, key) }
        } else {
            ScreenMap[Client.client!!.screen.javaClass]?.forEach { MatchAndRelease.invoke(it, key) }
            GlobalBinds.forEach { MatchAndRelease.invoke(it, key) }
        }
    }

    private fun Match(it : Int, key : Int) = it == key || it == Input.Keys.ANY_KEY
    private val MatchAndExecute : (it : KeyBinding<*>, key : Int) -> Unit = { it, key -> if (Match(it.keyOrButton, key)) it.Action.run() }
    private val MatchAndRelease : (it : KeyBinding<*>, key : Int) -> Unit = { it, key -> if (Match(it.keyOrButton, key)) it.Release?.run() }
    private val repeatIfDown : (it : KeyBinding<*>) -> Unit = { it -> if (it.repeat && Gdx.input.isKeyPressed(it.keyOrButton)) it.Action.run() }

    override fun keyDown(keycode: Int): Boolean {
        poll(keycode, true)
        return true
    }

    override fun keyUp(keycode: Int): Boolean {
        poll(keycode, false)
        return true
    }

    class Global : ScreenAdapter() {}
}