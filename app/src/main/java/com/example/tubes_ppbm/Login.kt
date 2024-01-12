package com.example.tubes_ppbm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        // Temukan button berdasarkan ID
        val myButton: Button = findViewById(R.id.continueButton)

        // Tambahkan listener onClick ke button
        myButton.setOnClickListener {
            // Intent untuk pindah ke layout selanjutnya
            val intent = Intent(this@Login, HomeActivity::class.java)
            startActivity(intent)
        }
    }
}