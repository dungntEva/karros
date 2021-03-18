package com.karros.movie.model.network.api

import com.karros.movie.model.network.dto.TrendingResponseDto
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface TrendingApiService {

    //https://api.themoviedb.org/3/trending/all/week?api_key=a7b3c9975791294647265c71224a88ad
    @GET("trending/{media_type}/{time_window}")
    fun getTrending(
        @Path("media_type") mediaType: String,
        @Path("time_window") timeWindow: String,
        @Query("api_key") apiKey: String): Call<TrendingResponseDto>
}