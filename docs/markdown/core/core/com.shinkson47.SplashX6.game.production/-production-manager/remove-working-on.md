//[core](../../../index.md)/[com.shinkson47.SplashX6.game.production](../index.md)/[ProductionManager](index.md)/[removeWorkingOn](remove-working-on.md)

# removeWorkingOn

[jvm]\
fun [removeWorkingOn](remove-working-on.md)(): [PT](index.md)

##  Remove the item currently being worked on.

Either because it's cancelled, or completed.

Once removed, invokes [System.gc](https://docs.oracle.com/javase/8/docs/api/java/lang/System.html#gc--) in an attempt to clean up the removed project.
