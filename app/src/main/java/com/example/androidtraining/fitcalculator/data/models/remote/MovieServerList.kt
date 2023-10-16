package com.example.androidtraining.fitcalculator.data.models.remote

data class MovieServerList(
    val page: Int,
    val results: List<Movie>,
    val total_pages: Int,
    val total_results: Int
)