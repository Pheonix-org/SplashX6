package com.shinkson47.SplashX6.rendering;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Vector3;
import com.shinkson47.SplashX6.game.GameHypervisor;
import com.shinkson47.SplashX6.world.World;

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
    public void setTargetPosition(Vector3 vector){
        float scaledViewportWidthHalfExtent = cam.viewportWidth * cam.zoom * 0.5f;
        float scaledViewportHeightHalfExtent = cam.viewportHeight * cam.zoom * 0.5f;
        float minx = scaledViewportWidthHalfExtent;
        float miny = scaledViewportHeightHalfExtent;
        float xmax = World.focusedWorld.width() * World.TILE_WIDTH;
        float ymax = World.focusedWorld.height() * World.TILE_HEIGHT * 0.5f;

        // Horizontal
        if (vector.x < scaledViewportWidthHalfExtent)
            vector.x = scaledViewportWidthHalfExtent;
        else if (vector.x > xmax - scaledViewportWidthHalfExtent)
            vector.x = xmax - scaledViewportWidthHalfExtent;

        // Vertical
        if (vector.y < scaledViewportHeightHalfExtent)
            vector.y = scaledViewportHeightHalfExtent;
        else if (vector.y > ymax - scaledViewportHeightHalfExtent)
            vector.y = ymax - scaledViewportHeightHalfExtent;

        vector.x = (vector.x < minx) ? minx : Math.min(vector.x, xmax);
        vector.y = (vector.y < miny) ? miny : Math.min(vector.y, ymax);

        targetPosition.set(vector);
    }

    public void setDeltaPosition(int x, int y){
        setTargetPosition(targetPosition.add(x,y,z));
    }


    public void deltaZoom(float delta){
        cam.zoom = MathUtils.clamp(cam.zoom + (delta / 10), 0f, 5f);
    }
}
