package com.shinkson47.SplashX6.rendering.windows

import com.badlogic.gdx.maps.tiled.renderers.IsometricStaggeredTiledMapRenderer
import com.badlogic.gdx.scenes.scene2d.Actor
import com.badlogic.gdx.scenes.scene2d.ui.*
import com.badlogic.gdx.scenes.scene2d.utils.ChangeListener
import com.shinkson47.SplashX6.game.GameData
import com.shinkson47.SplashX6.game.GameHypervisor
import com.shinkson47.SplashX6.game.world.FastNoiseLite
import com.shinkson47.SplashX6.game.world.generation.GenerationCompanion
import com.shinkson47.SplashX6.game.world.generation.Generator
import com.shinkson47.SplashX6.rendering.StageWindow
import com.shinkson47.SplashX6.utility.Assets.SKIN_KENNEY
import com.shinkson47.SplashX6.utility.Utility

/**
 * # TODO
 * @author [Jordan T. Gray](https://www.shinkson47.in) on 30/06/2021
 * @since v1
 * @version 1
 */
class TerrainGenerationEditor : StageWindow("Terrain Generation Editor") {

    val buildButton = TextButton("Regenerate", SKIN_KENNEY)
    val autoRebuild = CheckBox("Auto re-build", SKIN_KENNEY)
    val fastBuild = CheckBox("Skip some parts of the world", SKIN_KENNEY)

    init {
        addDropFor("noiseType", FastNoiseLite.NoiseType.values().asIterable(), FastNoiseLite.NoiseType.OpenSimplex2)
        addDropFor("fractalType", FastNoiseLite.FractalType.values().asIterable(), FastNoiseLite.FractalType.FBm)
        addDropFor("cellularDistanceFunction", FastNoiseLite.CellularDistanceFunction.values().asIterable(), FastNoiseLite.CellularDistanceFunction.Euclidean)

        addSliderFor("fractalGain", -0.7f , 1f, 0.1f, 0.5f)
        addSliderFor("fractalLacunarity", -20f , 20f, 1f, 2f)
        addSliderFor("fractalFrequency", -1f , 1f, 0.01f, 0.01f)
        addSliderFor("fractalStrength", 0f , 1f, 0.01f, 0.0f)
        addSliderFor("pingPongStrength", 0f , 2f, 0.1f, 2f)

        addSliderFor("heightFrequency", 0f , 0.5f, 0.01f, 1f)
        addSliderFor("MOUNTAIN_LEVEL", 0f , 1f, 0.01f, 0.75f)
        addSliderFor("HILL_LEVEL", 0f , 1f, 0.01f, 0.7f)


        autoRebuild.isChecked = true
        fastBuild.isChecked = true

        // This is an int and i cba so
//        addSliderFor("fractalOctaves", -20f , 20f, 1f, 2f)

        add(autoRebuild).colspan(3).row()
        add(fastBuild).colspan(3).row()

        buildButton.addListener(StageWindow.LambdaClickListener {
            build();
        })
        add(buildButton).colspan(3)



        pack()
    }

    private fun addSliderFor(fieldName: String, min: Float, max: Float, step: Float, default : Float) {
        val x = Slider(min, max, step, false, SKIN_KENNEY)
        x.setValue(default)

        val display = Label(default.toString(), SKIN_KENNEY)
        x.addListener(floatEditor(fieldName, display))

        add(Label(fieldName, SKIN_KENNEY))
        add(x)
        add(display).row()
    }

    private fun <T : Enum<*>> addDropFor(fieldName: String, Values : Iterable<T>, default : T) {
        val x = SelectBox<T>(SKIN_KENNEY)
        x.setItems(Utility.CollectionToGDXArray(Values))
        x.selected = default

        val display = Label(default.toString(), SKIN_KENNEY)
        x.addListener(enumEditor<T>(fieldName, display))

        add(Label(fieldName, SKIN_KENNEY))
        add(x)
        add(display).row()
    }



    inner class enumEditor<T : Enum<*>>(fieldName : String, val display : Label) : ChangeListener() {
        val field = GenerationCompanion::class.java.getDeclaredField(fieldName)

        override fun changed(event: ChangeEvent?, actor: Actor?) {
            val actor = actor as SelectBox<T>
            field.set(GenerationCompanion, actor.selected)
            display.setText(actor.selected.toString())
            autoRebuild()
        }
    }


    inner class floatEditor(fieldName : String, val display : Label) : ChangeListener() {
        val field = GenerationCompanion::class.java.getDeclaredField(fieldName)

        override fun changed(event: ChangeEvent?, actor: Actor?) {
            val x = (actor as Slider).value
            field.set(GenerationCompanion, x)
            display.setText(x.toString())
            autoRebuild();
        }
    }

    private fun autoRebuild() {
        if (autoRebuild.isChecked) build()
    }

    private fun build () {
        val x = GameData.world
        try {
            Generator.fastBuild = fastBuild.isChecked
            GameData.new()
            GameHypervisor.gameRenderer!!.r = IsometricStaggeredTiledMapRenderer(GameData.world)
            buildButton.setText("Done!")
        } catch ( e : Exception ) {
            GameData.world = x
            buildButton.setText("Build Failed!")
        }
    }

}