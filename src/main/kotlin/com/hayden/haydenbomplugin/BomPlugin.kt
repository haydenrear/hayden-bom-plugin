package com.hayden.haydenbomplugin

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.plugins.ExtensionAware

open class Libraries {

        val aspectJWeaver = "org.aspectj:aspectjweaver:1.9.7"
        

        val kotlinGradle = "org.jetbrains.kotlin:kotlin-gradle-plugin:1.9.23"
        

        val netflixDgsLib = "com.netflix.graphql.dgs.codegen:graphql-dgs-codegen-gradle:6.0.3"
        

        val springBoot = "org.springframework.boot:spring-boot-gradle-plugin:3.2.5"
        

        val springDependencyManagement = "io.spring.gradle:dependency-management-plugin:1.1.4"
        

        val vertexAi = "com.google.cloud:google-cloud-vertexai:1.5.0"
        }

open class Plugins {
}

open class Bundles {
}

open class BuildSrcVersionCatalogCollector(val project: Project) {

    val libs = Libraries()
    val plugins = Plugins()
    val bundles = Bundles()

}

// TODO: hayden bom generator - generate this plugin with accessors.
class BomPlugin: Plugin<Project> {
    override fun apply(target: Project) {
        val extension = target.extensions.create("buildSrcLibs", BuildSrcVersionCatalogCollector::class.java)
    }
}