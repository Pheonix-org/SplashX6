package com.shinkson47.SplashX6.rendering.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.*;
import com.badlogic.gdx.scenes.scene2d.utils.ChangeListener;
import com.badlogic.gdx.utils.Align;
import com.shinkson47.SplashX6.game.GameHypervisor;
import com.shinkson47.SplashX6.input.mouse.MouseHandler;
import com.shinkson47.SplashX6.rendering.StageWindow;
import com.shinkson47.SplashX6.utility.Assets;
import com.shinkson47.SplashX6.utility.Utility;


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


    //#region listeners


    private Window menuWindow;
    //#endregion

    {
        menuWindow = new MainMenuWindow();

        // Table that fills the window, contains content under the menu window.
        Table BaseTable = new Table().center();
        BaseTable.setFillParent(true);

        // Secret button
        Button SecretButton = new TextButton("SECRET", Assets.SKIN);
        SecretButton.addListener(new StageWindow.LambdaClickListener( o -> Gdx.gl.glClearColor(random.nextFloat(),random.nextFloat(),random.nextFloat(),1)));

        BaseTable.add(SecretButton).center();
        stage.addActor(BaseTable);
        BaseTable = new Table().bottom();
        BaseTable.setFillParent(true);
        BaseTable.add(new Label( "BY DYLAN BRAND & JORDAN GRAY. COPR 2021 HTTPS://SHINKSON47.IN", Assets.SKIN))
                .fill()
                .padBottom(10);

        // Set up window to with as glfw environment
        resize(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());

        stage.addActor(BaseTable);
        stage.addActor(menuWindow);

        // Set the stage to handle key and mouse input
        MouseHandler.configureGameInput(stage);
    }

    /**
     * The window shown at the main menu that contains option for the user
     */
    private class MainMenuWindow extends StageWindow {

        /**
         * <h2>Constructs the content to be displayed in this window</h2>
         */
        @Override
        protected void constructContent() {

            // Title label
            add(new Label("" +
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

            addButton("NEW GAME", o -> GameHypervisor.NewGame());
            addButton("LOAD GAME", o -> Utility.notImplementedDialog(stage));
            addButton("OPTIONS", o -> Utility.notImplementedDialog(stage));
            addButton("CREDITS", o -> Utility.notImplementedDialog(stage));
            addButton("EXIT",  o -> Gdx.app.exit());
        }
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
        menuWindow.setPosition(makeEven(width / 2 - (menuWindow.getWidth() / 2)), makeEven(height / 2 - (menuWindow.getHeight() / 2)));
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
