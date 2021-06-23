package com.github.vulpx.gradle.hook

/**
 * Extension class for configuring
 */
data class GitHookConfig(
	val failOnMissingHooksDir: Boolean = false,
	val hooks: MutableMap<String, GitHookExecutorConfig> = mutableMapOf()
)
