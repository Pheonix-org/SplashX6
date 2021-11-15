package com.shinkson47.SplashX6.rendering.screens.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.maps.MapRenderer;
import com.badlogic.gdx.maps.tiled.renderers.IsometricStaggeredTiledMapRenderer;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.shinkson47.SplashX6.game.GameHypervisor;
import com.shinkson47.SplashX6.game.units.Unit;
import com.shinkson47.SplashX6.input.mouse.MouseHandler;
import com.shinkson47.SplashX6.rendering.Camera;
import com.shinkson47.SplashX6.rendering.ScalingScreenAdapter;
import com.shinkson47.SplashX6.rendering.screens.GameManagementScreen;
import com.shinkson47.SplashX6.rendering.windows.GameWindowManager;
import com.shinkson47.SplashX6.utility.Debug;

import static com.shinkson47.SplashX6.game.GameDataKt.GameData;
import static com.shinkson47.SplashX6.game.world.WorldTerrain.*;


/**
 * <h1>The screen used to display and interact with the game</h1>

 * @author <a href="https://www.shinkson47.in">Jordan T. Gray on 12/04/2021</a>
 * @version 1
 * @since v1
 */
public class GameScreen extends ScalingScreenAdapter {

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
    public IsometricStaggeredTiledMapRenderer r;

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
     * x and y screenspace co-ords for the center of the screen
     */
    private Float centerx = width * 0.5f, centery = height * 0.5f;

    private GameManagementScreen managementScreen = new GameManagementScreen(this);




    //========================================================================
    //#endregion fields
    //#region construction
    //========================================================================


    public GameScreen() {
        MouseHandler.create(); //TODO should this really be here?

        // Create objects
        sr = new ShapeRenderer();
        newRenderer();

        //r.setView(camera.getCam());



        // Configure UI
        resize(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        createUI();
    }

    /**
     * Creates a new tiledmap renderer.
     *
     * If a renderer exists, Changes it to display GameData.World.
     * (Used to display a world after creating or loading a new one without creating a new screen.)
     *
     * TODO Integrate a multiplayer load with the doNewGameCallback which creates
     * a new game screen.
     */
    public void newRenderer() {
        r = new IsometricStaggeredTiledMapRenderer(GameData.world);
//        if (r == null)
//
//        else
//            r.setMap(GameData.world);
    }

    /**
     * <h2>Constructs GUI shown within the game window</h2>
     */
    private void createUI(){
        // Have the mouse handler accept this stage for receiving mouse input
        MouseHandler.configureGameInput(stage);

        // Add to stage
        stage.addActor(new Menu(this));
        stage.addActor(GameWindowManager.getWINDOW_DOCK());
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

        // Get selected unit, and draw a circle under it.?
        Unit u = GameData.selectedUnit;
        sr.begin(ShapeRenderer.ShapeType.Line);
        if (u != null) {
            sr.circle(u.getX() + TILE_HALF_WIDTH, u.getY() + TILE_HALF_HEIGHT, TILE_HALF_HEIGHT);
        }

        Vector3 v = GameHypervisor.mouse_focusOnTile();
        v = isoToCartesian((int)v.x, (int)v.y);
        sr.circle((int) v.x, v.y, 10);

        // Draw another in the center of the screen.
        sr.setProjectionMatrix(getHUDBatch().getProjectionMatrix());
        sr.circle(centerx, centery, 5);

        sr.end();

        renderSprites();


        // META : Draw FPS as 10x, 10y in the world
        //font.draw(worldBatch, "FPS : " + Gdx.graphics.getFramesPerSecond(), 10, 10);



        // Update the UI (listen for inputs, etc)
        stage.act(delta);

        // Draw the UI
        stage.draw();

        Debug.update();
    }

    public void renderSprites(){
        worldBatch.begin();

        // Render cities
        GameData.player.getCities().forEach(
                city -> city.draw(worldBatch)
        );

        GameData.player.getUnits().forEach(
                sprite -> {
                    // META : This draws a gl rect over the true area where sprites are rendered, so you can see where the sprites boundaries are.
//                    if (Debug.enabled()) {
//                        sr.begin(ShapeRenderer.ShapeType.Filled);
//                        sr.rect(sprite.getBoundingRectangle().x,sprite.getBoundingRectangle().y,sprite.getBoundingRectangle().width,sprite.getBoundingRectangle().height);
//                        sr.end();
//                    }
                    sprite.draw(worldBatch);
                });
                worldBatch.end();
    }

    /**
     * <h2>Resizes the render space</h2>
     * @param width New width
     * @param height New height
     */
    @Override
    public void doResize(int width, int height) {
        if (GameHypervisor.getInGame()) camera.resize(width, height);
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

    public MapRenderer getR() {
        return r;
    }

    public GameManagementScreen getManagementScreen() {
        return managementScreen;
    }

    @Override
    public void show() {
        sr.end();
        worldBatch.setProjectionMatrix(camera.combined);
    }
    //#endregion
}
