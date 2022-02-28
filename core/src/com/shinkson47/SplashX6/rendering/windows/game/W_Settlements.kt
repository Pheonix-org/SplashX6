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
import com.badlogic.gdx.utils.Array
import com.shinkson47.SplashX6.game.GameData
import com.shinkson47.SplashX6.game.GameHypervisor
import com.shinkson47.SplashX6.game.cities.City
import com.shinkson47.SplashX6.game.production.CityProductionManager
import com.shinkson47.SplashX6.game.production.UnitProductionProject
import com.shinkson47.SplashX6.rendering.StageWindow
import com.shinkson47.SplashX6.utility.Assets.REF_SKIN_W95
import com.shinkson47.SplashX6.utility.AutoFocusScrollPane
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
    private val cities: SelectBox<City>                         = SelectBox(REF_SKIN_W95)
    private val queue: List<UnitProductionProject>       = List(REF_SKIN_W95)
    private val production: List<UnitProductionProject>  = List(REF_SKIN_W95)

    //private val lblCityProductionPower              = label("specific.windows.settlements.productionPower")
    private val lblCityProductionPower : Label
    private val lblCost                = Label("0", REF_SKIN_W95)
    private val lblCompleteIn          = Label("0", REF_SKIN_W95)
    private val lblCityProductionPowerLevel = Label("100", REF_SKIN_W95)
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

        expandfill(add(AutoFocusScrollPane(production))
            .minWidth(150f)
            .maxHeight(500f)
        )

        val midColumn : WidgetGroup = VerticalGroup()
        midColumn.addActor(TextButton(local("generic.any.add"), REF_SKIN_W95)
                .also {
                    it.addListener {
                        selectedProduction()?.let {
                                if (it.isQueueFull())
                                    message("!Queue for this city is full.")
                            }
                            false
                        }

                    it.addListener(LambdaClickListener {
                        var index = -1
                        selectedInAvailable()?.let {
                            selectedProduction()?.queueProject(it)
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
            midColumn.addActor(Label(local(it), REF_SKIN_W95))
        }

        localisedLabel("specific.windows.settlements.cost")
        midColumn.addActor(lblCost)

        localisedLabel("specific.windows.settlements.completeIn")
        midColumn.addActor(lblCompleteIn)

        midColumn.addActor(TextButton(local("generic.any.remove"), REF_SKIN_W95).apply { addListener(LambdaClickListener {
            selectedInQueue().let { selectedProduction()?.queue?.removeValue(it, true) }
            refresh()
        })})
        expandfill(add(midColumn))

        expandfill(add(AutoFocusScrollPane(queue))
            .minWidth(150f)
        )

        isResizable = false
        refresh()
        pack()
    }
    
    private fun listListener(l: List<UnitProductionProject>): Boolean {
        l.addListener(LambdaClickListener { l.selected?.let { refreshCost(it);}})
        return false
    }

    override fun refresh() {
        cities.items = CollectionToGDXArray(GameData.player!!.cities)

        selectedCity()?.let { refresh(queue.items, it.production.queue) }
        queue.selection.validate()

        selectedCity()?.let { refresh(production.items, it.production.evaluateProducible()) }
        production.selection.validate()

        selectedCity()?.let { lblCityProductionPowerLevel.setText(it.production.contributionPower) }
    }

    private fun refreshCost(it : UnitProductionProject?) {
        lblCost.setText(if (it == null) "0" else "${it.cost}")
        lblCompleteIn.setText(if (it == null) "0" else "${it.cost / cities.selected.production.contributionPower}")
    }




    private fun <T> refresh(list : Array<T>, data : Array<T>) {
        list.clear()
        list.addAll(CollectionToGDXArray(data))
        selectedCity()?.let { btnAddButton.touchable = if (it.production.isQueueFull()) Touchable.disabled else Touchable.enabled }
    }

    private fun selectedInQueue(): UnitProductionProject? =
        queue.selected

    private fun selectedInAvailable(): UnitProductionProject? =
        production.selected

    private fun selectedCity(): City? =
        cities.selected

    private fun selectedProduction(): CityProductionManager? =
        selectedCity()?.production
}