package input;

import org.lwjgl.glfw.*;
import org.lwjgl.system.Callback;
import org.lwjgl.system.CallbackI;
import utility.main;

import static org.lwjgl.glfw.GLFW.*;

/**
 * <h1>Defines an overridable GLFW Key handler</h1>
 * <br>
 * <p>
 * Contains a default base key handler, which is constant.
 * When giving user a temporary foreground focus, this key handler can be
 * overriden with a custom handler, and set back to default again after.
 * </p>
 *
 * @author <a href="https://www.shinkson47.in">Jordan T. Gray on 27/03/2021</a>
 * @version 1
 * @since v1
 */
public final class InputHandler <T extends CallbackI> {

    private enum InputType {
        MOUSE_CLICK,
        MOUSE_SCROLL,
        MOUSE_MOVE,
        KEYBOARD_KEY
    }


    //#region constants
    /**
     * The default handler to use, when there is no override.
     */
    private T defaultCallback;

    /**
     * Another handler to temporarily use when requested
     */
    private T overrideCallback;

    /**
     * The type of GLFW handler
     */
    private InputType type = null;
    //#endregion constants

    //#region constructors

    /**
     * <h2>Creates a new InputHandler, with a provided default callback matching T.</h2>
     * @param defaultCallback The constant default handler to use, when there is no override.
     */
    public InputHandler(T defaultCallback) {
        this.defaultCallback = defaultCallback;
        determineType();
    }
    //#endregion constructors

    //#region operations

    /**
     * <h2>Temporarily replace the default key handler</h2>
     * @param overrideCallback Another key handler that should be used for now
     */
    public void override(T overrideCallback) {
        this.overrideCallback = overrideCallback;
        set(overrideCallback);
    }

    /**
     * <h2>Removes any override, and assignes GLFW with the default handler</h2>
     * @see InputHandler#setDefaultCallback()
     */
    public void clearOverrideCallback() {
        setDefaultCallback();
        this.overrideCallback = null;
    }

    /**
     * <h2>Assigns the default key handler to GLFW</h2>
     * Used for initalisation and by {@link InputHandler#clearOverrideCallback()}
     */
    public void setDefaultCallback(){
        set(defaultCallback);
    }

    /**
     * Sets {@link InputHandler#type} according to the type of callback in {@link InputHandler#defaultCallback}
     * @throws Exception if defaultCallback contains an unsupported callback type.
     */
    private void determineType(){
       if (defaultCallback instanceof GLFWScrollCallbackI)      type = InputType.MOUSE_SCROLL;
       if (defaultCallback instanceof GLFWKeyCallbackI)         type = InputType.KEYBOARD_KEY;
       if (defaultCallback instanceof GLFWMouseButtonCallbackI) type = InputType.MOUSE_CLICK;
       if (defaultCallback instanceof GLFWCursorPosCallbackI)   type = InputType.MOUSE_MOVE;
       if (type == null) throw new ExceptionInInitializerError("Unsupported key callback callback : " + defaultCallback);
    }
    //#endregion operations

    //#region static

    /**
     * Sets GLFW with the key handler
     * @param cb with the appropriate key handler
     */
    private void set(T cb) {
        switch(type) {

            case MOUSE_CLICK:
                glfwSetMouseButtonCallback(main.window.getID(), (GLFWMouseButtonCallbackI) cb);
                break;
            case MOUSE_SCROLL:
                glfwSetScrollCallback(main.window.getID(),      (GLFWScrollCallbackI)       cb);
                break;
            case MOUSE_MOVE:
                glfwSetCursorPosCallback(main.window.getID(),   (GLFWCursorPosCallbackI)    cb);
                break;
            case KEYBOARD_KEY:
                glfwSetKeyCallback(main.window.getID(),         (GLFWKeyCallbackI)          cb);
                break;
        }
    }
    //#endregion static
}
