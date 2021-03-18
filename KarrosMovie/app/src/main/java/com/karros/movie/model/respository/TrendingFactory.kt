package com.karros.movie.model.respository

import com.karros.movie.model.RetrofitClient
import com.karros.movie.model.network.api.TrendingApiService

object TrendingFactory {
    private var trendingRespo: TrendingRespository? = null

    fun getTrending(): TrendingRespository {
        if (trendingRespo == null) {
            trendingRespo =
                TrendingRespositoryImpl(
                    trendingApiService = RetrofitClient.getService(TrendingApiService::class.java)
                )
        }
        return trendingRespo as TrendingRespository
    }
}