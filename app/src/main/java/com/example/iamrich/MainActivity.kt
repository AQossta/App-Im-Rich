package com.example.iamrich

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.iamrich.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var change = true
        binding.imgBtnChange.setOnClickListener{
            if (change){
                binding.imgBtnChange.setImageResource(R.drawable.iamrich_01)
                change = false
            } else {
                binding.imgBtnChange.setImageResource(R.drawable.iamrich_02)
                change = true
            }
        }
    }
}