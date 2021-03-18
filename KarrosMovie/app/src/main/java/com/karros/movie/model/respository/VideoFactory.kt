package com.karros.movie.model.respository

import com.karros.movie.model.RetrofitClient
import com.karros.movie.model.network.api.VideoApiService

object VideoFactory {
    private var videoRespo: VideoRespository? = null

    fun getVideo(): VideoRespository {
        if (videoRespo == null) {
            videoRespo =
                VideoRespositoryImpl(
                    videoApiService = RetrofitClient.getService(VideoApiService::class.java)
                )
        }
        return videoRespo as VideoRespository
    }
}