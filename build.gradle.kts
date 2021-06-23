plugins {
    kotlin("jvm") version "1.5.10"
    id("java-gradle-plugin")
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
