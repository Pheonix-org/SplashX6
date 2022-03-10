//[core](../../../index.md)/[com.shinkson47.SplashX6.input.mouse](../index.md)/[MouseHandler](index.md)/[inputMultiplexer](input-multiplexer.md)

# inputMultiplexer

[jvm]\
val [inputMultiplexer](input-multiplexer.md): InputMultiplexer

Main multiplexer Contains all input processors / handlers. LibGDX can only use one input processor at a time, but if you assign a multiplexer, and add multiple processors to the multiplexer, you can have multiple input handlers active at the same time.  This is always the input processor, and all input handers should be added to this.  use [reset](reset.md) to start from fresh, such as when switching screens.
