rootProject.name = "springboot-kotlin"

pluginManagement {
    val kotlin: String by settings
    val springboot: String by settings
    val dependencyManagement: String by settings
    repositories {
        gradlePluginPortal()
    }

    plugins {
        id("org.springframework.boot") version springboot
        id("io.spring.dependency-management") version dependencyManagement
        kotlin("jvm") version kotlin
        kotlin("plugin.spring") version kotlin
    }
}