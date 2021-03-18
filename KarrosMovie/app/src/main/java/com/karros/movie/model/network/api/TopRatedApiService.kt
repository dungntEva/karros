package com.karros.movie.model.network.api

import com.karros.movie.model.network.dto.TopRatedResponseDto
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface TopRatedApiService {
    //https://api.themoviedb.org/3/movie/top_rated?api_key=a7b3c9975791294647265c71224a88ad
    @GET("movie/top_rated")
    fun getTopRated(
        @Query("api_key") apiKey: String
    ): Call<TopRatedResponseDto>
}