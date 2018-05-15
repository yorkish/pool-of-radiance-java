package ca.yorkish.por.menu

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.assets.AssetManager
import com.badlogic.gdx.graphics.GL20
import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.graphics.OrthographicCamera

// https://gitlab.com/InfectedBytes/SolarColony/blob/master/SolarColony/core/src/com/infectedbytes/solarcolony/ScreenState.java
class MainMenuScreen(val manager : AssetManager) : MenuScreen(manager) {

	val batch: SpriteBatch = SpriteBatch()
	val camera: OrthographicCamera = OrthographicCamera(320F, 200F)
			
	override fun create() {
		manager.load("common.png", Texture::class.java)
		manager.finishLoading()
		
		camera.position.set(320F/2, 200F/2, 0F)
		camera.update()
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
		
		camera.update()
		val texture = manager.get("common.png", Texture::class.java)
		Gdx.gl.glClearColor(0.3F, 1F, 0.5F, 1F)
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT)

		batch.setProjectionMatrix(camera.combined);
		
		batch.begin()
		batch.draw(texture, 0F, 0F, 16,0,8,8)
		batch.draw(texture, 8F, 0F, 16,0,8,8)
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