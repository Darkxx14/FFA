plugins {
    `java-library`
    `maven-publish`
}

repositories {
    mavenLocal()
    maven {
        url = uri("https://repo.bytecode.space/repository/maven-public/")
    }

    maven {
        url = uri("https://repo.papermc.io/repository/maven-public/")
    }

    maven {
        url = uri("https://oss.sonatype.org/content/groups/public/")
    }

    maven {
        url = uri("https://repo.dmulloy2.net/nexus/repository/public/")
    }

    maven {
        url = uri("https://repo.extendedclip.com/content/repositories/placeholderapi/")
    }

    maven {
        url = uri("https://maven.enginehub.org/repo/")
    }

    maven {
        url = uri("https://repo.maven.apache.org/maven2/")
    }
}

dependencies {
    api("com.zaxxer:HikariCP:5.1.0")
    compileOnly("io.papermc.paper:paper-api:1.20.4-R0.1-SNAPSHOT")
    compileOnly("ca.bkaw:paper-nms:1.20.4-SNAPSHOT")
    compileOnly("com.comphenix.protocol:ProtocolLib:5.1.0")
    compileOnly("me.clip:placeholderapi:2.11.5")
    compileOnly("com.sk89q.worldguard:worldguard-bukkit:7.0.8")
    compileOnly("com.fastasyncworldedit:FastAsyncWorldEdit-Core:2.7.0")
    compileOnly("com.fastasyncworldedit:FastAsyncWorldEdit-Bukkit:2.7.0")
}

group = "dev.darkxx"
version = "1.0.0"
description = "FFA"
java.sourceCompatibility = JavaVersion.VERSION_17

publishing {
    publications.create<MavenPublication>("maven") {
        from(components["java"])
    }
}

tasks.withType<JavaCompile>() {
    options.encoding = "UTF-8"
}

project.buildDir = File(rootDir, "output")

tasks.withType<Javadoc>() {
    options.encoding = "UTF-8"
}