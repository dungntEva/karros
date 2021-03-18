package com.karros.movie.model.network.dto

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class ProductionCountriesDto (
    @SerializedName("iso_3166_1", alternate = ["iso_3166_1_alt"])
    @Expose
    val iso_3166_1: String,
    @SerializedName("name", alternate = ["name_alt"])
    @Expose
    val name: String,
)