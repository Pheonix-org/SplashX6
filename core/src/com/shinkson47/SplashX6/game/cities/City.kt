package com.shinkson47.SplashX6.game.cities

import com.badlogic.gdx.graphics.g2d.Sprite
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.math.Vector3
import com.shinkson47.SplashX6.game.GameHypervisor
import com.shinkson47.SplashX6.game.world.World
import com.shinkson47.SplashX6.utility.Assets.citySprites


/**
 * # TODO
 * @author [Jordan T. Gray](https://www.shinkson47.in) on 02/06/2021
 * @since v1
 * @version 1
 */
class City(pos: Vector3, type : CityTypes) : Runnable {


    // ============================================================
    // region fields
    // ============================================================

    // TODO this is repeated in [Unit], but idk how to abstract it cause they're so different.

    /**
     * # Does this city have a wall built?
     */
    private var wall : Boolean = false

    /**
     * # The size of the sity in population
     */
    private var population : Int = 0

    /**
     * # The [CityTypes] of this city
     */
    val type = type

    var cachedSpriteName : String = calcSpriteName()
        private set

    var cachedSpriteX : Float = 0f
        private set

    var cachedSpriteY : Float = 0f
        private set

    /**
     * # Underlying renderable for this city.
     * Changes as this city mutates.
     */
    private lateinit var sprite : Sprite

    /**
     * # The tile this city is situated on.
     */
    val isoVec : Vector3 = pos


    init {
        firstSpriteInit()
        GameHypervisor.turn_hook(this)
    }

    private fun firstSpriteInit() {
        calcSpritePos()
        setSprite()
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

    private fun calcSpritePos() {
        val tempPos: Vector3 = World.isoToCartesian(isoVec.x.toInt(), isoVec.y.toInt())
        cachedSpriteX = tempPos.x - World.TILE_HALF_WIDTH
        cachedSpriteY = tempPos.y - World.TILE_HALF_HEIGHT
    }

    /**
     * # Sets [sprite] to the matching [cachedSpriteName]
     */
    private fun setSprite() {
        sprite = citySprites.createSprite(cachedSpriteName)
        sprite.setPosition(cachedSpriteX, cachedSpriteY)
    }


    /**
     * # Checks if the sprite needs to be updated to match the state of this city
     * modifies usint [setSprite] only if change is required.
     */
    private fun checkSpriteUpdate() {
        val temp = calcSpriteName()
        if (temp != cachedSpriteName) {
            cachedSpriteName = temp
            setSprite()
        }
    }


    fun draw(batch: SpriteBatch) {
        sprite.draw(batch)
    }

    override fun run() {
        population++
        checkSpriteUpdate()
    }

    // ============================================================
    // endregion functions
    // ============================================================
}