package tiles;

import utility.Debug;

/**
 * <h1></h1>
 * <br>
 * <p>
 *
 * </p>
 *
 * @author Dylan Brand 23/03/2021
 * @version 1
 */
public class Tile {
    //#region constants
    public final String tileName;
    public final String tileSetName;
    public int cachedID;

    // 4 strings that reperesent the quadrants of the tile, N/E/S/W
    public final String north;
    public final String east;
    public final String south;
    public final String west;

    //#endregion constants

    //#region fields

    //#endregion fields

    //#region constructors
    public Tile(){
        this(genRandomTileString());
    }

    public Tile(String TileName){
        this.tileName = TileName;

        tileSetName = TileName.substring(0, TileName.indexOf("."));
        String[] tileNames = TileName.substring(TileName.indexOf(".") + 1).split("_");
        north = tileNames[0];
        east = tileNames[1];
        south =tileNames[2];
        west = tileNames[3];

        cachedID = TileSet.FindTileTexture(TileName);
    }
    //#endregion constructors

    //#region operations
    //#endregion operations

    //#region static


    final static String sheetchars = "padgst";
    private static String lastGen;
    private static char randomchar(){
        return sheetchars.charAt(Debug.random.nextInt(sheetchars.length()));
    }

    public static int genRandomTile(){
        int id = -1;
        while (id == -1) {
            lastGen = randomchar() + "." + randomchar() + "_" + randomchar() + "_" + randomchar() + "_" + randomchar();
            id = TileSet.FindTileTexture(lastGen);
        }
        return id;
    }

    public static String genRandomTileString(){
        genRandomTile();
        return lastGen;
    }
    //#endregion static
}