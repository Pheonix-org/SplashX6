package com.shinkson47.SplashX6.desktop;

import com.badlogic.gdx.Files;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.shinkson47.SplashX6.Client;

import java.awt.*;

public class SplashX6 {
	// TODO some kind of swing or java FX launcher GUI.
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		//config.fullscreen = true;

		Dimension a = Toolkit.getDefaultToolkit().getScreenSize();
		config.height = a.height;
		config.width = a.width;

		config.title = "Splash X6";
		config.addIcon("sprites/icon.png", Files.FileType.Internal);

		config.fullscreen = false;

		new LwjglApplication(new Client(), config);
	}
}
