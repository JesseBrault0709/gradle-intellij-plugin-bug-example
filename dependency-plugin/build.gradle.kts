plugins {
    id("java")
    id("org.jetbrains.intellij").version("1.13.3")
}

group = "com.jessebrault"
version = "0.0.1-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.google.guava:guava:32.0.0-jre")
}

intellij {
    version.set("2023.1.2")
    type.set("IC")
}

tasks {
    patchPluginXml {
        sinceBuild.set("231")
        version.set(project.version.toString())
    }
}