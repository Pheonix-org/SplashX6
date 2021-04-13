package com.shinkson47.game.input.mouse;

import com.badlogic.gdx.Gdx;

import java.awt.*;

/**
 * <h1>Handles the logic for mouse dragging</h1>
 * <br>
 * <p>
 *
 * </p>
 *
 * @author <a href="https://www.shinkson47.in">Jordan T. Gray on 12/04/2021</a>
 * @version 1
 * @since v1
 */
public class DragLogistics {
    public static DragLogistics LEFT = new DragLogistics(), RIGHT = new DragLogistics(), MIDDLE = new DragLogistics();

    private boolean isDown;
    private Point downLocation = new Point(), lastDelta = new Point();
    { up(); }

    public boolean isDown() {
        return isDown;
    }

    public void down() {
        isDown = true;
        updateDownLoc();
    }

    private void updateDownLoc() {
        downLocation.x = Gdx.input.getX();
        downLocation.y = Gdx.input.getY();
    }

    public void up() {
        isDown = false;
        downLocation.setLocation(-1,-1);
        lastDelta.setLocation(-1,-1);
    }

    public Point getDelta() {
        lastDelta.setLocation(downLocation.x - Gdx.input.getX(), downLocation.y - Gdx.input.getY());
        updateDownLoc();

        return lastDelta;
    }

    public int x() {
        return getDelta().x;
    }

    public int y() {
        return - lastDelta.y / 2;
    }
}
