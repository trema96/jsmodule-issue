plugins {
    kotlin("multiplatform") version "2.0.0"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

kotlin {
    js(IR) {
        useEsModules()
        browser()
        binaries.library()
    }
    sourceSets {
        val jsMain by getting {
            dependencies {
                implementation(npm("abort-controller", "3.0.0"))
            }
        }
    }
}