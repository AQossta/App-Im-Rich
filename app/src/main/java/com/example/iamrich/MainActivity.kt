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
        binding.btnChange.setOnClickListener{
            if (change){
                binding.imgChange.setImageResource(R.drawable.mishka)
                change = false
            } else {
                binding.imgChange.setImageResource(R.mipmap.ic_image)
                change = true
            }
        }
    }
}