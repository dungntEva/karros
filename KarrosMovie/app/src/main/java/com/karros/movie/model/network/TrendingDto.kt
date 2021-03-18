package com.karros.movie.model.network

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class TrendingDto (
    @SerializedName("video", alternate = ["video_alt"])
    @Expose
    val video: Boolean,
    @SerializedName("vote_average", alternate = ["vote_average_alt"])
    @Expose
    val vote_average: Float,
    @SerializedName("overview", alternate = ["overview_alt"])
    @Expose
    val overview: String,
    @SerializedName("release_date", alternate = ["release_date_alt"])
    @Expose
    val release_date: String,
    @SerializedName("adult", alternate = ["adult_alt"])
    @Expose
    val adult: Boolean,
    @SerializedName("backdrop_path", alternate = ["backdrop_path_alt"])
    @Expose
    val backdrop_path: String,
    @SerializedName("vote_count", alternate = ["vote_count_alt"])
    @Expose
    val vote_count: Int,
    @SerializedName("genre_ids", alternate = ["genre_ids_alt"])
    @Expose
    val genre_ids: ArrayList<Int>,
    @SerializedName("id", alternate = ["id_alt"])
    @Expose
    val id: Int,
    @SerializedName("original_language", alternate = ["original_language_alt"])
    @Expose
    val original_language: String,
    @SerializedName("original_title", alternate = ["original_title_alt"])
    @Expose
    val original_title: String,
    @SerializedName("poster_path", alternate = ["poster_path_alt"])
    @Expose
    val poster_path: String,
    @SerializedName("title", alternate = ["title_alt"])
    @Expose
    val title: String,
    @SerializedName("popularity", alternate = ["popularity_alt"])
    @Expose
    val popularity: Float,
    @SerializedName("media_type", alternate = ["media_type_alt"])
    @Expose
    val media_type: String,
)