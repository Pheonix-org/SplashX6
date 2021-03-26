package tiles;

import java.util.Arrays;

/**
 * <h1>Stores a game's world</h1>
 * <br>
 * <p>
 *
 * </p>
 *
 * @author <a href="https://www.shinkson47.in">Jordan T. Gray on 25/03/2021</a>
 * @version 1
 * @since v1
 */
public class World {
    //#region constants
    //#endregion constants

    //#region fields
    public Tile[][] worldTiles = new Tile[120][100];

    {
        for (int y = 0; y < worldTiles.length; y++) {
            for (int x = 0; x < worldTiles[0].length; x++) {
                worldTiles[y][x] = new Tile();
            }
        }
    }
    //#endregion fields

    //#region constructors
    //#endregion constructors

    //#region operations
    public int height(){
        return worldTiles.length;
    }

    public int width(){
        return worldTiles[0].length;
    }
    //#endregion operations

    //#region static
    //#endregion static
}
