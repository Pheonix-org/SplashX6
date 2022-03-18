/*░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░
 ░ FOSS 2022. The Splash Project.                                                                                                                                                 ░
 ░ https://www.shinkson47.in/SplashX6                                                                                                                                             ░
 ░ Jordan T. Gray.                                                                                                                                                                ░
 ░                                                                                                                                                                                ░
 ░                                                                                                                                                                                ░
 ░                                                                                                                                                                                ░
 ░           _____                    _____                    _____            _____                    _____                    _____                                           ░
 ░          /\    \                  /\    \                  /\    \          /\    \                  /\    \                  /\    \                         ______           ░
 ░         /::\    \                /::\    \                /::\____\        /::\    \                /::\    \                /::\____\                       |::|   |          ░
 ░        /::::\    \              /::::\    \              /:::/    /       /::::\    \              /::::\    \              /:::/    /                       |::|   |          ░
 ░       /::::::\    \            /::::::\    \            /:::/    /       /::::::\    \            /::::::\    \            /:::/    /                        |::|   |          ░
 ░      /:::/\:::\    \          /:::/\:::\    \          /:::/    /       /:::/\:::\    \          /:::/\:::\    \          /:::/    /                         |::|   |          ░
 ░     /:::/__\:::\    \        /:::/__\:::\    \        /:::/    /       /:::/__\:::\    \        /:::/__\:::\    \        /:::/____/                          |::|   |          ░
 ░     \:::\   \:::\    \      /::::\   \:::\    \      /:::/    /       /::::\   \:::\    \       \:::\   \:::\    \      /::::\    \                          |::|   |          ░
 ░   ___\:::\   \:::\    \    /::::::\   \:::\    \    /:::/    /       /::::::\   \:::\    \    ___\:::\   \:::\    \    /::::::\    \   _____                 |::|   |          ░
 ░  /\   \:::\   \:::\    \  /:::/\:::\   \:::\____\  /:::/    /       /:::/\:::\   \:::\    \  /\   \:::\   \:::\    \  /:::/\:::\    \ /\    \          ______|::|___|___ ____  ░
 ░ /::\   \:::\   \:::\____\/:::/  \:::\   \:::|    |/:::/____/       /:::/  \:::\   \:::\____\/::\   \:::\   \:::\____\/:::/  \:::\    /::\____\        |:::::::::::::::::|    | ░
 ░ \:::\   \:::\   \::/    /\::/    \:::\  /:::|____|\:::\    \       \::/    \:::\  /:::/    /\:::\   \:::\   \::/    /\::/    \:::\  /:::/    /        |:::::::::::::::::|____| ░
 ░  \:::\   \:::\   \/____/  \/_____/\:::\/:::/    /  \:::\    \       \/____/ \:::\/:::/    /  \:::\   \:::\   \/____/  \/____/ \:::\/:::/    /          ~~~~~~|::|~~~|~~~       ░
 ░   \:::\   \:::\    \               \::::::/    /    \:::\    \               \::::::/    /    \:::\   \:::\    \               \::::::/    /                 |::|   |          ░
 ░    \:::\   \:::\____\               \::::/    /      \:::\    \               \::::/    /      \:::\   \:::\____\               \::::/    /                  |::|   |          ░
 ░     \:::\  /:::/    /                \::/____/        \:::\    \              /:::/    /        \:::\  /:::/    /               /:::/    /                   |::|   |          ░
 ░      \:::\/:::/    /                  ~~               \:::\    \            /:::/    /          \:::\/:::/    /               /:::/    /                    |::|   |          ░
 ░       \::::::/    /                                     \:::\    \          /:::/    /            \::::::/    /               /:::/    /                     |::|   |          ░
 ░        \::::/    /                                       \:::\____\        /:::/    /              \::::/    /               /:::/    /                      |::|   |          ░
 ░         \::/    /                                         \::/    /        \::/    /                \::/    /                \::/    /                       |::|___|          ░
 ░          \/____/                                           \/____/          \/____/                  \/____/                  \/____/                         ~~               ░
 ░                                                                                                                                                                                ░
 ░                                                                                                                                                                                ░
 ░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░*/

