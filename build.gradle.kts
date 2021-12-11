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
    kotlin("jvm") version "1.4.30"
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

    maven {
        url = uri("${artifactory_contextUrl}/gradle-dev")
        credentials {
            username = artifactory_username
            password = artifactory_password
        }
    }
}

dependencies {
    compile(gradleApi())
    compile(kotlin("stdlib"))
    compile(kotlin("stdlib-jdk8"))
    compile(kotlin("reflect"))

    compile("com.anysolo:toyGraphics:dev-v2-0.2.6")

    compile("com.anysolo:prg-b1-course-solutions:0.3.0") {
        exclude("com.anysolo", "toyGraphics")
    }

    compile("com.anysolo:lib-student:0.5.0.1")
}
