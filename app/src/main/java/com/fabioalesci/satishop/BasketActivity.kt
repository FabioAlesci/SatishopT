package com.fabioalesci.satishop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.fabioalesci.satishop.databinding.ActivityBasketBinding

class BasketActivity : AppCompatActivity() {

        private lateinit var binding: ActivityBasketBinding

        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBasketBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}