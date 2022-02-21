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

package com.shinkson47.SplashX6.test

import com.shinkson47.SplashX6.Client
import com.shinkson47.SplashX6.rendering.screens.MainMenu
import com.shinkson47.SplashX6.rendering.screens.SplashScreen
import java.lang.Thread.sleep

/**
 * # Checks that the environment appears ready for a release build.
 * @author [Jordan T. Gray](https://www.shinkson47.in) on 27/07/2021
 * @since PRE-ALPHA 0.0.2
 * @version 1
 */
class ReleaseTest : Tester() {

    /**
     * ## Performs tests.
     * > N.B > You ___must___ call [assert] with the result of your tests.
     */
    override fun doTest() {
        System.out.println(
            """
                ===================================================================================================================================================
                
                    ######  ####### #       #######    #     #####  #######     #####  #     # #######  #####  #    #    ######  #     # ### #       ######  
                    #     # #       #       #         # #   #     # #          #     # #     # #       #     # #   #     #     # #     #  #  #       #     # 
                    #     # #       #       #        #   #  #       #          #       #     # #       #       #  #      #     # #     #  #  #       #     # 
                    ######  #####   #       #####   #     #  #####  #####      #       ####### #####   #       ###       ######  #     #  #  #       #     # 
                    #   #   #       #       #       #######       # #          #       #     # #       #       #  #      #     # #     #  #  #       #     # 
                    #    #  #       #       #       #     # #     # #          #     # #     # #       #     # #   #     #     # #     #  #  #       #     # 
                    #     # ####### ####### ####### #     #  #####  #######     #####  #     # #######  #####  #    #    ######   #####  ### ####### ######
                      
                ===================================================================================================================================================
            """
        )
        assert(true, "The application ran!")

        assert(Client.CI_CD, "CI-CD mode is enabled.", "Running release tests whilst not in CI_CD")

        assert(!Client.DEBUG_MODE, "Debug mode is disabled.", "Debug mode has been enabled. Debug mode must not be enabled in a release.")

        assert(Client.CI_CD_FS, "Fullscreen was enabled.", "Fullscreen was disabled. Splash should be fullscreen by default.")

        assert(true, "All basic config checks passed! Build seems to be correctly configured for release. No guarantees on it's stability, though!")

        // Cannot boot client.
//        assert(Client.client!!.currentScreen is SplashScreen, "Splash booted to the splash screen.", "Splash did not boot to the splash screen.")
//
//        var i = 0
//        while (true) {
//            sleep(1000)
//
//            if (Client.client!!.currentScreen is MainMenu) break
//
//            i++
//            assert(i < 10, failMessage = "Splash did not reach the menu screen after 10 seconds. It should not take this long to load assets.")
//        }



    }


}


