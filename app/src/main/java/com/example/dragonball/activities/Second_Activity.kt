package com.example.dragonball.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dragonball.data.Item
import com.example.dragonball.databinding.ActivitySecondBinding
import com.squareup.picasso.Picasso

class Second_Activity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding
    private lateinit var Character : Item
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivitySecondBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        loadData()

    }
    private fun loadData(){
        binding.characterName.text = Character.name
        Picasso.get().load(Character.image).into(binding.characterImage)

    }
}