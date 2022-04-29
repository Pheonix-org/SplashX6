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

package com.shinkson47.SplashX6.rendering.windows.game

import com.badlogic.gdx.graphics.Color
import com.badlogic.gdx.graphics.g2d.Batch
import com.badlogic.gdx.graphics.glutils.ShapeRenderer
import com.badlogic.gdx.math.Vector2
import com.badlogic.gdx.scenes.scene2d.Actor
import com.badlogic.gdx.scenes.scene2d.InputEvent
import com.badlogic.gdx.scenes.scene2d.ui.*
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener
import com.badlogic.gdx.utils.Align
import com.badlogic.gdx.utils.Array
import com.shinkson47.SplashX6.game.Advancement
import com.shinkson47.SplashX6.game.Advancement.Companion.dependancyFor
import com.shinkson47.SplashX6.game.Advancement.Companion.depth
import com.shinkson47.SplashX6.game.AdvancementTree
import com.shinkson47.SplashX6.game.GameData
import com.shinkson47.SplashX6.game.Hypervisor
import com.shinkson47.SplashX6.game.production.AdvancementProductionProject
import com.shinkson47.SplashX6.rendering.ui.StageWindow
import com.shinkson47.SplashX6.utility.Assets
import com.shinkson47.SplashX6.rendering.ui.AutoFocusScrollPane
import com.shinkson47.SplashX6.rendering.windows.game.settlements.W_Settlements

/**
 * # Window for viewing and selecting advancements.
 * this may be used for various kinds of tech trees.
 * @author [Jordan T. Gray](https://www.shinkson47.in) on 24/02/2022
 * @since PRE-ALPHA 0.0.2
 * @version 1
 * @param advancementTree The advancement tree to be displayed.
 * @param titleKey Localised text to be displayed in the title.
 */
open class W_Advancement(titleKey: String, val advancementTree : AdvancementTree = GameData.localPlayer!!.advancementTree) : StageWindow(titleKey) {

    companion object {
        /**
         * ## [Label.style] used to show selected and required advancements.
         */
        val highlightStyle = Label.LabelStyle(Label("", Assets.REF_SKIN_W95).style).apply {
            background = Assets.REF_SKIN_W95.getDrawable("Windows_Tooltip")
        }

        /**
         * ## Regular label style used to clear a [Label] whose [Label.style] is [highlightStyle]
         */
        val regularStyle = Label.LabelStyle(Label("", Assets.REF_SKIN_W95).style)
    }

    /**
     * # The table used to contain all columns of the advancement trees.
     */
    val mainTable = Table()

    /**
     * # The scroll pane that contains [mainTable], allowing it to be scrolled.
     */
    val scrollPane = AutoFocusScrollPane(mainTable)

    /**
     * ## An array of all of the labels contained within the [mainTable], for easy reference and query.
     */
    val allLabels = Array<Label>()

    /**
     * # The advancement that the user has clicked on.
     */
    lateinit var selected: Pair<Advancement, Label>
        private set

    /**
     * # The vector pairs representing the lines to be drawn between requirements.
     * May be empty if no item is selected.
     *
     * Contains [Pair]s of [Vector2], representing the x,y of both ends of the line.
     *
     * Order of the vectors in a pair does not matter.
     */
    private val dependencyLineVectors = Array<Pair<Vector2, Vector2>>()

    init {
        add(scrollPane)
            .maxWidth(stage.width - 10) // -10 to account for window borders.
            .padTop(10f)
            .padBottom(10f)

        populateTable()

        row()
        add(button("!Show Advancement Production") {
            toggleShown()
            docked(W_AdvancementProduction::class.java).toggleShown()
        })
            .fillX()
            .expandX()

        pack()
        height += 20f
        centerStage()
        isMovable = false
    }

