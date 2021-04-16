package com.shinkson47.SplashX6.world;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TiledMapTileLayer;
import com.badlogic.gdx.math.Vector3;
import com.shinkson47.SplashX6.utility.Assets;
import com.shinkson47.SplashX6.utility.Utility;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

import static com.shinkson47.SplashX6.utility.Assets.TILESET_MAP;
import static com.shinkson47.SplashX6.utility.Assets.TILESETS;
import static com.shinkson47.SplashX6.utility.Utility.createNoiseGenerator;

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

    /**
     * <h2>The world that the game is focusing on. This will be the map rendered and interacted with.</h2>
     */
    public static World focusedWorld;

    /**
     * <h2>Creates a new world, and stores it in {@link World#focusedWorld}</h2>
     * @return
     * @apiNote Has no regard for any existing world. It will be overwritten.
     */
    public static World create(){
        focusedWorld = new World();
        return focusedWorld;
    }

    /**
     * <h2>Disposes world resources</h2>
     */
    public static void dispose() {
    }


    //#region constants
    /**
     * <h2>The size of tiles in pixels</h2>
     */
    public static final int TILE_WIDTH = 64, TILE_HEIGHT = 32;

    /**
     * <h2>Defines sea level</h2>
     * Between -1 and 1.
     * Any area of the map higher than this value will
     * be treated as land, lower is water.
     */
    private final float CONTINENT_THRESHOLD = -0.8f;

    /**
     * <h2>The smallest permitted world size</h2>
     */
    private final int MIN_WORLD_WIDTH = 6, MIN_WORLD_HEIGHT = 6;

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
     * <h2>the main tile map container</h2>
     */
    private TiledMap map;

    /**
     * <h2>the final tile layer holding the world's tiles.</h2>
     */
    private TiledMapTileLayer LerpedTileLayer;


    private TiledMapTileLayer FoliageLayer;

    /**
     * <h2>Raw world tiles, prior to interpolation.</h2>
     */
    private TiledMapTileLayer UnLerpedTileLayer;

    /**
     * <h2>The worlds tiles prior to interpolation</h2>
     * @apiNote Note well : raw x and y are inverted. <c>worldTile[y][x]</c>
     */
    private Tile[][] worldTiles;

    /**
     * <h2>The tile of this world after interpolation</h2>
     * @apiNote Note well : raw x and y are inverted. <c>worldTile[y][x]</c>
     */
    public Tile[][] interpolatedTiles;


    public Tile[][] FoliageLayerTiles;

    public static BufferedImage hitTest;
    static {
        try {
            hitTest = ImageIO.read(Gdx.files.internal("tsdata/hittest.png").read());
        }
        catch (IOException e) { }
    }
    //#endregion fields

    //#region constructors
    /**
     * <h2>Creates a new random 600x600 world</h2>
     */
    public World() { this(600,600); }

    /**
     * <h2>Creates a new random WxH world</h2>
     * @param w Width of the new world to generate. Must be positive.
     * @param h Width of the new world to generate. Must be positive
     */
    public World(int w, int h) { generateWorld(w,h); }
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

        genFoliage();

        // Generate wonders, and any other misc world items.
        //genMisc();

        // Generate resources
        //genResources();

        // Generate civilisations & barbarians
        //genPopulation();

        // Construct all generated world data into a GDX TiledMap.
        convGDX();
    }

    /**
     * <h2>Pregeneration configuration</h2>
     * Clears world, creates cavas of spedified size, resets offset, creates new noise generators
     * @param w Width of the map (in tiles)
     * @param h Height of the map (in tiles)
     */
    private void genPre(int w, int h) {
        map                 = new TiledMap();
        worldTiles          = new Tile[w][h]; //TODO constants for tile size
        FoliageLayerTiles   = new Tile[w][h]; //TODO constants for tile size
        LerpedTileLayer     = new TiledMapTileLayer(w, h, TILE_WIDTH, TILE_HEIGHT);
        UnLerpedTileLayer   = new TiledMapTileLayer(w, h, TILE_WIDTH, TILE_HEIGHT);
        FoliageLayer   = new TiledMapTileLayer(w, h, TILE_WIDTH, TILE_HEIGHT);
        ContinentalHeatmap  = createNoiseGenerator();
        BiomeHeatmap        = createNoiseGenerator();
        HeightHeatmap       = createNoiseGenerator();
        //Voronoi.Generate(w,System.nanoTime());
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
                                "s_s_s_s"                                                                               // No, set it to water and move to next tile.
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
        interpolatedTiles = new Tile[height()][width()];                // Blending buffer. Prevents blending with tiles that we just modified, which caused some funky blending behaviour.

        for (int y = 0; y < worldTiles.length; y++)                     // For every tile,
            for (int x = 0; x < worldTiles[0].length; x++) {
                interpolatedTiles[y][x] = worldTiles[y][x].interpolate( // Interpolate with those around it.
                        getStaggeredTile(x, y-1),
                        getStaggeredTile(x+1, y-1),
                        getStaggeredTile(x+1, y+1),
                        getStaggeredTile(x, y+1)
                );
            }
    }

    Random foliagerng = new Random();
    private void genFoliage(){
        for (int y = 0; y < worldTiles.length; y++)
            for (int x = 0; x < worldTiles[0].length; x++) {
                Tile t = getTile(x,y);
                if (t != null && t.tileName.equals("g_g_g_g"))
                    FoliageLayerTiles[y][x] = new Tile("grasses0" + (foliagerng.nextInt(3) + 1));
            }
    }

    /**
     * <h2>Determines what base tile should be used at x,y</h2>
     * @return the ground tile which should be according to {@link World#BiomeHeatmap}
     */
    private String getBiomeTile(int x, int y){
        float value = BiomeHeatmap.GetNoise(x,y);
        if (value < -0.7)
            return "a_a_a_a";
        if (value > -0.4 && value < -0.1)
            return "d_d_d_d";
        if (value > -0.1 && value < 0.1)
            return "p_p_p_p";
        if (value > 0.1 && value < 0.4f)
            return "s_s_s_s";
        if (value > 0.5 && value < 0.7f)
            return "t_t_t_t";

        return "g_g_g_g";

        //Biome value = Voronoi.eval(x,y);
//        switch (value){
//            case g:
//                return "g_g_g_g";
//            case t:
//                return "t_t_t_t";
//            case a:
//                return "a_a_a_a";
//            case d:
//                return "d_d_d_d";
//            case p:
//                return "p_p_p_p";
//            case s:
//                return "s_s_s_s";
//        }
//        return null;
    }



    /**
     * <h2>Constructs the GDX {@link TiledMap} stored in this world's {@link World#map}</h2>
     * Final step, post generation.
     */
    private void convGDX() {
        // Add all of the loaded tilesets to this map.
        setTileSets(map);

        for (int y = 0; y < worldTiles.length; y++)
            for (int x = 0; x < worldTiles[0].length; x++) {
                createCell(worldTiles[y][x].tileName, x, y, UnLerpedTileLayer);
                createCell(interpolatedTiles[y][x].tileName, x, y, LerpedTileLayer);
                if (FoliageLayerTiles[y][x] != null)
                    createCell(FoliageLayerTiles[y][x].tileName, x, y, FoliageLayer);
            }

        placeLayers(LerpedTileLayer);
    }

    /**
     * <h2>Sub routine for {@link World#convGDX()}. Constructs cells containing tiles, and adds them to the map layer.</h2>
     * @param tileName The resource name of the tile to be used.
     * @param x The mapspace x to place it, within layer.
     * @param y The mapspace y to place it, within layer.
     */
    private void createCell(String tileName, int x, int y, TiledMapTileLayer layer){
        TiledMapTileLayer.Cell c = new TiledMapTileLayer.Cell();
        c.setTile(map.getTileSets().getTile((Integer) TILESET_MAP.get(tileName)));
        layer.setCell(x,(layer.getHeight() - 1) - y,c);
    }

    /**
     * <h2>Gets a tile at the raw x,y array position.</h2>
     * @return tile in worldTiles at index x, y.
     * @apiNote Does not acknowledge that rows are staggered when rendered.
     * @see World#getStaggeredTile(int, int) to account for row stagger, or for getting tiles relative to another
     */
    public Tile getTile(int x, int y) {
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
        return getTile(x + (x != 0 ? ((y % 2 != 0) ? -1 : 0) : 0), y);
    }

    /**
     * <h2>Replaces all tilesets with those stored in {@link Assets#TILESETS}</h2>
     * @param map The map whose tilesets should be replaced
     * @return map, after mutating.
     */
    public TiledMap setTileSets(TiledMap map) {
        // Just to be sure, remove any tilesets from map. There's no .Clear, so i have to do this BS.
        map.getTileSets().forEach(o -> map.getTileSets().removeTileSet(o));
        // Copy all tilesets over to the map.
        TILESETS.getTileSets().forEach(o -> map.getTileSets().addTileSet(o));
        return map;
    }

    /**
     * <h2>Clears the world, and generates a new one.</h2>
     */
    public void regenerate() { generateWorld(200,200); }

    /**
     * <h2>Swaps {@link World#worldTiles} and {@link World#interpolatedTiles}</h2>
     * where World tiles stores the original world tiles without blending, and interpolated is after tile blending.
     * <br><br>
     * TODO this should modify an access buffer, not these variables. interpolatedtiles should say interpolated, worldtile should stay as world tiles.
     * @deprecated These bufferes should nolonger be swapped, now that they export to GDX TileMap. Instead, swap GDX TiledMapLayers using {@link World#swapTiledInterp()}
     */
    @Deprecated
    public void swapInterp(){
        Tile[][] buffer = interpolatedTiles;
        interpolatedTiles = worldTiles;
        worldTiles = buffer;
    }

    /**
     * <h2>Swaps the layer in {@link World#map} between {@link World#LerpedTileLayer} and {@link World#UnLerpedTileLayer}</h2>
     * where World tiles stores the original world tiles without blending, and interpolated is after tile blending.
     * <br><br>
     * TODO this should modify an access buffer, not these variables. interpolatedtiles should say interpolated, worldtile should stay as world tiles.
     */
    public void swapTiledInterp() {
        if (map.getLayers().get(0) == UnLerpedTileLayer)
            placeLayers(LerpedTileLayer);
        else
            placeLayers(UnLerpedTileLayer);
    }

    public void placeLayers(TiledMapTileLayer base){
        map.getLayers().forEach(o -> map.getLayers().remove(o));
        map.getLayers().add(base);
        map.getLayers().add(FoliageLayer);
    }



    public static int hittestResult = 0;
    // First and most successful, yet still inaccurate cartesian to map co-oord algorithm

    /**
     * <h2>(Badly) Converts WORLD SPACE co-ordinates to map space co-ordinates</h2>
     * Look, he's trying his best - alright?
     * @param x WORLD SPACE x
     * @param y WORLD SPACE y
     * @return The tile under x, y
     */
    public static Vector3 WorldspaceToMapspace(int x, int y){

        Vector3 mapSpace = new Vector3();
        if (x < 0) x = -x;
        if (y < 0) y = -y;
        int eventilex = (int) Math.floor(x%TILE_WIDTH);
        int eventiley = (int) Math.floor(y%TILE_HEIGHT);

        hittestResult = hitTest.getRGB(eventilex, eventiley);
        if (hittestResult != -16777216) {
            /* On even tile */
            mapSpace.x = (int) Math.floor((x + TILE_WIDTH) / TILE_WIDTH) - 2;
            mapSpace.y = (int) (2 * (Math.floor((y + TILE_HEIGHT) / TILE_HEIGHT) - 1));
        } else {
            /* On odd tile */
            mapSpace.x = (int)  Math.floor((x + TILE_WIDTH / 2) / TILE_WIDTH) - 1;
            mapSpace.y = (int)  (2 * (Math.floor((y + TILE_HEIGHT / 2) / TILE_HEIGHT)) - 1);
        }
        mapSpace.add(1,1,0);
        return mapSpace;
    }


