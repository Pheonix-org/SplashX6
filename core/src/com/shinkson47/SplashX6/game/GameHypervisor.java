package com.shinkson47.SplashX6.game;

import com.shinkson47.SplashX6.rendering.screens.WorldCreation;
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
     * <h2>Initiates the creation of a new game</h2>
     * But does not actually create it. This method switches to the world creation window,
     * which will callback when the user has configured the game and has rendered the loading screen.
     * The game will then be generated in {@link GameHypervisor#doNewGameCallback()}, during which the programme will be
     * un-responsive and unable to render.
     */
    public static void NewGame(){
        client.setScreen(new WorldCreation());
    }

    /**
     * <h2>Actually creates a new game</h2>
     */
    public static void doNewGameCallback(){
        // Create a new random world. This will be stored in World#focusedWorld automatically.
        World.create();

        // Create a new game screen, which will load in World#focusedWorld
        // It will also configure input for the game window.
        gameRenderer = new GameScreen();

        // This couldn't be done before a world is created, but is only temporary.
        // STOPSHIP: 17/04/2021 this is dumb and shouldn't stay
        Debug.create(); // TODO cannot create here, must be a better way

        // Set the client to display the new game window
        client.setScreen(gameRenderer);
    }

    public static GameScreen getGameRenderer() {
        return gameRenderer;
    }
}
