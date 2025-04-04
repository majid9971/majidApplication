plugins {
    alias(libs.plugins.android.application) apply false
    id("org.sonarqube") version "3.5.0.2730"
}

sonarqube {
    properties {
        property("sonar.projectKey", "mobile_application")
        property("sonar.projectVersion", "1.1")
        property("sonar.host.url", "http://localhost:9000")
        property("sonar.login", System.getenv("SONAR_TOKEN") ?: "sqp_82a68053680aa6ce18b6d893bb1aa66f0891a84b")
        property("sonar.sourceEncoding", "UTF-8")

        // ✅ Explicit paths - no room for overlap
        property("sonar.sources", "app/src/main/java")
        property("sonar.tests", "app/src/test/java,app/src/androidTest/java")
        property("sonar.test.inclusions", "**/*Test.java,**/*Test.kt,**/test/**,**/androidTest/**")
        property("sonar.exclusions", "**/build/**")

        // ✅ compiled bytecode path
        property("sonar.java.binaries", "app/build/intermediates/javac/debug/classes")
    }
}




