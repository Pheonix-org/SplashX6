/*░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░
 ░ FOSS 2022. The Splash Project.                                                                                                                                                 ░
 ░ https://www.shinkson47.in/SplashX6                                                                                                                                             ░
 ░                                                                                                                                                                                ░
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

package com.shinkson47.SplashX6

import com.badlogic.gdx.Game
import com.badlogic.gdx.Gdx
import com.badlogic.gdx.Screen
import com.badlogic.gdx.graphics.GL20
import com.shinkson47.SplashX6.audio.AudioController
import com.shinkson47.SplashX6.game.GameHypervisor
import com.shinkson47.SplashX6.input.KeyBinder
import com.shinkson47.SplashX6.input.mouse.MouseHandler
import com.shinkson47.SplashX6.rendering.screens.ScreenTransistion
import com.shinkson47.SplashX6.rendering.screens.SplashScreen
import com.shinkson47.SplashX6.rendering.screens.WorldCreation
import com.shinkson47.SplashX6.utility.Assets
import com.shinkson47.SplashX6.utility.Debug
import com.shinkson47.SplashX6.utility.GraphicalConfig
import java.awt.Image
import javax.imageio.ImageIO


/**
 * # The main game
 * This is the entry point to Spalsh X6, and cascades LibGDX's api calls throughout
 * the game's classes.
 */
class Client : Game() {
    var currentScreen: Screen? = null

    /**
     * # Engine has booted, boot game.
     */
    override fun create() {
        client = this
        if (DEBUG_MODE)
            debugStart()
        else
            setScreen(SplashScreen())

        // NOTE assets are now loaded in splash screen.
        setMacDockIcon()

        MouseHandler.create()

        // TODO move somewhere else, ideally graphics config.
        Gdx.gl.glClearColor(r, g, b, a)
    }

    /**
     * Skips and configures things which annoy us when we're debugging.
     */
    private fun debugStart() {
        Assets.Create()
        AudioController.isMuted = true
        setScreen(WorldCreation())              // Skip to world creation
        GraphicalConfig.exitFullscreen()        // Exit fullscreen so we can access the ide.
    }

    /**
     * When on mac, changes the dock icon.
     */
    private fun setMacDockIcon() {
        try {
            val cls = Class.forName("com.apple.eawt.Application")
            val application = cls.newInstance().javaClass.getMethod("getApplication").invoke(null)

            val icon = ImageIO.read(Gdx.files.local("sprites/icon.png").read())
            application.javaClass.getMethod("setDockIconImage", Image::class.java).invoke(application, icon)

 
        } catch (e: Exception) {
            e.printStackTrace()
            // nobody cares!
        }
    }

    /**
     * # Framely engine update
     * Render, check for inputs, etc.
     */
    override fun render() {
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT)
        currentScreen?.render(Gdx.graphics.deltaTime)
        KeyBinder.poll()
        MouseHandler.Poll()
    }

    /**
     * # Engine requests game to close
     * Save, close
     */
    override fun dispose() {
        super.dispose()
        GameHypervisor.dispose()
        //World.dispose()
        //AudioManager.dispose();
        Debug.dispose()
    }

    override fun setScreen(screen: Screen?) {
        screen?.let {
            super.setScreen(it)
            currentScreen = it
        }
    }

    fun fadeScreen(newScreen : Screen){
        setScreen(ScreenTransistion(getScreen(), newScreen))
    }

    fun resize() {
        super.resize(GraphicalConfig.displayMode.width, GraphicalConfig.displayMode.height)
    }

    companion object {

        const val r = 0f
        const val g = 0f
        const val b = 0f
        const val a = 1f
        const val hr = 0f
        const val hg = 0f


        @JvmField
        var DEBUG_MODE: Boolean = false

        @JvmField
        var CI_CD: Boolean = false

        /**
         * Alias of the boot config's fullscreen status.
         *
         * Fullscreen cannot be polled when in headless testing environment,
         * so this is a work around.
         */
        @JvmField
        var CI_CD_FS: Boolean = false

        @JvmField
        var client: Client? = null
    }
}