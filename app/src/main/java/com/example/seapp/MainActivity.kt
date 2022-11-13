package com.example.seapp

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        window.decorView.systemUiVisibility= View.SYSTEM_UI_FLAG_FULLSCREEN
           button.setOnClickListener {
               if(input.text.toString().isEmpty())
               {
                    Toast.makeText(this,"Enter your name",Toast.LENGTH_SHORT).show()
                }
                else{
                    var intent = Intent(this,LevelsActivity::class.java)
                   intent.putExtra("${Setdata.name}",input.text.toString())
                    startActivity(intent)
//                   finish()
                }
           }
    }
//
//    override fun onBackPressed() {
//        var int = 0
//        int++
//        if(int==2){
//            super.onBackPressed()
//        }

        //super.onBackPressed()
//    }
}