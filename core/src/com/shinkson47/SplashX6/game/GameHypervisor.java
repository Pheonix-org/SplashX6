package com.shinkson47.SplashX6.game;

import com.shinkson47.SplashX6.rendering.screens.GameScreen;
import com.shinkson47.SplashX6.utility.Debug;
import com.shinkson47.SplashX6.world.World;

import static com.shinkson47.SplashX6.Client.client;

/**
 * <h1>The main overseer for a game.</h1>
 * <br>
 * <p>
 * Manages and handles all interactions with the current game, and interacts with the client.
 * </p>
 *
 * @author <a href="https://www.shinkson47.in">Jordan T. Gray on 16/04/2021</a>
 * @version 1
 * @since v1
 */
public class GameHypervisor {

    private static GameScreen gameRenderer;

    /**
     * <h2>Creates a new game</h2>
     * @return true if new game was created
     */
    public static boolean NewGame(){
        World.create();
        gameRenderer = new GameScreen();
        Debug.create();
        // TODO cannot create here, must be a better way



        client.setScreen(gameRenderer);
        return true;
    }

    public static GameScreen getGameRenderer() {
        return gameRenderer;
    }
}
