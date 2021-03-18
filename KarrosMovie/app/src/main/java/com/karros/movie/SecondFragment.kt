package com.karros.movie

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide
import com.karros.movie.adapter.PopularAdapter
import com.karros.movie.adapter.VideoAdapter
import com.karros.movie.viewmodel.DetailMovieViewModel
import com.karros.movie.viewmodel.PopularViewModel
import com.karros.movie.viewmodel.VideoViewModel
import com.karros.movie.viewmodel.ViewModelFactory
import kotlinx.android.synthetic.main.fragment_second.*

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class SecondFragment : Fragment() {

    private val mPopularApiViewModel by lazy {
        ViewModelProvider(
            viewModelStore,
            ViewModelFactory()
        ).get(PopularViewModel::class.java)
    }

    private val mDetailMovieApiViewModel by lazy {
        ViewModelProvider(
            viewModelStore,
            ViewModelFactory()
        ).get(DetailMovieViewModel::class.java)
    }

    private val mVideoApiViewModel by lazy {
        ViewModelProvider(
            viewModelStore,
            ViewModelFactory()
        ).get(VideoViewModel::class.java)
    }

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    @SuppressLint("WrongConstant")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        arguments?.let {
            val fragmentArgs = SecondFragmentArgs.fromBundle(it)
            mDetailMovieApiViewModel.getDetailMovie(fragmentArgs?.trending?.toInt())
            mDetailMovieApiViewModel.detailMovieResponseResult.observe(viewLifecycleOwner, Observer { detailMovie ->
                if(detailMovie != null) {
                    Glide.with(img_backdrop.context).load(MainActivity.ADDRESS_IMAGE.plus(detailMovie?.backdrop_path!!)).into(img_backdrop)
                    Glide.with(img_poster.context).load(MainActivity.ADDRESS_IMAGE.plus(detailMovie?.poster_path!!)).into(img_poster)
                    title_movie.text = detailMovie?.original_title!!
                    title_movie_detail.text = detailMovie?.overview!!
                }
            })

            mPopularApiViewModel.getRecommendations(fragmentArgs?.trending?.toInt())
            mPopularApiViewModel.recommendationsResult.observe(viewLifecycleOwner, Observer { recommendations ->
                if(recommendations != null) {
                    recycler_view_recommendation.layoutManager = LinearLayoutManager(activity, LinearLayout.HORIZONTAL, false)
                    var adapter = PopularAdapter(recommendations?.results!!)
                    recycler_view_recommendation.adapter = adapter
                }
            })

            mVideoApiViewModel.getVideo(fragmentArgs?.trending?.toInt())
            mVideoApiViewModel.videoResponseResult.observe(viewLifecycleOwner, Observer { video ->
                if(video?.results != null) {
                    recycler_view_video.layoutManager = LinearLayoutManager(activity, LinearLayout.HORIZONTAL, false)
                    var adapter = VideoAdapter(video?.results!!)
                    recycler_view_video.adapter = adapter
                }
            })
        }
    }
}