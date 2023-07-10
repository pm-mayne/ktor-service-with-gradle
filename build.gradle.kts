import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    val ksp_version = "1.8.21-1.0.11"
    kotlin("jvm") version "1.8.21"
    id("com.google.devtools.ksp") version "$ksp_version"
    application
}

apply {
    plugin("com.google.devtools.ksp")
}

sourceSets.main {
    java.srcDirs("build/generated/ksp/main/kotlin")
}

group = "perso.pmmayne"
version = "0.1"

repositories {
    mavenCentral()
}

dependencies {
    implementation("io.insert-koin:koin-core:3.4.1")
    implementation("io.insert-koin:koin-ktor:3.4.1")
    testImplementation(kotlin("test"))
    implementation("io.ktor:ktor-server-core:2.3.2")
    implementation("io.ktor:ktor-server-netty:2.3.2")
    implementation("io.insert-koin:koin-annotations:1.2.2")
    ksp("io.insert-koin:koin-ksp-compiler:1.2.2")
    implementation("io.insert-koin:koin-logger-slf4j:3.4.1")
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}

application {
    mainClass.set("MainKt")
}