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

package com.shinkson47.SplashX6.rendering.windows

import com.badlogic.gdx.scenes.scene2d.Actor
import com.badlogic.gdx.scenes.scene2d.Event
import com.badlogic.gdx.scenes.scene2d.InputEvent
import com.badlogic.gdx.scenes.scene2d.ui.*
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener
import com.badlogic.gdx.utils.Align
import com.shinkson47.SplashX6.rendering.StageWindow
import com.shinkson47.SplashX6.utility.Assets.REF_SKIN_W95
import com.shinkson47.SplashX6.utility.Utility
import com.shinkson47.SplashX6.utility.Utility.local
import java.awt.event.FocusListener
import kotlin.reflect.KMutableProperty
import kotlin.reflect.full.declaredMembers
import java.awt.event.MouseEvent


/**
 * When added to a variable, [ReflectionNode] will
 * infer the message to display to the user.
 */
annotation class NodeInfo(val message : String)

// ==========================
//#region abstract
// ==========================



/**
 * # A node which modifies a variable.
 *
 *  * [V] : Type of value accessed by this node. i.e. Boolean, String, etc.
 *  * [A] : The type of actor that will be used to modify this value. i.e checkbox, textarea.
 *
 *
 *
 *  * [instance] : The class containing the variable we're going to modify.
 *  * [fieldName] : The name of the variable
 *  * [actor] : The actor that will be used by the user to change the value. Must be [A].
 *
 *  @throws NoSuchFieldException if [fieldName] cannot be found in [instance]
 *  @throws Exception if field is final, or does not match the type of [C].
 */
@Suppress("FINITE_BOUNDS_VIOLATION_IN_JAVA")
abstract class ReflectionNode<V, A : Actor?>(
        val instance: Any,
        fieldName: String,
        actor: A,
        var after: Runnable? = null
)
    : Tree.Node<Tree.Node<*,*,*>, V, A>(actor)
{
    var field : KMutableProperty<V>? = null

    init {
        try {
            field = instance::class.declaredMembers.find { it.name == fieldName }!! as KMutableProperty<V>

            val s = message()
            if (s.isNotBlank())
                StageWindow.tooltip(actor, s)
            // FIXME this tooltip is added, but does't show when hovered over.
        } catch (e: NullPointerException) {
            Utility.warnDev(" OPTIONS : SERIOUS : ${instance::class.simpleName}.$fieldName IS NOT A VALID PREFERENCE PROPERTY!")
        }
    }

    protected fun valueChanged(value : V) {
        field!!.setter.call(instance, value)
        after?.run()
    }

    protected fun value() : V = field!!.getter.call(instance)

    protected fun message() : String {
        try {
            return (field!!.annotations.find { it is NodeInfo } as NodeInfo).message
        } catch (e : Exception) {
            Utility.warnDev("${field!!.name} has no @NodeInfo.")
            return ""
        }
    }
}

/**
 * # Node which has a label displayed above the actor.
 * This is displayed in the same cell, using a [VerticalGroup].
 *
 * > N.B : This hides [actor]. under a titled node, [actor] reffers to the
 * [VerticalGroup], not the actor which performs. For that, use [_actor].
 */
abstract class TitledNode<V, A : Actor>(C: Any, fieldName: String, key: String, val _actor : A) : ReflectionNode<V, VerticalGroup>(C, fieldName, VerticalGroup()) {
    init {
        actor
            .fill()
            .align(Align.left)

        actor.addActor(Label(local(key), REF_SKIN_W95))
        actor.addActor(_actor)
    }
}

// ==========================
//#endregion abstract
//#region tree nodes
// ==========================


/**
 * # A node containing a label whose soul purpose is holding child nodes.
 */
class RootNode(key : String, vararg children : Tree.Node<*,*,*>) : Tree.Node<Tree.Node<*, *, *>, Tree.Node<*, *, *>, Actor>(Label(local(key), REF_SKIN_W95)) {
    init {
        children.forEach { add(it) }
//        super.getChildren().sort(Comparator { o1: Tree.Node<*,*,*>, o2: Tree.Node<*,*,*> ->
//            o1.name.compareTo(o2.name)
//        })
    }
}

/**
 * # A [ReflectionNode] which edits a boolean value.
 *
 * Defaults to field's value, and alters it upon change using a [Stagewindow#LambdaChangeListener]
 */
class CheckboxNode(C: Any, fieldName: String, key: String) : ReflectionNode<Boolean, CheckBox>(C, fieldName, CheckBox(local(key), REF_SKIN_W95)) {
    init {
        actor.isChecked = value()

        actor.addListener(StageWindow.LambdaChangeListener {
            valueChanged(actor.isChecked)
        })
    }
}

/**
 * # A [ReflectionNode] which edits a [number] value.
 *
 * Natively, the slider works with floats, but the output is
 * automatically cast to [V].
 *
 * Defaults to field's value, and alters it upon change using a [Stagewindow#LambdaChangeListener]
 *
 * Throws [ClassCastException] on initalization if [Float] cannot be cast to [V].
 */
class SliderNode<V : Number>(C : Any, fieldName: String, key : String, min : Float = 0f, max : Float = 100f, step : Float = 1f) : TitledNode<V, Slider>(C, fieldName, key, Slider(min, max, step, false, REF_SKIN_W95)) {
    init {
        // Evaluate V's ability to cast. Will throw exception if it's not a valid argument.
        try {
            _actor.value as V
        } catch (e : ClassCastException) {
            Utility.warnDev(" OPTIONS : SERIOUS : SLIDER TYPE CANNOT BE CAST TO FIELD TYPE : ${C::class.java.simpleName}.$fieldName & ${_actor.value::class.java.simpleName}")
        }

        actor.addListener(StageWindow.LambdaChangeListener{
            valueChanged(_actor.value as V)
        })

        // TODO this is a dangerous cast.
        _actor.value = value() as Float
    }
}


/**
 * # A [SelectBox] with a title.
 *
 * Displays [values] as items, and changes the field to the selected value.
 */
class SelectNode<V>(C: Any, fieldName: String, key: String, vararg values : V) : TitledNode<V, SelectBox<V>>(C, fieldName, key, SelectBox<V>(REF_SKIN_W95)) {
    init {
        _actor.items = com.badlogic.gdx.utils.Array(values)
        _actor.selected = value
        _actor.addListener(StageWindow.LambdaChangeListener {valueChanged(_actor.selected)})
    }
}

/**
 * # A node with a button that executes a [Runnable] when clicked.
 */
class ScriptNode(key: String, payload : Runnable) : Tree.Node<Tree.Node<*, *, *>, Runnable, TextButton>(TextButton(local(key), REF_SKIN_W95)) {
    init {
        actor.addListener(StageWindow.LambdaClickListener {payload.run()})
    }
}

class DoubleClickTreeListener(val tree: Tree<*,*>) : com.badlogic.gdx.scenes.scene2d.utils.FocusListener() {
    override fun handle(event: Event?): Boolean {
        return if (event is InputEvent && event.type == InputEvent.Type.touchDown) {
            tree.overNode?.apply { isExpanded = !isExpanded }
            true
        } else false
    }
}


//=======================
//#endregion tree nodes
//=======================