package com.example.dragonball.utils

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitProvider {
    companion object{
        private fun getRetrofit(): Retrofit {
            return Retrofit.Builder()
                .baseUrl("https://www.dragonball-api.com/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }

    }
}