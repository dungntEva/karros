package com.karros.movie.model.respository

import com.karros.movie.model.network.api.DetailMovieApiService
import com.karros.movie.model.network.dto.DetailMovieDto
import retrofit2.Call

class DetailMovieRespositoryImpl (
    private val detailMovieApiService: DetailMovieApiService
): DetailMovieRespository {
    override fun getDetailMovie(movieId: Int,
                             apiKey: String): Call<DetailMovieDto> {
        return detailMovieApiService.getDetailMovie(movieId, apiKey)
    }
}