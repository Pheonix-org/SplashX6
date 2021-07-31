package com.shinkson47.SplashX6.game.world;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TiledMapTileLayer;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Vector3;
import com.shinkson47.SplashX6.game.GameHypervisor;
import com.shinkson47.SplashX6.game.units.UnitClass;
import com.shinkson47.SplashX6.utility.Assets;
import com.shinkson47.SplashX6.utility.Utility;
import org.xguzm.pathfinding.gdxbridge.NavigationTiledMapLayer;
import org.xguzm.pathfinding.grid.GridCell;
import org.xguzm.pathfinding.grid.finders.AStarGridFinder;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

import static com.shinkson47.SplashX6.utility.Assets.TILESETS;
import static com.shinkson47.SplashX6.utility.Assets.TILESET_MAP;
import static com.shinkson47.SplashX6.utility.Utility.createNoiseGenerator;

final class oldWorld { }