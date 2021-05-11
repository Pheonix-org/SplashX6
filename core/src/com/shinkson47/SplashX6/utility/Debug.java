package com.shinkson47.SplashX6.utility;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.maps.MapLayer;
import com.badlogic.gdx.maps.tiled.TiledMapTileLayer;
import com.badlogic.gdx.math.Vector3;
import com.shinkson47.SplashX6.game.GameHypervisor;
import com.shinkson47.SplashX6.rendering.StageWindow;
import com.shinkson47.SplashX6.rendering.screens.GameScreen;
import com.shinkson47.SplashX6.world.World;

import java.util.ArrayList;
import java.util.List;

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

    /**
     * Debug feature switches
     */
    public static boolean MouseInfo;

    public static DebugWindow MainDebugWindow;
    public static GameScreen gameRenderer;
    private static final List<String> Dumps = new ArrayList<>();
    private static boolean debugMode = false;

    public static boolean enabled() { return debugMode; }

    public static void create(){
        gameRenderer = GameHypervisor.getGameRenderer();
        MainDebugWindow = new DebugWindow();
        gameRenderer.getHUDStage().addActor(MainDebugWindow);
    }



    public static void update(){
        renderMouseInfo();
        renderDumps();
    }

    private static void renderDumps() {
        if (!GameHypervisor.getInGame()) return;

        gameRenderer.getHUDBatch().begin();
        int i = 1;
        for (String s : Dumps) {
            gameRenderer.getFont().draw(gameRenderer.getHUDBatch(), s, 20f, i * 20f);
            i++;
        }
        gameRenderer.getHUDBatch().end();
        Dumps.clear();
    }

    public static synchronized void dump(String s){
        if (!debugMode) return;
        Dumps.add(s);
    }


    public static void dispose(){
        if (!MouseInfo) return;
    }

    public static class DebugWindow extends StageWindow {

        public DebugWindow() {
            super("DEBUG", false);
        }

        /**
         * <h2>Constructs the content to be displayed in this window</h2>
         */
        @Override
        protected void constructContent() {
            addButton("Toggle General Debug", o -> debugMode = !debugMode);

            seperate("World");
            addButton("Toggle Tile interpolation", o -> World.focusedWorld.swapTiledInterp());
            int i = 0;
            for(MapLayer t : World.focusedWorld.getMap().getLayers()){
                addButton("Toggle layer " + i, o -> t.setVisible(!t.isVisible()));
                i++;
            }
            seperate("Camera");

            addButton("Experimental : Toggle Camera Pan Tilt", o -> GameHypervisor.getGameRenderer().getCam().setEnableMoveTilt(!GameHypervisor.getGameRenderer().getCam().getEnableMoveTilt()));
            addButton("Experimental : Toggle Camera Zoom Tilt", o -> GameHypervisor.getGameRenderer().getCam().setEnableZoomTilt(!GameHypervisor.getGameRenderer().getCam().getEnableZoomTilt()));
            addButton("Rotate camera +", o -> GameHypervisor.getGameRenderer().getCam().getCam().rotate(10,0,0,1));
            addButton("Rotate camera -", o -> GameHypervisor.getGameRenderer().getCam().getCam().rotate(-10,0,0,1));

            seperate("Cursor");
            addButton("Toggle Cursor Info", o -> MouseInfo = !MouseInfo);
        }
    }

    /**
     * <h2>Renders mouse information to the game screen.</h2>
     */
    private static void renderMouseInfo(){
        if (!MouseInfo) return;

        int mousex = Gdx.input.getX();
        int mousey = Gdx.input.getY();
        int rendery = Gdx.graphics.getHeight() - mousey;

        Vector3 WorldSpace = GameHypervisor.getGameRenderer().getCam().getCam().unproject(new Vector3(mousex, mousey,0));
        Vector3 MapSpace = World.WorldspaceToMapspace((int)WorldSpace.x, (int)WorldSpace.y);

        gameRenderer.getHUDBatch().begin();
        gameRenderer.getFont().draw(gameRenderer.getHUDBatch(), "Mouse Raw : x:" + mousex + ", y:" + mousey, mousex + 20, rendery - 20);
        gameRenderer.getFont().draw(gameRenderer.getHUDBatch(), "WorldSpace : " + WorldSpace, mousex + 20, rendery);
        gameRenderer.getFont().draw(gameRenderer.getHUDBatch(), "MapSpace : " + MapSpace, mousex + 20, rendery + 20);
        gameRenderer.getFont().draw(gameRenderer.getHUDBatch(), "HitTest : " + World.hittestResult, mousex + 20, rendery + 40);
        gameRenderer.getHUDBatch().end();

        if (Gdx.input.isButtonPressed(Input.Buttons.LEFT)) {
            gameRenderer.getSr().setColor(0,1,0,1);
            ((TiledMapTileLayer) World.focusedWorld.getMap().getLayers().get(0)).setCell((int) MapSpace.x, (int) MapSpace.y, null);
        } else
            gameRenderer.getSr().setColor(1,1,1,1);


        gameRenderer.getSr().begin(ShapeRenderer.ShapeType.Line);
        gameRenderer.getSr().line(0,rendery,0,Gdx.graphics.getWidth(),rendery,0);
        gameRenderer.getSr().line(mousex,0,0,mousex,Gdx.graphics.getHeight(),0);
        gameRenderer.getSr().end();

        gameRenderer.getSr().begin(ShapeRenderer.ShapeType.Filled);
        gameRenderer.getSr().circle(mousex, rendery, 5);
        gameRenderer.getSr().end();
    }
}