// Attempt 2
//    public static Vector3 WorldspaceToMapspace(int x, int y) {
//        // Work out the diagonal i and j coordinates of the point.
//        // i and j are in a diagonal coordinate system that allows us
//        // to round them to get the centre of the cell.
//        float i = Math.round( x - y * 2 );
//        float j = MathUtils.round( x + y * 2 );
//
//        // With the i and j coordinates of the centre of the cell,
//        // convert these back into the world coordinates of the centre
//        float centreX = ( i + j ) / 2;
//        float centreY = ( j - i ) / 4;
//
//        // Now convert these centre world coordinates back into the
//        // cell coordinates
//        int cellY = (int)MathUtils.round(centreY * -4f);
//        int cellX = (int)MathUtils.round(centreX - ((cellY % 2) * 0.5f));
//
//        return new Vector3(cellX, cellY, 0);
//    }

// Attempt 3
//    public static Vector3 WorldspaceToMapspace(int x, int y) {
//        x = x/64;
//        y = (y/64)/2;
//        return new Vector3(
//                x * 2 + y % 2 + y,
//                x * 2 + y % 2 - y,
//                0
//        );
//    }



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

    /**
     * <h2>Gets the GDX {@link TiledMap} of this world.</h2>
     * @return {@link World#map}
     */
    public TiledMap getMap() {
        return map;
    }
    //#endregion operations
    }