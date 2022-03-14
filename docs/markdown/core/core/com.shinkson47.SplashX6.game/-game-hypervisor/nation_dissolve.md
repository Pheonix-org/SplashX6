//[core](../../../index.md)/[com.shinkson47.SplashX6.game](../index.md)/[GameHypervisor](index.md)/[nation_dissolve](nation_dissolve.md)

# nation_dissolve

[jvm]\
fun [nation_dissolve](nation_dissolve.md)(nation: [Nation](../-nation/index.md))

Eradicates the existance of a nation.

Breaks down the relationships involved with it, and removes it from GameData.nations

This does not remove the host from GameData.player, as it would cause too many null safety issues.

## See also

jvm

| | |
|---|---|
| [com.shinkson47.SplashX6.game.Nation](../-nation/dissolve.md) |  |

## Parameters

jvm

| | |
|---|---|
| nation | Nation to delete. |
