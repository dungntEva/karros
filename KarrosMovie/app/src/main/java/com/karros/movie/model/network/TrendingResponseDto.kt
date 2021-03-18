package com.karros.movie.model.network

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.karros.movie.model.obj.Trending

class TrendingResponseDto (

    @SerializedName("page", alternate = ["page_alt"])
    @Expose
    val page: Int,
    @SerializedName("results", alternate = ["results_alt"])
    @Expose
    val results: ArrayList<Trending>,
    @SerializedName("total_pages", alternate = ["total_pages_alt"])
    @Expose
    val total_pages: Int,
    @SerializedName("total_results", alternate = ["total_results_alt"])
    @Expose
    val total_results: Int,
)