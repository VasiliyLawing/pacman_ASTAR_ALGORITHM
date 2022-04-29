import java.util.Properties


buildscript {
    repositories {
        mavenCentral()
        maven(url="https://plugins.gradle.org/m2/")
        jcenter()
    }

    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.4.32")
//        classpath("org.junit.platform:junit-platform-gradle-plugin:1.0.1")
    }
}

plugins {
    kotlin("jvm") version "1.4.32"
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

val localProperties = Properties()
val localPropertiesFile: File = rootProject.file("artifactory.properties")
if (localPropertiesFile.exists()) {
    localPropertiesFile.inputStream().use { localProperties.load(it) }
}


repositories {
    mavenCentral()

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

    compile("com.anysolo:toyGraphics:dev-v2-0.2.8")
    implementation("com.anysolo:lib-student:0.5.0.11")

    compile("com.anysolo:prg-b1-course-solutions:0.3.3.9") {
        exclude("com.anysolo", "toyGraphics")
        exclude("com.anysolo", "lib-student")
    }
}
