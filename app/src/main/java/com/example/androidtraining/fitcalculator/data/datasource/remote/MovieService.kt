package com.example.androidtraining.fitcalculator.data.datasource.remote

import com.example.androidtraining.fitcalculator.data.models.remote.MovieServerList
import retrofit2.http.GET

interface MovieService {

    @GET("/3/movie/popular?api_key=4f0795e7f061b7288fef06b63ae1656e")
    suspend fun getPopularMovieList(): MovieServerList

    @GET("/3/movie/upcoming?api_key=4f0795e7f061b7288fef06b63ae1656e")
    suspend fun getUpcomingMovieList(): MovieServerList
}