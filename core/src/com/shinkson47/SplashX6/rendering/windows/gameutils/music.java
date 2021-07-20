package com.shinkson47.SplashX6.rendering.windows.gameutils;

import com.shinkson47.SplashX6.audio.AudioController;
import com.shinkson47.SplashX6.rendering.StageWindow;
import xmlwise.XmlParseException;
import java.io.IOException;

// TODO - Display the currently playing track title, UI modifications, AUTOPLAY when track is complete
/**
 * <h1> Window for in-game music UI </h1>
 * @author Dylan Brand
 */
public class music extends StageWindow {

    // Fields


    // Constructors
    public music() throws XmlParseException, IOException {
        super("Music");
        constructContent();
        setSize(this.getMinWidth(), 400f);
    }

    // Methods
    /**
     * Constructs the content that is to be displayed in the music window.
     */
    @Override
    protected void constructContent() {
        if (FIRST_CONSTRUCTION)
            return;

        top();

        // Button controls - may be changed/altered in later development
        addButton("pauseSong", e -> AudioController.pauseMusic());//.pad(20f);
        addButton("resumeSong", e -> AudioController.resumeMusic());//.padBottom(40f);

        hsep().pad(20f);

        addButton("skipSong", e -> AudioController.nextSong());//.//padTop(40f);
        addButton("resetPlaylist", e -> AudioController.resetPlaylist());//.pad(20f);

        //setSize(500, 1000);
        setResizable(false);
    }
}


