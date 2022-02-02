package com.shinkson47.SplashX6.rendering.windows.game

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.scenes.scene2d.ui.Label
import com.badlogic.gdx.scenes.scene2d.ui.Tree
import com.badlogic.gdx.utils.Array
import com.shinkson47.SplashX6.rendering.StageWindow
import com.shinkson47.SplashX6.rendering.windows.RootNode
import com.shinkson47.SplashX6.utility.Assets.SKIN
import java.io.File

class W_Help : StageWindow() {

    companion object {
        // TODO read file structure

        private fun readStruct() : RootNode =
            struct(Gdx.files.internal("/lang/helptext/en/").file(), RootNode("!root"))

        private fun newNode(it: File): RootNode = RootNode(it.name)
        private fun struct(pwd: File, parent : RootNode) : RootNode {
            val pwdNode = newNode(pwd)
            parent.add(pwdNode)

            pwd.listFiles().filter { it.isFile }.forEach {
                pwdNode.add(newNode(it))
            }

            pwd.listFiles().filter { it.isDirectory }.forEach {
                struct(it, pwdNode)
            }

            return pwdNode
        }
    }

    private val tree : Tree<RootNode, String> = Tree(SKIN)

    init {

    }
}