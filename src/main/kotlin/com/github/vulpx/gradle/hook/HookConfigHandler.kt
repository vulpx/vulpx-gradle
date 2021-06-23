package com.github.vulpx.gradle.hook

class HookConfigHandler(private val config: HookConfig) {
	/**
	 * Configure a hook of the target name.
	 */
	private fun configureHook(name: String, handler: HookExecutorConfig.() -> Unit) {
		val config = HookExecutorConfig()
		handler(config)
		this.config.hooks[name] = config
	}

	/**
	 * Create a pre-commit Git hook.
	 */
	fun preCommit(handler: HookExecutorConfig.() -> Unit) {
		this.configureHook("pre-commit", handler)
	}

	/**
	 * Create a pre-push Git hook.
	 */
	fun prePush(handler: HookExecutorConfig.() -> Unit) {
		this.configureHook("pre-push", handler)
	}
}
