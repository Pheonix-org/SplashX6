package com.shinkson47.SplashX6.rendering.windows.gameutils;

import com.shinkson47.SplashX6.audio.AudioController;
import com.shinkson47.SplashX6.rendering.StageWindow;
import xmlwise.XmlParseException;
import java.io.IOException;

// TODO - Display the currently playing track title, UI modifications
/**
 * <h1> Window for in-game music UI </h1>
 * @author Dylan Brand
 */
public class music extends StageWindow {

    // Constructors
    public music() throws XmlParseException, IOException {
        super("Music");
        constructContent();
        setSize(this.getMinWidth(), this.getMinHeight()); //500f);
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
        addButton("pauseSong", e -> AudioController.pauseMusic());
        addButton("resumeSong", e -> AudioController.resumeMusic());

        hsep().pad(20f);

        addButton("skipSong", e -> AudioController.nextSong());
        addButton("previousSong", e -> AudioController.previousSong()); // CHANGE
        addButton("resetPlaylist", e -> AudioController.resetPlaylist());

        setResizable(false);
    }
}