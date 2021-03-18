package com.karros.movie.model.respository

import com.karros.movie.model.network.dto.TopRatedResponseDto
import retrofit2.Call

interface TopRatedRespository {

    fun getTopRated(
    apiKey: String
    ): Call<TopRatedResponseDto>
}