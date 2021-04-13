package com.shinkson47.game.input.mouse;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputMultiplexer;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.maps.tiled.TiledMapTileLayer;
import com.badlogic.gdx.math.Vector3;
import com.shinkson47.game.rendering.Camera;
import com.shinkson47.game.rendering.Renderer;
import com.shinkson47.game.world.World;

/**
 * <h1></h1>
 * <br>
 * <p>
 *
 * </p>
 *
 * @author <a href="https://www.shinkson47.in">Jordan T. Gray on 12/04/2021</a>
 * @version 1
 * @since v1
 */
public class MouseHandler {

    public static void create(){
        // TODO This poll could be a callback using this kind of processor
        InputMultiplexer inputMultiplexer = new InputMultiplexer();
        inputMultiplexer.addProcessor(new InputProcessor() {
            @Override
            public boolean keyDown(int keycode) {
                return false;
            }

            @Override
            public boolean keyUp(int keycode) {
                return false;
            }

            @Override
            public boolean keyTyped(char character) {
                return false;
            }

            @Override
            public boolean touchDown(int screenX, int screenY, int pointer, int button) {
                return false;
            }

            @Override
            public boolean touchUp(int screenX, int screenY, int pointer, int button) {
                return false;
            }

            @Override
            public boolean touchDragged(int screenX, int screenY, int pointer) {
                return false;
            }

            @Override
            public boolean mouseMoved(int screenX, int screenY) {
                return false;
            }

            @Override
            public boolean scrolled(float amountX, float amountY) {
                Renderer.getCam().deltaZoom(amountY / 2);
                return false;
            }
        });
        Gdx.input.setInputProcessor(inputMultiplexer);
    }

    public static void Poll() {
//        if (Gdx.input.isButtonJustPressed(Input.Buttons.LEFT)) {
//            Vector3 vector = Renderer.getCam().getCam().unproject(World.WorldspaceToMapspace((int) (Gdx.input.getX()-Renderer.getCam().getCam().position.x), (int) (Gdx.input.getY()-Renderer.getCam().getCam().position.y)));
//            ((TiledMapTileLayer) World.focusedWorld.getMap().getLayers().get(0)).getCell((int)vector.x, (int)vector.y).setTile(null);
//        }


        if (DragLogistics.MIDDLE.isDown() && !Gdx.input.isButtonPressed(Input.Buttons.MIDDLE))
                DragLogistics.MIDDLE.up();

        if(Gdx.input.isButtonJustPressed(Input.Buttons.MIDDLE))
                DragLogistics.MIDDLE.down();


        if (DragLogistics.MIDDLE.isDown())
            Renderer.getCam().setDeltaPosition(DragLogistics.MIDDLE.x(),DragLogistics.MIDDLE.y());

    }
}
