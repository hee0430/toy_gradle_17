plugins {
    base
    java
//    kotlin("plugin.spring") version "1.9.21"
//    id("org.springframework.boot") version "3.1.6"
    id("io.spring.dependency-management") version "1.1.4"
}

group = "com.hhlee"
version = "0.0.1-SNAPSHOT"

java.sourceCompatibility = JavaVersion.VERSION_17
//val springBootVersion : String by extra("3.1.6")

repositories {
    mavenCentral()
}

dependencies {
    implementation("commons-io:commons-io:2.15.1")

    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks {
    javadoc {
        options.encoding = "UTF-8"
    }
    compileJava {
        options.encoding = "UTF-8"
    }
    compileTestJava {
        options.encoding = "UTF-8"
    }
}

tasks.test {
    useJUnitPlatform()
}