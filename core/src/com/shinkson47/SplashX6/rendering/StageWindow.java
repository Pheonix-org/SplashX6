package com.shinkson47.SplashX6.rendering;

import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.*;
import com.badlogic.gdx.scenes.scene2d.utils.ChangeListener;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.scenes.scene2d.utils.Drawable;
import com.badlogic.gdx.utils.Align;
import com.shinkson47.SplashX6.Client;
import com.shinkson47.SplashX6.audio.AudioController;
import com.shinkson47.SplashX6.game.GameHypervisor;
import com.shinkson47.SplashX6.utility.TurnHook;
import com.shinkson47.SplashX6.utility.Utility;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import static com.shinkson47.SplashX6.audio.AudioController.GUI_SOUND;
import static com.shinkson47.SplashX6.utility.Assets.SKIN;
import static com.shinkson47.SplashX6.utility.Utility.local;
import static java.lang.System.gc;

/**
 * <h1>Splash X6's in-game GUI window.</h1>
 * <br/><br/>
 * Splash uses Stage 2d with utilities to make window
 * creation and management easier.
 * <br/><br/>
 * Windows are added to the game screen automatically when created. <br/>
 * see StageWindow#post(StageWindow)
 * <br/><br/>
 * TODO When entering from the main menu, loads of windows are posted.
 * <br/>
 * TODO no concideration for posting on screens other than the game screen.
 * @author <a href="https://www.shinkson47.in">Jordan T. Gray on 22/04/2021</a>
 * @version 2
 * @since v1
 */
public abstract class StageWindow extends Window implements TurnHook {

    //=====================================================================
    //#region Companion
    //=====================================================================

    /**
     * <h2>A style used on lables to create a horizontal line.</h2>
     * Simply just a foreground colored label
     */
    public static final Label.LabelStyle seperatorStyle;
    /**
     * Light colored drawable background. Used in custom labels and whatnot that
     * are used as seperators.
     * <p>
     * Is the same color as the Client 'hr', 'hg', 'b', 'a'
     */
    public static final Drawable lightBG;

    static {
        seperatorStyle = new Label.LabelStyle(new Label("", SKIN).getStyle());
        Pixmap labelColor = new Pixmap(200, 200, Pixmap.Format.RGB888);
        labelColor.setColor(Client.hr, Client.hg, Client.b, Client.a);
        labelColor.fill();
        lightBG = new Image(new Texture(labelColor)).getDrawable();
        seperatorStyle.background = lightBG;
    }

    //=====================================================================
    //#endregion Companion
    //#region Game Window Management
    //=====================================================================

    /**
     * # All windows that have been posted to the game screen.
     * @see StageWindow#post(StageWindow)
     */
    private static ArrayList<StageWindow> GAME_WINDOWS = new ArrayList();

    /**
     * A select box shown on the game screen containing all game windows.
     */
    private static final SelectBox<StageWindow> WINDOW_DOCK = new SelectBox(SKIN);
    static {
        WINDOW_DOCK.setPosition(0f, 0f);
        WINDOW_DOCK.addListener(new StageWindow.LambdaChangeListener(o -> {
            WINDOW_DOCK.getSelected().setVisible(true);
            WINDOW_DOCK.toFront();
        }));
    }

    public static ArrayList<StageWindow> getGameWindows() {return GAME_WINDOWS;}
    public static SelectBox<StageWindow> getWINDOW_DOCK() {return WINDOW_DOCK;}

    /**
     * Registers a window for management, and displays it
     * in the game.
     *
     * Is not in-game, has no effect.
     *
     * Windows must be added to the screen manually for now.
     */
    public static void post(StageWindow sw) {
        if (!GameHypervisor.getInGame()) return;
        Stage s = GameHypervisor.getGameRenderer().stage;
        s.addActor(sw);

        // IMPLEMENT a way for the user to configure where windows are created.
        sw.setPosition(s.getWidth() * 0.5f, s.getHeight() * 0.5f, Align.center);

        dock(sw);

        WINDOW_DOCK.setItems(GAME_WINDOWS.toArray(new StageWindow[0]));
        WINDOW_DOCK.pack();
    }

    /**
     * Removes a window from management, and from the game screen.
     *
     * Called by 'clear', which actually decomposes the window.
     * This does not modify the window.
     */
    public static void unPost(StageWindow sw) {
        sw.getStage().getActors().removeValue(sw, true);
        unDock(sw);
    }

