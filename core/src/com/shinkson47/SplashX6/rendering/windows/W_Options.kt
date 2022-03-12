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

package com.shinkson47.SplashX6.rendering.windows

import com.badlogic.gdx.Graphics
import com.badlogic.gdx.scenes.scene2d.ui.Tree
import com.shinkson47.SplashX6.audio.AudioController
import com.shinkson47.SplashX6.rendering.ui.ScalingScreenAdapter
import com.shinkson47.SplashX6.rendering.ui.StageWindow
import com.shinkson47.SplashX6.rendering.windows.optionspanes.LanguageSelectionListener
import com.shinkson47.SplashX6.utility.Assets.REF_SKIN_W95
import com.shinkson47.SplashX6.utility.configuration.GraphicalConfig
import com.shinkson47.SplashX6.utility.Utility
import com.shinkson47.SplashX6.utility.configuration.LanguageConfig

/**
 * # A collection of tabs that provide configurable options to the user.
 * @author [Jordan T. Gray](https://www.shinkson47.in) on 09/06/2021
 * @since PRE-ALPHA
 * @version 2
 */
class W_Options(val parent : ScalingScreenAdapter) : StageWindow("generic.any.options") {

    init {
        val t : Tree<Tree.Node<*, *, *>, Any> = Tree(REF_SKIN_W95)
        t.selection.isDisabled = true
        t.indentSpacing = 30f


        arrayOf(
            RootNode(
                    "generic.any.general",
                    SelectNode(LanguageSelectionListener, "locale", "specific.preferences.general.selectLanguage", *LanguageConfig.Languages.values())
            ),

            RootNode(
                    "specific.preferences.graphics.graphics",
                    SelectNode<Graphics.DisplayMode>(GraphicalConfig, "displayMode", "specific.preferences.graphics.displayMode", *GraphicalConfig.getDisplayModes() + GraphicalConfig.displayMode),
                    //TODO SelectNode(GraphicalConfig, "scalingMode", "specific.preferences.graphics.scalingMode", *GraphicalConfig.getScalingModes()),
                    CheckboxNode(GraphicalConfig, "fullscreen", "specific.preferences.graphics.fullscreen"),
                    ScriptNode("specific.preferences.graphics.frustum") { GraphicalConfig.callibrateCullingFrustum(this) }
            ),

            RootNode(
                    "generic.sound.sound",
                    RootNode(
                        "generic.sound.volume",
                            SliderNode<Float>(AudioController, "musicVolume", "generic.sound.musicVolume", 0f, 1f, 0.1f),
                            SliderNode<Float>(AudioController, "SFXVolume", "generic.sound.sfxVolume", 0f, 1f, 0.1f), // TODO audio controller channel need updating. this isn't for buttons.
                            CheckboxNode(AudioController, "isMuted", "generic.sound.mute"),
                    ),
            ),
            RootNode(
                "specific.preferences.misc",
                RootNode(
                    "!specific.preferences.tooltip.tooltip",
                    SliderNode<Float>(LanguageConfig, "ttInitialTime", "specific.preferences.tooltip.initial", 0f, 5f, 0.5f),
                    SliderNode<Float>(LanguageConfig, "ttSubsequentTime", "specific.preferences.tooltip.subsequent", 0f, 5f, 0.1f),
                    SliderNode<Float>(LanguageConfig, "ttResetTime", "specific.preferences.tooltip.reset", 0f, 5f, 0.1f),
            )




                //,
//
//                    RootNode(
//                        "specific.windows.music.spotify",
//                            ScriptNode("specific.windows.music.connect") {  }
//                    )
            )

        ).forEach { t.add(it) }
        t.addListener(LambdaClickListener {pack()})
        expandfill(
                add(t)
                .minHeight(200f)
                .minWidth(300f)
        )
        pack()
    }
}

