package com.karros.movie.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.karros.movie.model.respository.*

class ViewModelFactory() : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {

        when {
            modelClass.isAssignableFrom(TrendingViewModel::class.java) -> {
                @Suppress("UNCHECKED_CAST")
                return TrendingViewModel(
                    TrendingFactory.getTrending()
                ) as T
            }

            modelClass.isAssignableFrom(PopularViewModel::class.java) -> {
                @Suppress("UNCHECKED_CAST")
                return PopularViewModel(
                    PopularFactory.getPopular()
                ) as T
            }

            modelClass.isAssignableFrom(TopRatedViewModel::class.java) -> {
                @Suppress("UNCHECKED_CAST")
                return TopRatedViewModel(
                    TopRatedFactory.getTopRated()
                ) as T
            }

            modelClass.isAssignableFrom(UpcomingViewModel::class.java) -> {
                @Suppress("UNCHECKED_CAST")
                return UpcomingViewModel(
                    UpcomingFactory.getUpcoming()
                ) as T
            }

            modelClass.isAssignableFrom(DetailMovieViewModel::class.java) -> {
                @Suppress("UNCHECKED_CAST")
                return DetailMovieViewModel(
                    DetailMovieFactory.getDetailMovie()
                ) as T
            }

            modelClass.isAssignableFrom(VideoViewModel::class.java) -> {
                @Suppress("UNCHECKED_CAST")
                return VideoViewModel(
                    VideoFactory.getVideo()
                ) as T
            }
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}