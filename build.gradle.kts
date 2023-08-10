buildscript {

    val kotlinVersion = "1.7.0"

    repositories {
        google()
        mavenCentral()
    }



    dependencies {
        classpath("com.android.tools.build:gradle:7.4.0")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion")
        classpath("com.google.dagger:hilt-android-gradle-plugin:2.42")
        classpath("org.jetbrains.kotlin:kotlin-serialization:$kotlinVersion")

    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}