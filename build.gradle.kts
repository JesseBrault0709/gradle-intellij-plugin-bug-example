plugins {
    id("java")
    id("org.jetbrains.intellij").version("1.13.3")
}

group = "com.jessebrault"
version = "0.0.1-SNAPSHOT"

repositories {
    mavenCentral()
}

intellij {
    version.set("2023.1.2")
    type.set("IC")

    // according to the documentation at:
    // https://plugins.jetbrains.com/docs/intellij/tools-gradle-intellij-plugin-faq.html#how-to-add-a-dependency-on-a-plugin-available-in-the-file-system
    // the following should work, but does not:

    plugins.add(file("dependency-plugin/build/idea-sandbox/plugins/dependency-plugin/lib"))

    // however, the following does work, and I'm not sure why:
    // plugins.add(file("dependency-plugin/build/idea-sandbox/plugins/dependency-plugin"))
}

tasks {
    patchPluginXml {
        sinceBuild.set("231")
        version.set(project.version.toString())
    }
}