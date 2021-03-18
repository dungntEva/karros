package com.karros.movie.model.network

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.karros.movie.model.obj.Video

class VideoResponseDto(
    @SerializedName("id", alternate = ["id_alt"])
    @Expose
    var id: Int,
    @SerializedName("results", alternate = ["results_alt"])
    @Expose
    var results: ArrayList<Video>,
)