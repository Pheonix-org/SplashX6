package com.shinkson47.SplashX6.utility

import com.badlogic.gdx.math.MathUtils
import com.badlogic.gdx.math.Vector3

/**
 * # A value which moves closer to the desired value by [alpha]
 * @author [Jordan T. Gray](https://www.shinkson47.in) on 04/05/2021
 * @since v1
 * @version 1
 */
class lerpDesire<type> @JvmOverloads constructor (_present: type, _desired: type, _alpha: Float = 0.1f) {
    constructor(_value: type)                   : this(_value, _value)
    constructor(_value: type, _alpha: Float)    : this(_value, _value, _alpha)

    /**
     * The Current value
     */
    var present: type = _present

    /**
     * The value desired
     */
    var desired: type = _desired

    /**
     * The quantity of change per [next]
     */
    var alpha: Float = _alpha

    fun next(): type {
        return next(alpha)
    }

    /**
     * Moves [present] towards [desired] by [alpha] and returns.
     */
    fun next(alpha: Float): type {
        when (present) {
            is Vector3 -> (present as Vector3).lerp(desired as Vector3, alpha);
            is Float   ->  present = MathUtils.lerp(present as Float, desired as Float, alpha) as type
        }
        return get()
    }

    /**
     * Gets [present]
     */
    fun get(): type = present

    /**
     * Sets [desired]
     */
    fun set(value: type) {desired = value}

    /**
     * Returns a string representation of the object.
     */
    override fun toString(): String = "Desired : $desired, Actual : ${get()}"

    /**
     * Ensures that [type] is a supported type: Vector3 or Float
     */
    init {
        if (!(
                    present is Vector3 ||
                            present is Float
                    )) throw IllegalArgumentException("Unsupported Desire Object : $present")
    }
}