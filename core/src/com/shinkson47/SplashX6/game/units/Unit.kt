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

package com.shinkson47.SplashX6.game.units

import box2dLight.PointLight
import com.badlogic.gdx.graphics.g2d.Batch
import com.badlogic.gdx.graphics.g2d.Sprite
import com.badlogic.gdx.graphics.g2d.TextureAtlas
import com.badlogic.gdx.math.MathUtils
import com.badlogic.gdx.math.Vector2
import com.badlogic.gdx.math.Vector3
import com.shinkson47.SplashX6.ai.StateMachine
import com.shinkson47.SplashX6.audio.AudioController
import com.shinkson47.SplashX6.game.GameData
import com.shinkson47.SplashX6.game.Hypervisor
import com.shinkson47.SplashX6.game.world.WorldTerrain
import com.shinkson47.SplashX6.game.world.WorldTerrain.*
import com.shinkson47.SplashX6.game.world.WorldTerrain.Companion.TILE_HALF_HEIGHT
import com.shinkson47.SplashX6.game.world.WorldTerrain.Companion.TILE_HALF_WIDTH
import com.shinkson47.SplashX6.game.world.WorldTerrain.Companion.TILE_HEIGHT
import com.shinkson47.SplashX6.game.world.WorldTerrain.Companion.isoToCartesian
import com.shinkson47.SplashX6.utility.Assets
import com.shinkson47.SplashX6.utility.Assets.REF_SPRITES_UNITS
import com.shinkson47.SplashX6.utility.Assets.SPRITES_UNITEXTRAS
import com.shinkson47.SplashX6.utility.DataTable
import com.shinkson47.SplashX6.utility.PartiallySerializable
import com.shinkson47.SplashX6.utility.Utility
import com.shinkson47.SplashX6.utility.Utility.asPercentOf
import com.shinkson47.SplashX6.utility.Utility.center
import com.shinkson47.SplashX6.utility.Utility.warnDev
import org.xguzm.pathfinding.grid.GridCell
import org.xguzm.pathfinding.grid.finders.AStarGridFinder

/**
 * # A controllable in-game character
 * That may be owned and controlled by a human or AI player.
 *
 * @author [Jordan T. Gray](https://www.shinkson47.in) on 19/05/2021
 * @since PRE-ALPHA 0.0.1
 * @version 1
 */
