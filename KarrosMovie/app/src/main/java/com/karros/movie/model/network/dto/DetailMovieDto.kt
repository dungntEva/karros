package com.karros.movie.model.network.dto

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.karros.movie.model.obj.Genres
import com.karros.movie.model.obj.ProductionCompanies
import com.karros.movie.model.obj.ProductionCountries
import com.karros.movie.model.obj.SpokenLanguages

class DetailMovieDto (
    @SerializedName("adult", alternate = ["adult_alt"])
    @Expose
    var adult: Boolean,
    @SerializedName("backdrop_path", alternate = ["backdrop_path_alt"])
    @Expose
    var backdrop_path: String,
    @SerializedName("belongs_to_collection", alternate = ["belongs_to_collection_alt"])
    @Expose
    var belongs_to_collection: String,
    @SerializedName("budget", alternate = ["budget_alt"])
    @Expose
    var budget: Int,
    @SerializedName("genres", alternate = ["genres_alt"])
    @Expose
    var genres: ArrayList<Genres>,
    @SerializedName("homepage", alternate = ["homepage_alt"])
    @Expose
    var homepage: String,
    @SerializedName("id", alternate = ["id_alt"])
    @Expose
    var id: Int,
    @SerializedName("imdb_id", alternate = ["imdb_id_alt"])
    @Expose
    var imdb_id: String,
    @SerializedName("original_language", alternate = ["original_language_alt"])
    @Expose
    var original_language: String,
    @SerializedName("original_title", alternate = ["original_title_alt"])
    @Expose
    var original_title: String,
    @SerializedName("overview", alternate = ["overview_alt"])
    @Expose
    var overview: String,
    @SerializedName("popularity", alternate = ["popularity_alt"])
    @Expose
    var popularity: Float,
    @SerializedName("poster_path", alternate = ["poster_path_alt"])
    @Expose
    var poster_path: String,
    @SerializedName("production_companies", alternate = ["production_companies_alt"])
    @Expose
    var production_companies: ArrayList<ProductionCompanies>,
    @SerializedName("production_countries", alternate = ["production_countries_alt"])
    @Expose
    var production_countries: ArrayList<ProductionCountries>,
    @SerializedName("release_date", alternate = ["release_date_alt"])
    @Expose
    var release_date: String,
    @SerializedName("revenue", alternate = ["revenue_alt"])
    @Expose
    var revenue: Int,
    @SerializedName("runtime", alternate = ["runtime_alt"])
    @Expose
    var runtime: Int,
    @SerializedName("spoken_languages", alternate = ["spoken_languages_alt"])
    @Expose
    var spoken_languages: ArrayList<SpokenLanguages>,
    @SerializedName("status", alternate = ["status_alt"])
    @Expose
    var status: String,
    @SerializedName("tagline", alternate = ["tagline_alt"])
    @Expose
    var tagline: String,
    @SerializedName("video", alternate = ["video_alt"])
    @Expose
    var video: Boolean,
    @SerializedName("vote_average", alternate = ["vote_average_alt"])
    @Expose
    var vote_average: Float,
    @SerializedName("vote_count", alternate = ["vote_count_alt"])
    @Expose
    var vote_count: Int,
)