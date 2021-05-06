package com.shinkson47.SplashX6.rendering.screens;

import com.badlogic.gdx.scenes.scene2d.ui.Cell;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.shinkson47.SplashX6.rendering.StageWindow;
import com.shinkson47.SplashX6.utility.Assets;

import java.util.List;

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

    //=====================================================================
    //#region constants
    //#endregion constants
    //=====================================================================

    private static final Table GAME_OPTION_WINDOW, GRAPHICS_OPTION_WINDOW, SOUND_OPTION_WINDOW;
    static {
        GAME_OPTION_WINDOW = new Table();
        GAME_OPTION_WINDOW.add(new Label("Game options will be built here", Assets.SKIN));

        GRAPHICS_OPTION_WINDOW = new Table();
        GRAPHICS_OPTION_WINDOW.add(new Label("Graphics options will be built here", Assets.SKIN));

        SOUND_OPTION_WINDOW = new Table();
        SOUND_OPTION_WINDOW.add(new Label("Sound options will be built here", Assets.SKIN));
    }

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
    }

    /**
     * <h2>Constructs the content to be displayed in this window</h2>
     */
    @Override
    protected void constructContent() {
        contentCell = add();

        tabs(
                contentCell,

                List.of(
                    GAME_OPTION_WINDOW,
                    SOUND_OPTION_WINDOW,
                    GRAPHICS_OPTION_WINDOW
                ),

                List.of(
                     "Game",
                     "Sound",
                     "Graphics"
                )
        );

        setFillParent(true);
    }
}
