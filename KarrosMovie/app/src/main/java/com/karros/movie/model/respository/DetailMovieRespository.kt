package com.karros.movie.model.respository

import com.karros.movie.model.network.dto.DetailMovieDto
import retrofit2.Call

interface DetailMovieRespository {

    fun getDetailMovie(
        movieId: Int,
        apiKey: String
    ): Call<DetailMovieDto>
}