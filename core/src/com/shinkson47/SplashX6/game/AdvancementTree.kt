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

package com.shinkson47.SplashX6.game

import com.shinkson47.SplashX6.game.Advancement.Companion.depth
import com.shinkson47.SplashX6.utility.Utility.CollectionToGDXArray

/**
 * A linked list data structure representing a tree of things which can be advanced.
 *
 * i.e this can be used for a tech tree, governments, requirements for unit production, religion progression, etc.
 * @author [Jordan T. Gray](https://www.shinkson47.in) on 24/02/2022
 * @since PRE-ALPHA 0.0.2.
 * @version 1
 */
class AdvancementTree(data : HashMap<String, *>) : ArrayList<Advancement>() {

    init {
        interpStruct(data)
    }

    private fun interpStruct(data: HashMap<String, *>) {
        data.keys.forEach {
            add(
                Advancement(it)
            )
        }

        forEach {
            (data[it.name] as HashMap<String, *>).apply {
                it.let{
                    { a: String -> getA(this[a] as String)?.apply { it.requires.add(this) }}.apply {
                        this("req1")
                        this("req2")
                    }
                }
            }
        }
    }

    fun getA(name : String): Advancement? = find { it.name == name }

    /**
     * Traverses all dependancies of [a], applying [f] to all advancements
     * including [a] itself.
     *
     * @param a
     * @param f
     */
    fun traverseDependancies(a: Advancement, parent: Advancement? = null, f : (Advancement?, Advancement) -> Any)  {
        f(parent, a)

        if (a.requires.isEmpty()) // TODO no requirements alias.
            return

        a.requires.forEach {
            traverseDependancies(it, a, f)
        }
    }

    fun deepestUncompleteDependency(i: Advancement) {
        var deepest = i
        var deepestDepth = 10000
        traverseDependancies(i) {it, requiredby ->
            if (it == null) return@traverseDependancies Unit
            val oldDepth = deepestDepth
            deepestDepth = deepestDepth.coerceAtMost(depth(it))

            if (oldDepth >= deepestDepth && !deepest.complete)
                deepest = it

            Unit
        }
    }

    /**
     * A list of dependencies for [a] in order of depth.
     */
    fun orderedDependendencies(a: Advancement, onlyUncomplete: Boolean = false): ArrayList<Advancement> {
        var deps = ArrayList<Advancement>().apply {
            traverseDependancies(a) { _, requiredby -> add(requiredby) }
            reverse()
        }

        deps.sortWith { o1, o2 -> depth(o1).compareTo(depth(o2)) }
        deps = ArrayList(deps.distinct())
        return if(onlyUncomplete)
            deps.filter { !it.complete } as ArrayList<Advancement>
        else deps
    }
}


class Advancement(
    val name : String = "root",
    val parent : Advancement? = null,
    val requires : ArrayList<Advancement> = ArrayList(),
    var complete : Boolean = false
) : java.io.Serializable {
    companion object {
        /**
         * Determines if [a] is in the dependency tree of [that].
         * @return true if it is, else false.
         */
        fun dependancyFor(a: Advancement, that: Advancement): Boolean {
            if (that.requires.isEmpty()) return false
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

    /**
     * Determines the number of advancements in the largest chain of dependencies.
     *
     * @param level The current level of depth. Used in the recursion. Starts at 0.
     * @param i the advancement to process.
     * @return In the tree of requirements, the length of the longest chain.
     */
    fun depth(i: Advancement, level: Int = 0): Int {
        return if (i.requires.isEmpty())
            level
        else {
            var depth = level
            i.requires.forEach {
                depth = depth(it, level + 1).coerceAtLeast(depth)
            }
            depth
        }
    }
}
}