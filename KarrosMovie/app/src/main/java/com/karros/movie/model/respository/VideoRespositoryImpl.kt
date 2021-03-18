package com.karros.movie.model.respository

import com.karros.movie.model.network.VideoResponseDto
import com.karros.movie.model.network.api.VideoApiService
import retrofit2.Call

class VideoRespositoryImpl (
    private val videoApiService: VideoApiService
): VideoRespository {
    override fun getVideo(movieId: Int,
                                apiKey: String): Call<VideoResponseDto> {
        return videoApiService.getVideo(movieId, apiKey)
    }
}