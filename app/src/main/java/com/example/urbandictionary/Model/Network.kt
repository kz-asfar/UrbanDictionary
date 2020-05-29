package com.example.urbandictionary.Model

import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class Network {
    private fun retrofitCall() {
        val retrofit = Retrofit.Builder()
            .baseUrl("https://mashape-community-urban-dictionary.p.rapidapi.com")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        val apiInterface = retrofit.create(ApiInterface::class.java)
        apiInterface.getMeaning("")
            .enqueue(object : Callback<PokoResponse> {
                override fun onFailure(call: Call<PokoResponse>, t: Throwable) {

                }

                override fun onResponse(
                    call: Call<PokoResponse>,
                    response: Response<PokoResponse>
                ) {
                }

            })
    }
}