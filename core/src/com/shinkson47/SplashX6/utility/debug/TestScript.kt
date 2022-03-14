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
 ░                                                                                                                                                                                ░
 ░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░*/

package com.shinkson47.SplashX6.utility.debug

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.math.Vector3
import com.badlogic.gdx.utils.Array
import com.shinkson47.SplashX6.game.GameData
import com.shinkson47.SplashX6.game.GameEndConditionChecker
import com.shinkson47.SplashX6.game.GameHypervisor
import com.shinkson47.SplashX6.game.units.Unit
import com.shinkson47.SplashX6.game.units.UnitClass
import com.strongjoshua.console.LogLevel

/**
 * # TODO
 * @author [Jordan T. Gray](https://www.shinkson47.in) on 01/06/2021
 * @since v1
 * @version 1
 */
object TestScript : Runnable {


    private var _fail : Boolean = false
    private fun log(Name: String, Message: String, fail: Boolean) {
        Console.log("[TEST ${if (fail) "FAILED" else "PASSED"} : ($Name) ] $Message", if(fail) LogLevel.ERROR else LogLevel.SUCCESS)
        if (fail) _fail = true
    }

    private fun header(tag: String) = header(tag, "==================================================")
    private fun header(tag: String, m: String) = Console.log("[$tag] $m")

    private fun testBetween(name: String, value: Int, target: Int) = testBetween(name, value, target, 0)
    private fun testBetween(name: String, value: Int, target: Int, permittedDeviance: Int){
        val min = target-permittedDeviance
        val max = target+permittedDeviance
        val failed = min != value && value != max && value != target;

        log (name,
            "Should be between $min and $max. Was $value",
            failed
            )
    }




    override fun run() {
        header("TEST BEGIN")
        _fail = false


        camera()
        units()
        //Looking at tile
        //isotocartesian
        //spawn location

        header("TEST END")
        header("TEST END", if (_fail) "One or more tests failed!" else "All tests passed!")
    }

    /**
     * # Tests relating to the camera
     */
    private fun camera() {
        header("TESTING CAMERA", "")
        camera_lookingAtY36()
        camera_lookingAtY40()
        camera_lookingAtY45()
        camera_lookingAtY50()
        camera_lookingAtY60()
    }



    // META : This is disgusting, but i don't care.
    private fun camera_lookingAtY36(){
        with (GameHypervisor.gameRenderer!!.cam!!) {
            desiredTilt.present = 36.0f
            val result = lookingAtY()
            val expected = position.y.toInt() + 1376
            testBetween("Camera#lookingAtY @ 36 degrees", result, expected, 1)
        }}
    private fun camera_lookingAtY40(){
        with (GameHypervisor.gameRenderer!!.cam!!) {
            desiredTilt.present = 40.0f
            val result = lookingAtY()
            val expected = position.y.toInt() + 1191
            testBetween("Camera#lookingAtY @ 40 degrees", result, expected, 1)
        }}
    private fun camera_lookingAtY45(){
        with (GameHypervisor.gameRenderer!!.cam!!) {
            desiredTilt.present = 45.0f
            val result = lookingAtY()
            val expected = position.y.toInt() + 1000
            testBetween("Camera#lookingAtY @ 45 degrees", result, expected, 1)
        }}
    private fun camera_lookingAtY50(){
        with (GameHypervisor.gameRenderer!!.cam!!) {
            desiredTilt.present = 50.0f
            val result = lookingAtY()
            val expected = position.y.toInt() + 839
            testBetween("Camera#lookingAtY @ 50 degrees", result, expected, 1)
        }}
    private fun camera_lookingAtY60(){
        with (GameHypervisor.gameRenderer!!.cam!!) {
            desiredTilt.present = 60.0f
            val result = lookingAtY()
            val expected = position.y.toInt() + 577
            testBetween("Camera#lookingAtY @ 60 degrees", result, expected, 1)
        }}











    private fun units(){
        header("TESTING UNITS", "")
        unit_location()
        AI_nation_dissolve()
    }


    /**
     * Checks if an AI player is automatically dissolved when they have no resources left.
     */
    private fun AI_nation_dissolve() {
        GameData.nations.find { it.ai }.apply {
            if (this == null) return@apply

            settlements.clear()

            // This task also uses the itterator of 'units'. Gdx does not allow nested use of array itterators,
            // so i delay the removal task until after the itterator.
            val removalList = ArrayList<Unit>()
            units.forEach { removalList.add(it) }
            removalList.forEach { GameHypervisor.unit_disband(it) }

            // Force detection. usually done async in turn_end.
            GameEndConditionChecker.run()

            if (GameData.nations.contains(this))
                log("AI_nation_dissolve", "Nation was not dissolved as expected after running out of resources.", true)
            else
                log("AI_nation_dissolve", "Nation was dissolved as expected after running out of resources.", false)
            return
        }

        log("AI_nation_dissolve", "There are no AI players in this game.", true)
    }

    private fun unit_location() {
        with (GameHypervisor.gameRenderer!!.cam) {

            GameHypervisor.unit_select(GameHypervisor.spawn(Vector3(0f,0f,0f), UnitClass.settler))

            // Have the camera at a known angle, so we know where it's looking.
            desiredTilt.present = 36f
            desiredTilt.desired = 36f

            // Move the camera to 0,0. To look at 1376Y at 36 degrees tile, we must be at 0Y
            GameHypervisor.camera_focusOn(0f,1376f)
            GameHypervisor.camera_skipMovement()

            // The cartesian Y that the camera should be looking at
            val expectedY = 1376

            // Is the camera looking where it should be?
            testBetween("Camera looking at 1376y", lookingAtY(), expectedY)

            // Is the camera at the location it should be?
            testBetween("Camera at 0x", position.x.toInt(), 0)
            testBetween("Camera at 0y", position.y.toInt(), 0)

            // Move the unit to where the camera is looking.
            GameHypervisor.unit_setDestination()
            val pos: Vector3 = GameHypervisor.camera_focusingOnTile()

            // is the selected tile the one we expect?
            testBetween("Selected 0x", pos.x.toInt(), 0)
            testBetween("Selected 86y", pos.y.toInt(), 86)
            Gdx.app.log("TEST META", "Above fails because of shitty cartesian to iso conversion. It gives 87, but it shouldn't be.")
            Gdx.app.log("TEST META", "Knowing this, next tests will use data for 87 instead.")


            with (GameData.selectedUnit!!) {
                setLocation(pos.x, pos.y)
                testBetween("Unit at 0x",       isoVec.x.toInt(), 0)
                testBetween("Unit at 87y",      isoVec.y.toInt(), 87)
                testBetween("Sprite at -32x",     x.toInt(), -32)
                testBetween("Sprite at 1392y",  y.toInt(), 1392)
            }

            GameHypervisor.unit_disband()

            // TODO is the unit at the cartesian x, y we expect?
        }
    }
}