package com.example.test.Api

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {
    @GET("Elixirs/{id}")
    fun getPostById(@Path("id") postId: String): Call<Post>
}