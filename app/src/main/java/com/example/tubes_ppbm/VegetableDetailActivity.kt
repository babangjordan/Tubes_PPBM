package com.example.tubes_ppbm

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class VegetableDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vegetable_detail)

        // Retrieve the selected vegetable details from the intent
        val vegetableName = intent.getStringExtra("vegetableName")

        // Use the safe call operator ?. to handle nullable String
        val vegetable = vegetableName?.let { getVegetableDetails(it) }

        // Update the layout elements with vegetable details
        val vegetableNameTextView: TextView = findViewById(R.id.vegetableNameTextView)
        val quantityTextView: TextView = findViewById(R.id.quantityTextView)
        val vegetableDescriptionTextView: TextView = findViewById(R.id.vegetableDescriptionTextView)
        val vegetableImageView: ImageView = findViewById(R.id.vegetableImageView)

        // Set text for TextView elements
        val name = vegetable?.name ?: "Unknown Vegetable"
        val quantity = vegetable?.quantity ?: 0
        val description = vegetable?.description ?: "Description not available"

        vegetableNameTextView.text = name
        quantityTextView.text = "Quantity: $quantity" // Update with actual quantity
        vegetableDescriptionTextView.text = description

        // Set image resource based on the vegetable
        val imageResourceId =
            vegetable?.imageResourceId ?: R.drawable.sayuran // Default image resource ID
        vegetableImageView.setImageResource(imageResourceId)
    }

    private fun getVegetableDetails(vegetableName: String): Vegetable? {
        // TODO: Implement logic to retrieve the details based on the vegetable name
        // This can be done using a map, database, or any other data source
        return when (vegetableName) {
            "Carrot" -> Vegetable("Carrot", "Sweet and crunchy", R.drawable.carrot, 10)
            "Broccoli" -> Vegetable("Broccoli", "High in fiber and vitamins", R.drawable.brokoli, 5)
            "Lettuce" -> Vegetable("Lettuce", "Fresh and crisp", R.drawable.lettuce, 8)
            "Onion" -> Vegetable("Onion", "Sharp flavor", R.drawable.onion, 12)
            "Cassava leaves" -> Vegetable("Cassava leaves", "Nutrient-rich", R.drawable.cassava_leaves, 15)
            "Spinach" -> Vegetable("Spinach", "Rich in iron", R.drawable.spinach, 7)
            "Beans" -> Vegetable("Beans", "High in protein", R.drawable.beans, 20)
            "Celery" -> Vegetable("Celery", "Crunchy and low-calorie", R.drawable.celery, 14)
            "Cucumber" -> Vegetable("Cucumber", "Hydrating and low-calorie", R.drawable.cucumber, 18)
            "Peas" -> Vegetable("Peas", "Sweet and green", R.drawable.peas, 25)

            // Add more cases for additional vegetables
            else -> null // Return null for unknown vegetables
        }
    }
}