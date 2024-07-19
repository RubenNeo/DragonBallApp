package com.example.dragonball.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.example.dragonball.R
import com.example.dragonball.data.Item
import com.example.dragonball.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val gifResource = R.drawable.gif

        Glide.with(this)
            .asGif()
            .load(gifResource)
            .into(binding.ivGif)

        binding.btnSec.setOnClickListener {
            val intent = Intent (this, Second_Activity::class.java)
            startActivity(intent)
        }
    }
}