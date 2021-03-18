package com.karros.movie.model.respository

import com.karros.movie.model.network.dto.PopularResponseDto
import retrofit2.Call

interface PopularRespository {

    fun getPopular(
        apiKey: String
    ): Call<PopularResponseDto>

    fun getRecommendations(movieId: Int, apiKey: String
    ): Call<PopularResponseDto>
}