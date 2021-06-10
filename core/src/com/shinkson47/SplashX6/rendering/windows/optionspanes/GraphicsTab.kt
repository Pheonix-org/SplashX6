package com.shinkson47.SplashX6.rendering.windows.optionspanes

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.Graphics
import com.badlogic.gdx.scenes.scene2d.Actor
import com.badlogic.gdx.scenes.scene2d.ui.SelectBox
import com.badlogic.gdx.scenes.scene2d.ui.Table
import com.badlogic.gdx.scenes.scene2d.utils.ChangeListener
import com.shinkson47.SplashX6.Client
import com.shinkson47.SplashX6.rendering.StageWindow
import com.shinkson47.SplashX6.rendering.screens.MainMenu
import com.shinkson47.SplashX6.rendering.windows.OptionsWindow
import com.shinkson47.SplashX6.utility.Assets

/**
 * # TODO
 * @author [Jordan T. Gray](https://www.shinkson47.in) on 09/06/2021
 * @since v1
 * @version 1
 */
class GraphicsTab(val parent : OptionsWindow) : Table() {

    init {
        StageWindow.seperate(this, "graphicalAdvanced")

        add(StageWindow.button(
            "graphicalFrustum"
        ) { o: Any? -> parent.toggleShown() }).row()

        val modeList = SelectBox<Graphics.DisplayMode>(Assets.SKIN)
        modeList.setItems(*Gdx.graphics.displayModes)
        modeList.selected = Gdx.graphics.displayMode
        modeList.addListener(object : ChangeListener() {
            // TODO make a damn lambdaChangeListener
            override fun changed(event: ChangeEvent, actor: Actor) {
                if (Gdx.graphics.isFullscreen) Gdx.graphics.setFullscreenMode(modeList.selected) else Gdx.graphics.setWindowedMode(
                    modeList.selected.width,
                    modeList.selected.height
                )
                Client.client!!.fadeScreen(MainMenu())
            }
        })

        StageWindow.label("grahpicalMode", this)

        add(modeList).row()
    }

}