    /**
     * # Populates the table with columns of labels
     * according to [advancementTree]
     */
    private fun populateTable() {

        // Evaluate the longest number of chained requirements for each
        // advancement, and cache it.
        // This number of requirements determines what column the item
        // will end up in.
        val depths = HashMap<Advancement, Int>()
        advancementTree.forEach {
            depths[it] = depth(it)
        }

        var index = 0
        while (true) {
            // Create a column for every level in the tree.
            val table = Table().apply { align(Align.center) }

            // Find all advancements in the current col
            depths.keys.filter { depths[it] == index }.forEach { ad ->
                // then add a label for them.
                table.add(
                    Label(ad.name, Assets.REF_SKIN_W95).also {
                        allLabels.add(it)

                        val adproj = AdvancementProductionProject(ad)

                        tooltip(it, "Has been researched? : ${if (ad.complete) "Yes" else "No"} \n\n" + "Cost: ${adproj.cost} research power (About ${GameData.localPlayer
                            !!.advancementProuction!!.turnsToComplete(adproj)} turns.)")

                        it.addListener(
                            object : ClickListener() {
                                override fun clicked(event: InputEvent?, x: Float, y: Float) {
                                    if (event == null) return
                                    onSelect(it)
                                }
                            }
                        )
                    }
                )
                    .padBottom(25f)
                    .padTop(25f)
                    .expandX()
                    .fillX()
                    .row()
            }

            // If there were no children in this column, then stop.
            // Otherwise add columns and move to next.
            if (table.children.isEmpty)
                break
            else {
                mainTable.add(table).pad(50f)
                index++
            }
        }
    }

    /**
     * # Events performed when the user selects an advancement.
     * Updates [selected] with the selected value, highlights both [a]
     * and [a]'s requirements, then calculates and caches the vectors used to
     * draw lines between the requirements.
     *
     * @param a The label that the user has selected.
     * @see highlightRequirements
     * @see calcAndCacheDependencyVecs
     */
    private fun onSelect(a: Label) {
        selected = Pair(advancementTree.getA(a.text.toString())!!, a)
        GameData.localPlayer!!.advancementProuction.select(selected.first)
        docked(W_AdvancementProduction::class.java).refresh()
        docked(W_Settlements::class.java).refresh()

        highlightRequirements()
        calcAndCacheDependencyVecs()
    }

    /**
     * # Calculates the lines to be drawn between the selected advancement and it's dependencies
     * and caches the results in [dependencyLineVectors], where they will be drawn on every frame.
     *
     * Traverses the dependency tree for [selected], and finds the labels for each dependency.
     * Between any given [Advancement] and another which requires it is a line. The left of the line
     * is determined by the right center side of the label of the requirement, and the right of the
     * line by the left center side of the label of the dependant.
     */
    private fun calcAndCacheDependencyVecs() {
        dependencyLineVectors.clear()
        advancementTree.traverseDependancies(selected.first) { requiredBy, currentAdvancement ->
            if (requiredBy != null) {
                dependencyLineVectors.add(
                    Pair(
                        screenspaceOf(labelFor(requiredBy), Align.left),
                        screenspaceOf(labelFor(currentAdvancement), Align.right)
                    )
                )
            }
        }
    }

    /**
     * # Checks [allLabels] to see if they are a dependancy for [selected], and highlights the [Label]s with [highlightStyle] if they are.
     */
    private fun highlightRequirements() {
        allLabels.forEach {
            it.style =
                if (dependancyFor(advancementTree.getA(it.text.toString())!!, advancementTree.getA(selected.second.text.toString())!!))
                    highlightStyle
                else
                    regularStyle
        }

        selected.second.style = highlightStyle
    }



    /**
     * # Locates the label associated with the given advancement.
     *
     * @param a The advancement to find the label for.
     * @return [Label] The label used to represent that advancement.
     * @throws NullPointerException if there is no matching label for [A]
     */
    fun labelFor(a: Advancement): Label
        = allLabels.find { it.textEquals(a.name) }!!

    /**
     * Extends the super to draw [dependencyLineVectors] between
     * labels.
     *
     * Super is called first.
     */
    override fun drawChildren(batch: Batch?, parentAlpha: Float) {
        super.drawChildren(batch, parentAlpha)
            with(Hypervisor.gameRenderer!!.sr) {
                val xOffset = scrollPane.visualScrollX
                val yOffset = stage.height
                color = Color.MAGENTA
                begin(ShapeRenderer.ShapeType.Line)
                dependencyLineVectors.forEach {
                    line(it.first.x - xOffset, yOffset - it.first.y, it.second.x - xOffset, yOffset - it.second.y)
                }
                end()
        }
    }

    /**
     * Returns screen space co-ordinates of the provided label.
     *
     * By determining the horizontal point on the label according to [align],
     * centering it vertically, then translating those local co-ordinates to
     * x,y values that can be used in screen space to draw at the exact
     * location of the label.
     *
     * @param a The actor to locate on screen.
     * @param align The horizontal alignment of the co-ordinate. Left, right or center.
     * @return [Vector2] or null
     */
    private fun screenspaceOf(a: Actor, align: Int): Vector2 =
        stage!!.stageToScreenCoordinates(a.localToStageCoordinates(Vector2(a.getX(align), a.height * 0.5f))).apply { x += scrollPane.scrollX }
}