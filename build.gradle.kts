plugins {
    kotlin("jvm") version "1.5.10"
    id("java-gradle-plugin")
    id("com.diffplug.spotless") version "5.14.0"
}

group = "com.github.vulpx"
version = "1.0.0"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))

}

gradlePlugin {
    plugins {
        create("vulpx") {
            id = "com.github.vulpx.gradle"
            implementationClass = "com.github.vulpx.gradle.VulpxGradlePlugin"
        }
    }
}
