package ca.yorkish.game.por.desktop

import ca.yorkish.por.main.PorGame
import com.badlogic.gdx.backends.lwjgl.LwjglApplication
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration

object DesktopLauncher {

	@JvmStatic
	fun main(arg: Array<String>) {
		val config = LwjglApplicationConfiguration()
		LwjglApplication(PorGame(), config);
	}
}
