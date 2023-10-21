package com.example.pppbpertemuan8

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pppbpertemuan8.databinding.ActivityMainBinding

class WelcomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        title = "MyTabLayout"
    }
}