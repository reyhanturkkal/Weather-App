package com.example.weatherapp.Repository

import com.example.weatherapp.Server.ApiServices

class WeatherRepo(val api:ApiServices) {

    fun getCurrentWeather(lat: Double, lng:Double, unit:String)=
        api.getCurrentWeather(lat,lng,unit,"your api key")

    fun getForecastWeather(lat: Double, lng:Double, unit:String)=
        api.getForecastWeather(lat,lng,unit,"your api key")
}