    /**
     * Calls 'clear' on all posted windows, decomposing them
     * and unPosting them.
     */
    public static void unPostAll() {
        for (StageWindow sw : WINDOW_DOCK.getItems()) {
            WINDOW_DOCK.getItems().removeValue(sw, true);
            sw.clear();
            gc();
        }
    }

    /**
     * Adds a window to the list of posted windows,
     * but does not post it to a stage.
     * @deprecated The dock should not normally be manipulated.
     */
    @Deprecated
    public static void dock(StageWindow sw) {
        GAME_WINDOWS.add(sw);
    }

    /**
     * Removes a window from the list of posted windows,
     * but does not modify.it
     * @deprecated The dock should not normally be manipulated.
     */
    @Deprecated
    public static void unDock(StageWindow sw) {
        GAME_WINDOWS.remove(sw);
    }

    //=====================================================================
    //#endregion Game Window Management
    //#region fields
    //=====================================================================

    /**
     * Cells in this window that should span the entire all columns
     */
    private final ArrayList<Cell> spannedCells = new ArrayList<>();

    /**
     * The name of this window, placed into the top
     * of the window and used to reffer to it.
     */
    private String title;
    public String getTitle() { return title; }

    /**
     * When true, clicking the close button does not close the window
     * but just hides it.
     *
     * True by default, to match the functionality of the in-game
     * menu bar window management which toggles visibility.
     * We don't want to actually destroy and close the window,
     * just hide it.
     */
    private boolean dontClose = true;

    //=====================================================================
    //#endregion fields
    //#region constructors
    //=====================================================================

    public StageWindow() {
        this("");
    }
    public StageWindow(String key) {
        this(key, "");
    }
    public StageWindow(String key, String style) {
        this(key, style, true);
    }
    public StageWindow(String key, Boolean visible) {
        this(key, "", visible);
    }
    public StageWindow(String key, String style, Boolean visible) {
        this(key, style, visible, true);
    }
    public StageWindow(String key, String style, Boolean visible, Boolean resizable) {
        super("", SKIN);
        this.title = key;
        if (!style.equals("")) setStyle(SKIN.get(style, WindowStyle.class));

        center();
        placeTitle(style, key);
        setResizable(resizable);
        setVisible(visible);
        updateColSpans();
        GameHypervisor.turn_hook(this);
        post(this); // TODO no consideration for posting on other stages on creation. We might not want a window on the game screen.
    }

    //=====================================================================
    //#endregion constructors
    //#region api extention
    //=====================================================================

    /**
     * <h2>Places a label on the provided window to act as the window title.</h2>
     *
     * @param windowStyle The style of the window, determines the placement and style of heading used.
     * @param key       The title text
     */
    protected void placeTitle(String windowStyle, String key) { placeTitle(this, windowStyle, key); }
    protected static void placeTitle(Window w, String windowStyle, String key) { placeTitle(w, windowStyle, key, true); }
    protected static void placeTitle(Window w, String windowStyle, String key, Boolean close) {
        w.padTop(30f);
        if (key.equals("")) return;   // If there's no title, do nothing

        w.getTitleTable().reset();      // Start from fresh

        Label label;

        // If using a dialog
        if (windowStyle.equals("dialog") || windowStyle.equals("dialog-modal")) {
            // Use plain upper, with 'title' style class (which wraps in '[]' and opaque bg to cover window border.)
            label = new Label(local(key).toUpperCase(), SKIN, "title");
        } else {
            label = new Label(local(key).toUpperCase(), SKIN); // TODO this text needs to be white. Not sure why it isn't atm.
            w.getTitleTable().add(label).expandX();

            // IMPLEMENT a way for the user to configure which side the buttons are placed on.
            // FIXME the buttons don't match the forehead size
            // Buttons
            w.getTitleTable().add(button("meta.pseudographic.pack", o -> {w.pack();}));

            if (close)
                w.getTitleTable()
                        .add(button("meta.pseudographic.close", o -> {
                            if (w instanceof StageWindow && ((StageWindow)w).dontClose)
                                ((StageWindow)w).toggleShown();
                            else
                                w.clear();
                        }))
                        .right();

            w.getTitleTable().row();
            w.getTitleTable().align(Align.right);
        }
    }

    /**
     * Creates a localized label.
     */
    protected Cell<Label> label(String key){
        return label(key, this);
    }
    public static Cell<Label> label(String key, Table t){ return label(key, t, "default"); }
    public static Cell<Label> label(String key, Table t, String style){
        return t.add(new Label(local(key), SKIN, style)).padTop(20f);
    }

