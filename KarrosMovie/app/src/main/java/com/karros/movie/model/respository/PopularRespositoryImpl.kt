package com.karros.movie.model.respository

import com.karros.movie.model.network.api.PopularApiService
import com.karros.movie.model.network.dto.PopularResponseDto
import retrofit2.Call

class PopularRespositoryImpl (
    private val popularApiService: PopularApiService
): PopularRespository {
    override fun getPopular(apiKey: String): Call<PopularResponseDto> {
        return popularApiService.getPopular(apiKey)
    }

    override fun getRecommendations(movieId: Int, apiKey: String): Call<PopularResponseDto> {
        return popularApiService.getRecommendation(movieId, apiKey)
    }


}