package com.example.seapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_level1_result.*
import kotlinx.android.synthetic.main.activity_levels.*

class Level5Result : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_level5_result)
        val score=intent.getStringExtra(Setdata5.score)
        val totalQuestion=intent.getStringExtra("total size")

        score1.text="${score} / ${totalQuestion}"
        button16.setOnClickListener {


            var intent = Intent(this,LevelsActivity::class.java)
            startActivity(intent)
            finish()

        }
    }

}