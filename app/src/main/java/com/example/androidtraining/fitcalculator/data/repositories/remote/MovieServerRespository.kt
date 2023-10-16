package com.example.androidtraining.fitcalculator.data.repositories.remote

import com.example.androidtraining.fitcalculator.data.datasource.remote.MovieDataSource
import com.example.androidtraining.fitcalculator.data.models.remote.Movie

class MovieServerRespository {

    suspend fun getPopularMovieList(): List<Movie> {
        return MovieDataSource().getMovieList()
    }

    suspend fun getUpcomingMovieList(): List<Movie> {
        return MovieDataSource().getUpcomingMovieList()
    }
}