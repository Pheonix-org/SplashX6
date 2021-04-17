package com.shinkson47.SplashX6;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.shinkson47.SplashX6.game.GameHypervisor;
import com.shinkson47.SplashX6.utility.Assets;
import com.shinkson47.SplashX6.utility.Debug;
import com.shinkson47.SplashX6.input.KeyHandler;
import com.shinkson47.SplashX6.input.mouse.MouseHandler;
import com.shinkson47.SplashX6.rendering.screens.MainMenu;
import com.shinkson47.SplashX6.world.World;

/**
 * <h1>The main game class</h1>
 * This is the entry point to Spalsh X6, and cascades LibGDX's api calls throughout
 * the game's classes.
 */
public class Client extends Game {

	public static final float r = 0.2588235294f, g = 0.2588235294f, b = 0.9058823529f, a = 1;
	public static final float hr = 0.6470588235f, hg = 0.6470588235f;
	public static Game client;
	Screen currentScreen;

	/**
	 * <h2>The game has booted, create stuff</h2>
	 */
	@Override
	public void create () {
		client = this;
		Assets.Create();
		MouseHandler.create();

		currentScreen = new MainMenu();
		setScreen(currentScreen);

		Gdx.gl.glClearColor(r,g,b,a );
	}

	/**
	 * <h2>Framely update</h2>
	 * Render, check for inputs, etc.
	 */
	@Override
	public void render () {
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		KeyHandler.Poll();
		MouseHandler.Poll();
		currentScreen.render(Gdx.graphics.getDeltaTime());
		//Renderer.render();
		//AudioManager.Update();
		//Debug.update();
	}

	/**
	 * <h2>Game was requested to close</h2>
	 * Save, close
	 */
	@Override
	public void dispose () {
		GameHypervisor.getGameRenderer().dispose();
		World.dispose();
		//AudioManager.dispose();
		Debug.dispose();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void setScreen(Screen screen) {
		super.setScreen(screen);
		currentScreen = screen;
	}
}
