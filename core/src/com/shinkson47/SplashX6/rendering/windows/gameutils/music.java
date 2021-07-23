package com.shinkson47.SplashX6.rendering.windows.gameutils;

import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.shinkson47.SplashX6.audio.AudioController;
import com.shinkson47.SplashX6.rendering.StageWindow;
import com.shinkson47.SplashX6.utility.Assets;
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
        setSize(this.getMinWidth(), this.getMinHeight());
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

        // Information displayed to the user
        Label info = new Label("To play audio via Spotify, please visit preferences.", Assets.SKIN);
        this.add(info);

        hsep().pad(20f);

        addButton("pauseSong", e -> AudioController.pauseMusic());
        tooltip("ttPause");

        addButton("resumeSong", e -> AudioController.resumeMusic());
        tooltip("ttResume");

        hsep().pad(20f);

        addButton("skipSong", e -> AudioController.nextSong());
        tooltip("ttSkip");

        addButton("previousSong", e -> AudioController.previousSong());
        tooltip("ttPrevious");

        addButton("resetPlaylist", e -> AudioController.resetPlaylist());
        tooltip("ttReset");

        setResizable(false);
    }
}