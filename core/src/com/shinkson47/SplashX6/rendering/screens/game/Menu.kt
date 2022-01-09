package com.shinkson47.SplashX6.rendering.screens.game

import com.badlogic.gdx.scenes.scene2d.InputEvent
import com.badlogic.gdx.scenes.scene2d.ui.List
import com.badlogic.gdx.scenes.scene2d.ui.Table
import com.badlogic.gdx.scenes.scene2d.ui.TextButton
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener
import com.shinkson47.SplashX6.game.GameData
import com.shinkson47.SplashX6.game.GameHypervisor
import com.shinkson47.SplashX6.game.cities.Production
import com.shinkson47.SplashX6.game.units.UnitClass
import com.shinkson47.SplashX6.network.Server
import com.shinkson47.SplashX6.rendering.StageWindow
import com.shinkson47.SplashX6.rendering.windows.MessageWindow
import com.shinkson47.SplashX6.rendering.windows.OptionsWindow
import com.shinkson47.SplashX6.rendering.windows.TerrainGenerationEditor
import com.shinkson47.SplashX6.rendering.windows.game.Music
import com.shinkson47.SplashX6.rendering.windows.game.W_Settlements
import com.shinkson47.SplashX6.rendering.windows.game.Spotify
import com.shinkson47.SplashX6.rendering.windows.game.units.W_UnitsList
import com.shinkson47.SplashX6.utility.Assets.SKIN
import com.shinkson47.SplashX6.utility.Debug.DebugWindow
import com.shinkson47.SplashX6.utility.Utility.local

/**
 * # The menu bar used in-game to access tools, windows and more.
 */
class Menu(val _parent : GameScreen) : Table(SKIN) {
    // TODO raise drop down to top
    companion object {
        /**
         * # The height of a menu bar and it's contents
         */
        const val HEIGHT = 80f


        /**
         * # The minimum width of all menu items.
         */
        const val ITEM_WIDTH = 80f

        val NOTHING = _NOTHING()
        class _NOTHING : Runnable { override fun run() {} }
    }

    /**
     * # A Window used to display sub items.
     */
    val subActionMenu = SubActionMenu()

    init {
        //TODO localisation
        //TODO Tooltips
        setPosition(0f, _parent.height - HEIGHT)    // Move to top of screen
        setSize(_parent.width, HEIGHT)                    // Fill width
        center()                                         // Display all contents in the middle.

        // Set color
        //setBackground(SKIN.getDrawable("widet10"))
        _parent.stage.addActor(subActionMenu)


        // =========================================================
        //              Menu bar construction.
        // =========================================================

        addMenuItem(this, "generic.game.game", NOTHING,
                MenuSubItem("generic.any.options", WindowAction(OptionsWindow(_parent))) ,
                MenuSubItem("generic.game.new")         { GameHypervisor.NewGame() } ,
                MenuSubItem("generic.game.load")        { GameHypervisor.load() } ,
                MenuSubItem("generic.game.quickload")   { GameHypervisor.quickload() } ,
                MenuSubItem("generic.game.save")        { GameHypervisor.save() } ,
                MenuSubItem("generic.game.quicksave")   { GameHypervisor.quicksave() } ,
                MenuSubItem("generic.game.end")         { GameHypervisor.EndGame() }
        )

        addMenuItem(this, "!Debug", WindowAction(DebugWindow()),
                MenuSubItem("!Defog All") { GameData.world!!.removeFogOfWar() },
                MenuSubItem("!World Generation", WindowAction(TerrainGenerationEditor())),
                MenuSubItem("!Publish Game") {Server.boot()},
                MenuSubItem("!Connect Locally") {com.shinkson47.SplashX6.network.Client.connect()},
                MenuSubItem("!Show a message") {MessageWindow("Hello", "Everything is fine :)")},
                MenuSubItem("!Show an error") { MessageWindow("Fuck you", "Everything is broken", true)},

                MenuSubItem("!Add a production project") { GameData.player!!.cities[0].production.queue(Production.UnitProductionProject(UnitClass.chariot)) }
        )


        addMenuItem(this, "specific.windows.music.spotify", WindowAction(Spotify()),
                MenuSubItem("meta.pseudographic.playPause")         { com.shinkson47.SplashX6.audio.Spotify.play() } ,
                MenuSubItem("meta.pseudographic.next")              { com.shinkson47.SplashX6.audio.Spotify.next() },
                MenuSubItem("meta.pseudographic.previous")          { com.shinkson47.SplashX6.audio.Spotify.previous() },
                MenuSubItem("!Built-In", WindowAction(Music())),
                MenuSubItem("specific.windows.music.connect") { com.shinkson47.SplashX6.audio.Spotify.create() }
        )

        addMenuItem(
            this, "specific.menubar.warroom", { GameHypervisor.cm_toggle() },
            MenuSubItem("generic.game.settlements") { W_Settlements() },
            MenuSubItem("generic.game.units") { W_UnitsList() },
            MenuSubItem("specific.windows.units.view") { GameHypervisor.unit_view() },
            MenuSubItem("specific.windows.units.viewDestination") { GameHypervisor.unit_viewDestination() },
            MenuSubItem("specific.windows.units.setDestination") { GameHypervisor.unit_setDestination() },
            MenuSubItem("specific.windows.units.disband") { GameHypervisor.unit_disband() },
        )

        addMenuItem(this, "generic.game.endTurn", { GameHypervisor.turn_end() })
    }




