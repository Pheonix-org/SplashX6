//[core](../../../index.md)/[com.shinkson47.SplashX6.game.units](../index.md)/[UnitActionDictionary](index.md)/[get](get.md)

# get

[jvm]\
open operator override fun [get](get.md)(key: [UnitClass](../-unit-class/index.md)): [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)&lt;[UnitAction](../-unit-action/index.md)&gt;

##  Returns a collection of actions which the given unit can perform.

Results are appended to the actions of the [UnitClass._BASE](../-unit-class/_-b-a-s-e/index.md), thus actions assigned to the [UnitClass._BASE](../-unit-class/_-b-a-s-e/index.md) are available to all units.

#### Return

The actions that class of units is able to perform.

## Parameters

jvm

| | |
|---|---|
| key | The unit class to evaluate a list of actions for. |
