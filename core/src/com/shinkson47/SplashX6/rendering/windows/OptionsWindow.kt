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
import com.shinkson47.SplashX6.utility.GraphicalConfig
import com.shinkson47.SplashX6.utility.Languages
import com.shinkson47.SplashX6.utility.Utility.local
import java.lang.Exception
import java.util.function.Consumer

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
                            SliderNode<Float>(AudioController, "buttonVolume", "generic.sound.sfxVolume", 0f, 1f, 0.1f), // TODO audio controller channel need updating. this isn't for buttons.
                            CheckboxNode(AudioController, "isMuted", "generic.sound.mute"),
                    ),

                    RootNode(
                        "specific.windows.music.spotify",
                            ScriptNode("specific.windows.music.connect") { spotifyConnect() }
                    )
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


    //=========================
    //#region scripts
    // I didn't want long scripts disrupting the nice and neat tree definition code above,
    // so i moved them here.
    //=========================

    private fun spotifyConnect() {
        Gdx.graphics.setWindowedMode(Gdx.graphics.displayMode.width, Gdx.graphics.displayMode.height)
        if (Spotify.create()) // TODO this needs to be localised.
            dialog("", "specific.windows.music.alreadyConnected", "", "", null)
        else {
            //TODO textbox is a bit wonky, and text is invisible.
            val textbox = TextArea(local("specific.windows.music.pasteCode"), SKIN)

            dialog(
                "!Connect to spotify", "A browser should've opened." +
                        "\n Authorize with spotify, then paste the code in the box" +
                        "\n and click 'Authenticate'.", "", "",
                {
                    try {
                        if (Spotify.create(textbox.text))
                            dialog("generic.any.success", "")
                    } catch (e : Exception) {
                        dialog("!Spotify Connection Error", "${Spotify.ERROR?.message}" )
                    }
                },
                        textbox
            )
        }
    }
}

