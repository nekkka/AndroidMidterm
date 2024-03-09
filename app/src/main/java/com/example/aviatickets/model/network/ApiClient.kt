package com.example.aviatickets.model.network

import com.example.aviatickets.model.service.FakeService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiClient {
    private const val BASE_URL = "https://my-json-server.typicode.com/estharossa/fake-api-demo/offer_list"

    private val retrofit: Retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

   // val apiService: FakeService = retrofit.create(FakeService::class.java)
}
