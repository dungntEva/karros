package com.karros.movie.model.respository

import com.karros.movie.model.network.api.TrendingApiService
import com.karros.movie.model.network.dto.TrendingResponseDto
import retrofit2.Call

class TrendingRespositoryImpl (
    private val trendingApiService: TrendingApiService
): TrendingRespository {
    override fun getTrending(mediaType: String,
                             timeWindow: String,
                             apiKey: String): Call<TrendingResponseDto> {
        return trendingApiService.getTrending(mediaType, timeWindow, apiKey)
    }
}