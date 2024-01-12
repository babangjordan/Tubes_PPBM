package com.example.tubes_ppbm

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class BottomSheetFragment : BottomSheetDialogFragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_bottom_sheet, container, false)
        val recyclerView: RecyclerView = view.findViewById(R.id.recyclerView)

        // Sample data for the RecyclerView
        val data = listOf(
            Pair(R.drawable.farmcarrot, "With its vibrant orange hue, this freshly harvested carrot.."),
            Pair(R.drawable.waterplant, "Regular watering is the key to the success of a beautiful.."),
            // Add more items as needed
        )

        recyclerView.layoutManager = LinearLayoutManager(context)
        recyclerView.adapter = ImageTextAdapter(data)

        return view
    }
}