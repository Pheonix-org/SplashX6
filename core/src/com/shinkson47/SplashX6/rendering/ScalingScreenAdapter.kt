package com.shinkson47.SplashX6.rendering

import com.badlogic.gdx.ScreenAdapter
import com.badlogic.gdx.scenes.scene2d.Stage
import com.badlogic.gdx.utils.Scaling
import com.badlogic.gdx.utils.viewport.ScalingViewport
import com.shinkson47.SplashX6.Client

/**
 * A screen adapter that contains a stage for scaling UI according t
 * @author [Jordan T. Gray](https://www.shinkson47.in) on 14/06/2021
 * @since v1
 * @version 1
 */
abstract class ScalingScreenAdapter() : ScreenAdapter() {

    @JvmField var width =  Client.displayMode.width.toFloat().coerceAtLeast(MIN_STAGE_WITDH.toFloat())
    @JvmField var height = Client.displayMode.height.toFloat().coerceAtLeast(MIN_STAGE_HEIGHT.toFloat())

    @JvmField
    protected val stage = Stage(ScalingViewport(Scaling.fit, width, height))

    init {
        //stage.isDebugAll = Client.DEBUG_MODE
    }

    override fun resize(width: Int, height: Int) {
        super.resize(width, height)
        stage.viewport.update(width, height)
        doResize(width, height)
    }

    abstract fun doResize(width: Int, height: Int)

    companion object {
        const val MIN_STAGE_HEIGHT = 1080
        const val MIN_STAGE_WITDH = 1920
    }
}