package com.example.tubes_ppbm

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Temukan button berdasarkan ID
        val myButton: Button = findViewById(R.id.myButton)

        // Tambahkan listener onClick ke button
        myButton.setOnClickListener {
            // Intent untuk pindah ke layout selanjutnya
            val intent = Intent(this@MainActivity, AboutActivity::class.java)
            startActivity(intent)
        }
    }
}
