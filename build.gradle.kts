import java.util.*


buildscript {
    repositories {
        mavenCentral()
    }
}

plugins {
    kotlin("jvm")
    id("com.jfrog.artifactory") version "4.25.2"
    `maven-publish`
    signing
}

val localProperties by extra {
    val p = Properties()
    val localPropertiesFile: File = rootProject.file("artifactory.properties")
    if (localPropertiesFile.exists()) {
        localPropertiesFile.inputStream().use { p.load(it) }
    }

    p
}

fun findProperty(propertyName: String): String? = localProperties.getProperty(propertyName) as String?

repositories {
    mavenLocal()

    val artifactory_contextUrl: String by localProperties
    val artifactory_username: String by localProperties
    val artifactory_password: String by localProperties

    maven {
        url = uri("${artifactory_contextUrl}/gradle-dev")
        isAllowInsecureProtocol = true
        credentials {
            username = artifactory_username
            password = artifactory_password
        }
    }

    mavenCentral()
}

dependencies {
    implementation(gradleApi())
    implementation(kotlin("stdlib"))
    implementation(kotlin("stdlib-jdk8"))
    implementation(kotlin("reflect"))

    implementation("org.junit.jupiter:junit-jupiter:5.9.0")
    testImplementation("org.junit.jupiter:junit-jupiter:5.9.0")

    implementation("com.anysolo:toyGraphics:dev-v2-0.2.16")
    implementation("com.anysolo:lib-student:0.5.0.11")

    implementation("com.anysolo:prg-b1-course-solutions:0.3.3.22") {
        exclude("com.anysolo", "toyGraphics")
        exclude("com.anysolo", "lib-student")
    }
}


tasks.test {
    useJUnitPlatform()
    testLogging {
        events("passed", "skipped", "failed")
    }
}
