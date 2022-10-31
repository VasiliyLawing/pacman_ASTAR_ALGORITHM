pluginManagement {
    val kotlinVersion: String by settings
    val pluginShadowVer: String by settings
    val kotlinCoroutinesVersion = "1.6.3"

    plugins {
        kotlin("jvm") version kotlinVersion
        id("com.github.johnrengelman.shadow") version pluginShadowVer
    }

    repositories {
        mavenCentral()
        gradlePluginPortal()
        mavenLocal()
    }
}

