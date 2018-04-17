package ca.yorkish.por.main

import com.badlogic.gdx.ApplicationAdapter
import com.badlogic.gdx.Gdx
import com.badlogic.gdx.graphics.GL20
import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import javax.swing.text.AbstractDocument.Content

class PorGame : ApplicationAdapter() {
	lateinit var batch: SpriteBatch
	lateinit var img: Texture

	override fun create() {
		batch = SpriteBatch()
		img = Texture("badlogic.jpg")
	}

	override fun render() {
		Gdx.gl.glClearColor(1F, 0F, 0F, 1F)
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT)
		batch.begin()
		batch.draw(img, 0F, 0F)
		batch.end()
	}

	override fun dispose() {
		batch.dispose()
		img.dispose()
	}
}
