package com.shinkson47.SplashX6.rendering.windows.game

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.scenes.scene2d.Action
import com.badlogic.gdx.scenes.scene2d.ui.*
import com.shinkson47.SplashX6.rendering.StageWindow
import com.shinkson47.SplashX6.rendering.windows.RootNode
import com.shinkson47.SplashX6.utility.Assets.SKIN
import xmlwise.Plist

class W_Help : StageWindow("!Help") {

    companion object {
        private var map : HashMap<String, Any> = Plist.fromXml(Gdx.files.internal("lang/helptext.plist").readString()) as HashMap<String, Any>
        private val tree : Tree<RootNode, String> = Tree(SKIN)
        private const val LANG = "en"

        fun reload() = readStruct()
        fun readStruct() {
            map = Plist.fromXml(Gdx.files.internal("lang/helptext.plist").readString()) as HashMap<String, Any>

            tree.clearChildren()
            readStruct(RootNode(""), map[LANG] as Map<String, *>).children.items.clone().forEach {
                    it?.let {
                        tree.add(it as RootNode)
                    }
                }
        }



        fun readStruct(parent: RootNode, m : Map<String, *>): RootNode {
            m.keys.forEach {
                val pwdNode = RootNode("!$it")
                val x = m.get(it)
                if (x !is String)
                    readStruct(pwdNode, x as Map<String, *>)
                parent.add(pwdNode)
            }
            return parent
        }

        fun StringOf(n: RootNode) : Any? {
            if (n.parent != null) {
                return (StringOf(n.parent as RootNode) as Map<String, *>)[(n.actor as Label).text.toString()]
            }

            if (n.children.size != 0) {
                return (map.get("en") as Map<String, *>)[(n.actor as Label).text.toString()] as Map<String, *>
            }

            throw Exception("Encountered a node with no child and no parents whilst interpreting the helptext tree.") // If the structure is valid, this should never happen.
        }
    }


    private val l : TextArea =  object : TextArea("Select something to display!", SKIN) {
        override fun getPrefHeight(): Float {
            return lines * style.font.lineHeight
        }
    }


    init {
        reload()
        l.isDisabled = true
        val scrollPane = ScrollPane(l, SKIN)
        val sp = SplitPane(ScrollPane(tree, SKIN), scrollPane, false, SKIN)
        sp.splitAmount = 0.2f
        expandfill(
            add(sp)
                .minHeight(300f)
                .minWidth(800f)
        )

        pack()
        tree.addListener( LambdaChangeListener {
            try {
                // This right here is the art of the bodge.

                // Text area does not update it's cached 'last text' or
                // recalculate any text metadata when the text is changed.
                // Because of this, it would resize to the last known text,
                // not the new text.
                // This bodge forces it to recalculate it's cache so we can
                // have it correctly resize.

                // Set the text. Does not update cache.
                l.text = StringOf(tree.selectedNode) as String

                // Invoke the protected 'size changed' method
                // in order to raise the flag that the cache must
                // be re-calculated.
                l.sizeBy(0.1f)

                // Sizing methods have no effect if there is no size
                // differece, so it cannot be called with 0.
                // Instead, we must alter the size and return it back
                // to what it was.
                l.sizeBy(-0.1f)

                // force re-draw the text area.
                // This causes it to call the protected 'calculateoffsets'
                // method, which notices the flag we raised earlier, and
                // actually updates the text cache.
                // We don't actually care about drawing it.

                // This would automatically be done on the next frame,
                // but we want it done now.
                stage.batch.begin()
                l.draw(stage.batch, 0f)
                stage.batch.end()

                // Now that the cache has been recalculated,
                // we can trigger scroll pane to
                // recalculate it's sizing.

                // Raise the flag to indicate that the sizes are invalid and in need
                // of re-calculating.
                scrollPane.invalidate()

                // validate layout, and calculate sizing.
                scrollPane.layout()

            } catch (e : Exception) {
                l.text = "Select something to display!"
            } } )


    }
}