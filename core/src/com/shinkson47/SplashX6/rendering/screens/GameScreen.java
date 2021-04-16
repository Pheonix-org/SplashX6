package com.shinkson47.SplashX6.rendering.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.maps.MapRenderer;
import com.badlogic.gdx.maps.tiled.renderers.IsometricStaggeredTiledMapRenderer;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Window;
import com.badlogic.gdx.utils.Scaling;
import com.badlogic.gdx.utils.viewport.ExtendViewport;
import com.badlogic.gdx.utils.viewport.ScalingViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.shinkson47.SplashX6.input.mouse.MouseHandler;
import com.shinkson47.SplashX6.rendering.Camera;
import com.shinkson47.SplashX6.utility.Assets;
import com.shinkson47.SplashX6.world.World;


/**
 * <h1>Main rendering class</h1>
 * <br>
 * <p>
 *
 * </p>
 *
 * @author <a href="https://www.shinkson47.in">Jordan T. Gray on 12/04/2021</a>
 * @version 1
 * @since v1
 */
public class GameScreen extends ScreenAdapter {

    /**
     * <h2>Camera used to observe the world</h2>
     */
    private Camera camera = new Camera();

    /**
     * <h2>Renderer that renders {@link World#focusedWorld}</h2>
     * renders from perspective of {@link GameScreen#camera}
     */
    private MapRenderer r;

    private ShapeRenderer sr;
    private BitmapFont font = new BitmapFont();

    private SpriteBatch batch = new SpriteBatch();

    private Stage stage;
    private Viewport viewport;

    //#region construction


    public GameScreen() {
        create();
    }

    public void create(){
        MouseHandler.create();
        sr = new ShapeRenderer();
        r = new IsometricStaggeredTiledMapRenderer(World.focusedWorld.getMap());
        resize(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());

        createUI();
    }

    private void createUI(){
        viewport = new ScalingViewport(Scaling.stretch, Gdx.graphics.getWidth(), Gdx.graphics.getHeight(), camera.getCam());
        stage = new Stage(viewport);

        Gdx.input.setInputProcessor(stage);

        Window w = new Window("", Assets.SKIN);
        w.add(new Label("Fuck off", Assets.SKIN));
        w.setResizable(true);
        w.setMovable(true);

        stage.addActor(w);
        stage.addActor(new Label("double fuck off", Assets.SKIN));
    }
    //#endregion construction


    //#region rendering operations


    /**
     * <h2>Renders the next frame</h2>
     */
    @Override
    public void render(float delta) {
        // Clear last frame,

        r.setView(camera.getCam().combined,0,0,Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
        camera.update();
        r.render();

        stage.act(delta);
        stage.draw();
    }

    @Override
    public void resize(int width, int height) {
        camera.resize(width, height);
        //stage.getViewport().update(width, height, true);
    }
    //#endregion rendering operations


    //#region get/set & misc
    public Camera getCam() {
        return camera;
    }


    public ShapeRenderer getSr() {
        return sr;
    }

    public BitmapFont getFont() {
        return font;
    }

    public SpriteBatch getBatch() {
        return batch;
    }
    //#engregion


}
