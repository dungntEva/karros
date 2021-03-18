package com.karros.movie

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.karros.movie.adapter.PopularAdapter
import com.karros.movie.adapter.TopRatedAdapter
import com.karros.movie.adapter.TrendingAdapter
import com.karros.movie.adapter.UpcomingAdapter
import com.karros.movie.viewmodel.*
import kotlinx.android.synthetic.main.fragment_first.*

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {



    private val mTrendingApiViewModel by lazy {
        ViewModelProvider(
            viewModelStore,
            ViewModelFactory()
        ).get(TrendingViewModel::class.java)
    }

    private val mPopularApiViewModel by lazy {
        ViewModelProvider(
            viewModelStore,
            ViewModelFactory()
        ).get(PopularViewModel::class.java)
    }

    private val mTopRatedApiViewModel by lazy {
        ViewModelProvider(
            viewModelStore,
            ViewModelFactory()
        ).get(TopRatedViewModel::class.java)
    }

    private val mUpcomingApiViewModel by lazy {
        ViewModelProvider(
            viewModelStore,
            ViewModelFactory()
        ).get(UpcomingViewModel::class.java)
    }

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    @SuppressLint("WrongConstant")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        mTrendingApiViewModel.getTrending()
        mTrendingApiViewModel.trendingResponseResult.observe(viewLifecycleOwner, Observer { trending ->
            if(trending?.results?.isNotEmpty()!!) {
                recycler_view_trending.layoutManager = LinearLayoutManager(activity, LinearLayout.HORIZONTAL, false)
                var adapter = TrendingAdapter(trending?.results!!)
                recycler_view_trending.adapter = adapter
                adapter.onItemClick = {
                    val action = FirstFragmentDirections.actionFirstFragmentToSecondFragment("")
                    action.trending = it?.id.toString()
                    findNavController().navigate(action)
                }
            }
        })
        mPopularApiViewModel.getPopular()
        mPopularApiViewModel.popularResponseResult.observe(viewLifecycleOwner, Observer { popular ->
            if(popular?.results?.isNotEmpty()!!) {
                recycler_view_popular.layoutManager = LinearLayoutManager(activity, LinearLayout.HORIZONTAL, false)
                var adapter = PopularAdapter(popular?.results!!)
                recycler_view_popular.adapter = adapter
                adapter.onItemClick = {
                    val action = FirstFragmentDirections.actionFirstFragmentToSecondFragment("")
                    action.trending = it?.id.toString()
                    findNavController().navigate(action)
                }
            }
        })
        mTopRatedApiViewModel.getTopRated()
        mTopRatedApiViewModel.topRatedResponseResult.observe(viewLifecycleOwner, Observer { topRated ->
            if(topRated?.results?.isNotEmpty()!!) {
                recycler_view_top_rated.layoutManager = LinearLayoutManager(activity, LinearLayout.HORIZONTAL, false)
                var adapter = TopRatedAdapter(topRated?.results!!)
                recycler_view_top_rated.adapter = adapter
                adapter.onItemClick = {
                    val action = FirstFragmentDirections.actionFirstFragmentToSecondFragment("")
                    action.trending = it?.id.toString()
                    findNavController().navigate(action)
                }
            }
        })
        mUpcomingApiViewModel.getUpcoming()
        mUpcomingApiViewModel.upcomingResponseResult.observe(viewLifecycleOwner, Observer { upcoming ->
            if(upcoming?.results?.isNotEmpty()!!) {
                recycler_view_upcoming.layoutManager = LinearLayoutManager(activity, LinearLayout.HORIZONTAL, false)
                var adapter = UpcomingAdapter(upcoming?.results!!)
                recycler_view_upcoming.adapter = adapter
                adapter.onItemClick = {
                    val action = FirstFragmentDirections.actionFirstFragmentToSecondFragment("")
                    action.trending = it?.id.toString()
                    findNavController().navigate(action)
                }
            }
        })
    }
}