package com.shinkson47.SplashX6.rendering.windows.game

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.scenes.scene2d.ui.*
import com.badlogic.gdx.scenes.scene2d.ui.List
import com.badlogic.gdx.utils.Align
import com.shinkson47.SplashX6.game.GameData
import com.shinkson47.SplashX6.game.cities.City
import com.shinkson47.SplashX6.game.cities.Production
import com.shinkson47.SplashX6.game.units.Unit
import com.shinkson47.SplashX6.game.units.UnitAction
import com.shinkson47.SplashX6.rendering.StageWindow
import com.shinkson47.SplashX6.utility.Assets
import com.shinkson47.SplashX6.utility.Assets.SKIN
import com.shinkson47.SplashX6.utility.Utility
import com.shinkson47.SplashX6.utility.Utility.CollectionToGDXArray
import com.shinkson47.SplashX6.utility.Utility.local

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
    private val cities: SelectBox<City>                         = SelectBox(SKIN)
    private val queue: List<Production.ProductionProject>       = List(SKIN)
    private val production: List<Production.ProductionProject>  = List(SKIN)

    //private val lblCityProductionPower              = label("specific.windows.settlements.productionPower")
    private val lblCityProductionPower : Label
    private val lblCost                = Label("0", SKIN)
    private val lblCompleteIn          = Label("0", SKIN)


    init {
        queue.selection.required = false
        production.selection.required = false

        setPosition(0f, Gdx.graphics.height.toFloat())

        cities.addListener(LambdaChangeListener { refresh() })
        add(cities)
            .colspan(3)
            .fillX()
            .expandX()
            .row()

        label("specific.windows.settlements.productionPower").also { lblCityProductionPower = it.actor }
        row()

        label("specific.windows.settlements.available")
            .expandX()
            .fillX()
            .left()
            .actor.setAlignment(Align.left)

        label("specific.windows.settlements.queue")
            .expandX()
            .fillX()
            .left()
            .colspan(2)
            .actor.setAlignment(Align.right)
        row()

        expandfill(add(ScrollPane(production, SKIN))
            .minWidth(150f)
        )

        var v : WidgetGroup = VerticalGroup()
        v.addActor(TextButton(local("generic.any.add"), SKIN).also { it.addListener(LambdaClickListener {
            cities.selected?.production!!.queue(production.selected)
            refresh()
        } )})


        v.addActor(Label(local("specific.windows.settlements.cost"), SKIN))
        v.addActor(lblCost)

        v.addActor(Label(local("specific.windows.settlements.completeIn"), SKIN))
        v.addActor(lblCompleteIn)
        v.addActor(TextButton(local("generic.any.remove"), SKIN))
        expandfill(add(v))

        expandfill(add(ScrollPane(queue, SKIN))
            .minWidth(150f)
        )


        refresh()
        pack()
    }

    override fun refresh() {
        cities.setItems(CollectionToGDXArray(GameData.player!!.cities))

        cities.selected?.let { refresh(queue.items, it.production.queue) }

        queue.selection.validate()

        cities.selected?.let { refresh(production.items, it.production.producable()) }
        production.selection.validate()
    }

    private fun <T> refresh(list :  com.badlogic.gdx.utils.Array<T>, data : Collection<T>) {
        list.clear()
        list.addAll(CollectionToGDXArray(data))
    }
}