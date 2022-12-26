package com.example.retrofitex

import retrofit2.converter.gson.GsonConverterFactory

object Retrofit {
    private val retrofit by lazy {
        retrofit2.Retrofit
            .Builder()
            .baseUrl("https://disease.sh/v2/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
    val  api:ApiService by lazy {
        retrofit.create(ApiService::class.java)
    }
}