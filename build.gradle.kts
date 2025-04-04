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

        // Disjoint sets — avoid overlap
        property("sonar.sources", "app/src/main/java")
        property("sonar.tests", "app/src/test/java,app/src/androidTest/java")

        // Optional: exclude AndroidManifest and other non-code files
        property("sonar.exclusions", "**/AndroidManifest.xml,**/*.gradle.kts,**/test/**,**/*Test.java")

        property("sonar.java.binaries", "app/build/intermediates/javac/debug/classes")
    }
}

