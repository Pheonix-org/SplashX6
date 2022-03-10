//[core](../../../index.md)/[com.shinkson47.SplashX6.input.mouse](../index.md)/[MouseHandler](index.md)

# MouseHandler

[jvm]\
open class [MouseHandler](index.md)Main mouse handling scripts

 This class is mostly just a container for InputAdapter's, which can script different actions. Different adapters can be set at different times / on different windows as required. 

#### Author

[Jordan T. Gray on 12/04/2021](https://www.shinkson47.in)

## Functions

| Name | Summary |
|---|---|
| [configureGameInput](configure-game-input.md) | [jvm]<br>open fun [configureGameInput](configure-game-input.md)(stage: Stage)<br>Configures for use in the game window Add all game window handlers in here. |
| [create](create.md) | [jvm]<br>open fun [create](create.md)()<br>Configures the multiplexer for first time use with |
| [Poll](-poll.md) | [jvm]<br>open fun [Poll](-poll.md)()<br>Permenant input scripts using |
| [reset](reset.md) | [jvm]<br>open fun [reset](reset.md)()<br>Removes all input handlers from |

## Properties

| Name | Summary |
|---|---|
| [GameZoomDragHandler](-game-zoom-drag-handler.md) | [jvm]<br>val [GameZoomDragHandler](-game-zoom-drag-handler.md): InputAdapter<br>Zooms and moves the game camera with middle mouse |
| [inputMultiplexer](input-multiplexer.md) | [jvm]<br>val [inputMultiplexer](input-multiplexer.md): InputMultiplexer<br>Main multiplexer Contains all input processors / handlers. |
