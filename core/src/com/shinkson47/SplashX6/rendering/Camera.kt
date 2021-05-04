package com.shinkson47.SplashX6.rendering

import com.badlogic.gdx.graphics.PerspectiveCamera
import com.badlogic.gdx.math.MathUtils
import com.badlogic.gdx.math.Vector3
import com.shinkson47.SplashX6.rendering.screens.GameScreen
import kotlin.math.max

// TODO checklist
// - make sure this works in place of the old cam
// - replace manually managed position, rotation and tilt with desire objects.

/**
 * # Camera used to render the game world
 * @author [Jordan T. Gray](https://www.shinkson47.in) on 02/05/2021
 * @since v1
 * @version 2
 */
class newCamera: PerspectiveCamera() {

    // ============================================================
    // region fields
    // ============================================================
    // TODO USER CONFIGURABLE SETTINGS
    // - Zoom sensitivity
    // - Enable / disable smooth motion
    // - Smooth zoom

    /**
     * TODO
     */
    private var rotation: Float = 0f

    /**
     * TODO
     */
    private var tilt: Float = 800f

    /**
     * TODO
     */
    private val Z: Int = 1000

    /**
     * # Where we desire the camera be
     */
    private var targetPosition: Vector3 = Vector3()
        set(value) {
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

            // Instead of creating a new instance, re-use this one. Probably a touch faster.
            targetPosition.set(value);
        }


    /**
     * # Where we desire the camera to be *this frame*
     */
    private var frameTargetPosition: Vector3 = Vector3()

    private var frameStep: Float = 0f


    // ============================================================
    // endregion fields
    // region functions
    // ============================================================

    @Deprecated("Legacy - Support for java version")
    fun getCam() : PerspectiveCamera = this


    /**
     * # Main update routine
     */
    override fun update() {
        updateFrameDesires()
        updateMove()
        updateTilt()
        // updateTilt()
        super.update();
    }

    fun setDeltaPosition(x: Float, y: Float) = targetPosition.add(x,y,0f);

    fun AssertInBounds() { targetPosition = position }

    fun deltaZoom(delta: Float) {
        // TODO store max min elsewhere
        fieldOfView = MathUtils.clamp(fieldOfView + delta, 10f, 28f)

        if (enableZoomTilt) tilt = MathUtils.clamp(tilt + delta * 27.7f, 800f, 1000f)

        AssertInBounds()
        setTilt()
    }

    private fun setTilt() = lookAt(position.x, position.y + tilt, 0f)

    // ============================================================
    // endregion functions
    // region subroutines
    // ============================================================

    private fun updateFrameDesires() {
        // Get desired position, and calculate the position for this frame.
        frameTargetPosition = targetPosition;

        // TODO honestly not sure how this isn't completely broken...
        frameTargetPosition.rotate(position, -rotation)

        // Calculate the size of movement to be taken this frame
        frameStep = (position.x + position.y - (frameTargetPosition.x + frameTargetPosition.y)) / 2500

        // Normalise to positive
        frameStep = max(frameStep, -frameStep)
    }

    /**
     * TODO
     */
    private fun updateMove(){
        // TODO these two lines shouldn't happen every frame, they're pretty heavy
        GameScreen.r.setView(combined,position.x - viewportWidth * 0.5f,position.y,  viewportWidth + fieldOfView, viewportHeight * fieldOfView)
        position.lerp(frameTargetPosition, frameStep)
    }

    /**
     * TODO
     */
    private fun updateTilt() {
        if (enableMoveTilt) {
            val rotStep = frameStep * 4

            if (frameTargetPosition.x > position.x && rotation < ROTATION_LIMIT) {
                rotate(rotStep, 0f, 0f, 1f)
                rotation += rotStep
            } else if (frameTargetPosition.x < position.x && rotation > -ROTATION_LIMIT) {
                rotate(-rotStep, 0f, 0f, 1f)
                rotation -= rotStep
            }
        }
    }



    // ============================================================
    // endregion subroutines
    // region companion
    // ============================================================


    /**
     * # TODO
     */
    companion object {

            /**
             * TODO
             */
            private val ROTATION_LIMIT: Int = 5

            /**
             * TODO
             */
            private var enableMoveTilt: Boolean = false

            /**
             * TODO
             */
            private var enableZoomTilt: Boolean = false

        init {
            TODO()
        }
    }

    /**
     * # A value which moves closer to the desired value by [alpha]
     */
    class lerpDesire<type> @JvmOverloads constructor (_present: type, _desired: type, _alpha: Float = 0.1f) {
        constructor(_value: type)                   : this(_value, _value)
        constructor(_value: type, _alpha: Float)    : this(_value, _value, _alpha)

        /**
         * The Current value
         */
        var present: type = _present

        /**
         * The value desired
         */
        var desired: type = _desired

        /**
         * The quantity of change per [next]
         */
        var alpha: Float = _alpha

        /**
         * Moves [present] towards [desired] by [alpha] and returns.
         */
        fun next(): type {
            when (present) {
                is Vector3 -> (present as Vector3).lerp(desired as Vector3, alpha);
                is Float   ->  present = MathUtils.lerp(present as Float, desired as Float, alpha) as type
            }
            return get()
        }

        /**
         * Gets [present]
         */
        fun get(): type = present

        /**
         * Ensures that [type] is a supported type: Vector3 or Float
         */
        init {
            if (!(
                        present is Vector3 ||
                        present is Float
              )) throw IllegalArgumentException("Unsupported Desire Object : $present")
        }
    }

    // ============================================================
    // endregion companion
    // region initalisation    
    // ============================================================

    init {
        //resize(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
    }

    // ============================================================
    // endregion initalisation    
    // ============================================================


}