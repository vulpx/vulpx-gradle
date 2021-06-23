package com.github.vulpx.gradle.hook

class GitHookConfigHandler(private val config: GitHookConfig) {
	/**
	 * Configure a hook of the target name.
	 */
	private fun configureHook(name: String, handler: GitHookExecutorConfig.() -> Unit) {
		val config = GitHookExecutorConfig()
		handler(config)
		this.config.hooks[name] = config
	}

	/**
	 * Create a pre-commit Git hook.
	 */
	fun preCommit(handler: GitHookExecutorConfig.() -> Unit) {
		this.configureHook("pre-commit", handler)
	}

	/**
	 * Create a pre-push Git hook.
	 */
	fun prePush(handler: GitHookExecutorConfig.() -> Unit) {
		this.configureHook("pre-push", handler)
	}
}
