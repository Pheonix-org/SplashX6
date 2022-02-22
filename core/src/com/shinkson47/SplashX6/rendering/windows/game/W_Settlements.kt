/*░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░
 ░ FOSS 2022. The Splash Project.                                                                                                                                                 ░
 ░ https://www.shinkson47.in/SplashX6                                                                                                                                             ░
 ░ Jordan T. Gray.                                                                                                                                                                ░
 ░                                                                                                                                                                                ░
 ░                                                                                                                                                                                ░
 ░                                                                                                                                                                                ░
 ░           _____                    _____                    _____            _____                    _____                    _____                                           ░
 ░          /\    \                  /\    \                  /\    \          /\    \                  /\    \                  /\    \                         ______           ░
 ░         /::\    \                /::\    \                /::\____\        /::\    \                /::\    \                /::\____\                       |::|   |          ░
 ░        /::::\    \              /::::\    \              /:::/    /       /::::\    \              /::::\    \              /:::/    /                       |::|   |          ░
 ░       /::::::\    \            /::::::\    \            /:::/    /       /::::::\    \            /::::::\    \            /:::/    /                        |::|   |          ░
 ░      /:::/\:::\    \          /:::/\:::\    \          /:::/    /       /:::/\:::\    \          /:::/\:::\    \          /:::/    /                         |::|   |          ░
 ░     /:::/__\:::\    \        /:::/__\:::\    \        /:::/    /       /:::/__\:::\    \        /:::/__\:::\    \        /:::/____/                          |::|   |          ░
 ░     \:::\   \:::\    \      /::::\   \:::\    \      /:::/    /       /::::\   \:::\    \       \:::\   \:::\    \      /::::\    \                          |::|   |          ░
 ░   ___\:::\   \:::\    \    /::::::\   \:::\    \    /:::/    /       /::::::\   \:::\    \    ___\:::\   \:::\    \    /::::::\    \   _____                 |::|   |          ░
 ░  /\   \:::\   \:::\    \  /:::/\:::\   \:::\____\  /:::/    /       /:::/\:::\   \:::\    \  /\   \:::\   \:::\    \  /:::/\:::\    \ /\    \          ______|::|___|___ ____  ░
 ░ /::\   \:::\   \:::\____\/:::/  \:::\   \:::|    |/:::/____/       /:::/  \:::\   \:::\____\/::\   \:::\   \:::\____\/:::/  \:::\    /::\____\        |:::::::::::::::::|    | ░
 ░ \:::\   \:::\   \::/    /\::/    \:::\  /:::|____|\:::\    \       \::/    \:::\  /:::/    /\:::\   \:::\   \::/    /\::/    \:::\  /:::/    /        |:::::::::::::::::|____| ░
 ░  \:::\   \:::\   \/____/  \/_____/\:::\/:::/    /  \:::\    \       \/____/ \:::\/:::/    /  \:::\   \:::\   \/____/  \/____/ \:::\/:::/    /          ~~~~~~|::|~~~|~~~       ░
 ░   \:::\   \:::\    \               \::::::/    /    \:::\    \               \::::::/    /    \:::\   \:::\    \               \::::::/    /                 |::|   |          ░
 ░    \:::\   \:::\____\               \::::/    /      \:::\    \               \::::/    /      \:::\   \:::\____\               \::::/    /                  |::|   |          ░
 ░     \:::\  /:::/    /                \::/____/        \:::\    \              /:::/    /        \:::\  /:::/    /               /:::/    /                   |::|   |          ░
 ░      \:::\/:::/    /                  ~~               \:::\    \            /:::/    /          \:::\/:::/    /               /:::/    /                    |::|   |          ░
 ░       \::::::/    /                                     \:::\    \          /:::/    /            \::::::/    /               /:::/    /                     |::|   |          ░
 ░        \::::/    /                                       \:::\____\        /:::/    /              \::::/    /               /:::/    /                      |::|   |          ░
 ░         \::/    /                                         \::/    /        \::/    /                \::/    /                \::/    /                       |::|___|          ░
 ░          \/____/                                           \/____/          \/____/                  \/____/                  \/____/                         ~~               ░
 ░                                                                                                                                                                                ░
 ░                                                                                                                                                                                ░
 ░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░*/

