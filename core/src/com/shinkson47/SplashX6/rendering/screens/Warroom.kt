package com.shinkson47.SplashX6.rendering.screens

import com.badlogic.gdx.ScreenAdapter
import com.badlogic.gdx.graphics.Color
import com.badlogic.gdx.graphics.OrthographicCamera
import com.badlogic.gdx.graphics.glutils.ShapeRenderer
import com.badlogic.gdx.math.Vector3
import com.shinkson47.SplashX6.game.GameHypervisor
import com.shinkson47.SplashX6.game.GameHypervisor.Companion.camera_focusOn
import com.shinkson47.SplashX6.game.GameHypervisor.Companion.cm_isSelectingDestination
import com.shinkson47.SplashX6.game.GameHypervisor.Companion.unit_selected
import com.shinkson47.SplashX6.game.world.WorldTerrain
import com.shinkson47.SplashX6.rendering.Camera
import com.shinkson47.SplashX6.rendering.screens.game.GameScreen
import com.shinkson47.SplashX6.utility.lerpDesire
import org.xguzm.pathfinding.grid.GridCell

/**
 * # Child to [GameScreen] which is used to show an orthograpghic overview of the game.
 * @author [Jordan T. Gray](https://www.shinkson47.in) on 23/06/2021
 * @since PRE-ALPHA 0.0.2
 */
class Warroom(val parent : GameScreen) : ScreenAdapter() {

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
        parent.getR()!!.render()      // Render the world.
        parent.renderSprites()      // Render sprites.

        camera.position.set(desiredCameraPosition.next())
        updateView()

        camera.update()             // Draw camera's view to gl.

        with (parent) {
            sr.projectionMatrix = camera.combined
            stage.act(delta)     // Update and render UI.
            stage.draw()


            sr.begin(ShapeRenderer.ShapeType.Line)
                // Shape renderer functions.
                renderMouseCircle()
                parent.renderDestinationLine()

            sr.end()
        }
    }


    /**
     * # Renders a circle on the tile the cursor is pointing to.
     */
    private fun renderMouseCircle() {
        val iso = GameHypervisor.cm_selectedTile()
        val isocart = WorldTerrain.isoToCartesian(iso.x.toInt(), iso.y.toInt())
        parent.sr.circle(isocart.x, isocart.y, 10f)
    }

    fun up()    { desiredCameraPosition.desired.y += Camera.TRUE_SPEED; }
    fun down()  { desiredCameraPosition.desired.y -= Camera.TRUE_SPEED; }
    fun left()  { desiredCameraPosition.desired.x -= Camera.TRUE_SPEED; }
    fun right() { desiredCameraPosition.desired.x += Camera.TRUE_SPEED; }


    private fun updateView() {
        parent.r!!.setView(camera)
        parent.worldBatch.projectionMatrix = camera.combined // TODO i don't this this should be required every frame, but it is. Maybe something is modifying the worldbatch?
    }
}