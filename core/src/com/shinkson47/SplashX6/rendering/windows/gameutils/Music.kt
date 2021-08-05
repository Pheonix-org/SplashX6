package com.shinkson47.SplashX6.rendering.windows.gameutils

import com.badlogic.gdx.scenes.scene2d.InputEvent
import com.badlogic.gdx.scenes.scene2d.ui.Label
import com.shinkson47.SplashX6.audio.AudioController
import com.shinkson47.SplashX6.rendering.StageWindow
import com.shinkson47.SplashX6.utility.Assets

// TODO - Display the currently playing track title, UI modifications
/**
 * # Window for in-game music UI
 * @author Dylan Brand
 */
class Music : StageWindow("Music") {
    // Methods
    /**
     * Constructs the content that is to be displayed in the music window.
     */
    override fun constructContent() {
        if (FIRST_CONSTRUCTION) return
        top()

        // Information displayed to the user
        val info = Label("To control Spotify, please visit preferences.", Assets.SKIN)
        this.add(info).center()

        hsep().pad(20f)

        addButton("pauseSong") { e: InputEvent? -> AudioController.pauseMusic() }
        tooltip("ttPause")

        addButton("resumeSong") { e: InputEvent? -> AudioController.resumeMusic() }
        tooltip("ttResume")

        hsep().pad(20f)

        addButton("skipSong") { e: InputEvent? -> AudioController.nextSong() }
        tooltip("ttSkip")

        addButton("previousSong") { e: InputEvent? -> AudioController.previousSong() }
        tooltip("ttPrevious")

        addButton("resetPlaylist") { e: InputEvent? -> AudioController.resetPlaylist() }
        tooltip("ttReset")

        isResizable = false
    }

    // Constructors
    init {
        constructContent()
        setSize(this.minWidth, this.minHeight)
    }
}