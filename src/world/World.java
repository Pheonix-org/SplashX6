package world;

import utility.statsignore.FastNoiseLite;
import utility.Utility;

import static utility.Utility.createNoiseGenerator;

/**
 * <h1>A mutable game world</h1>
 * <br>
 * <p>
 * Stores all tile data, units, and structures.
 * <br>
 * Generates worlds based on perlin noise.
 * </p>
 *
 * @author <a href="https://www.shinkson47.in">Jordan T. Gray on 25/03/2021</a>
 * @version 1
 * @since v1
 */
public final class World {
    //#region constants

    /**
     * <h2>Defines sea level</h2>
     * Between -1 and 1.
     * Any area of the map higher than this value will
     * be treated as land, lower is water.
     */
    private final float CONTINENT_THRESHOLD = 0f;

    /**
     * <h2>The smallest permitted world size</h2>
     */
    private final int MIN_WORLD_WIDTH = 50, MIN_WORLD_HEIGHT = 50;

    //#endregion constants

    //#region fields

    /**
     * <h2>Perlin used for landmass</h2>
     * Used to determine what parts of the map should be water,
     * or land.
     * @see World#CONTINENT_THRESHOLD for altering the ratio of land to water.
     */
    private FastNoiseLite ContinentalHeatmap;

    /**
     * <h2>Perlin used for biomes</h2>
     * Biome generation may be changed to a voroni map.
     * <br>
     * Determines what kinds of tiles are to be used in a given area.
     */
    private FastNoiseLite BiomeHeatmap;

    /**
     * <h2>Perlin height</h2>
     * Used for modifying terrain with hills and mountains.
     */
    private FastNoiseLite HeightHeatmap;

    /**
     * <b2>The display offset</b2>
     * Alters which tiles are accessed when requesting {@link World#getTile(int, int)},
     * such that it is relative to the area displayed on screen.
     * <br>
     * i.e such that 0,0 is always the tile in the lowest left corner of the screen,
     * regardless of what of the map the 'camera' is looking at.
     * <br>
     * Used to change the area of the map being displayed on screen.
     */
    public int xoff = 0, yoff = 0;

    /**
     * <h2>The worlds tiles prior to interpolation</h2>
     * @apiNote Note well : raw x and y are inverted. <c>worldTile[y][x]</c>
     */
    public Tile[][] worldTiles;

    /**
     * <h2>The tile of this world after interpolation</h2>
     * @apiNote Note well : raw x and y are inverted. <c>worldTile[y][x]</c>
     */
    public Tile[][] interpolatedTiles;
    //#endregion fields

    //#region constructors
    /**
     * <h2>Creates a new random 200x200 world</h2>
     */
    public World() {
        this(200,200);
    }

    /**
     * <h2>Creates a new random WxH world</h2>
     * @param w Width of the new world to generate. Must be positive.
     * @param h Width of the new world to generate. Must be positive
     */
    public World(int w, int h){
       generateWorld(w,h);
    }
    //#endregion constructors

    //#region operations

