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

package com.shinkson47.SplashX6.rendering.windows.optionspanes

import com.badlogic.gdx.scenes.scene2d.Actor
import com.badlogic.gdx.scenes.scene2d.ui.SelectBox
import com.badlogic.gdx.scenes.scene2d.utils.ChangeListener
import com.shinkson47.SplashX6.Client
import com.shinkson47.SplashX6.game.GameHypervisor
import com.shinkson47.SplashX6.rendering.screens.MainMenu
import com.shinkson47.SplashX6.rendering.screens.game.Menu
import com.shinkson47.SplashX6.utility.APICondition
import com.shinkson47.SplashX6.utility.Assets
import com.shinkson47.SplashX6.utility.Languages

/**
 * # Action performed when user desires to change language.
 */
object LanguageSelectionListener {
    // FIXME move this to some language manager? idk, this is a fucking mess.
    var locale : Languages = Languages.en
        set(value) {
            field = value


            //Assets.loadLanguage(value)
        }
}
//    val currentLanguage : String
//    )  : ChangeListener() {

//    companion object {
//        var locale : String = Assets.LANG.locale.displayName
//            set(value) {
//                field = value
//                // TODO i hate this.
//                LanguageSelectionListener(locale).changed(ChangeEvent(), Actor())
//            }
//    }
//
//    /**
//     *
//     */
//    var ignoreChanged = false
//
//    /**
//     * # User has selected another language in the list.
//     */
//    override fun changed(event: ChangeEvent, actor: Actor) {
//        // If this change should be ignored, reset flag and return.
//        if (ignoreChanged) {
//            ignoreChanged = false
//            return
//        }
//
//        // If the user selected the one that's already set, ignore.
//        if (locale == currentLanguage) return
//
//        // Make sure we're on the menu.
////        if (APICondition.invalidCall(
////                APICondition.REQ_UNIT_CONTROL_MODE,
////                APICondition.WARN("Language can only be changed in the main menu", languageList)
////            )
////        ) { // If call was rejected, reset to current language and ignore.
////            rejectChange()
////            return
////        }
//
//        // If we made it this far, call is valid.
//
//        // TODO needs to be localised.
//        // IMPLEMENT dialog
//        // FIXME this cannot be used on the main menu :(
//        GameHypervisor.gameRenderer!!.menu.subActionMenu.dialog("Confirm language", "Change to " + languageList.selected, "Yes", "No") {
//            if (it) { // User confirms, change language and re-load menu. We don't change state because this instance will be disposed when the menu is reloaded.
//                Assets.loadLanguage(Languages.values()[languageList.getSelectedIndex()])
//                Client.client!!.fadeScreen(MainMenu()) // TODO - standardised way to go to menu instead of setting screen.
//            } else // User rejected, reset and return.
//                rejectChange()
//        }
//    }
//
//    /**
//     * Resets the selected value to what it was prior to making a selection if the change was rejected for any reason.
//     */
//    private fun rejectChange() {
//        ignoreChanged = true // We're going to change the value, but it should be ignored.
//        languageList.selected = currentLanguage
//    }
// }