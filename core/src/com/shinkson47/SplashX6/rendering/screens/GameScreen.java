package com.shinkson47.SplashX6.rendering.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.maps.MapRenderer;
import com.badlogic.gdx.maps.tiled.renderers.IsometricStaggeredTiledMapRenderer;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;
import com.badlogic.gdx.utils.Scaling;
import com.badlogic.gdx.utils.viewport.ScalingViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.shinkson47.SplashX6.Client;
import com.shinkson47.SplashX6.input.mouse.MouseHandler;
import com.shinkson47.SplashX6.rendering.Camera;
import com.shinkson47.SplashX6.utility.Assets;
import com.shinkson47.SplashX6.utility.Debug;
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
        r.setView(camera.getCam());
        resize(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());

        createUI();
    }

    private void createUI(){
        viewport = new ScalingViewport(Scaling.stretch, Gdx.graphics.getWidth(), Gdx.graphics.getHeight(), camera.getCam());
        stage = new Stage(viewport);

        MouseHandler.configureGameInput(stage);

        Table menu = new Table( Assets.SKIN );
        //menu.setFillParent(true);
        menu.setPosition(0,Gdx.graphics.getHeight()-30);
        menu.setSize(Gdx.graphics.getWidth(),30);


        Pixmap bgPixmap = new Pixmap(1,1, Pixmap.Format.RGB565);
        bgPixmap.setColor(Client.hr,Client.hg,Client.a,Client.a);
        bgPixmap.fill();
        menu.setBackground(new TextureRegionDrawable(new TextureRegion(new Texture(bgPixmap))));
        menu.top();

        menu.add(new TextButton("Menu Item", Assets.SKIN)).fill().padTop(2).padLeft(2).padRight(2);
        menu.add(new TextButton("Menu Item", Assets.SKIN)).fill().padTop(2).padLeft(2).padRight(2);
        menu.add(new TextButton("Menu Item", Assets.SKIN)).fill().padTop(2).padLeft(2).padRight(2);

        TextButton button = new TextButton("MOUSE DEBUG", Assets.SKIN, "toggle");
        button.addListener(new ClickListener(){
            @Override
            public void clicked(InputEvent event, float x, float y) {
                Debug.debug = !Debug.debug;
            }
        });
        menu.add(button).fill().padTop(2).padLeft(2).padRight(2);

        stage.addActor(menu);
    }
    //#endregion construction


    //#region rendering operations


    /**
     * <h2>Renders the next frame</h2>
     */
    @Override
    public void render(float delta) {
        // Clear last frame,
        r.setView(camera.getCam());
        r.render();
        camera.update();

        stage.act(delta);
        stage.draw();
        // TODO shouldn't have to do this here
        Debug.update();
    }

    @Override
    public void resize(int width, int height) {
        camera.resize(width, height);
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
