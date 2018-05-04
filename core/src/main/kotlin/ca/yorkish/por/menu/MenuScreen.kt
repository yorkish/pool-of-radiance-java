package ca.yorkish.por.menu

import com.badlogic.gdx.InputAdapter
import com.badlogic.gdx.Screen
import com.badlogic.gdx.assets.AssetManager


abstract class MenuScreen(manager : AssetManager) : Screen, InputAdapter() {
	abstract fun create()
	abstract fun update(delta: Float)
}