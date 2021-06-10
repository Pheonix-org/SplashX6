import com.badlogic.gdx.scenes.scene2d.Event
import com.badlogic.gdx.scenes.scene2d.ui.Label
import com.badlogic.gdx.scenes.scene2d.ui.Slider
import com.badlogic.gdx.scenes.scene2d.ui.TextButton
import com.shinkson47.SplashX6.game.GameHypervisor
import com.shinkson47.SplashX6.game.GameHypervisor.Companion.gameRenderer
import com.shinkson47.SplashX6.game.GameHypervisor.Companion.inGame
import com.shinkson47.SplashX6.rendering.Camera.Companion.FRUSTRUM_WIDTH_MOD
import com.shinkson47.SplashX6.rendering.StageWindow
import com.shinkson47.SplashX6.utility.Assets

/**
 * util window used to alter the width of the camera's frustum
 */
private val frustCallib: StageWindow = object : StageWindow("Culling frustum calabration") {
    override fun toggleShown() {
        if (!inGame) {
            // TODO change to API validation
            dialog("Oops", "Frustrum changes can only be made whilst in-game.")
            isVisible = false
            return
        }
        gameRenderer!!.cam.deltaZoom(10000f)
        getStage().addActor(this)
        toggleAll()
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
            FRUSTRUM_WIDTH_MOD = slider.value
            gameRenderer!!.cam.cacheFrustumValues()
            true
        }
        add(slider).growX().row()
        add(l).row()
        add(button("Done!") { o: Any? -> toggleAll() }).padTop(20f)
    }

    init {
        isVisible = false
        isResizable = false
    }
}