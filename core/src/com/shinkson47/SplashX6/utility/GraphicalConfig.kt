package com.shinkson47.SplashX6.utility

import com.badlogic.gdx.Gdx.graphics
import com.badlogic.gdx.Graphics.*
import com.badlogic.gdx.utils.Scaling
import com.shinkson47.SplashX6.Client


/**
 * # Object that manages rendering modes, scaling, and other graphical configurations.
 * @author [Jordan T. Gray](https://www.shinkson47.in) on 15/06/2021
 * @since v1
 * @version 1
 */
object GraphicalConfig  {

    // ============================================================
    // region Resolutions
    // ============================================================
    /**
     * # Current display mode.
     *
     * Setter changes the display mode.
     *
     * Changes display mode according to [mode] and [fullscreen],
     * then calls [Client.client]'s resize and reloads menu screen.
     *
     */
    var displayMode : DisplayMode = graphics.displayMode
        set(it) {
            if (fullscreen)
                graphics.setFullscreenMode(it)

            else
                graphics.setWindowedMode(
                    it.width,
                    it.height
                )

            field = graphics.displayMode
            update()
        }


    /**
     * Gets a list of all available display modes.
     */
    fun getDisplayModes() = graphics.displayModes


    // ============================================================
    // endregion
    // region fullscreen
    // ============================================================
    /**
     * Flag representing the current fullscreen state.
     *
     * Setter Calls [setDisplayMode] after changing [fullscreen] to [value].
     *
     * if [value] is true, application will be asserted into fullscreen,
     * and vice versa.
    */
    var fullscreen  = graphics.isFullscreen
        set(it) {
            field = it
            displayMode = graphics.displayMode
        }

    /**
     * Asserts the application into exclusive fullscreen with the current display mode.
     */
    fun enterFullscreen() { fullscreen = true }

    /**
     * Asserts the application into windowed with the current display mode.
     */
    fun exitFullscreen() { fullscreen = false }

    /**
     * If in [fullscreen], calls [exitFullscreen] and vice versa.
     */
    fun toggleFullscreen() {
        if (fullscreen)
            exitFullscreen()
        else
            enterFullscreen()
    }

    // ============================================================
    // endregion
    // region Scaling
    // ============================================================


    /**
     * The way in which the window content will be injected into the
     * display area (window).
     */
    var scalingMode = Scaling.fit
        set (it) {
            field = it
            update();
        }

    /**
     * Returns an array of [Scaling] modes.
     *
     * These can be used in [x] to define how the image is scaled within the window.
     */
    fun getScalingModes() = Scaling.values()

    /**
     * Absolute minimum render size.
     *
     * If the display area (window) is smaller than this size, then
     * the rendered output is scaled using [scalingMode] via ScalingScreenAdapter.
     */
    var MIN_STAGE_HEIGHT = 1080

    /**
     * Absolute minimum render size.
     *
     * If the display area (window) is smaller than this size, then
     * the rendered output is scaled using [scalingMode] via ScalingScreenAdapter.
     */
    var MIN_STAGE_WITDH  = 1920

    private fun update() = Client.client!!.resize()

}