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
     * # All states in this state machine.
     */
    private val states = ArrayList<State>()
    fun getState(index : Int) = states[index]

    /**
     * # The state that is currently defining this machine's behaviour.
     */
    private lateinit var currentState: State
    private lateinit var defaultState: State

    /**
     * # Runs the [StateMachine.State.script] of the [currentState].
     *
     * > API NOTE : Will throw an [UninitializedPropertyAccessException]
     * if [defaultState] was not called before first run.
     */
    override fun run() = currentState.run()

    fun run(int: Int) {
        for (i in 0..int)
            run()
    }

    // ===============================================
    //# region API
    // ===============================================

    /**
     * # Adds a state to this state machine
     */
    fun addState(state : State) = states.add(state)

    /**
     * # Alias for [defaultState], using [states]' indexes.
     */
    fun defaultState(stateIndex : Int) = defaultState(getState(stateIndex))

    /**
     * # Defines which state this machine starts from.
     *
     * Must be called before the first [run]
     *
     * May only be called once, whilst the machine is not in a state.
     */
    fun defaultState(state : State) {
        if (!this::currentState.isInitialized) {
            defaultState = state
            forceState(defaultState)
        } else
            throw IllegalStateException("This machine is already in a state!")
    }

    /**
     * Alias for [registerSwitchCondition], using state index positions instead.
     *
     * Indexes are equal to [states]' indexes (A.K.A the order in which the states were registered)
     */
    fun registerSwitchCondition(stateIndex: Int, switchesToIndex: Int, _when: (t: Unit?) -> Boolean) =
        registerSwitchCondition(getState(stateIndex), getState(switchesToIndex), _when)

    /**
     * Adds a [StateMachine.State.switchStates] condition to [state],
     * which causes it to switch to [switchesTo] when [_when] is met.
     */
    fun registerSwitchCondition(state : State, switchesTo : State, _when : Predicate<Unit?>) {
        checkStateExists(state)
        checkStateExists(switchesTo)

        state.switchStates[_when] = switchesTo
    }

    /**
     * # For when something goes terribly wrong within the [StateMachine], returns to [defaultState].
     */
    fun shitTheBedWhatTheFuck() = switchState(defaultState)

    // ===============================================
    //# endregion API
    //# region companion
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
     */
    fun forceState(state : State) {
        currentState = state
        currentState = state
    }

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

    /**
     * # A given behavioural state
     *
     * Ran on every state system update, when
     * this state is the current state of focus.
     *
     * After running, [switchStates] are checked
     * to determine if the system should swich states.
     */
    inner class State(
        private val script : Runnable,
        val parent : StateMachine,

        private val enterScript : Runnable? = null,
        private val exitScript : Runnable? = null
        ) : Runnable {

        internal val switchStates: HashMap<Predicate<Unit?>, State> = HashMap()

        /**
         * # Executes [script], then calls [checkStateSwitch]
         */
        override fun run() {
            script.run()
            checkStateSwitch()
        }

        /**
         * # Notification of this state being entered.
         * Triggers [enterScript], if there is one.
         */
        fun enter() = enterScript?.run()

        /**
         * # Notification of this state being exited.
         * Triggers [exitScript], if there is one.
         */
        fun exit() = exitScript?.run()

        /**
         * # Checks if we should switch state, and switches [parent] to the first required state.
         *
         * > N.B : Only the first matching condition matters, thus the order of the conditions matters.
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
        val machine = StateMachine()
        var i = 0

        with (machine) {
            addState(State({i++}, this,  enterScript = { println("Enter ++") } ))
            addState(State({i--}, this,  enterScript = { println("Enter --") } ))

            defaultState(0)

            registerSwitchCondition(0, 1) { i >= 4 }
            registerSwitchCondition(1, 0) { i == 0 }

            for ( x in 0..100 ) {
                run()
                println(i)
            }
        }
    }