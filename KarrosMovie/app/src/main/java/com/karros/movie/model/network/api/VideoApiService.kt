package com.karros.movie.model.network.api

import com.karros.movie.model.network.VideoResponseDto
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface VideoApiService {
    //https://api.themoviedb.org/3/movie/484718/videos?api_key=a7b3c9975791294647265c71224a88ad
    @GET("movie/{movie_id}/videos")
    fun getVideo(
            @Path("movie_id") movieId: Int,
            @Query("api_key") apiKey: String
    ): Call<VideoResponseDto>
}