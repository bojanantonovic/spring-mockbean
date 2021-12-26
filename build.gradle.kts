plugins {
    java
    kotlin("jvm") version "1.6.0"
    kotlin("plugin.spring") version "1.6.0"
}

group = "ch.antonovic"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework:spring-context:5.3.14")
    testImplementation("org.springframework:spring-test:5.3.14")
    testImplementation("org.springframework.boot:spring-boot-test:2.6.2")
    testImplementation("org.mockito:mockito-junit-jupiter:4.2.0")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.2")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.2")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}
