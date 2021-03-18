package com.karros.movie.model.obj

data class UpcomingResponse (
    var dates: Dates,
    var page: Int,
    var results: ArrayList<Popular>,
    var total_pages: Int,
    var total_results: Int
)