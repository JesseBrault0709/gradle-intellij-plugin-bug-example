plugins {
    id("java")
    id("org.jetbrains.intellij")
}

group = "com.jessebrault"
version = "0.0.1-SNAPSHOT"

repositories {
    mavenCentral()
}

intellij {
    version.set("2023.1.2")
    type.set("IC")
    plugins.add(file("dependency-plugin/build/idea-sandbox/plugins/dependency-plugin"))
}

tasks {
    patchPluginXml {
        sinceBuild.set("231")
        version.set(project.version.toString())
    }
}