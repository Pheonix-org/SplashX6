package com.shinkson47.SplashX6.audio

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.assets.loaders.TextureLoader
import com.badlogic.gdx.graphics.Pixmap
import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.scenes.scene2d.ui.Image
import com.badlogic.gdx.scenes.scene2d.ui.TextField
import com.badlogic.gdx.scenes.scene2d.utils.Drawable
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable
import com.shinkson47.SplashX6.rendering.StageWindow
import com.shinkson47.SplashX6.utility.Assets.SKIN
import com.wrapper.spotify.model_objects.miscellaneous.CurrentlyPlaying
import com.wrapper.spotify.model_objects.specification.Track
import java.net.URL
import javax.imageio.ImageIO

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
        addButton("Pause")       { Spotify.pause() }
        addButton("Play")        { Spotify.play() }
        addButton("Next")        { Spotify.next() }
        addButton("Previous")    { Spotify.previous() }
        addButton("Seek to 10s") { Spotify.seek(10000) }
        addButton("Repeat track"){ Spotify.repeatMode(Spotify.RepeatModes.track) }
        addButton("Volume 10%")  { Spotify.setVolume(10) }
        addButton("Shuffle on")  { Spotify.setShuffle(true) }

        var c : CurrentlyPlaying? = null
        val image = Image()


        addButton("Fetch Art")  {
            c = Spotify.nowPlaying()

            // Turn art into drawable texture
            Pixmap.downloadFromUrl((c!!.item as Track).album.images[1].url, object : Pixmap.DownloadPixmapResponseListener {
                /**
                 * Called on the render thread when image was downloaded successfully.
                 * @param pixmap
                 */
                override fun downloadComplete(pixmap: Pixmap?) {
                    image.drawable = TextureRegionDrawable(Texture(pixmap))
                    image.pack()
                    image.setSize(image.drawable.minWidth, image.drawable.minHeight)
                    pack()
                }

                /**
                 * Called when image download failed. This might get called on a background thread.
                 */
                override fun downloadFailed(t: Throwable?) {
                    return;
                }
            })

        }

        add(image).row()
    }
}