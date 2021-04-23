package com.shinkson47.SplashX6.rendering;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.ui.*;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.utils.Align;
import com.shinkson47.SplashX6.utility.Assets;
import org.w3c.dom.Text;

import java.util.function.Consumer;

/**
 * <h1>A LibGDX Window with some extended functionality </h1>
 *
 * @author <a href="https://www.shinkson47.in">Jordan T. Gray on 22/04/2021</a>
 * @version 1
 * @since v1
 */
public abstract class StageWindow extends Window {


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

        center();

        placeTitle(style, title);

        constructContent();

        pack();
        setPosition(Gdx.graphics.getWidth() / 2 - this.getWidth() / 2, Gdx.graphics.getHeight() / 2 - this.getHeight() / 2);

        setResizable(resizable);
        setVisible(visible);

    }

    /**
     * Places a label on the window to act as the window title.
     */
    private void placeTitle(String windowStyle, String title) {
        if (title.equals("")) return;
        row();
        Label label = new Label(title.toUpperCase(), Assets.SKIN);
        label.setAlignment(Align.bottom);
        getTitleTable().reset();

        if (!windowStyle.equals("dialog") && !windowStyle.equals("dialog-modal")){
            label.setText("**** " + label.getText() + " ****");
            getTitleTable().padTop(50);
        }

        Table t = new Table();
        t.add(label);
        t.top().padBottom(20);

        add(t).row();
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

    protected TextButton addButton(String Text, Consumer<InputEvent> e){
        TextButton t = newButton(Text, e);
        add(t).fill().row();
        return t;
    }

    public static TextButton newButton(String text, Consumer<InputEvent> e){
        TextButton t = new TextButton(text, Assets.SKIN);
        t.addListener(new LambdaClickListener(e));
        return t;
    }

    /**
     * <h2>Constructs the content to be displayed in this window</h2>
     */
    protected abstract void constructContent();

    public void toggleShown() {
        setVisible(!isVisible());
    }
}
