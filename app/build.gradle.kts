plugins {
    id 'com.android.application'
    id 'org.jetbrains.kotlin.android'

    //kapt
    id 'kotlin-kapt'
    //Hilt
    id 'com.google.dagger.hilt.android'
    //Navigation Safe Args
    id("androidx.navigation.safeargs")
}


android {
    compileSdk 32

    defaultConfig {
        applicationId "com.example.kotlin2Lesson1"
        minSdk 22
        targetSdk 32
        versionCode 1
        versionName "1.0"

        testInstrumentationRunner "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            minifyEnabled false
            proguardFiles getDefaultProguardFile('proguard-android-optimize.txt'), 'proguard-rules.pro'
        }
    }
    compileOptions {
        sourceCompatibility JavaVersion.VERSION_1_8
        targetCompatibility JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = '1.8'
    }
    buildFeatures {
        viewBinding = true

    }
}
dependencies {

    //Coroutines
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.0")

    //Core
    implementation 'androidx.core:core-ktx:1.7.0'
    //AddCompact

    implementation 'androidx.appcompat:appcompat:1.4.1'
    //MaterialDesign
    implementation 'com.google.android.material:material:1.5.0'
    //Ui Components
    implementation 'androidx.constraintlayout:constraintlayout:2.1.3'
    implementation 'androidx.legacy:legacy-support-v4:1.0.0'
    //Retrofit
    def retrofit_version = "2.9.0"
    implementation "com.squareup.retrofit2:retrofit:$retrofit_version"
    implementation "com.squareup.retrofit2:converter-gson:$retrofit_version"
    //OkHttp
    implementation 'com.squareup.okhttp3:okhttp-bom:4.9.3'
    implementation "com.squareup.okhttp3:okhttp"
    implementation "com.squareup.okhttp3:logging-interceptor"

    //Hilt
    def hilt_version = "2.41"
    implementation("com.google.dagger:hilt-android:2.38.1")
    kapt("com.google.dagger:hilt-android-compiler:2.38.1")
    //Lifecycle
    def lifecycle_version = "2.5.0-alpha04"
    //ViewModel
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:$lifecycle_version")
    //LiveData
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:$lifecycle_version")

    // Runtime
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:$lifecycle_version")
    //Navigation Component
    def nav_version = "2.4.1"
    implementation("androidx.navigation:navigation-fragment-ktx:$nav_version")
    implementation("androidx.navigation:navigation-ui-ktx:$nav_version")
    //Glide
    implementation 'com.github.bumptech.glide:glide:4.13.0'

    //View Binding Delegate
    def view_binding_property_delegate = '1.5.3'
    implementation 'com.github.kirich1409:viewbindingpropertydelegate-noreflection:1.5.3'

    //Padding
    def paging_version = "3.1.1"
    implementation("androidx.paging:paging-runtime:$paging_version")
}