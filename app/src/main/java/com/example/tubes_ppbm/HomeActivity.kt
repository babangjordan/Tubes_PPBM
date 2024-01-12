package com.example.tubes_ppbm

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val vegetableButton: Button = findViewById(R.id.vegetablesCategory)
        val beverageButton: Button = findViewById(R.id.beveragesCategory)
        val searchButton: Button = findViewById(R.id.searchButton)
        val groceryButton: Button = findViewById(R.id.groceryCategory)

        vegetableButton.setOnClickListener {
            val intent = Intent(this@HomeActivity, VegetablesActivity::class.java)
            startActivity(intent)
        }
        beverageButton.setOnClickListener {
            val intent = Intent(this@HomeActivity, BeveragesActivity::class.java)
            startActivity(intent)
        }
        searchButton.setOnClickListener {
            // Show the bottom sheet when the search button is clicked
            val bottomSheetFragment = BottomSheetFragment()
            bottomSheetFragment.show(supportFragmentManager, bottomSheetFragment.tag)
        }
        groceryButton.setOnClickListener {
            val intent = Intent(this@HomeActivity, GroceryActivity::class.java)
            startActivity(intent)
        }
    }
}
