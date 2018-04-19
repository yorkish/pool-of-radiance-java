package ca.yorkish.por.menu

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.graphics.GL20
import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.graphics.g2d.SpriteBatch

// https://gitlab.com/InfectedBytes/SolarColony/blob/master/SolarColony/core/src/com/infectedbytes/solarcolony/ScreenState.java
class MainMenuScreen : MenuScreen() {
	lateinit var batch: SpriteBatch
	lateinit var img: Texture

	override fun update() {
		TODO()
	}
	
	override fun hide() {
		TODO()
	}

	override fun pause() {
		TODO()
	}

	override fun render(delta: Float) {
		Gdx.gl.glClearColor(1F, 0F, 0F, 1F)
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT)
		batch.begin()
		batch.draw(img, 0F, 0F)
		batch.end()
	}

	override fun show() {
		batch = SpriteBatch()
		img = Texture("badlogic.jpg")
	}

	override fun resume() {
		TODO()
	}

	override fun resize(width: Int, height: Int) {
		TODO()
	}

	override fun dispose() {
		batch.dispose()
		img.dispose()
	}
}