package com.example.androidtraining.fitcalculator.view.recyclerviews.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.androidtraining.R
import com.example.androidtraining.fitcalculator.data.models.remote.Movie
import com.example.androidtraining.fitcalculator.view.recyclerviews.viewholders.MovieViewHolder


class MovieAdapter(private val movieList: List<Movie>, private val onClick: (String) -> Unit) :
    RecyclerView.Adapter<MovieViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_movie_list, parent, false)
        return MovieViewHolder(view)
    }

    override fun getItemCount(): Int {
        // Size of the list.
        return movieList.size
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        holder.render(movieList[position], onClick)
    }

}
