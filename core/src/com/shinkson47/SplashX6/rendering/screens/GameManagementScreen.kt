package com.shinkson47.SplashX6.rendering.screens

import com.badlogic.gdx.ScreenAdapter
import com.badlogic.gdx.graphics.OrthographicCamera
import com.badlogic.gdx.graphics.glutils.ShapeRenderer
import com.badlogic.gdx.math.Vector3
import com.shinkson47.SplashX6.game.GameHypervisor
import com.shinkson47.SplashX6.game.GameHypervisor.Companion.camera_focusOn
import com.shinkson47.SplashX6.game.GameHypervisor.Companion.unit_selected
import com.shinkson47.SplashX6.game.world.World
import com.shinkson47.SplashX6.rendering.Camera
import com.shinkson47.SplashX6.utility.lerpDesire

/**
 * # Child to [GameScreen] which is used to show an orthograpghic overview of the game.
 * @author [Jordan T. Gray](https://www.shinkson47.in) on 23/06/2021
 * @since PRE-ALPHA 0.0.2
 */
internal class GameManagementScreen(val parent : GameScreen) : ScreenAdapter() {

    /**
     * Orthograpgic camera used to view the world top-down.
     */
    val camera = OrthographicCamera()

    val desiredCameraPosition : lerpDesire<Vector3> = lerpDesire(camera.position, parent.cam.moveSpeed)

    /**
     * Prepares the screen for viewing.
     *
     * Configures projection matrixes, moves [camera] to match the gameScreen's, etc.
     */
    override fun show() {
        // Set orthographic view with current viewport state.
        camera.setToOrtho(false,parent.cam.viewportWidth,parent.cam.viewportHeight)

        // In case we swap screens mid-frame. Sometimes the semaphore was left open.
        parent.sr.end()

        // Move the camera to the selected unit.
        unit_selected()?.let { camera_focusOn(it) }
        updateView()
    }

    override fun render(delta: Float) {
        parent.getR().render()      // Render the world.
        parent.renderSprites()      // Render sprites.

        camera.position.set(desiredCameraPosition.next())
        updateView()

        camera.update()             // Draw camera's view to gl.

        with (parent) {
            sr.projectionMatrix = camera.combined
            hudStage.act(delta)     // Update and render UI.
            hudStage.draw()


            sr.begin(ShapeRenderer.ShapeType.Line)
                // Shape renderer functions.
                renderMouseCircle()
                renderDestinationLine()

            sr.end()
        }
    }

    /**
     * # Renders a line between the selected unit and it's destination.
     *
     * Has no effect if no unit is selected.
     */
    fun renderDestinationLine() {
        with (GameHypervisor.unit_selected()){
            if (this != null) {

                if (GameHypervisor.cm_isSelectingDestination) {
                    val sel = GameHypervisor.cm_selectedTile()
                    val mouse = World.isoToCartesian(sel.x.toInt(), sel.y.toInt())
                    parent.sr.line(Vector3(x, y, 0f), mouse)
                } else {
                    parent.sr.line(Vector3(x, y, 0f), World.isoToCartesian(destX, destY))
                }
            }
        }
    }

    /**
     * # Renders a circle on the tile the cursor is pointing to.
     */
    private fun renderMouseCircle() {
        val iso = GameHypervisor.cm_selectedTile()
        val isocart = World.isoToCartesian(iso.x.toInt(), iso.y.toInt())
        parent.sr.circle(isocart.x, isocart.y, 20f)
    }

    fun up()    { desiredCameraPosition.desired.y += Camera.TRUE_SPEED; }
    fun down()  { desiredCameraPosition.desired.y -= Camera.TRUE_SPEED; }
    fun left()  { desiredCameraPosition.desired.x -= Camera.TRUE_SPEED; }
    fun right() { desiredCameraPosition.desired.x += Camera.TRUE_SPEED; }


    private fun updateView() {
        parent.r.setView(camera)
        parent.worldBatch.projectionMatrix = camera.combined // TODO i don't this should be required every frame, but it is. Maybe something is modifying the worldbatch?
    }
}