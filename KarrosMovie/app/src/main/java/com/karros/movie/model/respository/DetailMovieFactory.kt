package com.karros.movie.model.respository

import com.karros.movie.model.RetrofitClient
import com.karros.movie.model.network.api.DetailMovieApiService

object DetailMovieFactory {
    private var detailMovieRespo: DetailMovieRespository? = null

    fun getDetailMovie(): DetailMovieRespository {
        if (detailMovieRespo == null) {
            detailMovieRespo =
                DetailMovieRespositoryImpl(
                    detailMovieApiService = RetrofitClient.getService(DetailMovieApiService::class.java)
                )
        }
        return detailMovieRespo as DetailMovieRespository
    }
}