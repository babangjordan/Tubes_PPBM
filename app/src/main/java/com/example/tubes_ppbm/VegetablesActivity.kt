package com.example.tubes_ppbm

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class VegetablesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vegetables)

        val vegetablesListView: ListView = findViewById(R.id.vegetablesListView)

        // Create an array of vegetable data using the Vegetable data class
        val vegetableData = listOf(
            Vegetable("Carrot", "Sweet and crunchy", R.drawable.carrot,50),
            Vegetable("Broccoli", "High in fiber and vitamins", R.drawable.brokoli, 30),
            Vegetable("Lettuce", "Fresh and crisp", R.drawable.lettuce, 25),
            Vegetable("Onion", "Fresh and crisp", R.drawable.lettuce, 15),
            Vegetable("Cassava Leaves", "Nutrient-rich", R.drawable.cassava_leaves, 15),
            Vegetable("Spinach", "Rich in iron", R.drawable.spinach, 7),
            Vegetable("Beans", "High in protein", R.drawable.beans, 20),
            Vegetable("Celery", "Crunchy and low-calorie", R.drawable.celery, 14),
            Vegetable("Cucumber", "Hydrating and low-calorie", R.drawable.cucumber, 18),
            Vegetable("Peas", "Sweet and green", R.drawable.peas, 25)
            // Add more vegetables as needed
        )

        // Create an adapter and set it to the ListView
        val adapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1,
            vegetableData.map { it.name }
        )

        vegetablesListView.adapter = adapter

        // Set item click listener to open VegetableDetailActivity on item click
        vegetablesListView.setOnItemClickListener { _, _, position, _ ->
            val selectedVegetable = vegetableData[position]
            val intent = Intent(this, VegetableDetailActivity::class.java).apply {
                putExtra("vegetableName", selectedVegetable.name)
            }
            startActivity(intent)
        }
        val conButton: Button = findViewById(R.id.continueButton)
        conButton.setOnClickListener {
            val intent = Intent (this@VegetablesActivity, infodev::class.java)
            startActivity(intent)
        }
    }
}