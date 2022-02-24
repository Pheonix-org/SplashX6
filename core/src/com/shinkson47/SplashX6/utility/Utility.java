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

package com.shinkson47.SplashX6.utility;


import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Dialog;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.utils.Align;
import com.badlogic.gdx.utils.Array;
import com.shinkson47.SplashX6.Client;
import com.shinkson47.SplashX6.game.GameHypervisor;
import com.auburn.fastnoiselite.FastNoiseLite;
import com.shinkson47.SplashX6.rendering.windows.MessageWindow;

import java.util.MissingResourceException;
import java.util.function.Function;

import static com.badlogic.gdx.math.MathUtils.random;
import static com.shinkson47.SplashX6.utility.Assets.INSTANCE;

/**
 * <h1>General static utility methods</h1>
 * <br>
 * <p>
 * These are not specific to any given class, but are useful none-the-less.
 * </p>
 *
 * @author <a href="https://www.shinkson47.in">Jordan T. Gray on 27/03/2021</a>
 * @version 1
 * @since v1
 */
public final class Utility {

    //#region static

    /**
     * <h2>Creates a new OpenSimplex2 perlin noise generator with a random seed.</h2>
     */
    public static FastNoiseLite createNoiseGenerator(){
        FastNoiseLite l = new FastNoiseLite();
        l.SetNoiseType(FastNoiseLite.NoiseType.OpenSimplex2);
        l.SetSeed(random.nextInt());
        return l;
    }

    /**
     * <h2>Asserts that the value passed is at a minimum bound or above</h2>
     * @param value The value to check
     * @param min The minimum permitable value of <code>value</code>
     * @return if value > min then value, else min
     * @deprecated turn out there's an api call for this, {@link Math#max}
     * @see Math#max(int, int)
     */
    @Deprecated
    public static int boundMin(int value, int min){
        return (value > min) ? value : min;
    }

    /**
     * <h2>Linear interpolation</h2>
     * Returns a value between a and b, determined by f.
     * <br><br>
     * i.e
     * <blockquote>
     * <br> a = 0
     * <br> b = 10
     * <br> f = 0.5
     * <br> -------
     * <br> 5
     * <br> -------
     * </blockquote>
     * @param a Lower bound
     * @param b Higher bound
     * @param f Value between 0 and 1, where 0 = a, and 1 = b.
     * @return A value at <c>f</c> between <c>a</c> and <c>b</c>
     */
    public static float lerp(float a, float b, float f)
    {
        return a + f * (b - a);
    }

    /**
     * For centering an item within a parent.
     *
     * Calcualtes a centerpoint on a given axis.
     *
     * Call twice, once for each axis.
     *
     * i.e
     * <p>
     *     setPosition(
     *          center(ScreenWidth, WindowWidth),
     *          center(ScreenHeight, WindowHeight)
     *     );
     * </p>
     */
    public static float center(float containerLength, float childLength) {
        return (containerLength * 0.5f) - (childLength * 0.5f);
    }

    /**
     * <h2>Determines if X and Y are within bounds of a 2d array</h2>
     * @param x
     * @param y
     * @return true if x and y are within the bounds of the array.
     */
    public static boolean checkIn2DBounds(int x, int y, Object[][] arr) {
        return (y < 0|| x < 0 || x >= arr.length || y >= arr[0].length);
    }

    public static int roundToNearestMultiple(float value, float multiple){
        return (int) (multiple*(Math.round(value/multiple)));
    }

    /**
     * Creates and shows a fullscreen modal dialog on the specified stage
     */
    public static void notImplementedDialog(Stage stage) {
        Dialog dialog = new Dialog("", Assets.INSTANCE.getREF_SKIN_W95(), "dialog-modal");

        dialog.getTitleTable().reset();
        Label label = new Label("OOPS!", Assets.INSTANCE.getREF_SKIN_W95(), "title");
        label.setAlignment(Align.bottom);
        dialog.getTitleTable().add(label).expand();

        dialog.getContentTable().padTop(30).padBottom(30);
        dialog.text(local("notImplemented"))
            .button(local("OK"), true)
            .show(stage);
    }

    public static String local(String key) {
        if (key.startsWith("!"))
            return key.substring(1);

        try {
            return Assets.INSTANCE.getREF_LANG().get(key);
        } catch (MissingResourceException e) {
            warnDev(e.getMessage());
            return "???" + key + "???";
        }
    }

