package com.shinkson47.SplashX6.rendering.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.shinkson47.SplashX6.Client;
import com.shinkson47.SplashX6.game.GameHypervisor;
import com.shinkson47.SplashX6.rendering.ScalingScreenAdapter;
import com.shinkson47.SplashX6.game.world.WorldTerrain;

import static com.shinkson47.SplashX6.utility.Assets.SKIN;
import static com.shinkson47.SplashX6.utility.Assets.TIPS;

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

    private Label tipLabel = new Label("", SKIN);

    {
        Table table = new Table();
        table.setFillParent(true);
        table.add(new Label("**** GENERATING WORLD. PLEASE BE PATIENT. ****", SKIN)).padBottom(50).row();
        table.add(new Label("WIDTH : " + WorldTerrain.DEFAULT_WIDTH, SKIN)).left().row();
        table.add(new Label("HEIGHT : " + WorldTerrain.DEFAULT_HEIGHT, SKIN)).left().row();
        table.add(new Label("MAX FOLIAGE SPAWNS : " + WorldTerrain.FOLIAGE_QUANTITY_MAX, SKIN)).left().padBottom(50).row();

        nextTip();
        table.add(tipLabel).row();
        stage.addActor(table);
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

    private void nextTip() {
        // TODO check range
        tipLabel.setText(TIPS[MathUtils.random(TIPS.length -1)]);
    }

    @Override
    public void doResize(int width, int height) { }

    //#endregion operations


}
