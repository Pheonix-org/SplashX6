package com.shinkson47.SplashX6.rendering.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.maps.MapRenderer;
import com.badlogic.gdx.maps.tiled.renderers.IsometricStaggeredTiledMapRenderer;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;
import com.badlogic.gdx.utils.viewport.ScreenViewport;
import com.shinkson47.SplashX6.Client;
import com.shinkson47.SplashX6.game.GameData;
import com.shinkson47.SplashX6.game.GameHypervisor;
import com.shinkson47.SplashX6.game.units.Unit;
import com.shinkson47.SplashX6.input.mouse.MouseHandler;
import com.shinkson47.SplashX6.rendering.Camera;
import com.shinkson47.SplashX6.rendering.GameWindowManager;
import com.shinkson47.SplashX6.rendering.screens.gameutils.units;
import com.shinkson47.SplashX6.utility.Assets;
import com.shinkson47.SplashX6.utility.Debug;

import static com.shinkson47.SplashX6.game.world.World.*;
import static com.shinkson47.SplashX6.rendering.GameWindowManager.Companion.*;
import static com.shinkson47.SplashX6.rendering.StageWindow.applyMenuStyling;
import static com.shinkson47.SplashX6.rendering.StageWindow.button;


/**
 * <h1>The screen used to display and interact with the game</h1>

 * @author <a href="https://www.shinkson47.in">Jordan T. Gray on 12/04/2021</a>
 * @version 1
 * @since v1
 */
public class GameScreen extends ScreenAdapter {

    //========================================================================
    //#region fields
    //========================================================================

    /**
     * <h2>Camera used to observe the world</h2>
     */
    private Camera camera = new Camera();

    /**
     * <h2>Renderer that renders {@link GameData#world}</h2>
     * renders from perspective of {@link GameScreen#camera}
     */
    public static MapRenderer r;

    /**
     * <h2>A renderer used to draw primative shapes</h2>
     */
    private ShapeRenderer sr;

    /**
     * <h2>A font used for direct screen drawing</h2>
     */
    private BitmapFont font = new BitmapFont();

    /**
     * <h2>The sprite batch used for drawing bulk sprites in the world</h2>
     */
    private SpriteBatch worldBatch = new SpriteBatch();

    /**
     * <h2>The container for all HUD GUI</h2>
     */
    private Stage stage;

    /**
     * x and y screenspace co-ords for the center of the screen
     */
    private Float centerx = Gdx.graphics.getWidth() * 0.5f, centery = Gdx.graphics.getHeight() * 0.5f;




    //========================================================================
    //#endregion fields
    //#region construction
    //========================================================================


