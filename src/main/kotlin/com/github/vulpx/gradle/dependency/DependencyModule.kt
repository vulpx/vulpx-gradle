package com.github.vulpx.gradle.dependency

import org.gradle.api.Project

object DependencyModule {
	fun load(project: Project) {
		project.extensions.create("dependency", DependencyExtension::class.java)
	}
}