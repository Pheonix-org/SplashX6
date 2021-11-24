package com.shinkson47.SplashX6.rendering.windows

import com.badlogic.gdx.Graphics
import com.badlogic.gdx.scenes.scene2d.ui.Tree
import com.shinkson47.SplashX6.rendering.ScalingScreenAdapter
import com.shinkson47.SplashX6.rendering.StageWindow
import com.shinkson47.SplashX6.rendering.windows.optionspanes.LanguageSelectionListener
import com.shinkson47.SplashX6.utility.Assets.SKIN
import com.shinkson47.SplashX6.utility.GraphicalConfig
import com.shinkson47.SplashX6.utility.Languages
import com.shinkson47.SplashX6.utility.Utility.local

/**
 * # A collection of tabs that provide configurable options to the user.
 * @author [Jordan T. Gray](https://www.shinkson47.in) on 09/06/2021
 * @since PRE-ALPHA
 * @version 2
 */
class OptionsWindow(val parent : ScalingScreenAdapter) : StageWindow("generic.any.options") {

    init {
        val t : Tree<Tree.Node<*, *, *>, Any> = Tree(SKIN)
        t.selection.isDisabled = true
        t.indentSpacing = 30f

        arrayOf(
            RootNode(
                    "generic.any.general",
                    ListNode(LanguageSelectionListener, "locale", "specific.preferences.general.selectLanguage", *Languages.values())
            ),

            RootNode(
                    "specific.preferences.graphics.graphics",
                    ListNode<Graphics.DisplayMode>(GraphicalConfig, "displayMode", "specific.preferences.graphics.displayMode", *GraphicalConfig.getDisplayModes() + GraphicalConfig.displayMode),
                    ListNode(GraphicalConfig, "scalingMode", "specific.preferences.graphics.scalingMode", *GraphicalConfig.getScalingModes()),
                    CheckboxNode(GraphicalConfig, "fullscreen", "specific.preferences.graphics.fullscreen"),
                    ScriptNode("specific.preferences.graphics.frustum") { GraphicalConfig.callibrateCullingFrustum(this) }
            ),

            RootNode(
                    "generic.sound.sound"
            )

        ).forEach { t.add(it) }

        t.addListener(LambdaClickListener {pack()})

        expandfill(
                add(t)
                .minHeight(200f)
                .minWidth(300f)
        )


//                SOUND_OPTION_TAB,
        pack()
    }
}