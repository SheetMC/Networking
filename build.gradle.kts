/*
 *     SheetMC Networking: build.gradle.kts
 *     Copyright (C) 2025 SheetMC.org
 *
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU Affero General Public License as published
 *     by the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU Affero General Public License for more details.
 *
 *     You should have received a copy of the GNU Affero General Public License
 *     along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

plugins {
    kotlin("jvm") version "2.2.10"
    kotlin("plugin.serialization") version "2.2.0"
    id("org.jetbrains.dokka") version "2.0.0"
    id("io.ktor.plugin") version "3.3.0"
}

group = "org.sheetmc.networking"
version = "0.0.1"

repositories {
    mavenCentral()
}

dependencies {
    implementation("io.ktor:ktor-server-core-jvm")
    implementation("io.ktor:ktor-server-cio")
    implementation("ch.qos.logback:logback-classic:1.4.15")
    implementation("io.ktor:ktor-server-core")
    testImplementation("io.ktor:ktor-server-test-host")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.10.2")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.9.0")
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}

dokka {
    dokkaPublications.html {
        outputDirectory.set(layout.projectDirectory.dir("docs/html").asFile)
    }
}
