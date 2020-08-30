plugins {
    kotlin("jvm") version "1.4.0"
}

group = "dev.noyzys.sheduler"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()

    maven { url = uri("https://hub.spigotmc.org/nexus/content/repositories/snapshots/") }
    maven { url = uri("https://oss.sonatype.org/content/repositories/snapshots") }
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    compile(kotlin("reflect"))
    compileOnly("org.spigotmc:spigot-api:1.8.8-R0.1-SNAPSHOT")
    compileOnly(files("C:/Users/opel3/Desktop/Depends/PaperSpigot-1.8.8-R0.1-SNAPSHOT-latest.jar"))
}
