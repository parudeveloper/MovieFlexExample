plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)

    id ("kotlin-kapt")
    id("com.google.dagger.hilt.android")
    id("kotlin-parcelize")

    /*
    id ("kotlin-kapt")
    id ("kotlin-parcelize")
    id ("com.google.dagger.hilt.android")
    * */
}

android {
    namespace = "com.movieflex"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.movieflex"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }

    buildFeatures {
        viewBinding = true
    }
}

dependencies {

    //implementation(libs.androidx.databinding.runtime)
    //implementation(libs.androidx.core.ktx)
    //implementation(libs.androidx.core.ktx.v1131)

    val core_version = "1.13.1"
    // Kotlin
    implementation("androidx.core:core-ktx:$core_version")

    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)


    //Navigation Components
    implementation("androidx.navigation:navigation-fragment-ktx:2.8.4")
    implementation("androidx.navigation:navigation-ui-ktx:2.8.4")

    //Image Loading
    implementation ("com.github.bumptech.glide:glide:4.16.0")
    kapt ("com.github.bumptech.glide:compiler:4.16.0")

    // ViewModel
    implementation ("androidx.lifecycle:lifecycle-viewmodel-ktx:2.8.7")
    // LiveData
    implementation ("androidx.lifecycle:lifecycle-livedata-ktx:2.8.7")
    implementation ("androidx.lifecycle:lifecycle-viewmodel-savedstate:2.8.7")
    implementation ("androidx.lifecycle:lifecycle-extensions:2.2.0")

    //Shimmer
    implementation ("com.facebook.shimmer:shimmer:0.5.0")

    // Airbnb lottie animation
    implementation("com.airbnb.android:lottie:5.2.0")

    // Intuit ssp & sdp
    implementation ("com.intuit.sdp:sdp-android:1.1.0")
    implementation ("com.intuit.ssp:ssp-android:1.1.0")

    // Preferences DataStore
    implementation("androidx.datastore:datastore-preferences:1.1.1")

    // ScrollingPagerIndicator
    implementation ("ru.tinkoff.scrollingpagerindicator:scrollingpagerindicator:1.2.4")

    //Retrofit2
    implementation ("com.squareup.retrofit2:converter-gson:2.11.0")
    implementation ("com.squareup.retrofit2:retrofit:2.11.0")
    implementation ("com.squareup.okhttp3:okhttp:5.0.0-alpha.3")
    implementation ("com.squareup.retrofit2:converter-scalars:2.9.0")
    implementation ("com.squareup.okhttp3:logging-interceptor:5.0.0-alpha.3")



    //Dagger - Hilt
    implementation ("com.google.dagger:hilt-android:2.48")
    kapt ("com.google.dagger:hilt-compiler:2.48")

    //Shimmer
    implementation ("com.facebook.shimmer:shimmer:0.5.0")

    // VideoPlayer
    implementation ("com.pierfrancescosoffritti.androidyoutubeplayer:core:12.1.0")

    // Chrome Custom Tab
    implementation ("androidx.browser:browser:1.8.0")

    //Room Database
    implementation ("androidx.room:room-runtime:2.6.1")
    kapt ("androidx.room:room-compiler:2.6.1")
    implementation ("androidx.room:room-ktx:2.6.1")
}