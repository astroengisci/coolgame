package com.andrewkhill.coolgame

/**
 * Stores and updates the tile-grid map.
 *
 * For entity positions, see [EntityMap]
 *
 * @property map The string representation of the map.
 * @constructor Creates a map from the given string representation.
 */
class TileMap (val map : Array<String>) {

    fun ChangeTileType (x : Int, y : Int, newType : Char) {

        var desiredRow = map[y].toCharArray()
        desiredRow.set(x, newType)
        map[y] = desiredRow.joinToString("")

    }

}