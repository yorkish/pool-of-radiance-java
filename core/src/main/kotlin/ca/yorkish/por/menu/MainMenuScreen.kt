package ca.yorkish.por.menu

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.assets.AssetManager
import com.badlogic.gdx.graphics.GL20
import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.graphics.g2d.SpriteBatch

// https://gitlab.com/InfectedBytes/SolarColony/blob/master/SolarColony/core/src/com/infectedbytes/solarcolony/ScreenState.java
class MainMenuScreen(val manager : AssetManager) : MenuScreen(manager) {

	val batch: SpriteBatch = SpriteBatch()

	override fun create() {
		manager.load("badlogic.jpg", Texture::class.java)
		manager.finishLoading()
	}
	
	override fun update(delta: Float) {
	}

	override fun hide() {
		TODO()
	}

	override fun pause() {
		TODO()
	}

	override fun render(delta: Float) {
		val texture = manager.get("badlogic.jpg", Texture::class.java)
		Gdx.gl.glClearColor(1F, 0F, 0F, 1F)
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT)
		batch.begin()
		batch.draw(texture, 0F, 0F)
		batch.end()
	}

	override fun show() {
		TODO()
	}

	override fun resume() {
		TODO()
	}

	override fun resize(width: Int, height: Int) {
		TODO()
	}

	override fun dispose() {
		batch.dispose()
	}
}