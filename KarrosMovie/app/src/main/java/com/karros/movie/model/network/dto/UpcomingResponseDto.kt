package com.karros.movie.model.network.dto

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.karros.movie.model.obj.Dates
import com.karros.movie.model.obj.Popular

class UpcomingResponseDto (
    @SerializedName("dates", alternate = ["dates_alt"])
    @Expose
    val dates: Dates,
    @SerializedName("page", alternate = ["page_alt"])
    @Expose
    val page: Int,
    @SerializedName("results", alternate = ["results_alt"])
    @Expose
    val results: ArrayList<Popular>,
    @SerializedName("total_pages", alternate = ["total_pages_alt"])
    @Expose
    val total_pages: Int,
    @SerializedName("total_results", alternate = ["total_results_alt"])
    @Expose
    val total_results: Int,
)