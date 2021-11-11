package com.shinkson47.SplashX6.utility

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.graphics.g2d.TextureAtlas
import com.badlogic.gdx.scenes.scene2d.ui.Skin

/**
 * # Small collection of assets made available before [Assets] is loaded.
 * @author [Jordan T. Gray](https://www.shinkson47.in) on 28/06/2021
 * @since PRE-ALPHA 0.0.2
 * @version 1
 */
object PrebootAssets {

    @JvmStatic
    val PB_SKIN : Skin = Skin(Gdx.files.internal("skins/W95/W95.json"))

    val SPLASH_TEXT = Gdx.files.internal("lang/splash.txt").readString()

    val splashBG: TextureAtlas = TextureAtlas("sprites/splash_bg.atlas")

}