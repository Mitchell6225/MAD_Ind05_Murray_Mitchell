package com.example.mad_ind05_murray_mitchell

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.mad_ind05_murray_mitchell.databinding.ActivityMainBinding
import layout.statedatamodel


class MainActivity : AppCompatActivity() {
    var binding: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        val adapter = MyAdapter(this@MainActivity, statedatamodel.stateList)
        binding?.states?.adapter = adapter


    }
    public fun jump(name: String) {
        val intent = Intent(this, MainActivity2::class.java)
            .putExtra("name", name)
        startActivity(intent)
    }
    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}

