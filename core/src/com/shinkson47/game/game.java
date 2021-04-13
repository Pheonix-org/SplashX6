package com.shinkson47.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.shinkson47.game.input.KeyHandler;
import com.shinkson47.game.input.mouse.MouseHandler;
import com.shinkson47.game.rendering.Renderer;
import com.shinkson47.game.world.World;

/**
 * <h1>The main game class</h1>
 * This is the entry point to Spalsh X6, and cascades LibGDX's api calls throughout
 * the game's classes.
 */
public class game extends ApplicationAdapter {

	/**
	 * <h2>The game has booted, create stuff</h2>
	 */
	@Override
	public void create () {
		MouseHandler.create();
		World.create();
		Renderer.create();
		//AudioManager.create();
		Debug.create();
	}

	/**
	 * <h2>Framely update</h2>
	 * Render, check for inputs, etc.
	 */
	@Override
	public void render () {
		KeyHandler.Poll();
		MouseHandler.Poll();
		Renderer.render();
		//AudioManager.Update();
		Debug.update();
	}

	/**
	 * <h2>Game was requested to close</h2>
	 * Save, close
	 */
	@Override
	public void dispose () {
		Renderer.dispose();
		World.dispose();
		//AudioManager.dispose();
		Debug.dispose();
	}
}
