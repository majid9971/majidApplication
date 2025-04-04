plugins {
    alias(libs.plugins.android.application) apply false
    id("org.sonarqube") version "3.5.0.2730"
}

sonarqube {
    properties {
        property("sonar.projectKey", "mobile_application")
        property("sonar.projectName", "Mobile Application")
        property("sonar.projectVersion", "1.1")
        property("sonar.host.url", "http://localhost:9000")
        property("sonar.login", System.getenv("SONAR_TOKEN") ?: "sqp_82a68053680aa6ce18b6d893bb1aa66f0891a84b")
        property("sonar.sourceEncoding", "UTF-8")

        // ✅ Only main source files
        property("sonar.sources", "app/src/main/java")

        // ✅ Only test source files
        property("sonar.tests", "app/src/test/java,app/src/androidTest/java")

        // ✅ Include only files that look like test files
        property("sonar.test.inclusions", "**/*Test.java,**/*Test.kt")

        // ✅ Exclude build folders and generated files
        property("sonar.exclusions", "**/build/**,**/R.class,**/R.java,**/BuildConfig.java")

        // ✅ Explicitly include only app source files
        property("sonar.inclusions", "app/src/main/java/**/*.java")

        // ✅ Required for bytecode
        property("sonar.java.binaries", "app/build/intermediates/javac/debug/classes")
    }
}
