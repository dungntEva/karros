package com.karros.movie.model.respository

import com.karros.movie.model.network.dto.UpcomingResponseDto
import retrofit2.Call

interface UpcomingRespository {

    fun getUpcoming(
        apiKey: String
    ): Call<UpcomingResponseDto>
}