    /**
     * <h2>Replaces and content in this world with a newly generated one</h2>
     * @param w Width of the new world to generate. Must be positive.
     * @param h Width of the new world to generate. Must be positive
     */
    private void generateWorld(int w, int h){
        // Ensure that the size is at least the minimum permitted size.
        w = Math.max(w, MIN_WORLD_WIDTH);
        h = Math.max(h, MIN_WORLD_HEIGHT);

        // Prepare to generate. Clear data, new arrays, new noise generators.
        genPre(w,h);

        // generate a basic world
        genBase();

        // Generate tile blending
        genInterpolate();


        // Generate hills, mountains and volcanoes
        //genHeight();

        // Generate wonders, forests, and any other misc world items.
        //genMisc();

        // Generate resources
        //genResources();

        // Generate civilisations & barbarians
        //genPopulation();
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

    /**
     * <h2>Generates the base of the world's tiles</h2>
     * Creates water and land mass, where the landmass is modified by {@link World#getBiomeTile(int, int)}
     */
    private void genBase() {
        for (int y = 0; y < worldTiles.length; y++) {                                                                   // For every x, y tile
            for (int x = 0; x < worldTiles[0].length; x++) {

                worldTiles[y][x] = new Tile(                                                                            // Set this tile to...
                        (ContinentalHeatmap.GetNoise(x, y) < CONTINENT_THRESHOLD ) ?                                    // Will this tile be a part of a continent?
                                "s.s_s_s_s"                                                                             // No, set it to water and move to next tile.
                                :
                                getBiomeTile(x,y)                                                                       // Yes, set it to appropriate land tile.
                );
            }
        }
    }

    /**
     * <h2>Blends tile boundaries within the world</h2>
     * Interpolates the tiles in {@link World#worldTiles} using {@link Tile#interpolate(Tile, Tile, Tile, Tile)}
     * @see Tile#interpolate(Tile, Tile, Tile, Tile)
     */
    private void genInterpolate() {
        interpolatedTiles = new Tile[height()][width()];                // Temporary buffer. Prevents blending with tiles that we just modified, which caused some funky blending behaviour.

        for (int y = 0; y < worldTiles.length; y++)                     // For every tile,
            for (int x = 0; x < worldTiles[y].length; x++) {
                interpolatedTiles[y][x] = worldTiles[y][x].interpolate(
                        getStaggeredTile(x, y + 1), // Find the tiles at the nw, ne, se, nw sides of this tile
                        getStaggeredTile(x + 1, y + 1),
                        getStaggeredTile(x + 1, y - 1),
                        getStaggeredTile(x, y - 1)
                );
            }
        swapInterp();
    }

    /**
     * <h2>Determines what base tile should be used at x,y</h2>
     * @return the ground tile which should be according to {@link World#BiomeHeatmap}
     */
    private String getBiomeTile(int x, int y){
        float value = BiomeHeatmap.GetNoise(x,y);

        if (value < -0.7)
            return "a.a_a_a_a";
        if (value > -0.4 && value < -0.1)
            return "d.d_d_d_d";
        if (value > -0.1 && value < 0.1)
            return "g.g_g_g_g";
        if (value > 0.1 && value < 0.4f)
            return "s.s_s_s_s";
        if (value > 0.5 && value < 0.7f)
            return "t.t_t_t_t";

        return "p.p_p_p_p";
    }

    /**
     * <h2>Gets a tile at the raw x,y array position.</h2>
     * @return tile in worldTiles at index x, y.
     * @apiNote Does not acknowledge that rows are staggered when rendered.
     * @see World#getStaggeredTile(int, int) to account for row stagger, or for getting tiles relative to another
     */
    public Tile getTile(int x, int y) {
        x += xoff; y += yoff;
        return Utility.checkIn2DBounds(y, x, worldTiles) ? null : worldTiles[y][x];
    }

    /**
     * <h2>Gets the tile at x, y, offset to ignore the isometric row stagger</h2>
     * Where on every odd y, x is shifted left by 1.
     * <br>
     * <blockquote>
     *     if y == odd then x -= 1;
     * </blockquote>
     *
     * <br>
     * Useful when getting a tile relative to another.
     *

     * <br><br>
     * Let's pick a tile at [x][y], and say we'd like to get the tile to it's north east side. <br><br>
     * On screen, we could describe this position as <i>up and right</i>, or [x+1][y+1] quite easily.
     *
     * <br><br> However, since the rows stagger back and forth by one tile, we can't simply read the tile at x+1, y+1 from the array and get the tile we're after.
     *
     * <br><br>That's what this method is for, it corrects for this stagger offset such that [x+1][y+1] would always return the tile which can be seen to the north east side of another.
     * @return if on an odd row, tile at raw array position [x - 1][y], if even at [x][y].
     */
    public Tile getStaggeredTile(int x, int y) {
        return getTile(x + ((y % 2 == 0) ? -1 : 0), y);
    }

    /**
     * <h2>Clears the world, and generates a new one.</h2>
     */
    public void regenerate() {
        generateWorld(200,200);
    }

    /**
     * <h2>Swaps {@link World#worldTiles} and {@link World#interpolatedTiles}</h2>
     * where World tiles stores the original world tiles without blending, and interpolated is after tile blending.
     * <br><br>
     * TODO this should modify an access buffer, not these variables. interpolatedtiles should say interpolated, worldtile should stay as world tiles.
     */
    public void swapInterp(){
        Tile[][] buffer = interpolatedTiles;
        interpolatedTiles = worldTiles;
        worldTiles = buffer;
    }

    public void offLeft(){
        if (xoff > 0) xoff -= 1;
    }

    public void offRight(){
        if (xoff < width()) xoff += 1;
    }

    public void offDown(){
        if (yoff > 1) yoff -= 2;
    }

    public void offUp(){
        if (yoff < height() - 1) yoff += 2;
    }

    /**
     * @return the height, in tiles, of the map
     */
    public int height(){
        return worldTiles.length;
    }

    /**
     * @return the height, in tiles, of the map
     */
    public int width(){
        return worldTiles[0].length;
    }
    //#endregion operations
}