open class Unit (

    /**
     * ## The type of unit
     *
     * Determines the sprites and behaviour of the unit.
     */
    val unitClass: UnitClass,

    /**
     * ## The isometric position of the unit
     */
    var isoVec: Vector3

    ) : Sprite(REF_SPRITES_UNITS.createSprite(unitClass.toString())), PartiallySerializable {

    constructor(unitClass: UnitClass, _x: Int, _y: Int) : this(unitClass, Vector3(_x.toFloat(), _y.toFloat(), 0f))


    // ░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░
    // region fields
    // ░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░

    /**
     * The in-world light that this unit carries with it to act as fog of war.
     * // TODO base on view distance.
     */
    var light: PointLight?


    // ░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░
    // endregion fields
    // region data
    // ░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░

    companion object {
        val UnitData = DataTable(Assets.DATA_UNIT)
    }

    val data = UnitData.getSubTable(unitClass.toString())

    fun helptext() = data.getString("helptext")
    fun graphic() = data.getString("graphic")

    //TODO enum
    // TODO move default values to a base class.

    val classification= data.getString("class")?: "_BASE"

    val cost = data.getInt("build_cost")?: "40"
    fun requirementsMet(): Boolean {
        return data.getString("tech_req")?.let {
            (ownedBy()?.advancementTree ?: GameData.player!!.advancementTree)
                .getA(it)?.complete
                ?:
                true.apply { warnDev("$displayName requires $it, but it was not found in the tech tree.") }
        }?:  true // TODO many units are not in data.
    }

    /**
     * ## A user friendly name of this unit.
     * For now, is just the [unitClass]
     */
    val displayName = data.getString("name")


    // ░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░
    // endregion data
    // region movement
    // ░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░

    /**
     * ## The unit's destination
     * the x, y that the unit desires to travel to,
     * if there is a destination set.
     *
     * Is null if there is no destination set, or is unable
     * to travel to a destination that was requested.
     */
    var destination: Vector2? = null
        private set

    /**
     * A list of cells in the world, defining the path
     * this unit is trying to take to reach [destination]
     */
    var pathNodes : List<GridCell>? = null

    @Transient val pathfinder = AStarGridFinder(GridCell::class.java)


    /**
     * The distance that this unit is able to see.
     *
     * Determines how much of the map is revealed,
     * and how large the [light] is.
     */
    // TODO these need to be dictionary based values
    var viewDistance = data.getInt("vision_radius_sq")?: 2

    /**
     * Determines how many nodes in the [pathNodes]
     * that may be traveled in one turn
     */
    // TODO these need to be dictionary based values
    var travelDistance: Int  = data.getInt("move_rate")?: 2


    /**
     * Set the location of the object to the given position.
     *
     * @param _pos The position you want to move to.
     * @param dontPathfind If true, the bot will not pathfind to the location.
     * @see setLocation (Int, Int) for full docs
     */
    fun setLocation(_pos : Vector3, dontPathfind: Boolean = false): Boolean = setLocation(_pos.x, _pos.y, dontPathfind)


    /**
     * Set the location of the player
     *
     * @param x The x coordinate of the location you want to move to.
     * @param y The y coordinate of the location to set the player to.
     * @param dontPathfind If true, the character will not pathfind to the location.
     * @see setLocation (Int, Int) for full docs
     */
    fun setLocation(x: Float, y: Float, dontPathfind: Boolean = false) : Boolean = setLocation(x.toInt(), y.toInt(), dontPathfind)

    /**
     * # Sets the isometric location of this unit
     * Teleports this unit to the specified tile without question.
     *
     * Doesn't care as to wether or not a unit *should* be able to go onto this tile.
     *
     * where [x] and [y] are iso co-ordinates, and are stored in [isoX], [isoY].
     *
     * super.[x] and super.[y] store cartesian equivalents
     * to position the sprite, which are calculated in [WorldTerrain.isoToCartesian]
     *
     * For a delta translation, see [deltaPosition]
     *
     * Teleports only within the boundaries of the world.
     * co-ords will automatically be clamped.
     *
     * After the move, defogs area around new position and
     * moves the light.
     *
     * Moving the unit also invalidates and updates the pathfinding.
     * [destination] may be cleared if the new location cannot pathfind to the
     * [destination].
     *
     * @param x The isometric x to teleport to.
     * @param y The isometric y to teleport to.
     * @param dontPathfind If true, will not invalidate the path. For efficiency when moving along path, i.e [TRAVEL]
     * @return Result of pathfinding. True if still able to reach [destination], else false.
     *         Always false if [dontPathfind] is true.
     *         if [dontPathFind] == false and returns false, then [destination] has been cleared.
     */
    fun setLocation(x: Int, y: Int, dontPathfind: Boolean = false) : Boolean {
        // Clamp to within bounds of the world.
        val x = MathUtils.clamp(x, 0, GameData.world!!.width - 1)
        val y = MathUtils.clamp(y, 0, GameData.world!!.height - 1)

        // Store iso position
        isoVec.set(x.toFloat(),y.toFloat(),0f)

        // Defog
        GameData.world!!.defog(isoVec.x.toInt(), isoVec.y.toInt(), viewDistance)

        // Move the sprites & light
        isoToCartesian(x, y).apply {
            // Compensate for the origin, so that the sprite is in the center of the cell.
            setPosition(this.x, this.y)
        }

        // Invalidate the pathfinding.
        return if (dontPathfind)
            false
        else
            calculatePath()
    }

    /**
     * See [setDestination] (Int, Int) for documentation
     */
    fun setDestination(v : Vector2) = setDestination(v.x, v.y)

    /**
     * See [setDestination] (Int, Int) for documentation
     */
    fun setDestination(v : Vector3) = setDestination(v.x, v.y)

    /**
     * Sets a desired destination, then calculates the pathfinding required to reach it.
     *
     * [destination] will be null if there is no way to pathfind to the destination
     *
     * Has no effect if x, y matches [destination].
     *
     * @param x X Isometric x position of the destination
     * @param y Y Isometric y position of the destination
     * @return true if able to reach the destination, else false.
     */
    fun setDestination(x: Float, y: Float): Boolean {
        val x = MathUtils.clamp(x, 0f, GameData.world!!.width - 1f)
        val y = MathUtils.clamp(y, 0f, GameData.world!!.height - 1f)

        // don't path find if destination is same.
        if (x == destination?.x && y == destination?.y) return true

        // Set new destination
        destination = Vector2(x,y)

        // Try pathfinding
        return calculatePath()
    }

    /**
     * Removes the destination and clears the path to it.
     *
     * Used when destination is invalid or removed.
     */
    fun clearDestination() {
        destination = null
        pathNodes = null
        System.gc()
    }

    /**
     * Performs A* pathfinding to attempt to determine a path to the [destination].
     *
     * Places resulting path into [pathNodes]
     *
     * Has no effect if [destination] is null.
     *
     * Will [clearDestination] if there is no way of reaching it.
     *
     * @return true if able to path find to destination, else false.
     */
    private fun calculatePath(): Boolean {
        if (destination?.let { !GameData.world!!.isNavligable(it.x, it.y) } == true) return false

        try {
            with(GameData.world!!) {
                pathNodes = pathfinder.findPath(isoVec.x.toInt(), isoVec.y.toInt(), destination!!.x.toInt(), destination!!.y.toInt(), navigationLayer)
            }
        } catch (e: Exception) {
            clearDestination()
            return false
        }

        if (pathNodes == null || pathNodes?.size == 0) {
            clearDestination()
            return false
        }

        return true
    }

    /**
     * Moves this sprite relative to it's current position by a x and y tiles,
     * then invokes [setLocation] to update the sprite and pathfinding and whatnot.
     */
    fun deltaPosition(deltaX: Int, deltaY: Int) : Boolean {
        isoVec.x += deltaX
        isoVec.y += deltaY
        return setLocation(isoVec)
    }


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
     * Sets the location of the sprites and lighting.
     *
     * This should not be done externally. Set the location of the unit instead.
     */
    @Deprecated("see [setLocation]")
    override fun setPosition(x: Float, y: Float) {
        super.setPosition(x - TILE_HALF_WIDTH, y - TILE_HALF_HEIGHT)
        assertSpritePositions()
    }

    /**
     * Ensures that the sub-sprites (health, status, light, etc) all match
     * the position of the main unit sprite (super).
     */
    private fun assertSpritePositions() {
        light?.setPosition(x, y)
        // TODO cache these offsets globally.
        hpSprite?.setPosition(x + center(width, hpSprite!!.width), y + TILE_HEIGHT + 2)
        autoSprite?.setPosition(x + center(width, autoSprite!!.width), y + TILE_HEIGHT + 6)
    }

    // ░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░
    // endregion movement
    // region health & combat
    // ░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░


    /**
     * Attack power of this unit.
     *
     * Determines how much damage an attack from thus far will deal.
     *
     * Defaults to 0 if no 'attack' attribute is found in the data.
     */
    val attack = data.getInt("attack")?: 0

    /**
     * Defense ability of this unit.
     *
     * When attacked, determines how much of the received damage
     * is mitigated.
     */
    val defense = data.getInt("defense")?: 2

    /**
     * Target of attack actions.
     *
     * In future, may be used for more than attacks.
     */
    var target: Unit? = null

    /**
     *  The max value of the hitpoints based on the units data.
     *
     *  If there is no hp data, defaults to 10.
     */
    val MAX_HP = data.getInt("hitpoints")?: 10

    /**
     * The hitpoints health of this unit.
     *
     * Starts at [MAX_HP]. When changed, the [hpSprite]
     * is automatically updated to show the health.
     *
     * When set to below 0, this unit is automatically disbanded.
     */
    var hp = MAX_HP
        set(value) {
            if (value < 0)
                // FIXME when rebates are implemented, this will reward the player with resources when the unit is killed...
                Hypervisor.unit_disband(this)

            field = value.coerceIn(-1..MAX_HP)
            updateHpSprite()
        }

    /**
     * Returns true if the unit is dead.
     * @return true if the unit's hit points are less than or equal to zero.
     */
    fun isDead() = hp <= 0

    /**
     * Sprite used to display the current health of this unit.
     *
     * Automatically updates when the health of this unit is changed.
     */
    var hpSprite: Sprite? = null
        set(value) {
            field = value
            field?.scale(-0.5f)
            assertSpritePositions()
        }

    /**
     * Updates the health sprite used to display the current health of this unit.
     *
     * Only call if a change is required.
     */
    private fun updateHpSprite() {
        hpSprite = Assets.get<TextureAtlas>(SPRITES_UNITEXTRAS)
            .createSprite("hp_${Utility.roundToNearestMultiple(hp.asPercentOf(MAX_HP).toFloat(), 10f)}")
    }

    /**
     * Attacks this unit with another.
     *
     * This unit takes damage equal to the attacking unit's [attack] - this units [defense]
     *
     * This unit retaliates damage equal to [attack] to the attacking unit.
     *
     * @param by is the unit that is attacking, and this is the unit that is being attacked.
     */
    fun attacked(by: Unit): Boolean {
        by.damage(attack)
        return damage(by.attack) == -1
    }

    /**
     * If there is a [target], it will be [attacked].
     */
    fun attack() {
        AudioController.fight()
        target?.let {
            it.attacked(this)
            if (it.isDead())
                target = null
        }
    }

    /**
     * Subtract the attack strength from the hp.
     *
     * Damage dealt is [strength] - [defense].
     *
     * Prevents damage from actually causing hp to rise strength is lower than defense.
     *
     * @param strength The base amount of damage to be dealt.
     */
    fun damage(strength: Int) : Int = hp.apply { hp -= (strength - defense).coerceAtLeast(0) }


    init {
        updateHpSprite()
    }





    // ░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░
    // endregion health
    // region action
    // ░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░


    /**
     * The actions that this unit is able to perform.
     *
     * Fetched from [UnitActionDictionary], which defines what each class is able to do.
     */
    val availableActions: Array<UnitAction> = UnitActionDictionary[unitClass]


    /**
     * [UnitAction] that this unit will perform on the next turn.
     */
    var onTurnAction: UnitAction? = null


    /**
     * Performs this unit's [onTurnAction], if there is one.
     */
    fun doTurn() { onTurnAction?.run(this) }

    /**
     * Removes [onTurnAction]
     *
     * preventing this unit from performing any action
     * on each turn.
     */
    fun cancelAction() { onTurnAction = null }

    // ░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░
    // endregion action
    // region other functions
    // ░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░


    // TODO cache?
    @Deprecated("Inefficient. Refrain from using if possible. Required for some global actions, though.")
    fun ownedBy() =
        GameData.nations.find { it.units.contains(this) }

    // ░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░
    // endregion fields
    // region AI
    // ░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░

    /**
     * The state machine controlling this unit, if it is
     * AI controlled.
     */
    lateinit var ai: UnitAI
    var autoSprite: Sprite? = null
        set(value) {
            field = value
            field?.scale(-0.5f)
            assertSpritePositions()
        }

    /**
     * Configures this unit to be AI controlled, and autonomous.
     *
     * Invoked at spawn, if spawned into an AI controlled Nation.
     */
    fun ai_init() {
        ai = UnitAI()
        autoSprite = Assets.get<TextureAtlas>(SPRITES_UNITEXTRAS).createSprite("auto")
    }

    /**
     * Invokes the AI to evaluate and perform actions.
     *
     * Invoked in the turn hook to evaluate the state machine
     * every turn.
     */
    fun ai_update() {
        ai.run()
    }

    /******************************************************
     * This code was generated by the SSVM compiler
     * from 'UnitAI' state machine script file
     * on Mon Mar 07 16:18:28 GMT 2022
     ******************************************************/
    /**
     * Unit AI
     * A simple random movement ai
     */
    inner class UnitAI : StateMachine("UnitAI") {
        private val isWandering = true

        val Wander = 0
        val Settle = 1

        init {
            // State : Wander
            addState(
                State(
                    "Wander",
                    {
                        // And travel towards to.
                        UnitActionDictionary.TRAVEL.run(this@Unit)
                    },
                    this,
                    { setDestination(GameData.world!!.randomNavigableTile()) },
                    null
                )
            )
            // Switch : from Wander to Wander
            registerSwitchCondition(Wander, Wander) { unit: kotlin.Unit? -> destination == null }
            // State : Settle
            addState(
                State(
                    "Settle",
                    {},
                    this,
                    { UnitActionDictionary.SETTLE.run(this@Unit) },
                    null
                )
            )
            // Switch : from Wander to Settle
            registerSwitchCondition(Wander, Settle) { unit: kotlin.Unit? -> destination == null && unitClass == UnitClass.settler && MathUtils.randomBoolean() }
            defaultState(0)
        }

        init {
            onTurnAction = UnitActionDictionary.AI_UPDATE
        }
    }

    // ░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░
    // endregion AI
    // region other functions
    // ░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░

    /**
     * Draw the sprite, the health bar and
     * other sub sprites.
     *
     * @param batch The Batch object that will be used to draw the sprite.
     */
    override fun draw(batch: Batch?) {
        super.draw(batch)
        hpSprite?.draw(batch)
        autoSprite?.draw(batch)
    }

    override fun toString() = "$displayName $isoVec"

    fun dispose() {
        light?.remove()
    }

    final override fun deserialize() {
        set(REF_SPRITES_UNITS.createSprite(unitClass.toString()))
        setLocation(isoVec)
    }



    init {
        setLocation(isoVec)
        light = GameData.world!!.staticLight(isoVec.x, isoVec.y, viewDistance*100f)
    }
}