package com.example.seapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_levels.*
//import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class LevelsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_levels)

        button1.setOnClickListener {


                var intent = Intent(this,Level1::class.java)
                startActivity(intent)
//                finish()

        }
        button2.setOnClickListener {


            var intent = Intent(this,Level2::class.java)
            startActivity(intent)
//            finish()

        }

        button3.setOnClickListener {


            var intent = Intent(this,Level3::class.java)
            startActivity(intent)
//            finish()

        }
        button4.setOnClickListener {


            var intent = Intent(this,Level4::class.java)
            startActivity(intent)
//            finish()

        }
        button5.setOnClickListener {


            var intent = Intent(this,Level5::class.java)
            startActivity(intent)
//            finish()

        }
    }
}