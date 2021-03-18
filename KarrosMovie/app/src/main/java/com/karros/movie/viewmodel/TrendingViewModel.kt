package com.karros.movie.viewmodel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.karros.movie.MainActivity
import com.karros.movie.model.RetrofitClient
import com.karros.movie.model.network.api.TrendingApiService
import com.karros.movie.model.network.dto.TrendingResponseDto
import com.karros.movie.model.respository.TrendingRespository
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class TrendingViewModel (trending: TrendingRespository) : ViewModel() {

    val trendingResponseResult by lazy {
        MutableLiveData<TrendingResponseDto>()
    }

    public override fun onCleared() {
        super.onCleared()
    }

    fun getTrending() {
        RetrofitClient.getService(TrendingApiService::class.java).getTrending("all", "week", MainActivity.API_KEY)
            .enqueue(object : Callback<TrendingResponseDto> {

                override fun onResponse(call: Call<TrendingResponseDto>,
                                        response: Response<TrendingResponseDto>
                ) {
                    if (response.isSuccessful) {
                        trendingResponseResult.value = response?.body()
                    } else {
                        trendingResponseResult.value = null
                    }

                }

                override fun onFailure(call: Call<TrendingResponseDto>, t: Throwable) {
                    Log.e("dungnt", "onFailure")
                    trendingResponseResult.value = null
                }
            })
    }
}