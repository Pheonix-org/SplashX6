package com.shinkson47.SplashX6.game.units

import com.badlogic.gdx.graphics.g2d.Sprite
import com.badlogic.gdx.math.Vector3
import com.shinkson47.SplashX6.game.world.World
import com.shinkson47.SplashX6.game.world.World.*
import com.shinkson47.SplashX6.utility.Assets.unitSprites

/**
 * # A user playable unit.
 * @author [Jordan T. Gray](https://www.shinkson47.in) on 19/05/2021
 * @since v1
 * @version 1
 */
class Unit(spriteName: String, pos: Vector3) : Sprite(unitSprites.createSprite(spriteName)) {
    constructor(spriteName: String, _x: Int, _y: Int) : this(spriteName, Vector3(_x.toFloat(), _y.toFloat(), 0f))


    var spriteName: String = spriteName;

    /**
     * # The location of the unit
     */
    var isoVec : Vector3 = pos

    /**
     * # The unit's destination
     * Marks where the unit is travelling to.
     */
    var destX : Int = 0
    var destY : Int = 0





    @Deprecated("see [setPosition]")
    override fun setX(x: Float) {
        super.setX(x)
    }
    @Deprecated("see [setPosition]")
    override fun setY(y: Float) {
        super.setY(y)
    }

    init {
        setLocation(pos)
    }

    /**
     * # Sets the location of this sprite in iso space.
     * where [x] and [y] are iso co-ordinates, and are stored in [isoX], [isoY].
     *
     * super.[x] and super.[y] store cartesian equivelants, which are calculated in [World.isoToCartesian]
     *
     * For a delta translation, see [deltaPosition]
     */
    fun setLocation(_pos : Vector3): Vector3 = setLocation(_pos.x, _pos.y)
    fun setLocation(x: Float, y: Float) : Vector3 {
        isoVec.set(x,y,0f)

        val pos: Vector3 = World.isoToCartesian(x.toInt(), y.toInt());

        // TODO don't have to do this calculation every time
        // META : Compensate for the origin, so that the sprite is in the center of the cell.
        // Changing the sprite origin had no effect
        setX(pos.x - TILE_HALF_WIDTH)
        setY(pos.y - TILE_HALF_HEIGHT)
        return pos
    }

    /**
     * # Moves this sprite by a x, and y, iso tiles.
     */
    fun deltaPosition(deltaX: Int, deltaY: Int): Vector3 {
        isoVec.x += deltaX
        isoVec.x += deltaY
        return setLocation(isoVec)
    }

    override fun toString(): String {
        return "$spriteName (X${isoVec.x}, Y${isoVec.y})"
    }


}