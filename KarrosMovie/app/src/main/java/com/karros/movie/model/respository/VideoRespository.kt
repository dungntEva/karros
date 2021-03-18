package com.karros.movie.model.respository

import com.karros.movie.model.network.VideoResponseDto
import retrofit2.Call

interface VideoRespository {

    fun getVideo(
        movieId: Int,
        apiKey: String
    ): Call<VideoResponseDto>
}