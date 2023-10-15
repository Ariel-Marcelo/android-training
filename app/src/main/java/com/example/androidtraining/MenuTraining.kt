package com.example.androidtraining

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.androidtraining.fitcalculator.view.FitCalculator

class MenuTraining : AppCompatActivity() {

    private lateinit var btnApp1: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initComponents()
        initUi()

    }

    private fun initComponents() {
        btnApp1 = findViewById<Button>(R.id.btn_app1)
    }

    private fun initUi() {
        btnApp1.setOnClickListener {
            val intent = Intent(this, FitCalculator::class.java)
            startActivity(intent)
        }
    }
}