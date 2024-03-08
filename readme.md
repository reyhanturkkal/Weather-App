# Weather App

This project is a weather application that provides users with detailed weather information for a specific city. The application allows users to view the current weather conditions, including temperature, wind speed, and humidity, as well as a 5-day weather forecast. Users can also select different cities to check the weather details for those locations.

## OpenWeather API Usage

The following free services of the OpenWeatherMap platform were utilized in this project:

<b>Current Weather</b>: Provides real-time weather information for a specific location.<br/>
<b>3-hour Forecast for 5 days</b>: Offers weather forecasts with a granularity of 3 hours for the next 5 days.<br/>
<b>Geocoding API</b>: Allows converting geographic coordinates (latitude and longitude) into human-readable addresses and vice versa.

For expanded weather services and tailored subscriptions, professionals and specialists can benefit from OpenWeatherMap's Professional Collections. These packages offer fixed monthly rates and API call limits, providing access to historical data, current conditions, forecasts, and weather maps through various tools beyond just the API. Obtain an API key and explore more at <a href="https://openweathermap.org/price">OpenWeatherMap</a>'s pricing page.

## Libraries

<b>Retrofit</b>
used to simplify interaction with RESTful APIs in the application.<br/>
<b>Gson Converter</b>
enables Gson integration with Retrofit for serialization and deserialization of JSON data.<br/>
<b>Gson</b>
simplifies serialization and deserialization of Java objects to and from JSON format.<br/>
<b>WeatherView</b>
employed to visualize weather information in the application's user interface.

## Tools

<b>OkHttp Client</b>
serves as an efficient HTTP client for network requests, and the Logging Interceptor facilitates logging of HTTP requests and responses for debugging.<br/>
<b>Lifecycle Extensions</b>
provides lifecycle-aware components to manage Android architecture components' lifecycles.<br/>
<b>BlurView</b>
used to apply blur effects to backgrounds and content within the app interface, enhancing visual appeal.<br/>
<b>Activity KTX</b>
offers Kotlin extensions for working with Android activities, simplifying common tasks and improving code readability.<br/>
<b>Glide</b>
utilized for efficient image loading and caching, enabling seamless handling of images from various sources.

## Dependencies and Configurations

```kotlin
dependencies {
    // Retrofit
    implementation 'com.squareup.retrofit2:retrofit:2.9.0'
    implementation 'com.squareup.retrofit2:converter-gson:2.9.0'

    // Ok Http client
    implementation 'com.squareup.okhttp3:okhttp:4.12.0'
    implementation 'com.squareup.okhttp3:logging-interceptor:4.9.3'

    // Lifecycle
    implementation "androidx.lifecycle:lifecycle-extensions:2.2.0"
    implementation "androidx.lifecycle:lifecycle-runtime-ktx:2.6.2"
    implementation "androidx.lifecycle:lifecycle-viewmodel:2.6.2"
    implementation "androidx.lifecycle:lifecycle-livedata:2.6.2"

    // Gson
    implementation 'com.google.code.gson:gson:2.9.1'

    // Other
    implementation 'com.github.MatteoBattilana:WeatherView:3.0.0'

    // View Model
    implementation 'com.github.Dimezis:BlurView:version-2.0.3'
    implementation ('androidx.activity:activity-ktx:1.8.2')
    implementation 'com.github.bumptech.glide:glide:4.12.0'
}
```

```kotlin
android {
    compileSdkVersion 34
    defaultConfig {
        minSdkVersion 26
        targetSdkVersion 34
    }
```

```kotlin
// AndroidManifest.xml
<uses-permission android:name="android.permission.INTERNET"/>
<uses-permission android:name="android.permission.ACCESS_NETWORK_STATE" />
```

## Images of the Application

<table style="border-collapse: collapse; width: 100%;">
  <tr>
    <td align="center" style="padding: 8px; border: none;"><img src="https://github.com/reyhanturkkal/Weather-App/blob/master/assets/cloudyCity-1.jpg" alt="cloudy"></td>
    <td align="center" style="padding: 8px; border: none;"><img src="https://github.com/reyhanturkkal/Weather-App/blob/master/assets/cloudyCity-2.jpg" alt="cloudy"></td>
    <td align="center" style="padding: 8px; border: none;"><img src="https://github.com/reyhanturkkal/Weather-App/blob/master/assets/cloudyCity.jpg" alt="cloudy"></td>
  </tr>
      <tr>
    <td align="center" style="padding: 8px; border: none;"><img src="https://github.com/reyhanturkkal/Weather-App/blob/master/assets/rainyCity.jpg" alt="rainy"></td>
    <td align="center" style="padding: 8px; border: none;"><img src="https://github.com/reyhanturkkal/Weather-App/blob/master/assets/snowyCity.jpg" alt="snowy"></td>
    <td align="center" style="padding: 8px; border: none;"><img src="https://github.com/reyhanturkkal/Weather-App/blob/master/assets/clearCity.jpg" alt="clear"></td>
  </tr>
    <tr>
    <td align="center" style="padding: 8px; border: none;"><img src="https://github.com/reyhanturkkal/Weather-App/blob/master/assets/citySearch.jpg" alt="search"></td>
    <td align="center" style="padding: 8px; border: none;"><img src="https://github.com/reyhanturkkal/Weather-App/blob/master/assets/searchingCity.jpg" alt="search"></td>
    <td align="center" style="padding: 8px; border: none;"><img src="https://github.com/reyhanturkkal/Weather-App/blob/master/assets/citySearching.jpg" alt="search"></td>
  </tr>
</table>