    // ========================================================
    //#endregion            inner classes
    // ========================================================

    /**
     * # A menu item
     * On the the main menu bar, this shows as a single button.
     * This menu item may have multiple sub actions,
     * but it also performs an action by itself.
     */
    // TODO image instead, tooltip, sub actions
    class MenuItem(val parentMenu: Menu, key: String, val action: Runnable, vararg subActions: MenuSubItem) : TextButton(local(key), SKIN, if (subActions.isEmpty()) "MenuItem" else "MenuItemList") {
        val subActions = subActions as Array<MenuSubItem>

        init {
            addListener(MenuItemClickListener())
        }

        /**
         * # A click listener which defines the click behaviour of a menu item.
         * including the manipulation of the sub action menu.
         *
         * If the sub action menu is open, click is cancelled. It is assumed
         * the user is trying to close the menu.
         */
        inner class MenuItemClickListener() : ClickListener() {

            override fun touchDown(event: InputEvent?, x: Float, y: Float, pointer: Int, button: Int): Boolean {
                return if (super.touchDown(event, x, y, pointer, button)) { // If touched inside button,
                    if (subActions.isEmpty()) return true
                       with (parentMenu.subActionMenu) {
                            if (isVisible) {        // If already showing
                                hide()
                                cancel()
                            } else
                                show(subActions, this@MenuItem)    // Otherwise, show.
                       }
                            true
                        } else
                            false
            }

            /**
             * On release, hides the menu if the mouse is still over the menu button.
             *
             * If the user moved the mouse elsewhere before releasing, keep the menu open
             * so they can interact with it.
             */
            override fun touchUp(event: InputEvent?, x: Float, y: Float, pointer: Int, button: Int) {
                super.touchUp(event, x, y, pointer, button)

                if (isOver && action != NOTHING)
                    parentMenu.subActionMenu.hide()
            }

            /**
             * If the button is down-up clicked, perform the default action.
             */
            override fun clicked(event: InputEvent?, x: Float, y: Float) = action.run()
        }
    }

    /**
     * # A small [StageWindow] that displays menu sub actions.
     */
    inner class SubActionMenu() : StageWindow() {
        // TODO change list items to a subitem class.
        /**
         * # A list view used to hold and show the items.
         */
        val l = List<MenuSubItem>(SKIN)

        init {
            add(l)
                    .left()
                    .bottom()
                    .expand()
                    .grow()
            isVisible = false
            setPosition(0f, this@Menu.y - this.height)
            l.addListener(LambdaClickListener { select() })
            unDock(this)
        }

        /**
         * # Sets the items that the window is showing.
         * Replaces anything already being displayed,
         * and resizes the window to fit the new content.
         */
        fun set(i : Array<MenuSubItem>) {
            l.items.clear()
            i.forEach { l.items.add(it) }
            invalidate()
        }

        /**
         * # [set]'s the items, and shows the window.
         */
        fun show(subActions: Array<MenuSubItem>, menuItem: MenuItem) {
            set(subActions)

            isVisible = true
            //setSize(minWidth, minHeight)
            setSize(200f, 200f)
            //pack()
            // This shit doesn't work. Let's make a work around.

            // Attempted to workaround by simulating a resize, since they
            // cause it to resize correctly. It made no difference.
//            this.listeners.forEach {
//                if(it is InputListener)
//                    it.touchDragged(null,0f,0f,0)
//            }

            setPosition(menuItem.x, this@Menu.y - this.height)
        }

        /**
         * # Hides the window.
         * I hoped this one would explain itself...
         */
        fun hide() {
            isVisible = false
        }

        /**
         * # Runs the selected item, then hides.
         * If no item is selected, has no effect.
         */
        fun select() {
            if (l.selected == null) return
            l.selected.action.run()
            hide()
        }
    }

    class MenuSubItem(val key : String, val action : Runnable) {
        override fun toString(): String = local(key)
    }

    /**
     * # An menu action that controls a game-window.
     * When activated, toggles window visibility.
     *
     * Adds window to stage on init.
     */
    inner class WindowAction(val window : StageWindow) : Runnable {
        init {
            window.isVisible = false
        }

        override fun run() {
            window.toggleShown()
            window.toFront()
        }
    }

    // ========================================================
    //#endregion            inner classes
    // ========================================================
    /**
     * # Adds an item to the menu.
     */
    fun addMenuItem(parentMenu: Menu, key: String, action: Runnable, vararg subActions: MenuSubItem) = addMenuItem(MenuItem(parentMenu,key,action, *subActions))
    fun addMenuItem(item : MenuItem) = add(item).height(HEIGHT).width(ITEM_WIDTH)

}