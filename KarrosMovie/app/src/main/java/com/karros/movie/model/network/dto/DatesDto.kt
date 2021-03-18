package com.karros.movie.model.network.dto

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class DatesDto(
    @SerializedName("maximum", alternate = ["maximum_alt"])
    @Expose
    val maximum: String,
    @SerializedName("minimum", alternate = ["minimum_alt"])
    @Expose
    val minimum: String,
)