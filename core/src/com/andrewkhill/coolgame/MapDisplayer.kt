package com.andrewkhill.coolgame

import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.graphics.g2d.SpriteBatch

/**
 * Given a [TileMap] and [EntityMap], displays the battlefield to the player.
 *
 * @param tileMap The [TileMap] for the battlefield.
 * @param entityMap The [EntityMap] for the battlefield.
 */
class MapDisplayer (val tileMap: TileMap, val entityMap: EntityMap) {

    /**
     * Given a [SpriteBatch], renders the current state of the map.
     *
     * @param spriteBatch The libgdx [SpriteBatch] for the game.
     */
    fun render(spriteBatch: SpriteBatch)
    {
        // TODO: Once EntityMap is written, add code to render entities
        // The list of lines is reversed to convert from our internal y-down format
        // into libgdx's y-up standard.
        val map = tileMap.map.reversed()

        var y = 0f
        for (line in map) {
            var x = 0f
            for (tile in line) {
                val texture = Texture(Tiles.fromSymbol(tile)?.asset)
                val height = texture.height
                val width = texture.width
                spriteBatch.draw(texture, x*width, y*height)
                x++
            }
            y++
        }
    }
}