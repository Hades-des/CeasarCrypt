package com.example.cipher

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.cipher.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        binding.ViewModel = CeasarCryptViewModel()
        setContentView(binding.root)
    }
}