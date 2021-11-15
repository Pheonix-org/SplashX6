package com.shinkson47.SplashX6.rendering.screens.game

import com.badlogic.gdx.scenes.scene2d.InputEvent
import com.badlogic.gdx.scenes.scene2d.ui.List
import com.badlogic.gdx.scenes.scene2d.ui.Table
import com.badlogic.gdx.scenes.scene2d.ui.TextButton
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener
import com.shinkson47.SplashX6.game.GameData
import com.shinkson47.SplashX6.game.GameHypervisor
import com.shinkson47.SplashX6.network.Server
import com.shinkson47.SplashX6.rendering.StageWindow
import com.shinkson47.SplashX6.rendering.windows.OptionsWindow
import com.shinkson47.SplashX6.rendering.windows.game.Spotify
import com.shinkson47.SplashX6.rendering.windows.game.units.W_UnitsList
import com.shinkson47.SplashX6.utility.Assets.SKIN

/**
 * # The menu bar used in-game to access tools, windows and more.
 */
class Menu(val _parent : GameScreen) : Table(SKIN) {

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

        addMenuItem(this, "Game", NOTHING,
                MenuSubItem("Preferences", WindowAction(OptionsWindow(_parent))) ,
                MenuSubItem("New Game")     { GameHypervisor.NewGame() } ,
                MenuSubItem("Load")         { GameHypervisor.load() } ,
                MenuSubItem("Quickload")    { GameHypervisor.quickload() } ,
                MenuSubItem("Save")         { GameHypervisor.save() } ,
                MenuSubItem("Quicksave")    { GameHypervisor.quicksave() } ,
                MenuSubItem("End Game")     { GameHypervisor.EndGame() }
        )



        addMenuItem(this, "Debug", WindowAction(com.shinkson47.SplashX6.utility.Debug.MainDebugWindow),
               MenuSubItem("Defog All") { GameData.world!!.defogAll() },
               MenuSubItem("Publish Game") {Server.boot()},
               MenuSubItem("Connect Locally") {com.shinkson47.SplashX6.network.Client.connect()}
        )


        addMenuItem(this, "Spotify", WindowAction(Spotify()),
                MenuSubItem("Play Pause")   { com.shinkson47.SplashX6.audio.Spotify.play() } ,
                MenuSubItem("Next")         { com.shinkson47.SplashX6.audio.Spotify.next() }
        )

        addMenuItem(this, "Warroom", {GameHypervisor.cm_toggle()},
                MenuSubItem("Manage Units")     { W_UnitsList() },
                MenuSubItem("View")             { GameHypervisor.unit_view() },
                MenuSubItem("View destination") { GameHypervisor.unit_viewDestination() },
                MenuSubItem("Set destination")  { GameHypervisor.unit_setDestination() },
                MenuSubItem("Disband")          { GameHypervisor.unit_disband() },
                )

        addMenuItem(this, "End Turn", { GameHypervisor.turn_end() })
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
    class MenuItem(val parentMenu: Menu, text: String, val action: Runnable, vararg subActions: MenuSubItem) : TextButton(text, SKIN, if (subActions.isEmpty()) "MenuItem" else "MenuItemList") {
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

        override fun constructContent() {}
        init {
            add(l)
                    .left()
                    .bottom()
                    .expand()
                    .grow()
            isVisible = false
            setPosition(0f, this@Menu.y - this.height)
            l.addListener(LambdaClickListener { select() })
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

    class MenuSubItem(val text : String, val action : Runnable) {
        override fun toString(): String = text
    }

    /**
     * # An menu action that controls a game-window.
     * When activated, toggles window visibility.
     *
     * Adds window to stage on init.
     */
    inner class WindowAction(val window : StageWindow) : Runnable {
        init {
            _parent.stage.addActor(window)
            window.isVisible = false
        }

        override fun run() {
            window.toggleShown()
        }
    }

    // ========================================================
    //#endregion            inner classes
    // ========================================================
    /**
     * # Adds an item to the menu.
     */
    fun addMenuItem(parentMenu: Menu, text: String, action: Runnable, vararg subActions: MenuSubItem) = addMenuItem(MenuItem(parentMenu,text,action, *subActions))
    fun addMenuItem(item : MenuItem) = add(item).height(HEIGHT).width(ITEM_WIDTH)

}