    /**
     * Creates a localized checkbox
     */
    public static CheckBox checkBox(String key, Table t) {
        CheckBox c = new CheckBox(local(key), SKIN);
        t.add(c).padTop(20f);
        return c;
    }

    /**
     * <h2>Creates and a button that shows a table in a cell when clicked.</h2>
     *
     * @param contentCell The cell to display the content
     * @param content     The content of the tab
     * @param name        The text to be displayed in the button
     * @return the button
     */
    protected static TextButton tab(Cell contentCell, Table content, String name) {
        return button(name, e -> {
            contentCell.setActor(content);
            contentCell.fill().expand().center();
        });
    }

    /**
     * <h2>Attaches a consumer to an actor via a {@link LambdaClickListener}</h2>
     *
     * @param actor    The actor
     * @param consumer The action
     * @return The actor
     */
    protected static Actor onClick(Actor actor, Consumer consumer) {
        actor.addListener(new LambdaClickListener(consumer));
        return actor;
    }

    /**
     * <h2>Applies padding and fill to cells used in a menu style table</h2>
     * Used in-game on buttons at the top of the screen.
     */
    public static Cell applyMenuStyling(Cell actor) {
        return actor.fill()
                .center()
                .padTop(2)
                .padLeft(15)
                .padRight(15);
    }

    /**
     * Shows a modal dialog on the same stage as this window.
     *
     * @param title The title of the dialog window
     * @param text  The body content of the dialog
     */
    protected void dialog(String title, String text) {
        dialog(title, text, "");
    }

    /**
     * Shows a modal dialog on the same stage as this window with a button that returns true.
     *
     * @param title    The title of the dialog window
     * @param text     The body content of the dialog
     * @param positive The text shown in the positive button. If empty, shows "OK!"
     */
    protected void dialog(String titleKey, String textKey, String positive) {
        dialog(titleKey, textKey, positive, "");
    }

    /**
     * Shows a modal dialog on the same stage as this window with a button that returns true, and another that returns false.
     *
     * @param title    The title of the dialog window
     * @param text     The body content of the dialog
     * @param positive The text shown in the positive button. If empty, shows "OK!"
     * @param negative The text shown in the negative button. If empty, no button is added.
     */
    protected void dialog(String titleKey, String textKey, String positive, String negative) {
        dialog(titleKey, textKey, positive, negative, null);
    }

    /**
     * Shows a modal dialog on the same stage as this window with a button that returns true, and another that returns false.
     *
     * @param title         The title of the dialog window
     * @param text          The body content of the dialog
     * @param positive      The text shown in the positive button. If empty, shows "OK!"
     * @param negative      The text shown in the negative button. If empty, no button is added.
     * @param resultHandler The handler which handles the button press. If null, no handler is added.
     */
    public void dialog(String titleKey, String textKey, String positive, String negative, Consumer<Boolean> resultHandler, Actor... actors) {
        dialog(this, titleKey, textKey, positive, negative, resultHandler, actors);
    }


    // TODO change all strings to keys fetches
    // TODO test the dialog. Fairly sure it's broken after changing the theme.
    public static void dialog(Actor actor, String titleKey, String textKey, String positive, String negative, Consumer<Boolean> resultHandler,
        Actor... actors
    ) {
        if (actor.getStage() == null)
            throw new NullPointerException("Tried to show a dialog, but the caller was not on a stage.");

        // Construct dialog, that gives the result to the handler
        Dialog dialog = new Dialog("", SKIN) {
            protected void result(Object object) {
                if (resultHandler != null)
                    resultHandler.accept((object == null) ? false : (boolean) object);
            }
        };

        placeTitle(dialog, "", titleKey);

        // Format and add content.
        dialog.getContentTable().padTop(30).padBottom(30);
        dialog.text(local(textKey));
        dialog.row();
        dialog.add(actors);

        // If text is provided, add corresponding buttons and handler.

        if (!positive.equals(""))
            dialog.button(positive, true);
            // TODO Localise
        else dialog.button("OK!");

        if (!negative.equals(""))
            dialog.button(negative, false);

        dialog.show(actor.getStage());
    }

