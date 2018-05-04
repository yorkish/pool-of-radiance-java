package ca.yorkish.por.main

import ca.yorkish.por.menu.MainMenuScreen
import ca.yorkish.por.menu.MenuScreen
import com.badlogic.gdx.Game
import com.badlogic.gdx.Gdx
import com.badlogic.gdx.assets.AssetManager
import java.util.Stack

class PorGame : Game() {
	val stateStack = Stack<MenuScreen>()
	val manager = AssetManager()
	
	override fun create() {
		val menuScreen = MainMenuScreen(manager)
		menuScreen.create()
		stateStack.push(menuScreen)
	}

	override fun render() {
		stateStack.peek().update(0F)
		stateStack.peek().render(Gdx.graphics.getDeltaTime())
	}

	override fun dispose() {
		manager.dispose()
	}
}
