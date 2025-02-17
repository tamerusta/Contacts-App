# Weather Application</p>


## Overview

A contact application that works on a local database, where you can save, edit and delete contact numbers.

## Technologies

-Kotlin
</p>-Room
</p>-Hilt
</p>-MVVM


## Screenshots


<div style="display: flex; flex-wrap: wrap;">
    <img width="200" alt="contacts1" src="https://github.com/user-attachments/assets/93d091be-965c-4b40-9985-5513c513983c">
    <img width="200" alt="contacts2" src="https://github.com/user-attachments/assets/15e5f986-4e50-4b98-af18-6880aa1f830b">
    <img width="200" alt="contacts3" src="https://github.com/user-attachments/assets/ca764fca-8e38-41a5-bbed-6e82444201c8">
</div>


## Dependencies

```kotlin
dependencies {
    
    implementation("androidx.core:core-ktx:1.13.1")
    implementation("androidx.appcompat:appcompat:1.7.0")
    implementation("com.google.android.material:material:1.12.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("androidx.navigation:navigation-fragment-ktx:2.7.7")
    implementation("androidx.navigation:navigation-ui-ktx:2.7.7")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.2.1")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.6.1")

    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.8.4")

    implementation("com.google.dagger:hilt-android:2.50")
    kapt("com.google.dagger:hilt-android-compiler:2.48.1")

    implementation("androidx.room:room-runtime:2.6.1")
    kapt("androidx.room:room-compiler:2.6.1")
    implementation("androidx.room:room-ktx:2.6.1")

    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.7.3")

    implementation("com.squareup.retrofit2:converter-gson:2.9.0")
}

```
