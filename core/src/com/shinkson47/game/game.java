package com.shinkson47.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.shinkson47.game.input.KeyHandler;
import com.shinkson47.game.input.mouse.MouseHandler;
import com.shinkson47.game.rendering.Renderer;
import com.shinkson47.game.world.World;

public class game extends ApplicationAdapter {

	@Override
	public void create () {
		MouseHandler.create();
		World.create();
		Renderer.create();
	}

	@Override
	public void render () {
		KeyHandler.Poll();
		MouseHandler.Poll();
		Renderer.render();
	}
	
	@Override
	public void dispose () {
		Renderer.dispose();
		World.dispose();
	}


}
