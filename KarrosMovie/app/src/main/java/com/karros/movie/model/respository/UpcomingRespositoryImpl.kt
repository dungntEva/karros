package com.karros.movie.model.respository

import com.karros.movie.model.network.api.UpcomingApiService
import com.karros.movie.model.network.dto.UpcomingResponseDto
import retrofit2.Call

class UpcomingRespositoryImpl (
    private val upcomingApiService: UpcomingApiService
): UpcomingRespository {
    override fun getUpcoming(apiKey: String): Call<UpcomingResponseDto> {
        return upcomingApiService.getUpcoming(apiKey)
    }
}