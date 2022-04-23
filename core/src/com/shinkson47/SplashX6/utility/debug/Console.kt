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
 ░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░*/

package com.shinkson47.SplashX6.utility.debug

import box2dLight.RayHandler
import com.badlogic.gdx.Input
import com.badlogic.gdx.Preferences
import com.badlogic.gdx.utils.Array
import com.shinkson47.SplashX6.Client.Companion.DEBUG_MODE
import com.shinkson47.SplashX6.Client.Companion.client
import com.shinkson47.SplashX6.audio.AudioController
import com.shinkson47.SplashX6.audio.Spotify
import com.shinkson47.SplashX6.game.GameData
import com.shinkson47.SplashX6.game.Hypervisor
import com.shinkson47.SplashX6.game.Nation
import com.shinkson47.SplashX6.game.NationType
import com.shinkson47.SplashX6.game.cities.CityType
import com.shinkson47.SplashX6.game.cities.Settlement
import com.shinkson47.SplashX6.game.units.Unit
import com.shinkson47.SplashX6.game.units.UnitClass
import com.shinkson47.SplashX6.game.world.WorldTerrain
import com.shinkson47.SplashX6.rendering.screens.WorldCreation
import com.shinkson47.SplashX6.utility.APICondition.Companion.REQ_IN_GAME
import com.shinkson47.SplashX6.utility.APICondition.Companion.invalidCall
import com.shinkson47.SplashX6.utility.Assets
import com.shinkson47.SplashX6.utility.Utility
import com.shinkson47.SplashX6.utility.configuration.GraphicalConfig
import com.strongjoshua.console.CommandExecutor
import com.strongjoshua.console.GUIConsole
import com.strongjoshua.console.LogLevel
import com.strongjoshua.console.annotation.ConsoleDoc
import java.io.File


object Console : GUIConsole() {

    var consoleTrace : Boolean
        get() = consoleTrace
        set(v) { consoleTrace = v}

    init {
        setCommandExecutor(X6CommandExecutor())
        displayKeyID = Input.Keys.F12
        logToSystem = true
        consoleTrace = DEBUG_MODE

        setSize(700, GraphicalConfig.displayMode.height)
        setPosition(GraphicalConfig.displayMode.width,0)

        Utility.dispatchDaemonThread("Console", SystemListener())

        // TODO enable with debug mode?
    }

    class X6CommandExecutor : CommandExecutor() {

        //=============================
        //#region technical & misc
        //=============================


        @ConsoleDoc(description = "Invokes garbage collection.")
        fun gc() { System.gc(); console.log("Invoked garbage collection. ")}

        @ConsoleDoc(description = "Deselect - quickly unfocuses the console.")
        fun ds() { logView(); console.log("Keyboard focus removed from console.") }

        @ConsoleDoc(description = "Toggle fullscreen")
        fun fs() {
            GraphicalConfig.toggleFullscreen(); console.log("Toggled fullscreen.") }

        @ConsoleDoc(description = "Disable camera - quickly stop the camera from moving.")
        fun dc() { Hypervisor.gameRenderer?.cam!!.toggleMovement(); console.log("Toggled camera movement.") }

        @ConsoleDoc(description = "Forces the JVM to halt.")
        fun halt() { System.exit(2) }
        @ConsoleDoc(description = "Requests GDX to exit the game.")
        fun exit() { exitApp() }

        @ConsoleDoc(description = "Deletes user preferences from disk.")
        fun purgePreferenceData() { Assets.get<Preferences>(Assets.PREFERENCES).apply { clear(); flush() } }


        @ConsoleDoc(description = "Changes what button opens the console until the game is restarted.",
        paramDescriptions = ["The name of the key to use. i.e 'F12'."])
        fun setTerminalKey(char: String) {
            Input.Keys.valueOf(char).apply {
                if (this == -1)
                    console.log("Unrecognised character name", LogLevel.ERROR)
                else {
                    displayKeyID = this
                    console.log("Console will now show when $char is pressed.")
                }
            }
        }

        //=============================
        //#endregion technical & misc
        //#region Hypervisor
        //=============================

        @ConsoleDoc(description = "Instantly creates a new game.")
        fun newGame() {
            endGame()
            WorldCreation().apply {
                client!!.fadeScreen(this)
                controller.switchState(2)
            }
        }

        @ConsoleDoc(description = "Ends the game.")
        fun endGame() { Hypervisor.assertEndGame() }

        @ConsoleDoc(description = "Switches the client to display GameHypervisor.gameRenderer")
        fun showGameScreen() {
            Hypervisor.switchToGameScreen()
        }

