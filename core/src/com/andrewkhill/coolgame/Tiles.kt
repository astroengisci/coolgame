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
enum class Tiles (val symbol : Char, val asset : String) {
    GRASS('g', "tiles/grass.png"),
    STONE('s', "tiles/stone.png"),
    DIRT('d', "tiles/dirt.png");

    companion object {
        /**
         * @param symbol The symbolic representation of the tile used in [TileMap]
         * @return The [Tiles] enum object for the tile.
         */
        fun fromSymbol(symbol: Char): Tiles? {
            val map = Tiles.values().associateBy(Tiles::symbol)
            return map.get(symbol)
        }
    }
}