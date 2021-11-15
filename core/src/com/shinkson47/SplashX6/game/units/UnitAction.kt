package com.shinkson47.SplashX6.game.units

import java.io.Serializable
import java.util.function.Predicate

/**
 * # An action that can be performed by a unit on a turn.
 * Can basically perform any script. Only thing [onAction] can't do
 * is modify GameData.units
 * @author [Jordan T. Gray](https://www.shinkson47.in) on 30/05/2021
 * @since PRE-ALPHA 0.0.2
 * @version 1
 */
class UnitAction(_displayName: String, _isAvailable: UnitActionDictionary.SerializablePredicate<Unit>, _onAction: UnitActionDictionary.SerializablePredicate<Unit>): Serializable {

    /**
     * The localised name of this action that can be displayed to the used.
     */
    val displayName: String = _displayName

    /**
     * Predicate that determines if the action can be used.
     */
    val isAvailable: UnitActionDictionary.SerializablePredicate<Unit> = _isAvailable

    /**
     * Action that is executed when the user desires.
     *
     * Accepts the calling unit, and returns true/false on
     * it's ability to complete the action.
     */
    val onAction: UnitActionDictionary.SerializablePredicate<Unit> = _onAction

    /**
     * # Executes this action's script.
     */
    fun run(unit: Unit) : Boolean = onAction.test(unit)

    override fun toString() = displayName
}