package com.upc.game.screens

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.scenes.scene2d.Stage
import com.badlogic.gdx.utils.Align
import com.upc.game.Main
import ktx.scene2d.label
import ktx.scene2d.table
import utils.states.State

/**
 * Created by operador on 5/17/17.
 */

class Menu : State() {
    private val stage: Stage = Stage(viewport, Main.batch)

    init {
        var table =  table {
            label("Welcome").setAlignment(Align.center)
        }.align(Align.center).center()
        table.setFillParent(true)
        stage.addActor(table)
    }

    override fun handleInput(dt: Float) {
        super.handleInput(dt)
        if (Gdx.input.justTouched()) {
            Main.screen = Game()
        }
    }

    override fun render(delta: Float) {
        super.render(delta)
        stage.draw()
    }
}
