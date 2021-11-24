package com.shinkson47.SplashX6.rendering.windows

import com.badlogic.gdx.Gdx
import com.shinkson47.SplashX6.rendering.StageWindow

class MessageWindow(titleKey : String, MessageKey : String, val isError : Boolean = false)
    : StageWindow(titleKey, if (isError) "Message_error" else "Message")
{

    companion object {
        @NodeInfo("Time in ms that a message will display for.")
        var timeout = 10000L
    }

    init {
        expandfill(label(MessageKey))
        unDock(this)

        pack()
        setPosition(Gdx.graphics.width - width - 50, 50f)
        closer().start()
    }

    private inner class closer : Thread({
        sleep(timeout)
        this@MessageWindow.clear()
    })
}