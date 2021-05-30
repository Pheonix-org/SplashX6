package com.shinkson47.SplashX6.rendering.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.ui.*;
import com.badlogic.gdx.scenes.scene2d.utils.ChangeListener;
import com.shinkson47.SplashX6.Client;
import com.shinkson47.SplashX6.game.AudioController;
import com.shinkson47.SplashX6.game.GameHypervisor;
import com.shinkson47.SplashX6.rendering.Camera;
import com.shinkson47.SplashX6.rendering.StageWindow;
import com.shinkson47.SplashX6.utility.Assets;
import com.shinkson47.SplashX6.utility.Languages;

import java.util.ArrayList;
import java.util.List;

import static com.shinkson47.SplashX6.utility.APICondition.*;
import static com.shinkson47.SplashX6.utility.Assets.*;

/**
 * <h1></h1>
 * <br>
 * <p>
 *
 * </p>
 *
 * @author <a href="https://www.shinkson47.in">Jordan T. Gray on 26/04/2021</a>
 * @version 1
 * @since v1
 */
public class OptionsScreen extends StageWindow {

    // TODO - TEST
    //private Slider musicSlider = new Slider(0.0f, 1.0f, 0.1f, false, Assets.SKIN);
    //=====================================================================
    //#region constants
    //#endregion constants
    //=====================================================================

    /**
     * Tab windows
     */
    private final Table GAME_OPTION_TAB, GRAPHICS_OPTION_TAB, SOUND_OPTION_TAB, ADVANCED_OPTION_TAB;

    /**
     * util window used to alter the width of the camera's frustum
     */
    private final StageWindow frustCallib = new StageWindow("Culling frustum calabration") {

        {
            setVisible(false);
            setResizable(false);
        }

        @Override
        public void toggleShown() {
            if (!GameHypervisor.getInGame()) {
                OptionsScreen.this.dialog("Oops", "Frustrum changes can only be made whilst in-game.");
                setVisible(false);
                return;
            }

            GameHypervisor.getGameRenderer().getCam().deltaZoom(10000f);
            OptionsScreen.this.getStage().addActor(this);
            toggleAll();
        }

        private void toggleAll(){
            super.toggleShown();
            OptionsScreen.this.toggleShown();

            // TODO enable / disable in-game mouse controls
        }

        /**
         * <h2>Constructs the content to be displayed in this window</h2>
         */
        @Override
        protected void constructContent() {
            add(new Label("For when the rendered world does not fit the screen.", Assets.SKIN)).row();

            hsep().padTop(50);

            add(new Label("Use the slider to adjust until no void is visible at\n" +
                                "edges of screen. Test zoomed out, and dragging around.", Assets.SKIN)).row();

            add(new Label("DO NOT extend further than nesacerry, \n" +
                                "as this will greatly effect cpu usage.", Assets.SKIN, "optional")).pad(20).row();

            hsep().padTop(50);

            Label l = new Label("", Assets.SKIN);
            final Slider slider = new Slider(-2500f, 2500f, 0.1f, false, Assets.SKIN);
            slider.addListener(event -> {l.setText(slider.getValue() + "");
                Camera.Companion.setFRUSTRUM_WIDTH_MOD(slider.getValue());
                return true;
            });
            add(slider).growX().row();
            add(l).row();
            add(button("Done!", o -> toggleAll())).padTop(20);
        }
    };

    private static Cell contentCell = null;

    //=====================================================================
    //#region fields
    //#endregion fields
    //=====================================================================


    //=====================================================================
    //#region constructors
    //#endregion constructors
    //=====================================================================

