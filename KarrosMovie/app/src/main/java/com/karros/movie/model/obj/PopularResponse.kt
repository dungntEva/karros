package com.karros.movie.model.obj

data class PopularResponse (
    var page: Int,
    var results: ArrayList<Popular>,
    var total_pages: Int,
    var total_results: Int
)