package com.shinkson47.SplashX6.rendering.windows.game

import com.badlogic.gdx.graphics.Pixmap
import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.scenes.scene2d.ui.*
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable
import com.badlogic.gdx.utils.Align
import com.badlogic.gdx.utils.Scaling
import com.shinkson47.SplashX6.audio.AudioController
import com.shinkson47.SplashX6.audio.Spotify
import com.shinkson47.SplashX6.audio.Spotify.SpotifySourceType
import com.shinkson47.SplashX6.game.GameHypervisor
import com.shinkson47.SplashX6.rendering.StageWindow
import com.shinkson47.SplashX6.utility.Assets
import com.shinkson47.SplashX6.utility.GraphicalConfig
import com.shinkson47.SplashX6.utility.Utility
import com.wrapper.spotify.model_objects.miscellaneous.CurrentlyPlayingContext
import com.wrapper.spotify.model_objects.specification.Track
import java.awt.Toolkit
import java.awt.datatransfer.DataFlavor

/**
 * # GUI front end for [Spotify]
 * @author [Jordan T. Gray](https://www.shinkson47.in) on 16/06/2021
 * @since PRE-ALPHA 0.0.2
 * @version 1
 */
class Spotify : StageWindow("specific.windows.music.spotify") {

    //#region UI elements
    var typeSelectBox       : SelectBox<SpotifySourceType>
    var contentSelectBox    : SelectBox<String>
    var songLabel           : Label
    var deviceLabel         : Label
    var seekSlider          : Slider
    var volumeSlider        : Slider
    var albumArt            : Image
    var playPause           : TextButton
    //#endregion





    /**
     * # Storage of the last known playback state.
     */
    var playbackState : CurrentlyPlayingContext? = null

    init {
        // Init alise objects
        typeSelectBox = SelectBox<SpotifySourceType>(Assets.SKIN)
        contentSelectBox = SelectBox<String>(Assets.SKIN)
        seekSlider = Slider(0f, 100f, 1f, false, Assets.SKIN)
        volumeSlider = Slider(0f, 100f, 1f, false, Assets.SKIN)
        albumArt = Image()
        albumArt.setScaling(Scaling.fit)

        typeSelectBox.items = Utility.CollectionToGDXArray(SpotifySourceType.values().asIterable())
        typeSelectBox.addListener(LambdaChangeListener { updateContentSelect() })
        label("specific.windows.music.sourceType")
        span(add(typeSelectBox))
            .height(30f)
            .width(500f)
            .right()
            .row()

        contentSelectBox.addListener(LambdaChangeListener { updateSource() })
        label("specific.windows.music.source")
        span(add(contentSelectBox))
            .height(30f)
            .width(500f)
            .right()
            .row()

        seperate("specific.windows.music.nowPlaying")

        deviceLabel = implSongLabelCreation()

        add(albumArt)
            .height(512f)
            .width(512f)
            .center()
            .colspan(3)
            .row()

        songLabel = implSongLabelCreation()


        val t = Table()
        t.add(button("meta.pseudographic.previous") { Spotify.previous(); })

        val buttonCell = t.add(button("meta.pseudographic.playPause") {
            if (playbackState?.is_playing == true) {
                Spotify.pause()
            } else
                Spotify.play()
        })

        playPause = buttonCell.actor

        t.add(button("meta.pseudographic.next") { Spotify.next(); update() })

        add(t).expandX().fillX().colspan(3).row()

        val labelCell: Cell<Label> = label("generic.sound.volume")

        labelCell.center().colspan(3).row()
        labelCell.actor.setAlignment(Align.center)

        add(volumeSlider)
            .colspan(3)
            .fillX()
            .expandX()
            .row()
        volumeSlider.addListener(LambdaChangeListener {
            if (volumeSlider.isDragging) return@LambdaChangeListener
            Spotify.setVolume(volumeSlider.value.toInt())
        })


        pack()
    }

    /**
     * # Primary update routine.
     * Fetches data from spotify and updates the ui to represent it.
     *
     * Also can change state of internal soundtrack depending in playstate of spotify.
     *
     * > API NOTE : When updating, [Spotify] is disabled to prevent false triggers
     * > whilst updating the ui. This may effect other async threads accessing [Spotify]
     */
    @Synchronized private fun update() {
        // Attempt to fetch the current state of playback.
        playbackState = Spotify.info()

        // If there was an issue with the api request
        if (Spotify.ERROR != null) {
            fail("Unable to talk to spotify.\n(${Spotify.ERROR!!.javaClass.simpleName}: ${Spotify.ERROR!!.message})")
            if (!Spotify.testConnection()) spotifyConnect()
            isVisible = false
            AudioController.resumeMusic()
            return;
        }

        // If the api request was made, but there's no playback info
        if (playbackState == null || playbackState!!.item == null) {
            fail("Start / Re-start spotify & play something.\n(Unable to fetch playback info)")
            AudioController.resumeMusic()
            return
        }

        // Alter state of internal playback, if needed.
        if (playbackState!!.is_playing && AudioController.nowPlaying.isPlaying)
            AudioController.pauseMusic()
        if (!playbackState!!.is_playing && !AudioController.nowPlaying.isPlaying)
            AudioController.resumeMusic()

        // Show correct volume.
        volumeSlider.value = playbackState!!.device?.volume_percent!!.toFloat()

        // Show correct symbol in play / pause button.
        playPause.setText(if (playbackState!!.is_playing) "||" else ">")

        // Prevent changes to the ui from causing api events.
        Spotify.disable()

        // Show art and title
        showAlbumArt(playbackState!!)
        songLabel.setText(playbackState!!.item.name)
        deviceLabel.setText("@ ${playbackState!!.device.name}")

        // Show correct playback context type.
        // NOTE : This has to be last cause of it's changed event.
        if (playbackState!!.context != null)
            typeSelectBox.selected = SpotifySourceType.valueOf(playbackState?.context?.type.toString().lowercase())

        // Re-enable spotify api requests.
        Spotify.enable()
    }

