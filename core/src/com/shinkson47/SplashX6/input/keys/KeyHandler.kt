package com.shinkson47.SplashX6.input.keys

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.Input
import com.badlogic.gdx.InputMultiplexer
import com.shinkson47.SplashX6.game.GameHypervisor

/**
 * #
 * @author [Jordan T. Gray on 12/04/2021](https://www.shinkson47.in)
 * @version 1
 * @since v1
 */
object KeyHandler {

    @Deprecated("See KeyBinder.")
    fun Poll() {
        if (! GameHypervisor.inGame) return // after here requires in game
            GameHypervisor.gameRenderer?.cam!!.boost(Gdx.input.isKeyPressed(Input.Keys.SHIFT_LEFT))
    }
}