        @ConsoleDoc(description = "Creates a new game screen without altering the game.")
        fun newGameScreen() {
            Hypervisor.newGameRenderer()
        }


        @ConsoleDoc(description = "Attempts to load the specified save file.",
                    paramDescriptions = ["Absolute path to the .X6 file."])
        fun load(path : String) {
            with (File(path)) {
                if (!exists()) {
                    console.log("No such file exists.", LogLevel.ERROR)
                    return
                }
                if (!path.endsWith(".X6")) {
                    console.log("That path does not have the .X6 file extension.", LogLevel.ERROR)
                    return
                }

                try {
                    Hypervisor.endGame()
                    Hypervisor.load(this)
                } catch (e : Exception) {
                    console.log(e)
                }
            }
        }


        @ConsoleDoc(description = "peeks all nations in Game Data.")
        fun peekNations(){
            var x = 0
            GameData.nations.forEach {
                console.log("[$x] $it")
                x ++
            }
        }

        @ConsoleDoc(description = "peeks all possible types of nations.")
        fun peekNationClasses() {
            NationType.values().forEach {
                console.log(it.toString())
            }
        }

        @ConsoleDoc(description = "peeks all possible types of classes.")
        fun peekUnitClasses() {
            UnitClass.values().forEach {
                console.log(it.toString())
            }
        }

        @ConsoleDoc(description = "peeks all possible types of settlements.")
        fun peekCityClasses() {
            CityType.values().forEach {
                console.log(it.toString())
            }
        }

        @ConsoleDoc(description = "Spawns a settler under the specified nation.",
                    paramDescriptions = [
                        "The type if unit to spawn. See 'peekUnitClasses'.",
                        "Isometric X co-ordinate to spawn at.",
                        "Isometric Y co-ordinate to spawn at.",
                        "The nation the unit should belong to. See 'peekNations'."
                    ])
        fun spawn(classification: String, x: Int, y: Int, nationIndex: Int) {
            if (invalidCall(REQ_IN_GAME, { console.log("No game is loaded.", LogLevel.ERROR); }))
                return

            if (!GameData.world!!.isInWorld(x,y)) {
                console.log("co-ordinate is outside of world", LogLevel.ERROR)
                return
            }

            try {
                Hypervisor.spawn(
                    x,
                    y,
                    UnitClass.valueOf(classification),
                    parseNationIndex(nationIndex)
                )
            } catch (e: IllegalArgumentException) {
                console.log("Not a valid unit classification. See : 'classUnit' ", LogLevel.ERROR)
            }
        }

        @ConsoleDoc(description = "Removes the fog of war.")
        fun removeFogOfWar() {
            GameData.world?.removeFogOfWar()
        }

        @ConsoleDoc(description = "Creates a new AI controlled civilisation in the current game of a random type.")
        fun newNation() = console.log("Generated civilisation : ${Hypervisor.nation_new_random()}")


        @ConsoleDoc(description = "Creates a new AI controlled civilisation in the current game.",
            paramDescriptions = [
                "The classification of nation, i.e the country. See 'peekNationClasses'"
            ])
        fun newNation(type: String) =
            newNation(type, true)

        @ConsoleDoc(description = "Creates a new civilisation in the current game.",
                    paramDescriptions = [
                        "The classification of nation, i.e the country. See 'peekNationClasses'",
                        "Enable automated AI control over this nation?"
                    ])
        fun newNation(type: String, ai: Boolean) {
            if (invalidCall(REQ_IN_GAME, { console.log("No game is loaded.", LogLevel.ERROR);}))
                return

            try {
                Hypervisor.nation_new(
                    NationType.valueOf(type),
                    ai
                )
            } catch (e: IllegalArgumentException) {
                console.log(e)
                console.log("Invalid nation classification. See 'peekNationClasses'")
                return
            }
            peekNations()
            console.log("Created a new nation.")
        }

        @ConsoleDoc(description = "Erraticates the existance of a nation.",
            paramDescriptions = ["The index ID of the nation to look at. See 'peekNations'"])
        fun dissolveNation(nationIndex: Int) {
            Hypervisor.nation_dissolve(parseNationIndex(nationIndex))
            peekNations()
            console.log("Dissolved Nation")
        }

        @ConsoleDoc(description = "peeks the cities in the local player's nation.")
        fun cities() {
            GameData.player!!.cityNames().forEach {
                console.log(it)
            }
        }

        @ConsoleDoc(description = "peeks the cities in the given nation.",
                    paramDescriptions = ["The index ID of the nation to look at. See 'peekNations'"])
        fun peekCities(index : Int) {
            logWithIndex(parseNationIndex(index).settlements)
        }

