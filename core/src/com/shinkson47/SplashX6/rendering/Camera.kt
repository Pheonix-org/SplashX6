package com.shinkson47.SplashX6.rendering

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.graphics.PerspectiveCamera
import com.badlogic.gdx.math.MathUtils
import com.badlogic.gdx.math.Vector3
import com.shinkson47.SplashX6.rendering.screens.GameScreen
import kotlin.math.max
import kotlin.math.pow

// TODO checklist
// - make sure this works in place of the old cam
// - replace manually managed position, rotation and tilt with desire objects.

/**
 * # Camera used to render the game world
 * @author [Jordan T. Gray](https://www.shinkson47.in) on 02/05/2021
 * @since v1
 * @version 2
 */
class Camera: PerspectiveCamera() {

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
    private val Z: Int = 1000

    /**
     * TODO
     */
    private val ROTATION_LIMIT: Int = 5
    // TODO move these to companion? They should be effectively static.
    private val ZOOM_MINIMUM: Float = 10f
    private val ZOOM_MAXIMUM: Float = 28f
    var zoomSpeed: Float = 0.1f;
    var zoomMultiplier: Float = 8f
    var dragMultiplier: Float = 10f

    /**
     * TODO
     */
    public var enableMoveTilt: Boolean = true

    /**
     * TODO
     */
    public var enableZoomTilt: Boolean = true


    /**
     * # Where we desire the camera be
     */
    val desiredPosition: lerpDesire<Vector3> = lerpDesire(position);

    /**
     * TODO
     */
    val desiredRotation: lerpDesire<Float> = lerpDesire(0f)

    /**
     * TODO
     */
    val desiredTilt: lerpDesire<Float> = lerpDesire(27f, zoomSpeed)

    val desiredZoom: lerpDesire<Float> = lerpDesire(ZOOM_MINIMUM, zoomSpeed)

    fun setDesiredPosition(position: Vector3){
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
            desiredPosition.set(position);
        }


    // ============================================================
    // endregion fields
    // region functions
    // ============================================================

    @Deprecated("Legacy - Support for java version")
    fun getCam() : PerspectiveCamera = this


    /**
     * # Update and render routine
     */
    override fun update() {
        updateMove()
        updateTilt()
        updateRotation()
        updateZoom()

        super.update() // render
    }




    fun setDeltaPosition(x: Float, y: Float) = desiredPosition.desired.add((x/desiredZoom.get().pow(2))*dragMultiplier,(y/desiredZoom.get().pow(2))*dragMultiplier,0f);

    // TODO
    fun AssertInBounds() {  }

    fun deltaZoom(delta: Float) {
        // TODO store max min elsewhere
        desiredZoom.set(MathUtils.clamp(fieldOfView + (delta * zoomMultiplier), 10f, 28f))
        desiredTilt.set(desiredZoom.desired.pow(2))

        AssertInBounds()
    }

    private fun updateTilt() {if (enableZoomTilt) lookAt(position.x, position.y + desiredTilt.next(), 0f)}

    // ============================================================
    // endregion functions
    // region subroutines
    // ============================================================

    private fun updateFrameDesires() {

        // Calculate the size of movement to be taken this frame
        desiredPosition.alpha = (desiredPosition.desired.x + desiredPosition.desired.y - (desiredPosition.desired.x + desiredPosition.desired.y)) / 2500

        // Normalise to positive
        desiredPosition.alpha = max(desiredPosition.alpha , -desiredPosition.alpha)
    }

    private fun updateRotation() {
        if (enableMoveTilt) {
            val rotStep = desiredPosition.alpha * 4

            if (desiredPosition.desired.x > position.x && desiredRotation.desired < ROTATION_LIMIT) {
                rotate(rotStep, 0f, 0f, 1f)
                desiredRotation.desired += rotStep
            } else if (desiredPosition.desired.x < position.x && desiredRotation.desired > -ROTATION_LIMIT) {
                rotate(-rotStep, 0f, 0f, 1f)
                desiredRotation.desired -= rotStep
            }
        }
    }

    private fun updateZoom() {
        fieldOfView = desiredZoom.next()
    }

    /**
     * TODO
     */
    private fun updateMove(){
        // TODO these two lines shouldn't happen every frame, they're pretty heavy

        // (badly) Change viewport to match field of view
        GameScreen.r.setView(combined,position.x - viewportWidth * 0.5f,position.y,  viewportWidth + fieldOfView, viewportHeight * fieldOfView)

        // Move towards desired position
        position.set(desiredPosition.next());
    }






    // ============================================================
    // endregion subroutines
    // region companion
    // ============================================================


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
         * Sets [desired]
         */
        fun set(value: type) {desired = value}

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

    fun resize(width: Float, height: Float) {
    //        cam = new OrthographicCamera(width,height * (height / width));
        super.viewportHeight = Gdx.graphics.height.toFloat()
        super.viewportWidth = Gdx.graphics.width.toFloat()
        position.set(100f, 100f, Z.toFloat())

        // This can be in init
        far = 100f
        near = 0f

        AssertInBounds()
        updateTilt()

        update()
    }

    // ============================================================
    // endregion companion
    // region initalisation    
    // ============================================================

    init {
        position.z = 100f
        deltaZoom(1f);
        AssertInBounds();
        //resize(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
    }

    // ============================================================
    // endregion initalisation    
    // ============================================================


}