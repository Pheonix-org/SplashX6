package com.shinkson47.SplashX6.rendering.windows;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.ui.*;
import com.badlogic.gdx.scenes.scene2d.utils.ChangeListener;
import com.shinkson47.SplashX6.Client;
import com.shinkson47.SplashX6.game.AudioController;
import com.shinkson47.SplashX6.game.GameHypervisor;
import com.shinkson47.SplashX6.rendering.Camera;
import com.shinkson47.SplashX6.rendering.StageWindow;
import com.shinkson47.SplashX6.rendering.screens.MainMenu;
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
public class OptionsWindow extends StageWindow {

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
                OptionsWindow.this.dialog("Oops", "Frustrum changes can only be made whilst in-game.");
                setVisible(false);
                return;
            }

            GameHypervisor.getGameRenderer().getCam().deltaZoom(10000f);
            OptionsWindow.this.getStage().addActor(this);
            toggleAll();
        }

        private void toggleAll(){
            super.toggleShown();
            OptionsWindow.this.toggleShown();

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
                                "as this will greatly effect cpu usage.", Assets.SKIN)).pad(20).row();

            hsep().padTop(50);

            Label l = new Label("", Assets.SKIN);
            final Slider slider = new Slider(-2500f, 2500f, 0.1f, false, Assets.SKIN);
            slider.addListener(event -> {l.setText(slider.getValue() + "");
                Camera.Companion.setFRUSTRUM_WIDTH_MOD(slider.getValue());
                GameHypervisor.getGameRenderer().getCam().cacheFrustumValues();
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

    public OptionsWindow() {
        super("PREFERENCES");

        ArrayList<String> languagesString = new ArrayList<>();
        Assets.languages.forEach(n -> languagesString.add(n.getDisplayName(LANG.getLocale())));

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

        GAME_OPTION_TAB = new Table();
        label("selectLanguage", GAME_OPTION_TAB);
        GAME_OPTION_TAB.add(languageList).padTop(20f);

        GRAPHICS_OPTION_TAB = new Table();
        GRAPHICS_OPTION_TAB.add(new Label("Graphics options will be built here", Assets.SKIN));

        SOUND_OPTION_TAB = new Table();

        label("musicVolume", SOUND_OPTION_TAB);
        SOUND_OPTION_TAB.add(musicSlider).padTop(20f).row();

        label("sfxVolume", SOUND_OPTION_TAB);
        SOUND_OPTION_TAB.add(gameSlider).padTop(20f).row();

        CheckBox c = checkBox("mute", SOUND_OPTION_TAB);
        c.addListener(new LambdaClickListener(inputEvent -> {
            AudioController.setMute(c.isChecked());
        }));

        if (AudioController.isMuted())
            c.setChecked(true);

        SOUND_OPTION_TAB.add(c).colspan(2).center();
        //.padTop(20f);

        ADVANCED_OPTION_TAB = new Table();
        ADVANCED_OPTION_TAB.add(button("Calibrate Culling Frustrum", o -> frustCallib.toggleShown())).row();

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
                     "game",
                     "sound",
                     "graphics",
                     "advanced"
                )
        );
        setPosition(100f,100f);
        setSize(Gdx.graphics.getWidth() - 200, Gdx.graphics.getHeight() - 200);
        //setFillParent(true);
    }
}
