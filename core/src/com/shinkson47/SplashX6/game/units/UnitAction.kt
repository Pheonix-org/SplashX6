package com.shinkson47.SplashX6.game.units

import java.util.function.Predicate

/**
 * # An action that can be performed by a unit.
 * @author [Jordan T. Gray](https://www.shinkson47.in) on 30/05/2021
 * @since v1
 * @version 1
 */
class UnitAction(_displayName: String, _isAvailable: Predicate<Unit>, _onAction: Predicate<Unit>) {

    /**
     * The localised name of this action that can be displayed to the used.
     */
    val displayName: String = _displayName

    /**
     * Predicate that determines if the action can be used.
     */
    val isAvailable: Predicate<Unit> = _isAvailable

    /**
     * Action that is executed when the user desires.
     *
     * Accepts the calling unit, and returns true/false on
     * it's ability to complete the action.
     */
    val onAction: Predicate<Unit> = _onAction


    // TODO dictionaries of actions available for different classes of units.


    override fun toString(): String {
        return displayName
    }


    companion object {


        // ==========================================
        //region    ACTIONS
        // ==========================================

        // ==========================================
        //endregion ACTIONS
        //region    AVAILABILITY TESTS
        // ==========================================
        val ALWAYS_AVAILABLE = Predicate<Unit> { true }



        // ==========================================
        //endregion AVAILABILITY TESTS
        // ==========================================
    }
}