package com.fabioalesci.satishop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.fabioalesci.satishop.databinding.ActivityProductBinding

class ProductActivity : AppCompatActivity() {

    private lateinit var binding: ActivityProductBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProductBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.reviewRecyclerView.layoutManager = LinearLayoutManager(this)


        val data = ArrayList<RevViewModel>()
            //DATABASE

        val adapter = ReviewAdapter(data)
        binding.reviewRecyclerView.adapter = adapter


    }
}