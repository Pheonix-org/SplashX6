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
 ░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░*/

package com.shinkson47.SplashX6.rendering.windows.game.settlements

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.scenes.scene2d.Touchable
import com.badlogic.gdx.scenes.scene2d.ui.*
import com.badlogic.gdx.scenes.scene2d.ui.List
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable
import com.badlogic.gdx.utils.Align
import com.badlogic.gdx.utils.Array
import com.shinkson47.SplashX6.game.production.ProductionManager
import com.shinkson47.SplashX6.game.production.ProductionProject
import com.shinkson47.SplashX6.rendering.ui.StageWindow
import com.shinkson47.SplashX6.rendering.ui.StageWindow.label
import com.shinkson47.SplashX6.utility.Assets
import com.shinkson47.SplashX6.rendering.ui.AutoFocusScrollPane
import com.shinkson47.SplashX6.utility.Utility
import com.shinkson47.SplashX6.utility.configuration.LanguageConfig.local
import kotlin.math.ceil

/**
 * # TODO
 * @author [Jordan T. Gray](https://www.shinkson47.in) on 28/02/2022
 * @since v1
 * @version 1
 */
abstract class ProductionTab<T : ProductionProject<*>, P : ProductionManager<T>>(
    var productionManager : P? = null
) : Table() {

    private val queue: List<T> = List(Assets.REF_SKIN_W95)
    private val production: List<T> = List(Assets.REF_SKIN_W95)

    private val lblCityProductionPower : Label
    private val lblCost                = Label("0", Assets.REF_SKIN_W95)
    private val lblCompleteIn          = Label("0", Assets.REF_SKIN_W95)
    private val lblCityProductionPowerLevel = Label("100", Assets.REF_SKIN_W95)
    private val lblWorkingOn = Label("Working On : ", Assets.REF_SKIN_W95)
    private val lblWorkingOnProgress = Label("", Assets.REF_SKIN_W95)
    private val progWorkingOn = ProgressBar(0f,1f, 0.001f, false, Assets.REF_SKIN_W95)
    private val img = Image()
    private var btnAddButton: Button

    init {
        padLeft(5f)

        queue.selection.required = false
        production.selection.required = false

        listListener(production)
        listListener(queue)

        setPosition(0f, Gdx.graphics.height.toFloat())

        label("specific.windows.settlements.productionPower", this)
            .also { lblCityProductionPower = it.actor }
        add(lblCityProductionPowerLevel)
        row()

        label("specific.windows.settlements.available", this)
            .expandX()
            .fillX()
            .left()
            .actor.setAlignment(Align.left)

        label("specific.windows.settlements.queue", this)
            .expandX()
            .fillX()
            .left()
            .colspan(2)
            .actor.setAlignment(Align.right)
        row()

        add(AutoFocusScrollPane(production))
            .minWidth(150f)
            .expand()
            .fill()

        val midColumn : WidgetGroup = VerticalGroup()
        midColumn.addActor(
            TextButton(local("generic.any.add"), Assets.REF_SKIN_W95)
            .also {
                it.addListener {
                    productionManager?.let {
                        if (it.isQueueFull())
                            Utility.message("!Queue is full.")
                    }
                    false
                }

                it.addListener(StageWindow.LambdaClickListener {
                    var index = -1
                    selectedInAvailable()?.let {
                        productionManager?.queueProject(it)
                        index = production.selectedIndex
                    }
                    refresh(null)

                    if (index != -1 && index < production.items.size - 1)
                        production.selectedIndex = index
                })
                btnAddButton = it
            }

        )


        val localisedLabel: (key: String) -> Unit = {
            midColumn.addActor(Label(local(it), Assets.REF_SKIN_W95))
        }

        localisedLabel("specific.windows.settlements.cost")
        midColumn.addActor(lblCost)

        localisedLabel("specific.windows.settlements.completeIn")
        midColumn.addActor(lblCompleteIn)

        midColumn.addActor(TextButton(local("generic.any.remove"), Assets.REF_SKIN_W95).apply { addListener(StageWindow.LambdaClickListener {
            selectedInQueue().let { productionManager?.queue?.removeValue(it, true) }
            refresh(null)
        })})
        //expandfill(
        add(midColumn)
            .expand()
            .fill()

        add(AutoFocusScrollPane(queue))
            .minWidth(150f)
            .expand()
            .fill()
            .row()

        add(img)
            .size(100f)
            .expand()
            .fill()

        add(VerticalGroup().apply {
            addActor(lblWorkingOn)
            addActor(lblWorkingOnProgress)
            addActor(progWorkingOn)
        }).colspan(2)

        refresh(null)
    }

    private fun listListener(l: List<T>): Boolean {
        l.addListener(StageWindow.LambdaClickListener { l.selected?.let { refreshCost(it); } })
        return false
    }

    fun refresh(_productionManager: P?) {
        _productionManager?.let{ productionManager = _productionManager }
        if (productionManager == null)
            return

        productionManager?.let { refresh(queue.items, it.queue) }
        queue.selection.validate()

        productionManager?.let { refresh(production.items, it.evaluateProducible()) }
        production.selection.validate()

        productionManager?.let { lblCityProductionPowerLevel.setText( it.contributionPower) }

        workingOn()?.let {
            progWorkingOn.value = it.progress()
            lblWorkingOn.setText("Working On : $it")
            lblWorkingOnProgress.setText("Progress : ${it.contributed} / ${it.cost}")
            setImage(it)
        } ?: run {
            progWorkingOn.value = 0f
            lblWorkingOn.setText("Not working on anything")
            lblWorkingOnProgress.setText("")
            img.drawable = null
        }
    }

    private fun setImage(it : T?) =
            it?.let { img.drawable = getImage(it) } ?: run { img.drawable = null }

    abstract fun getImage(it : T) : TextureRegionDrawable

    private fun refreshCost(it : T?) {
        lblCost.setText(if (it == null) "0" else "${it.cost}")
        productionManager?.contributionPower?.let { i -> lblCompleteIn.setText(if (it == null) "0" else "${ceil(it.cost.toDouble() / i.toDouble()).toInt()}")}
        it?.let { setImage(it) }
    }

    private fun <T> refresh(list : Array<T>, data : Array<T>) {
        list.clear()
        list.addAll(Utility.CollectionToGDXArray(data))
        productionManager?.let { btnAddButton.touchable = if (it.isQueueFull()) Touchable.disabled else Touchable.enabled }
    }

    private fun selectedInQueue(): T? =
        queue.selected

    private fun selectedInAvailable(): T? =
        production.selected

    private fun workingOn(): T? =
        productionManager?.getWorkingOn()
}