// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "8.2.2" apply false


}

buildscript {
    repositories {
        google()
        mavenCentral()
        jcenter()
    }
    dependencies {
       classpath("io.realm:realm-gradle-plugin:10.15.1")
        classpath("com.android.tools.build:gradle:4.2.2")
    }
}