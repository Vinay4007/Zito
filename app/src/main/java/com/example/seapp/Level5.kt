package com.example.seapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_level4.*

class Level5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_level5)

        button.setOnClickListener {


            var intent = Intent(this,Level5Q::class.java)
            startActivity(intent)
//            finish()

        }
    }
}