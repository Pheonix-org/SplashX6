package com.shinkson47.SplashX6.rendering.windows

import com.badlogic.gdx.scenes.scene2d.Actor
import com.badlogic.gdx.scenes.scene2d.ui.*
import com.badlogic.gdx.utils.Align
import com.shinkson47.SplashX6.rendering.StageWindow
import com.shinkson47.SplashX6.utility.Assets.SKIN
import com.shinkson47.SplashX6.utility.Utility
import com.shinkson47.SplashX6.utility.Utility.local
import kotlin.reflect.KMutableProperty
import kotlin.reflect.full.declaredMembers

/**
 * When added to a variable, [ReflectionNode] will
 * infer the message to display to the user.
 */
annotation class NodeInfo(val message : String)


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
        actor: A)
    : Tree.Node<Tree.Node<*,*,*>, V, A>(actor)

{
    var field : KMutableProperty<V>

    init {
        field = instance::class.declaredMembers.find { it.name==fieldName }!! as KMutableProperty<V>

        val s = message()
        if (s.isNotBlank())
            StageWindow.tooltip(actor, s)
        // FIXME this tooltip is added, but does't show when hovered over.
    }

    protected fun valueChanged(value : V) {
        (field as KMutableProperty).setter.call(instance, value)
    }

    protected fun value() : V = field.getter.call(instance) as V

    protected fun message() : String {
        try {
            return (field.annotations.find { it is NodeInfo } as NodeInfo).message
        } catch (e : Exception) {
            Utility.warn("${field.name} has no @NodeInfo.")
            return ""
        }
    }
}

object test {
    @JvmField @field:NodeInfo("No significance.") var testBool = false
}

class CheckboxNode(C: Any, fieldName: String, key: String) : ReflectionNode<Boolean, CheckBox>(C, fieldName, CheckBox(local(key), SKIN)) {
    init {
        actor.isChecked = value()

        super.getActor().addListener(StageWindow.LambdaChangeListener {
            valueChanged(actor.isChecked)
        })
    }
}

class ListNode<V>(C: Any, fieldName: String, key: String, vararg values : V) : ReflectionNode<V, VerticalGroup>(C, fieldName, VerticalGroup()) {
    init {
        actor
                .fill()
                .align(Align.left)

        actor.addActor(Label(local(key), SKIN))

        val list = SelectBox<V>(SKIN)
        actor.addActor(list)

        list.items = com.badlogic.gdx.utils.Array(values)
        list.selected = value
        list.addListener(StageWindow.LambdaChangeListener {valueChanged(list.selected)})
    }
}

class ScriptNode(key: String, payload : Runnable) : Tree.Node<Tree.Node<*, *, *>, Runnable, TextButton>(TextButton(local(key), SKIN)) {
    init {
        actor.addListener(StageWindow.LambdaClickListener {payload.run()})
    }
}

class RootNode(key : String, vararg children : Tree.Node<*,*,*>) : Tree.Node<Tree.Node<*, *, *>, Tree.Node<*, *, *>, Actor>(Label(local(key), SKIN)) {
    init {
        children.forEach { add(it) }
    }
}
