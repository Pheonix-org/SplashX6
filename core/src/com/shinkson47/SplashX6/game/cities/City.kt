package com.shinkson47.SplashX6.game.cities

import com.badlogic.gdx.graphics.g2d.Sprite
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.math.Vector2
import com.badlogic.gdx.math.Vector3
import com.shinkson47.SplashX6.game.GameHypervisor
import com.shinkson47.SplashX6.game.world.WorldTerrain
import com.shinkson47.SplashX6.utility.Assets.citySprites
import com.shinkson47.SplashX6.utility.PartiallySerializable
import com.shinkson47.SplashX6.utility.TurnHook
import java.io.Serializable

/**
 * # A settlement city.
 * @author [Jordan T. Gray](https://www.shinkson47.in) on 02/06/2021
 * @since PRE-ALPHA 0.0.2
 * @version 1.2
 */
class City(val isoVec: Vector3, val CITY_TYPE : CityType) : TurnHook, PartiallySerializable {

    // ============================================================
    // region fields
    // ============================================================

    lateinit var name: String

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
    var population : Int = 0
        private set(value) {
            field = value
            checkSpriteUpdate()
        }

    /**
     * # The last known resource name of the underlying sprite
     *
     * Sets to [calcSpriteName] at init.
     */
    var cachedSpriteName : String = calcSpriteName()
        private set

    /**
     * # Underlying renderable for this city.
     * Changes as this city mutates.
     *
     * Class does not extend Sprite 'cause it's
     * massively easier to create new sprites instead of mutate them.
     */
    @Transient private lateinit var sprite : Sprite
    private fun spriteLateInit() { setSprite() }

    fun getPosition() : Vector3 = Vector3(sprite.x, sprite.y, 0f)

    val production = Production(this)



    // ============================================================
    // endregion fields
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
                population < 10      -> 0
                population < 25      -> 4
                population < 40      -> 8
                population < 50      -> 12
                else                 -> 16
            }

        return "${CITY_TYPE}_$pop${if (wall) "_wall" else ""}"
    }

    /**
     * # Converts the [isoVec] to cartesian position for the sprite to use.
     */
    private fun calcSpritePos() : Vector2 {
        val tempPos: Vector3 = WorldTerrain.isoToCartesian(isoVec.x.toInt(), isoVec.y.toInt())
        return Vector2(tempPos.x - WorldTerrain.TILE_HALF_WIDTH, tempPos.y - WorldTerrain.TILE_HALF_HEIGHT)
    }

    /**
     * # Sets [sprite] to the matching [cachedSpriteName]
     * using the city sprite atlas to create a new sprite.
     *
     * New sprites are moved to [cachedSpriteY], [cachedSpriteX]
     */
    fun setSprite() {
        val tempSprite = citySprites.createSprite(cachedSpriteName)
        val tempPos = calcSpritePos()
        tempSprite.setPosition(tempPos.x, tempPos.y)
        sprite = tempSprite
    }


    /**
     * # Checks if the sprite needs to be updated to match the state of this city
     * by [calcSpriteName], and comparing it to [cachedSpriteName].
     *
     * If they differ, modifies caches new name and changes the sprite using [setSprite]
     * thus it's only called if a new sprite is required.
     */
    private fun checkSpriteUpdate() {
        val tempName = calcSpriteName()
        if (tempName != cachedSpriteName) {
            cachedSpriteName = tempName
            setSprite()
        }
    }

    /**
     * # Draws the underlying sprite of this city.
     */
    fun draw(batch: SpriteBatch) = sprite.draw(batch)

    /**
     * # Temporary turn hook that grows the city's population by 1 on every turn.
     */
    override fun onTurn() {
        population++
        checkSpriteUpdate()
        production.doOnTurn()
    }

    init {
        spriteLateInit()
        GameHypervisor.turn_hook(this)
    }

    final override fun deserialize() {
        setSprite()
    }

    override fun toString(): String = name

    // ============================================================
    // endregion functions
    // ============================================================
}