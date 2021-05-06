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
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;
import com.badlogic.gdx.utils.Scaling;
import com.badlogic.gdx.utils.viewport.ScalingViewport;
import com.shinkson47.SplashX6.Client;
import com.shinkson47.SplashX6.game.GameHypervisorKt;
import com.shinkson47.SplashX6.input.mouse.MouseHandler;
import com.shinkson47.SplashX6.rendering.Camera;
import com.shinkson47.SplashX6.utility.Assets;
import com.shinkson47.SplashX6.utility.Debug;
import com.shinkson47.SplashX6.utility.Utility;
import com.shinkson47.SplashX6.world.World;

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
     * <h2>Renderer that renders {@link World#focusedWorld}</h2>
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



    //========================================================================
    //#endregion fields
    //#region construction
    //========================================================================


    public GameScreen() {
        MouseHandler.create(); //TODO should this really be here?

        // Create objects
        sr = new ShapeRenderer();
        r = new IsometricStaggeredTiledMapRenderer(World.focusedWorld.getMap());
        stage = new Stage(new ScalingViewport(Scaling.stretch, Gdx.graphics.getWidth(), Gdx.graphics.getHeight()));

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
        //TODO Menu bar abstraction?
        applyMenuStyling(menu.add(button("END GAME", o -> GameHypervisorKt.EndGame())));
        applyMenuStyling(menu.add(button("SOMETHING AWESOME", o -> Utility.notImplementedDialog(stage))));
        applyMenuStyling(menu.add(button("NEW GAME", o -> GameHypervisorKt.NewGame())));
        applyMenuStyling(menu.add(button("DEVELOP & DEBUG", o -> Debug.MainDebugWindow.toggleShown())));

        // Add to stage
        stage.addActor(menu);
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
        // Clear last frame
        worldBatch.setProjectionMatrix(camera.getCam().combined);

        // Render the world
        r.render();

        // Update the camera (Movement, zoom, renders what it sees)
        camera.update();

        // Update the UI (listen for inputs, etc)
        stage.act(delta);

        // Draw the UI
        stage.draw();

        Debug.update(); // TODO shouldn't have to do this here
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
