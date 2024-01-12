package com.example.tubes_ppbm

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ncorti.slidetoact.SlideToActView


class AboutActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        val slideToActView: SlideToActView = findViewById(R.id.slideToActView)

        // Set a listener to handle events when the user slides the button
        slideToActView.onSlideCompleteListener = object : SlideToActView.OnSlideCompleteListener {
            override fun onSlideComplete(view: SlideToActView) {
                // Handle the slide completion event
                val intent = Intent(this@AboutActivity, Login::class.java)
                startActivity(intent)
            }
        }
    }
}
