package com.shinkson47.SplashX6.game.units

import com.badlogic.gdx.graphics.g2d.Sprite
import com.badlogic.gdx.math.MathUtils
import com.badlogic.gdx.math.Vector3
import com.shinkson47.SplashX6.game.GameData
import com.shinkson47.SplashX6.game.world.WorldTerrain
import com.shinkson47.SplashX6.game.world.WorldTerrain.*
import com.shinkson47.SplashX6.game.world.WorldTerrain.Companion.TILE_HALF_HEIGHT
import com.shinkson47.SplashX6.game.world.WorldTerrain.Companion.TILE_HALF_WIDTH
import com.shinkson47.SplashX6.game.world.WorldTerrain.Companion.isoToCartesian
import com.shinkson47.SplashX6.utility.Assets.unitSprites
import org.xguzm.pathfinding.grid.GridCell
import java.io.Serializable

/**
 * # A controllable in-game character
 * That may be owned and controlled by a human or AI player.
 * @author [Jordan T. Gray](https://www.shinkson47.in) on 19/05/2021
 * @since PRE-ALPHA 0.0.1
 * @version 1
 */
class Unit(val unitClass: UnitClass, var isoVec: Vector3) : Sprite(unitSprites.createSprite(unitClass.toString())), Serializable {
    constructor(unitClass: UnitClass, _x: Int, _y: Int) : this(unitClass, Vector3(_x.toFloat(), _y.toFloat(), 0f))

    // =============================================
    // region fields
    // =============================================

    /**
     * # A user friendly name of this unit.
     * For now, is just the [unitClass]
     */
    val displayName = unitClass.toString()

    /**
     * # The unit's destination
     * Marks where the unit is travelling to.
     */
    var destX = 0
        private set
    var destY = 0
        private set

    // TODO these need to be dictionary based values, depending on the unit's class.
    var viewDistance = 10;
    var travelDistance = 3;

    /**
     * # The actions that this unit can perform.
     * Fetched from [UnitActionDictionary], which defines what each class is able to do.
     */
    val actions: Array<UnitAction> = UnitActionDictionary[unitClass]

    /**
     * # [UnitAction] that this unit will perform on the next turn.
     */
    var onTurnAction: UnitAction? = null

    /**
     * A list of cells in the world.
     *
     * Defines the path this unit is trying to take.
     */
    var pathNodes : List<GridCell>? = null

    // =============================================
    // endregion fields
    // region construction
    // =============================================

    init { setLocation(isoVec) }

    // =============================================
    // endregion construction
    // region get / set deprication
    // =============================================

    /**
     * Sets the location of the sprite. This should not be done.
     *
     * Set the location of the unit instead.
     */
    @Deprecated("see [setLocation]")
    override fun setX(x: Float) = super.setX(x)

    /**
     * Sets the location of the sprite. This should not be done.
     *
     * Set the location of the unit instead.
     */
    @Deprecated("see [setLocation]")
    override fun setY(y: Float) = super.setY(y)

    /**
     * Sets the location of the sprite. This should not be done.
     *
     * Set the location of the unit instead.
     */
    @Deprecated("see [setLocation]")
    override fun setPosition(x: Float, y: Float) = super.setPosition(x, y)

    // =============================================
    // endregion get / set deprication
    // region functions
    // =============================================

    /**
     * # Sets the location of this sprite in iso space.
     * where [x] and [y] are iso co-ordinates, and are stored in [isoX], [isoY].
     *
     * super.[x] and super.[y] store cartesian equivelants, which are calculated in [WorldTerrain.isoToCartesian]
     *
     * For a delta translation, see [deltaPosition]
     */
    fun setLocation(_pos : Vector3): Vector3 = setLocation(_pos.x, _pos.y)

    @Deprecated("This call shouldn't use floats. See sister method.")
    fun setLocation(x: Float, y: Float) : Vector3 = setLocation(x.toInt(), y.toInt())

    /**
     * # Moves this unit to the specified tile.
     * Also updates the position of the underlying sprite to match the new location
     * and removes any fog-of-war surrounding the unit.
     */
    fun setLocation(x: Int, y: Int) : Vector3 {
        val x = MathUtils.clamp(x, 0, GameData.world!!.width - 1)
        val y = MathUtils.clamp(y, 0, GameData.world!!.height - 1)


        isoVec.set(x.toFloat(),y.toFloat(),0f)

        val pos: Vector3 = isoToCartesian(x, y)

        // Compensate for the origin, so that the sprite is in the center of the cell.
        // Changing the sprite and atlas origins had no effect
        setX(pos.x - TILE_HALF_WIDTH)
        setY(pos.y - TILE_HALF_HEIGHT)

        GameData.world!!.defog(isoVec.x.toInt(), isoVec.y.toInt(), viewDistance)

        return pos
    }

    fun setDestination(x: Int, y: Int) {
        val x = MathUtils.clamp(x, 0, GameData.world!!.width - 1)
        val y = MathUtils.clamp(y, 0, GameData.world!!.height - 1)

        if (x == destX && y == destY) return // don't pathfind if destination is same.

        destX = x; destY = y;
        calculatePath()
    }

    private fun calculatePath() {
        with(GameData.world!!) {
            pathNodes = pathfinder.findPath(isoVec.x.toInt(), isoVec.y.toInt(), destX, destY, navigationLayer)
        }
    }


    /**
     * # Moves this sprite by a x and y tiles.
     */
    fun deltaPosition(deltaX: Int, deltaY: Int): Vector3 {
        isoVec.x += deltaX
        isoVec.x += deltaY
        return setLocation(isoVec)
    }

    override fun toString(): String {
        return "$displayName (X${isoVec.x}, Y${isoVec.y})"
    }

    // =============================================
    // endregion functions
    // region Game API
    // =============================================

    /**
     * # Performs this unit's [onTurnAction], if there is one.
     */
    fun doTurn(){ onTurnAction?.run(this) }

    /**
     * # Removes [onTurnAction]
     * prevnting this unit from performing any action
     * on each turn.
     */
    fun cancelAction() { onTurnAction = null }

    // =============================================
    // endregion Game API
    // =============================================
}