    /**
     * <h2>Creates and adds a button which fills the row</h2>
     * Used in most places, ideal for lists of buttons.
     * <p>
     * Once the button is added, automatically moves to the next row.
     *
     * @param Key Text contained in the button
     * @param e    Function of the button
     * @return the button created
     */
    protected TextButton addButton(String Key, Consumer<LambdaClickListener> e) { return addButton(Key, true, e); }
    protected TextButton addButton(String Key, boolean newRow, Consumer<LambdaClickListener> e) { return addButton(Key, newRow, false, e); }
    protected TextButton addButton(String Key, boolean newRow, boolean span, Consumer<LambdaClickListener> e) {
        TextButton b = button(Key, e);
        Cell c = add(b).expandX().fillX();
        if (span) span(c);
        if (newRow) row();
        clickSound(b);
        return b;
    }

    /**
     * <h2>Creates a button with a listener</h2>
     *
     * @param key key of local text to put in button
     * @param e    Function of the button
     * @return the button created
     */
    public static TextButton button(String key, Consumer<?> e) {
        TextButton b = new TextButton(local(key), SKIN);
        onClick(b, e);
        return b;
    }

    /**
     * Adds a click listener that plays a sound when clicked.
     * @see AudioController#GUI_SOUND
     * @param actor
     * @return
     */
    private Actor clickSound(Actor actor) {
        actor.addListener(GUI_SOUND);
        return actor;
    }

    /**
     * <h2>Adds a new row containing the provided actors</h2>
     *
     * @param actors The actors to be in this row.
     */
    protected Cell row(Actor... actors) {
        row();
        return add(actors).row();
    }

    /**
     * Centers a window in it's current state on it's stage
     */
    public void centerStage() {
        int _alignment = getAlign();
        align(Align.center);
        setPosition(
                Utility.center(getStage().getWidth(), getWidth()),
                Utility.center(getStage().getHeight(), getHeight())
        );
        align(_alignment);
    }

    /**
     * <h2>Adds a collection of tabs to this window</h2>
     *
     * @param contentCell The cell that will display the currently selected tab.
     * @param tables      Tables of content for each tab.
     * @param name        The name of each tab. This will be displayed in the tab's button.
     * @return The table containing all of the tab buttons.
     */
    protected Table tabs(Cell contentCell, List<Table> tables, List<String> name) {
        assert (tables.size() == name.size());

        Table tabs = new Table();

        // for every tab table, add a button for it.
        int i = 0;
        for (Table t : tables) {
            expandfill(
                    tabs.add(
                            tab(contentCell, t, name.get(i)
                            )
                    ).bottom()
            ).maxHeight(50).minHeight(50);
            i++;
        }

        // Add the tab selector buttons to the top of the window.
        getTitleTable().padTop(135).add(tabs);

        // Expand and populate the content cell, using the first tab's content.
        expandfill(contentCell);
        contentCell.setActor(tables.get(0));

        // return the row of buttons, not the new row.
        return tabs;
    }

    /**
     * <h2>Performs {@link Cell#fill()} and {@link Cell#expand()} on the actor</h2>
     */
    protected <T extends Cell> T expandfill(T actor) {
        actor.fill().expand();
        return actor;
    }

    /**
     * <h2>Creates a gap between the current row and the next</h2>
     */
    protected StageWindow seperate() {
        return seperate("");
    }

    /**
     * <h2>Adds a label and a horizontal line with a good ammount of space above and below to seperate content in a column</h2>
     */
    protected StageWindow seperate(String key) {
        seperate(this, key);
        return this;
    }

    /**
     * dumb compromise that allows statically seperating a table that isn't directly the stage window.
     */
    public static void seperate(Table t, String key) {
        t.row();
        // Create a label that will be the header
        Label l = new Label((key.isEmpty()) ? key : local(key), SKIN);

        hsep(t)
                .padTop(10)
                .row();

        // Add and adjust title
        t.add(l)
                .colspan(t.getColumns())
                .padTop(10)
                .row();

    }

    /**
     * <h2>Adds a horizontal seperation line</h2>
     *
     * @return The cell containing the horizontal seporator.
     */
    protected Cell hsep() { return span(hsep(this)); }
    protected static Cell hsep(Table t) {
        t.row();
        Cell c = t.add(new Label("", seperatorStyle)).height(3);
        c.padTop(3);
        c.padBottom(3);
        c.colspan(t.getColumns());
        t.row();
        return c;
    }

    /**
     * Adds a tooltip to the last actor added to this window.
     * <br/>
     * Call directly after an add, and it <i>should</i> figure out the actor.
     * @param key key to local text to display
     * @return
     */
    public final Actor tooltip(String key){
        return tooltip(getCells().get(getCells().size-1).getActor(), local(key));
    }

