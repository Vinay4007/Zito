package com.example.seapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_level1.*
import kotlinx.android.synthetic.main.activity_levels.*

class Level1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_level1)

        button.setOnClickListener {


            var intent = Intent(this,Level1Q1::class.java)
            startActivity(intent)
//            finish()

        }
    }
}