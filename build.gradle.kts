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
val springBootVersion : String by extra("3.1.6")

repositories {
    mavenCentral()
}

dependencies {

    implementation("org.springframework.boot:spring-boot-starter-web:$springBootVersion")
//    implementation("org.springframework.boot:spring-boot-starter-webflux:$springBootVersion")

//    implementation("org.springframework.boot:spring-boot-starter-mail:$springBootVersion")
//    implementation("org.springframework.boot:spring-boot-starter-websocket:$springBootVersion")
//    implementation("org.springframework.boot:spring-boot-starter-jdbc:$springBootVersion")
//    implementation("org.springframework.boot:spring-boot-starter-security:$springBootVersion")
//    implementation("org.springframework.boot:spring-boot-starter-aop:$springBootVersion")
//    implementation("org.springframework.boot:spring-boot-starter-cache:$springBootVersion")

    compileOnly ("org.projectlombok:lombok:1.18.20")
    annotationProcessor("org.projectlombok:lombok:1.18.20")

    testImplementation("org.springframework.boot:spring-boot-starter-test:$springBootVersion")
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