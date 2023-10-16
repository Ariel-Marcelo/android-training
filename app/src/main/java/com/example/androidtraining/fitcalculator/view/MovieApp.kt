package com.example.androidtraining.fitcalculator.view

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.androidtraining.databinding.ActivityMovieAppBinding
import com.example.androidtraining.fitcalculator.data.models.remote.Movie
import com.example.androidtraining.fitcalculator.data.repositories.remote.MovieServerRespository
import com.example.androidtraining.fitcalculator.view.recyclerviews.adapters.MovieAdapter
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MovieApp : AppCompatActivity() {

    private lateinit var binding: ActivityMovieAppBinding // Es increible que solo me complete el titulo
    private var movieList: List<Movie> = emptyList()
    private lateinit var adapter: MovieAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMovieAppBinding.inflate(layoutInflater) // En lugar del setContent
        setContentView(binding.root)

        initUi()
    }

    private fun initUi() {
        binding.rvMovieList.layoutManager = LinearLayoutManager(this)
        binding.rvMovieList.adapter = MovieAdapter(movieList) { idMovie ->
            goToMovieDetail(idMovie)
        }

        binding.cardPopular.setOnClickListener {
            setMovieList(0)
            binding.rvMovieList.adapter = MovieAdapter(movieList) { idMovie ->
                goToMovieDetail(idMovie)
            }
        }
        binding.cardUpcoming.setOnClickListener {
            setMovieList(1)
            binding.rvMovieList.adapter = MovieAdapter(movieList) { idMovie ->
                goToMovieDetail(idMovie)
            }
        }

    }

    private fun goToMovieDetail(id: String) {
        val intent = Intent(this, MovieDetail::class.java)
        intent.putExtra("id", id)
        startActivity(intent)
    }

    private fun setMovieList(case: Int) {
        val repository: MovieServerRespository = MovieServerRespository()
        // Utilizamor corutines
        CoroutineScope(Dispatchers.IO).launch {
            when (case) {
                0 -> {
                    movieList = repository.getPopularMovieList()
                }

                1 -> {
                    movieList = repository.getUpcomingMovieList()
                }
            }
        }
    }


}