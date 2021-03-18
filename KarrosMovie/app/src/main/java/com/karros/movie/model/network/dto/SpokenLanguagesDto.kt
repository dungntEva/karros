package com.karros.movie.model.network.dto

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class SpokenLanguagesDto (
    @SerializedName("english_name", alternate = ["english_name_alt"])
    @Expose
    val english_name: String,
    @SerializedName("iso_639_1", alternate = ["iso_639_1_alt"])
    @Expose
    val iso_639_1: String,
    @SerializedName("name", alternate = ["name_alt"])
    @Expose
    val name: String,
)