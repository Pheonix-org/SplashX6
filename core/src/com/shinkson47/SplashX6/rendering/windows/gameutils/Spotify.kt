package com.shinkson47.SplashX6.rendering.windows.gameutils

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.graphics.Pixmap
import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.scenes.scene2d.ui.*
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable
import com.badlogic.gdx.utils.Align
import com.badlogic.gdx.utils.Scaling
import com.shinkson47.SplashX6.audio.Spotify
import com.shinkson47.SplashX6.audio.SpotifySourceType
import com.shinkson47.SplashX6.rendering.StageWindow
import com.shinkson47.SplashX6.utility.Assets
import com.shinkson47.SplashX6.utility.Utility
import com.wrapper.spotify.model_objects.miscellaneous.CurrentlyPlayingContext
import com.wrapper.spotify.model_objects.specification.Track

/**
 * # GUI front end for [Spotify]
 * @author [Jordan T. Gray](https://www.shinkson47.in) on 16/06/2021
 * @since PRE-ALPHA 0.0.2
 * @version 1
 */
class Spotify : StageWindow("Spotify") {

    lateinit var typeSelectBox       : SelectBox<SpotifySourceType>
    lateinit var contentSelectBox    : SelectBox<String>
    lateinit var songLabel           : Label
    lateinit var seekSlider          : Slider
    lateinit var volumeSlider          : Slider
    lateinit var albumArt            : Image
    var playbackState : CurrentlyPlayingContext? = null

    init {
        Spotify.create()
    }


    /**
     * <h2>Constructs the content to be displayed in this window</h2>
     */
    override fun constructContent() {
        typeSelectBox       = SelectBox<SpotifySourceType>(Assets.SKIN)
        contentSelectBox    = SelectBox<String>(Assets.SKIN)
        seekSlider          = Slider(0f,100f, 1f, false, Assets.SKIN)
        volumeSlider        = Slider(0f,100f, 1f, false, Assets.SKIN)
        albumArt            = Image()
        albumArt.setScaling(Scaling.fit)



        span(add(albumArt))
            .height(512f)
            .width(512f)
            .center()
            .padRight(getColumnMinWidth(0))
            .row()

        songLabel = label("").actor
        songLabel.setAlignment(Align.center)
        songLabel.setText("Song Name")
        span(getCell(songLabel))
            .fillX()
            .expandX()
            .center()
            .row()

        add(button("<") { Spotify.previous(); update() })
            .width(50f)
            .fillX()
            .expandX()
            .center()


        add(button("|| / >") {
            if (playbackState?.is_playing == true) {
                Spotify.pause()
            } else
                Spotify.play()

            update()
        })
            .width(200f)
            .fillX()
            .expandX()
            .center()

        add(button(">") { Spotify.next(); update() })
            .width(50f)
            .fillX()
            .expandX()
            .center()
            .row()

        val labelCell : Cell<Label> = label("volume")
        span(labelCell).center().row()
        labelCell.actor.setAlignment(Align.center)

        span(add(volumeSlider))
            .right()
            .row()
        volumeSlider.addListener(LambdaChangeListener {
            if (volumeSlider.isDragging) return@LambdaChangeListener
            Spotify.setVolume(volumeSlider.value.toInt())
            //update() Causes behaviour to look laggy.
        })

        // TODO change max with song
//        seekSlider.addListener(LambdaChangeListener {
//            if (seekSlider.isDragging) return@LambdaChangeListener
//            nowPlaying ?: return@LambdaChangeListener
//            Spotify.seek((seekSlider.value).toInt())
//            update()
//        })
//
//        span(add(seekSlider))
//            .row()

        seperate("yourLibrary")

        typeSelectBox.items = Utility.CollectionToGDXArray(SpotifySourceType.values().asIterable())
        typeSelectBox.addListener(LambdaChangeListener { updateContentSelect() })
        label("sourceType")
        span(add(typeSelectBox))
            .height(30f)
            .width(500f)
            .right()
            .row()

        contentSelectBox.addListener(LambdaChangeListener { updateSource() })
        label("Source")
        span(add(contentSelectBox))
            .height(30f)
            .width(500f)
            .right()
            .row()

    }

    override fun toggleShown() {
        super.toggleShown()

        update()
    }

    private fun update() {
        playbackState = Spotify.info() ?: return    // Fetch the current state of playback.

        Spotify.disable()                           // Prevent change events from causing api events.

        showAlbumArt(playbackState!!)               // Show art and title
        songLabel.setText(playbackState!!.item.name)

//        with (seekSlider) {                         // Show position
//                value = playbackState!!.progress_ms.toFloat()
//                setRange(0f, playbackState!!.item.durationMs.toFloat())
//        }

        if (playbackState!!.context != null)
            typeSelectBox.selected = SpotifySourceType.valueOf(playbackState?.context?.type.toString().lowercase())

        volumeSlider.value = playbackState!!.device?.volume_percent!!.toFloat()

        Spotify.enable()
    }

    private fun showAlbumArt(np : CurrentlyPlayingContext){
        try {
            // Turn art into drawable texture
            Pixmap.downloadFromUrl(
                (np.item as Track).album.images[0].url,
                object : Pixmap.DownloadPixmapResponseListener {
                    /**
                     * Called on the render thread when image was downloaded successfully.
                     * @param pixmap
                     */
                    override fun downloadComplete(pixmap: Pixmap?) {
                        with(albumArt) {
                            drawable = TextureRegionDrawable(Texture(pixmap))
                        }
                    }


                    override fun downloadFailed(t: Throwable?) {
                        albumArt.drawable = null
                    }
                })

        } catch (e : Exception) {
            e.printStackTrace() // TODO merge to spotify error handler when implemented.
        }
    }

    private fun updateContentSelect() {
        when (typeSelectBox.selected) {
            SpotifySourceType.playlist -> contentSelectBox.setItems(Spotify.cache_GdxPlaylists)
            SpotifySourceType.artist   -> contentSelectBox.setItems(Spotify.cache_GdxArtists)
            SpotifySourceType.album    -> contentSelectBox.setItems(Spotify.cache_GdxAlbums)
            null                        -> contentSelectBox.clear()
        }
    }

    // TODO i hate this repetition, but i don't seem to be able to abstract it :(
    private fun updateSource() {
        when (typeSelectBox.selected) {
            SpotifySourceType.playlist -> {                        // We need to find the selected playlist and play it using it's uri :
                Spotify.cache_Playlists!!.items.forEach {             // For every playlist
                    if (it.name == contentSelectBox.selected) {     // If it's the selected playlist
                        Spotify.play(it.uri)                        // Play it.
                        update()
                        return@forEach
                    }}}


            SpotifySourceType.artist   -> {
                Spotify.cache_Artists!!.items.forEach {
                    if (it.name == contentSelectBox.selected) {
                        Spotify.play(it.uri)
                        update()
                        return@forEach
                    }}}


            SpotifySourceType.album    -> {
                Spotify.cache_Albums!!.items.forEach {
                    if (it.album.name == contentSelectBox.selected) {
                        Spotify.play(it.album.uri)
                        update()
                        return@forEach
                    }}}
            null                        -> return
        }
    }


    val seekRunnable = Runnable {
            playbackState ?: return@Runnable

            if (playbackState!!.is_playing) seekSlider.value += last - System.currentTimeMillis()

            last = System.currentTimeMillis()
            repost()
        }

    private fun repost() {
        Gdx.app.postRunnable(this.seekRunnable)
    }

    private var last = System.currentTimeMillis()
    init { repost() }

}