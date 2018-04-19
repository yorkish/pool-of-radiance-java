package ca.yorkish.por.main

import ca.yorkish.por.menu.MainMenuScreen
import ca.yorkish.por.menu.MenuScreen
import com.badlogic.gdx.Game
import com.badlogic.gdx.Gdx
import com.badlogic.gdx.graphics.GL20
import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import java.util.Stack

class PorGame : Game() {
	val stateStack = Stack<MenuScreen>()

	override fun create() {
		stateStack.push(MainMenuScreen())
	}

	override fun render() {
		stateStack.peek().update
		stateStack.peek().render(Gdx.graphics.getDeltaTime())
	}

	override fun dispose() {
	}
}
