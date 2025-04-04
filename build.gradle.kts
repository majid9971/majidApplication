plugins {
    alias(libs.plugins.android.application) apply false
    id("org.sonarqube") version "3.5.0.2730"
}

sonarqube {
    properties {
        property("sonar.projectKey", "mobile_application")
        property("sonar.projectVersion", "1.1")
        property("sonar.host.url", "http://localhost:9000")
        property("sonar.login", System.getenv("SONAR_TOKEN"))
        property("sonar.sourceEncoding", "UTF-8")

        // ✅ Explicitly set sources and tests to prevent overlap
        property("sonar.sources", "app/src/main/java")
        property("sonar.tests", "app/src/test/java,app/src/androidTest/java")

        // ✅ Java binaries
        property("sonar.java.binaries", "app/build/intermediates/javac/debug/classes")

        // ✅ Avoid scanning these files — just in case
        property("sonar.exclusions", "**/*Test.java,**/test/**,**/androidTest/**,**/build/**")

        // ✅ Make sure only test files are treated as tests
        property("sonar.test.inclusions", "**/*Test.java,**/test/**,**/androidTest/**")
    }
}



