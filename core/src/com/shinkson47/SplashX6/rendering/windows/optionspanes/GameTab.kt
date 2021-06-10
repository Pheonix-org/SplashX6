package com.shinkson47.SplashX6.rendering.windows.optionspanes

import com.badlogic.gdx.scenes.scene2d.ui.SelectBox
import com.badlogic.gdx.scenes.scene2d.ui.Table
import com.shinkson47.SplashX6.rendering.StageWindow
import com.shinkson47.SplashX6.rendering.windows.OptionsWindow
import com.shinkson47.SplashX6.utility.Assets
import java.util.*
import java.util.function.Consumer

/**
 * # TODO
 * @author [Jordan T. Gray](https://www.shinkson47.in) on 09/06/2021
 * @since v1
 * @version 1
 */
class GameTab(val parent : OptionsWindow) : Table() {

    init {

        // Selection box to select a language.
        val languageList = SelectBox<String>(Assets.SKIN)

        // Array of strings to put in list of selectable languages.
        val languagesString = ArrayList<String>()
        Assets.languages.forEach( Consumer { languagesString.add(it!!.getDisplayName(Assets.LANG.locale)) })
        languageList.setItems(*languagesString.toTypedArray())

        // String represenging the currently selected language
        val currentLanguage = Assets.LANG.locale.displayName
        languageList.setSelected(currentLanguage)

        languageList.addListener(LanguageSelectionListener(this, languageList, currentLanguage))

        StageWindow.label("selectLanguage", this)
        add(languageList).padTop(20f)
    }
}