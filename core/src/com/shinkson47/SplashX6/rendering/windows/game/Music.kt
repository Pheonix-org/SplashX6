package com.shinkson47.SplashX6.rendering.windows.game

import com.badlogic.gdx.scenes.scene2d.ui.Label
import com.shinkson47.SplashX6.audio.AudioController
import com.shinkson47.SplashX6.rendering.StageWindow
import com.shinkson47.SplashX6.utility.Assets

// TODO - Display the currently playing track title, UI modifications
/**
 * # Window for in-game music UI
 * @author Jordan Gray
 */
class Music : StageWindow("Music") {

    init {
        span(add(
                Label("You can also control spotify!", Assets.SKIN)
        ).fillX().center())

        hsep()

        addButton("pauseSong", false){  AudioController.pauseMusic() }.pack()
        tooltip("ttPause")

        addButton("generic.sound.resume") { AudioController.resumeMusic() }
        tooltip("ttResume")

        hsep()

        addButton("skipSong",false) { AudioController.nextSong() }
        tooltip("ttSkip")

        addButton("previousSong", false) {  AudioController.previousSong() }
        tooltip("ttPrevious")

        row()

        addButton("specific.windows.music.resetPlaylist") { AudioController.resetPlaylist() }
        tooltip("ttReset")
        updateColSpans()
    }
}