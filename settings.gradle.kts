rootProject.name = "aoc2020"

pluginManagement {
    val kotlin_version: String by settings
    plugins {
        java
        kotlin("jvm") version kotlin_version
    }
}
