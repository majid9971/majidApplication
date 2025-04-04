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

        // Only source code
        property("sonar.sources", "app/src/main/java")

        // Only test code (no overlap)
        property("sonar.tests", "app/src/test/java,app/src/androidTest/java")

        // Java binaries for debug build
        property("sonar.java.binaries", "app/build/intermediates/javac/debug/classes")

        // Optional: prevent any common files from being indexed twice
        property("sonar.exclusions", "**/AndroidManifest.xml,**/*.gradle.kts,**/test/**,**/*Test.java")

        // Optional: prevent overlap explicitly
        property("sonar.test.inclusions", "**/test/**,**/*Test.java,**/androidTest/**")
    }
}


