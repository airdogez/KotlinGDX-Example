package com.upc.game

import com.badlogic.gdx.Game
import com.badlogic.gdx.graphics.Color
import com.badlogic.gdx.graphics.g2d.BitmapFont
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.upc.game.screens.Menu
import ktx.scene2d.Scene2DSkin
import ktx.style.label
import ktx.style.skin

object Main : Game(){
    lateinit var batch : SpriteBatch

    override fun create() {
        batch = SpriteBatch()
        CustomAssetManager.init()
        Scene2DSkin.defaultSkin = skin {
            label {
                font = BitmapFont()
                fontColor = Color.WHITE
            }
        }
        setScreen(Menu())
    }

    override fun dispose() {
        super.dispose()
    }

}
