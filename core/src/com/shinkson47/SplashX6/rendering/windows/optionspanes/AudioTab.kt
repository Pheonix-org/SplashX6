package com.shinkson47.SplashX6.rendering.windows.optionspanes

import com.badlogic.gdx.scenes.scene2d.ui.Slider
import com.badlogic.gdx.scenes.scene2d.ui.Table
import com.shinkson47.SplashX6.game.AudioController
import com.shinkson47.SplashX6.rendering.StageWindow
import com.shinkson47.SplashX6.rendering.StageWindow.LambdaClickListener
import com.shinkson47.SplashX6.utility.Assets


class AudioTab : Table() {

    init {
        // SLIDER FOR MUSIC VOLUME CONTROL
        val musicSlider = Slider(0.0f, 1.0f, 0.1f, false, Assets.SKIN)
        musicSlider.value = AudioController.getMusicVolume()

        // SLIDER FOR GAME VOLUME CONTROL
        val gameSlider = Slider(0.0f, 1.0f, 0.1f, false, Assets.SKIN)
        gameSlider.value = AudioController.getSFXVolume()

        // CHECKBOX FOR MUTE
        val muteCheck = StageWindow.checkBox("mute", this)
        muteCheck.isChecked = AudioController.isMuted()


        // EVENTS
        musicSlider.addListener(StageWindow.LambdaChangeListener {
                AudioController.playButtonSound() // TODO this shouldn't be here.
                AudioController.setMusicVolume(musicSlider.value)
        })

        gameSlider.addListener(StageWindow.LambdaChangeListener {
                AudioController.playButtonSound() // TODO this shouldn't be here.
                AudioController.setSFXVolume(gameSlider.value)
            })

        muteCheck.addListener(LambdaClickListener {
            AudioController.setMute(muteCheck.isChecked)
        })


        // CONSTRUCT FRONT END
        clear();row()
        StageWindow.label("musicVolume", this)

        add(musicSlider)
            .padTop(20f)
            .row()

        StageWindow.label("sfxVolume", this)

        add(gameSlider)
            .padTop(20f)
            .row()

        add(muteCheck)
            .colspan(2)
    }
}