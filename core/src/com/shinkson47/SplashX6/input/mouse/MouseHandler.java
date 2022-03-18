/*░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░
 ░ FOSS 2022. The Splash Project.                                                                                                                                                 ░
 ░ https://www.shinkson47.in/SplashX6                                                                                                                                             ░
 ░ Jordan T. Gray.                                                                                                                                                                ░
 ░                                                                                                                                                                                ░
 ░                                                                                                                                                                                ░
 ░                                                                                                                                                                                ░
 ░           _____                    _____                    _____            _____                    _____                    _____                                           ░
 ░          /\    \                  /\    \                  /\    \          /\    \                  /\    \                  /\    \                         ______           ░
 ░         /::\    \                /::\    \                /::\____\        /::\    \                /::\    \                /::\____\                       |::|   |          ░
 ░        /::::\    \              /::::\    \              /:::/    /       /::::\    \              /::::\    \              /:::/    /                       |::|   |          ░
 ░       /::::::\    \            /::::::\    \            /:::/    /       /::::::\    \            /::::::\    \            /:::/    /                        |::|   |          ░
 ░      /:::/\:::\    \          /:::/\:::\    \          /:::/    /       /:::/\:::\    \          /:::/\:::\    \          /:::/    /                         |::|   |          ░
 ░     /:::/__\:::\    \        /:::/__\:::\    \        /:::/    /       /:::/__\:::\    \        /:::/__\:::\    \        /:::/____/                          |::|   |          ░
 ░     \:::\   \:::\    \      /::::\   \:::\    \      /:::/    /       /::::\   \:::\    \       \:::\   \:::\    \      /::::\    \                          |::|   |          ░
 ░   ___\:::\   \:::\    \    /::::::\   \:::\    \    /:::/    /       /::::::\   \:::\    \    ___\:::\   \:::\    \    /::::::\    \   _____                 |::|   |          ░
 ░  /\   \:::\   \:::\    \  /:::/\:::\   \:::\____\  /:::/    /       /:::/\:::\   \:::\    \  /\   \:::\   \:::\    \  /:::/\:::\    \ /\    \          ______|::|___|___ ____  ░
 ░ /::\   \:::\   \:::\____\/:::/  \:::\   \:::|    |/:::/____/       /:::/  \:::\   \:::\____\/::\   \:::\   \:::\____\/:::/  \:::\    /::\____\        |:::::::::::::::::|    | ░
 ░ \:::\   \:::\   \::/    /\::/    \:::\  /:::|____|\:::\    \       \::/    \:::\  /:::/    /\:::\   \:::\   \::/    /\::/    \:::\  /:::/    /        |:::::::::::::::::|____| ░
 ░  \:::\   \:::\   \/____/  \/_____/\:::\/:::/    /  \:::\    \       \/____/ \:::\/:::/    /  \:::\   \:::\   \/____/  \/____/ \:::\/:::/    /          ~~~~~~|::|~~~|~~~       ░
 ░   \:::\   \:::\    \               \::::::/    /    \:::\    \               \::::::/    /    \:::\   \:::\    \               \::::::/    /                 |::|   |          ░
 ░    \:::\   \:::\____\               \::::/    /      \:::\    \               \::::/    /      \:::\   \:::\____\               \::::/    /                  |::|   |          ░
 ░     \:::\  /:::/    /                \::/____/        \:::\    \              /:::/    /        \:::\  /:::/    /               /:::/    /                   |::|   |          ░
 ░      \:::\/:::/    /                  ~~               \:::\    \            /:::/    /          \:::\/:::/    /               /:::/    /                    |::|   |          ░
 ░       \::::::/    /                                     \:::\    \          /:::/    /            \::::::/    /               /:::/    /                     |::|   |          ░
 ░        \::::/    /                                       \:::\____\        /:::/    /              \::::/    /               /:::/    /                      |::|   |          ░
 ░         \::/    /                                         \::/    /        \::/    /                \::/    /                \::/    /                       |::|___|          ░
 ░          \/____/                                           \/____/          \/____/                  \/____/                  \/____/                         ~~               ░
 ░                                                                                                                                                                                ░
 ░                                                                                                                                                                                ░
 ░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░*/

package com.shinkson47.SplashX6.input.mouse;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputAdapter;
import com.badlogic.gdx.InputMultiplexer;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.shinkson47.SplashX6.game.Hypervisor;
import com.shinkson47.SplashX6.input.KeyBinder;

