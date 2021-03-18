package com.karros.movie.model.network.dto

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class GenresDto (
    @SerializedName("id", alternate = ["id_alt"])
    @Expose
    val id: Int,
    @SerializedName("name", alternate = ["name_alt"])
    @Expose
    val name: String,
)