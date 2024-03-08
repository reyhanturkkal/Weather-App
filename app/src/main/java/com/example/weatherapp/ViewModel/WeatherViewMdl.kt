package com.example.weatherapp.ViewModel

import androidx.lifecycle.ViewModel
import com.example.weatherapp.Repository.WeatherRepo
import com.example.weatherapp.Server.ApiClient
import com.example.weatherapp.Server.ApiServices

class WeatherViewMdl(val repository: WeatherRepo):ViewModel() {
    constructor():  this(WeatherRepo((ApiClient().getClient().create(ApiServices::class.java))))

    fun loadCurrentWeather(lat:Double, lng:Double, unit:String)=
        repository.getCurrentWeather(lat, lng, unit)

    fun loadForecastWeather(lat:Double, lng:Double, unit:String)=
        repository.getForecastWeather(lat, lng, unit)
}