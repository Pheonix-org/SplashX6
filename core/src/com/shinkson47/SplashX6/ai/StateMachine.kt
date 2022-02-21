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

package com.shinkson47.SplashX6.ai

import java.util.function.Predicate

/**
 * # Script & State based behaviour system
 *
 * Where a system is in a given state, and switches between states on
 * given conditions.
 *
 * The script ran on every update is determined by which state we are currently
 * in.
 *
 * A state system can be constructed through it's api,
 * but once created it cannot be deconstructed or modified.
 *
 * @author [Jordan T. Gray](https://www.shinkson47.in) on 05/08/2021
 * @since PRE-ALPHA 0.0.3
 * @version 1
 */
open class StateMachine : Runnable {

    /**
     * ## If true, machine logs every state change.
     * False by default.
     */
    var enableDebugLogs = false

    /**
     * ## All states in this state machine.
     */
    private val states = ArrayList<State>()

    /**
     * ## Returns a given state from [states].
     *
     * @param index Index of the state to get.
     */
    fun getState(index : Int) = states[index]

    fun getState(state: State) = states.indexOf(state)

    /**
     * ## The state that is currently defining this machine's behaviour.
     *
     * TODO if not set, automatically inherited from default.
     */
    private var currentState: State
        get() = _currentState ?: throw UninitializedPropertyAccessException("\"tmp\" was queried before being initialized")

        set(value) {
            checkStateExists(value)
            _currentState = value
        }

    // lateinit with custom setter work-around for above.
    private var _currentState: State? = null

    /**
     * ## The state in which this system will start in.
     *
     * This ***MUST*** be set in the initializer of the implementing class.
     */
    private lateinit var defaultState: State

    /**
     * ## Executes the [StateMachine.State.script] of the [currentState].
     *
     * Following executing the script, the [currentState] will
     * check if any of it's [State.switchStates] conditions are met.
     * If any switch conditions are met, then the state machine will switch states,
     * naturally calling [State.exit] on [currentState], and [State.enter]
     * on the new state.
     *
     * > API NOTE : Will throw an [UninitializedPropertyAccessException]
     * if [defaultState] was not called before first run.
     * @see defaultState
     */
    override fun run() = currentState.run()

    /**
     * ## Simulates [n] updates to the state machine
     * by calling [run()] n times.
     *
     * Mostly for testing purposes
     *
     * @param n Number of times to update the machine.
     */
    fun run(n: Int) {
        for (i in 0..n)
            run()
    }

    // ===============================================
    //# region Initialisation API
    // Contains functions intended for use by the
    // implementing class to use whilst initialising,
    // to create the state machine.
    // ===============================================

    /**
     * ## Adds a state to this state machine
     *
     * @return (Boolean, Int)
     *
     * - Boolean : True if the element was added. (determined by [ArrayList.add])
     *
     * - Int : Index of the state after adding it to [states]. -1 if not added. (determined by [ArrayList.indexOf])
     */
    protected fun addState(state : State): Pair<Boolean, Int> = Pair(states.add(state), states.indexOf(state))

    /**
     * ## Defines which state this machine starts from.
     *
     * Alias for [defaultState], using [states]' indexes.
     */
    protected fun defaultState(stateIndex : Int) = defaultState(getState(stateIndex))

    /**
     * # Defines which state this machine starts from.
     *
     * > API Note : ***Must be called before the first [run]***
     *
     * Can only be called once, before [currentState] is initalised.
     *
     * Once called, machine is forced into [state].
     * @see forceState
     *
     * @throws IllegalArgumentException if [state] has not beed added to this machine via [addState].
     * @see addState
     *
     * @throws IllegalStateException if called more than once.
     */
    protected fun defaultState(state : State) {
        if (_currentState == null) {

            if (!states.contains(state))
                throw IllegalArgumentException()

            defaultState = state.also {
                forceState(it)
                it.enter()
            }
            print("defaulted to $state")
        } else
            throw IllegalStateException("This machine is already in a state!")
    }

    /**
     * Alias for [registerSwitchCondition], using state index positions instead.
     *
     * Indexes are equal to [states]' indexes (A.K.A the order in which the states were registered)
     *
     * > i.e (kotlin) registerSwitchCondition(0, 1) { Hunger > 3 }
     *
     * > i.e (java)   registerSwitchCondition(0, 1, () -> { Hunger > 3 });
     */
    protected fun registerSwitchCondition(stateIndex: Int, switchesToIndex: Int, _when: (t: Unit?) -> Boolean) =
        registerSwitchCondition(getState(stateIndex), getState(switchesToIndex), _when)

