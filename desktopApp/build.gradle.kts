import org.jetbrains.compose.desktop.application.dsl.TargetFormat
plugins{
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.jetbrainsCompose)
}

kotlin {
    jvm{
        compilations.all {
            kotlinOptions.jvmTarget = "17"
        }
    }
    sourceSets {
        getByName("jvmMain"){
            dependencies{
                implementation(project(":shared"))

                implementation(compose.desktop.currentOs)

                implementation(compose.foundation)
                implementation(compose.runtime)
                implementation(compose.foundation)
                implementation(compose.material)
                implementation(compose.material3)
                implementation(compose.ui)
            }
        }
    }
}

compose.desktop {
    application {
        mainClass = "kg.geekstudio.news.MainKt"
        nativeDistributions {
            targetFormats(TargetFormat.Dmg, TargetFormat.Msi, TargetFormat.Deb)
            packageName = "news"
            packageVersion = "1.0.0"
        }
    }
}
java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}