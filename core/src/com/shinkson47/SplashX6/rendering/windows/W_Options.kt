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

import com.badlogic.gdx.Audio
import com.badlogic.gdx.Gdx
import com.badlogic.gdx.Graphics
import com.badlogic.gdx.scenes.scene2d.ui.TextArea
import com.badlogic.gdx.scenes.scene2d.ui.Tree
import com.shinkson47.SplashX6.audio.AudioController
import com.shinkson47.SplashX6.audio.Spotify
import com.shinkson47.SplashX6.rendering.ScalingScreenAdapter
import com.shinkson47.SplashX6.rendering.StageWindow
import com.shinkson47.SplashX6.rendering.windows.optionspanes.LanguageSelectionListener
import com.shinkson47.SplashX6.utility.Assets.SKIN
import com.shinkson47.SplashX6.utility.Assets.SKIN_KENNEY
import com.shinkson47.SplashX6.utility.GraphicalConfig
import com.shinkson47.SplashX6.utility.Languages
import com.shinkson47.SplashX6.utility.Utility.local
import com.shinkson47.SplashX6.utility.UtilityK
import java.awt.Toolkit
import java.awt.datatransfer.DataFlavor
import java.lang.Exception
import java.util.function.Consumer

/**
 * # A collection of tabs that provide configurable options to the user.
 * @author [Jordan T. Gray](https://www.shinkson47.in) on 09/06/2021
 * @since PRE-ALPHA
 * @version 2
 */
class W_Options(val parent : ScalingScreenAdapter) : StageWindow("generic.any.options") {

    init {
        val t : Tree<Tree.Node<*, *, *>, Any> = Tree(SKIN)
        t.selection.isDisabled = true
        t.indentSpacing = 30f


        arrayOf(
            RootNode(
                    "generic.any.general",
                    SelectNode(LanguageSelectionListener, "locale", "specific.preferences.general.selectLanguage", *Languages.values())
            ),

            RootNode(
                    "specific.preferences.graphics.graphics",
                    SelectNode<Graphics.DisplayMode>(GraphicalConfig, "displayMode", "specific.preferences.graphics.displayMode", *GraphicalConfig.getDisplayModes() + GraphicalConfig.displayMode),
                    SelectNode(GraphicalConfig, "scalingMode", "specific.preferences.graphics.scalingMode", *GraphicalConfig.getScalingModes()),
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
                    SliderNode<Float>(UtilityK::class.objectInstance!!, "ttInitialTime", "specific.preferences.tooltip.initial", 0f, 5f, 0.5f),
                    SliderNode<Float>(UtilityK, "ttSubsequentTime", "specific.preferences.tooltip.subsequent", 0f, 5f, 0.1f),
                    SliderNode<Float>(UtilityK, "ttResetTime", "specific.preferences.tooltip.reset", 0f, 5f, 0.1f),
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

