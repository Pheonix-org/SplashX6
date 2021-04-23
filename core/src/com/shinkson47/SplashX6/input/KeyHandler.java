package com.shinkson47.SplashX6.input;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.shinkson47.SplashX6.rendering.screens.MainMenu;
import com.shinkson47.SplashX6.world.World;
import com.shinkson47.SplashX6.game.GameHypervisor;

import static com.shinkson47.SplashX6.Client.client;

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
public class KeyHandler {
    // TODO dynamic bindings (Key id > consumer kinda deal)

    public static void Poll(){
        if(Gdx.input.isKeyPressed(Input.Keys.ESCAPE))
                client.setScreen(new MainMenu());

        if (Gdx.input.isKeyJustPressed(Input.Keys.F5)) {
            GameHypervisor.NewGame();
        }

        if (Gdx.input.isKeyJustPressed(Input.Keys.F6))
            World.focusedWorld.swapTiledInterp();

    }
}