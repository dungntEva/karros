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
import com.karros.movie.model.obj.Popular

class PopularAdapter (private val populars: ArrayList<Popular>) : RecyclerView.Adapter<PopularAdapter.ViewHolder>() {

    var onItemClick: ((Popular) -> Unit)? = null
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_trending, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItems(populars[position])
    }

    override fun getItemCount(): Int {
        return populars.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindItems(popular: Popular) {
            val textView = itemView.findViewById<TextView>(R.id.tvName)
            val imageView = itemView.findViewById<ImageView>(R.id.imageView)
            textView.text = popular.title
            Glide.with(itemView.context).load(MainActivity.ADDRESS_IMAGE.plus(popular.poster_path)).into(imageView)
            imageView.setOnClickListener {
                onItemClick?.invoke(popular)
            }
        }
    }
}