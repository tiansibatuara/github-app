package com.example.githubapp

import retrofit2.Call
import retrofit2.http.*

interface ApiService {
    @GET("search/users")
    @Headers("Authorization= token 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")
    fun getUser(
        @Path("q") id: String
    ): Call<GithubResponse>
}