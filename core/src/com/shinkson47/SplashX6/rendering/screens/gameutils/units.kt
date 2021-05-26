package com.shinkson47.SplashX6.rendering.screens.gameutils

import com.badlogic.gdx.math.Vector3
import com.badlogic.gdx.scenes.scene2d.ui.List
import com.badlogic.gdx.scenes.scene2d.ui.ScrollPane
import com.shinkson47.SplashX6.utility.Assets
import com.badlogic.gdx.utils.Array
import com.shinkson47.SplashX6.game.GameData
import com.shinkson47.SplashX6.game.GameHypervisor
import com.shinkson47.SplashX6.game.units.Unit
import com.shinkson47.SplashX6.rendering.StageWindow
import java.util.function.Consumer

/**
 * # TODO
 * @author [Jordan T. Gray](https://www.shinkson47.in) on 20/05/2021
 * @since v1
 * @version 1
 */
class units : StageWindow("Units") {


    // ============================================================
    // region fields
    // ============================================================


    // ============================================================
    // endregion fields
    // region functions  
    // ============================================================


    // ============================================================
    // endregion functions
    // region companion    
    // ============================================================

    /**
     * # TODO
     */
    companion object {
        init {

        }
    }

    // ============================================================
    // endregion companion
    // region initalisation    
    // ============================================================

    init {

    }

    /**
     * <h2>Constructs the content to be displayed in this window</h2>
     */
    override fun constructContent() {
        val l: List<Unit> = List(Assets.SKIN)

        // TODO i hate everything about this...
        val arr : Array<Unit> = Array();
        GameData.units.forEach( Consumer { x -> arr.add(x) })

        l.setItems(arr)
        add(ScrollPane(l, skin)).fill()

        l.addListener(
            LambdaClickListener{ GameHypervisor.selectUnit(l.selected) }
        )
    }

    // ============================================================
    // endregion initalisation    
    // ============================================================


}