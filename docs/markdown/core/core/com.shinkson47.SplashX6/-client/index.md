//[core](../../../index.md)/[com.shinkson47.SplashX6](../index.md)/[Client](index.md)

# Client

[jvm]\
class [Client](index.md) : Game

# The main game

This is the entry point to Spalsh X6, and cascades LibGDX's api calls throughout the game's classes.

## Constructors

| | |
|---|---|
| [Client](-client.md) | [jvm]<br>fun [Client](-client.md)() |

## Types

| Name | Summary |
|---|---|
| [Companion](-companion/index.md) | [jvm]<br>object [Companion](-companion/index.md) |

## Functions

| Name | Summary |
|---|---|
| [create](create.md) | [jvm]<br>open override fun [create](create.md)() |
| [dispose](dispose.md) | [jvm]<br>open override fun [dispose](dispose.md)()<br>Save, close |
| [fadeScreen](fade-screen.md) | [jvm]<br>fun [fadeScreen](fade-screen.md)(newScreen: Screen) |
| [getScreen](index.md#1777134908%2FFunctions%2F971615585) | [jvm]<br>open fun [getScreen](index.md#1777134908%2FFunctions%2F971615585)(): Screen |
| [pause](index.md#522482088%2FFunctions%2F971615585) | [jvm]<br>open override fun [pause](index.md#522482088%2FFunctions%2F971615585)() |
| [render](render.md) | [jvm]<br>open override fun [render](render.md)()<br>Render, check for inputs, etc. |
| [resize](resize.md) | [jvm]<br>fun [resize](resize.md)()<br>open override fun [resize](index.md#401837943%2FFunctions%2F971615585)(p0: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), p1: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) |
| [resume](index.md#-1896781521%2FFunctions%2F971615585) | [jvm]<br>open override fun [resume](index.md#-1896781521%2FFunctions%2F971615585)() |
| [setScreen](set-screen.md) | [jvm]<br>open override fun [setScreen](set-screen.md)(screen: Screen?) |

## Properties

| Name | Summary |
|---|---|
| [currentScreen](current-screen.md) | [jvm]<br>var [currentScreen](current-screen.md): Screen? = null |
| [screen](index.md#-1304697392%2FProperties%2F971615585) | [jvm]<br>val [screen](index.md#-1304697392%2FProperties%2F971615585): Screen |
