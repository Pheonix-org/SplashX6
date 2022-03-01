/*░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░
 ░ FOSS 2022. The Splash Project.                                                                                                                                                 ░
 ░ https://www.shinkson47.in/SplashX6                                                                                                                                             ░
 ░ Jordan T. Gray.                                                                                                                                                                ░
 ░                                                                                                                                                                                ░
 ░                                                                                                                                                                                ░
 ░                                                                                                                                                                                ░
 ░           _____                    _____                    _____            _____                    _____                    _____                                           ░
 ░          /\    \                  /\    \                  /\    \          /\    \                  /\    \                  /\    \                         ______           ░
 ░         /::\    \                /::\    \                /::\____\        /::\    \                /::\    \                /::\____\                       |::|   |          ░
 ░        /::::\    \              /::::\    \              /:::/    /       /::::\    \              /::::\    \              /:::/    /                       |::|   |          ░
 ░       /::::::\    \            /::::::\    \            /:::/    /       /::::::\    \            /::::::\    \            /:::/    /                        |::|   |          ░
 ░      /:::/\:::\    \          /:::/\:::\    \          /:::/    /       /:::/\:::\    \          /:::/\:::\    \          /:::/    /                         |::|   |          ░
 ░     /:::/__\:::\    \        /:::/__\:::\    \        /:::/    /       /:::/__\:::\    \        /:::/__\:::\    \        /:::/____/                          |::|   |          ░
 ░     \:::\   \:::\    \      /::::\   \:::\    \      /:::/    /       /::::\   \:::\    \       \:::\   \:::\    \      /::::\    \                          |::|   |          ░
 ░   ___\:::\   \:::\    \    /::::::\   \:::\    \    /:::/    /       /::::::\   \:::\    \    ___\:::\   \:::\    \    /::::::\    \   _____                 |::|   |          ░
 ░  /\   \:::\   \:::\    \  /:::/\:::\   \:::\____\  /:::/    /       /:::/\:::\   \:::\    \  /\   \:::\   \:::\    \  /:::/\:::\    \ /\    \          ______|::|___|___ ____  ░
 ░ /::\   \:::\   \:::\____\/:::/  \:::\   \:::|    |/:::/____/       /:::/  \:::\   \:::\____\/::\   \:::\   \:::\____\/:::/  \:::\    /::\____\        |:::::::::::::::::|    | ░
 ░ \:::\   \:::\   \::/    /\::/    \:::\  /:::|____|\:::\    \       \::/    \:::\  /:::/    /\:::\   \:::\   \::/    /\::/    \:::\  /:::/    /        |:::::::::::::::::|____| ░
 ░  \:::\   \:::\   \/____/  \/_____/\:::\/:::/    /  \:::\    \       \/____/ \:::\/:::/    /  \:::\   \:::\   \/____/  \/____/ \:::\/:::/    /          ~~~~~~|::|~~~|~~~       ░
 ░   \:::\   \:::\    \               \::::::/    /    \:::\    \               \::::::/    /    \:::\   \:::\    \               \::::::/    /                 |::|   |          ░
 ░    \:::\   \:::\____\               \::::/    /      \:::\    \               \::::/    /      \:::\   \:::\____\               \::::/    /                  |::|   |          ░
 ░     \:::\  /:::/    /                \::/____/        \:::\    \              /:::/    /        \:::\  /:::/    /               /:::/    /                   |::|   |          ░
 ░      \:::\/:::/    /                  ~~               \:::\    \            /:::/    /          \:::\/:::/    /               /:::/    /                    |::|   |          ░
 ░       \::::::/    /                                     \:::\    \          /:::/    /            \::::::/    /               /:::/    /                     |::|   |          ░
 ░        \::::/    /                                       \:::\____\        /:::/    /              \::::/    /               /:::/    /                      |::|   |          ░
 ░         \::/    /                                         \::/    /        \::/    /                \::/    /                \::/    /                       |::|___|          ░
 ░          \/____/                                           \/____/          \/____/                  \/____/                  \/____/                         ~~               ░
 ░                                                                                                                                                                                ░
 ░                                                                                                                                                                                ░
 ░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░*/

package com.shinkson47.SplashX6.game.cities

import com.badlogic.gdx.graphics.g2d.Sprite
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.graphics.g2d.TextureAtlas
import com.badlogic.gdx.math.Vector2
import com.badlogic.gdx.math.Vector3
import com.shinkson47.SplashX6.game.GameHypervisor
import com.shinkson47.SplashX6.game.production.CityProductionManager
import com.shinkson47.SplashX6.game.world.WorldTerrain
import com.shinkson47.SplashX6.utility.Assets
import com.shinkson47.SplashX6.utility.PartiallySerializable
import com.shinkson47.SplashX6.utility.TurnHook

/**
 * # A settlement in a nation.
 * @author [Jordan T. Gray](https://www.shinkson47.in) on 02/06/2021
 * @since PRE-ALPHA 0.0.2
 * @version 1.2.1
 */
