package com.karros.movie.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.google.android.youtube.player.YouTubeInitializationResult
import com.google.android.youtube.player.YouTubeThumbnailLoader
import com.google.android.youtube.player.YouTubeThumbnailView
import com.karros.movie.R
import com.karros.movie.model.obj.Video

class VideoAdapter (private val video: ArrayList<Video>) : RecyclerView.Adapter<VideoAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_video, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItems(video[position])
    }

    override fun getItemCount(): Int {
        return video.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindItems(video: Video) {
            val youTubePlayerView = itemView.findViewById<YouTubeThumbnailView>(R.id.youtube_fragment)
            youTubePlayerView.initialize("AIzaSyA3Dbd-39B1Hg8UYGhqHoF005q0wRQlrfI", object:
                YouTubeThumbnailView.OnInitializedListener {
                override fun onInitializationSuccess(
                    p0: YouTubeThumbnailView?,
                    p1: YouTubeThumbnailLoader?
                ) {
                    p1?.setVideo(video?.key)
                    p1?.release()
                }

                override fun onInitializationFailure(
                    p0: YouTubeThumbnailView?,
                    p1: YouTubeInitializationResult?
                ) {
                }


            })
        }
    }
}