package com.karros.movie.model.respository

import com.karros.movie.model.RetrofitClient
import com.karros.movie.model.network.api.PopularApiService

object PopularFactory {

    private var popularRespo: PopularRespository? = null

    fun getPopular(): PopularRespository {
        if (popularRespo == null) {
            popularRespo =
                PopularRespositoryImpl(
                    popularApiService = RetrofitClient.getService(PopularApiService::class.java)
                )
        }
        return popularRespo as PopularRespository
    }
}