    public GameScreen() {
        MouseHandler.create(); //TODO should this really be here?

        // Create objects
        sr = new ShapeRenderer();
        r = new IsometricStaggeredTiledMapRenderer(GameData.INSTANCE.getWorld().getMap());
        stage = new Stage(new ScreenViewport());

        //r.setView(camera.getCam());



        // Configure UI
        resize(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        createUI();
    }

    /**
     * <h2>Constructs GUI shown within the game window</h2>
     */
    private void createUI(){
        // Have the mouse handler accept this stage for reciveing mouse input
        MouseHandler.configureGameInput(stage);

        // Table shown at top of window as a menu bar
        Table menu = new Table( Assets.SKIN );

        menu.setPosition(0,Gdx.graphics.getHeight()-30);
        menu.setSize(Gdx.graphics.getWidth(),30);
        menu.top();

        // Set color
        Pixmap bgPixmap = new Pixmap(1,1, Pixmap.Format.RGB565);
        bgPixmap.setColor(Client.hr,Client.hg,Client.a,Client.a);
        bgPixmap.fill();
        menu.setBackground(new TextureRegionDrawable(new TextureRegion(new Texture(bgPixmap))));


        // Add buttons
        //TODO Menu bar abstraction? lots of repetition here.
        applyMenuStyling(menu.add(button("endGame", o -> GameHypervisor.EndGame())));
        applyMenuStyling(menu.add(button("add units tool", o -> stage.addActor(new units()))));
        applyMenuStyling(menu.add(button("newGame", o -> GameHypervisor.NewGame())));
        applyMenuStyling(menu.add(button("preferences", o -> stage.addActor(new OptionsScreen()))));
        applyMenuStyling(menu.add(button("dev", o -> Debug.MainDebugWindow.toggleShown())));
        applyMenuStyling(menu.add(button("endTurn", o -> GameHypervisor.turn_end())));

        // Add to stage
        stage.addActor(menu);
        stage.addActor(GameWindowManager.Companion.getWINDOW_DOCK());
    }



    //========================================================================
    //#endregion construction
    //#region rendering operations
    //========================================================================


    /**
     * <h2>Renders the next frame</h2>
     */
    @Override
    public void render(float delta) {
        // Render the world
        r.render();

        // Update the camera (Movement, zoom, renders what it sees)
        camera.update();
        worldBatch.setProjectionMatrix(camera.combined);
        sr.setProjectionMatrix(camera.combined);

        // Get selected unit, and draw a circle under it.
        Unit u = GameData.INSTANCE.getSelectedUnit();
        sr.begin(ShapeRenderer.ShapeType.Line);
        if (u != null) {
            sr.circle(u.getX() + TILE_HALF_WIDTH, u.getY() + TILE_HALF_HEIGHT, TILE_HALF_HEIGHT);
        }

        Vector3 v = GameHypervisor.camera_focusingOnTile();
        v = isoToCartesian((int)v.x, (int)v.y);
        sr.circle((int) v.x, v.y, 10);

        // Draw another in the center of the screen.
        sr.setProjectionMatrix(getHUDBatch().getProjectionMatrix());
        sr.circle(centerx, centery, 5);

        sr.end();


        worldBatch.begin();
        // Render cities
        GameData.INSTANCE.getCities().forEach(
                city -> city.draw(worldBatch)
        );

        GameData.INSTANCE.getUnits().forEach(
                sprite -> {
                    // META : This draws a gl rect over the true area where sprites are rendered, so you can see where the sprites boundaries are.
//                    if (Debug.enabled()) {
//                        sr.begin(ShapeRenderer.ShapeType.Filled);
//                        sr.rect(sprite.getBoundingRectangle().x,sprite.getBoundingRectangle().y,sprite.getBoundingRectangle().width,sprite.getBoundingRectangle().height);
//                        sr.end();
//                    }
                    sprite.draw(worldBatch);
                }
        );



        // META : Draw FPS as 10x, 10y in the world
        //font.draw(worldBatch, "FPS : " + Gdx.graphics.getFramesPerSecond(), 10, 10);
        worldBatch.end();


        // Update the UI (listen for inputs, etc)
        stage.act(delta);

        // Draw the UI
        stage.draw();

        Debug.update();
    }

    /**
     * <h2>Resizes the render space</h2>
     * @param width New width
     * @param height New height
     */
    @Override
    public void resize(int width, int height) {
        camera.resize(width, height);
    }


    //========================================================================
    //#endregion rendering operations
    //#region get/set & misc
    //========================================================================

    /**
     * <h2>Returns the camera wrapper</h2>
     */
    public Camera getCam() {
        return camera;
    }

    /**
     * <h2>Returns the shape renderer</h2>
     */
    public ShapeRenderer getSr() {
        return sr;
    }


    /**
     * <h2>Returns the direct screen drawing font</h2>
     */
    public BitmapFont getFont() {
        return font;
    }


    /**
     * <h2>Returns the world space sprite batch</h2>
     */
    public SpriteBatch getWorldBatch() {
        return worldBatch;
    }


    /**
     * <h2>Returns the GUI Stage's camera</h2>
     */
    public com.badlogic.gdx.graphics.Camera getHUDCam() {
        return stage.getCamera();
    }

    /**
     * <h2>Returns the GUI stage</h2>
     */
    public Stage getHUDStage() {
        return stage;
    }


    /**
     * <h2>Returns the GUI batch</h2>
     */
    public Batch getHUDBatch() {
        return stage.getBatch();
    }

    //#engregion
}