    private fun implSongLabelCreation(): Label {
        val x = label("")
            .fillX()
            .expandX()
            .center()
            .colspan(3)
            .actor
        x.setAlignment(Align.center)
        row()
        return x
    }

    /**
     * Fetches the album art of the currently playing song, and
     * displays it in [albumArt].
     */
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
                            albumArt.drawable = TextureRegionDrawable(Texture(pixmap))
                    }

                    override fun downloadFailed(t: Throwable?) {
                        albumArt.drawable = TextureRegionDrawable(Assets.spotifyFail)
                    }
                })

        } catch (e : Exception) {
            fail (e.message ?: "Something went wrong whilst getting the album art.")
            e.printStackTrace()
        }
    }


    /**
     * # Changes what context items are available after a change to the context type.
     *
     * Sub ran when the context type is changed by the user.
     *
     * Note that this triggers the change event of [contentSelectBox] that
     * causes the context to automatically be changed in [Spotify]
     */
    private fun updateContentSelect() {
        when (typeSelectBox.selected) {
            SpotifySourceType.playlist -> contentSelectBox.setItems(Spotify.cache_GdxPlaylists)
            SpotifySourceType.artist   -> contentSelectBox.setItems(Spotify.cache_GdxArtists)
            SpotifySourceType.album    -> contentSelectBox.setItems(Spotify.cache_GdxAlbums)
            null                        -> contentSelectBox.clear()
        }
    }


    /**
     * # Changes what context spotify is playing when the source list is changed.
     *
     * Ran when the context source box is change by the user or by [updateContentSelect].
     */
    // TODO i hate this repetition, but i don't seem to be able to abstract it :(
    private fun updateSource() {
        when (typeSelectBox.selected) {
            SpotifySourceType.playlist -> {                         // We need to find the selected playlist and play it using it's uri :
                Spotify.cache_Playlists!!.items.forEach {           // For every playlist
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


    /**
     * # 5 Second updater thread.
     * Remains open whilst in game, only created if spotify is available.
     *
     * Calls [update] syncronusly every five seconds or so.
     */
    val seekRunnable = object : Runnable {

        /**
         * Ignore this bullshit.
         *
         * Some kind of JVM threading bullshit
         * stops this thread from running
         * after a while without accessing
         * a syncronized method.
         *
         * Reckon it's to do with variable caching
         * but i don't really know. They're marked
         * volatile, but that made no difference.
         *
         * This seems to make all the difference, though.
         */
        @Synchronized fun sync() {}

        @Volatile var current = 0L
        @Volatile var last = System.currentTimeMillis()

        override fun run() {
            while (GameHypervisor.inGame) {
                sync()
                if (!isVisible) continue

                current = System.currentTimeMillis()
                if (current - last >= 3000) {
                    update()
                    last = current
                }

                if (Thread.currentThread().isInterrupted)
                    return
            }
        }
    }

    private val updaterThread = Thread(seekRunnable).apply { isDaemon = true }


    init {
        startUpdater()
    }

    private fun startUpdater() {
        if (updaterThread.isAlive) return
        try {
            updaterThread.start()
        } catch (ignored: Exception) {};
    }

    private fun stopUpdater() {
        if(!updaterThread.isAlive) return
        updaterThread.interrupt()
        updaterThread.stop()
    }

    /**
     * Shows [Assets.spotifyFail] and [text] to the user, indicating an issue with connection or playback.
     */
    private fun fail(text : String){
        songLabel.setText(text)
        albumArt.drawable = TextureRegionDrawable(Assets.spotifyFail)
        pack()
    }


    /**
     * Override that triggers an update when the window is shown
     * so that it is up-to-date when show to the user.
     */
    override fun toggleShown() {
        super.toggleShown()
        update()
    }

    private fun spotifyConnect() {
        GraphicalConfig.fullscreen = false
        if (Spotify.create()) // TODO this needs to be localised.
            dialog("", "specific.windows.music.alreadyConnected", "", "", null)
        else {

            dialog(
                "!Connect to spotify", "A browser should've opened." +
                        "\n Authorize with spotify, then paste the code in the box" +
                        "\n and click 'Ok'.", "", "",
                {
                    try {
                        if (Spotify.create(Toolkit.getDefaultToolkit().systemClipboard.getData(DataFlavor.stringFlavor) as String))
                            dialog("generic.any.success", "")
                    } catch (e : java.lang.Exception) {
                        dialog("!Spotify Connection Error", "${Spotify.ERROR?.message}" )
                    }
                }
            )
        }
    }

    /**
     * Initalises spotify api when this window is created
     * (Which is when the game is created) and dispatches the 5 second updater thread.
     */
    init {
        //Spotify.create();
        //Utility.DispatchDaemonThread("Spotify Update Thread", seekRunnable)
    }
}