package com.shinkson47.SplashX6.input.keys

import com.badlogic.gdx.Screen

/**
 * # Boilerplate defining a action to perform when a key is pressed on a given screen.
 * @author [Jordan T. Gray](https://www.shinkson47.in) on 23/06/2021
 * @since PRE-ALPHA 0.0.2
 * @version 1
 */
data class KeyBinding
    <T : Screen>(
    val activeOn : Class<T>,
    val keyOrButton : Int,
    val Action : Runnable,
    val repeat : Boolean)