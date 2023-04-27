plugins {
    id (Configs.androidApplication)
    id (Configs.kotlinAndroid)
}

android {
    namespace = Configs.nameSpace
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
        jvmTarget = "1.8"
    }
}

dependencies {

    implementation (Dependencies.androidCoreKtx)
    implementation (Dependencies.appCompat)
    implementation (Dependencies.material)
    testImplementation (Dependencies.junit4)
    androidTestImplementation (Dependencies.junitExtensions)
    androidTestImplementation (Dependencies.espressoCore)

    implementation(Dependencies.okHttp)
    implementation(Dependencies.okHttpLoggingInterceptor)
    implementation(Dependencies.glide)
}