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
class OptionsWindow(val parent : ScalingScreenAdapter) : StageWindow("PREFERENCES") {

    init {
        val t : Tree<Tree.Node<*, *, *>, Any> = Tree(SKIN)
        t.selection.isDisabled = true
        t.indentSpacing = 30f

        // IMPLEMENT localisation

        arrayOf(
            RootNode(
                    "General",
                    ListNode(LanguageSelectionListener, "locale", local("selectLanguage"), *Languages.values())
            ),

            RootNode(
                    "Graphics",
                    ListNode<Graphics.DisplayMode>(GraphicalConfig, "displayMode", "Display Mode", *GraphicalConfig.getDisplayModes() + GraphicalConfig.displayMode),
                    ListNode(GraphicalConfig, "scalingMode", "Scaling Mode", *GraphicalConfig.getScalingModes()),
                    CheckboxNode(GraphicalConfig, "fullscreen", "Fullscreen"),
                    ScriptNode(local("graphicalFrustum")) { GraphicalConfig.callibrateCullingFrustum(this) }
            ),

            RootNode(
                    "Sound",

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