    public OptionsScreen() {
        super("OPTIONS");

        ArrayList<String> languagesString = new ArrayList<>();
        Assets.languages.forEach(n -> languagesString.add(n.getDisplayName()));

        String currentLanguage = LANG.getLocale().getDisplayName();

        SelectBox<String> languageList = new SelectBox<String>(Assets.SKIN);
        languageList.setItems(languagesString.toArray(new String[0]));
        languageList.setSelected(currentLanguage);

        languageList.addListener(new ChangeListener() {
            Boolean ignoreChanged = false;

            @Override
            public void changed(ChangeEvent event, Actor actor) {
                if (ignoreChanged) {
                    ignoreChanged = false;
                    return;
                }

                if (languageList.getSelected().equals(currentLanguage))
                    return;

                if (invalidCall(REQ_MAIN_MENU, WARN("Language can only be changed in the main menu", languageList))) {
                    resetDefault();
                    return;
                }

                dialog("Confirm language", "Change to " + languageList.getSelected(), "Yes", "No",
                        e -> {
                            Gdx.app.log("you've clicked", e.toString());
                    if (e) {
                        loadLanguage(Languages.values()[languageList.getSelectedIndex()]);
                        Client.client.setScreen(new MainMenu()); // TODO - TEMPORARY FOR DEVELOPMENT
                    } else {
                        //TODO this triggers the changed event
                        resetDefault();
                    }
                });
            }

            private void resetDefault() {
                ignoreChanged = true;
                languageList.setSelected(currentLanguage);
            }
        });

        // SLIDER FOR MUSIC VOLUME CONTROL
        Slider musicSlider = new Slider(0.0f, 1.0f, 0.1f, false, Assets.SKIN);
        musicSlider.setValue(AudioController.getMusicVolume());

        musicSlider.addListener(new ChangeListener() {
            @Override
            public void changed(ChangeEvent event, Actor actor) {
                AudioController.playButtonSound();
                AudioController.setMusicVolume(musicSlider.getValue());
            }
        });

        // SLIDER FOR GAME VOLUME CONTROL
        Slider gameSlider = new Slider(0.0f, 1.0f, 0.1f, false, Assets.SKIN);
        gameSlider.setValue(AudioController.getSFXVolume());

        gameSlider.addListener(new ChangeListener() {
            @Override
            public void changed(ChangeEvent event, Actor actor) {
                AudioController.playButtonSound();
                AudioController.setSFXVolume(gameSlider.getValue());
            }
        });

//        // TODO - Implement locale for different languages
//        Button mute = new Button("Mute") {
//            AudioController.playButtonSound();
//
//        };

        //language.setMaxListCount(3);
        GAME_OPTION_TAB = new Table();
        GAME_OPTION_TAB.add(new Label("Select a Language:", Assets.SKIN)).padRight(20).left();
        GAME_OPTION_TAB.add(languageList);

        GRAPHICS_OPTION_TAB = new Table();
        GRAPHICS_OPTION_TAB.add(new Label("Graphics options will be built here", Assets.SKIN));

        SOUND_OPTION_TAB = new Table();
        SOUND_OPTION_TAB.add(new Label("Music Volume: ", Assets.SKIN));
        SOUND_OPTION_TAB.add(musicSlider).row();
        SOUND_OPTION_TAB.add(new Label("SFX Volume: ", Assets.SKIN)).padTop(20.0f);
        SOUND_OPTION_TAB.add(gameSlider).padTop(20.0f).row();
        SOUND_OPTION_TAB.add(button("Mute", o -> AudioController.muteAudio())).padTop(20.0f);
        SOUND_OPTION_TAB.add(button("Un-Mute", o -> AudioController.unmuteAudio())).padTop(20.0f);

        ADVANCED_OPTION_TAB = new Table();
        ADVANCED_OPTION_TAB.add(button("Calibrate Culling Frustrum", o -> frustCallib.toggleShown())).row();

        ADVANCED_OPTION_TAB.add(button("Invalid API call (crash)", o ->
                validateCall(REQ_GAME_LOADING, THROW("Test api exception.")))).row();

        ADVANCED_OPTION_TAB.add(button("Invalid API call (warn and ignore)", o -> {
            if (
                    invalidCall(REQ_GAME_LOADING, WARN("You can't do that.", this))
            ) return;
        })).row();

        constructContent();
    }

    /**
     * <h2>Constructs the content to be displayed in this window</h2>
     */
    @Override
    protected void constructContent() {
        if (FIRST_CONSTRUCTION) return;
        contentCell = add();

        tabs(
                contentCell,

                List.of(
                    GAME_OPTION_TAB,
                    SOUND_OPTION_TAB,
                    GRAPHICS_OPTION_TAB,
                    ADVANCED_OPTION_TAB
                ),

                List.of(
                     "Game",
                     "Sound",
                     "Graphics",
                     "Advanced"
                )
        );
        setSize(700, 500);
        //setFillParent(true);
    }
}
