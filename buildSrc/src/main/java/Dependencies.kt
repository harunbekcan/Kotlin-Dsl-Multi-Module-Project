
object Dependencies {
    //Androidx
    const val androidCoreKtx = "androidx.core:core-ktx:${Versions.coreKtxVersion}"
    const val appCompat = "androidx.appcompat:appcompat:${Versions.appCompatVersion}"

    //Material
    const val material = "com.google.android.material:material:${Versions.materialVersion}"

    //ConstraintLayout
    const val constraintLayout = "androidx.constraintlayout:constraintlayout:${Versions.constraintLayoutVersion}"

    //Test
    const val junit4 = "junit:junit:${Versions.junit4Version}"
    const val junitExtensions = "androidx.test.ext:junit:${Versions.junitExtensionsVersion}"
    const val espressoCore = "androidx.test.espresso:espresso-core:${Versions.espressoCoreVersion}"

    //Hilt
    const val daggerHilt = "com.google.dagger:hilt-android:${Versions.hiltVersion}"
    const val daggerHiltCompiler = "com.google.dagger:hilt-compiler:${Versions.hiltVersion}"

    //Retrofit
    const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofitVersion}"
    const val retrofitConverter = "com.squareup.retrofit2:converter-gson:${Versions.retrofitVersion}"

    //Navigation
    const val navigation = "androidx.navigation:navigation-ui-ktx:${Versions.navigationVersion}"
    const val navigationFrag = "androidx.navigation:navigation-fragment-ktx:${Versions.navigationVersion}"

    //OkHttp
    const val okHttp = "com.squareup.okhttp3:okhttp:${Versions.okHttpVersion}"
    const val okHttpLoggingInterceptor = "com.squareup.okhttp3:logging-interceptor:${Versions.okHttpVersion}"

    // Gson
    const val gson = "com.google.code.gson:gson:${Versions.gson}"

    //Glide
    const val glide = "com.github.bumptech.glide:glide:${Versions.glide}"
}