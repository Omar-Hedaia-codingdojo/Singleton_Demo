package com.example.singletonedemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.singletonedemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val user1 = User()
        val user2 = User()

        val user3 = UserObj
        val user4 = UserObj

        binding.tvUser1.text = user1.toString()
        binding.tvUser2.text = user2.toString()
        binding.tvUser3.text = user3.toString()
        binding.tvUser4.text = user4.toString()
    }
}