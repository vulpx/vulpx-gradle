package com.github.vulpx.gradle

/**
 * Stores configuration for the plugin.
 */
data class Config(
	var platform: Platform
) {
	enum class Platform {
		SPIGOT,
		BUNGEE
	}
}
