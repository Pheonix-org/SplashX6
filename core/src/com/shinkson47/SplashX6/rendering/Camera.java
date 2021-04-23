package com.shinkson47.SplashX6.rendering;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.PerspectiveCamera;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Vector3;
import com.shinkson47.SplashX6.Client;
import com.shinkson47.SplashX6.rendering.screens.GameScreen;
import com.shinkson47.SplashX6.world.World;
import org.w3c.dom.Node;

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

    private PerspectiveCamera cam;
    private float rotation = 0, tilt = 800;
    private Vector3 targetPosition = new Vector3();
    private static final int z = 1000, ROTATION_LIMIT = 5;
    public boolean enableMoveTilt, enableZoomTilt;

    public PerspectiveCamera getCam() {
        return cam;
    }

    public Camera() {
        //resize(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
    }

    public void resize(float width, float height){
//        cam = new OrthographicCamera(width,height * (height / width));
        cam = new PerspectiveCamera(28, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());

        cam.position.set(100,100,z);
        setTilt();
        cam.far = 100;
        cam.near = 0;
        cam.update();

        AssertInBounds();
    }

    public void update() {
        Vector3 targetPosition = new Vector3(this.targetPosition);
        targetPosition.rotate(cam.position, -rotation);
        float step = ((cam.position.x + cam.position.y) - (targetPosition.x + targetPosition.y)) / 2500;
        step = Math.max(step, -step);

        cam.position.lerp(targetPosition, step);

        if (enableMoveTilt){
            float rotStep = step * 4;
            if (targetPosition.x > cam.position.x && rotation < ROTATION_LIMIT) {
                cam.rotate(rotStep,0,0,1);
                rotation += rotStep;
            } else if (targetPosition.x < cam.position.x && rotation > -ROTATION_LIMIT) {
                cam.rotate(-rotStep,0,0,1);
                rotation -= rotStep;
            }
        }


        // TODO this should not happen every frame, it's pretty heavy
        GameScreen.r.setView(cam.combined, cam.position.x - cam.viewportWidth * 0.5f , cam.position.y, cam.viewportWidth + cam.fieldOfView, cam.viewportHeight * cam.fieldOfView);
        cam.update();
    }
    public void setTargetPosition(Vector3 vector){
//        float scaledViewportWidthHalfExtent = cam.viewportWidth * cam.fieldOfView * 0.5f;
//        float scaledViewportHeightHalfExtent = cam.viewportHeight * cam.fieldOfView * 0.5f;
//        float minx = scaledViewportWidthHalfExtent;
//        float miny = scaledViewportHeightHalfExtent;
//        float xmax = World.focusedWorld.width() * World.TILE_WIDTH;
//        float ymax = World.focusedWorld.height() * World.TILE_HEIGHT * 0.5f;
//
//        // Horizontal
//        if (vector.x < scaledViewportWidthHalfExtent)
//            vector.x = scaledViewportWidthHalfExtent;
//        else if (vector.x > xmax - scaledViewportWidthHalfExtent)
//            vector.x = xmax - scaledViewportWidthHalfExtent;
//
//        // Vertical
//        if (vector.y < scaledViewportHeightHalfExtent)
//            vector.y = scaledViewportHeightHalfExtent;
//        else if (vector.y > ymax - scaledViewportHeightHalfExtent)
//            vector.y = ymax - scaledViewportHeightHalfExtent;
//
//        vector.x = (vector.x < minx) ? minx : Math.min(vector.x, xmax);
//        vector.y = (vector.y < miny) ? miny : Math.min(vector.y, ymax);

        targetPosition.set(vector);
    }

    public void setDeltaPosition(int x, int y){
        setTargetPosition(targetPosition.add(x,y,0));
    }

    public void AssertInBounds(){
        setTargetPosition(cam.position);
    }

    public void deltaZoom(float delta){
        cam.fieldOfView = MathUtils.clamp(cam.fieldOfView + delta, 10f, 28f);
        if (enableZoomTilt) tilt = MathUtils.clamp(tilt + (delta * 27.7f), 800, 1000);
        AssertInBounds();
        setTilt();
    }

    private void setTilt(){
        cam.lookAt(cam.position.x, cam.position.y + tilt, 0);
    }

}
