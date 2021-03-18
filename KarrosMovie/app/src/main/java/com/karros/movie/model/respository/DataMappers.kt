package com.karros.movie.model.respository

import com.karros.movie.model.network.VideoResponseDto
import com.karros.movie.model.network.dto.*
import com.karros.movie.model.obj.*
import com.karros.movie.model.obj.TopRatedResponse


fun DatesDto.toDomain() = Dates(
    maximum = maximum,
    minimum = minimum
)

fun TrendingDto.toDomain() = Trending(
    video = video,
    vote_average = vote_average,
    overview = release_date,
    release_date = release_date,
    adult = adult,
    backdrop_path = backdrop_path,
    vote_count = vote_count,
    genre_ids = genre_ids,
    id = id,
    original_language = original_language,
    original_title = original_title,
    poster_path = poster_path,
    title = title,
    popularity = popularity,
    media_type = media_type,
)

fun TrendingResponseDto.toDomain() = TrendingResponse(
    page = page,
    results = results,
    total_pages = total_pages,
    total_results = total_results,
)

fun PopularDto.toDomain() = Popular(
    adult = adult,
    backdrop_path = backdrop_path,
    genre_ids = genre_ids,
    id = id,
    original_language = original_language,
    original_title = original_title,
    overview = overview,
    popularity = popularity,
    poster_path = poster_path,
    release_date = release_date,
    title = title,
    video = video,
    vote_average = vote_average,
    vote_count = vote_count,
)

fun PopularResponseDto.toDomain() = PopularResponse(
    page = page,
    results = results,
    total_pages = total_pages,
    total_results = total_results,
)

fun TopRatedResponseDto.toDomain() = TopRatedResponse(
    page = page,
    results = results,
    total_pages = total_pages,
    total_results = total_results,
)

fun UpcomingResponseDto.toDomain() = UpcomingResponse(
    dates = dates,
    page = page,
    results = results,
    total_pages = total_pages,
    total_results = total_results,
)

fun GenresDto.toDomain() = Genres(
    id = id,
    name = name,
)

fun ProductionCompaniesDto.toDomain() = ProductionCompanies(
    id = id,
    logo_path = logo_path,
    name = name,
    origin_country = origin_country,
)

fun ProductionCountriesDto.toDomain() = ProductionCountries(
    iso_3166_1 = iso_3166_1,
    name = name,
)

fun SpokenLanguagesDto.toDomain() = SpokenLanguages(
    english_name = english_name,
    name = name,
    iso_639_1 = iso_639_1,
)

fun DetailMovieDto.toDomain() = DetailMovie(
    adult = adult,
    backdrop_path = backdrop_path,
    belongs_to_collection = backdrop_path,
    budget = budget,
    genres = genres,
    homepage = homepage,
    id = id,
    imdb_id = imdb_id,
    original_language = original_language,
    original_title = original_title,
    overview = overview,
    popularity = popularity,
    poster_path = poster_path,
    production_companies = production_companies,
    production_countries = production_countries,
    release_date = release_date,
    revenue = revenue,
    runtime = runtime,
    spoken_languages = spoken_languages,
    status = status,
    tagline = tagline,
    video = video,
    vote_average = vote_average,
    vote_count = vote_count,
)

fun VideoDto.toDomain() = Video(
    id = id,
    iso_639_1 = iso_639_1,
    iso_3166_1 = iso_3166_1,
    key = key,
    name = name,
    site = site,
    size = size,
    type = type,
)

fun VideoResponseDto.toDomain() = VideoResponse(
    id = id,
    results = results,
)