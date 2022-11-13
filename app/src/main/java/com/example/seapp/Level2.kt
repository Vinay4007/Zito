package com.example.seapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_level1.*
import kotlinx.android.synthetic.main.activity_level1.button
import kotlinx.android.synthetic.main.activity_level2.*

class Level2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_level2)

        button.setOnClickListener {


            var intent = Intent(this,Level2Q::class.java)
            startActivity(intent)
//            finish()

        }
    }

}