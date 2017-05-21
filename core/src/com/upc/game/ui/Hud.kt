package com.upc.game.ui

import com.badlogic.gdx.graphics.Camera
import com.badlogic.gdx.graphics.OrthographicCamera
import com.badlogic.gdx.scenes.scene2d.Stage
import com.badlogic.gdx.scenes.scene2d.ui.Label
import com.badlogic.gdx.utils.Disposable
import com.badlogic.gdx.utils.viewport.FitViewport
import com.badlogic.gdx.utils.viewport.Viewport
import com.upc.game.Config
import com.upc.game.Main
import ktx.scene2d.Scene2DSkin
import ktx.scene2d.label
import ktx.scene2d.table

/**
 * Created by operador on 5/17/17.
 */

class Hud : Disposable {
    internal var stage: Stage
    internal var viewport: Viewport = FitViewport(Config.WIDTH, Config.HEIGHT, OrthographicCamera())

    var scoreLabel : Label = Label("0", Scene2DSkin.defaultSkin);
    var levelLabel : Label = Label("1-1", Scene2DSkin.defaultSkin);
    var countDownLabel : Label = Label("0", Scene2DSkin.defaultSkin);

    init {
        stage = Stage(viewport, Main.batch)

        val table = table{
            top()
            label("Mario").cell(expandX = true)
            label("WORLD").cell(expandX = true)
            label("TIME").cell(expandX = true)
            row()
            add(scoreLabel).expandX()
            add(levelLabel).expandX()
            add(countDownLabel).expandX()
        }
        table.setFillParent(true)
        stage.addActor(table)
    }

    fun draw() {
        stage.draw()
    }

    override fun dispose() {

    }

    val camera: Camera
        get() = stage.camera
}
