package com.shinkson47.SplashX6.audio

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.scenes.scene2d.ui.TextField
import com.shinkson47.SplashX6.rendering.StageWindow
import com.shinkson47.SplashX6.utility.Assets.SKIN

/**
 * # TODO
 * @author [Jordan T. Gray](https://www.shinkson47.in) on 10/06/2021
 * @since v1
 * @version 1
 */
class SpotifyTestWindow : StageWindow() {

    override fun constructContent() {
        label("Step 1").row()

        addButton("Connect to spotify") {
            Gdx.graphics.setWindowedMode(Gdx.graphics.displayMode.width, Gdx.graphics.displayMode.height)
            Spotify.create()
        }

        label("Step 2").row()
        label("Paste authentication code").row()

        val authArea = TextField("Paste code here", SKIN);
        add ( authArea ).row()

        addButton("Authenticate") {
            //Gdx.graphics.setFullscreenMode(Gdx.graphics.displayMode)
            Spotify.create(authArea.text)
        }

        label("Step 3").row()
        label("Test API access").row()
        addButton("Pause") { Spotify.pause() }
        addButton("Play") { Spotify.play() }
    }
}