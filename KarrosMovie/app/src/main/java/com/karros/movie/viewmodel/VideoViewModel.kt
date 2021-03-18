package com.karros.movie.viewmodel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.karros.movie.MainActivity
import com.karros.movie.model.RetrofitClient
import com.karros.movie.model.network.VideoResponseDto
import com.karros.movie.model.network.api.VideoApiService
import com.karros.movie.model.respository.VideoRespository
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class VideoViewModel (video: VideoRespository) : ViewModel() {

    val videoResponseResult by lazy {
        MutableLiveData<VideoResponseDto>()
    }

    public override fun onCleared() {
        super.onCleared()
    }

    fun getVideo(movieId: Int) {
        RetrofitClient.getService(VideoApiService::class.java).getVideo(movieId, MainActivity.API_KEY)
            .enqueue(object : Callback<VideoResponseDto> {

                override fun onResponse(call: Call<VideoResponseDto>,
                                        response: Response<VideoResponseDto>
                ) {
                    if (response.isSuccessful) {
                        videoResponseResult.value = response?.body()
                        Log.e("dungnt", "videoResponseResult?.value?.results?.size: " + videoResponseResult?.value?.results?.size)
                    } else {
                        videoResponseResult.value = null
                    }

                }

                override fun onFailure(call: Call<VideoResponseDto>, t: Throwable) {
                    Log.e("dungnt", "onFailure")
                    videoResponseResult.value = null
                }
            })
    }
}