package com.example.retrofitex

import retrofit2.Response
import retrofit2.http.GET

interface ApiService {
    @GET("countries")
    suspend fun getCountry():Response<CountryModel>

    @GET("error")
    suspend fun getCountryWithError():Response<CountryModel>

}