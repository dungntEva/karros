package com.karros.movie.model.respository

import com.karros.movie.model.network.dto.TrendingResponseDto
import retrofit2.Call

interface TrendingRespository {

    fun getTrending(
        mediaType: String,
        timeWindow: String,
        apiKey: String
    ): Call<TrendingResponseDto>
}