package com.shinkson47.SplashX6.rendering.windows.gameutils;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.scenes.scene2d.ui.Button;
import com.badlogic.gdx.scenes.scene2d.ui.SelectBox;
import com.badlogic.gdx.utils.Array;
import com.shinkson47.SplashX6.audio.AudioController;
import com.shinkson47.SplashX6.rendering.StageWindow;
import com.shinkson47.SplashX6.utility.Assets;
import com.shinkson47.SplashX6.utility.Utility;
import xmlwise.Plist;
import xmlwise.XmlParseException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class music extends StageWindow {

    // Fields
    Map<String, Object> tracks = Plist.fromXml(Gdx.files.internal("core/assets/audio/data/playlists.plist").readString());
    private Array<String> playlist = new Array<>();

    // Constructors
    public music() throws XmlParseException, IOException {
        super("Music");
        constructContent();
    }

    // Methods

    @Override
    protected void constructContent() {
        if (FIRST_CONSTRUCTION)
            return;

        top();

        // Displays the currently selected track
        label("playing").padTop(80);
        label("songTest").padTop(80).row();

        playlist.addAll(Utility.CollectionToGDXArray(((Map) tracks.get("playlist one")).values()));

        SelectBox pList = new SelectBox<String>(Assets.SKIN);
        pList.setItems(playlist);
        add(pList).width(400).colspan(2).padTop(20).row();

//        Button btnSkip = new Button();
//        btnSkip.setName("Skip");
//
//        add(btnSkip);

        // Button controls for track management (Current actioms are for development)
        addButton("skipTrack", e -> AudioController.muteAudio()).pad(20, 0, 20, 0);
        addButton("pauseTrack", e -> AudioController.pauseMusic());

    }
}


