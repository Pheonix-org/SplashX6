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

package com.shinkson47.SplashX6.utility

import box2dLight.RayHandler
import com.badlogic.gdx.Game
import com.badlogic.gdx.Input
import com.badlogic.gdx.Preferences
import com.badlogic.gdx.utils.Array
import com.shinkson47.SplashX6.Client
import com.shinkson47.SplashX6.Client.Companion.DEBUG_MODE
import com.shinkson47.SplashX6.Client.Companion.client
import com.shinkson47.SplashX6.audio.AudioController
import com.shinkson47.SplashX6.audio.Spotify
import com.shinkson47.SplashX6.game.GameData
import com.shinkson47.SplashX6.game.GameHypervisor
import com.shinkson47.SplashX6.game.Nation
import com.shinkson47.SplashX6.game.NationType
import com.shinkson47.SplashX6.game.cities.CityType
import com.shinkson47.SplashX6.game.cities.Settlement
import com.shinkson47.SplashX6.game.units.Unit
import com.shinkson47.SplashX6.game.units.UnitClass
import com.shinkson47.SplashX6.game.world.WorldTerrain
import com.shinkson47.SplashX6.rendering.screens.WorldCreation
import com.shinkson47.SplashX6.rendering.screens.game.GameScreen
import com.shinkson47.SplashX6.utility.APICondition.Companion.REQ_IN_GAME
import com.shinkson47.SplashX6.utility.APICondition.Companion.invalidCall
import com.strongjoshua.console.CommandExecutor
import com.strongjoshua.console.GUIConsole
import com.strongjoshua.console.LogLevel
import com.strongjoshua.console.annotation.ConsoleDoc
import java.io.File


object Console : GUIConsole() {
    init {
        setCommandExecutor(X6CommandExecutor())
        displayKeyID = Input.Keys.F12
        logToSystem = true
        consoleTrace = DEBUG_MODE

        setSize(700, GraphicalConfig.displayMode.height)
        setPosition(GraphicalConfig.displayMode.width,0)

        Thread(SystemListener()).start()

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
        fun fs() { GraphicalConfig.toggleFullscreen(); console.log("Toggled fullscreen.") }

        @ConsoleDoc(description = "Disable camera - quickly stop the camera from moving.")
        fun dc() { GameHypervisor.gameRenderer?.cam!!.toggleMovement(); console.log("Toggled camera movement.") }

        @ConsoleDoc(description = "Exits the game.")
        fun halt() { exitApp() }
        @ConsoleDoc(description = "Exits the game.")
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
        fun endGame() { GameHypervisor.AssertEndGame() }

        @ConsoleDoc(description = "Switches the client to display GameHypervisor.gameRenderer")
        fun showGameScreen() {
            GameHypervisor.switchToGameScreen()
        }

        @ConsoleDoc(description = "Creates a new game screen without altering the game.")
        fun newGameScreen() {
            GameHypervisor.newGameRenderer()
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
                    GameHypervisor.EndGame()
                    GameHypervisor.load(this)
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
                GameHypervisor.spawn(
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
        fun newNation() = console.log("Generated civilisation : ${GameHypervisor.nation_new_random()}")


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
                GameHypervisor.nation_new(
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
            GameHypervisor.nation_dissolve(parseNationIndex(nationIndex))
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

        @ConsoleDoc(description = "Selects any unit in the game, regardless of what nation they belong to.",
                    paramDescriptions = [
                    "The index ID of the nation to look at. See 'peekNations'",
                    "The index ID of the unit in that nation. See 'peekUnits'."])
        fun selectunit(nationIndex: Int, unitIndex: Int) {
            parseUnitIndex(nationIndex, unitIndex)
            GameHypervisor.unit_select(unitIndex, parseNationIndex(nationIndex))
            console.log("Selected = ${GameHypervisor.unit_selected()}")
        }


        @ConsoleDoc(description = "Disbands the selected unit.")
        fun disband() {
            console.log("Disbanded ${GameHypervisor.unit_disband_global()}.")
        }

        @ConsoleDoc(description = "Focusses the camera on the given isometric co-ordinate.",
                    paramDescriptions = ["Isometric Y position", "Isometric Y position"])
        fun lookat(x: Int, y: Int) =
            WorldTerrain.isoToCartesian(x,y).apply { GameHypervisor.camera_focusOn(this.x, this.y) }

        fun lookAtSelected() =
            GameHypervisor.unit_selected()?.let { GameHypervisor.camera_focusOn(it) }

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

        //=============================
        //#endregion audio
        //=============================


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