        @ConsoleDoc(description = "Displays information about a given city.",
            paramDescriptions = [
                "The index ID of the nation to look at. See 'peekNations'",
                "The index ID of the city in that nation. See 'peekCities'."])
        fun peekCity(nationIndex: Int, cityIndex: Int) {
            console.log(parseCityIndex(nationIndex, cityIndex).toString())
        }

        @ConsoleDoc(description = "peeks the units in the given nation.",
            paramDescriptions = ["The index ID of the nation to look at. See 'peekNations'"])
        fun peekUnits(index : Int) {
            logWithIndex(parseNationIndex(index).units)
        }

        @ConsoleDoc(description = "Displays information about a given unit.",
            paramDescriptions = [
                "The index ID of the nation to look at. See 'peekNations'",
                "The index ID of the unit in that nation. See 'peekUnits'."])
        fun peekUnit(nationIndex: Int, cityIndex: Int) {
            console.log(parseUnitIndex(nationIndex, cityIndex).toString())
        }

        @ConsoleDoc(description = "Shows what unit is selected.")
        fun peekSelected() {
            GameData.selectedUnit.apply {
                console.log(
                    if (this == null) "No unit is selected."
                    else "$this, ${ownedBy()}"
                )
            }
        }

        @ConsoleDoc(description = "Selects any unit in the game, regardless of what nation they belong to.",
                    paramDescriptions = [
                    "The index ID of the nation to look at. See 'peekNations'",
                    "The index ID of the unit in that nation. See 'peekUnits'."])
        fun selectunit(nationIndex: Int, unitIndex: Int) {
            parseUnitIndex(nationIndex, unitIndex)
            Hypervisor.unit_select(unitIndex, parseNationIndex(nationIndex))
            console.log("Selected = ${Hypervisor.unit_selected()}")
        }

        @ConsoleDoc(description = "Sets the health of a unit.",
            paramDescriptions = [
                "The index ID of the nation to look at. See 'peekNations'",
                "The index ID of the unit in that nation. See 'peekUnits'.",
                "The new health of the unit. (typically out of ten, but may change. Will automatically be clamped in valid range.)"])
        fun pokeHealth(nationIndex: Int, unitIndex: Int, health: Int) {
            parseUnitIndex(nationIndex, unitIndex).apply {
                hp = health
                console.log("Health = $hp")
            }
        }

        @ConsoleDoc(description = "Teleports the selected unit to a location.",
            paramDescriptions = ["X destination", "Y destination."])
        fun teleport(X: Int, Y: Int) {
            Hypervisor.unit_selected()?.let{
                it.setLocation(X, Y)
                Hypervisor.unit_view()
            } ?: run {
                Console.log("There is no unit selected.",LogLevel.ERROR)
            }
        }


        @ConsoleDoc(description = "Disbands the selected unit.")
        fun disband() {
            console.log("Disbanded ${Hypervisor.unit_disband()}.")
        }

        @ConsoleDoc(description = "Focusses the camera on the given isometric co-ordinate.",
                    paramDescriptions = ["Isometric Y position", "Isometric Y position"])
        fun lookat(x: Int, y: Int) =
            WorldTerrain.isoToCartesian(x,y).apply { Hypervisor.camera_focusOn(this.x, this.y) }

        fun lookAtSelected() =
            Hypervisor.unit_selected()?.let { Hypervisor.camera_focusOn(it) }

        @ConsoleDoc(description = "Chages the position of a unit.",
                    paramDescriptions = [
                        "The index ID of the nation.",
                        "The index ID of the unit within that nation.",
                        "The new Isometric X location",
                        "The new Isometric Y location",
                    ])
        fun tp(nationIndex: Int, unitIndex: Int, x: Float, y: Float) =
            parseUnitIndex(nationIndex, unitIndex).isoVec.set(x,y,0f)


        @ConsoleDoc(description = "Adds a static light source to the world.",
                    paramDescriptions = ["X", "Y", "Radius of the  lighting.", "The number of rays to cast."])
        fun staticlight(x: Float, y: Float, radius: Float, rays: Int) =
            GameData.world!!.staticLight(x,y, radius, rays)

        @ConsoleDoc(description = "Deletes all light sources.")
        fun clearLights() =
            GameData.world!!.rayHandler.removeAll()

        @ConsoleDoc(description = "Determines if lighting is diffused.")
        fun diffuseLights(boolean: Boolean) =
            RayHandler.useDiffuseLight(boolean)

        //=============================
        //#endregion Hypervisor
        //#region audio
        //=============================

        @ConsoleDoc(description = "Mutes the audio manager.")
        fun mute() = mute(!AudioController.isMuted)

