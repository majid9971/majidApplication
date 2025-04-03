// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    id("org.sonarqube") version "4.4.1.3373"
}
//sonarqube {
//    properties {
 //       property("sonar.projectKey", "mobile_application")
//        property("sonar.organization", "majid9971")
 //       property("sonar.host.url", "https://sonarcloud.io")
  //  }

sonarqube {
    properties {
        property("sonar.projectKey", "mobile_application")
        property("sonar.projectVersion", "1.1")
        property("sonar.host.url", "http://127.0.0.1:9000")
        property("sonar.login", System.getenv("SONAR_TOKEN")) // Use environment variable for security
           property("sonar.sourceEncoding", "UTF-8")
        property("sonar.language", "java")

        // Define source and test directories properly
        property("sonar.sources", "app/src/main")
        property("sonar.tests", "app/src/test")

        // Exclude test files from main source indexing
        property("sonar.exclusions", "**/test/**, **/*Test.java")

        // Ensure test files are indexed correctly
        property("sonar.test.inclusions", "app/src/test/**/*.java")

        // Point to Java binaries
        property("sonar.java.binaries", "app/build")
    }
}
