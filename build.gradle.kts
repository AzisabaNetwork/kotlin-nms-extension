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
    version = "1.0-SNAPSHOT"

    repositories {
        mavenLocal()
        mavenCentral()
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
                        project.findProperty("deploySnapshotURL") ?: System.getProperty("deploySnapshotURL", "")
                    else
                        project.findProperty("deployReleasesURL") ?: System.getProperty("deployReleasesURL", "")
                )
            }
        }

        publications {
            create<MavenPublication>("mavenJava") {
                from(components["java"])
                artifact(tasks.getByName("sourcesJar"))

                artifactId = "kotlin-nms-extension-$artifactId"
            }
        }
    }
}
