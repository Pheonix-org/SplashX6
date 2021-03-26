package tiles;

import utility.Debug;
import utility.FastNoiseLite;

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
    private final float CONTINENT_THRESHOLD = 0f;
    private FastNoiseLite ContinentalHeatmap;
    private FastNoiseLite BiomeHeatmap;
    private FastNoiseLite HeightHeatmap;
    //#endregion constants

    //#region fields
    public static int xoff = 0, yoff = 0;

    public Tile[][] worldTiles = new Tile[][]
            {
                    {new Tile("s.s_s_s_s"),new Tile("s.s_s_s_s"),new Tile("d.d_d_d_d")},
                    {new Tile("s.s_s_s_s"),new Tile("d.d_d_d_d"),new Tile("s.s_s_s_s")},
                    {new Tile("s.s_s_s_s"),new Tile("s.s_s_s_s"),new Tile("d.d_d_d_d")},
                    {new Tile("s.s_s_s_s"),new Tile("d.d_d_d_d"),new Tile("s.s_s_s_s")},
                    {new Tile("s.s_s_s_s"),new Tile("s.s_s_s_s"),new Tile("d.d_d_d_d")},
                    {new Tile("s.s_s_s_s"),new Tile("d.d_d_d_d"),new Tile("s.s_s_s_s")},
                    {new Tile("s.s_s_s_s"),new Tile("s.s_s_s_s"),new Tile("d.d_d_d_d")}

            };
    public Tile[][] interpolatedTiles;

    //#endregion fields

    //#region constructors
    public World(){
        generateWorld(200,200);
    }
    //#endregion constructors

    //#region operations
    private void generateWorld(int w, int h){
        genPre(w,h);
        genBase();
        genInterpolate();

        //genHeight();

        // Generate wonders
        // Generate civilisations
    }

    /**
     * <h2>Pregeneration configuration</h2>
     * Clears world, creates cavas of spedified size, resets offset, creates new noise generators
     * @param w Width of the map (in tiles)
     * @param h Height of the map (in tiles)
     */
    private void genPre(int w, int h) {
        xoff = 0;
        yoff = 0;
        worldTiles          = new Tile[w][h];
        ContinentalHeatmap  = createNoiseGenerator();
        BiomeHeatmap        = createNoiseGenerator();
        HeightHeatmap       = createNoiseGenerator();

    }

    private void genBase() {
        for (int y = 0; y < worldTiles.length; y++) {                       // For every x, y tile
            for (int x = 0; x < worldTiles[0].length; x++) {

                worldTiles[y][x] = new Tile(                                                                             // Set this tile to...
                        (ContinentalHeatmap.GetNoise(x, y) < CONTINENT_THRESHOLD ) ?                                    // Will this tile be a part of a continent?
                                "s.s_s_s_s"                                                                             // No, set it to water and move to next tile. TODO if this water is next to land, pick interpolation tile
                                :

                                getBiomeTile(x,y)                                                                       // Yes, set it to sand.
                );
            }
        }
    }

    private void genInterpolate() {
        interpolatedTiles = new Tile[height()][width()];

        for (int y = 0; y < worldTiles.length; y++)
            for (int x = 0; x < worldTiles[y].length; x++) {
                boolean bitw = y % 2 == 0;
                interpolatedTiles[y][x] = worldTiles[y][x].interpolate(
                        getTile((bitw) ? x - 1 : x, y + 1),
                        getTile((bitw) ? x : x + 1, y + 1),
                        getTile((bitw) ? x : x + 1, y - 1),
                        getTile((bitw) ? x - 1 : x, y - 1)
                );
            }

        swapInterp();
    }


    private String getBiomeTile(int x, int y){
        float value = BiomeHeatmap.GetNoise(x,y);

        if (value < -0.7)
            return "a.a_a_a_a";
        if (value > -0.4 && value < -0.1)
            return "d.d_d_d_d";
        if (value > 0.2 && value < 0.4)
            return "g.g_g_g_g";
        if (value > 0.6 && value < 0.7f)
            return "s.s_s_s_s";
        if (value > 7 && value < 0.8f)
            return "t.t_t_t_t";

        return "p.p_p_p_p";
    }



    public void interpolateTile(String s){

    }


    public int height(){
        return worldTiles.length;
    }

    public int width(){
        return worldTiles[0].length;
    }

    public void swapInterp(){
        Tile[][] buffer = interpolatedTiles;
        interpolatedTiles = worldTiles;
        worldTiles = buffer;
    }
    //#endregion operations

    //#region static
    public static FastNoiseLite createNoiseGenerator(){
        FastNoiseLite l = new FastNoiseLite();
        l.SetNoiseType(FastNoiseLite.NoiseType.OpenSimplex2);
        l.SetSeed(Debug.random.nextInt());
        return l;
    }

    // TODO this should be somewhere else, like a utility class
    float lerp(float a, float b, float f)
    {
        return a + f * (b - a);
    }

    public void regenerate() {
        generateWorld(200,200);
    }

    public Tile getTile(int x, int y) {
        x += xoff; y += yoff;
        return (y < 0|| x < 0 || y >= worldTiles.length || x >= worldTiles[0].length) ? null : worldTiles[y][x];
    }
    //#endregion static
}
