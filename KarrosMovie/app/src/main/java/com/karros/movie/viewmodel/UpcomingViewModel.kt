package com.karros.movie.viewmodel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.karros.movie.MainActivity
import com.karros.movie.model.RetrofitClient
import com.karros.movie.model.network.api.UpcomingApiService
import com.karros.movie.model.network.dto.UpcomingResponseDto
import com.karros.movie.model.respository.UpcomingRespository
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class UpcomingViewModel (upcoming: UpcomingRespository) : ViewModel() {

    val upcomingResponseResult by lazy {
        MutableLiveData<UpcomingResponseDto>()
    }

    public override fun onCleared() {
        super.onCleared()
    }

    fun getUpcoming() {
        RetrofitClient.getService(UpcomingApiService::class.java).getUpcoming(MainActivity.API_KEY)
            .enqueue(object : Callback<UpcomingResponseDto> {

                override fun onResponse(call: Call<UpcomingResponseDto>,
                                        response: Response<UpcomingResponseDto>
                ) {
                    if (response.isSuccessful) {
                        upcomingResponseResult.value = response?.body()
                    } else {
                        upcomingResponseResult.value = null
                    }

                }

                override fun onFailure(call: Call<UpcomingResponseDto>, t: Throwable) {
                    Log.e("dungnt", "onFailure")
                    upcomingResponseResult.value = null
                }
            })
    }
}