import java.net.URI

pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven {
            url = URI("https://github.com/jitsi/jitsi-maven-repository/raw/master/releases")
        }
        maven {
            url = URI("https://maven.google.com")
        }
    }
}

rootProject.name = "JitsiDemo"
include(":app")
 