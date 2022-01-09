package com.shinkson47.SplashX6.rendering.windows.game

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.scenes.scene2d.ui.*
import com.badlogic.gdx.scenes.scene2d.ui.List
import com.badlogic.gdx.utils.Align
import com.shinkson47.SplashX6.game.cities.City
import com.shinkson47.SplashX6.game.units.Unit
import com.shinkson47.SplashX6.game.units.UnitAction
import com.shinkson47.SplashX6.rendering.StageWindow
import com.shinkson47.SplashX6.utility.Assets
import com.shinkson47.SplashX6.utility.Utility.local
import javax.swing.GroupLayout

/**
 * # Displays and manages the player's settlements and thier prouction within
 * @author [Jordan T. Gray](https://www.shinkson47.in) on 21/06/2021
 * @since v1
 * @version 0.0.2
 */
class W_Settlements : StageWindow("generic.game.settlements") {

    /**
     * # The list of settlements displayed in this window
     */
    private val cities: SelectBox<City>             = SelectBox(Assets.SKIN)
    private val queue: List<Unit>                   = List(Assets.SKIN)
    private val production: List<UnitAction>        = List(Assets.SKIN)

    //private val lblCityProductionPower              = label("specific.windows.settlements.productionPower")
    private val lblCityProductionPower : Label
    private val lblCost                = Label("0", Assets.SKIN)
    private val lblCompleteIn          = Label("0", Assets.SKIN)


    init {
        queue.selection.required = false
        production.selection.required = false

        setPosition(0f, Gdx.graphics.height.toFloat())

        add(cities)
            .colspan(3)
            .fillX()
            .expandX()
            .row()

        var v : WidgetGroup = HorizontalGroup()
        v.addActor(Label("specific.windows.settlements.productionPower", Assets.SKIN))
        v.addActor(Label("specific.windows.settlements.productionPower", Assets.SKIN).also { lblCityProductionPower = it })
        row()

        label("specific.windows.settlements.queue")
            .expandX()
            .fillX()
            .left()
            .actor.setAlignment(Align.left)
        row()

        expandfill(add(production)
            .minWidth(150f)
        )

        v = VerticalGroup()
        v.addActor(TextButton(local("generic.any.add"), Assets.SKIN))
        v.addActor(Label(local("specific.windows.settlements.cost"), Assets.SKIN))
        v.addActor(lblCost)

        v.addActor(Label(local("specific.windows.settlements.completeIn"), Assets.SKIN))
        v.addActor(lblCompleteIn)
        v.addActor(TextButton(local("generic.any.remove"), Assets.SKIN))
        expandfill(add(v))

        expandfill(add(queue)
            .minWidth(150f)
        )


        refresh()
        pack()
    }

    override fun refresh() {}
}