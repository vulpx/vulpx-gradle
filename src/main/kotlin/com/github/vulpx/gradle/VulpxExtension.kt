package com.github.vulpx.gradle

import com.github.vulpx.gradle.hook.GitHookConfigHandler

/**
 * Main extension for handling configuration of the plugin.
 */
class VulpxExtension(private val config: VulpxConfig) {
	/**
	 * Configure git hooks.
	 */
	fun githooks(handler: GitHookConfigHandler.() -> Unit) {
		handler(GitHookConfigHandler(this.config.gitHookConfig))
	}

	/**
	 * Configure Spigot dependencies.
	 */
	fun spigot() {
		config.platform = VulpxConfig.Platform.SPIGOT
	}

	/**
	 * Configure dependencies for Bungeecord.
	 */
	fun bungee() {
		config.platform = VulpxConfig.Platform.BUNGEE
	}
}
