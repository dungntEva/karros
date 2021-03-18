package com.karros.movie.viewmodel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.karros.movie.MainActivity
import com.karros.movie.model.RetrofitClient
import com.karros.movie.model.network.api.DetailMovieApiService
import com.karros.movie.model.network.dto.DetailMovieDto
import com.karros.movie.model.respository.DetailMovieRespository
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class DetailMovieViewModel (detailMovie: DetailMovieRespository) : ViewModel() {

    val detailMovieResponseResult by lazy {
        MutableLiveData<DetailMovieDto>()
    }

    public override fun onCleared() {
        super.onCleared()
    }

    fun getDetailMovie(movieId: Int) {
        RetrofitClient.getService(DetailMovieApiService::class.java).getDetailMovie(movieId, MainActivity.API_KEY)
            .enqueue(object : Callback<DetailMovieDto> {

                override fun onResponse(call: Call<DetailMovieDto>,
                                        response: Response<DetailMovieDto>
                ) {
                    if (response.isSuccessful) {
                        detailMovieResponseResult.value = response?.body()
                    } else {
                        detailMovieResponseResult.value = null
                    }

                }

                override fun onFailure(call: Call<DetailMovieDto>, t: Throwable) {
                    Log.e("dungnt", "onFailure")
                    detailMovieResponseResult.value = null
                }
            })
    }
}