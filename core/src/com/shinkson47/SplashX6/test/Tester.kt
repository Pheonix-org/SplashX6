package com.shinkson47.SplashX6.test

import com.badlogic.gdx.Application.LOG_ERROR
import com.badlogic.gdx.Gdx
import kotlin.AssertionError

/**
 * # A script which performs tests.
 * @author [Jordan T. Gray](https://www.shinkson47.in) on 27/07/2021
 * @since PRE-ALPHA 0.0.2
 * @version 1
 */
abstract class Tester : Runnable {

    /**
     * ## If this tester has failed any tests,
     */
    var failed = false
        private set

    /**
     * ## Has this tester used [assert] yet?
     */
    private var asserted = false


    /**
     * ## Performs tests, and meta checks.
     */
    fun test() : Boolean {

        // Perform tests.
        doTest()

        // Check that [doTest()] called [assert] at least once.
        // Throw exception if no tests were ran.
        // A tester not running tests is unexpected.
        if (!asserted)
            throw IllegalStateException("Tester completed without performing any assertions.")

        // Return wether or not this tester has failed.
        return failed
    }

    /**
     * ## Performs tests.
     * > N.B > You ___must___ call [assert] with the result of your tests.
     */
    abstract fun doTest()

    /**
     * ## If and test provides an [it] which is not true, this tester will fail.
     *
     * Returns the negation of [it] so that this can be used as an expression in your tests.
     * Just trying to make your life that little bit easier :)
     *
     * Automatically logs failures using message.
     *
     * e.g
     * ```
     * if (assert(variable == expected, "'variable' was not what was expected!")) {
     *      variable = expected
     * }
     * ```
     */
    protected fun assert(it : Boolean, passMessage : String = "", failMessage : String = "A test has failed.") : Boolean {
        asserted = true

        // If the assertion was not true, and we have not yet failed,
        // record failure. Any other state has no effect.
        if (!it) {
            System.err.println("[TESTER] ✗ [## FAIL ##]  : $failMessage")

            failed = true
            throw AssertionError("[TEST FAILURE] : $failMessage")
        }

        if (passMessage != "")
            println("[TESTER] ✔ [PASS]  : $passMessage")

        return !it
    }


    init { Thread(this).start() }
    override fun run() { test() }
}