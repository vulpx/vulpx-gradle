package com.github.vulpx.gradle.hook

/**
 * Extension class for configuring
 */
data class HookConfig(
	val failOnMissingHooksDir: Boolean = false,
	val hooks: MutableMap<String, HookExecutorConfig> = mutableMapOf()
)
