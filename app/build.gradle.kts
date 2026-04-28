plugins {
    alias(libs.plugins.kotlin.jvm)
    application
}

application {
    mainClass.set("ai.review.MainKt")
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(libs.versions.jdkVersion.get())
    }
}
