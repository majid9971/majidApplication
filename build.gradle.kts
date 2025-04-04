plugins {
    alias(libs.plugins.android.application) apply false
    id("org.sonarqube") version "3.5.0.2730"
}

sonarqube {
    properties {
        property("sonar.projectKey", "mobile_application")
        property("sonar.projectVersion", "1.1")
        property("sonar.host.url", "http://localhost:9000")
        property("sonar.sourceEncoding", "UTF-8")

        // 🔧 These were likely the issue - cast them to lists properly
        property("sonar.sources", listOf("app/src/main"))
        property("sonar.tests", listOf("app/src/test"))
        property("sonar.exclusions", listOf("**/test/**", "**/*Test.java"))
        property("sonar.java.binaries", listOf("app/build"))
    }
}
