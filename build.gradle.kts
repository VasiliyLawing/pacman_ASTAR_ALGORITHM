import java.util.Properties


buildscript {
    repositories {
        mavenCentral()
        jcenter()
    }

    dependencies {
        classpath("org.junit.platform:junit-platform-gradle-plugin:1.0.1")
    }
}

plugins {
    kotlin("jvm") version "1.3.50"
}

val localProperties = Properties()
val localPropertiesFile: File = rootProject.file("artifactory.properties")
if (localPropertiesFile.exists()) {
    localPropertiesFile.inputStream().use { localProperties.load(it) }
}


repositories {
    val artifactory_contextUrl: String by localProperties
    val artifactory_username: String by localProperties
    val artifactory_password: String by localProperties

    jcenter()
    maven(url="https://dl.bintray.com/anysolo/edu")

    maven {
        url = uri("${artifactory_contextUrl}/gradle-dev")
        credentials {
            username = artifactory_username
            password = artifactory_password
        }
    }}

dependencies {
    compile(gradleApi())
    compile(kotlin("stdlib"))
    compile(kotlin("stdlib-jdk8"))
    compile(kotlin("reflect"))
    compile("com.anysolo:toyGraphics:0.8.6.6")
    compile("com.anysolo:prg-b1-course-solutions:0.2.3")
}
