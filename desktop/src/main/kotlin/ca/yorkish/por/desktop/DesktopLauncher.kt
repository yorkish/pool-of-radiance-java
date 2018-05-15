package ca.yorkish.game.por.desktop

import ca.yorkish.por.main.PorGame
import com.badlogic.gdx.backends.lwjgl.LwjglApplication
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration

object DesktopLauncher {

	@JvmStatic
	fun main(arg: Array<String>) {
		val config = LwjglApplicationConfiguration()
		config.width = 640
		config.height = 400
		LwjglApplication(PorGame(), config);
	}
}
