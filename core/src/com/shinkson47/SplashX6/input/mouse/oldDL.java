package com.shinkson47.SplashX6.input.mouse;

import com.badlogic.gdx.Gdx;

import java.awt.*;

/**
 * <h1>Handles the logic for mouse dragging</h1>
 * @author <a href="https://www.shinkson47.in">Jordan T. Gray on 12/04/2021</a>
 * @version 1
 * @since v1
 */
public class oldDL {

    /**
     * <h2>Logistical handler for each corresponding mouse button</h2>
     */
    public static DragLogistics LEFT = new DragLogistics(), RIGHT = new DragLogistics(), MIDDLE = new DragLogistics();

    /**
     * <h2>Is this mouse button down?</h2>
     */
    private boolean isDown;

    /**
     * <h2>The point on screen at which the button was pressed</h2>
     */
    private Point downLocation = new Point();

    /**
     * <h2>The last calculated delta</h2>
     */
    private Point lastDelta = new Point();

    // Anonymous constructor, Calculates delta at creation
    { up(); }

    /**
     * <h2>Is this mouse button down?</h2>
     * @return true of this button is down
     */
    public boolean isDown() {
        return isDown;
    }

    /**
     * <h2>Indicate that this button has been pressed</h2>
     * Stores the mouse's current location
     */
    public void down() {
        isDown = true;
        updateDownLoc();
    }

    /**
     * <h2>Indicate that this button has been released</h2>
     * Clears all stored data
     */
    public void up() {
        isDown = false;
        downLocation.setLocation(-1,-1);
        lastDelta.setLocation(-1,-1);
    }

    /**
     * <h2>Stores the mouse's location</h2>
     */
    private void updateDownLoc() {
        downLocation.setLocation(Gdx.input.getX(), Gdx.input.getY());
    }

    /**
     * <h2>Gets the difference between the mouse's current position, and the it's current position.</h2>
     * @return The delta between {@link DragLogistics#downLocation} and the mouse
     * @apiNote This call calculates the delta, and updates {@link DragLogistics#lastDelta} with the result, which is returned.
     */
    public Point getDelta() {
        lastDelta.setLocation(downLocation.x - Gdx.input.getX(), downLocation.y - Gdx.input.getY());
        updateDownLoc();

        return lastDelta;
    }

    /**
     * <h2>Calculates the delta, then returns the delta's x</h2>
     * @see DragLogistics#getDelta()
     * @return the x of {@link DragLogistics#lastDelta} after updating it.
     * @apiNote this call recalculates the delta, and updates {@link DragLogistics#lastDelta}
     */
    public int x() {
        return getDelta().x;
    }

    /**
     * <h2>Returns the y of the last known delta.</h2>
     * @return the y of the last known delta (Inverted to match worldspace)
     * @apiNote this call DOES NOT recalculate the delta, it relies on being a subsequent call to {@link DragLogistics#x()}
     */
    public int y() {
        return - lastDelta.y / 2;
    }
}
