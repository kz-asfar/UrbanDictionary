package com.example.urbandictionary.Model

import com.example.urbandictionary.Model.PokoResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface ApiInterface {

    @Headers(value = [
        "x-rapidapi-host: mashape-community-urban-dictionary.p.rapidapi.com",
        "x-rapidapi-key: 204c7346aamshc6ddb01149fc846p17c420jsn63e4d4de7e44"
    ])
    @GET("/define")
    fun getMeaning(
        @Query("term") term: String
    ): Call<PokoResponse>
}