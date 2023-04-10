// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id (Configs.androidApplication) version Versions.androidAppVersion apply false
    id (Configs.androidLibrary) version Versions.androidLibraryVersion apply false
    id (Configs.kotlinJetBrains) version Versions.kotlinVersion apply false
    id (Configs.hilt) version Versions.hiltVersion apply false
}