        @ConsoleDoc(description = "Mutes the audio manager.", paramDescriptions = ["true to mute, false to unmute."])
        fun mute(boolean: Boolean) {
            AudioController.isMuted = boolean
            console.log("isMuted = $boolean")
        }

        @ConsoleDoc(description = "Configures spotify with the given API auth key.")
        fun spotifyConnect(key: String) {
            Spotify.create(key)
        }

        @ConsoleDoc(description = "Runs in-game unit test script")
        fun test(){
            TestScript.run()
        }

        @ConsoleDoc(description = "Toggles weather or not exceptions in console instructions are shown.")
        fun toggleExceptions() {
            Console.consoleTrace = !Console.consoleTrace
            console.log("Exception logging = ${Console.consoleTrace}")
        }

        @ConsoleDoc(description = "Shows information about a tile.")
        fun peekTile(x: Int, y: Int) {
            if (!Hypervisor.inGame) {
                console.log("No game is loaded.", LogLevel.ERROR)
                return
            }

            with (GameData.world!!) {
                if (!isInWorld(x,y)) {
                    console.log("Co-ordinate out of the world!", LogLevel.ERROR)
                    return
                }

                getTile(x,y)?.apply {
                    console.log(
                        """
                        Full resource name : $tileName
                        Is land? : $isLand
                        Is Water? : $isWater
                        Is navigable : ${isNavligable(x,y)}            
                        Location : $x, $y
                        """.trimIndent()
                    )
                } ?: {
                    console.log("Though inside the world, no tile was found at this location.", LogLevel.ERROR)
                }
            }
        }

        //=============================
        //#endregion audio
        //=============================

        @ConsoleDoc(description = "Sets the base unit production power of a given city.", paramDescriptions = ["Index of the nation", "Index of the city in the nation", "The new base power value"])
        fun pokeUnitProductionPower(nationIndex: Int, cityIndex: Int, power: Int) {
            parseCityIndex(nationIndex, cityIndex).unitProduction.apply {
                basePower = power
                contributionPower = evaluatePower()
            }
        }

        @ConsoleDoc(description = "Sets the base unit production power of a given city.", paramDescriptions = ["Index of the nation", "Index of the city in the nation"])
        fun peekUnitProductionPower(nationIndex: Int, cityIndex: Int) {
            log(parseCityIndex(nationIndex, cityIndex).unitProduction.basePower.toString())
        }

        @ConsoleDoc(description = "Sets the base unit production power of a given city.", paramDescriptions = ["Index of the nation", "Index of the city in the nation", "The new base power value"])
        fun pokeAdvancementProductionPower(nationIndex: Int, power: Int) {
            parseNationIndex(nationIndex).advancementProuction.apply {
                basePower = power
                contributionPower = evaluatePower()
            }
        }

        @ConsoleDoc(description = "Sets the base unit production power of a given city.", paramDescriptions = ["Index of the nation", "Index of the city in the nation"])
        fun peekAdvancementProductionPower(nationIndex: Int) {
            log(parseNationIndex(nationIndex).advancementProuction.basePower.toString())
        }



            private fun parseNationIndex(i: Int): Nation {
            try {
                return GameData.nations[i]
            } catch (e: IndexOutOfBoundsException) {
                console.log("Invalid nation index. See 'peekNations'.")
                throw Exception("Invalid nation index.")
            }
        }

        private fun parseCityIndex(nation: Int, cityIndex: Int): Settlement {
            try {
                return parseNationIndex(nation).settlements[cityIndex]
            } catch (e: IndexOutOfBoundsException) {
                console.log("Invalid city index. See 'peekNations'.")
                throw Exception("Invalid city index.")
            }
        }

        private fun parseUnitIndex(nation: Int, unitIndex: Int): Unit {
            try {
                return parseNationIndex(nation).units[unitIndex]
            } catch (e: IndexOutOfBoundsException) {
                console.log("Invalid Unit index. See 'peekNations'.")
                throw Exception("Invalid Unit index.")
            }
        }

        private fun logWithIndex(a: Collection<*>) {
            var x = 0
            a.forEach {
                console.log("[$x] $it")
                x++
            }
        }

        private fun logWithIndex(a: Array<*>) {
            var x = 0
            a.forEach {
                console.log("[$x] $it")
                x++
            }
        }
    }

    /**
     * A simple thread which listens for input in the system terminal,
     * and forwards it into the [Console].
     *
     * @constructor Create empty constructor for system listener
     */
    class SystemListener : Runnable {
        override fun run() {
            while (true){
                Console.execCommand(readLine())
            }
        }
    }
}