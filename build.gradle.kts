plugins {
    kotlin("multiplatform") version "1.6.21"

    id("maven-publish")
}

group = "test.micha"
version = "1.0.0"

repositories {
    mavenCentral()
}

kotlin {
    /*
        This project cannot be published to mavenLocal
        without first commenting out all but one of the below targets.
    */
    jvm()
    linuxX64()
    macosX64()
    mingwX64()
    js()

    sourceSets {
        getByName("commonMain") {
            dependencies {
                implementation("org.jetbrains.kotlinx:kotlinx-datetime:0.4.0")
            }
        }
    }
}
