package com.github.vulpx.gradle

class VulpxExtension(private val config: Config) {
	/**
	 * Configure Spigot dependencies.
	 */
	fun spigot() {
		config.platform = Config.Platform.SPIGOT
	}

	/**
	 * Configure dependencies for Bungeecord.
	 */
	fun bungee() {
		config.platform = Config.Platform.BUNGEE
	}
}
