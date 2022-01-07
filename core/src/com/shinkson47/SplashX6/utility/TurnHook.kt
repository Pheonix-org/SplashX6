package com.shinkson47.SplashX6.utility

/**
 * # A runnable script which can be executed on every turn.
 */
interface TurnHook : Runnable {

    @Deprecated("Run should not be directly invoked on a TurnHook.", ReplaceWith("OnTurn()"))
    override fun run() = doOnTurn()

    fun onTurn()

    fun doOnTurn() {
        onTurn()
    }
}