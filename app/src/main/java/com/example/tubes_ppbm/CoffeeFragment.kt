package com.example.tubes_ppbm

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.cardview.widget.CardView
import androidx.fragment.app.Fragment

// CoffeeFragment.kt
class CoffeeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.fragment_coffee, container, false)

        // You can further customize the card view and image here
        val cardView = rootView.findViewById<CardView>(R.id.cardView)
        val imageView = rootView.findViewById<ImageView>(R.id.imageView)

        // Set the image resource (replace R.drawable.coffee_image with your actual image resource)
        imageView.setImageResource(R.drawable.cofee)

        return rootView
    }
}