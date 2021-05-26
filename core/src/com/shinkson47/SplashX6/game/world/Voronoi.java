package com.shinkson47.SplashX6.game.world;


import java.util.Random;

public class Voronoi {
    static double p = 3;
    static int px[], py[], cells = 100, size = 500;
    static Biome BiomeGrid[][], biome[];
    public static boolean generated = false;
    private static long seed;

    static Random rnd = new Random(seed);

    public static void Generate(int sz, long Seed) {
        seed = Seed;
        rnd = new Random(Seed);
        generated = false;
        size = sz + 1;
        cells = size /* / Game.CurrentMap.BScale */;
        int n = 0;
        BiomeGrid = new Biome[size][size];
        px = new int[cells];
        py = new int[cells];
        biome = new Biome[cells];
        for (int i = 0; i < cells; i++) {
            px[i] = rnd.nextInt(size);
            py[i] = rnd.nextInt(size);
            biome[i] = getBiome();
        }
        for (int x = 0; x < size; x++) {
            for (int y = 0; y < size; y++) {
                n = 0;
                for (byte i = 0; i < cells; i++) {
                    if (distance(px[i], x, py[i], y) < distance(px[n], x, py[n], y)) {
                        n = i;
                    }
                }
                BiomeGrid[x][y] = biome[n];
            }
        }
        generated = true;
    }

    static double distance(int x1, int x2, int y1, int y2) {
        double d;
        d = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
        return d;
    }

    public static Biome eval(int x, int y) {
        return BiomeGrid[x][y];
    }

    public static Biome getBiome() {
        Biome biomes[] = Biome.values();
        Biome biome;
        try
        {
            biome = biomes[(int) (rnd.nextLong() % (long)biomes.length)];
        }
        catch (Throwable var2)
        {
            biome = Biome.g;
        }
        return biome;
    }
}
