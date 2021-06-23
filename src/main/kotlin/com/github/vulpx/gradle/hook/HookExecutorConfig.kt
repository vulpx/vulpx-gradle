package com.github.vulpx.gradle.hook

import java.io.File
import java.lang.IllegalArgumentException

/**
 * Config for a git hook.
 */
data class HookExecutorConfig(
	/**
	 * The command to run.
	 */
	val exec: String? = null,
	/**
	 * The script file to run. This needs to be executable.
	 */
	val scriptFile: File? = null,
	val disabled: Boolean = false
) {
	init {
		// check if the script file specified
		if (this.scriptFile != null && this.scriptFile.canExecute()) {
			throw IllegalArgumentException("Specified script file must be executable!")
		}
	}
}
