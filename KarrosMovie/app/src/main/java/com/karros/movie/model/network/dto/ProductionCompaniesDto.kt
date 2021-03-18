package com.karros.movie.model.network.dto

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class ProductionCompaniesDto (
    @SerializedName("id", alternate = ["id_alt"])
    @Expose
    val id: Int,
    @SerializedName("logo_path", alternate = ["logo_path_alt"])
    @Expose
    val logo_path: String,
    @SerializedName("name", alternate = ["name_alt"])
    @Expose
    val name: String,
    @SerializedName("origin_country", alternate = ["origin_country_alt"])
    @Expose
    val origin_country: String,
)