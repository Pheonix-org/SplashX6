package com.shinkson47.SplashX6.utility;


import com.shinkson47.SplashX6.world.FastNoiseLite;

import java.util.Random;

import static com.badlogic.gdx.math.MathUtils.random;

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
    // I tried to implement above by catching an out of bounds exception, but for some reason it wasn't catching it so i resorted to calculating it which is probably slower but oh well
    //#endregion static
}
