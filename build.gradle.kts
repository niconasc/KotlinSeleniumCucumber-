import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.7.21"
    application
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    // https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager
    implementation("io.github.bonigarcia:webdrivermanager:5.3.2")

    // https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java
    implementation("org.seleniumhq.selenium:selenium-java:4.7.2")

    // https://mvnrepository.com/artifact/io.cucumber/cucumber-java
    testImplementation("io.cucumber:cucumber-java:5.6.0")

    // https://mvnrepository.com/artifact/io.cucumber/cucumber-junit
    testImplementation("io.cucumber:cucumber-junit:5.6.0")

    // https://mvnrepository.com/artifact/junit/junit
    testImplementation("junit:junit:4.13.2")


}

tasks.test {
    useJUnitPlatform()
    systemProperty("cucumber.options", System.getProperty("cucumber.options"))
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}

application {
    mainClass.set("MainKt")
}