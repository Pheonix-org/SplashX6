package com.shinkson47.SplashX6.utility

import com.badlogic.gdx.scenes.scene2d.ui.TooltipManager
import com.shinkson47.SplashX6.rendering.windows.NodeInfo
import com.shinkson47.SplashX6.utility.Assets.preferences

/**
 * # Kotlin specific utilities.
 */
object UtilityK {
    inline fun <T> tryOrNull(f: () -> T) =
        try {
            f()
        } catch (_: Exception) {
            null
        }

    val ttManager = TooltipManager()
    @NodeInfo("Time of hovering over an object before a tooltip is displayed.")
    var ttInitialTime: Float = preferences.getFloat("prefs.tooltip.initialtime", 0.5F)
        set(value) {
            ttManager.initialTime = value
            preferences.putFloat("prefs.tooltip.initialtime", value)
            preferences.flush()
            field = value
        }

    @JvmStatic
    @NodeInfo("After displaying a tooltip, and before reset, time take to display tooltips.")
    var ttSubsequentTime: Float = preferences.getFloat("prefs.tooltip.subsequenttime", ttManager.subsequentTime)
        set(value) {
            ttManager.subsequentTime = value
            preferences.putFloat("prefs.tooltip.subsequenttime", value)
            preferences.flush()
            field = value
        }

    @JvmStatic
    @NodeInfo("Time with no tooltips to reset to initial delay.")
    var ttResetTime: Float = preferences.getFloat("prefs.tooltip.resettime", ttManager.resetTime)
        set(value) {
            ttManager.resetTime = value
            preferences.putFloat("prefs.tooltip.resettime", value)
            preferences.flush()
            field = value
        }
}