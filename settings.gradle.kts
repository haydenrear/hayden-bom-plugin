rootProject.name = "hayden-bom-plugin"

dependencyResolutionManagement {
    versionCatalogs {
        repositories {
            mavenLocal()
        }
        create("vC") {
            from("com.hayden:hayden-catalog:0.0.2")
        }
    }
    repositories {
        mavenLocal()
    }
}
