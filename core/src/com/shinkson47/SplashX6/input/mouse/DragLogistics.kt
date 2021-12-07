package com.shinkson47.SplashX6.input.mouse

import com.badlogic.gdx.Gdx
import com.shinkson47.SplashX6.input.mouse.DragLogistics
import java.awt.Point

/**
 * # Handles the logic for mouse dragging
 * @author [Jordan T. Gray]() on 12/04/2021]
 * @version 1
 * @since v1
 */
class DragLogistics {
    /**
     * <h2>Is this mouse button down?</h2>
     */
    var isDown = false
        private set

    /**
     * <h2>The point on screen at which the button was pressed</h2>
     */
    private val downLocation = Point()

    /**
     * <h2>The last calculated delta</h2>
     */
    private val lastDelta = Point()

    /**
     * <h2>Indicate that this button has been pressed</h2>
     * Stores the mouse's current location
     */
    fun down() {
        isDown = true
        updateDownLoc()
    }

    /**
     * <h2>Indicate that this button has been released</h2>
     * Clears all stored data
     */
    fun up() {
        isDown = false
        downLocation.setLocation(-1, -1)
        lastDelta.setLocation(-1, -1)
    }

    /**
     * <h2>Stores the mouse's location</h2>
     */
    private fun updateDownLoc() {
        downLocation.setLocation(Gdx.input.x, Gdx.input.y)
    }

    val delta: Point
        /**
         * <h2>Gets the difference between the mouse's current position, and the it's current position.</h2>
         * @return The delta between [DragLogistics.downLocation] and the mouse
         * @apiNote This call calculates the delta, and updates [DragLogistics.lastDelta] with the result, which is returned.
         */
        get() {
            lastDelta.setLocation(downLocation.x - Gdx.input.x, downLocation.y - Gdx.input.y)
            updateDownLoc()
            return lastDelta
        }

    /**
     * <h2>Calculates the delta, then returns the delta's x</h2>
     * @see DragLogistics.getDelta
     * @return the x of [DragLogistics.lastDelta] after updating it.
     * @apiNote this call recalculates the delta, and updates [DragLogistics.lastDelta]
     */
    fun x(): Int {
        return delta.x
    }

    /**
     * <h2>Returns the y of the last known delta.</h2>
     * @return the y of the last known delta (Inverted to match worldspace)
     * @apiNote this call DOES NOT recalculate the delta, it relies on being a subsequent call to [DragLogistics.x]
     */
    fun y(): Int {
        return -lastDelta.y / 2
    }

    companion object {
        /**
         * <h2>Logistical handler for each corresponding mouse button</h2>
         */
        @JvmField
        var LEFT = DragLogistics()
        @JvmField
        var RIGHT = DragLogistics()
        @JvmField
        var MIDDLE = DragLogistics()
    }

    // Anonymous constructor, Calculates delta at creation
    init {
        up()
    }
}