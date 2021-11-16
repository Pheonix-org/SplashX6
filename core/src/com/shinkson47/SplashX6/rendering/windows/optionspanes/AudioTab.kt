package com.shinkson47.SplashX6.rendering.windows.optionspanes

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.scenes.scene2d.ui.*
import com.shinkson47.SplashX6.audio.AudioController
import com.shinkson47.SplashX6.audio.Spotify
import com.shinkson47.SplashX6.game.GameHypervisor
import com.shinkson47.SplashX6.rendering.StageWindow
import com.shinkson47.SplashX6.rendering.StageWindow.LambdaClickListener
import com.shinkson47.SplashX6.rendering.StageWindow.seperate
import com.shinkson47.SplashX6.rendering.windows.GameWindowManager
import com.shinkson47.SplashX6.utility.Assets
import com.shinkson47.SplashX6.utility.Utility.local


class AudioTab() : Table() {

    init {
        // SLIDER FOR MUSIC VOLUME CONTROL
        val musicSlider = Slider(0.0f, 1.0f, 0.1f, false, Assets.SKIN)
        musicSlider.value = AudioController.musicVolume

        // SLIDER FOR GAME VOLUME CONTROL
        val gameSlider = Slider(0.0f, 1.0f, 0.1f, false, Assets.SKIN)
        gameSlider.value = AudioController.musicVolume

        // CHECKBOX FOR MUTE
        val muteCheck = StageWindow.checkBox("mute", this)
        muteCheck.isChecked = AudioController.isMuted


        // EVENTS
        musicSlider.addListener(StageWindow.LambdaChangeListener {
                AudioController.playButtonSound() // TODO this shouldn't be here.
                AudioController.musicVolume = musicSlider.value
        })

        gameSlider.addListener(StageWindow.LambdaChangeListener {
                AudioController.playButtonSound() // TODO this shouldn't be here.
                AudioController.buttonVolume = gameSlider.value
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
            .row()



        // SPOTIFY CONFIG

        seperate(this, "spotify")

        val btnConnectToSpotify = TextButton(local("spotifyConnect"), Assets.SKIN)
        btnConnectToSpotify.addListener(LambdaClickListener{
            Gdx.graphics.setWindowedMode(Gdx.graphics.displayMode.width, Gdx.graphics.displayMode.height)
            if (Spotify.create()) // TODO this needs to be localised.
                StageWindow.dialog(this, "", "Already connected!", "", "", null)
            else // TODO localisation
                StageWindow.dialog(this, "Connect to spotify", "A browser should've opened." +
                        "\n Authorize with spotify, then paste the code in the box" +
                        "\n and click 'Authenticate'.", "", "", null)
        })

        val authArea = TextField("", Assets.SKIN)
        authArea.messageText = local("spotifyPaste")

        val btnAuthenticate = TextButton(local("spotifyAuthenticate"), Assets.SKIN)
        btnAuthenticate.addListener(LambdaClickListener{
            if (Spotify.create(authArea.text) && GameHypervisor.inGame)
                StageWindow.post(com.shinkson47.SplashX6.rendering.windows.game.Spotify())
        })

        //TODO i hate this repetition. Some kind of preferences utilities?
        add (btnConnectToSpotify)
            .colspan(2)
            .row()

        add ( authArea )
            .colspan(2)
            .width(500f)
            .row()

        add (btnAuthenticate)
            .colspan(2)
            .row()
    }
}