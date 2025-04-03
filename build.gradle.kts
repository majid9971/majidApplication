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
        property("sonar.sourceEncoding", "UTF-8")
        property("sonar.sources", "app/src/main")
        property("sonar.tests", "app/src/test")
        property("sonar.exclusions", "**/test/**, **/*Test.java") 
        property("sonar.java.binaries", "app/build")
    }
}
