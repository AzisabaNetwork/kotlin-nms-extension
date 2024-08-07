plugins {
    kotlin("jvm") version "1.8.21"
    `java-library`
    `maven-publish`
}

subprojects {
    apply {
        plugin("org.jetbrains.kotlin.jvm")
        plugin("java-library")
        plugin("maven-publish")
    }
}

allprojects {
    java {
        withSourcesJar()
        withJavadocJar()
        toolchain.languageVersion.set(JavaLanguageVersion.of(8))
    }

    group = "net.azisaba"
    version = "1.0.1"

    repositories {
        mavenLocal()
        mavenCentral()
        maven { url = uri("https://libraries.minecraft.net/") }
        if (properties["azisabaNmsUsername"] != null && properties["azisabaNmsPassword"] != null) {
            maven {
                name = "azisabaNms"
                credentials(PasswordCredentials::class)
                url = uri("https://repo.azisaba.net/repository/nms/")
            }
        }
    }

    publishing {
        repositories {
            maven {
                name = "repo"
                credentials(PasswordCredentials::class)
                url = uri(
                    if (project.version.toString().endsWith("SNAPSHOT"))
                        project.findProperty("deploySnapshotURL") ?: System.getProperty("deploySnapshotURL", "https://repo.azisaba.net/repository/maven-snapshots/")
                    else
                        project.findProperty("deployReleasesURL") ?: System.getProperty("deployReleasesURL", "https://repo.azisaba.net/repository/maven-releases/")
                )
            }
        }

        publications {
            create<MavenPublication>("mavenJava") {
                from(components["java"])

                artifactId = "kotlin-nms-extension-$artifactId"
            }
        }
    }
}
