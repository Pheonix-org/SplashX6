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
        private var map : Map<String, Any> = Plist.fromXml(Gdx.files.internal("lang/helptext.plist").readString())
        private val tree : Tree<RootNode, String> = Tree(SKIN)

        fun reload() = readStruct()
        fun readStruct() {
            map = Plist.fromXml(Gdx.files.internal("lang/helptext.plist").readString())
            tree.children.clear()
            readStruct(RootNode(""), map.get("en") as Map<String, *>).children.items.clone().forEach {
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
            height = getLines() * getStyle().font.getLineHeight()
            return height
        }
    }


    init {
        reload()
        val scrollPane = ScrollPane(l, SKIN)
        val sp = SplitPane(tree, scrollPane, false, SKIN)
        sp.splitAmount = 0.2f
        expandfill(
            add(sp)
                .minHeight(300f)
                .minWidth(800f)
        )

        pack()
        tree.addListener( LambdaChangeListener {
            try {
                l.setText(StringOf(tree.selectedNode) as String)
                //TODO this still doesn't work. Scroll bar doesn't update as expected.
                scrollPane.invalidate()
                scrollPane.validate()

                scrollPane.invalidate()
                scrollPane.validate()

            } catch (e : ClassCastException) {
                l.text = "Select something to display!"
            } } )


    }
}