package com.github.vulpx.gradle

import org.gradle.api.Plugin
import org.gradle.api.Project

/**
 * The core gradle plugin instance.
 */
class VulpxGradlePlugin : Plugin<Project> {
	private lateinit var extension: VulpxExtension

	/**
	 * Called when the plugin is applied.
	 */
	override fun apply(target: Project) {
		// create the vulpx extension
		extension = target.extensions.create("vulpx", VulpxExtension::class.java)
		// define extraneous repositories
		target.repositories.run {
			mavenCentral()
			google()
		}
	}
}
