package com.upc.game

import com.badlogic.gdx.assets.AssetManager
import com.badlogic.gdx.audio.Music
import com.badlogic.gdx.graphics.g2d.SpriteBatch

/**
 * Created by alumnos on 5/20/17.
 */

object CustomAssetManager {
    var manager: AssetManager = AssetManager()
    val MarioMusic = "sounds/mario_music.ogg"

    fun init() {
        manager.load<Music>(MarioMusic, Music::class.java)
        manager.finishLoading()
    }

    fun dispose() {
        manager.dispose()
    }
}
