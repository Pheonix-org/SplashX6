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

package com.shinkson47.SplashX6.utility

import FrustumCallibration
import com.badlogic.gdx.Gdx.graphics
import com.badlogic.gdx.Graphics.*
import com.badlogic.gdx.utils.Scaling
import com.shinkson47.SplashX6.Client
import com.shinkson47.SplashX6.game.GameHypervisor
import com.shinkson47.SplashX6.rendering.StageWindow
import com.shinkson47.SplashX6.rendering.windows.NodeInfo
import com.shinkson47.SplashX6.utility.APICondition.Companion.REQ_IN_GAME
import com.shinkson47.SplashX6.utility.APICondition.Companion.WARN
import com.shinkson47.SplashX6.utility.APICondition.Companion.invalidCall


/**
 * # Object that manages rendering modes, scaling, and other graphical configurations.
 * @author [Jordan T. Gray](https://www.shinkson47.in) on 15/06/2021
 * @since v1
 * @version 1
 */
object GraphicalConfig  {

    fun callibrateCullingFrustum(parent : StageWindow){
        if (invalidCall(REQ_IN_GAME, WARN("Frustrum changes can only be made whilst in-game.")))
            return

        GameHypervisor.gameRenderer!!.stage.addActor(FrustumCallibration())
        parent.toggleShown()
    }

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
    @NodeInfo("Determines if the games takes complete control over your GPU.")
    var fullscreen = graphics.isFullscreen
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