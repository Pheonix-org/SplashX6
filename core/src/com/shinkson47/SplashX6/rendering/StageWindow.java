package com.shinkson47.SplashX6.rendering;

import com.badlogic.gdx.Gdx;
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
import com.shinkson47.SplashX6.utility.Assets;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import static com.shinkson47.SplashX6.audio.AudioController.GUI_SOUND;
import static com.shinkson47.SplashX6.utility.Utility.local;

/**
 * <h1>A LibGDX Window with some extended functionality </h1>
 *
 * @author <a href="https://www.shinkson47.in">Jordan T. Gray on 22/04/2021</a>
 * @version 1
 * @since v1
 */
public abstract class StageWindow extends Window {

    //=====================================================================
    //#region fields
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
        seperatorStyle = new Label.LabelStyle(new Label("", Assets.SKIN).getStyle());
        Pixmap labelColor = new Pixmap(200, 200, Pixmap.Format.RGB888);
        labelColor.setColor(Client.hr, Client.hg, Client.b, Client.a);
        labelColor.fill();
        lightBG = new Image(new Texture(labelColor)).getDrawable();
        seperatorStyle.background = lightBG;
    }

    /**
     * Cells in this window that should span the entire window's width
     * (all columns)
     */
    private final ArrayList<Cell> spannedCells = new ArrayList<>();
    /**
     * # State var, implementations can use to ignore first [constructContent]
     * Since [constructContent] occours in the super constructor, forward references
     * are possible and annoying.
     * <p>
     * Instead, you can have the [constructContent] ignore the super, and invoke it yourself.
     * <p>
     * ```
     * public someWindow() {
     * super();
     * constructContent();
     * }
     *
     * @Override protected constructContent() {
     * if (FIRST_CONSTRUCTION) return;
     * ...
     * }
     * ```
     */
    // TODO kotlin style docs
    protected boolean FIRST_CONSTRUCTION = true;
    /**
     * Last known number of columns in this window
     */
    private int lastSpan = 1000;

    public String title;

    private boolean dontClose = false;


    //=====================================================================
    //#endregion fields
    //#region constructors
    //=====================================================================


    public StageWindow() {
        this("");
    }

    public StageWindow(String title) {
        this(title, "");
    }

    public StageWindow(String title, String style) {
        this(title, style, true);
    }

    public StageWindow(String title, Boolean visible) {
        this(title, "", visible);
    }

    public StageWindow(String title, String style, Boolean visible) {
        this(title, style, visible, true);
    }

    public StageWindow(String title, String style, Boolean visible, Boolean resizable) {
        super("", Assets.SKIN);
        this.title = title;
        if (!style.equals("")) setStyle(Assets.SKIN.get(style, WindowStyle.class));


        center();

        placeTitle(style, title);

        constructContent();

        pack();
        setPosition(Gdx.graphics.getWidth() / 2 - this.getWidth() / 2, Gdx.graphics.getHeight() / 2 - this.getHeight() / 2);

        setResizable(resizable);
        setVisible(visible);
        FIRST_CONSTRUCTION = false;
    }


    //=====================================================================
    //#endregion constructors
    //#region api extention
    //=====================================================================

    // TODO change all strings to keys fetches

    public static void dialog(Actor actor, String title, String text, String positive, String negative, Consumer<Boolean> resultHandler) {
        if (actor.getStage() == null)
            throw new NullPointerException("Tried to show a dialog, but the caller was not on a stage.");

        // Construct dialog, that gives the result to the handler
        Dialog dialog = new Dialog("", Assets.SKIN, "dialog-modal") {
            protected void result(Object object) {
                if (resultHandler != null)
                    resultHandler.accept((boolean) object);
            }
        };

        // Clear the canvas to create a custom title
        //        dialog.getTitleTable().reset();

        // TODO use util for title
        // Format and add title.
        //        Label lblTitle = new Label(title, Assets.SKIN, "title");
        //        lblTitle.setAlignment(Align.bottom);
        //        dialog.getTitleTable().add(lblTitle).expand();
        placeTitle(dialog, "dialog-modal", title);

        // Format and add content.
        dialog.getContentTable().padTop(30).padBottom(30);
        dialog.text(text);

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
     * <h2>Places a label on the provided window to act as the window title.</h2>
     *
     * @param windowStyle The style of the window, determines the placement and style of heading used.
     * @param title       The title text
     */
    protected static void placeTitle(Window w, String windowStyle, String title) {
        placeTitle(w, windowStyle, title, true);
    }

    protected static void placeTitle(Window w, String windowStyle, String title, Boolean close) {
        // If there's no title, do nothing
        if (title.equals("")) return;

        // Start from fresh
        w.getTitleTable().reset();

        Label label;

        // If using a dialog
        if (windowStyle.equals("dialog") || windowStyle.equals("dialog-modal")) {
            // Use plain upper, with 'title' style class (which wraps in '[]' and opaque bg to cover window border.)
            label = new Label(title.toUpperCase(), Assets.SKIN, "title");
        } else {
            label = new Label(title.toUpperCase(), Assets.SKIN);

            // Move down into window
            w.getTitleTable().padTop(85);

            // Add a close button at top border
            if (close)
            w.getTitleTable()
                    .add(button("close", o -> {
                        if (w instanceof StageWindow && ((StageWindow)w).dontClose)
                            ((StageWindow)w).toggleShown();
                            else {
                                w.clear();
                                w.getStage().getActors().removeValue(w, true);
                            }
                    }))
                    .padTop(-35)
                    .row();
        }

        // Add the label
        label.setAlignment(Align.bottom);
        w.getTitleTable()
                .add(label)
                .padBottom(20)
                .row();

        // Add a gap between the title and the first row of content in the window.
        w.row().padTop(
                w.getTitleTable().getPadTop() + w.getTitleLabel().getHeight()
        );
    }

    /**
     * <h2>Creates a button with a listener</h2>
     *
     * @param key key of local text to put in button
     * @param e    Function of the button
     * @return the button created
     */
    public static TextButton button(String key, Consumer<?> e) {
        TextButton b = new TextButton(local(key), Assets.SKIN);
        onClick(b, e);
        return b;
    }

    protected Cell<Label> label(String key){
        return label(key, this);
    }

    public static Cell<Label> label(String key, Table t){
        return label(key, t, "default");
    }

    public static Cell<Label> label(String key, Table t, String style){
        Label l = new Label(local(key), Assets.SKIN, style);

        return t.add(l).padTop(20f);
    }

    /**
     * DEVELOPMENT
     *
     * add javaadoc if this method stays
     * @param key
     * @param t
     * @return
     */
    public static CheckBox checkBox(String key, Table t) {
        CheckBox c = new CheckBox(local(key), Assets.SKIN);
        t.add(c).padTop(20f); // DEFAULT SPACING
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

    // TODO close region

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
    protected void dialog(String title, String text, String positive) {
        dialog(title, text, positive, "");
    }

    /**
     * Shows a modal dialog on the same stage as this window with a button that returns true, and another that returns false.
     *
     * @param title    The title of the dialog window
     * @param text     The body content of the dialog
     * @param positive The text shown in the positive button. If empty, shows "OK!"
     * @param negative The text shown in the negative button. If empty, no button is added.
     */
    protected void dialog(String title, String text, String positive, String negative) {
        dialog(title, text, positive, negative, null);
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
    public void dialog(String title, String text, String positive, String negative, Consumer<Boolean> resultHandler) {
        dialog(this, title, text, positive, negative, resultHandler);
    }

    /**
     * <h2>Places a label on this window to act as the window title.</h2>
     *
     * @param windowStyle The style of the window, determines the placement and style of heading used.
     * @param title       The title text
     */
    private void placeTitle(String windowStyle, String title) {
        placeTitle(this, windowStyle, title);
    }

    /**
     * <h2>Creates and adds a button which fills the row</h2>
     * Used in most places, ideal for lists of buttons.
     * <p>
     * Once the button is added, automatically moves to the next row.
     *
     * @param Text Text contained in the button
     * @param e    Function of the button
     * @return the button created
     */
    protected TextButton addButton(String Text, Consumer<InputEvent> e) {
        TextButton b = button(Text, e);
        add(b).fill().row();
        clickSound(b);
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
        // Create a label that will be the header
        Label l = new Label(local(key), Assets.SKIN);

        // Make it 20% bigger
        l.setFontScale(1.2f);

        // Put the text in the middle
        l.setAlignment(Align.center);

        // Add and adjust title
        applyMenuStyling(span(add(l))).padTop(50).row();

        hsep().padBottom(20).row();

        return this;
    }

    /**
     * dumb compromise that allows statically seperating a table that isn't directly the stage window.
     * @param t
     * @param key
     */
    public static void seperate(Table t, String key) {
        t.add(new Label("", seperatorStyle)).colspan(t.getColumns()).height(3).bottom().padBottom(20).row();

        // Create a label that will be the header
        Label l = new Label(local(key), Assets.SKIN);

        // Make it 20% bigger
        l.setFontScale(1.2f);

        // Put the text in the middle
        l.setAlignment(Align.center);

        applyMenuStyling(t.add(l)).padTop(50).row();
    }

    /**
     * <h2>Adds a horizontal seperation line</h2>
     *
     * @return The cell containing the horizontal seporator.
     */
    protected Cell hsep() {
        row();
        Cell c = span(add(new Label("", seperatorStyle))).colspan(lastSpan).height(3).bottom();
        row();
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
        t.addListener(new TextTooltip(s, Assets.SKIN));
        return t;
    }

    /**
     * Adds a new item to the current row.
     * <p>
     * See super.
     *
     * @param actor
     * @apiNote Override updates items which span entire window to account for newly created columns.
     */
    @Override
    public final <T extends Actor> Cell<T> add(T actor) {
        Cell c = super.add(actor);
        updateColSpans();
        return c;
    }

    /**
     * Adds multiple items to the current row.
     * <p>
     * See super.
     *
     * @param actors
     * @apiNote Override updates items which span entire window to account for newly created columns.
     */
    @Override
    public final Table add(Actor... actors) {
        Table c = super.add(actors);
        updateColSpans();
        return c;
    }

    /**
     * Adds a cell without an actor, and update colspans.
     */
    @Override
    public Cell add() {
        Cell c = super.add();
        updateColSpans();
        return c;
    }


    /**
     * # Adds a list in a scrollable pane of a fixed height
     */
    protected void addList(com.badlogic.gdx.scenes.scene2d.ui.List<?> list, String tooltipKey) {
        ScrollPane sp = new ScrollPane(list, Assets.SKIN);
        add(sp).fillX();
        tooltip(tooltipKey);
        getCell(sp).height(100f);
        row();
    }

    /**
     * Modifies the provided cell to span all columns of the window table.
     * <p>
     * If more columns are added, this cell well have it's colspan updated to cover it.
     *
     * @param c The cell that should span the entire width of the window
     * @return the cell
     */
    protected Cell span(Cell c) {
        spannedCells.add(c);
        expandfill(c).center();
        c.colspan(lastSpan);
        return c;
    }

    /**
     * Updates all cells which should span all columns with the current number of columns.
     */
    private void updateColSpans() {
        updateColSpans(getColumns());
    }

    /**
     * Updates all cells which should span all columns with the provided number of columns.
     *
     * @param columns
     */
    private void updateColSpans(int columns) {
        if (columns <= lastSpan) return;

        lastSpan = columns;

        for (Cell c : spannedCells)
            c.colspan(lastSpan);

    }

    public void setStage(Stage s) {
        super.setStage(s);
    }


    @Override
    public String toString() {
        return title;
    }

    /**
     * <h2>Constructs the content to be displayed in this window</h2>
     */
    protected abstract void constructContent();

    /**
     * Since window had no dispose, this is called instead on close to trigger onClose
     */
    @Override
    public final void clear() {
        onClose();
        super.clear();
    }

    protected void onClose() {}

    public void toggleShown() {
        setVisible(!isVisible());
    }

    /**
     * # Indicates that this window should not close, but instead just hide.
     */
    public void dontClose() {
        dontClose = true;
    }

    /**
     * <h2>Accepts a consumer to use when clicking a button, instead of an entire click listener class</h2>
     * This exists to shorten the required lines needed to make a button do something. Before you had to
     * define an entire implementation class of clickListenener, now just use a consumer.
     */
    public static class LambdaClickListener extends ClickListener {
        private Consumer c;

        public LambdaClickListener(Consumer<InputEvent> consumer) {
            c = consumer;
        }

        @Override
        public void clicked(InputEvent event, float x, float y) {
            c.accept(event);
        }
    }

    public static class LambdaChangeListener extends ChangeListener {
        private Consumer<ChangeEvent> c;

        public LambdaChangeListener(Consumer<ChangeEvent> consumer) {
            c = consumer;
        }

        /**
         * @param event
         * @param actor The event target, which is the actor that emitted the change event.
         */
        @Override
        public void changed(ChangeEvent event, Actor actor) {
            c.accept(event);
        }
    }
}
