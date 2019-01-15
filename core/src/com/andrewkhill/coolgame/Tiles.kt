package com.andrewkhill.coolgame

/**
 * Stores the symbolic representation of a tile and the location of its corresponding image.
 *
 * Example:
 *     GRASS("g", "tiles/grass.png")
 *
 * @param symbol The symbolic representation of the tile used in [TileMap]
 * @param asset The image file that [MapDisplayer] should use to represent the tile.
 */
enum class Tiles (val symbol : String, val asset : String) {
}