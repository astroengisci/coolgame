package com.andrewkhill.coolgame

/**
 * Stores and updates the tile-grid map.
 *
 * For entity positions, see [EntityMap].
 *
 * Maps are stored as a grid of single characters, each character
 * representing a tile. These character mappings are stored in [Tiles].
 *
 * Each element of the array is a single row, stored in order from top to bottom.
 * Each character within an element is a column.
 *
 * Maps must be rectangular; all elements must have the same number of characters.
 * If a tile is meant to be left empty, use the character x.
 *
 * @property map The string-array representation of the map.
 * @constructor Creates a map from the given string representation.
 */
class TileMap (val map : Array<String>) {
    val height = map.count()
    val width = map[0].count()

    fun ChangeTileType (x : Int, y : Int, newType : Char) {

        val desiredRow = map[y].toCharArray()
        desiredRow.set(x, newType)
        map[y] = desiredRow.joinToString("")

    }

}