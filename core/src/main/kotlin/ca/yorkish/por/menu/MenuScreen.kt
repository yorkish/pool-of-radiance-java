package ca.yorkish.por.menu

import com.badlogic.gdx.InputAdapter
import com.badlogic.gdx.Screen


abstract class MenuScreen : Screen, InputAdapter() {
	abstract fun update()
}