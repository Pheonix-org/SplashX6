package com.shinkson47.SplashX6.game.units

import com.badlogic.gdx.graphics.g2d.Sprite
import com.badlogic.gdx.math.Vector3
import com.shinkson47.SplashX6.game.world.World
import com.shinkson47.SplashX6.game.world.World.*
import com.shinkson47.SplashX6.utility.Assets.unitSprites

/**
 * # A controllable in-game character
 * That may be owned and controlled by a human or AI player.
 * @author [Jordan T. Gray](https://www.shinkson47.in) on 19/05/2021
 * @since PRE-ALPHA 0.0.1
 * @version 1
 */
class Unit(val unitClass: UnitClass, var isoVec: Vector3) : Sprite(unitSprites.createSprite(unitClass.toString())) {
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
    var destY = 0

    /**
     * # The actions that this unit can perform.
     * Fetched from [UnitActionDictionary], which defines what each class is able to do.
     */
    val actions: Array<UnitAction> = UnitActionDictionary[unitClass]

    /**
     * # [UnitAction] that this unit will perform on the next turn.
     */
    var onTurnAction: UnitAction? = null

    // =============================================
    // endregion fields
    // region construction
    // =============================================

    init {
        setLocation(isoVec)
    }

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
     * super.[x] and super.[y] store cartesian equivelants, which are calculated in [World.isoToCartesian]
     *
     * For a delta translation, see [deltaPosition]
     */
    fun setLocation(_pos : Vector3): Vector3 = setLocation(_pos.x, _pos.y)

    @Deprecated("This call shouldn't use floats. See sister method.")
    fun setLocation(x: Float, y: Float) : Vector3 = setLocation(x.toInt(), y.toInt())

    /**
     * # Moves this unit to the specified tile.
     * Also updates the position of the underlying sprite to match the new location.
     */
    fun setLocation(x: Int, y: Int) : Vector3 {
        isoVec.set(x.toFloat(),y.toFloat(),0f)

        val pos: Vector3 = isoToCartesian(x, y)

        // Compensate for the origin, so that the sprite is in the center of the cell.
        // Changing the sprite and atlas origins had no effect
        setX(pos.x - TILE_HALF_WIDTH)
        setY(pos.y - TILE_HALF_HEIGHT)
        return pos
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
    fun doTurn(){
        onTurnAction?.run(this)
    }

    /**
     * # Removes [onTurnAction]
     * prevnting this unit from performing any action
     * on each turn.
     */
    fun cancelAction() {
        onTurnAction = null
    }

    // =============================================
    // endregion Game API
    // =============================================
}