package com.shinkson47.SplashX6.game.cities

import com.badlogic.gdx.graphics.g2d.Sprite
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.math.Vector3
import com.shinkson47.SplashX6.game.GameHypervisor
import com.shinkson47.SplashX6.game.world.World
import com.shinkson47.SplashX6.utility.Assets.citySprites


/**
 * # Defines a settlement city.
 * @author [Jordan T. Gray](https://www.shinkson47.in) on 02/06/2021
 * @since PRE-ALPHA 0.0.2
 * @version 1.1
 */
class City(val isoVec: Vector3, val CITY_TYPE : CityTypes) : Runnable {

    // ============================================================
    // region fields
    // ============================================================

    /**
     * # Does this city have a wall built?
     */
    private var wall : Boolean = false
        set(value) {
            field = value
            checkSpriteUpdate()
        }

    /**
     * # The size of the city's population
     */
    private var population : Int = 0
        set(value) {
            field = value
            checkSpriteUpdate()
        }

    /**
     * The last known resource name of the underlying sprite
     *
     * Sets to [calcSpriteName] at init.
     */
    var cachedSpriteName : String = calcSpriteName()
        private set

    /**
     * The last known cartesian x of the underlying sprite
     */
    var cachedSpriteX : Float = 0f
        private set

    /**
     * The last known cartesian y of the underlying sprite
     */
    var cachedSpriteY : Float = 0f
        private set

    /**
     * # Underlying renderable for this city.
     * Changes as this city mutates.
     */
    private lateinit var sprite : Sprite


    // ============================================================
    // endregion fields
    // region construction
    // ============================================================

    init {
        firstSpriteInit()
        GameHypervisor.turn_hook(this)
    }

    /**
     * Lateinit routine for [sprite]. Configures the underlying sprite for the first time.
     */
    private fun firstSpriteInit() {
        calcSpritePos()
        setSprite()
    }
    // ============================================================
    // endregion construction
    // region functions
    // ============================================================

    /**
     * Calculates which sprite should be used to represent the state
     * of this city, and returns the `city.atlas` resource name of it
     *
     * Format :
     * > type_population(_wall)
     *
     * i.e `asian_0` or `asian_0_wall`
     */
    private fun calcSpriteName() : String {
        val pop =
            when {
                population < 4      -> 0
                population < 8      -> 4
                population < 12     -> 8
                population < 16     -> 12
                else                -> 16
            }

        return "${CITY_TYPE}_$pop${if (wall) "_wall" else ""}"
    }

    /**
     * Converts the [isoVec] to cartesian position for the sprite to use.
     *
     * result is cached in [cachedSpriteX] and [cachedSpriteY]
     */
    private fun calcSpritePos() {
        val tempPos: Vector3 = World.isoToCartesian(isoVec.x.toInt(), isoVec.y.toInt())
        cachedSpriteX = tempPos.x - World.TILE_HALF_WIDTH
        cachedSpriteY = tempPos.y - World.TILE_HALF_HEIGHT
    }

    /**
     * # Sets [sprite] to the matching [cachedSpriteName]
     * using the city sprite atlas to create a new sprite.
     *
     * New sprites are moved to [cachedSpriteY], [cachedSpriteX]
     */
    private fun setSprite() {
        sprite = citySprites.createSprite(cachedSpriteName)
        sprite.setPosition(cachedSpriteX, cachedSpriteY)
    }


    /**
     * # Checks if the sprite needs to be updated to match the state of this city
     * by [calcSpriteName], and comparing it to [cachedSpriteName].
     *
     * If they differ, modifies caches new name and changes the sprite using [setSprite]
     * thus it's only called if a new sprite is required.
     */
    private fun checkSpriteUpdate() {
        val temp = calcSpriteName()
        if (temp != cachedSpriteName) {
            cachedSpriteName = temp
            setSprite()
        }
    }

    /**
     * # Draws the underlying sprite of this city.
     */
    fun draw(batch: SpriteBatch) = sprite.draw(batch)

    /**
     * TODO temporary. Not efficient to hook every city this way.
     *
     * # Temporary turn hook that grows the city's population by 1 on every turn.
     */
    override fun run() {
        population++
        checkSpriteUpdate()
    }

    // ============================================================
    // endregion functions
    // ============================================================
}