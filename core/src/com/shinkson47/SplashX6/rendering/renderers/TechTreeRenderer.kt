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

package com.shinkson47.SplashX6.rendering.renderers

import com.badlogic.gdx.graphics.Color
import com.badlogic.gdx.graphics.g2d.Batch
import com.badlogic.gdx.graphics.glutils.ShapeRenderer
import com.badlogic.gdx.math.Vector2
import com.badlogic.gdx.scenes.scene2d.Actor
import com.badlogic.gdx.scenes.scene2d.Event
import com.badlogic.gdx.scenes.scene2d.InputEvent
import com.badlogic.gdx.scenes.scene2d.ui.*
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener
import com.badlogic.gdx.scenes.scene2d.utils.FocusListener
import com.badlogic.gdx.utils.Align
import com.badlogic.gdx.utils.Array
import com.shinkson47.SplashX6.game.Advancement
import com.shinkson47.SplashX6.game.AdvancementTree
import com.shinkson47.SplashX6.game.GameHypervisor
import com.shinkson47.SplashX6.rendering.StageWindow
import com.shinkson47.SplashX6.rendering.windows.DoubleClickTreeListener
import com.shinkson47.SplashX6.utility.Assets
import com.shinkson47.SplashX6.utility.Assets.DATA_TECHS
import com.shinkson47.SplashX6.utility.AutoFocusScrollPane

/**
 * # TODO
 * @author [Jordan T. Gray](https://www.shinkson47.in) on 24/02/2022
 * @since v1
 * @version 1
 */
class TechTreeRenderer : StageWindow("!Techs") {

    companion object {
        val at = AdvancementTree(Assets.get(DATA_TECHS))
        val highlightStyle = Label.LabelStyle(Label("", Assets.REF_SKIN_W95).style)
        val regstyle = Label.LabelStyle(Label("", Assets.REF_SKIN_W95).style)


        init {
            highlightStyle.background = Assets.REF_SKIN_W95.getDrawable("Windows_Tooltip")
        }

    }


    val t = Table()
    val sp = AutoFocusScrollPane(t)
    val allLabels = Array<Label>()

//
//    init {
//        Tree<RootNode, Advancement>(Assets.REF_SKIN_W95).let { tree ->
//            .apply {
//                filter { it.requires.isEmpty }.forEach {
//                    tree.add(recurse(this@apply, it, RootNode("!" + it.name)))
//                }
//            }
//
//            add(tree)
//        }
//    }
//
//    private fun recurse(at: AdvancementTree, root: Advancement, currentNode: RootNode): RootNode {
//        at.filter { it.requires.contains(root) }.forEach {
//                currentNode.add(
//                   recurse(at, it, RootNode("!" + it.name))
//                )
//        }
//
//        return currentNode
//    }


    init {
        debugAll()
//        recurse(at.filter { it.requires.isEmpty })
        add(sp)
            .maxWidth(stage.height)
            .maxWidth(stage.width - 10)



        val depths = HashMap<Advancement, Int>()
        at.forEach {
            depths[it] = depth(0, it)
        }

        var x = 0
        while (true) {
            val vg = VerticalGroup().apply { space(50f); align(Align.center) }

            depths.keys.forEach {
                if (depths[it] == x)
                    vg.addActor(
                        Label(it.name, Assets.REF_SKIN_W95).also {
                            allLabels.add(it)
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
            }

            if (vg.children.isEmpty)
                break
            else {
                vg.debugAll()
                t.add(vg).pad(50f).fill()
                x++
            }
        }

        pack()
    }

    private lateinit var selected: Pair<Advancement, Label>
    private fun onSelect(a: Label) {
        selected = Pair(at.getA(a.text.toString())!!, a)
        highlightRequirements()
        cacheVecs()
    }

    val vecs = Array<Pair<Vector2, Vector2>>()
    private fun cacheVecs() {
        vecs.clear()
        at.traverseDependancies(selected.first) { requiredBy, currentAdvancement ->
            if (requiredBy != null) {
                vecs.add(


                    Pair(
                        screenspaceOf(labelFor(requiredBy), Align.left)!!.apply { Vector2(this.x, this.y) },
                        screenspaceOf(labelFor(currentAdvancement), Align.right)!!.apply { Vector2(this.x, this.y) }
                    )
                )
            }
        }
    }

    private fun highlightRequirements() {
        allLabels.forEach {
                each ->
            each.style = if (dependancyFor(at.getA(each.text.toString())!!, at.getA(selected.second.text.toString())!!))
                highlightStyle else regstyle
        }

        selected.second.style = highlightStyle
    }

    private fun depth(level: Int, i: Advancement): Int {
        if (i.requires.isEmpty)
            return level
        else {
            var depth = level
            i.requires.forEach {
                depth = depth(level + 1, it).coerceAtLeast(depth)
            }

            return depth
        }
    }

    private fun labelFor(a: Advancement): Label
        = allLabels.find { it.textEquals(a.name) }!!

    private fun dependancyFor(a: Advancement, that: Advancement): Boolean {
        if (that.requires.isEmpty) return false
        if (that.requires.contains(a)) return true

        var found = false
        that.requires.forEach {
            if (dependancyFor(a, it)) {
                found = true
                return@forEach
            }
        }
        return found
    }


    override fun drawChildren(batch: Batch?, parentAlpha: Float) {
        super.drawChildren(batch, parentAlpha)
            with(GameHypervisor.gameRenderer!!.sr) {
                vecs.forEach {
                    val xoff = sp.scrollX
                    val yoff = sp.scrollY

                    begin(ShapeRenderer.ShapeType.Filled)
                    color = Color.CYAN
                    circle(it.first.x - xoff, stage.height - it.first.y + yoff, 5f)
                    color = Color.RED
                    circle(it.second.x - xoff, stage.height - it.second.y + yoff, 10f)


                    end()
                    begin(ShapeRenderer.ShapeType.Line)

                    line(it.first.x - xoff, stage.height - it.first.y + yoff, it.second.x - xoff, stage.height - it.second.y + yoff)

                    end()
                }
        }
    }

    private fun screenspaceOf(a: Actor, align: Int): Vector2? {
        return stage!!.stageToScreenCoordinates(a.localToStageCoordinates(Vector2(a.getX(align), a.height * -0.5f))).apply { x += sp.scrollX }
    }



}