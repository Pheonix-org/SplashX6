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
        with (unit_selected()){
            if (this != null) { // If there's a selected unit

                // Cache the selected tile.
                val sel = GameHypervisor.cm_selectedTile()

                // If we're selecting, calculate new destination.
                if (cm_isSelectingDestination)
                    setDestination(sel.x.toInt(), sel.y.toInt())



                // If there's a path, render it. Else see below 'return'
                pathNodes?.let {
                    if (it.isEmpty()) return@let
                    parent.sr.color = Color.PURPLE

                    // The grid cell we're currently operating on.
                    var it : GridCell = it[0]

                    // The position of the last node. Start with index 0.
                    var lastNode : Vector3 = WorldTerrain.isoToCartesian(it.x, it.y)

                    // Position of the current node.
                    var currentNode: Vector3

                    // Starting at the second node, draw lines between current and next node.
                    for (i in 1 until pathNodes!!.size step travelDistance) {

                        // Calculate node position
                        it = pathNodes!![i]
                        currentNode = WorldTerrain.isoToCartesian(it.x, it.y)

                        // Draw line
                        parent.sr.line(lastNode.x, lastNode.y, currentNode.x, currentNode.y)

                        // Set this node as the last one. Next.
                        lastNode = currentNode
                    }

                    parent.sr.color = Color.WHITE
                    return
                }


                // If there's no path, do nothing if we're not selecting.
                if (!cm_isSelectingDestination) return

                // If we're selecting and have no path then we're selecting a bad path.
                // Draw a red line to the intended destination.
                parent.sr.color = Color.RED
                    val mouse = WorldTerrain.isoToCartesian(sel.x.toInt(), sel.y.toInt())
                    parent.sr.line(Vector3(x, y, 0f), mouse)
                parent.sr.color = Color.WHITE
            }
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
        parent.r.setView(camera)
        parent.worldBatch.projectionMatrix = camera.combined // TODO i don't this this should be required every frame, but it is. Maybe something is modifying the worldbatch?
    }
}