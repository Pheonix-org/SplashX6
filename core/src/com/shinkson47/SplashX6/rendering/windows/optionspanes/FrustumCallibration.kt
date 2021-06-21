import com.badlogic.gdx.scenes.scene2d.Event
import com.badlogic.gdx.scenes.scene2d.ui.Label
import com.badlogic.gdx.scenes.scene2d.ui.Slider
import com.shinkson47.SplashX6.game.GameHypervisor.Companion.gameRenderer
import com.shinkson47.SplashX6.rendering.Camera.Companion.FRUSTUM_WIDTH_MOD
import com.shinkson47.SplashX6.rendering.Camera.Companion.TILT_MINIMUM
import com.shinkson47.SplashX6.rendering.StageWindow
import com.shinkson47.SplashX6.utility.Assets

/**
 * util window used to alter the width of the camera's frustum
 */
class FrustumCallibration : StageWindow("Culling frustum calabration") {
    override fun toggleShown() {

        gameRenderer!!.cam.deltaZoom(10000f)
        getStage().addActor(this)
        //toggleAll()
    }

    private fun toggleAll() {
        super.toggleShown()
        toggleShown()

        // TODO enable / disable in-game mouse controls
    }

    /**
     * <h2>Constructs the content to be displayed in this window</h2>
     */
    override fun constructContent() {
        add(Label("For when the rendered world does not fit the screen.", Assets.SKIN)).row()
        hsep().padTop(50f)
        add(
            Label(
                """
                Use the slider to adjust until no void is visible at
                edges of screen. Test zoomed out, and dragging around.
                """.trimIndent(), Assets.SKIN
            )
        ).row()
        add(
            Label(
                """
                DO NOT extend further than nesacerry, 
                as this will greatly effect cpu usage.
                """.trimIndent(), Assets.SKIN
            )
        ).pad(20f).row()
        hsep().padTop(50f)
        val l = Label("", Assets.SKIN)
        val slider = Slider(-2500f, 2500f, 0.1f, false, Assets.SKIN)
        slider.addListener { event: Event? ->
            l.setText(slider.value.toString() + "")
            FRUSTUM_WIDTH_MOD = slider.value
            gameRenderer!!.cam.cacheFrustumValues()
            true
        }
        add(slider).growX().row()
        add(l).row()
        add(button("Done!") {
            run {
                Assets.preferences.putFloat("frustumWidthMod", FRUSTUM_WIDTH_MOD)
                Assets.preferences.flush();
                toggleAll()
            }
        }).padTop(20f)
    }

    init {
        gameRenderer!!.cam.desiredTilt.desired = TILT_MINIMUM
        isResizable = false
    }
}