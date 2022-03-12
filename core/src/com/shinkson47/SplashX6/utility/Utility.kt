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

package com.shinkson47.SplashX6.utility

import com.badlogic.gdx.graphics.Color
import com.badlogic.gdx.math.MathUtils
import com.shinkson47.SplashX6.Client
import com.shinkson47.SplashX6.game.GameHypervisor.inGame
import com.shinkson47.SplashX6.rendering.screens.TextScreen
import com.shinkson47.SplashX6.rendering.windows.MessageWindow
import com.shinkson47.SplashX6.utility.PrebootAssets.PB_SKIN
import com.shinkson47.SplashX6.utility.debug.Console
import com.strongjoshua.console.LogLevel
import java.net.InetAddress
import java.util.*
import java.util.function.Consumer
import java.util.function.Function
import kotlin.math.roundToInt

/**
 * # General unique standalone utility functions.
 *
 *
 * @author [Jordan T. Gray on 27/03/2021](https://www.shinkson47.in)
 * @version 2
 * @since v1
 */
object Utility {

    //░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░
    //#region                Runtime utilities.
    //░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░

    /**
     * When wrapped around a function which throws an
     * [Exception] of any kind, a crash is prevented and
     * return value is null.
     *
     * Use carefully as this ignores any and all exceptions
     * and can lead to error cascading.
     *
     * @param T T The expected type of the output from the given function.
     * @param f F The function to execute.
     * @return
     */
    inline fun <T> tryOrNull(f: () -> T) =
        try {
            f()
        } catch (_: Exception) {
            null
        }

    //░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░
    //#endregion
    //#region                Network
    //░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░

    /**
     * Shortened alias for [InetAddress.getLocalHost].
     *
     * @return The local ip address of the hosting computer.
     */
    fun getIP() = InetAddress.getLocalHost()

    //░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░
    //#endregion
    //#region                Maths
    //░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░

    /**
     * # Linear interpolation
     * Returns a value between a and b, determined by f.
     * i.e
     * ```
     * a = 0
     * b = 10
     * f = 0.5
     * -------
     * 5
     * -------
     * ```
     * @param a Lower bound
     * @param b Higher bound
     * @param f Value between 0 and 1, where 0 = a, and 1 = b.
     * @return A value at `f` between `a` and `b`
     */
    fun lerp(a: Float, b: Float, f: Float) = a + f * (b - a)


    /**
     * Asserts that a value is within an upper boundary. If boundary is exceeded,
     * the value is reset to a starting value.
     *
     * @param value    The value we're testing.
     * @param reset    The value returned if [value] exceedes [boundary]
     * @param boundary The maximum permitted value for [value].
     * @return If [value] exceedes [boundary], returns reset. else returns value.
     */
    fun upperBoundaryReset(value: Int, reset: Int, boundary: Int) = if (value > boundary) reset else value

    /**
     * Asserts that a value is above the lower boundary. If boundary is exceeded,
     * the value is reset to a starting value.
     *
     * @param value    The value we're testing.
     * @param reset    The value returned if [value] exceedes [boundary]
     * @param boundary The lowest permitted value for [value].
     * @return If [value] exceedes [boundary], returns reset. else returns value.
     */
    fun lowerBoundaryReset(value: Int, reset: Int, boundary: Int) = if (value < boundary) reset else value

    /**
     * Increments [value], and asserts that it's new value
     * is within an upper boundary. If boundary is exceeded,
     * the value is reset to a starting value.
     *
     * @param value    The value we're testing.
     * @param reset    The value returned if [value] exceedes [boundary]
     * @param boundary The maximum permitted value for [value].
     * @return If [value] exceedes [boundary], returns reset. else returns value.
     * @see Utility.ClampUpperBoundary
     */
    fun incrementBoundaryReset(value: Int, reset: Int, boundary: Int) = upperBoundaryReset(value + 1, reset, boundary)

    /**
     * Decrements [value], and asserts that it's new value
     * is within lower boundary. If boundary is exceeded,
     * the value is reset to a starting value.
     *
     * @param value    The value we're testing.
     * @param reset    The value returned if [value] exceedes [boundary]
     * @param boundary The lowest permitted value for [value].
     * @return If [value] exceedes [boundary], returns reset. else returns value.
     * @see Utility.ClampUpperBoundary
     */
    fun decrementBoundaryReset(value: Int, reset: Int, boundary: Int) = lowerBoundaryReset(value - 1, reset, boundary)

    /**
     * Normalises center of a 1D co-ordinate in the center of a container.
     *
     * For centering an item within a parent. Call twice, once for each axis.
     *
     * i.e
     *
     *```
     *setPosition(
     * center(ScreenWidth, WindowWidth),
     * center(ScreenHeight, WindowHeight)
     *)
     *```
     */
    fun center(containerLength: Float, childLength: Float) = containerLength * 0.5f - childLength * 0.5f

