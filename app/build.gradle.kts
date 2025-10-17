plugins {
    // FIX: Each plugin declaration must be on its own line.
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.lighter.appx"
    compileSdk = 34
    buildFeatures {
        dataBinding = true
        viewBinding = true
    }
    defaultConfig {
        applicationId = "com.lighter.appx"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

    }

    buildTypes {
        release {
            isMinifyEnabled = false
        }
    }
    // Add these compile options if they are not present
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    implementation("androidx.appcompat:appcompat:1.7.0")
    implementation("com.google.android.material:material:1.12.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")

    // --- THIS IS THE FIX ---
    // Add these lines to include the Navigation Component
    val nav_version = "2.7.7" // Use the latest stable version
    implementation("androidx.navigation:navigation-fragment-ktx:$nav_version")
    implementation("androidx.navigation:navigation-ui-ktx:$nav_version")
    // -----------------------
}
