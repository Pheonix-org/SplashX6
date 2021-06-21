package com.shinkson47.SplashX6.rendering.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.shinkson47.SplashX6.Client;
import com.shinkson47.SplashX6.game.GameHypervisor;
import com.shinkson47.SplashX6.rendering.ScalingScreenAdapter;
import com.shinkson47.SplashX6.utility.Assets;
import com.shinkson47.SplashX6.game.world.World;

import static com.shinkson47.SplashX6.utility.Assets.SKIN;

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
public class WorldCreation extends ScalingScreenAdapter {



    {
        Table SecretTable = new Table();
        SecretTable.setFillParent(true);
        SecretTable.add(new Label("**** GENERATING WORLD. PLEASE BE PATIENT. ****", SKIN)).padBottom(50).row();
        SecretTable.add(new Label("WIDTH : " + World.DEFAULT_WIDTH, SKIN)).left().row();
        SecretTable.add(new Label("HEIGHT : " + World.DEFAULT_HEIGHT, SKIN)).left().row();
        SecretTable.add(new Label("MAX FOLIAGE SPAWNS : " + World.FOLIAGE_QUANTITY_MAX, SKIN)).left().padBottom(50).row();
        SecretTable.add(new Label("[SUPER USEFUL GAME TIP HERE]", SKIN)).row();
        stage.addActor(SecretTable);
    }

    //#region operations


    private boolean hasRendered = false;

    @Override
    public void render(float delta) {
        // Render once, then on the second frame callback to the game hypervisor to create the game.
        // We have to perform a full render and return to put a loading screen up.

        // Second part of this test ensures that we outwait any transision screen before the callback.
        if (hasRendered && Client.client.getScreen() == this)
            GameHypervisor.doNewGameCallback();

        stage.getBatch().begin();
            SKIN.getDrawable("tiledtex").draw(stage.getBatch(), 0f,0f,width, height);
        stage.getBatch().end();

        stage.act();
        stage.draw();

        // For debug, stay on the loading screen if any key is pressed.
        if (!Gdx.input.isKeyPressed(Input.Keys.ANY_KEY))
            hasRendered = true;
    }

    @Override
    public void doResize(int width, int height) { }

    //#endregion operations


}
