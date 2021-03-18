package com.karros.movie.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.karros.movie.MainActivity
import com.karros.movie.R
import com.karros.movie.model.obj.Trending

class CategoryAdapter (private val trendings: ArrayList<Trending>) : RecyclerView.Adapter<CategoryAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_trending, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItems(trendings[position])
    }

    override fun getItemCount(): Int {
        return trendings.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindItems(trending: Trending) {
            val textView = itemView.findViewById<TextView>(R.id.tvName)
            val imageView = itemView.findViewById<ImageView>(R.id.imageView)
            textView.text = trending.title
            Glide.with(itemView.context).load(MainActivity.ADDRESS_IMAGE.plus(trending.poster_path)).into(imageView)
        }
    }
}