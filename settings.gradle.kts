pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "advanced modularization api impl"
include(":app")
include(":feature:feature-a")
include(":feature:feature-b")
include(":core:kotlin")
include(":core:navigation")
include(":core:network")
include(":core:android")
include(":core:commons")
