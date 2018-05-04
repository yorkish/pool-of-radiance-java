package ca.yorkish.por.texture

import com.badlogic.gdx.graphics.Texture

class TextureManager {
	private val textureMap = mutableMapOf<String, Texture>()
	
	fun load(filename:String, id:String) {
		val texture = Texture(filename)
		textureMap.put(id, texture)
	}
}