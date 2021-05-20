package com.shinkson47.SplashX6.input

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.Input
import com.shinkson47.SplashX6.Client
import com.shinkson47.SplashX6.Client.Companion.client
import com.shinkson47.SplashX6.game.GameHypervisor.Companion.NewGame
import com.shinkson47.SplashX6.rendering.screens.MainMenu
import com.shinkson47.SplashX6.game.world.World

/**
 * @author [Jordan T. Gray on 12/04/2021](https://www.shinkson47.in)
 * @version 1
 * @since v1
 */
object KeyHandler {
    // TODO dynamic bindings (Key id > consumer kinda deal)
    fun Poll() {
        if (Gdx.input.isKeyPressed(Input.Keys.ESCAPE)) client?.screen = MainMenu()
        if (Gdx.input.isKeyJustPressed(Input.Keys.F5)) NewGame()
        if (Gdx.input.isKeyJustPressed(Input.Keys.F11)) Client.toggleFS()
        if (Gdx.input.isKeyJustPressed(Input.Keys.F6)) World.focusedWorld.swapTiledInterp()
    }
}