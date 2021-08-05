package com.shinkson47.SplashX6.rendering.windows.optionspanes

import com.badlogic.gdx.scenes.scene2d.Actor
import com.badlogic.gdx.scenes.scene2d.ui.SelectBox
import com.badlogic.gdx.scenes.scene2d.utils.ChangeListener
import com.shinkson47.SplashX6.Client
import com.shinkson47.SplashX6.rendering.screens.MainMenu
import com.shinkson47.SplashX6.utility.APICondition
import com.shinkson47.SplashX6.utility.Assets
import com.shinkson47.SplashX6.utility.Languages

/**
 * # Action performed when user desires to change language.
 */
class LanguageSelectionListener(
    val parent : GameTab,
    val languageList : SelectBox<String>,
    val currentLanguage : String
    )  : ChangeListener() {

    /**
     *
     */
    var ignoreChanged = false

    /**
     * # User has selected another language in the list.
     */
    override fun changed(event: ChangeEvent, actor: Actor) {
        // If this change should be ignored, reset flag and return.
        if (ignoreChanged) {
            ignoreChanged = false
            return
        }

        // If the user selected the one that's already set, ignore.
        if (languageList.selected == currentLanguage) return

        // Make sure we're on the menu.
        if (APICondition.invalidCall(
                APICondition.REQ_UNIT_CONTROL_MODE,
                APICondition.WARN("Language can only be changed in the main menu", languageList)
            )
        ) { // If call was rejected, reset to current language and ignore.
            rejectChange()
            return
        }

        // If we made it this far, call is valid.

        // TODO needs to be localised.
        parent.parent.dialog("Confirm language", "Change to " + languageList.selected, "Yes", "No") {
            if (it) { // User confirms, change language and re-load menu. We don't change state because this instance will be disposed when the menu is reloaded.
                Assets.loadLanguage(Languages.values()[languageList.getSelectedIndex()])
                Client.client!!.fadeScreen(MainMenu()) // TODO - standardised way to go to menu instead of setting screen.
            } else // User rejected, reset and return.
                rejectChange()
        }
    }

    /**
     * Resets the selected value to what it was prior to making a selection if the change was rejected for any reason.
     */
    private fun rejectChange() {
        ignoreChanged = true // We're going to change the value, but it should be ignored.
        languageList.selected = currentLanguage
    }
}