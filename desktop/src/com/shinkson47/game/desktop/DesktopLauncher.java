package com.shinkson47.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.shinkson47.game.game;
import xmlwise.Plist;

import java.awt.*;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		//config.fullscreen = true;

		Dimension a = Toolkit.getDefaultToolkit().getScreenSize();
		config.height = a.height;
		config.width = a.width;
		new LwjglApplication(new game(), config);
	}
}
