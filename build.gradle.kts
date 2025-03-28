// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    id("org.sonarqube") version "4.4.1.3373"
}
sonarqube {
    properties {
        property("sonar.projectKey", "majid9971_majidApplication")
        property("sonar.organization", "majid9971")
        property("sonar.host.url", "https://sonarcloud.io")
    }
}
