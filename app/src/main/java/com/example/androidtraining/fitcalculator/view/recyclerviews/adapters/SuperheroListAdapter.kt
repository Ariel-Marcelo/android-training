package com.example.androidtraining.fitcalculator.view.recyclerviews.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.androidtraining.R
import com.example.androidtraining.fitcalculator.data.models.MovieList
import com.example.androidtraining.fitcalculator.view.recyclerviews.viewholders.SuperheroListViewHolder


class SuperheroListAdapter(private val movieList: MovieList) :
    RecyclerView.Adapter<SuperheroListViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperheroListViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_movie_list, parent, false)
        return SuperheroListViewHolder(view)
    }

    override fun getItemCount(): Int {
        // Size of the list.
        return movieList.results.size
    }

    override fun onBindViewHolder(holder: SuperheroListViewHolder, position: Int) {
        holder.render(movieList.results[position])
    }

}
