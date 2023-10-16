package com.example.androidtraining.fitcalculator.view.recyclerviews.viewholders

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.androidtraining.databinding.ItemMovieListBinding
import com.example.androidtraining.fitcalculator.data.models.remote.Movie
import com.squareup.picasso.Picasso

class MovieViewHolder (view: View) : RecyclerView.ViewHolder(view){

    private val binding = ItemMovieListBinding.bind(view)

    fun render(movie: Movie, onClick: (String) -> Unit){
        binding.txtMovieTitle.text = movie.title
        Picasso.get().load("https://image.tmdb.org/t/p/w185${movie.backdrop_path}").into(binding.imgMovie)
        itemView.setOnClickListener { onClick(movie.id.toString()) }
    }
}