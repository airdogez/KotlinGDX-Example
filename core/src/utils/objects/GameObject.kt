package utils.objects

import com.badlogic.gdx.graphics.g2d.Sprite
import com.badlogic.gdx.graphics.g2d.TextureAtlas
import com.badlogic.gdx.math.Vector2
import com.badlogic.gdx.utils.Disposable

/**
 * Created by operador on 5/17/17.
 */

open class GameObject : Sprite, Disposable {

    protected var textureAtlas: TextureAtlas = TextureAtlas()
    protected var position: Vector2 = Vector2()
    protected var stateTime: Float = 0.toFloat()

    constructor(atlas: TextureAtlas, position: Vector2) {
        stateTime = 0f
        this.textureAtlas = atlas
        this.position = position
    }

    fun update(dt: Float) {

    }

    constructor() {
        stateTime = 0f
    }

    override fun dispose() {

    }
}
