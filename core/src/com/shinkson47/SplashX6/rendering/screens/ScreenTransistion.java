package com.shinkson47.SplashX6.rendering.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.shinkson47.SplashX6.Client;

/**
 * An aggregate screen which fades between two other screens.
 */
public class ScreenTransistion extends ScreenAdapter {
    private ShapeRenderer fadeRenderer = new ShapeRenderer();
    private Screen currentScreen;
    private Screen nextScreen;


    // Once this reaches 1.0f the next scene is shown
    private float alpha = 0;
    // true if fade in, false if fade out
    private boolean fadeDirection = true;

    public ScreenTransistion(Screen current, Screen next) {
        this.currentScreen = current;
        this.nextScreen = next;
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0, 0, 0, 0);
        Gdx.gl.glClear(Gdx.gl.GL_COLOR_BUFFER_BIT);

        try {
            if (fadeDirection)
                currentScreen.render(Gdx.graphics.getDeltaTime());
            else
                nextScreen.render(Gdx.graphics.getDeltaTime());
        } catch (Exception ignored) {}
        // Exceptions caused by screens being strange states whilst trying to render;
        // Such as rendering the game screen when we are transitioning out of the game.
        // At this time the game no longer exists, but we're still trying to render it.
        // Stuff like that. Ignore it.

        fadeRenderer.setColor(0, 0, 0, alpha);
        Gdx.gl.glEnable(Gdx.gl.GL_BLEND);
        Gdx.gl.glBlendFunc(Gdx.gl.GL_SRC_ALPHA, Gdx.gl.GL_ONE_MINUS_SRC_ALPHA);


        fadeRenderer.begin(ShapeRenderer.ShapeType.Filled);
            fadeRenderer.rect(0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        fadeRenderer.end();

        Gdx.gl.glDisable(Gdx.gl.GL_BLEND);

        if (alpha >= 1)
            fadeDirection = false;
        else if (alpha <= 0 && !fadeDirection)
            Client.client.setScreen(nextScreen);

        alpha += fadeDirection ? 0.1 : -0.1;
    }
}