    /**
     * Adds a tooltip the the actor
     * @param t The actor
     * @param s The message
     * @return t
     */
    public static final Actor tooltip(Actor t, String s){
        t.addListener(new TextTooltip(s, SKIN));
        return t;
    }

    /**
     * Adds a list in a scrollable pane of a fixed height
     */
    protected void addList(com.badlogic.gdx.scenes.scene2d.ui.List<?> list, String tooltipKey) {
        ScrollPane sp = new ScrollPane(list, SKIN);
        add(sp).fillX();
        tooltip(tooltipKey);
        getCell(sp).height(100f);
        row();
    }

    /**
     * Logs the provided cell to be modified to span all columns of the window table.
     * <p>
     * Calling 'updateColSpans' will call colspan with the current column count
     * for all cells added.
     * @apiNote NB : The cell is spanned to the current column count, but is not automatically modified when the table is changed.
     * @see StageWindow#updateColSpans()
     */
    protected Cell span(Actor actor) { return span(getCell(actor)); }
    protected Cell span(Cell c) {
        spannedCells.add(c);
        c.expandX().fillX();
        //c.colspan(Math.max(getColumns() - 1, 1)); // STOPSHIP this does not match the update col span.
        row();
        return c;
    }

    /**
     * Updates all cells which should span all columns with the current number of columns.
     */
    protected void updateColSpans() {
        for (Cell c : spannedCells)
            c.colspan(Math.max(getColumns(), 1));
        pack();
    }

    //=====================================================================
    //#endregion api extension
    //#region misc functions
    //=====================================================================

    @Override
    public String toString() { return title; }

    /**
     * Used as an alias for close / dispose, since there was no dispose method available to override.
     * <p>
     *    upPost's and unHook's this window,
     *    performs 'onClose',
     *    and then calls super.clear to decompose  the window.
     * </p>
     */
    @Override
    public final void clear() {
        GameHypervisor.turn_unhook(this);
        onClose();

        unPost(this);
        super.clear();
    }

    /**
     * Notification for implementation.
     *
     * This window is being closed & disposed.
     */
    protected void onClose() {}

    /**
     * Inverts 'isVisible'.
     * <p>
     * Determines if this window is rendered and updated.
     */
    public void toggleShown() {
        setVisible(!isVisible());
    }

    /**
     * Indicates that this window should not close, but instead just hide
     * when the user clicks 'x'.
     * <p>
     * Useful for the functionality of the in-game menu system, where windows
     * are toggled in visibility, and not disposed and re-created
     * every time the user wants to see them.
     *
     * @apiNote This state is the default.
     */
    public void dontClose() { dontClose = true; }

    /**
     * Indicates that when the user clicks 'x',
     * the window should be decomposed via 'clear'.
     */
    // TODO the new small windows that are not a part of the menu need to call this.
    public void allowClose() { dontClose = false; }

    @Override
    public void onTurn() { refresh(); }

    // I hate this, it re-implements but java would require every window to implement it. idk man.

    @Override public void run() { doOnTurn(); }
    @Override public void doOnTurn() { onTurn(); }

    /**
     * Optional notification to implementation.
     *
     * the turn has ended, update if you need to.
     */
    protected void refresh() {}

    //=====================================================================
    //#endregion
    //#region useful stuff
    //=====================================================================

    /**
     * <h2>Accepts a consumer to use when clicking a button, instead of an entire click listener class</h2>
     * This exists to shorten the required lines needed to make a button do something. Before you had to
     * define an entire implementation class of clickListenener, now just use a consumer.
     */
    public static class LambdaClickListener extends ClickListener {
        private Consumer<ClickListener> c;
        public InputEvent event;

        public LambdaClickListener(Consumer<ClickListener> consumer) {
            c = consumer;
        }

        @Override
        public void clicked(InputEvent event, float x, float y) {
           this.event = event;
            c.accept(this);
        }
    }

    public static class LambdaChangeListener extends ChangeListener {
        private Consumer<ChangeListener> c;
        public ChangeEvent event;

        public LambdaChangeListener(Consumer<ChangeListener> consumer) {
            c = consumer;
        }

        /**
         * @param event
         * @param actor The event target, which is the actor that emitted the change event.
         */
        @Override
        public void changed(ChangeEvent event, Actor actor) {
            this.event = event;
            c.accept(this);
        }
    }

    //=====================================================================
    //#endregion
    //=====================================================================
}