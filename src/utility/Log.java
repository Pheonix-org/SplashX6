package utility;

import java.util.ArrayList;

/**
 * <h1>A static front-end loger</h1>
 * <br>
 * <p>
 * Takes event logs to display to the user in-game.
 * Note that this is not equal to the console or debug logs,
 * and should not be treated as such.
 * Rather it's for displaying in-game events to a player, summarising the events of the game.
 * </p>
 *
 * @author <a href="https://www.shinkson47.in">Jordan T. Gray on 24/03/2021</a>
 * @version 1
 * @since v1
 */
public class Log {
    //#region constants
    public static final ArrayList<String> GameLogs = new ArrayList<>();
    //#endregion constants

    //#region static
    /**
     * <h2>Stores a new game event log</h2>
     * The log represents an in-game action / event,
     * and is added to a user-friendly list of game events to summarise actions in the game.
     * This log will be visible to the user.
     * TODO localisation
     * @param s The string describing the event
     */
    public static void New(String s){
        GameLogs.add(s);
    }

    //#endregion static
}
