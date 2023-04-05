plugins {
    id (Configs.androidApplication)
    id (Configs.kotlinAndroid)
}

android {
    namespace = Configs.nameSpace
    compileSdk = Configs.compileSdk

    defaultConfig {
        applicationId = Configs.applicationId
        minSdk = Configs.minSdk
        targetSdk = Configs.targetSdk
        versionCode = Configs.versionCode
        versionName = Configs.versionName

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
    implementation (Dependencies.constraintLayout)
    testImplementation (Dependencies.junit4)
    androidTestImplementation (Dependencies.junitExtensions)
    androidTestImplementation (Dependencies.espressoCore)
}