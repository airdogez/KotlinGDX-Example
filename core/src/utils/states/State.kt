package utils.states

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.Screen
import com.badlogic.gdx.graphics.GL20
import com.badlogic.gdx.graphics.OrthographicCamera
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.utils.viewport.FitViewport
import com.badlogic.gdx.utils.viewport.Viewport
import com.upc.game.Config

/**
 * Created by operador on 5/17/17.
 */

open class State : Screen {

    var camera: OrthographicCamera = OrthographicCamera()
    var viewport: Viewport = FitViewport(Config.WIDTH, Config.HEIGHT, this.camera)

    override fun show() {

    }

    override fun render(delta: Float) {
        update(delta)
        Gdx.gl.glClearColor(0f, 0f, 0f, 1f)
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT)
    }

    override fun resize(width: Int, height: Int) {

    }

    override fun pause() {

    }

    override fun resume() {

    }

    override fun hide() {

    }

    override fun dispose() {

    }

    open fun update(dt: Float) {
        handleInput(dt)
    }

    open fun handleInput(dt: Float) {

    }
}
