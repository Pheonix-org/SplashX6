package com.shinkson47.SplashX6.rendering;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.ui.*;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.utils.Align;
import com.shinkson47.SplashX6.Client;
import com.shinkson47.SplashX6.utility.Assets;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

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

    private int lastSpan = 1000;
    private final ArrayList<Cell> spannedCells = new ArrayList<>();

    //=====================================================================
    //#endregion fields
    //#region constructors
    //=====================================================================

    /**
     * <h2>A style used on lables to create a horizontal line.</h2>
     * Simply just a foreground colored label
     */
    public static final Label.LabelStyle seperatorStyle;
    static {
        seperatorStyle = new Label.LabelStyle(new Label("", Assets.SKIN).getStyle());
        Pixmap labelColor = new Pixmap(200, 200, Pixmap.Format.RGB888);
        labelColor.setColor(Client.hr,Client.hg,Client.b,Client.a);
        labelColor.fill();
        seperatorStyle.background = new Image(new Texture(labelColor)).getDrawable();
   }

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
        if (!style.equals("")) setStyle(Assets.SKIN.get(style, WindowStyle.class));
//        setDebug(true);
        center();

        placeTitle(style, title);

        constructContent();

        pack();
        setPosition(Gdx.graphics.getWidth() / 2 - this.getWidth() / 2, Gdx.graphics.getHeight() / 2 - this.getHeight() / 2);

        setResizable(resizable);
        setVisible(visible);

    }


    //=====================================================================
    //#endregion constructors
    //#region api extention
    //=====================================================================


    /**
     * <h2>Places a label on the window to act as the window title.</h2>
     */
    private void placeTitle(String windowStyle, String title) {
        // If there's no title, do nothing
        if (title.equals("")) return;

        // Ensure we're on a new row. If we're already on an empty row this does nothing.
        row();

        // Create the label
        Label label = new Label(title.toUpperCase(), Assets.SKIN);
        label.setAlignment(Align.bottom);
        getTitleTable().reset();

        // Format differently for dialog windows
        if (!windowStyle.equals("dialog") && !windowStyle.equals("dialog-modal")){
            label.setText("**** " + label.getText() + " ****");
            getTitleTable().padTop(50);
        }

        // Use a table to manipulate placement in row
        Table t = new Table();
        t.add(label);
        t.top().padBottom(20);


        span(add(t));

        // Move to next row. Nothing else should be in the title row.
        row();
    }


    /**
     * <h2>Creates and adds a button which fills the row</h2>
     * Used in most places, ideal for lists of buttons.
     *
     * Once the button is added, automatically moves to the next row.
     * @param Text Text contained in the button
     * @param e Function of the button
     * @return the button created
     */
    protected TextButton addButton(String Text, Consumer<InputEvent> e){
        TextButton b = button(Text, e);
        add(b).fill().row();
        return b;
    }


    /**
     * <h2>Creates a button with a listener</h2>
     * @param text Text contained in the button
     * @param e Function of the button
     * @return the button created
     */
    public static TextButton button(String text, Consumer e) {
        TextButton b = new TextButton(text, Assets.SKIN);
        onClick(b, e);
        return b;
    }


    /**
     * <h2>Attaches a consumer to an actor via a {@link LambdaClickListener}</h2>
     * @param actor The actor
     * @param consumer The action
     * @return The actor
     */
    protected static Actor onClick(Actor actor, Consumer consumer){
        actor.addListener(new LambdaClickListener(consumer));
        return actor;
    }

    /**
     * <h2>Adds a new row containing the provided actors</h2>
     * @param actors
     */
    protected Cell row(Actor... actors) {
        row();
        return add(actors).row();
    }

    protected Cell tabs(Cell contentCell, List<Table> tables, List<String> name) {
        assert (tables.size() == name.size());

        // Make sure we're on a new row
        hsep().bottom();
        Cell currRow = expandfill(row());

        // for every tab table, add a button for it.
        int i = 0;
        for (Table t : tables) {
            expandfill(add(tab(contentCell, t, name.get(i))).maxHeight(50).minHeight(50));
            i++;
        }

        currRow.colspan(i + 1);
        currRow.maxHeight(30).top();

        expandfill(contentCell);

        // move to next row
        row();

        hsep().top();

        span(contentCell);
        updateColSpans(i);
        // return the row of buttons, not the new row.
        return currRow;
    }

    /**
     * <h2>Creates and adds a button that shows a table in a cell when clicked.</h2>
     * @param contentCell The cell to display the content
     * @param content The content of the tab
     * @param name The text to be displayed in the button
     * @return the button
     */
    protected TextButton tab(Cell contentCell, Table content, String name){
        return button(name, e -> {contentCell.setActor(content); contentCell.fill().expand().center(); });
    }

    /**
     * <h2>Performs {@link Cell#fill()} and {@link Cell#expand()} on the actor</h2>
     */
    protected <T extends Cell> T expandfill(T actor){
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
    protected StageWindow seperate(String s) {
        // Create a label that will be the header
        Label l = new Label(s, Assets.SKIN);

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
     * <h2>Adds a horizontal seperation line</h2>
     * @return
     */
    protected Cell hsep(){
        row();
        Cell c = span(add(new Label("", seperatorStyle))).colspan(lastSpan).height(3).bottom();
        row();
        return c;
    }

    /**
     * Adds a new cell to the table with the specified actor.
     *
     * @param actor
     */
    @Override
    public <T extends Actor> Cell<T> add(T actor) {
        Cell c = super.add(actor);
        updateColSpans();
        return c;
    }

    @Override
    public Table add(Actor... actors) {
        Table c = super.add(actors);
        updateColSpans();
        return c;
    }

    /**
     * Adds a cell without an actor.
     */
    @Override
    public Cell add() {
        Cell c = super.add();
        updateColSpans();
        return c;
    }

    protected Cell span(Cell c){
        spannedCells.add(c);
        expandfill(c).center();
        c.colspan(lastSpan);
        return c;
    }

    private void updateColSpans(){
        updateColSpans(getColumns());
    }

    private void updateColSpans(int columns){
        if (columns <= lastSpan) return;

        lastSpan = columns;

        for(Cell c : spannedCells)
            c.colspan(lastSpan);

    }

    /**
     * <h2>Applies padding and fill to cells used in a menu style table</h2>
     */
    public static Cell applyMenuStyling(Cell actor) {
        return actor.fill()
                .center()
                .padTop(2)
                .padLeft(15)
                .padRight(15);
    }

    /**
     * <h2>Constructs the content to be displayed in this window</h2>
     */
    protected abstract void constructContent();

    public void toggleShown() {
        setVisible(!isVisible());
    }



    /**
     * <h2>Accepts a consumer to use when clicking a button, instead of an entire click listener class</h2>
     * This exists to shorten the required lines needed to make a button do something.
     */
    public static class LambdaClickListener extends ClickListener {
        private Consumer c;

        public LambdaClickListener(Consumer<InputEvent> consumer){
            c = consumer;
        }

        @Override
        public void clicked(InputEvent event, float x, float y) {
            c.accept(event);
        }
    }
}
