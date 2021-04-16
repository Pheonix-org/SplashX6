package com.shinkson47.SplashX6.rendering.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.*;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.utils.viewport.ExtendViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.shinkson47.SplashX6.game.GameHypervisor;
import com.shinkson47.SplashX6.utility.Assets;


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

    private Viewport viewport;
    private Stage stage = new Stage();
    Window w = new Window("Main Menu", Assets.SKIN);

    {
        // Set up window to with as glfw environment
        resize(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());



        // Add lables
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
                .padTop(100)
                .padBottom(100)
                .row();
        Button b = new TextButton("NEW GAME", Assets.SKIN);
        b.addListener(new ClickListener(){
            @Override
            public void clicked(InputEvent event, float x, float y) {
                GameHypervisor.NewGame();
            }
        });
        w.add(b).colspan(2).row();
        w.add(new TextButton("LOAD GAME", Assets.SKIN)).colspan(2).row();
        w.add(new TextButton("OPTIONS", Assets.SKIN)).colspan(2).row();
        w.add(new TextButton("CREDITS", Assets.SKIN)).colspan(2).row();
        w.add(new TextButton("EXIT", Assets.SKIN)).colspan(2).row();

        // Reszie window to content
        w.pack();
        // Set the stage to handle key and mouse input
        Gdx.input.setInputProcessor(stage);
        // add window to scene
        stage.addActor(w);
    }

    //#region operations

    @Override
    public void render(float delta) {
        stage.act();
        stage.draw();
    }

    @Override
    public void resize(int width, int height) {
        super.resize(width, height);
        viewport = new ExtendViewport(width, height);
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
