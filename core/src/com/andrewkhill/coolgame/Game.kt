package com.andrewkhill.coolgame

import com.badlogic.gdx.ApplicationAdapter
import com.badlogic.gdx.Gdx
import com.badlogic.gdx.graphics.Camera
import com.badlogic.gdx.graphics.GL20
import com.badlogic.gdx.graphics.OrthographicCamera
import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.utils.viewport.FitViewport
import com.badlogic.gdx.utils.viewport.Viewport

class Game : ApplicationAdapter() {
    private lateinit var batch: SpriteBatch
    private lateinit var img: Texture
    private lateinit var mapDisplayer: MapDisplayer
    private lateinit var tileMap : TileMap
    private lateinit var viewport : Viewport
    private lateinit var camera : Camera

    override fun create() {
        batch = SpriteBatch()
        img = Texture("badlogic.jpg")
        // Temporary declaration
        tileMap = TileMap("gsdgsd\ndgsdgs\ngsdgsd\ndgsdgs\ngsdgsd\ndgsdgs".lines().toTypedArray())
        mapDisplayer = MapDisplayer(tileMap, EntityMap())
        camera = OrthographicCamera()
        camera.update()
        viewport = FitViewport(tileMap.width.toFloat() * Tiles.tileSize,
                tileMap.height.toFloat() * Tiles.tileSize, camera)
    }

    override fun render() {
        batch.projectionMatrix = camera.projection
        batch.transformMatrix = camera.view
        Gdx.gl.glClearColor(0.3f, 0.3f, 0.3f, 1f)
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT)
        batch.begin()
        mapDisplayer.render(batch)
        batch.end()
    }

    override fun dispose() {
        batch.dispose()
        img.dispose()
    }

    override fun resize(width: Int, height: Int) {
        viewport.update(width, height, true)
    }
}