package com.shinkson47.SplashX6.rendering.windows.game

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.scenes.scene2d.Touchable
import com.badlogic.gdx.scenes.scene2d.ui.*
import com.badlogic.gdx.scenes.scene2d.ui.List
import com.badlogic.gdx.utils.Align
import com.shinkson47.SplashX6.game.GameData
import com.shinkson47.SplashX6.game.GameHypervisor
import com.shinkson47.SplashX6.game.cities.City
import com.shinkson47.SplashX6.game.cities.Production
import com.shinkson47.SplashX6.rendering.StageWindow
import com.shinkson47.SplashX6.utility.Assets.SKIN
import com.shinkson47.SplashX6.utility.Utility.*

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
    private val lblCityProductionPowerLevel = Label("100", SKIN)
    private var btnAddButton: Button


    init {
        padLeft(5f)

        queue.selection.required = false
        production.selection.required = false

        listListener(production)
        listListener(queue)

        setPosition(0f, Gdx.graphics.height.toFloat())

        label("specific.windows.settlements.cities")
            .fill()
            .actor.setAlignment(Align.left)

        cities.addListener(LambdaChangeListener {
            selectedCity()?.let { GameHypervisor.camera_focusOn(it) }
            refresh()
        })

        add(cities)
            .colspan(2)
            .fillX()
            .expandX()
            .row()

        label("specific.windows.settlements.productionPower")
            .also { lblCityProductionPower = it.actor }
        add(lblCityProductionPowerLevel)
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
            .maxHeight(500f)
        )

        val midColumn : WidgetGroup = VerticalGroup()
        midColumn.addActor(TextButton(local("generic.any.add"), SKIN)
                .also {
                    it.addListener {
                        selectedProduction()?.let {
                                if (it.queueIsFull())
                                    message("!Queue for this city is full.")
                            }
                            false
                        }

                    it.addListener(LambdaClickListener {
                        var index = -1
                        selectedInAvailable()?.let {
                            selectedProduction()?.queue(it)
                            index = production.selectedIndex
                        }
                        refresh()

                        if (index != -1)
                            production.selectedIndex = index
                    })
                    btnAddButton = it
                }
        )


        val localisedLabel: (key: String) -> Unit = {
            midColumn.addActor(Label(local(it), SKIN))
        }

        localisedLabel("specific.windows.settlements.cost")
        midColumn.addActor(lblCost)

        localisedLabel("specific.windows.settlements.completeIn")
        midColumn.addActor(lblCompleteIn)

        midColumn.addActor(TextButton(local("generic.any.remove"), SKIN).apply { addListener(LambdaClickListener {
            selectedInQueue().let { selectedProduction()?.queue?.remove(it) }
            refresh()
        })})
        expandfill(add(midColumn))

        expandfill(add(ScrollPane(queue, SKIN))
            .minWidth(150f)
        )

        isResizable = false
        refresh()
        pack()
    }
    
    private fun listListener(l: List<Production.ProductionProject>): Boolean {
        l.addListener(LambdaClickListener { l.selected?.let { refreshCost(it);}})
        return false
    }

    override fun refresh() {
        cities.items = CollectionToGDXArray(GameData.player!!.cities)

        selectedCity()?.let { refresh(queue.items, it.production.queue) }
        queue.selection.validate()

        selectedCity()?.let { refresh(production.items, it.production.evaluateProducable()) }
        production.selection.validate()

        selectedCity()?.let { lblCityProductionPowerLevel.setText(it.production.productionPower) }
    }

    private fun refreshCost(it : Production.ProductionProject?) {
        lblCost.setText(if (it == null) "0" else "${it.cost}")
        lblCompleteIn.setText(if (it == null) "0" else "${it.cost / cities.selected.production.productionPower}")
    }




    private fun <T> refresh(list :  com.badlogic.gdx.utils.Array<T>, data : Collection<T>) {
        list.clear()
        list.addAll(CollectionToGDXArray(data))
        selectedCity()?.let { btnAddButton.touchable = if (it.production.queueIsFull()) Touchable.disabled else Touchable.enabled }
    }

    private fun selectedInQueue(): Production.ProductionProject? =
        queue.selected

    private fun selectedInAvailable(): Production.ProductionProject? =
        production.selected

    private fun selectedCity(): City? =
        cities.selected

    private fun selectedProduction(): Production? =
        selectedCity()?.production


}