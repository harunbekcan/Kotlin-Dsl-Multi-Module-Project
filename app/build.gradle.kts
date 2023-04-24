
plugins {
    id (Configs.androidApplication)
    id (Configs.kotlinAndroid)
    id (Configs.kotlinKapt)
    id (Configs.daggerHiltPlugin)
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
    implementation(project(":data"))
    implementation(project(":common"))
    implementation(project(":domain"))
    implementation(project(":feature"))
    implementation(project(":navigation"))


    implementation (Dependencies.androidCoreKtx)
    implementation (Dependencies.appCompat)
    implementation (Dependencies.material)
    implementation (Dependencies.constraintLayout)

    kapt(Dependencies.daggerHiltCompiler)
    implementation(Dependencies.daggerHilt)
    implementation(Dependencies.gson)
    implementation(Dependencies.navigation)

    testImplementation (Dependencies.junit4)
    androidTestImplementation (Dependencies.junitExtensions)
    androidTestImplementation (Dependencies.espressoCore)
}