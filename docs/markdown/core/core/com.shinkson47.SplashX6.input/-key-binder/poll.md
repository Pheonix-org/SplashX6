//[core](../../../index.md)/[com.shinkson47.SplashX6.input](../index.md)/[KeyBinder](index.md)/[poll](poll.md)

# poll

[jvm]\
fun [poll](poll.md)()

# Checks for held keys and activates thier action every frame.

For [KeyBinding](-key-binding/index.md)'s where repeat is true, checks if the key is held and executes the binding's action.

[jvm]\
fun [poll](poll.md)(key: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), down: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html))

# For a given key press, tries to find and execute a binding that is active on the current screen.
