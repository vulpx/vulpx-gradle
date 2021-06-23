package com.github.vulpx.gradle

import com.github.vulpx.gradle.hook.HookConfig

/**
 * Stores configuration for the plugin.
 */
data class VulpxConfig(
	var platform: Platform = Platform.SPIGOT,
	var gitHookConfig: HookConfig = HookConfig()
) {
	/**
	 * The platform the plugin is being developed for.
	 */
	enum class Platform {
		SPIGOT,
		BUNGEE,
		SPIGOT_BUNGEE
	}
}
