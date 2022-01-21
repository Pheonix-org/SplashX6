package com.shinkson47.SplashX6.game.world.generation.stages

import com.shinkson47.SplashX6.game.world.WorldTerrain
import com.shinkson47.SplashX6.game.world.generation.MiscellaneousGenerationStage
import org.xguzm.pathfinding.grid.GridCell

/**
 * # Generates a data world layer containing information required for pathfinding.
 * @author [Jordan T. Gray](https://www.shinkson47.in) on 09/07/2021
 * @since PRE-ALPHA 0.0.2
 * @version 1
 */
class NavigationDataMiscStage : MiscellaneousGenerationStage() {

    override fun execute(it: WorldTerrain) {
        with (it) {
            forEachTile {
                    x, y, _ ->
                        navigationLayer.setCell(
                            x,      // Position in the layer to place the new tile.
                            y,
                            GridCell(
                                x,  // Where the tile thinks it is. Matches world position.
                                y,
                                    // Can this tile be walked on?
                                isNavligable(x,y)
                        ))
            }
        }
    }
}