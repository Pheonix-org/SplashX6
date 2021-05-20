package com.shinkson47.SplashX6.game.units

import com.badlogic.gdx.graphics.g2d.Sprite
import com.badlogic.gdx.math.Vector3
import com.shinkson47.SplashX6.game.world.World

/**
 * # A user playable unit.
 * @author [Jordan T. Gray](https://www.shinkson47.in) on 19/05/2021
 * @since v1
 * @version 1
 */
class Unit : Sprite() {


    // ============================================================
    // region fields
    // ============================================================

    /**
     * # The location of the
     */
    var isoX: Int = 0
        private set

    var isoY: Int = 0
        private set


    // ============================================================
    // endregion fields
    // region functions  
    // ============================================================

    @Deprecated("see [setPosition]")
    override fun setX(x: Float) {
        super.setX(x);
    }
    @Deprecated("see [setPosition]")
    override fun setY(y: Float) {
        super.setX(y);
    }

    /**
     * # Sets the location of this sprite in iso space.
     * where [x] and [y] are iso co-ordinates, and are stored in [isoX], [isoY].
     *
     * super.[x] and super.[y] store cartesian equivelants, which are calculated in [World.isoToCartesian]
     *
     * For a delta translation, see [deltaPosition]
     */
    fun setPosition(x: Int, y: Int): Vector3 {
        isoX = x; isoY = y;

        val pos: Vector3 = World.isoToCartesian(x, y);

        setX(pos.x)
        setY(pos.y)
        return pos
    }

    /**
     * # Moves this sprite by a x, and y, iso tiles.
     */
    fun deltaPosition(deltaX: Int, deltaY: Int): Vector3 {
        isoX += deltaX
        isoY += deltaY
        return setPosition(isoX, isoY)
    }

    // ============================================================
    // endregion functions
    // region companion    
    // ============================================================

    /**
     * # TODO
     */
    companion object {
        init {

        }
    }

    // ============================================================
    // endregion companion
    // region initalisation    
    // ============================================================

    init {

    }

    // ============================================================
    // endregion initalisation    
    // ============================================================


}