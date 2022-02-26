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
 ░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░*/

package com.shinkson47.SplashX6.rendering.renderers

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.Input
import com.badlogic.gdx.graphics.g2d.Batch
import com.badlogic.gdx.graphics.g2d.TextureAtlas
import com.badlogic.gdx.scenes.scene2d.Event
import com.badlogic.gdx.scenes.scene2d.InputEvent
import com.badlogic.gdx.scenes.scene2d.ui.*
import com.badlogic.gdx.scenes.scene2d.utils.FocusListener
import com.badlogic.gdx.utils.Align
import com.shinkson47.SplashX6.rendering.windows.NodeInfo
import com.shinkson47.SplashX6.utility.Assets
import com.shinkson47.SplashX6.utility.Assets.REF_SKIN_W95

/**
 * # A HUD renderer which displays some key bindings.
 * as an aid for user interaction, by showing what keys can be pressed.
 * @author [Jordan T. Gray](https://www.shinkson47.in) on 22/02/2022
 * @since PRE-ALPHA 0.0.2
 * @version 1
 */
class KeyBindRenderer : VerticalGroup() {


    @NodeInfo("Determines if keybindinds are displayed in-game.")
    var show : Boolean = isVisible
        set(value) {
            field = value
            isVisible = value
        }

    /**
     * ## Table containing bindings which is always shown.
     */
    val persistantTable = Table()

    /**
     * ## Table containing bindings which is only shown if CTRL is held.
     */
    val optionalTable = Table()

    /**
     * ## A collection of all shown bindings.
     * Used to update the sprite when the key is pressed.
     */
    val entries = ArrayList<entry>()

    init {
        this.align(Align.left)

        addActor(optionalTable)
        optionalTable.isVisible = false
        with (optionalTable) {
            add(this, "w", Input.Keys.W, "Move camera north")
            add(this, "a", Input.Keys.A, "Move camera west")
            add(this, "s", Input.Keys.S, "Move camera south")
            add(this, "d", Input.Keys.D, "Move camera east")

            add(this, "f11", Input.Keys.F11, "Toggle fullscreen")
            add(this, "shift", Input.Keys.SHIFT_LEFT, "Boost camera speed")
            add(this, "`", Input.Keys.GRAVE, "Get rid of all windows (buggy af)")
        }

        addActor(persistantTable)
        with(persistantTable) {
            add(this, "e", Input.Keys.E, "End Turn")
            add(this, "space", Input.Keys.SPACE, "Set destination on selected unit")
            add(this, "c", Input.Keys.C, "Focus camera on selected unit")
            add(this, "x", Input.Keys.X, "Control selected unit")
            add(this, "tab", Input.Keys.TAB, "Toggle warroom view")
        }

        addListener(object : FocusListener() {
            override fun handle(event: Event?): Boolean {
                if (event == null) return false;

                (event as InputEvent).let{
                    return when (event.type) {
                        InputEvent.Type.enter -> { optionalTable.isVisible = true; true}
                        InputEvent.Type.exit -> { optionalTable.isVisible = false; true }
                        else -> { super.handle(event) }
                    }
                }
            }
        })

        pack()
        setPosition(20f, 50f)
    }

    /**
     * # Adds a key binding to the display.
     *
     * @param t The table which it should be added to. Either [optionalTable] or [persistantTable]
     * @param spriteName Name of the sprite showing the key. matched in [Assets.keySprites]
     * @param key The key code to check for on every frame. Sprite is updated to '_down' varient if this key code is pressed.
     * @param string The text to display next to the sprite.
     */
    private fun add(t: Table, spriteName: String, key: Int, string: String) {
        entry(spriteName, key, string).apply {
            imageCell = t.add(up)
                .width(up.width)
                .height(32f)
                .padRight(15f)
                .padBottom(10f)

            entries.add(this)
        }

        t.add(Label(string, REF_SKIN_W95, "white").apply { setAlignment(Align.left) })
            .fill()
            .padBottom(10f)

        t.row()
    }

    /**
     * # Render
     *
     * @param batch Batch
     * @param parentAlpha Parent alpha
     */
    override fun drawChildren(batch: Batch?, parentAlpha: Float) {
        if (!isVisible) return;

        // Update entries for keys that are down.
        entries.forEach {
            if (Gdx.input.isKeyPressed(it.key))
                it.imageCell.setActor(it.down)
            else
                it.imageCell.setActor(it.up)
        }

        super.drawChildren(batch, parentAlpha)
    }


    /**
     * # Container with a single key binding entry in this hud.
     * Used to store both key states to update them later.
     *
     * @property key The keycode that will change the sprite state.
     * @property string The text shown to the user that explained what the binding does.
     * @constructor Create [entry]
     *
     * @param spriteName
     */
    inner class entry(spriteName: String, val key: Int, val string: String) {

        /**
         * ## The texture shown when [key] is pressed.
         */
        val down: Image = Image(Assets.get<TextureAtlas>(Assets.SPRITES_KEYS).findRegion("${spriteName}_down"))

        /**
         * ## The texture shown when [key] is not pressed.
         */
        val up: Image = Image(Assets.get<TextureAtlas>(Assets.SPRITES_KEYS).findRegion(spriteName))

        /**
         * ## The table cell into which the appropriate texture will be displayed.
         */
        lateinit var imageCell : Cell<Image>
    }
}