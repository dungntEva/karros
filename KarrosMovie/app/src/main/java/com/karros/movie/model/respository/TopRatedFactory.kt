package com.karros.movie.model.respository

import com.karros.movie.model.RetrofitClient
import com.karros.movie.model.network.api.TopRatedApiService

object TopRatedFactory {

    private var topRatedRespo: TopRatedRespository? = null

    fun getTopRated(): TopRatedRespository {
        if (topRatedRespo == null) {
            topRatedRespo =
                TopRatedRespositoryImpl(
                    topRatedApiService = RetrofitClient.getService(TopRatedApiService::class.java)
                )
        }
        return topRatedRespo as TopRatedRespository
    }
}