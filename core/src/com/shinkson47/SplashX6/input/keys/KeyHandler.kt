package com.shinkson47.SplashX6.input.keys

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.Input
import com.badlogic.gdx.InputMultiplexer
import com.shinkson47.SplashX6.Client
import com.shinkson47.SplashX6.Client.Companion.client
import com.shinkson47.SplashX6.game.GameData
import com.shinkson47.SplashX6.game.GameHypervisor
import com.shinkson47.SplashX6.game.GameHypervisor.Companion.NewGame
import com.shinkson47.SplashX6.rendering.screens.MainMenu
import com.shinkson47.SplashX6.rendering.windows.GameWindowManager
import com.shinkson47.SplashX6.utility.GraphicalConfig

/**
 * #
 * @author [Jordan T. Gray on 12/04/2021](https://www.shinkson47.in)
 * @version 1
 * @since v1
 */
object KeyHandler {

    private val currentInputListener : InputMultiplexer? = null

    // TODO dynamic bindings (Key id > consumer kinda deal)
    // TODO this needs to be a listener. Polling with if statements every frame is not efficient.
    fun Poll() {
        with (Gdx.input) {
            if (isKeyPressed(Input.Keys.ESCAPE)) client?.fadeScreen(MainMenu())
            if (isKeyJustPressed(Input.Keys.F5)) NewGame()
            if (isKeyJustPressed(Input.Keys.F11)) GraphicalConfig.toggleFullscreen()
            if (isKeyJustPressed(Input.Keys.F6)) GameData.world?.swapTiledInterp()



            if (! GameHypervisor.inGame) return // after here requires in game

            if (isKeyJustPressed(Input.Keys.NUM_1)) GameWindowManager.select(0);

            with (GameHypervisor.gameRenderer?.cam!!) {

                boost(isKeyPressed(Input.Keys.SHIFT_LEFT))

                if (isKeyPressed(Input.Keys.W)) up()
                if (isKeyPressed(Input.Keys.S)) down()
                if (isKeyPressed(Input.Keys.D)) right()
                if (isKeyPressed(Input.Keys.A)) left()
            }
        }

    }
}