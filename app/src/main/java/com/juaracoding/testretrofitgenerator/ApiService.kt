package com.juaracoding.testretrofitgenerator

import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
//    @Headers("X-Api-Key: 12345")
    @GET("posts")
    fun getPosts(): Call<List<Post>>
}