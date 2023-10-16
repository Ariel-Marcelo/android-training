package com.example.androidtraining.fitcalculator.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.androidtraining.databinding.ActivityMovieDetailBinding

class MovieDetail : AppCompatActivity() {
    val binding: ActivityMovieDetailBinding by lazy {
        ActivityMovieDetailBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        initUi()

    }

    private fun initUi() {
        binding.tvMovieTitleDetail.text = intent.getStringExtra("id")
    }
}