    /**
     * Adds a [StateMachine.State.switchStates] condition to [state],
     * which causes it to switch to [switchesTo] when [_when] is met during a [run] event.
     */
    protected fun registerSwitchCondition(state : State, switchesTo : State, _when : Predicate<Unit?>) {
        checkStateExists(state)
        checkStateExists(switchesTo)

        state.switchStates[_when] = switchesTo
    }


    // ===============================================
    //# endregion Initalisation API
    //# region companion
    // Utility methods which aid the state machine.
    // ===============================================

    /**
     * # Checks if [newState] is in [states]
     * If not, throws an [IllegalStateException]
     */
    private fun checkStateExists(newState: StateMachine.State) {
        if (!states.contains(newState))
            throw IllegalArgumentException("The state [$newState] does not exist in this state machine!")
    }


    /**
     * # Alias setter for [currentState].
     * Enters a given state without causing any triggers.
     *
     * @throws IllegalArgumentException if [state] has not beed added to this machine via [addState].
     * @see addState
     */
    @Deprecated("Avoids triggers & overrides the desired state of the state machine. Prefer switchState")
    fun forceState(state : State) {
        currentState = state
    }

    /**
     * # For when something goes terribly wrong within the [StateMachine], returns to [defaultState].
     */
    fun forceDefault() = forceState(defaultState)

    /**
     * # Switches to a new state.
     *
     * In doing so, triggers [StateMachine.State.exit] on [currentState], then
     * [StateMachine.State.enter] on [index].
     *
     */
    fun switchState(index: Int) = switchState(getState(index))

    /**
     * # Switches to a new state.
     *
     * In doing so, triggers [StateMachine.State.exit] on [currentState], then
     * [StateMachine.State.enter] on [index].
     *
     */
    private fun switchState(newState: StateMachine.State) {
        println("Switch state $currentState to $newState")
        checkStateExists(newState)

        currentState.exit()
        currentState = newState
        newState.enter()
    }

    private fun print(m : String) {
        if (enableDebugLogs)
            println("[State Machine '$name' $m]")
    }

    /**
     * # A state in which this state machine may be in.
     * Defines the final behaviour of this machine.
     *
     * It's [script] is ran on every state system update ([run]),
     * when this state is the [currentState].
     *
     * After running [script], [switchStates] are checked
     * to determine if the system should switch states.
     * @see checkStateSwitch
     */
    inner class State(

            /**
             * The user-friendly name of this state.
             */
            val name: String,

            /**
             * The main behaviour of this script.
             * Ran on every single state machine update.
             */
            private val script : Runnable,

            /**
             * The state machine which owns this state.
             */
            val parent : StateMachine,

            /**
             * Script ran when this state becomes [parent]'s [currentState].
             */
            private val enterScript : Runnable? = null,

            /**
             * Script ran when this state is no longer [parent]'s [currentState].
             */
            private val exitScript : Runnable? = null

        ) : Runnable {

        /**
         * A triaged list of predicates which determine
         * when this state should hand over control to another state.
         *
         * @see checkStateSwitch
         */
        internal val switchStates: HashMap<Predicate<Unit?>, State> = HashMap()

        /**
         * ## Executes [script], then calls [checkStateSwitch]
         */
        override fun run() {
            script.run()
            checkStateSwitch()
        }

        /**
         * ## Notification from parent this state is now [currentState].
         * Triggers [enterScript], if there is one.
         */
        internal fun enter() = enterScript?.run()

        /**
         * ## Notification from parent this state is no longer [currentState].
         * Triggers [exitScript], if there is one.
         */
        fun exit() = exitScript?.run()

        /**
         * # Checks if we should switch state, then switches states
         *
         * Checks through all [switchState] to find one that evaluates to true.
         *
         * If one is found, [switchState] is invoked on [parent] with it and the method returns without
         * checking any more [switchState]s.
         *
         * > N.B : Only the first passing predicate matters, thus the order of the [switchState] has importance
         */
        private fun checkStateSwitch() {
            switchStates.forEach {
                if (it.key.test(null)) {
                    parent.switchState(it.value)
                    return@forEach
                }
            }
        }
    }


    companion object {

        /**
         * # An object which has underlying statemachine behaviours.
         *
         * Just an alias for a [StateMachine], but reads nicer when implementing.
         */
        abstract class StateObject : StateMachine()
    }


    // ===============================================
    //# endregion companion
    // ===============================================


}

    fun main() {
        val machine = object : StateMachine("Counting Test Machine") {
            var i = 0

            init {
                addState(State("plus", { i++ }, this, enterScript = { println("Enter ++") }))
                addState(State("minus", { i-- }, this, enterScript = { println("Enter --") }))

                defaultState(0)

                registerSwitchCondition(0, 1) { i >= 4 }
                registerSwitchCondition(1, 0) { i == 0 }
            }
        }

        machine.run(100)
    }