package com.upc.game.screens

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.audio.Music
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.maps.tiled.TiledMap
import com.badlogic.gdx.maps.tiled.TmxMapLoader
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer
import com.badlogic.gdx.utils.viewport.FitViewport
import com.upc.game.Config
import com.upc.game.CustomAssetManager
import com.upc.game.Main
import com.upc.game.ui.Hud

import utils.states.State

/**
 * Created by operador on 5/17/17.
 */

class Game() : State() {
    internal val hud: Hud = Hud()
    internal val tmxMapLoader: TmxMapLoader = TmxMapLoader()
    internal var tiledMap: TiledMap
    internal var orthogonalTiledMapRenderer: OrthogonalTiledMapRenderer
    internal var music: Music

    init {
        tiledMap = tmxMapLoader.load("level1.tmx")
        orthogonalTiledMapRenderer = OrthogonalTiledMapRenderer(tiledMap)
        camera.position.set(viewport.worldWidth / 2f, viewport.worldHeight / 2f, 0f)
        music = CustomAssetManager.manager.get<Music>(CustomAssetManager.MarioMusic)
        music.play()
        music.isLooping = true
    }

    override fun render(delta: Float) {
        super.render(delta)
        Gdx.app.log("Game", "Rendering")
        orthogonalTiledMapRenderer.render()
        Main.batch.projectionMatrix = camera.combined
        Main.batch.begin()
        Main.batch.end()
        Main.batch.projectionMatrix = hud.camera.combined
        hud.draw()
    }

    override fun resize(width: Int, height: Int) {
        super.resize(width, height)

    }

    override fun update(dt: Float) {
        super.update(dt)
        orthogonalTiledMapRenderer.setView(camera)
    }
}
