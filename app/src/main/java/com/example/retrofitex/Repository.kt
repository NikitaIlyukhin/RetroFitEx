package com.example.retrofitex

import retrofit2.Response

class Repository {
    suspend fun getCountry(): Response<CountryModel>{
        return Retrofit.api.getCountry()
    }
    suspend fun getCountryWithError(): Response<CountryModel>{
        return Retrofit.api.getCountryWithError()
    }
}