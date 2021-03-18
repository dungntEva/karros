package com.karros.movie.viewmodel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.karros.movie.MainActivity
import com.karros.movie.model.RetrofitClient
import com.karros.movie.model.network.api.PopularApiService
import com.karros.movie.model.network.dto.PopularResponseDto
import com.karros.movie.model.respository.PopularRespository
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class PopularViewModel (popular: PopularRespository) : ViewModel() {

    val popularResponseResult by lazy {
        MutableLiveData<PopularResponseDto>()
    }

    val recommendationsResult by lazy {
        MutableLiveData<PopularResponseDto>()
    }

    public override fun onCleared() {
        super.onCleared()
    }

    fun getPopular() {
        RetrofitClient.getService(PopularApiService::class.java).getPopular(MainActivity.API_KEY)
            .enqueue(object : Callback<PopularResponseDto> {

                override fun onResponse(call: Call<PopularResponseDto>,
                                        response: Response<PopularResponseDto>
                ) {
                    if (response.isSuccessful) {
                        popularResponseResult.value = response?.body()
                        Log.e("dungnt", "popularResponseResult?.value?.page: "+popularResponseResult?.value?.page)
                        Log.e("dungnt", "popularResponseResult?.value?.results?.size: "+popularResponseResult?.value?.results?.size)
                    } else {
                        Log.e("Error code 400",response.errorBody()!!.string());
                        popularResponseResult.value = null
                    }

                }

                override fun onFailure(call: Call<PopularResponseDto>, t: Throwable) {
                    Log.e("dungnt", "onFailure")
                    popularResponseResult.value = null
                }
            })
    }

    fun getRecommendations(movieId: Int) {
        RetrofitClient.getService(PopularApiService::class.java).getRecommendation(movieId, MainActivity.API_KEY)
            .enqueue(object : Callback<PopularResponseDto> {

                override fun onResponse(call: Call<PopularResponseDto>,
                                        response: Response<PopularResponseDto>
                ) {
                    if (response.isSuccessful) {
                        recommendationsResult.value = response?.body()
                    } else {
                        recommendationsResult.value = null
                    }

                }

                override fun onFailure(call: Call<PopularResponseDto>, t: Throwable) {
                    Log.e("dungnt", "onFailure")
                    recommendationsResult.value = null
                }
            })
    }
}