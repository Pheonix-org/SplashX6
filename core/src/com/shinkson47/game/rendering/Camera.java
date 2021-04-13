package com.shinkson47.game.rendering;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.math.Interpolation;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Vector3;

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
public class Camera {
    // TODO CONFIGURABLE
    // - Zoom sensitivity
    // - Enable / disable smooth motion
    // - Smooth zoom

    private OrthographicCamera cam;
    private Vector3 targetPosition = new Vector3();
    private static final int z = 0;

    public OrthographicCamera getCam() {
        return cam;
    }

    public Camera() {
        cam = new OrthographicCamera();
        cam.near = 10;
    }

    public void resize(float width, float height){
        cam = new OrthographicCamera(width,height * (height / width));
        cam.position.set(cam.viewportWidth / 2f, cam.viewportHeight / 2f, 0);
    }

    public void update() {
        cam.position.lerp(targetPosition, 0.1f);

        cam.update();
    }
    public void setTargetPosition(int x, int y){
        targetPosition.set(x,y,z);
    }

    public void setDeltaPosition(int x, int y){
        targetPosition.add(x,y,z);
    }


    public void deltaZoom(float delta){
        cam.zoom = MathUtils.clamp(cam.zoom + (delta / 10), 0f, 5f);
    }
}
