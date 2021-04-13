package com.shinkson47.game.rendering;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.maps.MapRenderer;
import com.badlogic.gdx.maps.tiled.TiledMapTileLayer;
import com.badlogic.gdx.maps.tiled.renderers.IsometricStaggeredTiledMapRenderer;
import com.badlogic.gdx.maps.tiled.renderers.IsometricTiledMapRenderer;
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.shinkson47.game.world.World;

import java.util.Vector;

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
public class Renderer{

    /**
     * <h2>Camera used to observe the world</h2>
     */
    private static Camera camera = new Camera();
    /**
     * <h2>Renderer that renders {@link World#focusedWorld}</h2>
     * renders from perspective of {@link Renderer#camera}
     */
    private static MapRenderer r;

    private static ShapeRenderer sr;
    private static BitmapFont font = new BitmapFont();

    private static SpriteBatch batch = new SpriteBatch();

    //#region construction

    /**
     * <h2>Configures the rendering environment.</h2>
     */
    public static void create() {
        createObjects();
        configureGraphicEnv();
    }

    /**
     * <h2>Creates all class level objects needed to render.</h2>
     * @apinote calls {@link Renderer#configureObjects()}
     */
    private static void createObjects() {
        sr = new ShapeRenderer();
        r = new IsometricStaggeredTiledMapRenderer(World.focusedWorld.getMap());
        configureObjects();
    }

    /**
     * <h2>Configures class level objects ready for use</h2>
     */
    private static void configureObjects() {
        resize(Gdx.graphics.getWidth(),
        Gdx.graphics.getHeight());
    }

    /**
     * <h2>Configures the graphical environment</h2>
     * i.e glfw and gl.
     */
    private static void configureGraphicEnv() {
        Gdx.gl.glClearColor(0,0,0, 1);
    }
    //#endregion construction


    //#region rendering operations

    /**
     * <h2>Renders the next frame</h2>
     */
    public static void render() {
        // Clear last frame,
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        r.setView(camera.getCam().combined,0,0,Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
        camera.update();
        r.render();

        int mousex = Gdx.input.getX();
        int mousey = Gdx.input.getY();
        int rendery = Gdx.graphics.getHeight() - mousey;

        Vector3 WorldSpace = camera.getCam().unproject(new Vector3(mousex, mousey,0));
        Vector3 MapSpace = World.WorldspaceToMapspace((int)WorldSpace.x, (int)WorldSpace.y);

        batch.begin();
        font.draw(batch, "Mouse Raw : x:" + mousex + ", y:" + mousey, mousex + 20, rendery - 20);
        font.draw(batch, "WorldSpace : " + WorldSpace, mousex + 20, rendery);
        font.draw(batch, "MapSpace : " + MapSpace, mousex + 20, rendery + 20);
        font.draw(batch, "HitTest : " + World.ht, mousex + 20, rendery + 40);
        batch.end();

        if (Gdx.input.isButtonPressed(Input.Buttons.LEFT))
            ((TiledMapTileLayer) World.focusedWorld.getMap().getLayers().get(0)).setCell((int)MapSpace.x, (int)MapSpace.y, null);

        sr.setColor(1,1,1,1);
        sr.begin(ShapeRenderer.ShapeType.Line);
        sr.line(0,rendery,0,Gdx.graphics.getWidth(),rendery,0);
        sr.line(mousex,0,0,mousex,Gdx.graphics.getHeight(),0);
        sr.end();

        sr.begin(ShapeRenderer.ShapeType.Filled);
        sr.circle(mousex, rendery, 5);
        sr.end();
    }

    public static void resize(float width, float height) {
        camera.resize(width, height);
    }
    //#endregion rendering operations


    //#region get/set & misc
    public static Camera getCam() {
        return camera;
    }

    public static void dispose() {
    }
    //#engregion


}
