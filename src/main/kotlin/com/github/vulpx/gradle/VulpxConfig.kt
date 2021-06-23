package com.github.vulpx.gradle

import com.github.vulpx.gradle.hook.GitHookConfig

/**
 * Stores configuration for the plugin.
 */
data class VulpxConfig(
	var platform: Platform = Platform.SPIGOT,
	var gitHookConfig: GitHookConfig = GitHookConfig()
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
