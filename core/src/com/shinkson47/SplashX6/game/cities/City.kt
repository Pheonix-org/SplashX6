package com.shinkson47.SplashX6.game.cities

import com.badlogic.gdx.graphics.g2d.Sprite
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.math.Vector3
import com.shinkson47.SplashX6.game.world.World
import com.shinkson47.SplashX6.utility.Assets.citySprites

/**
 * # TODO
 * @author [Jordan T. Gray](https://www.shinkson47.in) on 02/06/2021
 * @since v1
 * @version 1
 */
class City(pos: Vector3, type : CityTypes) {


    // ============================================================
    // region fields
    // ============================================================

    // TODO this is repeated in [Unit], but idk how to abstract it cause they're so different.

    /**
     * # Does this city have a wall built?
     */
    private var wall : Boolean = true

    /**
     * # The size of the sity in population
     */
    private var population : Int = 0

    /**
     * # The [CityTypes] of this city
     */
    val type = type;


    /**
     * # Underlying renderable for this city.
     * Changes as this city mutates.
     */
    private var sprite : Sprite = citySprites.createSprite(calcSpriteName())

    /**
     * # The tile this city is situated on.
     */
    val isoVec : Vector3 = pos
    init {
        // TODO repeated in unit.
        // TODO also, needs to be repeatable for when the sprite is updated.
        val pos: Vector3 = World.isoToCartesian(isoVec.x.toInt(), isoVec.y.toInt())
        sprite.setPosition(pos.x - World.TILE_HALF_WIDTH, pos.y - World.TILE_HALF_HEIGHT)
    }

    // ============================================================
    // endregion fields
    // region functions  
    // ============================================================

    private fun calcSpriteName() : String {
        val pop =
            if      (population < 4)    0
            else if (population < 8)    4
            else if (population < 12)   8
            else if (population < 16)   12
            else                        16

        return "${type}_$pop${if (wall) "_wall" else ""}"
    }

    fun draw(batch: SpriteBatch) {
        sprite.draw(batch)
    }


    // ============================================================
    // endregion functions
    // ============================================================
}