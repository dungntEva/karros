package com.karros.movie.model.respository

import com.karros.movie.model.RetrofitClient
import com.karros.movie.model.network.api.UpcomingApiService

object UpcomingFactory {

    private var upcomingRespo: UpcomingRespository? = null

    fun getUpcoming(): UpcomingRespository {
        if (upcomingRespo == null) {
            upcomingRespo =
                UpcomingRespositoryImpl(
                    upcomingApiService = RetrofitClient.getService(UpcomingApiService::class.java)
                )
        }
        return upcomingRespo as UpcomingRespository
    }
}