    /**
     * Converts a collection of items into a GDX compatable {@link Array}
     * @param items {@link Iterable} collection of items.
     * @param <T> The type of the items.
     * @return A GDX {@link Array} containing <code>items</code>
     */
    public static <T> Array<T> CollectionToGDXArray(Iterable<T> items) {
        return MapToGDXArray(items, it -> it);
    }

    /**
     * Converts a collection of items into a GDX compatable {@link Array}, and applies a map to the items
     * as it does so.
     * @param items {@link Iterable} collection of items.
     * @param map The function defining the value taken from each item to be stored in the result.
     * @param <T> The type of the items being supplied
     * @param <X> The type of the items being returned
     * @return A GDX {@link Array} containing a map of <code>items</code>
     */
    public static <T,X> Array<X> MapToGDXArray(Iterable<T> items, Function<T, X> map) {
        Array<X> i = new Array<>();
        items.forEach( it -> i.add(map.apply(it)));
        return i;
    }

    /**
     * Asserts that a value is within an upper boundary. If boundary is exceeded,
     * the value is reset to a starting value.
     *
     * @param value    The value we're testing.
     * @param reset    The value returned if [value] exceedes [boundary]
     * @param boundary The maximum permitted value for [value].
     * @return If [value] exceedes [boundary], returns reset. else returns value.
     */
    public static Integer ClampUpperBoundary(int value, int reset, int boundary) {
        return (value > boundary) ? reset : value;
    }

    /**
     * Asserts that a value is above the lower boundary. If boundary is exceeded,
     * the value is reset to a starting value.
     *
     * @param value    The value we're testing.
     * @param reset    The value returned if [value] exceedes [boundary]
     * @param boundary The lowest permitted value for [value].
     * @return If [value] exceedes [boundary], returns reset. else returns value.
     */
    public static Integer ClampLowerBoundary(int value, int reset, int boundary) {
        return (value < boundary) ? reset : value;
    }

    /**
     * Increments [value], and asserts that it's new value
     * is within an upper boundary. If boundary is exceeded,
     * the value is reset to a starting value.
     *
     * @param value    The value we're testing.
     * @param reset    The value returned if [value] exceedes [boundary]
     * @param boundary The maximum permitted value for [value].
     * @return If [value] exceedes [boundary], returns reset. else returns value.
     * @see Utility#ClampUpperBoundary(int, int, int)
     */
    public static Integer IncrementClampBoundary(int value, int reset, int boundary) {
        return ClampUpperBoundary(value + 1, reset, boundary);
    }

    /**
     * Decrements [value], and asserts that it's new value
     * is within lower boundary. If boundary is exceeded,
     * the value is reset to a starting value.
     *
     * @param value    The value we're testing.
     * @param reset    The value returned if [value] exceedes [boundary]
     * @param boundary The lowest permitted value for [value].
     * @return If [value] exceedes [boundary], returns reset. else returns value.
     * @see Utility#ClampUpperBoundary(int, int, int)
     */
    public static Integer DecrementClampBoundary(int value, int reset, int boundary) {
        return ClampLowerBoundary(value - 1, reset, boundary);
    }
    /**
     * <h2>Dispatches a headless helper thread that is executing r.</h2>
     * @param r The runnable to execute in the thread.
     * @param name Name to be given to the thread.
     * @return Reference to the created thread.
     */
    public static Thread DispatchDaemonThread(String name, Runnable r) {
        Thread t = new Thread(r, name);
        t.setDaemon(true);
        t.start();
        return t;
    }

    /**
     * Warns a developer / development session to a problem
     * that is otherwise silent.
     */
    public static void warnDev(String message) {
       warnDev(message, "");
    }

    /**
     * Warns a developer / development session to a problem
     * that is otherwise silent.
     */
    public static void warnDev(String message, String title) {
        System.err.println("Warning for SplashX6 developers : " + message);
        if (Client.DEBUG_MODE && GameHypervisor.getInGame())
            warnPlayer(message, title);
    }

    /**
     * Warns a player / user in any session to a problem
     * that is not fatal - i.e player attempts to do something
     * that they're not allowed to.
     */
    public static void warnPlayer(String message) {
        warnPlayer(message, "");
    }
    
    public static void warnPlayer(String message, String title) {
        message(title, message, true);
    }

    public static void message(String message) {
        message(message, "");
    }

    public static void message(String message, String title) {
        message(message, title, false);
    }

    public static void message(String message, String title, Boolean isError) {
        new MessageWindow("!" + title, "!" + message, isError);
    }

    public static String AssertEndsWith(String s, String suffix) {
        return (s.endsWith(suffix)) ? s : s + suffix;
    }
}
