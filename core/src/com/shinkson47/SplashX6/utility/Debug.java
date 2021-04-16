package com.shinkson47.SplashX6.utility;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.maps.tiled.TiledMapTileLayer;
import com.badlogic.gdx.math.Vector3;
import com.shinkson47.SplashX6.rendering.Camera;
import com.shinkson47.SplashX6.world.World;
import com.shinkson47.SplashX6.game.GameHypervisor;

/**
 * <h1>Random playground for test / development scripture</h1>
 * <br>
 * <p>
 *
 * </p>
 *
 * @author <a href="https://www.shinkson47.in">Jordan T. Gray on 13/04/2021</a>
 * @version 1
 * @since v1
 */
public class Debug {
    private static Boolean debug = true;
    private static SpriteBatch batch;
    private static Camera camera;
    private static ShapeRenderer sr;
    private static BitmapFont font;

    public static void create(){
        if (!debug) return;
        camera = GameHypervisor.getGameRenderer().getCam();
        batch  = GameHypervisor.getGameRenderer().getBatch();
        sr     = GameHypervisor.getGameRenderer().getSr();
        font   = GameHypervisor.getGameRenderer().getFont();
    }

    public static void update(){
        if (!debug) return;

        int mousex = Gdx.input.getX();
        int mousey = Gdx.input.getY();
        int rendery = Gdx.graphics.getHeight() - mousey;

        Vector3 WorldSpace = camera.getCam().unproject(new Vector3(mousex, mousey,0));
        Vector3 MapSpace = World.WorldspaceToMapspace((int)WorldSpace.x, (int)WorldSpace.y);

        batch.begin();
        font.draw(batch, "Mouse Raw : x:" + mousex + ", y:" + mousey, mousex + 20, rendery - 20);
        font.draw(batch, "WorldSpace : " + WorldSpace, mousex + 20, rendery);
        font.draw(batch, "MapSpace : " + MapSpace, mousex + 20, rendery + 20);
        font.draw(batch, "HitTest : " + World.hittestResult, mousex + 20, rendery + 40);
        batch.end();

        if (Gdx.input.isButtonPressed(Input.Buttons.LEFT)) {
            sr.setColor(0,1,0,1);
            ((TiledMapTileLayer) World.focusedWorld.getMap().getLayers().get(0)).setCell((int) MapSpace.x, (int) MapSpace.y, null);
        } else
            sr.setColor(1,1,1,1);


        sr.begin(ShapeRenderer.ShapeType.Line);
        sr.line(0,rendery,0,Gdx.graphics.getWidth(),rendery,0);
        sr.line(mousex,0,0,mousex,Gdx.graphics.getHeight(),0);
        sr.end();

        sr.begin(ShapeRenderer.ShapeType.Filled);
        sr.circle(mousex, rendery, 5);
        sr.end();

    }

    public static void dispose(){
        if (!debug) return;

    }


}
