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
import com.badlogic.gdx.scenes.scene2d.Actor
import com.badlogic.gdx.scenes.scene2d.ui.*
import com.shinkson47.SplashX6.Client.Companion.client
import com.shinkson47.SplashX6.audio.AudioController
import com.shinkson47.SplashX6.game.Hypervisor.ConnectGame
import com.shinkson47.SplashX6.game.Hypervisor.LoadGame
import com.shinkson47.SplashX6.game.Hypervisor.NewGame
import com.shinkson47.SplashX6.input.mouse.MouseHandler
import com.shinkson47.SplashX6.rendering.ui.AutoFocusScrollPane
import com.shinkson47.SplashX6.rendering.ui.ScalingScreenAdapter
import com.shinkson47.SplashX6.rendering.ui.ScrollableTextArea
import com.shinkson47.SplashX6.rendering.ui.StageWindow
import com.shinkson47.SplashX6.rendering.windows.W_Options
import com.shinkson47.SplashX6.utility.Assets
import com.shinkson47.SplashX6.utility.Assets.DIR_LICENCES
import com.shinkson47.SplashX6.utility.Assets.REF_SKIN_W95
import com.shinkson47.SplashX6.utility.Assets.SPRITES_MENUBG
import com.shinkson47.SplashX6.utility.Utility
import com.shinkson47.SplashX6.utility.Utility.center
import com.shinkson47.SplashX6.utility.configuration.GraphicalConfig
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
    private var licWindow: W_Licences




    private val bg = Animation(0.1333333333f, Assets.get<TextureAtlas>(SPRITES_MENUBG).regions, Animation.PlayMode.LOOP)

    @Volatile private var animationStateTime = 0f
    private val optionsWindow = W_Options(this)


    /**
     * Sub class that encompasses the window shown at the main menu that contains option for the user
     */
    private inner class MainMenuWindow : StageWindow() {
        init {
            this@MainMenu.stage.addActor(this)
            // Title label
            add(Label("SPLASH X6", REF_SKIN_W95, "RetroNewVersion-Large", Color.BLACK))

                .row()

            add(
                Label("PRE-ALPHA 0.0.3", REF_SKIN_W95)
            ).padBottom(50f).row()

            addButton("generic.game.new") { NewGame() }
            addButton("generic.game.load") { LoadGame() }
            addButton("!Connect") { ConnectGame() }
            addButton("generic.any.options") { optionsWindow.isVisible = true; optionsWindow.toFront() }
            addButton("specific.menu.credits") {
                client.fadeScreen(
                    TextScreen(
                        Assets.get(Assets.LANG_CREDITS),
                        background = REF_SKIN_W95.getDrawable("tiledtex"),
                        fontColor = Color.BLACK,
                        onESC = this@MainMenu
                    )
                )
            }
            addButton("!Licences") {
                licWindow.isVisible = true
                licWindow.toFront()
            }
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
        center(menuWindow!!)
        stage.actors.find { it is W_USERNAME }?.let { center(it) }
//        center(stage.actors.find { it is W_Licences }!!)
    }

    private fun center(actor: Actor) {
        actor.setPosition(
            makeEven(center(super.width, menuWindow!!.width)),
            makeEven(center(super.height, menuWindow!!.height))
        )
    }

    private fun makeEven(f: Float): Float {
        return (f / 2f).roundToInt() * 2f
    }


    init {
        menuWindow = MainMenuWindow()
        licWindow = W_Licences()

        resize(width.toInt(), height.toInt())
        stage.addActor(optionsWindow)


        if (Assets.REF_PREFERENCES.getString("USER_NAME").isNullOrBlank()) {
            stage.addActor(W_USERNAME())
            menuWindow!!.isVisible = false
        }

        stage.addActor(licWindow)
        licWindow.next()

        // Set the stage to handle key and mouse input
        MouseHandler.configureGameInput(stage)
        AudioController.playMainMenu()

        optionsWindow.dontClose()
        optionsWindow.isVisible = false

    }

    private inner class W_USERNAME() : StageWindow("!Configure your username.") {
        init {
            label("!Enter a username for multiplayer use.").colspan(2)
            row()
            label("!Choose carefully; it CANNOT be changed.").colspan(2)
            row()
            val ta = TextArea("MyCoolName123", REF_SKIN_W95)

            label("!My username is : ")
            add(ta).expand().fill().padTop(10f)
            row()
            add(button("!Confirm") {
                Assets.REF_PREFERENCES.putString("USER_NAME", ta.text)
                Assets.REF_PREFERENCES.flush()
                menuWindow!!.isVisible = true
                isVisible = false
                this@MainMenu.stage.actors.removeValue(this, true)
            }).colspan(2)
            pack()
        }
    }

    private inner class W_Licences() : StageWindow("!Open Source Licenses") {

        private val licences = ArrayList<String>()
        private var index = 0
        val ta = ScrollableTextArea("")
        val scrollPane = AutoFocusScrollPane(ta)

        init {
            ta.isDisabled = true

            licences.apply {
                add(Gdx.files.internal(DIR_LICENCES + "apache 2.0.txt").readString())
                add(Gdx.files.internal(DIR_LICENCES + "CC BY 3.0.txt").readString())
                add(Gdx.files.internal(DIR_LICENCES + "CC BY-SA 3.txt").readString())
                add(Gdx.files.internal(DIR_LICENCES + "CC BY-SA 4.0.txt").readString())
                add(Gdx.files.internal(DIR_LICENCES + "CCO 1.0.txt").readString())
                add(Gdx.files.internal(DIR_LICENCES + "GFDL.txt").readString())
                add(Gdx.files.internal(DIR_LICENCES + "GPL.txt").readString())
                add(Gdx.files.internal(DIR_LICENCES + "MIT.txt").readString())
            }


            add(
                scrollPane
            ).expand().fill()

            row()

            addButton("!Next") {
                next()
            }

            addButton("!OK") {
                this.isVisible = false
            }

            setSize(this@MainMenu.stage.width, this@MainMenu.stage.height)
            isVisible = false
        }

        fun next() {
            index = ((index + 1) % licences.size)
            ta.text = licences[index]

            // TODO extract this bodge from W_Help into a util function.
            ta.sizeBy(0.1f)
            ta.sizeBy(-0.1f)
            stage.batch.begin()
            ta.draw(stage.batch, 0f)
            stage.batch.end()
            scrollPane.invalidate()
            scrollPane.layout()
        }
    }
}