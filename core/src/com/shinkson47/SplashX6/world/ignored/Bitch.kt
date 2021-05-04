/**
 * # Jordan's Kotlin Notes
 * Docstrings are markdown, not HTML. Awesome!
 */
// Package is the top level declaration
// JVM requires to know what package this script is in.
package com.shinkson47.SplashX6.world.ignored


/**
 * # Entry point
 *
 * Defined at ***script level***
 *
 * Kotlin is a scripting language that supports java's object oriented design.
 * Java is strictly object oriented.
 *
 * Anything outside of a class is ***script level***, and can be used just like in python.
 * It's code that can be ran, but does not define an object.
 */
fun main() {
    // Unlike java, kotlin does not completely ignore new line whitespace. A new line can be used as a replacement for ';'
    // Statements DO NOT require a ';' if seperated by a new line.
    var i: Bitch = Bitch.giveBirthToANewBitchPlease()

    // But multiple statements on the same line require a seperator character.
    val x = x(); val j: Int = Bitch.addOne(x)
}

/**
 * # Script level function
 * private scoped, accessable from anywhere in this file - script level, class, subclass, etc.
 */
private fun x() = 1 + 1




/**
 * # Script level object
 * Contains constructor parameters.
 * @author [Jordan T. Gray on 25/03/2021](https://www.shinkson47.in)
 * @version 1
 * @since v1
 */
class Bitch(BitchParam1: Int, BitchParam2: Int) {

    /**
     * # Alternate constructor parameters
     * object constructor takes in all possible parameters,
     * this defines an alternate choice of paramters that can be used to create this
     * object with.
     */
    constructor(BitchParam1: Int) : this(BitchParam1, BitchParam1)

    /**
     * # Alternate constructor with no parameters
     */
    constructor() : this(1,1)

    // However, overloads like this aren't typically needed in kotlin.
    /**
     * # Default values
     */
    fun defaults(s: String = "Default Value"){
        println(s);
    }

    /**
     * # Default values
     * ? = nullable. On a parameter, means that value is optional.
     */
    fun optional(i: Int, s: String? = ""){
        println(s);
    }

    init {
        optional(1);
        defaults();
    }

    /**
     * # Strongly typed object level variable
     *
     * Type is specified, and content must be of this type
     */
    var a: Int

    /**
     * # Deffered assignment using script level function.
    * Not assigned at beginning, but can only be assigned an integer.
    * variable cannot be used before it is initalised (Nulls are not allowed)
    */
    init { a = x(); }

    /**
     * # Inferred type
     *
     * Type is not specified, but is infered.
     *
     * Type cannot be changed, so even though it's not specified it can only take an integer because it was created with an integer.
     */
    var b = BitchParam1

    /**
     * # Inferred variables cannot have deffered assignments.
     */
    //    init {
    //        b = 1;
    //    }

    /**
     * # Null values are not possible.
     */
    //var hello: Bitch;

    /**
     * # Get / set
     */
    var getme: String = ""
        // Ternaries don't exist :(
        get() { if (field == "notValid") TODO() else return field }

        set(value) { if (value != "notValid") field = value; }

    /**
     * # Constructor replacement.
     * Does not require object name, just a key word.
     *
     * Can take parameters like a function would.
     *
     * Similar to java's anonymous constructor.
     * Can have multiple.
     */
    init {

    }

    /**
     * # Companion to this object
     * Where you would put your utilities for classes of this type
     */
    companion object {

        /**
         * # Equivelant of java's:
         * ```
         * static {
         *
         * }
         * ```
         */
        init {

        }

        /**
         * # Factory for creating bitches
         * As a companion, this is essentially a static utility method.
         *
         * Accessed as `Bitch.giveBirthToANewBitchPlease`
         */
        fun giveBirthToANewBitchPlease(): Bitch = Bitch(1);

        /**
         * # Static Inline function
         * I WISH java had this. Similar to C#, you can just specify a return value
         * or a simple method call without needing a code block.
         */
        fun addOne(value: Int): Int = value + 1
    }

    /**
     * # Instantiable sub class
     */
    class subClass @JvmOverloads constructor(Ass: Int, Ass2: Int = 1)  {

        /**
         * # Companion tools for sub class
         */
        companion object {

        }
    }

    /**
     * Typical style is to place initalisers at the bottom, out of the way.
     */
    init {

    }
}