/**
 * <h1>Main mouse handling scripts</h1>
 * <br>
 * <p>
 * This class is mostly just a container for InputAdapter's, which can script different actions.
 * Different adapters can be set at different times / on different windows as required.
 * </p>
 *
 * @author <a href="https://www.shinkson47.in">Jordan T. Gray on 12/04/2021</a>
 * @version 1
 * @since v1
 */
public class MouseHandler {

    /**
     * <h2>Main multiplexer</h2>
     * Contains all input processors / handlers. LibGDX can only use one input processor
     * at a time, but if you assign a multiplexer, and add multiple processors to the multiplexer,
     * you can have multiple input handlers active at the same time.
     * <br><br>
     * This is always the input processor, and all input handers should be added to this.
     * <br>
     * use {@link MouseHandler#reset()} to start from fresh, such as when switching screens.
     */
    public static final InputMultiplexer inputMultiplexer = new InputMultiplexer();

    /**
     * <h2>Configures the multiplexer for first time use with {@link MouseHandler#reset()}</h2>
     */
    public static void create(){ reset(); }

    /**
     * <h2>Permenant input scripts using {@link Gdx#input}</h2>
     */
    public static void Poll() {
        // TODO gotta a be a way to abstract this garbage...
        if (!Hypervisor.getInGame()) return;
        // If releasing, notify drag logistics that it's been released
        if (DragLogistics.LEFT.isDown() && !Gdx.input.isButtonPressed(Input.Buttons.LEFT))
            DragLogistics.LEFT.up();
        if (DragLogistics.RIGHT.isDown() && !Gdx.input.isButtonPressed(Input.Buttons.RIGHT))
            DragLogistics.RIGHT.up();
        if (DragLogistics.MIDDLE.isDown() && !Gdx.input.isButtonPressed(Input.Buttons.MIDDLE))
            DragLogistics.MIDDLE.up();


        // If pressing, notify drag logistics that it's been pressed
        if (Gdx.input.isButtonJustPressed(Input.Buttons.LEFT))
            DragLogistics.LEFT.down();
        if (Gdx.input.isButtonJustPressed(Input.Buttons.RIGHT))
            DragLogistics.RIGHT.down();
        if (Gdx.input.isButtonJustPressed(Input.Buttons.MIDDLE))
            DragLogistics.MIDDLE.down();

        if (Hypervisor.getCm_active()) {
            if (Gdx.input.isButtonPressed(Input.Buttons.RIGHT))
                Hypervisor.unit_setDestination();
        }

        // If down, then update camera's target with the mouse's movement
        if (DragLogistics.RIGHT.isDown())
            Hypervisor.getGameRenderer().getCam().deltaPosition(DragLogistics.RIGHT.x(), DragLogistics.RIGHT.y());



        if (DragLogistics.MIDDLE.isDown()) {
            DragLogistics.MIDDLE.x(); // Side effect of calculating y.
            Hypervisor.getGameRenderer().getCam().deltaTilt(DragLogistics.MIDDLE.y());
        }
    }

    /**
     * <h2>Removes all input handlers from {@link MouseHandler#inputMultiplexer}</h2>
     */
    public static void reset(){
        inputMultiplexer.clear();
        Gdx.input.setInputProcessor(inputMultiplexer);
    }

    /**
     * <h2>Configures {@link MouseHandler#inputMultiplexer} for use in the game window</h2>
     * Add all game window handlers in here.
     * @param stage
     */
    public static void configureGameInput(Stage stage) {
        reset();
        inputMultiplexer.addProcessor(stage);
        inputMultiplexer.addProcessor(GameZoomDragHandler);
        inputMultiplexer.addProcessor(KeyBinder.INSTANCE);
    }



    //******************************************************************************
    // Input handlers
    //******************************************************************************

    //#region handlers
    /**
     * <h2>Zooms and moves the game camera with middle mouse</h2>
     */
    public static final InputAdapter GameZoomDragHandler = new InputAdapter() {

        /**
         * <h2>Zooms game camera when user scrolls</h2>
         */
        @Override
        public boolean scrolled(float amountX, float amountY) {
            if(Hypervisor.getInGame()) {
                Hypervisor.getGameRenderer().getCam().deltaZoom(amountY);
                return true;
            } else
                return false;
        }
    };
    //#endregion handlers

}