package com.shinkson47.SplashX6.utility.debug;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Vector3;
import com.shinkson47.SplashX6.Client;
import com.shinkson47.SplashX6.game.Hypervisor;
import com.shinkson47.SplashX6.game.world.WorldTerrain;
import com.shinkson47.SplashX6.rendering.ui.StageWindow;
import com.shinkson47.SplashX6.rendering.screens.game.GameScreen;

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
    public static DebugWindow MainDebugWindow = new DebugWindow();
    public static GameScreen gameRenderer;
    private static final List<String> Dumps = new ArrayList<>();

    // FIXME : This alias is dumb, and becomes out of sync with Client.debug_mode.
    public static boolean debugMode = Client.DEBUG_MODE;

    public static boolean enabled() { return debugMode; }

    public static void create(){
        gameRenderer = Hypervisor.getGameRenderer();
    }



    public synchronized static void update(){
        if (!debugMode) return;
        renderDots();
        renderMouseInfo();
        renderDumps();
    }

    private static void renderDumps() {
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

    }

    public static class DebugWindow extends StageWindow {

        public DebugWindow() {
            super("DEBUG", false);
            addButton("Toggle General Debug", o -> debugMode = !debugMode);

            seperate("Camera");

            addButton("Experimental : Toggle Camera Pan Tilt", o -> Hypervisor.getGameRenderer().getCam().setEnableMoveTilt(!Hypervisor.getGameRenderer().getCam().getEnableMoveTilt()));
            addButton("Experimental : Toggle Camera Zoom Tilt", o -> Hypervisor.getGameRenderer().getCam().setEnableZoomTilt(!Hypervisor.getGameRenderer().getCam().getEnableZoomTilt()));
            addButton("Rotate camera +", o -> Hypervisor.getGameRenderer().getCam().getCam().rotate(10,0,0,1));
            addButton("Rotate camera -", o -> Hypervisor.getGameRenderer().getCam().getCam().rotate(-10,0,0,1));

            addButton("Unit test", o -> { TestScript.INSTANCE.run(); dialog("Test script complete", "Check terminal for results."); });
        }

    }

    /**
     * <h2>Renders mouse information to the game screen.</h2>
     */
    private static void renderMouseInfo(){
        int mousex = Gdx.input.getX();
        int mousey = Gdx.input.getY();
        int rendery = Gdx.graphics.getHeight() - mousey;


        gameRenderer.getHUDBatch().begin();
        gameRenderer.getFont().draw(gameRenderer.getHUDBatch(), "Mouse Raw : x:" + mousex + ", y:" + mousey, mousex + 20, rendery - 20);
        gameRenderer.getHUDBatch().end();

        if (Gdx.input.isButtonPressed(Input.Buttons.LEFT)) {
            gameRenderer.getSr().setColor(0,1,0,1);
        } else
            gameRenderer.getSr().setColor(1,1,1,1);


        gameRenderer.getSr().setProjectionMatrix(gameRenderer.getHUDBatch().getProjectionMatrix());
        gameRenderer.getSr().begin(ShapeRenderer.ShapeType.Line);
        gameRenderer.getSr().line(0,rendery,0,Gdx.graphics.getWidth(),rendery,0);
        gameRenderer.getSr().line(mousex,0,0,mousex,Gdx.graphics.getHeight(),0);
        gameRenderer.getSr().end();

        gameRenderer.getSr().begin(ShapeRenderer.ShapeType.Filled);
        gameRenderer.getSr().circle(mousex, rendery, 5);
        gameRenderer.getSr().end();
    }

    private static void renderDots() {
        gameRenderer.getSr().begin(ShapeRenderer.ShapeType.Line);





        // selector
        //Vector3 v = GameHypervisor.getSelectedTile();
        //v = World.isoToCartesian((int)v.x, (int)v.y);

        // screen center white dot.
        gameRenderer.getSr().setColor(Color.WHITE);
        gameRenderer.getSr().setProjectionMatrix(gameRenderer.getHUDBatch().getProjectionMatrix());
        gameRenderer.getSr().circle(Gdx.graphics.getWidth() * 0.5f, Gdx.graphics.getHeight() * 0.5f, 5);
        //gameRenderer.getHUDBatch().begin();
        //gameRenderer.getFont().draw(gameRenderer.getHUDBatch(), "Screen center (White)", Gdx.graphics.getWidth() * 0.5f, Gdx.graphics.getHeight() * 0.5f + 5);



        gameRenderer.getSr().setProjectionMatrix(gameRenderer.getCam().combined);

        // White dot on the tile that te camera is looking at.
        Vector3 v = Hypervisor.camera_focusingOnTile();
        v = WorldTerrain.isoToCartesian((int)v.x, (int)v.y);
        gameRenderer.getSr().setColor(Color.RED);
        gameRenderer.getSr().circle(v.x, v.y, 4);
        //gameRenderer.getFont().draw(gameRenderer.getHUDBatch(), "Camera Cursor Selected Tile (Worldspace, Red)", v.x, v.y + 10);

        // purple dot where the camera's looking. should match above white dot
        gameRenderer.getSr().setColor(Color.PURPLE);
        v = new Vector3(gameRenderer.getCam().position.x, gameRenderer.getCam().lookingAtY(), 0);
        gameRenderer.getSr().circle(v.x, v.y, 3);
        //gameRenderer.getFont().draw(gameRenderer.getHUDBatch(), "Camera Cursor (Worldspace, Purple)", v.x, v.y + 10);
        //gameRenderer.getHUDBatch().end();


        gameRenderer.getSr().end();

        gameRenderer.getSr().begin(ShapeRenderer.ShapeType.Filled);
        // Grid
        for (int x = 0; x <= 10; x ++)
            for (int y = 0; y <= 10; y ++) {
                Vector3 vector = WorldTerrain.isoToCartesian(x,y);
                gameRenderer.getSr().circle(vector.x, vector.y, 10);
            }
        gameRenderer.getSr().end();
    }
}
