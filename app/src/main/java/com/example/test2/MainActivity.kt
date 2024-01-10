package com.example.test2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.test.Api.ApiClient
import com.example.test.Api.Post
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

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
