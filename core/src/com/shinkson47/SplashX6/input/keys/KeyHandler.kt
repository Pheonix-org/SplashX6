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

    private val currentInputListener : InputMultiplexer? = null

    // TODO dynamic bindings (Key id > consumer kinda deal)
    // TODO this needs to be a listener. Polling with if statements every frame is not efficient.
    fun Poll() {
        if (! GameHypervisor.inGame) return // after here requires in game
        with (Gdx.input) {
            // if (isKeyPressed(Input.Keys.ESCAPE)) client?.fadeScreen(MainMenu())
            // if (isKeyJustPressed(Input.Keys.F5)) NewGame()
            // if (isKeyJustPressed(Input.Keys.F11)) GraphicalConfig.toggleFullscreen()
            // if (isKeyJustPressed(Input.Keys.F6)) GameData.world?.swapTiledInterp()


//            if (isKeyJustPressed(Input.Keys.NUM_1)) GameWindowManager.select(0)
//            if (isKeyJustPressed(Input.Keys.NUM_2)) GameWindowManager.select(1)
//            if (isKeyJustPressed(Input.Keys.NUM_3)) GameWindowManager.select(2)
//            if (isKeyJustPressed(Input.Keys.NUM_4)) GameWindowManager.select(3)
//            if (isKeyJustPressed(Input.Keys.NUM_5)) GameWindowManager.select(4)
//            if (isKeyJustPressed(Input.Keys.NUM_6)) GameWindowManager.select(5)
//            if (isKeyJustPressed(Input.Keys.NUM_7)) GameWindowManager.select(6)
//            if (isKeyJustPressed(Input.Keys.NUM_8)) GameWindowManager.select(7)
//            if (isKeyJustPressed(Input.Keys.NUM_9)) GameWindowManager.select(8)
//            if (isKeyJustPressed(Input.Keys.NUM_0)) GameWindowManager.select(9)

            // if (isKeyJustPressed(Input.Keys.F1)) GameHypervisor.cm_enter()
            // if (isKeyJustPressed(Input.Keys.F2)) GameHypervisor.cm_exit()



            with (GameHypervisor.gameRenderer?.cam!!) {

                boost(isKeyPressed(Input.Keys.SHIFT_LEFT))

//                if (isKeyPressed(Input.Keys.W)) up()
//                if (isKeyPressed(Input.Keys.S)) down()
//                if (isKeyPressed(Input.Keys.D)) right()
//                if (isKeyPressed(Input.Keys.A)) left()
            }
        }

    }
}