class Settlement(
        /**
         * ## The isometric position of the city.
         * Is used to position the sprite.
         */
        val isoVec: Vector3,

        /**
         * ## The type of sprite used to represent the city.
         */
        var CITY_TYPE : CityType

    ) : TurnHook, PartiallySerializable {

    // ============================================================
    // region fields
    // ============================================================

    /**
     * ## User facing name of this city.
     * Determined data of the nation this city belongs to.
     */
    lateinit var name: String

    /**
     * ## Does this city have a wall built?
     * If true, '_wall' is appended to the sprite name,
     * which *should* match a sprite with a wall built
     * around it.
     *
     * Automatically updates sprite when updated.
     */
    private var wall : Boolean = false
        set(value) {
            field = value
            checkSpriteUpdate()
        }

    /**
     * ## The size of the city's population
     *
     * Automatically updates sprite when updated.
     */
    var size : Int = 0
        private set(value) {
            field = value
            checkSpriteUpdate()
        }

    var trade = 2
    var food = 5
    var science = 1
    var luxury = 0
    var corrouption = 0
    var waste       = 0
    var culture     = 0
    var pollution   = 0
    var plaugeRisk  = 0


    /**
     * ## The last known resource name of the underlying sprite
     *
     * format is :
     * > citytype_size(_wall?)
     *
     * ### i.e
     * > european_0
     *
     * or
     *
     * > european_0_wall
     *
     * Sets to [calcSpriteName] at init.
     */
    var cachedSpriteName : String = calcSpriteName()
        private set

    /**
     * # Underlying renderable sprite that represents this city.
     * > ***DO NOT MODIFY***
     * Autonomously updated as this city mutates.
     *
     * This class does not extend a sprite, because they're not mutable.
     *
     * @see checkSpriteUpdate
     */
    @Transient private lateinit var sprite : Sprite

    /**
     * ## Returns the cartesian coordinates of the sprite.
     * > N.B: This does not match the world space co-ordinates.
     *
     * @return [Vector3] containing the cartesian coordinates of the sprite.
     * @see isoVec
     */
    fun cartesianPosition() : Vector3 = Vector3(sprite.x, sprite.y, 0f)

    /**
     * ## The production manager of the city.
     */
    val production = CityProductionManager(this)

    // ============================================================
    // endregion fields
    // region functions
    // ============================================================


    /**
     * # Converts the [isoVec] to cartesian position for the sprite to use.
     */
    private fun calcSpritePos() : Vector2 {
        val tempPos: Vector3 = WorldTerrain.isoToCartesian(isoVec.x.toInt(), isoVec.y.toInt())
        return Vector2(tempPos.x - WorldTerrain.TILE_HALF_WIDTH, tempPos.y - WorldTerrain.TILE_HALF_HEIGHT)
    }

    /**
     * ## Updates the [sprite] to match [cachedSpriteName]
     * using the [citySprites] atlas to create a new sprite.
     */
    private fun updateSprite() {
        sprite = Assets.get<TextureAtlas>(Assets.SPRITES_CITIES).createSprite(cachedSpriteName).apply {
            calcSpritePos().let { setPosition(it.x, it.y) }
        }
    }

    /**
     * # alias for companion calcSpriteName
     */
    private fun calcSpriteName() = calcSpriteName(this)


    /**
     * # Checks if the sprite needs to be updated to match the state of this city
     * by [calcSpriteName], and comparing it to [cachedSpriteName].
     *
     * If they differ, modifies caches new name and changes the sprite using [updateSprite]
     * thus it's only called if a new sprite is required.
     */
    private fun checkSpriteUpdate() {
        val tempName = calcSpriteName()
        if (tempName != cachedSpriteName) {
            cachedSpriteName = tempName
            updateSprite()
        }
    }

    /**
     * # Draws the [sprite] which represents this city
     */
    fun draw(batch: SpriteBatch) = sprite.draw(batch)

    /**
     * # Temporary turn hook that grows the city's population by 1 on every turn.
     */
    override fun onTurn() {
        size++
        checkSpriteUpdate()
    }

    // ============================================================
    // endregion functions
    // region meta
    // ============================================================

    init {
        updateSprite()
        GameHypervisor.turn_hook(this)
    }

    override fun deserialize() {
        updateSprite()
    }

    override fun toString(): String = name

    // ============================================================
    // endregion meta
    // ============================================================




    companion object {
        /**
         * Determines the resource name to use to find the correct sprite
         * to represent the given city.
         *
         * The resource name is intended for use in 'city.atlas'
         *
         * Format :
         * > type_population(_wall?)
         *
         * i.e `asian_0` or `asian_0_wall`
         */
        private fun calcSpriteName(city: Settlement): String {
            with(city) {
                val pop =
                    when {
                        size < 10      -> 0
                        size < 25      -> 4
                        size < 40      -> 8
                        size < 50      -> 12
                        else                 -> 16
                    }

                return "${CITY_TYPE}_$pop${if (wall) "_wall" else ""}"
            }
        }
    }
}


/**
 * # Classifications of cities
 * Represents all the types of cities available within the cities sprite atlas.
 * @author [Jordan T. Gray](https://www.shinkson47.in) on 02/06/2021
 * @since PRE-ALPHA 0.0.2
 * @version 1
 */
enum class CityType {
    asian,
    babylonain,
    celtic,
    classical,
    electricage,
    european,
    industrial,
    modern,
    postmodern,
    tropical
}