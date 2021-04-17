package com.shinkson47.SplashX6.rendering.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.*;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.shinkson47.SplashX6.game.GameHypervisor;
import com.shinkson47.SplashX6.input.mouse.MouseHandler;
import com.shinkson47.SplashX6.utility.Assets;

import java.util.Random;

import static com.badlogic.gdx.math.MathUtils.random;


/**
 * <h1></h1>
 * <br>
 * <p>
 *
 * </p>
 *
 * @author <a href="https://www.shinkson47.in">Jordan T. Gray on 16/04/2021</a>
 * @version 1
 * @since v1
 */
public class MainMenu extends ScreenAdapter {

    private Stage stage = new Stage();
    Window w = new Window("Main Menu", Assets.SKIN);

    //#region listeners
    private final ClickListener NewGameListener = new ClickListener(){
        @Override
        public void clicked(InputEvent event, float x, float y) {
            GameHypervisor.NewGame();
        }
    };

    private final ClickListener ExitListener = new ClickListener(){
        @Override
        public void clicked(InputEvent event, float x, float y) {
            Gdx.app.exit();
        }
    };
    //#endregion

    {
        Table SecretTable = new Table();
        SecretTable.setFillParent(true);
        Button SecretButton = new TextButton("SECRET", Assets.SKIN);
        SecretButton.addListener(new ClickListener(){
            private final Random r = new Random();
            @Override
            public void clicked(InputEvent event, float x, float y) {
                Gdx.gl.glClearColor(random.nextFloat(),random.nextFloat(),random.nextFloat(),1);
            }
        });
        SecretTable.add(SecretButton);
        stage.addActor(SecretTable);
        // Set up window to with as glfw environment
        resize(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());

        // Add labels
        w.add(new Label("" +
                "   _____ ____  __    ___   _____ __  __        _____\n" +
                "  / ___// __ \\/ /   /   | / ___// / / /  _  __/ ___/\n" +
                "  \\__ \\/ /_/ / /   / /| | \\__ \\/ /_/ /  | |/_/ __ \\ \n" +
                " ___/ / ____/ /___/ ___ |___/ / __  /  _>  </ /_/ / \n" +
                "/____/_/   /_____/_/  |_/____/_/ /_/  /_/|_|\\____/  \n" +
                "                                                    "
                , Assets.SKIN
        ))
                .padBottom(100)
                .row();

        w.add(new Label("**** MAIN MENU ****", Assets.SKIN))
                .colspan(2)
                .padBottom(100)
                .row();

        newButton(w,"NEW GAME", NewGameListener);
        w.add(new TextButton("LOAD GAME", Assets.SKIN)).colspan(2).row();
        w.add(new TextButton("OPTIONS", Assets.SKIN)).colspan(2).row();
        w.add(new TextButton("CREDITS", Assets.SKIN)).colspan(2).row();
        newButton(w,"EXIT", ExitListener);

        // Resize window to content
        w.pack();
        // Set the stage to handle key and mouse input
        MouseHandler.configureGameInput(stage);
        // add window to scene
        stage.addActor(w);

        Label about = new Label( "BY DYLAN BRAND & JORDAN GRAY. COPR 2021 HTTPS://SHINKSON47.IN", Assets.SKIN);

        Table menu = new Table( Assets.SKIN );
        menu.setFillParent(true);
        menu.bottom();
        menu.add( about ).fill().padBottom(10);

        stage.addActor(menu);
    }

    //#region operations

    public TextButton newButton(Table a, String text, ClickListener listener){
        TextButton b = new TextButton(text, Assets.SKIN);
        b.addListener(listener);
        a.add(b).colspan(2).row();
        return b;
    }

    @Override
    public void render(float delta) {
        stage.act();
        stage.draw();
    }

    @Override
    public void resize(int width, int height) {
        super.resize(width, height);
        w.setPosition(makeEven(width / 2 - (w.getWidth() / 2)), makeEven(height / 2 - (w.getHeight() / 2)));
        //stage.setViewport(viewport);
    }

    private int makeEven(float f){
        return 2*(Math.round(f/2));
    }

    @Override
    public void show() {
        super.show();
    }

    @Override
    public void hide() {
        super.hide();
    }

    @Override
    public void dispose() {
        super.dispose();
    }

    //#endregion operations


}
