package com.example.tubes_ppbm

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.models.SlideModel

class GroceryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_grocery)
        val imageList = ArrayList<SlideModel>() // Create image list

// imageList.add(SlideModel("String Url" or R.drawable)
// imageList.add(SlideModel("String Url" or R.drawable, "title") You can add title

        imageList.add(
            SlideModel(
                "https://i.pinimg.com/564x/a8/ca/0f/a8ca0fd6894db828c12767afb4f3e2f1.jpg",
            )
        )
        imageList.add(
            SlideModel(
                "https://i.pinimg.com/564x/13/28/ac/1328acd1eec9ca367167b584acdbef47.jpg",
            )
        )
        imageList.add(SlideModel("https://i.pinimg.com/564x/20/ac/b9/20acb9fa3d7239199dee368d62500f6d.jpg",))

        val imageSlider = findViewById<ImageSlider>(R.id.image_slider)
        imageSlider.setImageList(imageList)
    }
}