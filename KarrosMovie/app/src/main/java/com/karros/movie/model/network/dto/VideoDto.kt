package com.karros.movie.model.network.dto

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class VideoDto(
    @SerializedName("id", alternate = ["id_alt"])
    @Expose
    var id: String,
    @SerializedName("iso_639_1", alternate = ["iso_639_1_alt"])
    @Expose
    var iso_639_1: String,
    @SerializedName("iso_3166_1", alternate = ["iso_3166_1_alt"])
    @Expose
    var iso_3166_1: String,
    @SerializedName("key", alternate = ["key_alt"])
    @Expose
    var key: String,
    @SerializedName("name", alternate = ["name_alt"])
    @Expose
    var name: String,
    @SerializedName("site", alternate = ["site_alt"])
    @Expose
    var site: String,
    @SerializedName("size", alternate = ["size_alt"])
    @Expose
    var size: Int,
    @SerializedName("type", alternate = ["type_alt"])
    @Expose
    var type: String,
)