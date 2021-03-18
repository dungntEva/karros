package com.karros.movie.model.respository

import com.karros.movie.model.network.api.TopRatedApiService
import com.karros.movie.model.network.dto.TopRatedResponseDto
import retrofit2.Call

class TopRatedRespositoryImpl (
    private val topRatedApiService: TopRatedApiService
): TopRatedRespository {
    override fun getTopRated(apiKey: String): Call<TopRatedResponseDto> {
        return topRatedApiService.getTopRated(apiKey)
    }
}