    /**
     * Determines if X and Y are within bounds of a 2d array
     * @param x The value to test
     * @param y The value to test
     * @return True if _both_ [x] and [y] are within the bounds of the array.
     */
    fun <T> checkIn2DBounds(x: Int, y: Int, arr: Array<Array<T>>): Boolean =
       y < 0 || x < 0 || x >= arr.size || y >= arr[0].size

    /**
     * Rounds a float to a the nearest multiple.
     *
     * @param value Value
     * @param multiple Multiple
     * @return
     */
    fun roundToNearestMultiple(value: Float, multiple: Float) = (multiple * (value / multiple).roundToInt()).toInt()


    //░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░
    //#endregion
    //#region                Strings
    //░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░

    /**
     * Makes sure that a the given string has the required suffix,
     * adding it if it doesn't already contain it.
     *
     * Note that [s] is returned unmodified if it already ends with [suffix]
     *
     * @param s The string to test.
     * @param suffix The suffix that the [s] must end with.
     * @return [s] ending with [suffix].
     */
    fun AssertEndsWith(s: String, suffix: String) = if (s.endsWith(suffix)) s else s + suffix

    //░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░
    //#endregion
    //#region                Collections
    //░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░

    /**
     * Returns an item from an array at random.
     *
     * Simulates [Collection.random]
     *
     * @param T The type of items in the array.
     * @param values Values
     * @return [T]
     */
    fun <T> random(values: Array<T>) : T = values[MathUtils.random(0, values.size - 1)]

    /**
     * Converts a collection of items into a GDX compatable [Array]
     * @param items [Iterable] collection of items.
     * @param <T> The type of the items.
     * @return A GDX [Array] containing `items`
    </T> */
    fun <T> CollectionToGDXArray(items: Iterable<T>): com.badlogic.gdx.utils.Array<T> = MapToGDXArray(items) { it }

    /**
     * Converts a collection of items into a GDX compatible [com.badlogic.gdx.utils.Array]
     * @param items [Iterable] Collection of items.
     * @param map The function defining the value taken from each item to be stored in the result.
     * @param <T> The type of the items being supplied
     * @param <X> The type of the items being returned
     * @return A new GDX [Array] containing objects from `items`
    </X></T> */
    fun <T, X> MapToGDXArray(items: Iterable<T>, map: Function<T, X>): com.badlogic.gdx.utils.Array<X> =
        com.badlogic.gdx.utils.Array<X>().apply {
            items.forEach(Consumer { add(map.apply(it)) })
        }


    //░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░
    //#endregion
    //#region                   Logging
    //░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░

    /**
     * Warns a developer / development session to a problem
     * that is otherwise silent.
     */
    fun warnDev(message: String, title: String = "") {
        Console.log(message, LogLevel.ERROR)
        if (Client.DEBUG_MODE && inGame) warnPlayer(message, title)
    }

    /**
     * Warns a player to a non-fatal problem in game.
     * i.e player attempts to do something that they're not allowed to.
     *
     * e.g
     * > That unit cannot move here!
     */
    fun warnPlayer(message: String, title: String = "") =
        message(message, title, true)

    /**
     * A message to the user.
     *
     * By default, a non-problem message. [warnPlayer] is an alias for setting [isCrutial] to true.
     *
     * Creates a modal message dialog in-game that presents a message to the user.
     *
     * Non-error messages may be similar to:
     * > Gandhi has completed the Manhattan project!
     * @param message The message body to display to the user.
     * @param title Optional title to place on the header of the window.
     * @param isCrutial if true, presents a red message, indicating that it's more than just a message.
     * @return The message window created and displayed.
     */
    fun message(message: String, title: String = "", isCrutial: Boolean = false) =
        MessageWindow("!$title", "!$message", isCrutial)

    //░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░
    //#endregion
    //#region                   TODO to be moved.
    //░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░


    fun fatal(string: String, e: Throwable) {
        Console.log(e)
        Console.log(string, LogLevel.ERROR)
        TextScreen(
            font = PB_SKIN.getFont("Serif"),
            // TODO check the indentation on this
            text = """
            !!! A fatal problem has occurred !!!
            
            
            $string
            ${e.message}
            
            
            
            Quit the game.
            
            ALT + F4 on PC
            CMD + OPT + ESC on Mac
            
            (F12 to show console to copy and report.)
            """
        ).apply {
            font.color = Color.WHITE
            lineIndex = (lines.size - 1).toFloat()
            lineIndex = (lines[lineIndex.toInt()].length - 1).toFloat()
            Client.client.fadeScreen(this)
        }
    }

    //░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░
    //#endregion
    //#region                   Threading
    //░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░
    /**
     * # Dispatches a headless helper thread that is executing r.
     * @param r The runnable to execute in the thread.
     * @param name Name to be given to the thread.
     * @return Reference to the created thread.
     */
    fun dispatchDaemonThread(name: String?, r: Runnable?): Thread =
        Thread(r, name).apply {
            isDaemon = true
            start()
        }
}