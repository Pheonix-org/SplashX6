package com.shinkson47.SplashX6.desktop

import com.badlogic.gdx.Files
import com.badlogic.gdx.backends.lwjgl.LwjglApplication
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration
import com.shinkson47.SplashX6.Client
import com.shinkson47.SplashX6.test.ReleaseTest
import java.awt.GraphicsEnvironment
import java.awt.HeadlessException
import java.awt.Toolkit

/**
 * <h1>Main entry point for Splash X6</h1>
 * Contains pre-boot scripture for configuration
 * of the engine, and meta-execution of tests.
 */
object SplashX6 {
    /**
     * <h2>The launch configuration for the engine</h2>
     * Determines basic general settings for the engine.
     */
    val config = LwjglApplicationConfiguration()

    // TODO some kind of swing or java FX launcher GUI?
    @JvmStatic
    fun main(arg: Array<String>) {

        // ===========================
        // DO NOT COMMIT.
        // ===========================
        // When developing, change to true to enable debug features.
        // Check for DEBUG_MODE when writing a debug feature.
        Client.DEBUG_MODE = true
        checkCICD(arg)
        constructConfig()
        prebootComplete()
    }

    /**
     * <h2>Checks to see if we're running in a test environment</h2>
     * If the 'butt' argument is provided, and the application is in headless mode
     * then we'll configure for running internal tests.
     *
     * This trigger will run unit tests and various internal checks to
     * ensure that the internal environment is as expected for a build.
     *
     * Once done, the game will automatically close.
     */
    private fun checkCICD(arg: Array<String>) {
        // First, check if we're running in a test CI-CD environment
        // and Build Unit Test Trigger (BUTT) argument.
        if (arg.size != 0 && arg[0] == "butt") if (GraphicsEnvironment.isHeadless()) Client.CI_CD = true else throw Error(HeadlessException("Tried to boot in a test environment, but the JVM is not in headless mode!" +
                "Remove 'butt' arg to run normally, boot in headless to run CI-CD checks."))
    }

    /**
     * <h2>Populates the boot config</h2>
     */
    private fun constructConfig() {
        config.title = "Splash X6"
        if (GraphicsEnvironment.isHeadless()) { // If headless we can't configure the graphics environment, cause there isn't one.
            if (!Client.CI_CD) throw Error(HeadlessException("Splash X6 started in headless mode, but this does not seem to be a test environment. " +
                    "Disable headless mode to run the game, or provide the 'butt' argument to run CI-CD build checks."))
        } else { // If not headless, Configure screen size.
            val a = Toolkit.getDefaultToolkit().screenSize
            config.height = a.height
            config.width = a.width
        }

        // ===========================
        // DO NOT COMMIT.
        // ===========================
        // Press F11, toggle in preferences, or use debug mode to disable fullscreen.
        config.fullscreen = true
        Client.CI_CD_FS = config.fullscreen

        // Add window icon. Note: Dock icon is set within the client's startup routine.
        config.addIcon("sprites/icon.png", Files.FileType.Internal)
    }

    private fun prebootComplete() {
        if (Client.CI_CD) ReleaseTest() else LwjglApplication(Client(), config)
    }
}