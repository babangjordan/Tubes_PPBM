package com.example.tubes_ppbm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RatingBar
import android.widget.TextView

class infodev : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_infodev)

        val ratingBar: RatingBar = findViewById(R.id.ratingbar)
        val ratingResult: TextView = findViewById(R.id.teks4) // Assuming you have a TextView to display the rating

        // Set a rating change listener
        ratingBar.setOnRatingBarChangeListener { _, rating, _ ->
            // Handle the rating change here
            ratingResult.text = "Rating anda = $rating"
        }
    }
}