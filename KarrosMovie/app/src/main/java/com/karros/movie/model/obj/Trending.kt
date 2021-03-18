package com.karros.movie.model.obj

data class Trending (
    var video: Boolean,
    var vote_average: Float,
    var overview: String,
    var release_date: String,
    var adult: Boolean,
    var backdrop_path: String,
    var vote_count: Int,
    var genre_ids: ArrayList<Int>,
    var id: Int,
    var original_language: String,
    var original_title: String,
    var poster_path: String,
    var title: String,
    var popularity: Float,
    var media_type: String,
)