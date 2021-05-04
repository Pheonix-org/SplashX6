package com.shinkson47.SplashX6.rendering

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.graphics.PerspectiveCamera
import com.badlogic.gdx.math.MathUtils
import com.badlogic.gdx.math.Vector3
import com.shinkson47.SplashX6.game.GameHypervisor
import com.shinkson47.SplashX6.rendering.screens.GameScreen
import com.shinkson47.SplashX6.utility.Debug
import com.shinkson47.SplashX6.utility.lerpDesire
import com.shinkson47.SplashX6.world.World
import kotlin.math.PI
import kotlin.math.tan

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

    companion object {
        /**
         * # Constant height of the camera over the world plane.
         */
        private val Z: Int = 1000

        /**
         * # Max degrees of rotation that the camara may turn when being dragged.
         */
        private val ROTATION_LIMIT: Int = 5

        /**
         * # The smallest possible pov angle in degrees
         */
        private val ZOOM_MINIMUM: Float = 10f

        /**
         * # The largest possible pov angle in degrees
         */
        private val ZOOM_MAXIMUM: Float = 28f
    }

    /**
     * # Lerp alpha for zoom
     * Defines the speed the camera zooms towards the desired pov.
     */
    var zoomSpeed: Float = 0.1f;

    /**
     * # Lerp alpha for movement
     * Defines the speed the camera zooms towards the desired position.
     */
    var moveSpeed: Float = 0.1f;

    /**
     * # Multiplies how much a delta zoom affects the pov.
     * Essentially changes how sensitive the camera's zoom is to the scroll wheel.
     *
     * fov = fov + (delta * zoomMultiplier)
     */
    var zoomMultiplier: Float = 5f

    /**
     * # Multiplies how much the zoom affects the pov.
     * Essentially changes how sensitive the tilt is with the zoom
     */
    var tiltMultiplier: Float = 0.5f

    /**
     * # Multiplies how much a delta move affects the position
     * Essentially changes how sensitive the movement is to the mouse drag
     *
     * position = position + (delta * zoomMultiplier)
     */
    var dragMultiplier: Float = 10f

    /**
     * # Allows the camera to look along the y axis as zoom changes
     */
    var enableMoveTilt: Boolean = true

    /**
     * # Allows the camera to subtly rotate as it moves
     */
    var enableZoomTilt: Boolean = true

    /**
     * # Where we desire the camera be
     */
    val desiredPosition: lerpDesire<Vector3> = lerpDesire(position, moveSpeed)

    /**
     * # Desired degrees of rotation
     */
    val desiredRotation: lerpDesire<Float> = lerpDesire(0f)

    /**
     * # Desired degrees of tilt
     */
    val desiredTilt: lerpDesire<Float> = lerpDesire(27f, zoomSpeed)

    /**
     * # Desired degrees of fov
     */
    val desiredZoom: lerpDesire<Float> = lerpDesire(ZOOM_MINIMUM, zoomSpeed)


    // ============================================================
    // endregion fields
    // region functions
    // ============================================================


    /**
     * # Sets the position that the camera is desired to be.
     */
    fun setDesiredPosition(position: Vector3){ desiredPosition.set(position); }

    /**
     * # Moves [desiredPosition] by delta [x] and [y]
     */
    fun setDeltaPosition(x: Float, y: Float) = desiredPosition.desired.add((x/desiredZoom.get())*dragMultiplier,(y/desiredZoom.get())*dragMultiplier,0f);

    /**
     * # Changes [desiredZoom] by [delta].
     */
    fun deltaZoom(delta: Float) {
        desiredZoom.set(MathUtils.clamp(fieldOfView + (delta * zoomMultiplier), ZOOM_MINIMUM, ZOOM_MAXIMUM))
        desiredTilt.set(MathUtils.clamp(MathUtils.lerp(36f, 60f, 1/(((fieldOfView-ZOOM_MINIMUM)/(ZOOM_MAXIMUM - ZOOM_MINIMUM))) * tiltMultiplier), 36f, 60f))

        AssertInBounds()
    }

    /**
     * # Returns this.
     */
    @Deprecated("Legacy - support for how the old camera did it, since other code still calls it.")
    fun getCam() : PerspectiveCamera = this


    /**
     * # Makes sure that the camera's viewport is within the bounds of the world
     * Moves the camera if it needs to in order to make sure viewport is not out of the world.
     *
     * Use to camera from showing areas out of the world.
     */
    // TODO
    private fun AssertInBounds() {
        val scaledViewportWidthHalfExtent: Float = viewportWidth * fieldOfView * 0.5f
        val scaledViewportHeightHalfExtent: Float = viewportHeight * fieldOfView * 0.5f
        val xmax: Float = (World.focusedWorld.width() * World.TILE_WIDTH).toFloat()
        val ymax: Float = World.focusedWorld.height() * World.TILE_HEIGHT * 0.5f

        // Horizontal

        // Horizontal
        if (desiredPosition.desired.x < scaledViewportWidthHalfExtent)
            desiredPosition.desired.x = scaledViewportWidthHalfExtent
        else if (desiredPosition.desired.x > xmax - scaledViewportWidthHalfExtent)
            desiredPosition.desired.x = xmax - scaledViewportWidthHalfExtent

        // Vertical

        // Vertical
        if (desiredPosition.desired.y < scaledViewportHeightHalfExtent)
            desiredPosition.desired.y = scaledViewportHeightHalfExtent
        else if (desiredPosition.desired.y > ymax - scaledViewportHeightHalfExtent)
            desiredPosition.desired.y = ymax - scaledViewportHeightHalfExtent

        desiredPosition.desired.x =
            if (desiredPosition.desired.x < scaledViewportWidthHalfExtent)
                scaledViewportWidthHalfExtent
            else
                Math.min(desiredPosition.desired.x, xmax)

        desiredPosition.desired.y =
            if (desiredPosition.desired.y < scaledViewportHeightHalfExtent)
                scaledViewportHeightHalfExtent
            else
                Math.min(desiredPosition.desired.y, ymax)
    }

    /**
     * # Calculates the point on the y axis to look at to achieve the desired degrees of tilt
     * We can't directly rotate the camera, we can only tell it to look at a point.
     *
     * So to make it rotate, we need to calculate the position to look at from the desired angle.
     *
     * Better explained my [stack overflow research question](https://stackoverflow.com/questions/67386475/how-can-i-calculate-the-point-a-camera-is-looking-at-using-its-rotation?noredirect=1#67386712)
     */
    private fun yFromAngle(angle: Float): Float = (Z / tan(angle * PI / 180) + desiredPosition.get().y.toDouble()).toFloat()


    /**
     * # Update and render routine
     */
    override fun update() {
        updateMove()
        updateTilt()
        updateRotation()
        updateZoom()

        if (Debug.enabled()){
            Debug.dump("Position    | $desiredPosition")
            Debug.dump("Zoom        | $desiredZoom")
            Debug.dump("Tilt        | $desiredTilt")
            Debug.dump("===========")
            Debug.dump("Camera")

        }

        super.update() // render camera
    }


    // ============================================================
    // endregion functions
    // region subroutines
    // ============================================================

    /**
     * # Moves the camera from it's current position to the [desiredPosition].
     */
    private fun updateMove(){
        // TODO these two lines shouldn't happen every frame, they're pretty heavy

        // (badly) Change viewport to match field of view
        GameScreen.r.setView(combined,position.x - viewportWidth * 0.5f,position.y,  viewportWidth + fieldOfView, viewportHeight * fieldOfView)

        // Move towards desired position
        position.set(desiredPosition.next());
    }

    /**
     * # Moves the current angle of tile towards the [desiredTilt].
     */
    private fun updateTilt() {if (enableZoomTilt) lookAt(position.x, yFromAngle(desiredTilt.next()), 0f)}

    /**
     * # Moves the current angle of rotation towards the [desiredRotation].
     */
    // TODO
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

    /**
     * # Moves the [fieldOfView] towards the [desiredZoom].
     */
    private fun updateZoom() {
        fieldOfView = desiredZoom.next()
    }

    // ============================================================
    // endregion subroutines
    // region companion
    // ============================================================

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