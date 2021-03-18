package com.karros.movie.viewmodel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.karros.movie.MainActivity
import com.karros.movie.model.RetrofitClient
import com.karros.movie.model.network.api.TopRatedApiService
import com.karros.movie.model.network.dto.TopRatedResponseDto
import com.karros.movie.model.respository.TopRatedRespository
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class TopRatedViewModel (topRated: TopRatedRespository) : ViewModel() {

    val topRatedResponseResult by lazy {
        MutableLiveData<TopRatedResponseDto>()
    }

    public override fun onCleared() {
        super.onCleared()
    }

    fun getTopRated() {
        RetrofitClient.getService(TopRatedApiService::class.java).getTopRated(MainActivity.API_KEY)
            .enqueue(object : Callback<TopRatedResponseDto> {

                override fun onResponse(call: Call<TopRatedResponseDto>,
                                        response: Response<TopRatedResponseDto>
                ) {
                    if (response.isSuccessful) {
                        topRatedResponseResult.value = response?.body()
                    } else {
                        topRatedResponseResult.value = null
                    }

                }

                override fun onFailure(call: Call<TopRatedResponseDto>, t: Throwable) {
                    Log.e("dungnt", "onFailure")
                    topRatedResponseResult.value = null
                }
            })
    }
}