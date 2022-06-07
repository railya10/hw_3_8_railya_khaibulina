package com.example.hw_3_8_railya_khaibulina

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hw_3_8_railya_khaibulina.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}