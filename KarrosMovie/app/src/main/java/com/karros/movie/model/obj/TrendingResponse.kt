package com.karros.movie.model.obj

data class TrendingResponse (
    var page: Int,
    var results: ArrayList<Trending>,
    var total_pages: Int,
    var total_results: Int
)