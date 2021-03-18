package com.karros.movie.model.network.api

import com.karros.movie.model.network.dto.PopularResponseDto
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface PopularApiService {
    //https://api.themoviedb.org/3/movie/popular?api_key=a7b3c9975791294647265c71224a88ad
    @GET("movie/popular")
    fun getPopular(
        @Query("api_key") apiKey: String
    ): Call<PopularResponseDto>

    //https://api.themoviedb.org/3/movie/527774/recommendations?api_key=a7b3c9975791294647265c71224a88ad
    @GET("movie/{movie_id}/recommendations")
    fun getRecommendation(@Path("movie_id") movieId: Int,
                          @Query("api_key") apiKey: String): Call<PopularResponseDto>
}