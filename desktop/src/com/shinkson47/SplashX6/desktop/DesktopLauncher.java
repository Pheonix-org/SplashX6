package com.shinkson47.SplashX6.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.shinkson47.SplashX6.Client;

import java.awt.*;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		//config.fullscreen = true;

		Dimension a = Toolkit.getDefaultToolkit().getScreenSize();
		config.height = a.height;
		config.width = a.width;
		config.fullscreen = true;
		new LwjglApplication(new Client(), config);
	}
}
