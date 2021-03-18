package com.karros.movie.model.network.api

import com.karros.movie.model.network.dto.UpcomingResponseDto
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface UpcomingApiService {
    //https://api.themoviedb.org/3/movie/upcoming?api_key=a7b3c9975791294647265c71224a88ad
    @GET("movie/upcoming")
    fun getUpcoming(
        @Query("api_key") apiKey: String
    ): Call<UpcomingResponseDto>
}