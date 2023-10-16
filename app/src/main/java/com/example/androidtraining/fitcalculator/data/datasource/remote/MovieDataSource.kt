package com.example.androidtraining.fitcalculator.data.datasource.remote

import com.example.androidtraining.fitcalculator.data.models.remote.Movie
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MovieDataSource {

    suspend fun getMovieList(): List<Movie> {
        return getRetrofit()
            .create(MovieService::class.java)
            .getPopularMovieList()
            .results
    }

    suspend fun getUpcomingMovieList(): List<Movie> {
        return getRetrofit()
            .create(MovieService::class.java)
            .getUpcomingMovieList()
            .results
    }

    private fun getRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://api.themoviedb.org")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}