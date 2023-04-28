plugins {
    id (Configs.androidLibrary)
    id (Configs.kotlinJetBrains)
}

android {
    namespace = "com.harunbekcan.navigation"
    compileSdk = Configs.compileSdk

    defaultConfig {
        minSdk = Configs.minSdk
        targetSdk = Configs.targetSdk

        testInstrumentationRunner = Configs.testInstrumentationRunner
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = Configs.jvmTarget.toString()
    }
}

dependencies {

    implementation (Dependencies.androidCoreKtx)
    implementation (Dependencies.appCompat)
    implementation (Dependencies.material)
    testImplementation (Dependencies.junit4)
    androidTestImplementation (Dependencies.junitExtensions)
    androidTestImplementation (Dependencies.espressoCore)

    implementation(Dependencies.navigationUi)
    implementation(Dependencies.navigationFrag)

}