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

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.graphics.Color
import com.badlogic.gdx.graphics.g2d.Animation
import com.badlogic.gdx.graphics.g2d.TextureAtlas
import com.badlogic.gdx.scenes.scene2d.ui.*
import com.shinkson47.SplashX6.Client.Companion.client
import com.shinkson47.SplashX6.audio.AudioController
import com.shinkson47.SplashX6.game.GameHypervisor.Companion.ConnectGame
import com.shinkson47.SplashX6.game.GameHypervisor.Companion.LoadGame
import com.shinkson47.SplashX6.game.GameHypervisor.Companion.NewGame
import com.shinkson47.SplashX6.input.mouse.MouseHandler
import com.shinkson47.SplashX6.rendering.ScalingScreenAdapter
import com.shinkson47.SplashX6.rendering.StageWindow
import com.shinkson47.SplashX6.rendering.windows.W_Options
import com.shinkson47.SplashX6.utility.Assets
import com.shinkson47.SplashX6.utility.Assets.REF_SKIN_W95
import com.shinkson47.SplashX6.utility.Assets.SPRITES_MENUBG
import com.shinkson47.SplashX6.utility.Console
import kotlin.math.roundToInt


/**
 * <h1></h1>
 * <br></br>
 *
 *
 *
 *
 *
 * @author [Jordan T. Gray on 16/04/2021](https://www.shinkson47.in)
 * @version 1
 * @since v1
 */
class MainMenu : ScalingScreenAdapter() {

    //private val stage = Stage(ExtendViewport(Gdx.graphics.width.toFloat(), Gdx.graphics.height.toFloat()))
    private var menuWindow: Window? = null
    private val bg = Animation(0.1333333333f, Assets.get<TextureAtlas>(SPRITES_MENUBG).regions, Animation.PlayMode.LOOP)

    @Volatile private var animationStateTime = 0f
    private val optionsWindow = W_Options(this)


    /**
     * Sub class that encompasses the window shown at the main menu that contains option for the user
     */
    private inner class MainMenuWindow : StageWindow() {
        init {

            // Title label
            add(Label("SPLASH X6", REF_SKIN_W95,"RetroNewVersion-Large", Color.BLACK))

                    .row()

            add(
                    Label("PRE-ALPHA 0.0.2", REF_SKIN_W95)
            ).padBottom(50f).row()

            addButton("generic.game.new")  { NewGame() }
            addButton("generic.game.load") { LoadGame() }
            addButton("!Connect") { ConnectGame() }
            addButton("generic.any.options") { optionsWindow.isVisible = true; optionsWindow.toFront() }
            addButton("specific.menu.credits") { client!!.fadeScreen(CreditsScreen()) }
            addButton("generic.game.exit") { Gdx.app.exit() }

            isMovable = false
            isResizable = false
            pack()
        }
    }

    //#region operations
    override fun render(delta: Float) {
        animationStateTime += delta

        with (stage.batch) {
            begin()
                draw(bg.getKeyFrame(animationStateTime), 0f, 0f, width, height)
            end()
        }

        stage.act()
        stage.draw()
        super.render(delta)
    }

    override fun doResize(width: Int, height: Int) {
        menuWindow!!.setPosition(
            makeEven((super.width  * 0.5f) - (menuWindow!!.width  * 0.5f)),
            makeEven((super.height * 0.5f) - (menuWindow!!.height * 0.5f))
        )
    }

    private fun makeEven(f: Float): Float {
        return (f / 2f).roundToInt() * 2f
    }


    init {
        menuWindow = MainMenuWindow()
        resize(width.toInt(), height.toInt())

        stage.addActor(menuWindow)
        stage.addActor(optionsWindow)



        // Set the stage to handle key and mouse input
        MouseHandler.configureGameInput(stage)
        AudioController.playMainMenu()

        optionsWindow.dontClose()
        optionsWindow.isVisible = false

    }
}