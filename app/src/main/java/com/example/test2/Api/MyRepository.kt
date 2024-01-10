package com.example.test.Api

import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MyRepository(private val apiService: ApiService) {

    fun getPost(onResult: (Result<Post>) -> Unit) {
        val postId = "0106fb32-b00d-4d70-9841-4b7c2d2cca71" // Replace with the desired post ID
        val call = ApiClient.apiService.getPostById(postId)

        call.enqueue(object : Callback<Post> {
            override fun onResponse(call: Call<Post>, response: Response<Post>) {
                if (response.isSuccessful) {
                    val post = response.body()
                    if (post != null) {
                        print(post.name)
                    }
                } else {
                    // Handle error
                }
            }

            override fun onFailure(call: Call<Post>, t: Throwable) {
                // Handle failure
            }
        })
    }
}