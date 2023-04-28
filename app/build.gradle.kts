plugins {
    id (Configs.androidApplication)
    id (Configs.kotlinJetBrains)
    id (Configs.kotlinKapt)
    id (Configs.daggerHiltPlugin)
    id (Configs.safeArgs)
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
    buildFeatures {
        viewBinding = true
    }
}

dependencies {

    implementation(project(Modules.data))
    implementation(project(Modules.domain))
    implementation(project(Modules.util))
    implementation(project(Modules.navigation))
    implementation(project(Modules.feature))

    implementation (Dependencies.androidCoreKtx)
    implementation (Dependencies.appCompat)
    implementation (Dependencies.material)
    implementation (Dependencies.constraintLayout)
    testImplementation (Dependencies.junit4)
    androidTestImplementation (Dependencies.junitExtensions)
    androidTestImplementation (Dependencies.espressoCore)

    kapt(Dependencies.daggerHiltCompiler)
    implementation(Dependencies.daggerHilt)
    implementation(Dependencies.gson)
    implementation(Dependencies.navigationUi)
    implementation(Dependencies.navigationFrag)
    implementation(Dependencies.navigationSafeArgs)
}